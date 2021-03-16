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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsCheckChangeGroupTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsCheckChangeGroupTypeResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean allSuccess;

		private List<CheckErrorMsg> checkErrorMsgs;

		public Boolean getAllSuccess() {
			return this.allSuccess;
		}

		public void setAllSuccess(Boolean allSuccess) {
			this.allSuccess = allSuccess;
		}

		public List<CheckErrorMsg> getCheckErrorMsgs() {
			return this.checkErrorMsgs;
		}

		public void setCheckErrorMsgs(List<CheckErrorMsg> checkErrorMsgs) {
			this.checkErrorMsgs = checkErrorMsgs;
		}

		public static class CheckErrorMsg {

			private String resourceId;

			private Integer errorCode;

			private String errorMsg;

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public Integer getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(Integer errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}
		}
	}

	@Override
	public OpsCheckChangeGroupTypeResponse getInstance(UnmarshallerContext context) {
		return	OpsCheckChangeGroupTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
