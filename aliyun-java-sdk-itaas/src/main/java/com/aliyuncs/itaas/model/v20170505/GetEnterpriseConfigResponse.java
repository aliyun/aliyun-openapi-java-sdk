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
import com.aliyuncs.itaas.transform.v20170505.GetEnterpriseConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEnterpriseConfigResponse extends AcsResponse {

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

		private Boolean authorizationNeedAccessToken;

		private String drMeetingQrUrl;

		private String drWelcomeUrl;

		private Integer shareMboxNubmer;

		private Boolean shareNeedInternet;

		private Boolean shareServiceFlag;

		public Boolean getAuthorizationNeedAccessToken() {
			return this.authorizationNeedAccessToken;
		}

		public void setAuthorizationNeedAccessToken(Boolean authorizationNeedAccessToken) {
			this.authorizationNeedAccessToken = authorizationNeedAccessToken;
		}

		public String getDrMeetingQrUrl() {
			return this.drMeetingQrUrl;
		}

		public void setDrMeetingQrUrl(String drMeetingQrUrl) {
			this.drMeetingQrUrl = drMeetingQrUrl;
		}

		public String getDrWelcomeUrl() {
			return this.drWelcomeUrl;
		}

		public void setDrWelcomeUrl(String drWelcomeUrl) {
			this.drWelcomeUrl = drWelcomeUrl;
		}

		public Integer getShareMboxNubmer() {
			return this.shareMboxNubmer;
		}

		public void setShareMboxNubmer(Integer shareMboxNubmer) {
			this.shareMboxNubmer = shareMboxNubmer;
		}

		public Boolean getshareNeedInternet() {
			return this.shareNeedInternet;
		}

		public void setshareNeedInternet(Boolean shareNeedInternet) {
			this.shareNeedInternet = shareNeedInternet;
		}

		public Boolean getshareServiceFlag() {
			return this.shareServiceFlag;
		}

		public void setshareServiceFlag(Boolean shareServiceFlag) {
			this.shareServiceFlag = shareServiceFlag;
		}
	}

	@Override
	public GetEnterpriseConfigResponse getInstance(UnmarshallerContext context) {
		return	GetEnterpriseConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
