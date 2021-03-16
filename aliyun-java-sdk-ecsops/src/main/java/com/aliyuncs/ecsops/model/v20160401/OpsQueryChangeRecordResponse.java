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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryChangeRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryChangeRecordResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ChangeRecord> changeRecords;

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

	public List<ChangeRecord> getChangeRecords() {
		return this.changeRecords;
	}

	public void setChangeRecords(List<ChangeRecord> changeRecords) {
		this.changeRecords = changeRecords;
	}

	public static class ChangeRecord {

		private Long id;

		private String gmtCreate;

		private String changeSummary;

		private String changeContent;

		private String changeResult;

		private String executorNo;

		private String executorName;

		private String changeType;

		private String changeApps;

		private String app;

		private String startTimePlan;

		private String startTimeReal;

		private String endTimeReal;

		private Integer isEmergency;

		private String changefreeUrl;

		private String sourceSystem;

		private String sourceOrderId;

		private String changeCollectChannel;

		private String changeCategory;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getChangeSummary() {
			return this.changeSummary;
		}

		public void setChangeSummary(String changeSummary) {
			this.changeSummary = changeSummary;
		}

		public String getChangeContent() {
			return this.changeContent;
		}

		public void setChangeContent(String changeContent) {
			this.changeContent = changeContent;
		}

		public String getChangeResult() {
			return this.changeResult;
		}

		public void setChangeResult(String changeResult) {
			this.changeResult = changeResult;
		}

		public String getExecutorNo() {
			return this.executorNo;
		}

		public void setExecutorNo(String executorNo) {
			this.executorNo = executorNo;
		}

		public String getExecutorName() {
			return this.executorName;
		}

		public void setExecutorName(String executorName) {
			this.executorName = executorName;
		}

		public String getChangeType() {
			return this.changeType;
		}

		public void setChangeType(String changeType) {
			this.changeType = changeType;
		}

		public String getChangeApps() {
			return this.changeApps;
		}

		public void setChangeApps(String changeApps) {
			this.changeApps = changeApps;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getStartTimePlan() {
			return this.startTimePlan;
		}

		public void setStartTimePlan(String startTimePlan) {
			this.startTimePlan = startTimePlan;
		}

		public String getStartTimeReal() {
			return this.startTimeReal;
		}

		public void setStartTimeReal(String startTimeReal) {
			this.startTimeReal = startTimeReal;
		}

		public String getEndTimeReal() {
			return this.endTimeReal;
		}

		public void setEndTimeReal(String endTimeReal) {
			this.endTimeReal = endTimeReal;
		}

		public Integer getIsEmergency() {
			return this.isEmergency;
		}

		public void setIsEmergency(Integer isEmergency) {
			this.isEmergency = isEmergency;
		}

		public String getChangefreeUrl() {
			return this.changefreeUrl;
		}

		public void setChangefreeUrl(String changefreeUrl) {
			this.changefreeUrl = changefreeUrl;
		}

		public String getSourceSystem() {
			return this.sourceSystem;
		}

		public void setSourceSystem(String sourceSystem) {
			this.sourceSystem = sourceSystem;
		}

		public String getSourceOrderId() {
			return this.sourceOrderId;
		}

		public void setSourceOrderId(String sourceOrderId) {
			this.sourceOrderId = sourceOrderId;
		}

		public String getChangeCollectChannel() {
			return this.changeCollectChannel;
		}

		public void setChangeCollectChannel(String changeCollectChannel) {
			this.changeCollectChannel = changeCollectChannel;
		}

		public String getChangeCategory() {
			return this.changeCategory;
		}

		public void setChangeCategory(String changeCategory) {
			this.changeCategory = changeCategory;
		}
	}

	@Override
	public OpsQueryChangeRecordResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryChangeRecordResponseUnmarshaller.unmarshall(this, context);
	}
}
