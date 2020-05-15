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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rtc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMPULayoutRequest extends RpcAcsRequest<UpdateMPULayoutResponse> {
	   

	private List<UserPanes> userPaness;

	private Integer backgroundColor;

	private Integer cropMode;

	private List<Long> layoutIdss;

	private String taskId;

	private Long ownerId;

	private String appId;
	public UpdateMPULayoutRequest() {
		super("rtc", "2018-01-11", "UpdateMPULayout", "rtc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<UserPanes> getUserPaness() {
		return this.userPaness;
	}

	public void setUserPaness(List<UserPanes> userPaness) {
		this.userPaness = userPaness;	
		if (userPaness != null) {
			for (int depth1 = 0; depth1 < userPaness.size(); depth1++) {
				putQueryParameter("UserPanes." + (depth1 + 1) + ".PaneId" , userPaness.get(depth1).getPaneId());
				putQueryParameter("UserPanes." + (depth1 + 1) + ".UserId" , userPaness.get(depth1).getUserId());
				putQueryParameter("UserPanes." + (depth1 + 1) + ".SourceType" , userPaness.get(depth1).getSourceType());
			}
		}	
	}

	public Integer getBackgroundColor() {
		return this.backgroundColor;
	}

	public void setBackgroundColor(Integer backgroundColor) {
		this.backgroundColor = backgroundColor;
		if(backgroundColor != null){
			putQueryParameter("BackgroundColor", backgroundColor.toString());
		}
	}

	public Integer getCropMode() {
		return this.cropMode;
	}

	public void setCropMode(Integer cropMode) {
		this.cropMode = cropMode;
		if(cropMode != null){
			putQueryParameter("CropMode", cropMode.toString());
		}
	}

	public List<Long> getLayoutIdss() {
		return this.layoutIdss;
	}

	public void setLayoutIdss(List<Long> layoutIdss) {
		this.layoutIdss = layoutIdss;	
		if (layoutIdss != null) {
			for (int i = 0; i < layoutIdss.size(); i++) {
				putQueryParameter("LayoutIds." + (i + 1) , layoutIdss.get(i));
			}
		}	
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public static class UserPanes {

		private Integer paneId;

		private String userId;

		private String sourceType;

		public Integer getPaneId() {
			return this.paneId;
		}

		public void setPaneId(Integer paneId) {
			this.paneId = paneId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
	}

	@Override
	public Class<UpdateMPULayoutResponse> getResponseClass() {
		return UpdateMPULayoutResponse.class;
	}

}
