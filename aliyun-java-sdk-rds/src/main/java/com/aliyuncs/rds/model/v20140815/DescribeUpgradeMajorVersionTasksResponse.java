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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeUpgradeMajorVersionTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUpgradeMajorVersionTasksResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private List<Tasks> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<Tasks> getItems() {
		return this.items;
	}

	public void setItems(List<Tasks> items) {
		this.items = items;
	}

	public static class Tasks {

		private String targetMajorVersion;

		private String result;

		private String endTime;

		private String startTime;

		private String sourceMajorVersion;

		private String upgradeMode;

		private String collectStatMode;

		private String sourceInsName;

		private Integer taskId;

		private String targetInsName;

		private String switchTime;

		private String detail;

		public String getTargetMajorVersion() {
			return this.targetMajorVersion;
		}

		public void setTargetMajorVersion(String targetMajorVersion) {
			this.targetMajorVersion = targetMajorVersion;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getSourceMajorVersion() {
			return this.sourceMajorVersion;
		}

		public void setSourceMajorVersion(String sourceMajorVersion) {
			this.sourceMajorVersion = sourceMajorVersion;
		}

		public String getUpgradeMode() {
			return this.upgradeMode;
		}

		public void setUpgradeMode(String upgradeMode) {
			this.upgradeMode = upgradeMode;
		}

		public String getCollectStatMode() {
			return this.collectStatMode;
		}

		public void setCollectStatMode(String collectStatMode) {
			this.collectStatMode = collectStatMode;
		}

		public String getSourceInsName() {
			return this.sourceInsName;
		}

		public void setSourceInsName(String sourceInsName) {
			this.sourceInsName = sourceInsName;
		}

		public Integer getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}

		public String getTargetInsName() {
			return this.targetInsName;
		}

		public void setTargetInsName(String targetInsName) {
			this.targetInsName = targetInsName;
		}

		public String getSwitchTime() {
			return this.switchTime;
		}

		public void setSwitchTime(String switchTime) {
			this.switchTime = switchTime;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}
	}

	@Override
	public DescribeUpgradeMajorVersionTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeUpgradeMajorVersionTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
