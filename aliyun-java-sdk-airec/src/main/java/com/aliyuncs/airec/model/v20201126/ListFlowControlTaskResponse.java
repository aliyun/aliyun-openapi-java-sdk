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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListFlowControlTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowControlTaskResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String gmtCreate;

		private String gmtModified;

		private String status;

		private String taskId;

		private Meta meta;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class Meta {

			private String description;

			private Long endTime;

			private String metaType;

			private String sceneIds;

			private Long startTime;

			private String taskName;

			private List<SelectionParamsItem> selectionParams;

			private Target target;

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

			public String getMetaType() {
				return this.metaType;
			}

			public void setMetaType(String metaType) {
				this.metaType = metaType;
			}

			public String getSceneIds() {
				return this.sceneIds;
			}

			public void setSceneIds(String sceneIds) {
				this.sceneIds = sceneIds;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public List<SelectionParamsItem> getSelectionParams() {
				return this.selectionParams;
			}

			public void setSelectionParams(List<SelectionParamsItem> selectionParams) {
				this.selectionParams = selectionParams;
			}

			public Target getTarget() {
				return this.target;
			}

			public void setTarget(Target target) {
				this.target = target;
			}

			public static class SelectionParamsItem {

				private String selectType;

				private String selectValue;

				private String selectionOperation;

				public String getSelectType() {
					return this.selectType;
				}

				public void setSelectType(String selectType) {
					this.selectType = selectType;
				}

				public String getSelectValue() {
					return this.selectValue;
				}

				public void setSelectValue(String selectValue) {
					this.selectValue = selectValue;
				}

				public String getSelectionOperation() {
					return this.selectionOperation;
				}

				public void setSelectionOperation(String selectionOperation) {
					this.selectionOperation = selectionOperation;
				}
			}

			public static class Target {

				private String type;

				private Long value;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Long getValue() {
					return this.value;
				}

				public void setValue(Long value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public ListFlowControlTaskResponse getInstance(UnmarshallerContext context) {
		return	ListFlowControlTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
