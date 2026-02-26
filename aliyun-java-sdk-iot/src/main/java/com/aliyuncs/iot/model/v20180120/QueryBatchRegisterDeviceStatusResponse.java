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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryBatchRegisterDeviceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBatchRegisterDeviceStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private List<InvalidDetailListItem> invalidDetailList;

		private List<String> validList;

		private List<String> invalidList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<InvalidDetailListItem> getInvalidDetailList() {
			return this.invalidDetailList;
		}

		public void setInvalidDetailList(List<InvalidDetailListItem> invalidDetailList) {
			this.invalidDetailList = invalidDetailList;
		}

		public List<String> getValidList() {
			return this.validList;
		}

		public void setValidList(List<String> validList) {
			this.validList = validList;
		}

		public List<String> getInvalidList() {
			return this.invalidList;
		}

		public void setInvalidList(List<String> invalidList) {
			this.invalidList = invalidList;
		}

		public static class InvalidDetailListItem {

			private String deviceName;

			private String errorMsg;

			private String nickName;

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}
		}
	}

	@Override
	public QueryBatchRegisterDeviceStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryBatchRegisterDeviceStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
