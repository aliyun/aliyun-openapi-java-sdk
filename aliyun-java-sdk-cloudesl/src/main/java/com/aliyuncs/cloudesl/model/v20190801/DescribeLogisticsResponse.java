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

package com.aliyuncs.cloudesl.model.v20190801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20190801.DescribeLogisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogisticsResponse extends AcsResponse {

	private String errorMessage;

	private String errorCode;

	private String message;

	private String dynamicCode;

	private String code;

	private String dynamicMessage;

	private String requestId;

	private Boolean success;

	private List<LogisticsInfo> logistics;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
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

	public List<LogisticsInfo> getLogistics() {
		return this.logistics;
	}

	public void setLogistics(List<LogisticsInfo> logistics) {
		this.logistics = logistics;
	}

	public static class LogisticsInfo {

		private String orderId;

		private String apMacList;

		private String prNumber;

		private String eslMacList;

		private String poNumber;

		private Boolean acceptStatus;

		private String hasSend;

		private String logisticsDocuments;

		private String description;

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getApMacList() {
			return this.apMacList;
		}

		public void setApMacList(String apMacList) {
			this.apMacList = apMacList;
		}

		public String getPrNumber() {
			return this.prNumber;
		}

		public void setPrNumber(String prNumber) {
			this.prNumber = prNumber;
		}

		public String getEslMacList() {
			return this.eslMacList;
		}

		public void setEslMacList(String eslMacList) {
			this.eslMacList = eslMacList;
		}

		public String getPoNumber() {
			return this.poNumber;
		}

		public void setPoNumber(String poNumber) {
			this.poNumber = poNumber;
		}

		public Boolean getAcceptStatus() {
			return this.acceptStatus;
		}

		public void setAcceptStatus(Boolean acceptStatus) {
			this.acceptStatus = acceptStatus;
		}

		public String getHasSend() {
			return this.hasSend;
		}

		public void setHasSend(String hasSend) {
			this.hasSend = hasSend;
		}

		public String getLogisticsDocuments() {
			return this.logisticsDocuments;
		}

		public void setLogisticsDocuments(String logisticsDocuments) {
			this.logisticsDocuments = logisticsDocuments;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeLogisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
