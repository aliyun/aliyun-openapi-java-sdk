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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateNotificationsHandleStateRequest extends RpcAcsRequest<UpdateNotificationsHandleStateResponse> {
	   

	private String targetHandleState;

	private List<Long> notificationIds;
	public UpdateNotificationsHandleStateRequest() {
		super("LinkWAN", "2019-03-01", "UpdateNotificationsHandleState", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetHandleState() {
		return this.targetHandleState;
	}

	public void setTargetHandleState(String targetHandleState) {
		this.targetHandleState = targetHandleState;
		if(targetHandleState != null){
			putQueryParameter("TargetHandleState", targetHandleState);
		}
	}

	public List<Long> getNotificationIds() {
		return this.notificationIds;
	}

	public void setNotificationIds(List<Long> notificationIds) {
		this.notificationIds = notificationIds;	
		if (notificationIds != null) {
			for (int i = 0; i < notificationIds.size(); i++) {
				putQueryParameter("NotificationId." + (i + 1) , notificationIds.get(i));
			}
		}	
	}

	@Override
	public Class<UpdateNotificationsHandleStateResponse> getResponseClass() {
		return UpdateNotificationsHandleStateResponse.class;
	}

}
