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

package com.aliyuncs.cloudphone.model.v20201230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphone.transform.v20201230.ListInstanceVncUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceVncUrlResponse extends AcsResponse {

	private String vncUrl;

	private String requestId;

	private String webRtcToken;

	public String getVncUrl() {
		return this.vncUrl;
	}

	public void setVncUrl(String vncUrl) {
		this.vncUrl = vncUrl;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWebRtcToken() {
		return this.webRtcToken;
	}

	public void setWebRtcToken(String webRtcToken) {
		this.webRtcToken = webRtcToken;
	}

	@Override
	public ListInstanceVncUrlResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceVncUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
