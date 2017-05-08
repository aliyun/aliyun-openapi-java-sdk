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
import com.aliyuncs.itaas.transform.v20170505.GetRegisterHistoryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRegisterHistoryListResponse extends AcsResponse {

	private String requestId;

	private Integer errorCode;

	private String errorMsg;

	private Boolean success;

	private List<RegisterHistoryInfo> data;

	private List<ErrorMessage> errorList;

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

	public List<RegisterHistoryInfo> getData() {
		return this.data;
	}

	public void setData(List<RegisterHistoryInfo> data) {
		this.data = data;
	}

	public List<ErrorMessage> getErrorList() {
		return this.errorList;
	}

	public void setErrorList(List<ErrorMessage> errorList) {
		this.errorList = errorList;
	}

	public static class RegisterHistoryInfo {

		private Long createTimeL;

		private String drIp;

		private String drMac;

		private String drName;

		private String eventinfo;

		private Integer eventtype;

		private String eventtypeTxt;

		private String memo;

		private String screencode;

		public Long getCreateTimeL() {
			return this.createTimeL;
		}

		public void setCreateTimeL(Long createTimeL) {
			this.createTimeL = createTimeL;
		}

		public String getDrIp() {
			return this.drIp;
		}

		public void setDrIp(String drIp) {
			this.drIp = drIp;
		}

		public String getDrMac() {
			return this.drMac;
		}

		public void setDrMac(String drMac) {
			this.drMac = drMac;
		}

		public String getDrName() {
			return this.drName;
		}

		public void setDrName(String drName) {
			this.drName = drName;
		}

		public String getEventinfo() {
			return this.eventinfo;
		}

		public void setEventinfo(String eventinfo) {
			this.eventinfo = eventinfo;
		}

		public Integer getEventtype() {
			return this.eventtype;
		}

		public void setEventtype(Integer eventtype) {
			this.eventtype = eventtype;
		}

		public String getEventtypeTxt() {
			return this.eventtypeTxt;
		}

		public void setEventtypeTxt(String eventtypeTxt) {
			this.eventtypeTxt = eventtypeTxt;
		}

		public String getMemo() {
			return this.memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

		public String getScreencode() {
			return this.screencode;
		}

		public void setScreencode(String screencode) {
			this.screencode = screencode;
		}
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

	@Override
	public GetRegisterHistoryListResponse getInstance(UnmarshallerContext context) {
		return	GetRegisterHistoryListResponseUnmarshaller.unmarshall(this, context);
	}
}
