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
import com.aliyuncs.itaas.transform.v20170505.GetBoxCodeListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBoxCodeListResponse extends AcsResponse {

	private String requestId;

	private Integer errorCode;

	private String errorMsg;

	private Boolean success;

	private List<BoxCodeInfo> data;

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

	public List<BoxCodeInfo> getData() {
		return this.data;
	}

	public void setData(List<BoxCodeInfo> data) {
		this.data = data;
	}

	public List<ErrorMessage> getErrorList() {
		return this.errorList;
	}

	public void setErrorList(List<ErrorMessage> errorList) {
		this.errorList = errorList;
	}

	public static class BoxCodeInfo {

		private Long beginTime;

		private String boxInfo;

		private String code;

		private Long endTime;

		private Long modifyTime;

		private String operator;

		private String screencode;

		private Integer status;

		private String statusTxt;

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public String getBoxInfo() {
			return this.boxInfo;
		}

		public void setBoxInfo(String boxInfo) {
			this.boxInfo = boxInfo;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getScreencode() {
			return this.screencode;
		}

		public void setScreencode(String screencode) {
			this.screencode = screencode;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStatusTxt() {
			return this.statusTxt;
		}

		public void setStatusTxt(String statusTxt) {
			this.statusTxt = statusTxt;
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
	public GetBoxCodeListResponse getInstance(UnmarshallerContext context) {
		return	GetBoxCodeListResponseUnmarshaller.unmarshall(this, context);
	}
}
