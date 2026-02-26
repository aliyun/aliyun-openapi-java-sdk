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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetSubTaskDownloadSystemResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSubTaskDownloadSystemResultResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String taskId;

		private String subTaskId;

		private String workNode;

		private Map<Object,Object> userMarkItemListMap;

		private Map<Object,Object> userSubTaskMap;

		private List<ITagSimpleMarkItemDTO> markItemList;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getSubTaskId() {
			return this.subTaskId;
		}

		public void setSubTaskId(String subTaskId) {
			this.subTaskId = subTaskId;
		}

		public String getWorkNode() {
			return this.workNode;
		}

		public void setWorkNode(String workNode) {
			this.workNode = workNode;
		}

		public Map<Object,Object> getUserMarkItemListMap() {
			return this.userMarkItemListMap;
		}

		public void setUserMarkItemListMap(Map<Object,Object> userMarkItemListMap) {
			this.userMarkItemListMap = userMarkItemListMap;
		}

		public Map<Object,Object> getUserSubTaskMap() {
			return this.userSubTaskMap;
		}

		public void setUserSubTaskMap(Map<Object,Object> userSubTaskMap) {
			this.userSubTaskMap = userSubTaskMap;
		}

		public List<ITagSimpleMarkItemDTO> getMarkItemList() {
			return this.markItemList;
		}

		public void setMarkItemList(List<ITagSimpleMarkItemDTO> markItemList) {
			this.markItemList = markItemList;
		}

		public static class ITagSimpleMarkItemDTO {

			private String markItemId;

			private String dataId;

			private String datasetId;

			private String state;

			private Integer mine;

			private Integer rejectFlag;

			private Integer fixedFlag;

			private Integer abandonFlag;

			private Integer weight;

			private Map<Object,Object> dataMeta;

			private List<ITagSimpleUserMarkResultDTO> markResultList;

			public String getMarkItemId() {
				return this.markItemId;
			}

			public void setMarkItemId(String markItemId) {
				this.markItemId = markItemId;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getDatasetId() {
				return this.datasetId;
			}

			public void setDatasetId(String datasetId) {
				this.datasetId = datasetId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Integer getMine() {
				return this.mine;
			}

			public void setMine(Integer mine) {
				this.mine = mine;
			}

			public Integer getRejectFlag() {
				return this.rejectFlag;
			}

			public void setRejectFlag(Integer rejectFlag) {
				this.rejectFlag = rejectFlag;
			}

			public Integer getFixedFlag() {
				return this.fixedFlag;
			}

			public void setFixedFlag(Integer fixedFlag) {
				this.fixedFlag = fixedFlag;
			}

			public Integer getAbandonFlag() {
				return this.abandonFlag;
			}

			public void setAbandonFlag(Integer abandonFlag) {
				this.abandonFlag = abandonFlag;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public Map<Object,Object> getDataMeta() {
				return this.dataMeta;
			}

			public void setDataMeta(Map<Object,Object> dataMeta) {
				this.dataMeta = dataMeta;
			}

			public List<ITagSimpleUserMarkResultDTO> getMarkResultList() {
				return this.markResultList;
			}

			public void setMarkResultList(List<ITagSimpleUserMarkResultDTO> markResultList) {
				this.markResultList = markResultList;
			}

			public static class ITagSimpleUserMarkResultDTO {

				private String markResultId;

				private String markTitle;

				private String markResult;

				private String questionId;

				private String resultType;

				private String version;

				private String userMarkResultId;

				public String getMarkResultId() {
					return this.markResultId;
				}

				public void setMarkResultId(String markResultId) {
					this.markResultId = markResultId;
				}

				public String getMarkTitle() {
					return this.markTitle;
				}

				public void setMarkTitle(String markTitle) {
					this.markTitle = markTitle;
				}

				public String getMarkResult() {
					return this.markResult;
				}

				public void setMarkResult(String markResult) {
					this.markResult = markResult;
				}

				public String getQuestionId() {
					return this.questionId;
				}

				public void setQuestionId(String questionId) {
					this.questionId = questionId;
				}

				public String getResultType() {
					return this.resultType;
				}

				public void setResultType(String resultType) {
					this.resultType = resultType;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public String getUserMarkResultId() {
					return this.userMarkResultId;
				}

				public void setUserMarkResultId(String userMarkResultId) {
					this.userMarkResultId = userMarkResultId;
				}
			}
		}
	}

	@Override
	public GetSubTaskDownloadSystemResultResponse getInstance(UnmarshallerContext context) {
		return	GetSubTaskDownloadSystemResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
