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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.ListDiagnoseInfoForSingleCardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDiagnoseInfoForSingleCardResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Long maxResults;

	private Long totalCount;

	private List<DiagnoseInfoItem> diagnoseInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<DiagnoseInfoItem> getDiagnoseInfo() {
		return this.diagnoseInfo;
	}

	public void setDiagnoseInfo(List<DiagnoseInfoItem> diagnoseInfo) {
		this.diagnoseInfo = diagnoseInfo;
	}

	public static class DiagnoseInfoItem {

		private String ioTCloudConnectorId;

		private String cardIp;

		private String iccId;

		private String sourceType;

		private String source;

		private String destinationType;

		private String destination;

		private Long beginTime;

		private Long endTime;

		private String status;

		private Long diagnoseTime;

		private String taskId;

		public String getIoTCloudConnectorId() {
			return this.ioTCloudConnectorId;
		}

		public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
			this.ioTCloudConnectorId = ioTCloudConnectorId;
		}

		public String getCardIp() {
			return this.cardIp;
		}

		public void setCardIp(String cardIp) {
			this.cardIp = cardIp;
		}

		public String getIccId() {
			return this.iccId;
		}

		public void setIccId(String iccId) {
			this.iccId = iccId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDestinationType() {
			return this.destinationType;
		}

		public void setDestinationType(String destinationType) {
			this.destinationType = destinationType;
		}

		public String getDestination() {
			return this.destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getDiagnoseTime() {
			return this.diagnoseTime;
		}

		public void setDiagnoseTime(Long diagnoseTime) {
			this.diagnoseTime = diagnoseTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public ListDiagnoseInfoForSingleCardResponse getInstance(UnmarshallerContext context) {
		return	ListDiagnoseInfoForSingleCardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
