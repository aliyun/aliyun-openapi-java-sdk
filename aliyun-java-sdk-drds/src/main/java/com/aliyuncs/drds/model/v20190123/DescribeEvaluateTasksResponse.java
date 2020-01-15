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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeEvaluateTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEvaluateTasksResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<EvaluateTask> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<EvaluateTask> getData() {
		return this.data;
	}

	public void setData(List<EvaluateTask> data) {
		this.data = data;
	}

	public static class EvaluateTask {

		private Integer id;

		private Integer batchEvaluateTaskId;

		private String taskName;

		private String gmtCreate;

		private String gmtModified;

		private String status;

		private String instId;

		private String dbName;

		private Integer progress;

		private Integer evalauteHours;

		private Integer allSqlCount;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getBatchEvaluateTaskId() {
			return this.batchEvaluateTaskId;
		}

		public void setBatchEvaluateTaskId(Integer batchEvaluateTaskId) {
			this.batchEvaluateTaskId = batchEvaluateTaskId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInstId() {
			return this.instId;
		}

		public void setInstId(String instId) {
			this.instId = instId;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public Integer getEvalauteHours() {
			return this.evalauteHours;
		}

		public void setEvalauteHours(Integer evalauteHours) {
			this.evalauteHours = evalauteHours;
		}

		public Integer getAllSqlCount() {
			return this.allSqlCount;
		}

		public void setAllSqlCount(Integer allSqlCount) {
			this.allSqlCount = allSqlCount;
		}
	}

	@Override
	public DescribeEvaluateTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeEvaluateTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
