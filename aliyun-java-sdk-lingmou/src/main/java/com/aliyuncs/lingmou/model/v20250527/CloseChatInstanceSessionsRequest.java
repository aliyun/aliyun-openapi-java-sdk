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

package com.aliyuncs.lingmou.model.v20250527;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CloseChatInstanceSessionsRequest extends RoaAcsRequest<CloseChatInstanceSessionsResponse> {
	   

	private String instanceId;

	private String sessionIds;
	public CloseChatInstanceSessionsRequest() {
		super("LingMou", "2025-05-27", "CloseChatInstanceSessions");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/openapi/chat/instances/[instanceId]/sessions/close");
		setMethod(MethodType.PUT);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getSessionIds() {
		return this.sessionIds;
	}

	public void setSessionIds(String sessionIds) {
		this.sessionIds = sessionIds;
		if(sessionIds != null){
			putBodyParameter("sessionIds", sessionIds);
		}
	}

	@Override
	public Class<CloseChatInstanceSessionsResponse> getResponseClass() {
		return CloseChatInstanceSessionsResponse.class;
	}

}
