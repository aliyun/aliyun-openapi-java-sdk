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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListHotWordsTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHotWordsTasksResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer count;

	private List<HotWordsTaskPo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<HotWordsTaskPo> getData() {
		return this.data;
	}

	public void setData(List<HotWordsTaskPo> data) {
		this.data = data;
	}

	public static class HotWordsTaskPo {

		private Long taskConfigId;

		private String name;

		private Integer status;

		private Integer type;

		private String startTime;

		private Integer timeInterval;

		private Integer timeUnit;

		private String endTime;

		private Integer instanceStatus;

		private String lastExecutionTime;

		private String message;

		private DialogueParam dialogueParam;

		private WordsParam wordsParam;

		public Long getTaskConfigId() {
			return this.taskConfigId;
		}

		public void setTaskConfigId(Long taskConfigId) {
			this.taskConfigId = taskConfigId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getTimeInterval() {
			return this.timeInterval;
		}

		public void setTimeInterval(Integer timeInterval) {
			this.timeInterval = timeInterval;
		}

		public Integer getTimeUnit() {
			return this.timeUnit;
		}

		public void setTimeUnit(Integer timeUnit) {
			this.timeUnit = timeUnit;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Integer getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(Integer instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getLastExecutionTime() {
			return this.lastExecutionTime;
		}

		public void setLastExecutionTime(String lastExecutionTime) {
			this.lastExecutionTime = lastExecutionTime;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public DialogueParam getDialogueParam() {
			return this.dialogueParam;
		}

		public void setDialogueParam(DialogueParam dialogueParam) {
			this.dialogueParam = dialogueParam;
		}

		public WordsParam getWordsParam() {
			return this.wordsParam;
		}

		public void setWordsParam(WordsParam wordsParam) {
			this.wordsParam = wordsParam;
		}

		public static class DialogueParam {

			private Long dialogueId;

			private Integer role;

			private Integer startIndex;

			private Integer endIndex;

			private Integer sourceType;

			private String dataSetIds;

			private String startTime;

			private String endTime;

			public Long getDialogueId() {
				return this.dialogueId;
			}

			public void setDialogueId(Long dialogueId) {
				this.dialogueId = dialogueId;
			}

			public Integer getRole() {
				return this.role;
			}

			public void setRole(Integer role) {
				this.role = role;
			}

			public Integer getStartIndex() {
				return this.startIndex;
			}

			public void setStartIndex(Integer startIndex) {
				this.startIndex = startIndex;
			}

			public Integer getEndIndex() {
				return this.endIndex;
			}

			public void setEndIndex(Integer endIndex) {
				this.endIndex = endIndex;
			}

			public Integer getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(Integer sourceType) {
				this.sourceType = sourceType;
			}

			public String getDataSetIds() {
				return this.dataSetIds;
			}

			public void setDataSetIds(String dataSetIds) {
				this.dataSetIds = dataSetIds;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}

		public static class WordsParam {

			private Long extraConfigId;

			private String excludes;

			private String includes;

			public Long getExtraConfigId() {
				return this.extraConfigId;
			}

			public void setExtraConfigId(Long extraConfigId) {
				this.extraConfigId = extraConfigId;
			}

			public String getExcludes() {
				return this.excludes;
			}

			public void setExcludes(String excludes) {
				this.excludes = excludes;
			}

			public String getIncludes() {
				return this.includes;
			}

			public void setIncludes(String includes) {
				this.includes = includes;
			}
		}
	}

	@Override
	public ListHotWordsTasksResponse getInstance(UnmarshallerContext context) {
		return	ListHotWordsTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
