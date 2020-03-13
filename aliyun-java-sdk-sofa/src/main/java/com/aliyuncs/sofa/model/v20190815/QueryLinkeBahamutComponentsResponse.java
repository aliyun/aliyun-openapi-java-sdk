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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeBahamutComponentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeBahamutComponentsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private Boolean allowSkip;

		private Boolean disable;

		private String displayName;

		private String expression;

		private String expressionDesc;

		private Long gmtCreate;

		private Long gmtModify;

		private String id;

		private Boolean manual;

		private String name;

		private String restUrl;

		private String type;

		public Boolean getAllowSkip() {
			return this.allowSkip;
		}

		public void setAllowSkip(Boolean allowSkip) {
			this.allowSkip = allowSkip;
		}

		public Boolean getDisable() {
			return this.disable;
		}

		public void setDisable(Boolean disable) {
			this.disable = disable;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getExpressionDesc() {
			return this.expressionDesc;
		}

		public void setExpressionDesc(String expressionDesc) {
			this.expressionDesc = expressionDesc;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(Long gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getManual() {
			return this.manual;
		}

		public void setManual(Boolean manual) {
			this.manual = manual;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRestUrl() {
			return this.restUrl;
		}

		public void setRestUrl(String restUrl) {
			this.restUrl = restUrl;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public QueryLinkeBahamutComponentsResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeBahamutComponentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
