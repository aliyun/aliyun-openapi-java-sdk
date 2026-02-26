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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetTestResultListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTestResultListResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private List<TestcaseTestResultSummary> testResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<TestcaseTestResultSummary> getTestResult() {
		return this.testResult;
	}

	public void setTestResult(List<TestcaseTestResultSummary> testResult) {
		this.testResult = testResult;
	}

	public static class TestcaseTestResultSummary {

		private String testResultIdentifier;

		private String testResultStatus;

		private Long testResultGmtCreate;

		private String testcaseIdentifier;

		private Long bugCount;

		private String subject;

		private String spaceIdentifier;

		private String categoryIdentifier;

		private Long gmtCreate;

		private List<FieldValueVO> customFields;

		private TestResultExecutor testResultExecutor;

		private AssignedTo assignedTo;

		public String getTestResultIdentifier() {
			return this.testResultIdentifier;
		}

		public void setTestResultIdentifier(String testResultIdentifier) {
			this.testResultIdentifier = testResultIdentifier;
		}

		public String getTestResultStatus() {
			return this.testResultStatus;
		}

		public void setTestResultStatus(String testResultStatus) {
			this.testResultStatus = testResultStatus;
		}

		public Long getTestResultGmtCreate() {
			return this.testResultGmtCreate;
		}

		public void setTestResultGmtCreate(Long testResultGmtCreate) {
			this.testResultGmtCreate = testResultGmtCreate;
		}

		public String getTestcaseIdentifier() {
			return this.testcaseIdentifier;
		}

		public void setTestcaseIdentifier(String testcaseIdentifier) {
			this.testcaseIdentifier = testcaseIdentifier;
		}

		public Long getBugCount() {
			return this.bugCount;
		}

		public void setBugCount(Long bugCount) {
			this.bugCount = bugCount;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getSpaceIdentifier() {
			return this.spaceIdentifier;
		}

		public void setSpaceIdentifier(String spaceIdentifier) {
			this.spaceIdentifier = spaceIdentifier;
		}

		public String getCategoryIdentifier() {
			return this.categoryIdentifier;
		}

		public void setCategoryIdentifier(String categoryIdentifier) {
			this.categoryIdentifier = categoryIdentifier;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public List<FieldValueVO> getCustomFields() {
			return this.customFields;
		}

		public void setCustomFields(List<FieldValueVO> customFields) {
			this.customFields = customFields;
		}

		public TestResultExecutor getTestResultExecutor() {
			return this.testResultExecutor;
		}

		public void setTestResultExecutor(TestResultExecutor testResultExecutor) {
			this.testResultExecutor = testResultExecutor;
		}

		public AssignedTo getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(AssignedTo assignedTo) {
			this.assignedTo = assignedTo;
		}

		public static class FieldValueVO {

			private String fieldIdentifier;

			private String value;

			private String fieldFormat;

			private String fieldClassName;

			public String getFieldIdentifier() {
				return this.fieldIdentifier;
			}

			public void setFieldIdentifier(String fieldIdentifier) {
				this.fieldIdentifier = fieldIdentifier;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getFieldFormat() {
				return this.fieldFormat;
			}

			public void setFieldFormat(String fieldFormat) {
				this.fieldFormat = fieldFormat;
			}

			public String getFieldClassName() {
				return this.fieldClassName;
			}

			public void setFieldClassName(String fieldClassName) {
				this.fieldClassName = fieldClassName;
			}
		}

		public static class TestResultExecutor {

			private String executorIdentifier;

			private String name;

			public String getExecutorIdentifier() {
				return this.executorIdentifier;
			}

			public void setExecutorIdentifier(String executorIdentifier) {
				this.executorIdentifier = executorIdentifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class AssignedTo {

			private String assignedToIdenttifier;

			private String name;

			public String getAssignedToIdenttifier() {
				return this.assignedToIdenttifier;
			}

			public void setAssignedToIdenttifier(String assignedToIdenttifier) {
				this.assignedToIdenttifier = assignedToIdenttifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetTestResultListResponse getInstance(UnmarshallerContext context) {
		return	GetTestResultListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
