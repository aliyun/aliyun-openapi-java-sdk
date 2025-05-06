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
import com.aliyuncs.itag.transform.v20210517.GetUserMarkItemInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserMarkItemInfoResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String msg;

	private Boolean succ;

	private Long rt;

	private String host;

	private String traceId;

	private String errorCode;

	private MsgInfo msgInfo;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public Long getRt() {
		return this.rt;
	}

	public void setRt(Long rt) {
		this.rt = rt;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public MsgInfo getMsgInfo() {
		return this.msgInfo;
	}

	public void setMsgInfo(MsgInfo msgInfo) {
		this.msgInfo = msgInfo;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class MsgInfo {

		private String msg;

		private String msgCn;

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getMsgCn() {
			return this.msgCn;
		}

		public void setMsgCn(String msgCn) {
			this.msgCn = msgCn;
		}
	}

	public static class Result {

		private String userMarkItemId;

		private String confirmRange;

		private String isConfirmed;

		private String needConfirm;

		private String feedbackRemark;

		private Integer feedbackFlag;

		private String operator;

		private Boolean isVoteEqual;

		private String markItemId;

		private String dataId;

		private String datasetId;

		private String state;

		private Integer mine;

		private String subTaskId;

		private Integer rejectFlag;

		private Integer fixedFlag;

		private Integer abandonFlag;

		private String abandonRemark;

		private Integer weight;

		private Map<Object,Object> dataMeta;

		private List<MarkResultListItem> markResultList;

		private List<VoteInfoListItem> voteInfoList;

		public String getUserMarkItemId() {
			return this.userMarkItemId;
		}

		public void setUserMarkItemId(String userMarkItemId) {
			this.userMarkItemId = userMarkItemId;
		}

		public String getConfirmRange() {
			return this.confirmRange;
		}

		public void setConfirmRange(String confirmRange) {
			this.confirmRange = confirmRange;
		}

		public String getIsConfirmed() {
			return this.isConfirmed;
		}

		public void setIsConfirmed(String isConfirmed) {
			this.isConfirmed = isConfirmed;
		}

		public String getNeedConfirm() {
			return this.needConfirm;
		}

		public void setNeedConfirm(String needConfirm) {
			this.needConfirm = needConfirm;
		}

		public String getFeedbackRemark() {
			return this.feedbackRemark;
		}

		public void setFeedbackRemark(String feedbackRemark) {
			this.feedbackRemark = feedbackRemark;
		}

		public Integer getFeedbackFlag() {
			return this.feedbackFlag;
		}

		public void setFeedbackFlag(Integer feedbackFlag) {
			this.feedbackFlag = feedbackFlag;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public Boolean getIsVoteEqual() {
			return this.isVoteEqual;
		}

		public void setIsVoteEqual(Boolean isVoteEqual) {
			this.isVoteEqual = isVoteEqual;
		}

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

		public String getSubTaskId() {
			return this.subTaskId;
		}

		public void setSubTaskId(String subTaskId) {
			this.subTaskId = subTaskId;
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

		public String getAbandonRemark() {
			return this.abandonRemark;
		}

		public void setAbandonRemark(String abandonRemark) {
			this.abandonRemark = abandonRemark;
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

		public List<MarkResultListItem> getMarkResultList() {
			return this.markResultList;
		}

		public void setMarkResultList(List<MarkResultListItem> markResultList) {
			this.markResultList = markResultList;
		}

		public List<VoteInfoListItem> getVoteInfoList() {
			return this.voteInfoList;
		}

		public void setVoteInfoList(List<VoteInfoListItem> voteInfoList) {
			this.voteInfoList = voteInfoList;
		}

		public static class MarkResultListItem {

			private String userMarkResultId;

			private Boolean isNeedVoteJudge;

			private String markResultId;

			private String markTitle;

			private String markResult;

			private String questionId;

			private String resultType;

			private String version;

			private String markTime;

			private Progress progress;

			public String getUserMarkResultId() {
				return this.userMarkResultId;
			}

			public void setUserMarkResultId(String userMarkResultId) {
				this.userMarkResultId = userMarkResultId;
			}

			public Boolean getIsNeedVoteJudge() {
				return this.isNeedVoteJudge;
			}

			public void setIsNeedVoteJudge(Boolean isNeedVoteJudge) {
				this.isNeedVoteJudge = isNeedVoteJudge;
			}

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

			public String getMarkTime() {
				return this.markTime;
			}

			public void setMarkTime(String markTime) {
				this.markTime = markTime;
			}

			public Progress getProgress() {
				return this.progress;
			}

			public void setProgress(Progress progress) {
				this.progress = progress;
			}

			public static class Progress {

				private Integer total;

				private Integer finished;

				public Integer getTotal() {
					return this.total;
				}

				public void setTotal(Integer total) {
					this.total = total;
				}

				public Integer getFinished() {
					return this.finished;
				}

				public void setFinished(Integer finished) {
					this.finished = finished;
				}
			}
		}

		public static class VoteInfoListItem {

			private String userId;

			private String userName;

			private String workFlow;

			private String userMarkItemId;

			private Boolean isAccept;

			private List<MarkResultListItem2> markResultList1;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getWorkFlow() {
				return this.workFlow;
			}

			public void setWorkFlow(String workFlow) {
				this.workFlow = workFlow;
			}

			public String getUserMarkItemId() {
				return this.userMarkItemId;
			}

			public void setUserMarkItemId(String userMarkItemId) {
				this.userMarkItemId = userMarkItemId;
			}

			public Boolean getIsAccept() {
				return this.isAccept;
			}

			public void setIsAccept(Boolean isAccept) {
				this.isAccept = isAccept;
			}

			public List<MarkResultListItem2> getMarkResultList1() {
				return this.markResultList1;
			}

			public void setMarkResultList1(List<MarkResultListItem2> markResultList1) {
				this.markResultList1 = markResultList1;
			}

			public static class MarkResultListItem2 {

				private String userMarkResultId;

				private Boolean isNeedVoteJudge;

				private String markResultId;

				private String markTitle;

				private String markResult;

				private String questionId;

				private String resultType;

				private String version;

				private String markTime;

				private Progress3 progress3;

				public String getUserMarkResultId() {
					return this.userMarkResultId;
				}

				public void setUserMarkResultId(String userMarkResultId) {
					this.userMarkResultId = userMarkResultId;
				}

				public Boolean getIsNeedVoteJudge() {
					return this.isNeedVoteJudge;
				}

				public void setIsNeedVoteJudge(Boolean isNeedVoteJudge) {
					this.isNeedVoteJudge = isNeedVoteJudge;
				}

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

				public String getMarkTime() {
					return this.markTime;
				}

				public void setMarkTime(String markTime) {
					this.markTime = markTime;
				}

				public Progress3 getProgress3() {
					return this.progress3;
				}

				public void setProgress3(Progress3 progress3) {
					this.progress3 = progress3;
				}

				public static class Progress3 {

					private Integer total;

					private Integer finished;

					public Integer getTotal() {
						return this.total;
					}

					public void setTotal(Integer total) {
						this.total = total;
					}

					public Integer getFinished() {
						return this.finished;
					}

					public void setFinished(Integer finished) {
						this.finished = finished;
					}
				}
			}
		}
	}

	@Override
	public GetUserMarkItemInfoResponse getInstance(UnmarshallerContext context) {
		return	GetUserMarkItemInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
