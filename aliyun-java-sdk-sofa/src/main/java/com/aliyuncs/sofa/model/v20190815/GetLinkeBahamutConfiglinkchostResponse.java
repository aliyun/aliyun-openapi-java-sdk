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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutConfiglinkchostResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutConfiglinkchostResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long code;

	private String data;

	private String errorMessage;

	private String message;

	private Boolean notSuccess;

	private Boolean notValid;

	private Long responseStatusCode;

	private Boolean success;

	private Long total;

	private Boolean valid;

	private List<String> errorMessages;

	private Pager pager;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
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

	public Boolean getNotSuccess() {
		return this.notSuccess;
	}

	public void setNotSuccess(Boolean notSuccess) {
		this.notSuccess = notSuccess;
	}

	public Boolean getNotValid() {
		return this.notValid;
	}

	public void setNotValid(Boolean notValid) {
		this.notValid = notValid;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Boolean getValid() {
		return this.valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public List<String> getErrorMessages() {
		return this.errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public Pager getPager() {
		return this.pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public static class Pager {

		private Long begin;

		private Long length;

		private Boolean notValid;

		private Long page;

		private Long pageCount;

		private Long totalCount;

		private Boolean valid;

		public Long getBegin() {
			return this.begin;
		}

		public void setBegin(Long begin) {
			this.begin = begin;
		}

		public Long getLength() {
			return this.length;
		}

		public void setLength(Long length) {
			this.length = length;
		}

		public Boolean getNotValid() {
			return this.notValid;
		}

		public void setNotValid(Boolean notValid) {
			this.notValid = notValid;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Long pageCount) {
			this.pageCount = pageCount;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Boolean getValid() {
			return this.valid;
		}

		public void setValid(Boolean valid) {
			this.valid = valid;
		}
	}

	@Override
	public GetLinkeBahamutConfiglinkchostResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutConfiglinkchostResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
