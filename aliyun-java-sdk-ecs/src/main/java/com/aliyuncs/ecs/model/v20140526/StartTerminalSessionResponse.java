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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.StartTerminalSessionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartTerminalSessionResponse extends AcsResponse {

	private String requestId;

	private String sessionId;

	private String securityToken;

	private String webSocketUrl;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}

	public String getWebSocketUrl() {
		return this.webSocketUrl;
	}

	public void setWebSocketUrl(String webSocketUrl) {
		this.webSocketUrl = webSocketUrl;
	}

	@Override
	public StartTerminalSessionResponse getInstance(UnmarshallerContext context) {
		return	StartTerminalSessionResponseUnmarshaller.unmarshall(this, context);
	}
}
