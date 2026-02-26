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
import com.aliyuncs.iot.transform.v20180120.BatchCheckDeviceNamesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchCheckDeviceNamesResponse extends AcsResponse {

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

		private Long applyId;

		private List<InvalidDetailListItem> invalidDetailList;

		private List<String> invalidDeviceNameList;

		private List<String> invalidDeviceNicknameList;

		private List<String> repeatedDeviceNameList;

		public Long getApplyId() {
			return this.applyId;
		}

		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}

		public List<InvalidDetailListItem> getInvalidDetailList() {
			return this.invalidDetailList;
		}

		public void setInvalidDetailList(List<InvalidDetailListItem> invalidDetailList) {
			this.invalidDetailList = invalidDetailList;
		}

		public List<String> getInvalidDeviceNameList() {
			return this.invalidDeviceNameList;
		}

		public void setInvalidDeviceNameList(List<String> invalidDeviceNameList) {
			this.invalidDeviceNameList = invalidDeviceNameList;
		}

		public List<String> getInvalidDeviceNicknameList() {
			return this.invalidDeviceNicknameList;
		}

		public void setInvalidDeviceNicknameList(List<String> invalidDeviceNicknameList) {
			this.invalidDeviceNicknameList = invalidDeviceNicknameList;
		}

		public List<String> getRepeatedDeviceNameList() {
			return this.repeatedDeviceNameList;
		}

		public void setRepeatedDeviceNameList(List<String> repeatedDeviceNameList) {
			this.repeatedDeviceNameList = repeatedDeviceNameList;
		}

		public static class InvalidDetailListItem {

			private String deviceName;

			private String nickName;

			private String errorMsg;

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
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
	public BatchCheckDeviceNamesResponse getInstance(UnmarshallerContext context) {
		return	BatchCheckDeviceNamesResponseUnmarshaller.unmarshall(this, context);
	}
}
