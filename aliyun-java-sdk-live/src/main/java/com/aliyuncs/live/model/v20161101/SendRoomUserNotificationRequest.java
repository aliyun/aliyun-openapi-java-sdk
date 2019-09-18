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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendRoomUserNotificationRequest extends RpcAcsRequest<SendRoomUserNotificationResponse> {
	
	public SendRoomUserNotificationRequest() {
		super("live", "2016-11-01", "SendRoomUserNotification", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String data;

	private String toAppUid;

	private String appUid;

	private Long ownerId;

	private Integer priority;

	private String roomId;

	private String appId;

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public String getToAppUid() {
		return this.toAppUid;
	}

	public void setToAppUid(String toAppUid) {
		this.toAppUid = toAppUid;
		if(toAppUid != null){
			putQueryParameter("ToAppUid", toAppUid);
		}
	}

	public String getAppUid() {
		return this.appUid;
	}

	public void setAppUid(String appUid) {
		this.appUid = appUid;
		if(appUid != null){
			putQueryParameter("AppUid", appUid);
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
		if(roomId != null){
			putQueryParameter("RoomId", roomId);
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

	@Override
	public Class<SendRoomUserNotificationResponse> getResponseClass() {
		return SendRoomUserNotificationResponse.class;
	}

}
