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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRealTimeRecordListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRealTimeRecordListResponse extends AcsResponse {

	private String requestId;

	private List<CommunicationRecordInfo> communicationRecordInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CommunicationRecordInfo> getCommunicationRecordInfos() {
		return this.communicationRecordInfos;
	}

	public void setCommunicationRecordInfos(List<CommunicationRecordInfo> communicationRecordInfos) {
		this.communicationRecordInfos = communicationRecordInfos;
	}

	public static class CommunicationRecordInfo {

		private String channelId;

		private String startTime;

		private String endTime;

		private Long onlineUserCnt;

		private Boolean status;

		private String recordId;

		private List<String> callAreas;

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
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

		public Long getOnlineUserCnt() {
			return this.onlineUserCnt;
		}

		public void setOnlineUserCnt(Long onlineUserCnt) {
			this.onlineUserCnt = onlineUserCnt;
		}

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public List<String> getCallAreas() {
			return this.callAreas;
		}

		public void setCallAreas(List<String> callAreas) {
			this.callAreas = callAreas;
		}
	}

	@Override
	public DescribeRealTimeRecordListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRealTimeRecordListResponseUnmarshaller.unmarshall(this, context);
	}
}
