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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.ListDpiConfigErrorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDpiConfigErrorResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer total;

	private Integer maxResults;

	private List<DpiConfigErrorItem> dpiConfigError;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<DpiConfigErrorItem> getDpiConfigError() {
		return this.dpiConfigError;
	}

	public void setDpiConfigError(List<DpiConfigErrorItem> dpiConfigError) {
		this.dpiConfigError = dpiConfigError;
	}

	public static class DpiConfigErrorItem {

		private String sN;

		private String smartAGId;

		private String errorType;

		private List<RuleConfigErrorListItem> ruleConfigErrorList;

		public String getSN() {
			return this.sN;
		}

		public void setSN(String sN) {
			this.sN = sN;
		}

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}

		public List<RuleConfigErrorListItem> getRuleConfigErrorList() {
			return this.ruleConfigErrorList;
		}

		public void setRuleConfigErrorList(List<RuleConfigErrorListItem> ruleConfigErrorList) {
			this.ruleConfigErrorList = ruleConfigErrorList;
		}

		public static class RuleConfigErrorListItem {

			private String ruleId;

			private List<String> dpiSignatureIds;

			private List<String> dpiGroupIds;

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public List<String> getDpiSignatureIds() {
				return this.dpiSignatureIds;
			}

			public void setDpiSignatureIds(List<String> dpiSignatureIds) {
				this.dpiSignatureIds = dpiSignatureIds;
			}

			public List<String> getDpiGroupIds() {
				return this.dpiGroupIds;
			}

			public void setDpiGroupIds(List<String> dpiGroupIds) {
				this.dpiGroupIds = dpiGroupIds;
			}
		}
	}

	@Override
	public ListDpiConfigErrorResponse getInstance(UnmarshallerContext context) {
		return	ListDpiConfigErrorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
