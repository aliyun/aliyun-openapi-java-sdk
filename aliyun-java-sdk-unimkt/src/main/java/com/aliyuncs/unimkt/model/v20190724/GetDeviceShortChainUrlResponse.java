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

package com.aliyuncs.unimkt.model.v20190724;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20190724.GetDeviceShortChainUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceShortChainUrlResponse extends AcsResponse {

	private String requestId;

	private Boolean status;

	private String errorMessage;

	private String errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String shortImgUrl;

		private String shortUrl;

		public String getShortImgUrl() {
			return this.shortImgUrl;
		}

		public void setShortImgUrl(String shortImgUrl) {
			this.shortImgUrl = shortImgUrl;
		}

		public String getShortUrl() {
			return this.shortUrl;
		}

		public void setShortUrl(String shortUrl) {
			this.shortUrl = shortUrl;
		}
	}

	@Override
	public GetDeviceShortChainUrlResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceShortChainUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
