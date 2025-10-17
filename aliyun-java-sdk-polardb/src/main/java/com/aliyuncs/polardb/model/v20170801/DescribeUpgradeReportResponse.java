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
import com.aliyuncs.polardb.transform.v20170801.DescribeUpgradeReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUpgradeReportResponse extends AcsResponse {

	private String requestId;

	private String sourceDBClusterId;

	private Long totalSize;

	private Long itemsSize;

	private String details;

	private String srcDBType;

	private String dstDBType;

	private String srcDeleted;

	private String type;

	private List<Report> upgradeReportList;

	private List<SQLReport> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSourceDBClusterId() {
		return this.sourceDBClusterId;
	}

	public void setSourceDBClusterId(String sourceDBClusterId) {
		this.sourceDBClusterId = sourceDBClusterId;
	}

	public Long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public Long getItemsSize() {
		return this.itemsSize;
	}

	public void setItemsSize(Long itemsSize) {
		this.itemsSize = itemsSize;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getSrcDBType() {
		return this.srcDBType;
	}

	public void setSrcDBType(String srcDBType) {
		this.srcDBType = srcDBType;
	}

	public String getDstDBType() {
		return this.dstDBType;
	}

	public void setDstDBType(String dstDBType) {
		this.dstDBType = dstDBType;
	}

	public String getSrcDeleted() {
		return this.srcDeleted;
	}

	public void setSrcDeleted(String srcDeleted) {
		this.srcDeleted = srcDeleted;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Report> getUpgradeReportList() {
		return this.upgradeReportList;
	}

	public void setUpgradeReportList(List<Report> upgradeReportList) {
		this.upgradeReportList = upgradeReportList;
	}

	public List<SQLReport> getItems() {
		return this.items;
	}

	public void setItems(List<SQLReport> items) {
		this.items = items;
	}

	public static class Report {

		private String taskId;

		private String checkTime;

		private String dstVersion;

		private String srcInsName;

		private String srcVersion;

		private String upgradeMode;

		private String result;

		private String effectiveTime;

		private String startTime;

		private String endTime;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getCheckTime() {
			return this.checkTime;
		}

		public void setCheckTime(String checkTime) {
			this.checkTime = checkTime;
		}

		public String getDstVersion() {
			return this.dstVersion;
		}

		public void setDstVersion(String dstVersion) {
			this.dstVersion = dstVersion;
		}

		public String getSrcInsName() {
			return this.srcInsName;
		}

		public void setSrcInsName(String srcInsName) {
			this.srcInsName = srcInsName;
		}

		public String getSrcVersion() {
			return this.srcVersion;
		}

		public void setSrcVersion(String srcVersion) {
			this.srcVersion = srcVersion;
		}

		public String getUpgradeMode() {
			return this.upgradeMode;
		}

		public void setUpgradeMode(String upgradeMode) {
			this.upgradeMode = upgradeMode;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(String effectiveTime) {
			this.effectiveTime = effectiveTime;
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
	}

	public static class SQLReport {

		private String schema;

		private String type;

		private String name;

		private String status;

		private String dDL;

		public String getSchema() {
			return this.schema;
		}

		public void setSchema(String schema) {
			this.schema = schema;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDDL() {
			return this.dDL;
		}

		public void setDDL(String dDL) {
			this.dDL = dDL;
		}
	}

	@Override
	public DescribeUpgradeReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeUpgradeReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
