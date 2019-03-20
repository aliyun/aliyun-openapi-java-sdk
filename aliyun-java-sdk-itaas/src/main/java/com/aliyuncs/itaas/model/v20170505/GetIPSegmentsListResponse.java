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

package com.aliyuncs.itaas.model.v20170505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itaas.transform.v20170505.GetIPSegmentsListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIPSegmentsListResponse extends AcsResponse {

	private String requestId;

	private Integer errorCode;

	private String errorMsg;

	private Boolean success;

	private List<IpsegmentInfo> data;

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

	public List<IpsegmentInfo> getData() {
		return this.data;
	}

	public void setData(List<IpsegmentInfo> data) {
		this.data = data;
	}

	public List<ErrorMessage> getErrorList() {
		return this.errorList;
	}

	public void setErrorList(List<ErrorMessage> errorList) {
		this.errorList = errorList;
	}

	public static class IpsegmentInfo {

		private Long createTimeL;

		private String ipsegment;

		private String memo;

		private Long modifyTimeL;

		private String uuid;

		public Long getCreateTimeL() {
			return this.createTimeL;
		}

		public void setCreateTimeL(Long createTimeL) {
			this.createTimeL = createTimeL;
		}

		public String getIpsegment() {
			return this.ipsegment;
		}

		public void setIpsegment(String ipsegment) {
			this.ipsegment = ipsegment;
		}

		public String getMemo() {
			return this.memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

		public Long getModifyTimeL() {
			return this.modifyTimeL;
		}

		public void setModifyTimeL(Long modifyTimeL) {
			this.modifyTimeL = modifyTimeL;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
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
	public GetIPSegmentsListResponse getInstance(UnmarshallerContext context) {
		return	GetIPSegmentsListResponseUnmarshaller.unmarshall(this, context);
	}
}
