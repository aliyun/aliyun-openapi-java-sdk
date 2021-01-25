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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.QueryTouchListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTouchListResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private ResultData resultData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ResultData getResultData() {
		return this.resultData;
	}

	public void setResultData(ResultData resultData) {
		this.resultData = resultData;
	}

	public static class ResultData {

		private Integer totalResults;

		private Integer previousPage;

		private Integer totalPage;

		private Integer nextPage;

		private Integer onePageSize;

		private Integer currentPage;

		private Boolean empty;

		private List<DataItem> data;

		public Integer getTotalResults() {
			return this.totalResults;
		}

		public void setTotalResults(Integer totalResults) {
			this.totalResults = totalResults;
		}

		public Integer getPreviousPage() {
			return this.previousPage;
		}

		public void setPreviousPage(Integer previousPage) {
			this.previousPage = previousPage;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public Integer getNextPage() {
			return this.nextPage;
		}

		public void setNextPage(Integer nextPage) {
			this.nextPage = nextPage;
		}

		public Integer getOnePageSize() {
			return this.onePageSize;
		}

		public void setOnePageSize(Integer onePageSize) {
			this.onePageSize = onePageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Boolean getEmpty() {
			return this.empty;
		}

		public void setEmpty(Boolean empty) {
			this.empty = empty;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private Integer toId;

			private Integer queueId;

			private Long gmtModified;

			private String touchTime;

			private Integer parentTouchId;

			private String memberName;

			private Integer channelType;

			private String feedback;

			private String switchUser;

			private Integer touchEndReason;

			private Long closeTime;

			private String channelId;

			private Long memberId;

			private Integer buId;

			private String touchContent;

			private String touchId;

			private Integer servicerId;

			private Long gmtCreate;

			private Long fromId;

			private Long firstTime;

			private Integer userTouchId;

			private Integer touchType;

			private String servicerName;

			private Integer depId;

			private String commonQueueName;

			private Integer status;

			private ExtAttrs extAttrs;

			public Integer getToId() {
				return this.toId;
			}

			public void setToId(Integer toId) {
				this.toId = toId;
			}

			public Integer getQueueId() {
				return this.queueId;
			}

			public void setQueueId(Integer queueId) {
				this.queueId = queueId;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getTouchTime() {
				return this.touchTime;
			}

			public void setTouchTime(String touchTime) {
				this.touchTime = touchTime;
			}

			public Integer getParentTouchId() {
				return this.parentTouchId;
			}

			public void setParentTouchId(Integer parentTouchId) {
				this.parentTouchId = parentTouchId;
			}

			public String getMemberName() {
				return this.memberName;
			}

			public void setMemberName(String memberName) {
				this.memberName = memberName;
			}

			public Integer getChannelType() {
				return this.channelType;
			}

			public void setChannelType(Integer channelType) {
				this.channelType = channelType;
			}

			public String getFeedback() {
				return this.feedback;
			}

			public void setFeedback(String feedback) {
				this.feedback = feedback;
			}

			public String getSwitchUser() {
				return this.switchUser;
			}

			public void setSwitchUser(String switchUser) {
				this.switchUser = switchUser;
			}

			public Integer getTouchEndReason() {
				return this.touchEndReason;
			}

			public void setTouchEndReason(Integer touchEndReason) {
				this.touchEndReason = touchEndReason;
			}

			public Long getCloseTime() {
				return this.closeTime;
			}

			public void setCloseTime(Long closeTime) {
				this.closeTime = closeTime;
			}

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public Long getMemberId() {
				return this.memberId;
			}

			public void setMemberId(Long memberId) {
				this.memberId = memberId;
			}

			public Integer getBuId() {
				return this.buId;
			}

			public void setBuId(Integer buId) {
				this.buId = buId;
			}

			public String getTouchContent() {
				return this.touchContent;
			}

			public void setTouchContent(String touchContent) {
				this.touchContent = touchContent;
			}

			public String getTouchId() {
				return this.touchId;
			}

			public void setTouchId(String touchId) {
				this.touchId = touchId;
			}

			public Integer getServicerId() {
				return this.servicerId;
			}

			public void setServicerId(Integer servicerId) {
				this.servicerId = servicerId;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getFromId() {
				return this.fromId;
			}

			public void setFromId(Long fromId) {
				this.fromId = fromId;
			}

			public Long getFirstTime() {
				return this.firstTime;
			}

			public void setFirstTime(Long firstTime) {
				this.firstTime = firstTime;
			}

			public Integer getUserTouchId() {
				return this.userTouchId;
			}

			public void setUserTouchId(Integer userTouchId) {
				this.userTouchId = userTouchId;
			}

			public Integer getTouchType() {
				return this.touchType;
			}

			public void setTouchType(Integer touchType) {
				this.touchType = touchType;
			}

			public String getServicerName() {
				return this.servicerName;
			}

			public void setServicerName(String servicerName) {
				this.servicerName = servicerName;
			}

			public Integer getDepId() {
				return this.depId;
			}

			public void setDepId(Integer depId) {
				this.depId = depId;
			}

			public String getCommonQueueName() {
				return this.commonQueueName;
			}

			public void setCommonQueueName(String commonQueueName) {
				this.commonQueueName = commonQueueName;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public ExtAttrs getExtAttrs() {
				return this.extAttrs;
			}

			public void setExtAttrs(ExtAttrs extAttrs) {
				this.extAttrs = extAttrs;
			}

			public static class ExtAttrs {

				private Integer evaluationSolution;

				private Integer evaluationScore;

				private Integer onlineSessionSource;

				private Integer evaluationLevel;

				private Integer evaluationStatus;

				private Integer onlineJoinRespInterval;

				public Integer getEvaluationSolution() {
					return this.evaluationSolution;
				}

				public void setEvaluationSolution(Integer evaluationSolution) {
					this.evaluationSolution = evaluationSolution;
				}

				public Integer getEvaluationScore() {
					return this.evaluationScore;
				}

				public void setEvaluationScore(Integer evaluationScore) {
					this.evaluationScore = evaluationScore;
				}

				public Integer getOnlineSessionSource() {
					return this.onlineSessionSource;
				}

				public void setOnlineSessionSource(Integer onlineSessionSource) {
					this.onlineSessionSource = onlineSessionSource;
				}

				public Integer getEvaluationLevel() {
					return this.evaluationLevel;
				}

				public void setEvaluationLevel(Integer evaluationLevel) {
					this.evaluationLevel = evaluationLevel;
				}

				public Integer getEvaluationStatus() {
					return this.evaluationStatus;
				}

				public void setEvaluationStatus(Integer evaluationStatus) {
					this.evaluationStatus = evaluationStatus;
				}

				public Integer getOnlineJoinRespInterval() {
					return this.onlineJoinRespInterval;
				}

				public void setOnlineJoinRespInterval(Integer onlineJoinRespInterval) {
					this.onlineJoinRespInterval = onlineJoinRespInterval;
				}
			}
		}
	}

	@Override
	public QueryTouchListResponse getInstance(UnmarshallerContext context) {
		return	QueryTouchListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
