/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mindlive_biz.model.v20210214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PublishWarmUpVideoRequest extends RpcAcsRequest<PublishWarmUpVideoResponse> {
	   

	private User user;

	private String deviceId;

	private List<Videos> videos;
	public PublishWarmUpVideoRequest() {
		super("mindlive-biz", "2021-02-14", "PublishWarmUpVideo");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;	
		if (user != null) {
			
				putQueryParameter("User.UserSource" , user.getUserSource());
				putQueryParameter("User.UserId" , user.getUserId());
		}	
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public List<Videos> getVideos() {
		return this.videos;
	}

	public void setVideos(List<Videos> videos) {
		this.videos = videos;	
		if (videos != null) {
			for (int depth1 = 0; depth1 < videos.size(); depth1++) {
				if (videos.get(depth1) != null) {
					
						putQueryParameter("Videos." + (depth1 + 1) + ".Configs" , videos.get(depth1).getConfigs());
						putQueryParameter("Videos." + (depth1 + 1) + ".ResourceUuid" , videos.get(depth1).getResourceUuid());
				}
			}
		}	
	}

	public static class User {

		private String userSource;

		private String userId;

		public String getUserSource() {
			return this.userSource;
		}

		public void setUserSource(String userSource) {
			this.userSource = userSource;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	public static class Videos {

		private String configs;

		private String resourceUuid;

		public String getConfigs() {
			return this.configs;
		}

		public void setConfigs(String configs) {
			this.configs = configs;
		}

		public String getResourceUuid() {
			return this.resourceUuid;
		}

		public void setResourceUuid(String resourceUuid) {
			this.resourceUuid = resourceUuid;
		}
	}

	@Override
	public Class<PublishWarmUpVideoResponse> getResponseClass() {
		return PublishWarmUpVideoResponse.class;
	}

}
