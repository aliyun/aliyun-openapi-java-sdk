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
import com.aliyuncs.devops.transform.v20210625.UpdateTestCaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateTestCaseResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Testcase testcase;

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

	public Testcase getTestcase() {
		return this.testcase;
	}

	public void setTestcase(Testcase testcase) {
		this.testcase = testcase;
	}

	public static class Testcase {

		private String identifier;

		private String subject;

		private String spaceIdentifier;

		private String spaceType;

		private String categoryIdentifier;

		private AssignedTo assignedTo;

		private Creator creator;

		private Modifier modifier;

		private Directory directory;

		private DetailInfo detailInfo;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
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

		public String getSpaceType() {
			return this.spaceType;
		}

		public void setSpaceType(String spaceType) {
			this.spaceType = spaceType;
		}

		public String getCategoryIdentifier() {
			return this.categoryIdentifier;
		}

		public void setCategoryIdentifier(String categoryIdentifier) {
			this.categoryIdentifier = categoryIdentifier;
		}

		public AssignedTo getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(AssignedTo assignedTo) {
			this.assignedTo = assignedTo;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public Modifier getModifier() {
			return this.modifier;
		}

		public void setModifier(Modifier modifier) {
			this.modifier = modifier;
		}

		public Directory getDirectory() {
			return this.directory;
		}

		public void setDirectory(Directory directory) {
			this.directory = directory;
		}

		public DetailInfo getDetailInfo() {
			return this.detailInfo;
		}

		public void setDetailInfo(DetailInfo detailInfo) {
			this.detailInfo = detailInfo;
		}

		public static class AssignedTo {

			private String assignIdentifier;

			private String name;

			private String tbRoleId;

			public String getAssignIdentifier() {
				return this.assignIdentifier;
			}

			public void setAssignIdentifier(String assignIdentifier) {
				this.assignIdentifier = assignIdentifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTbRoleId() {
				return this.tbRoleId;
			}

			public void setTbRoleId(String tbRoleId) {
				this.tbRoleId = tbRoleId;
			}
		}

		public static class Creator {

			private String createIdentifier;

			private String name;

			public String getCreateIdentifier() {
				return this.createIdentifier;
			}

			public void setCreateIdentifier(String createIdentifier) {
				this.createIdentifier = createIdentifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Modifier {

			private String modifyIdentifier;

			private String name;

			public String getModifyIdentifier() {
				return this.modifyIdentifier;
			}

			public void setModifyIdentifier(String modifyIdentifier) {
				this.modifyIdentifier = modifyIdentifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Directory {

			private String directoryIdentifier;

			private String name;

			private String childIdentifier;

			private List<String> pathName;

			public String getDirectoryIdentifier() {
				return this.directoryIdentifier;
			}

			public void setDirectoryIdentifier(String directoryIdentifier) {
				this.directoryIdentifier = directoryIdentifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getChildIdentifier() {
				return this.childIdentifier;
			}

			public void setChildIdentifier(String childIdentifier) {
				this.childIdentifier = childIdentifier;
			}

			public List<String> getPathName() {
				return this.pathName;
			}

			public void setPathName(List<String> pathName) {
				this.pathName = pathName;
			}
		}

		public static class DetailInfo {

			private String stepType;

			private Precondition precondition;

			private StepContent stepContent;

			private ExpectedResult expectedResult;

			public String getStepType() {
				return this.stepType;
			}

			public void setStepType(String stepType) {
				this.stepType = stepType;
			}

			public Precondition getPrecondition() {
				return this.precondition;
			}

			public void setPrecondition(Precondition precondition) {
				this.precondition = precondition;
			}

			public StepContent getStepContent() {
				return this.stepContent;
			}

			public void setStepContent(StepContent stepContent) {
				this.stepContent = stepContent;
			}

			public ExpectedResult getExpectedResult() {
				return this.expectedResult;
			}

			public void setExpectedResult(ExpectedResult expectedResult) {
				this.expectedResult = expectedResult;
			}

			public static class Precondition {

				private String preIdentifier;

				private String preContent;

				private String preContentType;

				public String getPreIdentifier() {
					return this.preIdentifier;
				}

				public void setPreIdentifier(String preIdentifier) {
					this.preIdentifier = preIdentifier;
				}

				public String getPreContent() {
					return this.preContent;
				}

				public void setPreContent(String preContent) {
					this.preContent = preContent;
				}

				public String getPreContentType() {
					return this.preContentType;
				}

				public void setPreContentType(String preContentType) {
					this.preContentType = preContentType;
				}
			}

			public static class StepContent {

				private String stepIdentifier;

				private String stepContent;

				private String stepContentType;

				public String getStepIdentifier() {
					return this.stepIdentifier;
				}

				public void setStepIdentifier(String stepIdentifier) {
					this.stepIdentifier = stepIdentifier;
				}

				public String getStepContent() {
					return this.stepContent;
				}

				public void setStepContent(String stepContent) {
					this.stepContent = stepContent;
				}

				public String getStepContentType() {
					return this.stepContentType;
				}

				public void setStepContentType(String stepContentType) {
					this.stepContentType = stepContentType;
				}
			}

			public static class ExpectedResult {

				private String expectIdentifier;

				private String expectContent;

				private String expectContentType;

				public String getExpectIdentifier() {
					return this.expectIdentifier;
				}

				public void setExpectIdentifier(String expectIdentifier) {
					this.expectIdentifier = expectIdentifier;
				}

				public String getExpectContent() {
					return this.expectContent;
				}

				public void setExpectContent(String expectContent) {
					this.expectContent = expectContent;
				}

				public String getExpectContentType() {
					return this.expectContentType;
				}

				public void setExpectContentType(String expectContentType) {
					this.expectContentType = expectContentType;
				}
			}
		}
	}

	@Override
	public UpdateTestCaseResponse getInstance(UnmarshallerContext context) {
		return	UpdateTestCaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
