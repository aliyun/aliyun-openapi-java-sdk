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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeActiveOperationTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveOperationTasksResponse extends AcsResponse {

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private Long totalRecordCount;

	private List<ItemsItem> items;

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String allowCancel;

		private String allowChange;

		private String changeLevel;

		private String changeLevelEn;

		private String changeLevelZh;

		private String createdTime;

		private String currentAVZ;

		private String dbType;

		private String dbVersion;

		private String deadline;

		private Long id;

		private String impact;

		private String impactEn;

		private String impactZh;

		private String insComment;

		private String insName;

		private String modifiedTime;

		private String prepareInterval;

		private String region;

		private String resultInfo;

		private String startTime;

		private Long status;

		private String switchTime;

		private String taskType;

		private String taskTypeEn;

		private String taskTypeZh;

		private List<String> subInsNames;

		public String getAllowCancel() {
			return this.allowCancel;
		}

		public void setAllowCancel(String allowCancel) {
			this.allowCancel = allowCancel;
		}

		public String getAllowChange() {
			return this.allowChange;
		}

		public void setAllowChange(String allowChange) {
			this.allowChange = allowChange;
		}

		public String getChangeLevel() {
			return this.changeLevel;
		}

		public void setChangeLevel(String changeLevel) {
			this.changeLevel = changeLevel;
		}

		public String getChangeLevelEn() {
			return this.changeLevelEn;
		}

		public void setChangeLevelEn(String changeLevelEn) {
			this.changeLevelEn = changeLevelEn;
		}

		public String getChangeLevelZh() {
			return this.changeLevelZh;
		}

		public void setChangeLevelZh(String changeLevelZh) {
			this.changeLevelZh = changeLevelZh;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getCurrentAVZ() {
			return this.currentAVZ;
		}

		public void setCurrentAVZ(String currentAVZ) {
			this.currentAVZ = currentAVZ;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getDbVersion() {
			return this.dbVersion;
		}

		public void setDbVersion(String dbVersion) {
			this.dbVersion = dbVersion;
		}

		public String getDeadline() {
			return this.deadline;
		}

		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getImpact() {
			return this.impact;
		}

		public void setImpact(String impact) {
			this.impact = impact;
		}

		public String getImpactEn() {
			return this.impactEn;
		}

		public void setImpactEn(String impactEn) {
			this.impactEn = impactEn;
		}

		public String getImpactZh() {
			return this.impactZh;
		}

		public void setImpactZh(String impactZh) {
			this.impactZh = impactZh;
		}

		public String getInsComment() {
			return this.insComment;
		}

		public void setInsComment(String insComment) {
			this.insComment = insComment;
		}

		public String getInsName() {
			return this.insName;
		}

		public void setInsName(String insName) {
			this.insName = insName;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getPrepareInterval() {
			return this.prepareInterval;
		}

		public void setPrepareInterval(String prepareInterval) {
			this.prepareInterval = prepareInterval;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getResultInfo() {
			return this.resultInfo;
		}

		public void setResultInfo(String resultInfo) {
			this.resultInfo = resultInfo;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getSwitchTime() {
			return this.switchTime;
		}

		public void setSwitchTime(String switchTime) {
			this.switchTime = switchTime;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskTypeEn() {
			return this.taskTypeEn;
		}

		public void setTaskTypeEn(String taskTypeEn) {
			this.taskTypeEn = taskTypeEn;
		}

		public String getTaskTypeZh() {
			return this.taskTypeZh;
		}

		public void setTaskTypeZh(String taskTypeZh) {
			this.taskTypeZh = taskTypeZh;
		}

		public List<String> getSubInsNames() {
			return this.subInsNames;
		}

		public void setSubInsNames(List<String> subInsNames) {
			this.subInsNames = subInsNames;
		}
	}

	@Override
	public DescribeActiveOperationTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeActiveOperationTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
