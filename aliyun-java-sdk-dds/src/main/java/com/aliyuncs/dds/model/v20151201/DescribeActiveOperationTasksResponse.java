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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeActiveOperationTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveOperationTasksResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalRecordCount;

	private List<ItemsItem> items;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private Integer status;

		private String changeLevelEn;

		private String taskType;

		private String insName;

		private String region;

		private String impactZh;

		private String createdTime;

		private String switchTime;

		private String changeLevelZh;

		private String deadline;

		private String prepareInterval;

		private String taskTypeZh;

		private String currentAVZ;

		private String allowChange;

		private String dbVersion;

		private String impactEn;

		private String insComment;

		private String startTime;

		private String modifiedTime;

		private String allowCancel;

		private String dbType;

		private String changeLevel;

		private String taskTypeEn;

		private String resultInfo;

		private Integer id;

		private String taskParams;

		private List<String> subInsNames;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getChangeLevelEn() {
			return this.changeLevelEn;
		}

		public void setChangeLevelEn(String changeLevelEn) {
			this.changeLevelEn = changeLevelEn;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getInsName() {
			return this.insName;
		}

		public void setInsName(String insName) {
			this.insName = insName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getImpactZh() {
			return this.impactZh;
		}

		public void setImpactZh(String impactZh) {
			this.impactZh = impactZh;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getSwitchTime() {
			return this.switchTime;
		}

		public void setSwitchTime(String switchTime) {
			this.switchTime = switchTime;
		}

		public String getChangeLevelZh() {
			return this.changeLevelZh;
		}

		public void setChangeLevelZh(String changeLevelZh) {
			this.changeLevelZh = changeLevelZh;
		}

		public String getDeadline() {
			return this.deadline;
		}

		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}

		public String getPrepareInterval() {
			return this.prepareInterval;
		}

		public void setPrepareInterval(String prepareInterval) {
			this.prepareInterval = prepareInterval;
		}

		public String getTaskTypeZh() {
			return this.taskTypeZh;
		}

		public void setTaskTypeZh(String taskTypeZh) {
			this.taskTypeZh = taskTypeZh;
		}

		public String getCurrentAVZ() {
			return this.currentAVZ;
		}

		public void setCurrentAVZ(String currentAVZ) {
			this.currentAVZ = currentAVZ;
		}

		public String getAllowChange() {
			return this.allowChange;
		}

		public void setAllowChange(String allowChange) {
			this.allowChange = allowChange;
		}

		public String getDbVersion() {
			return this.dbVersion;
		}

		public void setDbVersion(String dbVersion) {
			this.dbVersion = dbVersion;
		}

		public String getImpactEn() {
			return this.impactEn;
		}

		public void setImpactEn(String impactEn) {
			this.impactEn = impactEn;
		}

		public String getInsComment() {
			return this.insComment;
		}

		public void setInsComment(String insComment) {
			this.insComment = insComment;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getAllowCancel() {
			return this.allowCancel;
		}

		public void setAllowCancel(String allowCancel) {
			this.allowCancel = allowCancel;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getChangeLevel() {
			return this.changeLevel;
		}

		public void setChangeLevel(String changeLevel) {
			this.changeLevel = changeLevel;
		}

		public String getTaskTypeEn() {
			return this.taskTypeEn;
		}

		public void setTaskTypeEn(String taskTypeEn) {
			this.taskTypeEn = taskTypeEn;
		}

		public String getResultInfo() {
			return this.resultInfo;
		}

		public void setResultInfo(String resultInfo) {
			this.resultInfo = resultInfo;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTaskParams() {
			return this.taskParams;
		}

		public void setTaskParams(String taskParams) {
			this.taskParams = taskParams;
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
