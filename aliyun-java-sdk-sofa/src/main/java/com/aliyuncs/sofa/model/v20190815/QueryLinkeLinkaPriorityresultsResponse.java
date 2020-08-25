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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeLinkaPriorityresultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeLinkaPriorityresultsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorCode;

	private String errorMsg;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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

		private Long beginColumn;

		private Long beginLine;

		private String className;

		private String description;

		private Long endColumn;

		private Long endLine;

		private String filename;

		private String methodName;

		private String packageName;

		private String rule;

		private String varName;

		private List<String> relatedFiles;

		public Long getBeginColumn() {
			return this.beginColumn;
		}

		public void setBeginColumn(Long beginColumn) {
			this.beginColumn = beginColumn;
		}

		public Long getBeginLine() {
			return this.beginLine;
		}

		public void setBeginLine(Long beginLine) {
			this.beginLine = beginLine;
		}

		public String getClassName() {
			return this.className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getEndColumn() {
			return this.endColumn;
		}

		public void setEndColumn(Long endColumn) {
			this.endColumn = endColumn;
		}

		public Long getEndLine() {
			return this.endLine;
		}

		public void setEndLine(Long endLine) {
			this.endLine = endLine;
		}

		public String getFilename() {
			return this.filename;
		}

		public void setFilename(String filename) {
			this.filename = filename;
		}

		public String getMethodName() {
			return this.methodName;
		}

		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getRule() {
			return this.rule;
		}

		public void setRule(String rule) {
			this.rule = rule;
		}

		public String getVarName() {
			return this.varName;
		}

		public void setVarName(String varName) {
			this.varName = varName;
		}

		public List<String> getRelatedFiles() {
			return this.relatedFiles;
		}

		public void setRelatedFiles(List<String> relatedFiles) {
			this.relatedFiles = relatedFiles;
		}
	}

	@Override
	public QueryLinkeLinkaPriorityresultsResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeLinkaPriorityresultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
