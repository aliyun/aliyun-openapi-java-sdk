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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UpdateNotificationsHandleStateRequest extends RpcAcsRequest<UpdateNotificationsHandleStateResponse> {
	
	public UpdateNotificationsHandleStateRequest() {
		super("LinkWAN", "2018-12-30", "UpdateNotificationsHandleState", "linkwan");
	}

	private List<Long> notificationIds;

	private String targetHandleState;

	public List<Long> getNotificationIds() {
		return this.notificationIds;
	}

	public void setNotificationIds(List<Long> notificationIds) {
		this.notificationIds = notificationIds;	
		if (notificationIds != null) {
			for (int i = 0; i < notificationIds.size(); i++) {
				putBodyParameter("NotificationId." + (i + 1) , notificationIds.get(i));
			}
		}	
	}

	public String getTargetHandleState() {
		return this.targetHandleState;
	}

	public void setTargetHandleState(String targetHandleState) {
		this.targetHandleState = targetHandleState;
		if(targetHandleState != null){
			putBodyParameter("TargetHandleState", targetHandleState);
		}
	}

	@Override
	public Class<UpdateNotificationsHandleStateResponse> getResponseClass() {
		return UpdateNotificationsHandleStateResponse.class;
	}

}
