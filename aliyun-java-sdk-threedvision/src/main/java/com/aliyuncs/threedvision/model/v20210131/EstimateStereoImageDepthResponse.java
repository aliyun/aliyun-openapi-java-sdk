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

package com.aliyuncs.threedvision.model.v20210131;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.threedvision.transform.v20210131.EstimateStereoImageDepthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EstimateStereoImageDepthResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String disparityMapURL;

		private String disparityVisURL;

		public String getDisparityMapURL() {
			return this.disparityMapURL;
		}

		public void setDisparityMapURL(String disparityMapURL) {
			this.disparityMapURL = disparityMapURL;
		}

		public String getDisparityVisURL() {
			return this.disparityVisURL;
		}

		public void setDisparityVisURL(String disparityVisURL) {
			this.disparityVisURL = disparityVisURL;
		}
	}

	@Override
	public EstimateStereoImageDepthResponse getInstance(UnmarshallerContext context) {
		return	EstimateStereoImageDepthResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
