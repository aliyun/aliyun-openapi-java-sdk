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
import com.aliyuncs.sofa.transform.v20190815.CheckLinkeBahamutCeasingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckLinkeBahamutCeasingResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<ResultItem> result;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Long created;

		private Boolean deleted;

		private String description;

		private Long endTime;

		private String id;

		private Long lastModified;

		private Boolean preReleaseIncluded;

		private Long startTime;

		private String tenant;

		private List<String> appBlackList;

		private List<String> appWhiteList;

		private List<String> parentArchDomainBlackList;

		private List<String> parentArchDomainWhiteList;

		private List<String> releaseBlackList;

		private List<String> releaseWhiteList;

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public Boolean getPreReleaseIncluded() {
			return this.preReleaseIncluded;
		}

		public void setPreReleaseIncluded(Boolean preReleaseIncluded) {
			this.preReleaseIncluded = preReleaseIncluded;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getTenant() {
			return this.tenant;
		}

		public void setTenant(String tenant) {
			this.tenant = tenant;
		}

		public List<String> getAppBlackList() {
			return this.appBlackList;
		}

		public void setAppBlackList(List<String> appBlackList) {
			this.appBlackList = appBlackList;
		}

		public List<String> getAppWhiteList() {
			return this.appWhiteList;
		}

		public void setAppWhiteList(List<String> appWhiteList) {
			this.appWhiteList = appWhiteList;
		}

		public List<String> getParentArchDomainBlackList() {
			return this.parentArchDomainBlackList;
		}

		public void setParentArchDomainBlackList(List<String> parentArchDomainBlackList) {
			this.parentArchDomainBlackList = parentArchDomainBlackList;
		}

		public List<String> getParentArchDomainWhiteList() {
			return this.parentArchDomainWhiteList;
		}

		public void setParentArchDomainWhiteList(List<String> parentArchDomainWhiteList) {
			this.parentArchDomainWhiteList = parentArchDomainWhiteList;
		}

		public List<String> getReleaseBlackList() {
			return this.releaseBlackList;
		}

		public void setReleaseBlackList(List<String> releaseBlackList) {
			this.releaseBlackList = releaseBlackList;
		}

		public List<String> getReleaseWhiteList() {
			return this.releaseWhiteList;
		}

		public void setReleaseWhiteList(List<String> releaseWhiteList) {
			this.releaseWhiteList = releaseWhiteList;
		}
	}

	@Override
	public CheckLinkeBahamutCeasingResponse getInstance(UnmarshallerContext context) {
		return	CheckLinkeBahamutCeasingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
