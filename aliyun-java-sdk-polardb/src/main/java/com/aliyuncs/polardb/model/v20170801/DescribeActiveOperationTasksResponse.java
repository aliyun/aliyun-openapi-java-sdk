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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeActiveOperationTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveOperationTasksResponse extends AcsResponse {

	private Integer totalRecordCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ItemsItem> items;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private Integer status;

		private String prepareInterval;

		private String deadline;

		private String dBType;

		private String taskType;

		private String startTime;

		private String dBVersion;

		private String modifiedTime;

		private String dBClusterId;

		private String region;

		private String resultInfo;

		private String createdTime;

		private Integer taskId;

		private String switchTime;

		private String currentAVZ;

		private String insComment;

		private String taskTypeZh;

		private String taskTypeEn;

		private String changeLevel;

		private String changeLevelZh;

		private String changeLevelEn;

		private String impactZh;

		private String impactEn;

		private Long allowChange;

		private Long allowCancel;

		private String impact;

		private String taskParams;

		private List<String> dBNodeIds;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getPrepareInterval() {
			return this.prepareInterval;
		}

		public void setPrepareInterval(String prepareInterval) {
			this.prepareInterval = prepareInterval;
		}

		public String getDeadline() {
			return this.deadline;
		}

		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
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

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public Integer getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}

		public String getSwitchTime() {
			return this.switchTime;
		}

		public void setSwitchTime(String switchTime) {
			this.switchTime = switchTime;
		}

		public String getCurrentAVZ() {
			return this.currentAVZ;
		}

		public void setCurrentAVZ(String currentAVZ) {
			this.currentAVZ = currentAVZ;
		}

		public String getInsComment() {
			return this.insComment;
		}

		public void setInsComment(String insComment) {
			this.insComment = insComment;
		}

		public String getTaskTypeZh() {
			return this.taskTypeZh;
		}

		public void setTaskTypeZh(String taskTypeZh) {
			this.taskTypeZh = taskTypeZh;
		}

		public String getTaskTypeEn() {
			return this.taskTypeEn;
		}

		public void setTaskTypeEn(String taskTypeEn) {
			this.taskTypeEn = taskTypeEn;
		}

		public String getChangeLevel() {
			return this.changeLevel;
		}

		public void setChangeLevel(String changeLevel) {
			this.changeLevel = changeLevel;
		}

		public String getChangeLevelZh() {
			return this.changeLevelZh;
		}

		public void setChangeLevelZh(String changeLevelZh) {
			this.changeLevelZh = changeLevelZh;
		}

		public String getChangeLevelEn() {
			return this.changeLevelEn;
		}

		public void setChangeLevelEn(String changeLevelEn) {
			this.changeLevelEn = changeLevelEn;
		}

		public String getImpactZh() {
			return this.impactZh;
		}

		public void setImpactZh(String impactZh) {
			this.impactZh = impactZh;
		}

		public String getImpactEn() {
			return this.impactEn;
		}

		public void setImpactEn(String impactEn) {
			this.impactEn = impactEn;
		}

		public Long getAllowChange() {
			return this.allowChange;
		}

		public void setAllowChange(Long allowChange) {
			this.allowChange = allowChange;
		}

		public Long getAllowCancel() {
			return this.allowCancel;
		}

		public void setAllowCancel(Long allowCancel) {
			this.allowCancel = allowCancel;
		}

		public String getImpact() {
			return this.impact;
		}

		public void setImpact(String impact) {
			this.impact = impact;
		}

		public String getTaskParams() {
			return this.taskParams;
		}

		public void setTaskParams(String taskParams) {
			this.taskParams = taskParams;
		}

		public List<String> getDBNodeIds() {
			return this.dBNodeIds;
		}

		public void setDBNodeIds(List<String> dBNodeIds) {
			this.dBNodeIds = dBNodeIds;
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
