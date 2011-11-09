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
package org.springframework.social.picplz.api.impl;

import org.springframework.social.picplz.api.PicplzProfile;
import org.springframework.social.picplz.api.UserOperations;

/**
 * @author Jose Bovet Derpich
 *
 */
public class UserTemplate extends AbstractPicplzOperations implements UserOperations {

	public UserTemplate(PicplzTemplate picplz, boolean isAuthorized) {
		super(picplz, isAuthorized);
	}

	@Override
	public PicplzProfile getProfile() {
		requireUserAuthorization();
		return picPlzTemplate.getRestTemplate().getForObject("http://api.picplz.com/api/v2/user.json?id=self", PicplzProfile.class);
	}

	@Override
	public PicplzProfile getProfile(long userId) {
		return null;
	}

	@Override
	public PicplzProfile getProfile(String userName) {
		return null;
	}


}