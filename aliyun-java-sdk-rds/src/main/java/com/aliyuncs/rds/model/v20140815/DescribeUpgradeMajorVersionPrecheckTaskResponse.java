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
import com.aliyuncs.rds.transform.v20140815.DescribeUpgradeMajorVersionPrecheckTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUpgradeMajorVersionPrecheckTaskResponse extends AcsResponse {

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

		private String effectiveTime;

		private String sourceMajorVersion;

		private String result;

		private Integer taskId;

		private String detail;

		private String checkTime;

		public String getTargetMajorVersion() {
			return this.targetMajorVersion;
		}

		public void setTargetMajorVersion(String targetMajorVersion) {
			this.targetMajorVersion = targetMajorVersion;
		}

		public String getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(String effectiveTime) {
			this.effectiveTime = effectiveTime;
		}

		public String getSourceMajorVersion() {
			return this.sourceMajorVersion;
		}

		public void setSourceMajorVersion(String sourceMajorVersion) {
			this.sourceMajorVersion = sourceMajorVersion;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public Integer getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getCheckTime() {
			return this.checkTime;
		}

		public void setCheckTime(String checkTime) {
			this.checkTime = checkTime;
		}
	}

	@Override
	public DescribeUpgradeMajorVersionPrecheckTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeUpgradeMajorVersionPrecheckTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
