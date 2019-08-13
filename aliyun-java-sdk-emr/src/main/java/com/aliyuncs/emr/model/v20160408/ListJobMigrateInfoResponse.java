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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListJobMigrateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobMigrateInfoResponse extends AcsResponse {

	private Long total;

	private List<JobMigrateInfo> jobMigrateInfoList;

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<JobMigrateInfo> getJobMigrateInfoList() {
		return this.jobMigrateInfoList;
	}

	public void setJobMigrateInfoList(List<JobMigrateInfo> jobMigrateInfoList) {
		this.jobMigrateInfoList = jobMigrateInfoList;
	}

	public static class JobMigrateInfo {

		private String id;

		private String name;

		private String type;

		private Integer maxRetry;

		private String failedAction;

		private String params;

		private String newId;

		private String premigratedDate;

		private String migratedDate;

		private String createTime;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getMaxRetry() {
			return this.maxRetry;
		}

		public void setMaxRetry(Integer maxRetry) {
			this.maxRetry = maxRetry;
		}

		public String getFailedAction() {
			return this.failedAction;
		}

		public void setFailedAction(String failedAction) {
			this.failedAction = failedAction;
		}

		public String getParams() {
			return this.params;
		}

		public void setParams(String params) {
			this.params = params;
		}

		public String getNewId() {
			return this.newId;
		}

		public void setNewId(String newId) {
			this.newId = newId;
		}

		public String getPremigratedDate() {
			return this.premigratedDate;
		}

		public void setPremigratedDate(String premigratedDate) {
			this.premigratedDate = premigratedDate;
		}

		public String getMigratedDate() {
			return this.migratedDate;
		}

		public void setMigratedDate(String migratedDate) {
			this.migratedDate = migratedDate;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListJobMigrateInfoResponse getInstance(UnmarshallerContext context) {
		return	ListJobMigrateInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
