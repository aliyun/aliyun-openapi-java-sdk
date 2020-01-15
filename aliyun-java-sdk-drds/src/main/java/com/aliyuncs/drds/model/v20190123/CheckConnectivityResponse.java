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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.CheckConnectivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckConnectivityResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private CheckConnectivityResult checkConnectivityResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public CheckConnectivityResult getCheckConnectivityResult() {
		return this.checkConnectivityResult;
	}

	public void setCheckConnectivityResult(CheckConnectivityResult checkConnectivityResult) {
		this.checkConnectivityResult = checkConnectivityResult;
	}

	public static class CheckConnectivityResult {

		private Boolean success;

		private String message;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public CheckConnectivityResponse getInstance(UnmarshallerContext context) {
		return	CheckConnectivityResponseUnmarshaller.unmarshall(this, context);
	}
}
