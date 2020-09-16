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
import com.aliyuncs.aiccs.transform.v20191015.HotlineSessionQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class HotlineSessionQueryResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageSize;

		private Integer totalCount;

		private Integer pageNumber;

		private List<CallDetailRecordItem> callDetailRecord;

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

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<CallDetailRecordItem> getCallDetailRecord() {
			return this.callDetailRecord;
		}

		public void setCallDetailRecord(List<CallDetailRecordItem> callDetailRecord) {
			this.callDetailRecord = callDetailRecord;
		}

		public static class CallDetailRecordItem {

			private String acid;

			private Integer callType;

			private Long groupId;

			private String groupName;

			private String callingNumber;

			private String calledNumber;

			private String servicerId;

			private String servicerName;

			private String memberName;

			private String memberId;

			private String inQueueTime;

			private String outQueueTime;

			private String ringStartTime;

			private String ringEndTime;

			private Integer ringContinueTime;

			private String pickUpTime;

			private String hangUpTime;

			private Integer queueUpContinueTime;

			private Integer callContinueTime;

			private Integer evaluationLevel;

			private Integer evaluationScore;

			private String callResult;

			private String hangUpRole;

			private String createTime;

			private String activeTransferId;

			private String passiveTransferId;

			private String passiveTransferIdType;

			private String trunkCall;

			public String getAcid() {
				return this.acid;
			}

			public void setAcid(String acid) {
				this.acid = acid;
			}

			public Integer getCallType() {
				return this.callType;
			}

			public void setCallType(Integer callType) {
				this.callType = callType;
			}

			public Long getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Long groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getCallingNumber() {
				return this.callingNumber;
			}

			public void setCallingNumber(String callingNumber) {
				this.callingNumber = callingNumber;
			}

			public String getCalledNumber() {
				return this.calledNumber;
			}

			public void setCalledNumber(String calledNumber) {
				this.calledNumber = calledNumber;
			}

			public String getServicerId() {
				return this.servicerId;
			}

			public void setServicerId(String servicerId) {
				this.servicerId = servicerId;
			}

			public String getServicerName() {
				return this.servicerName;
			}

			public void setServicerName(String servicerName) {
				this.servicerName = servicerName;
			}

			public String getMemberName() {
				return this.memberName;
			}

			public void setMemberName(String memberName) {
				this.memberName = memberName;
			}

			public String getMemberId() {
				return this.memberId;
			}

			public void setMemberId(String memberId) {
				this.memberId = memberId;
			}

			public String getInQueueTime() {
				return this.inQueueTime;
			}

			public void setInQueueTime(String inQueueTime) {
				this.inQueueTime = inQueueTime;
			}

			public String getOutQueueTime() {
				return this.outQueueTime;
			}

			public void setOutQueueTime(String outQueueTime) {
				this.outQueueTime = outQueueTime;
			}

			public String getRingStartTime() {
				return this.ringStartTime;
			}

			public void setRingStartTime(String ringStartTime) {
				this.ringStartTime = ringStartTime;
			}

			public String getRingEndTime() {
				return this.ringEndTime;
			}

			public void setRingEndTime(String ringEndTime) {
				this.ringEndTime = ringEndTime;
			}

			public Integer getRingContinueTime() {
				return this.ringContinueTime;
			}

			public void setRingContinueTime(Integer ringContinueTime) {
				this.ringContinueTime = ringContinueTime;
			}

			public String getPickUpTime() {
				return this.pickUpTime;
			}

			public void setPickUpTime(String pickUpTime) {
				this.pickUpTime = pickUpTime;
			}

			public String getHangUpTime() {
				return this.hangUpTime;
			}

			public void setHangUpTime(String hangUpTime) {
				this.hangUpTime = hangUpTime;
			}

			public Integer getQueueUpContinueTime() {
				return this.queueUpContinueTime;
			}

			public void setQueueUpContinueTime(Integer queueUpContinueTime) {
				this.queueUpContinueTime = queueUpContinueTime;
			}

			public Integer getCallContinueTime() {
				return this.callContinueTime;
			}

			public void setCallContinueTime(Integer callContinueTime) {
				this.callContinueTime = callContinueTime;
			}

			public Integer getEvaluationLevel() {
				return this.evaluationLevel;
			}

			public void setEvaluationLevel(Integer evaluationLevel) {
				this.evaluationLevel = evaluationLevel;
			}

			public Integer getEvaluationScore() {
				return this.evaluationScore;
			}

			public void setEvaluationScore(Integer evaluationScore) {
				this.evaluationScore = evaluationScore;
			}

			public String getCallResult() {
				return this.callResult;
			}

			public void setCallResult(String callResult) {
				this.callResult = callResult;
			}

			public String getHangUpRole() {
				return this.hangUpRole;
			}

			public void setHangUpRole(String hangUpRole) {
				this.hangUpRole = hangUpRole;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getActiveTransferId() {
				return this.activeTransferId;
			}

			public void setActiveTransferId(String activeTransferId) {
				this.activeTransferId = activeTransferId;
			}

			public String getPassiveTransferId() {
				return this.passiveTransferId;
			}

			public void setPassiveTransferId(String passiveTransferId) {
				this.passiveTransferId = passiveTransferId;
			}

			public String getPassiveTransferIdType() {
				return this.passiveTransferIdType;
			}

			public void setPassiveTransferIdType(String passiveTransferIdType) {
				this.passiveTransferIdType = passiveTransferIdType;
			}

			public String getTrunkCall() {
				return this.trunkCall;
			}

			public void setTrunkCall(String trunkCall) {
				this.trunkCall = trunkCall;
			}
		}
	}

	@Override
	public HotlineSessionQueryResponse getInstance(UnmarshallerContext context) {
		return	HotlineSessionQueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
