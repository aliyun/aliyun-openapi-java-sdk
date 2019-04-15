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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerMonitorResponse extends AcsResponse {

	private String requestId;

	private ErrorCode errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorCode {

		private String code;

		private String message;

		private Boolean isSuccess;

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

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	public static class Data {

		private String iopsRead;

		private String bpsRead;

		private String timestamp;

		private String intranetBandwidth;

		private String ecsName;

		private String iopsWrite;

		private String internetRx;

		private String bpsWrite;

		private String status;

		private String cpu;

		private String memory;

		private String intranetTx;

		private String internetFlow;

		private String intranetFlow;

		private String internetTx;

		private String intranetRx;

		private String internetBandwidth;

		public String getIopsRead() {
			return this.iopsRead;
		}

		public void setIopsRead(String iopsRead) {
			this.iopsRead = iopsRead;
		}

		public String getBpsRead() {
			return this.bpsRead;
		}

		public void setBpsRead(String bpsRead) {
			this.bpsRead = bpsRead;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getIntranetBandwidth() {
			return this.intranetBandwidth;
		}

		public void setIntranetBandwidth(String intranetBandwidth) {
			this.intranetBandwidth = intranetBandwidth;
		}

		public String getEcsName() {
			return this.ecsName;
		}

		public void setEcsName(String ecsName) {
			this.ecsName = ecsName;
		}

		public String getIopsWrite() {
			return this.iopsWrite;
		}

		public void setIopsWrite(String iopsWrite) {
			this.iopsWrite = iopsWrite;
		}

		public String getInternetRx() {
			return this.internetRx;
		}

		public void setInternetRx(String internetRx) {
			this.internetRx = internetRx;
		}

		public String getBpsWrite() {
			return this.bpsWrite;
		}

		public void setBpsWrite(String bpsWrite) {
			this.bpsWrite = bpsWrite;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getMemory() {
			return this.memory;
		}

		public void setMemory(String memory) {
			this.memory = memory;
		}

		public String getIntranetTx() {
			return this.intranetTx;
		}

		public void setIntranetTx(String intranetTx) {
			this.intranetTx = intranetTx;
		}

		public String getInternetFlow() {
			return this.internetFlow;
		}

		public void setInternetFlow(String internetFlow) {
			this.internetFlow = internetFlow;
		}

		public String getIntranetFlow() {
			return this.intranetFlow;
		}

		public void setIntranetFlow(String intranetFlow) {
			this.intranetFlow = intranetFlow;
		}

		public String getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(String internetTx) {
			this.internetTx = internetTx;
		}

		public String getIntranetRx() {
			return this.intranetRx;
		}

		public void setIntranetRx(String intranetRx) {
			this.intranetRx = intranetRx;
		}

		public String getInternetBandwidth() {
			return this.internetBandwidth;
		}

		public void setInternetBandwidth(String internetBandwidth) {
			this.internetBandwidth = internetBandwidth;
		}
	}

	@Override
	public InnerMonitorResponse getInstance(UnmarshallerContext context) {
		return	InnerMonitorResponseUnmarshaller.unmarshall(this, context);
	}
}
