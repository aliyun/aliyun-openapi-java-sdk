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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListContactFlowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListContactFlowsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<ContactFlow> list;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ContactFlow> getList() {
			return this.list;
		}

		public void setList(List<ContactFlow> list) {
			this.list = list;
		}

		public static class ContactFlow {

			private String contactFlowId;

			private String createdTime;

			private String definition;

			private String description;

			private String draftId;

			private String editor;

			private String instanceId;

			private String name;

			private Boolean published;

			private String type;

			private String updatedTime;

			private List<String> numberList;

			public String getContactFlowId() {
				return this.contactFlowId;
			}

			public void setContactFlowId(String contactFlowId) {
				this.contactFlowId = contactFlowId;
			}

			public String getCreatedTime() {
				return this.createdTime;
			}

			public void setCreatedTime(String createdTime) {
				this.createdTime = createdTime;
			}

			public String getDefinition() {
				return this.definition;
			}

			public void setDefinition(String definition) {
				this.definition = definition;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDraftId() {
				return this.draftId;
			}

			public void setDraftId(String draftId) {
				this.draftId = draftId;
			}

			public String getEditor() {
				return this.editor;
			}

			public void setEditor(String editor) {
				this.editor = editor;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getPublished() {
				return this.published;
			}

			public void setPublished(Boolean published) {
				this.published = published;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUpdatedTime() {
				return this.updatedTime;
			}

			public void setUpdatedTime(String updatedTime) {
				this.updatedTime = updatedTime;
			}

			public List<String> getNumberList() {
				return this.numberList;
			}

			public void setNumberList(List<String> numberList) {
				this.numberList = numberList;
			}
		}
	}

	@Override
	public ListContactFlowsResponse getInstance(UnmarshallerContext context) {
		return	ListContactFlowsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
