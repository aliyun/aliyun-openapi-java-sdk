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

package com.aliyuncs.ccs.model.v20171001;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccs.transform.v20171001.QueryHotlineRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryHotlineRecordResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNum;

	private Integer pageSize;

	private List<HotlineRecord> records;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<HotlineRecord> getRecords() {
		return this.records;
	}

	public void setRecords(List<HotlineRecord> records) {
		this.records = records;
	}

	public static class HotlineRecord {

		private String id;

		private String visitorId;

		private String visitorPhone;

		private String visitorProvince;

		private String callType;

		private String agentId;

		private String agentName;

		private String groupId;

		private String groupName;

		private String createTime;

		private String finishTime;

		private String status;

		private String memo;

		private String hangupType;

		private String satisfaction;

		private String outboundTaskId;

		private String categories;

		private String ccsInstanceId;

		private Long talkDuration;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getVisitorId() {
			return this.visitorId;
		}

		public void setVisitorId(String visitorId) {
			this.visitorId = visitorId;
		}

		public String getVisitorPhone() {
			return this.visitorPhone;
		}

		public void setVisitorPhone(String visitorPhone) {
			this.visitorPhone = visitorPhone;
		}

		public String getVisitorProvince() {
			return this.visitorProvince;
		}

		public void setVisitorProvince(String visitorProvince) {
			this.visitorProvince = visitorProvince;
		}

		public String getCallType() {
			return this.callType;
		}

		public void setCallType(String callType) {
			this.callType = callType;
		}

		public String getAgentId() {
			return this.agentId;
		}

		public void setAgentId(String agentId) {
			this.agentId = agentId;
		}

		public String getAgentName() {
			return this.agentName;
		}

		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMemo() {
			return this.memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

		public String getHangupType() {
			return this.hangupType;
		}

		public void setHangupType(String hangupType) {
			this.hangupType = hangupType;
		}

		public String getSatisfaction() {
			return this.satisfaction;
		}

		public void setSatisfaction(String satisfaction) {
			this.satisfaction = satisfaction;
		}

		public String getOutboundTaskId() {
			return this.outboundTaskId;
		}

		public void setOutboundTaskId(String outboundTaskId) {
			this.outboundTaskId = outboundTaskId;
		}

		public String getCategories() {
			return this.categories;
		}

		public void setCategories(String categories) {
			this.categories = categories;
		}

		public String getCcsInstanceId() {
			return this.ccsInstanceId;
		}

		public void setCcsInstanceId(String ccsInstanceId) {
			this.ccsInstanceId = ccsInstanceId;
		}

		public Long getTalkDuration() {
			return this.talkDuration;
		}

		public void setTalkDuration(Long talkDuration) {
			this.talkDuration = talkDuration;
		}
	}

	@Override
	public QueryHotlineRecordResponse getInstance(UnmarshallerContext context) {
		return	QueryHotlineRecordResponseUnmarshaller.unmarshall(this, context);
	}
}
