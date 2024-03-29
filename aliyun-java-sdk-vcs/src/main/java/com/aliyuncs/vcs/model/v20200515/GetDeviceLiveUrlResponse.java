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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetDeviceLiveUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceLiveUrlResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String outProtocol;

	private Long streamType;

	private String url;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOutProtocol() {
		return this.outProtocol;
	}

	public void setOutProtocol(String outProtocol) {
		this.outProtocol = outProtocol;
	}

	public Long getStreamType() {
		return this.streamType;
	}

	public void setStreamType(Long streamType) {
		this.streamType = streamType;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public GetDeviceLiveUrlResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceLiveUrlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
