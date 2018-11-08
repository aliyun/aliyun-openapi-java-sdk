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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.UpdateChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateChannelResponse extends AcsResponse {

	private String requestId;

	private String nonce;

	private Integer timestamp;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNonce() {
		return this.nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public Integer getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public UpdateChannelResponse getInstance(UnmarshallerContext context) {
		return	UpdateChannelResponseUnmarshaller.unmarshall(this, context);
	}
}
