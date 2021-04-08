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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.GetHotlineCallActionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHotlineCallActionResponse extends AcsResponse {

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

		private Long taskId;

		private Long subTouchId;

		private String memberList;

		private Long depId;

		private Long caseId;

		private String channelId;

		private Long touchId;

		private Long memberId;

		private Long calloutId;

		private Long buId;

		private Long actionId;

		private String servicerName;

		private String calloutName;

		private String isTransfer;

		private String memberName;

		private Long servicerId;

		private Long channelType;

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public Long getSubTouchId() {
			return this.subTouchId;
		}

		public void setSubTouchId(Long subTouchId) {
			this.subTouchId = subTouchId;
		}

		public String getMemberList() {
			return this.memberList;
		}

		public void setMemberList(String memberList) {
			this.memberList = memberList;
		}

		public Long getDepId() {
			return this.depId;
		}

		public void setDepId(Long depId) {
			this.depId = depId;
		}

		public Long getCaseId() {
			return this.caseId;
		}

		public void setCaseId(Long caseId) {
			this.caseId = caseId;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public Long getTouchId() {
			return this.touchId;
		}

		public void setTouchId(Long touchId) {
			this.touchId = touchId;
		}

		public Long getMemberId() {
			return this.memberId;
		}

		public void setMemberId(Long memberId) {
			this.memberId = memberId;
		}

		public Long getCalloutId() {
			return this.calloutId;
		}

		public void setCalloutId(Long calloutId) {
			this.calloutId = calloutId;
		}

		public Long getBuId() {
			return this.buId;
		}

		public void setBuId(Long buId) {
			this.buId = buId;
		}

		public Long getActionId() {
			return this.actionId;
		}

		public void setActionId(Long actionId) {
			this.actionId = actionId;
		}

		public String getServicerName() {
			return this.servicerName;
		}

		public void setServicerName(String servicerName) {
			this.servicerName = servicerName;
		}

		public String getCalloutName() {
			return this.calloutName;
		}

		public void setCalloutName(String calloutName) {
			this.calloutName = calloutName;
		}

		public String getIsTransfer() {
			return this.isTransfer;
		}

		public void setIsTransfer(String isTransfer) {
			this.isTransfer = isTransfer;
		}

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public Long getServicerId() {
			return this.servicerId;
		}

		public void setServicerId(Long servicerId) {
			this.servicerId = servicerId;
		}

		public Long getChannelType() {
			return this.channelType;
		}

		public void setChannelType(Long channelType) {
			this.channelType = channelType;
		}
	}

	@Override
	public GetHotlineCallActionResponse getInstance(UnmarshallerContext context) {
		return	GetHotlineCallActionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
