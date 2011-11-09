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
/**
 * 
 */
package org.springframework.social.picplz.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.picplz.api.Picplz;

/**
 * @author Jose Bovet Derpich
 *
 */
public class PicplzAdapter implements ApiAdapter<Picplz> {

	@Override
	public boolean test(Picplz api) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setConnectionValues(Picplz api, ConnectionValues values) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserProfile fetchUserProfile(Picplz api) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStatus(Picplz api, String message) {
		// TODO Auto-generated method stub
		
	}

}
