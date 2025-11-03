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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.VerifyPythonFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyPythonFileResponse extends AcsResponse {

	private String requestId;

	private List<SyntaxItem> syntax;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SyntaxItem> getSyntax() {
		return this.syntax;
	}

	public void setSyntax(List<SyntaxItem> syntax) {
		this.syntax = syntax;
	}

	public static class SyntaxItem {

		private Integer startLineNumber;

		private Integer startColumn;

		private Integer endLineNumber;

		private Integer endColumn;

		private String message;

		private Integer severity;

		public Integer getStartLineNumber() {
			return this.startLineNumber;
		}

		public void setStartLineNumber(Integer startLineNumber) {
			this.startLineNumber = startLineNumber;
		}

		public Integer getStartColumn() {
			return this.startColumn;
		}

		public void setStartColumn(Integer startColumn) {
			this.startColumn = startColumn;
		}

		public Integer getEndLineNumber() {
			return this.endLineNumber;
		}

		public void setEndLineNumber(Integer endLineNumber) {
			this.endLineNumber = endLineNumber;
		}

		public Integer getEndColumn() {
			return this.endColumn;
		}

		public void setEndColumn(Integer endColumn) {
			this.endColumn = endColumn;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Integer getSeverity() {
			return this.severity;
		}

		public void setSeverity(Integer severity) {
			this.severity = severity;
		}
	}

	@Override
	public VerifyPythonFileResponse getInstance(UnmarshallerContext context) {
		return	VerifyPythonFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
