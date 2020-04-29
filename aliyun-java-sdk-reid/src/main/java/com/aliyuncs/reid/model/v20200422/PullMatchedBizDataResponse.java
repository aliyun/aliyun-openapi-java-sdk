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

package com.aliyuncs.reid.model.v20200422;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20200422.PullMatchedBizDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PullMatchedBizDataResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String message;

	private String code;

	private String dynamicCode;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private List<MatchedBizData> matchedDataList;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

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

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<MatchedBizData> getMatchedDataList() {
		return this.matchedDataList;
	}

	public void setMatchedDataList(List<MatchedBizData> matchedDataList) {
		this.matchedDataList = matchedDataList;
	}

	public static class MatchedBizData {

		private Long startTimestamp;

		private Long storeId;

		private String deviceId;

		private Long endTimestamp;

		private String recordId;

		private String bizDataType;

		private Long ukId;

		private String attirbute;

		private String deviceType;

		public Long getStartTimestamp() {
			return this.startTimestamp;
		}

		public void setStartTimestamp(Long startTimestamp) {
			this.startTimestamp = startTimestamp;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public Long getEndTimestamp() {
			return this.endTimestamp;
		}

		public void setEndTimestamp(Long endTimestamp) {
			this.endTimestamp = endTimestamp;
		}

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getBizDataType() {
			return this.bizDataType;
		}

		public void setBizDataType(String bizDataType) {
			this.bizDataType = bizDataType;
		}

		public Long getUkId() {
			return this.ukId;
		}

		public void setUkId(Long ukId) {
			this.ukId = ukId;
		}

		public String getAttirbute() {
			return this.attirbute;
		}

		public void setAttirbute(String attirbute) {
			this.attirbute = attirbute;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}
	}

	@Override
	public PullMatchedBizDataResponse getInstance(UnmarshallerContext context) {
		return	PullMatchedBizDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
