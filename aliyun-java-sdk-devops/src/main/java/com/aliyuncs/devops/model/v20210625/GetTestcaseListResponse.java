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
import com.aliyuncs.devops.transform.v20210625.GetTestcaseListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTestcaseListResponse extends AcsResponse {

	private Long totalCount;

	private String nextToken;

	private Long maxResults;

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private List<Workitem> testcase;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

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

	public List<Workitem> getTestcase() {
		return this.testcase;
	}

	public void setTestcase(List<Workitem> testcase) {
		this.testcase = testcase;
	}

	public static class Workitem {

		private String identifier;

		private String subject;

		private String categoryIdentifier;

		private Long gmtCreate;

		private List<CustomFieldsItem> customFields;

		private List<Tag> tags;

		private AssignedTo assignedTo;

		private Space space;

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

		public List<CustomFieldsItem> getCustomFields() {
			return this.customFields;
		}

		public void setCustomFields(List<CustomFieldsItem> customFields) {
			this.customFields = customFields;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public AssignedTo getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(AssignedTo assignedTo) {
			this.assignedTo = assignedTo;
		}

		public Space getSpace() {
			return this.space;
		}

		public void setSpace(Space space) {
			this.space = space;
		}

		public static class CustomFieldsItem {

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

		public static class Tag {

			private String tagIdentifier;

			private String name;

			public String getTagIdentifier() {
				return this.tagIdentifier;
			}

			public void setTagIdentifier(String tagIdentifier) {
				this.tagIdentifier = tagIdentifier;
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

		public static class Space {

			private String spaceIdentifier;

			private String type;

			public String getSpaceIdentifier() {
				return this.spaceIdentifier;
			}

			public void setSpaceIdentifier(String spaceIdentifier) {
				this.spaceIdentifier = spaceIdentifier;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public GetTestcaseListResponse getInstance(UnmarshallerContext context) {
		return	GetTestcaseListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
