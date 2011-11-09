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
package org.springframework.social.picplz.api;

import java.io.Serializable;

/**
 * User's profile information.
 * @author Jose Bovet Derpich
 *
 */
@SuppressWarnings("serial")
public class PicplzProfile implements Serializable {
	
	public PicplzProfile(String username, String displayName,
			String followingCount, String followerCount, String id,
			String profileImageUrl) {
		this.username = username;
		this.displayName = displayName;
		this.followingCount = followingCount;
		this.followerCount = followerCount;
		this.id = id;
		this.profileImageUrl = profileImageUrl;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @return the followingCount
	 */
	public String getFollowingCount() {
		return followingCount;
	}

	/**
	 * @return the followerCount
	 */
	public String getFollowerCount() {
		return followerCount;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the profileImageUrl
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	
	private final String username;
	private final String displayName;
	private final String followingCount;
	private final String followerCount;
	private final String id;
	private final String profileImageUrl;
}