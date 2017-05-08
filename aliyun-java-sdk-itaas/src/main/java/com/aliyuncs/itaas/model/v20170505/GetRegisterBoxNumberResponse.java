/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.itaas.model.v20170505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itaas.transform.v20170505.GetRegisterBoxNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRegisterBoxNumberResponse extends AcsResponse {

	private String requestId;

	private Integer errorCode;

	private String errorMsg;

	private Boolean success;

	private List<ErrorMessage> errorList;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ErrorMessage> getErrorList() {
		return this.errorList;
	}

	public void setErrorList(List<ErrorMessage> errorList) {
		this.errorList = errorList;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorMessage {

		private String errorMessage;

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}

	public static class Data {

		private Integer activedNumber;

		private Integer buyNumber;

		private List<BoxInfo> boxesList;

		public Integer getActivedNumber() {
			return this.activedNumber;
		}

		public void setActivedNumber(Integer activedNumber) {
			this.activedNumber = activedNumber;
		}

		public Integer getBuyNumber() {
			return this.buyNumber;
		}

		public void setBuyNumber(Integer buyNumber) {
			this.buyNumber = buyNumber;
		}

		public List<BoxInfo> getBoxesList() {
			return this.boxesList;
		}

		public void setBoxesList(List<BoxInfo> boxesList) {
			this.boxesList = boxesList;
		}

		public static class BoxInfo {

			private String curVersion;

			private String drName;

			private String drSessionId;

			private String drStatus;

			private String drStatusTxt;

			private String ipaddress;

			private Long lastReportTimeL;

			private Long onlineTimeL;

			private String screencode;

			private String sysVersion;

			public String getCurVersion() {
				return this.curVersion;
			}

			public void setCurVersion(String curVersion) {
				this.curVersion = curVersion;
			}

			public String getDrName() {
				return this.drName;
			}

			public void setDrName(String drName) {
				this.drName = drName;
			}

			public String getDrSessionId() {
				return this.drSessionId;
			}

			public void setDrSessionId(String drSessionId) {
				this.drSessionId = drSessionId;
			}

			public String getDrStatus() {
				return this.drStatus;
			}

			public void setDrStatus(String drStatus) {
				this.drStatus = drStatus;
			}

			public String getDrStatusTxt() {
				return this.drStatusTxt;
			}

			public void setDrStatusTxt(String drStatusTxt) {
				this.drStatusTxt = drStatusTxt;
			}

			public String getIpaddress() {
				return this.ipaddress;
			}

			public void setIpaddress(String ipaddress) {
				this.ipaddress = ipaddress;
			}

			public Long getLastReportTimeL() {
				return this.lastReportTimeL;
			}

			public void setLastReportTimeL(Long lastReportTimeL) {
				this.lastReportTimeL = lastReportTimeL;
			}

			public Long getOnlineTimeL() {
				return this.onlineTimeL;
			}

			public void setOnlineTimeL(Long onlineTimeL) {
				this.onlineTimeL = onlineTimeL;
			}

			public String getScreencode() {
				return this.screencode;
			}

			public void setScreencode(String screencode) {
				this.screencode = screencode;
			}

			public String getSysVersion() {
				return this.sysVersion;
			}

			public void setSysVersion(String sysVersion) {
				this.sysVersion = sysVersion;
			}
		}
	}

	@Override
	public GetRegisterBoxNumberResponse getInstance(UnmarshallerContext context) {
		return	GetRegisterBoxNumberResponseUnmarshaller.unmarshall(this, context);
	}
}
