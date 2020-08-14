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

package com.aliyuncs.idrsservice.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idrsservice.transform.v20200630.ListDetectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDetectionsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<ErrorsItem> errors;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public List<ErrorsItem> getErrors() {
		return this.errors;
	}

	public void setErrors(List<ErrorsItem> errors) {
		this.errors = errors;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorsItem {

		private String field;

		private String message;

		public String getField() {
			return this.field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	public static class Data {

		private Long totalElements;

		private Integer totalPages;

		private List<ItemsItem> items;

		public Long getTotalElements() {
			return this.totalElements;
		}

		public void setTotalElements(Long totalElements) {
			this.totalElements = totalElements;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private String createdAt;

			private String departmentId;

			private String departmentName;

			private String id;

			private String recordingType;

			private String ruleId;

			private String ruleName;

			private String status;

			private List<TasksItem> tasks;

			public String getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(String createdAt) {
				this.createdAt = createdAt;
			}

			public String getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(String departmentId) {
				this.departmentId = departmentId;
			}

			public String getDepartmentName() {
				return this.departmentName;
			}

			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getRecordingType() {
				return this.recordingType;
			}

			public void setRecordingType(String recordingType) {
				this.recordingType = recordingType;
			}

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<TasksItem> getTasks() {
				return this.tasks;
			}

			public void setTasks(List<TasksItem> tasks) {
				this.tasks = tasks;
			}

			public static class TasksItem {

				private String createdAt;

				private String id;

				private String status;

				private String videoMetaUrl;

				private String videoUrl;

				public String getCreatedAt() {
					return this.createdAt;
				}

				public void setCreatedAt(String createdAt) {
					this.createdAt = createdAt;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getVideoMetaUrl() {
					return this.videoMetaUrl;
				}

				public void setVideoMetaUrl(String videoMetaUrl) {
					this.videoMetaUrl = videoMetaUrl;
				}

				public String getVideoUrl() {
					return this.videoUrl;
				}

				public void setVideoUrl(String videoUrl) {
					this.videoUrl = videoUrl;
				}
			}
		}
	}

	@Override
	public ListDetectionsResponse getInstance(UnmarshallerContext context) {
		return	ListDetectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
