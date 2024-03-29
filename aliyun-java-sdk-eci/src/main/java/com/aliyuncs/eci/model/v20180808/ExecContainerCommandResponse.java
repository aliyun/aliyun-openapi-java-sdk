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

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.ExecContainerCommandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecContainerCommandResponse extends AcsResponse {

	private String requestId;

	private String webSocketUri;

	private String httpUrl;

	private String syncResponse;

	public String getHttpUrl() {
		return this.httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWebSocketUri() {
		return this.webSocketUri;
	}

	public void setWebSocketUri(String webSocketUri) {
		this.webSocketUri = webSocketUri;
	}

	public String getSyncResponse() {
		return this.syncResponse;
	}

	public void setSyncResponse(String syncResponse) {
		this.syncResponse = syncResponse;
	}

	@Override
	public ExecContainerCommandResponse getInstance(UnmarshallerContext context) {
		return	ExecContainerCommandResponseUnmarshaller.unmarshall(this, context);
	}
}
