/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.picplz.connect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.picplz.api.Picplz;
import org.springframework.social.picplz.api.PicplzProfile;

/***
 * 
 * @author Jose Bovet Derpich
 *
 */
public class PicPlzAdapterTest {

	private PicplzAdapter picplzAdapter = new PicplzAdapter();
	
	private Picplz picplz = Mockito.mock(Picplz.class);
	
	@Test
	public void fetchProfile() {
		Mockito.when(picplz.userOperations().getProfile()).thenReturn(new PicplzProfile("josebovet", "Jose Bovet", "1", "3", "123456678",
				"http://s0.ui1.picplzthumbs.com/usericons/98/51/54/9851540328c4a69128bae75089b6a136df453d8e_meds.jpg?"));
		UserProfile profile = picplzAdapter.fetchUserProfile(picplz);
		assertEquals("josebovet", profile.getUsername());
		assertEquals("Jose Bovet", profile.getName());
	}
}