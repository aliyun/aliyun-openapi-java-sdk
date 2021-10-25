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

package com.aliyuncs.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribePreCheckStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePreCheckStatusResponse extends AcsResponse {

	private String code;

	private Integer errorItem;

	private Integer httpStatusCode;

	private String jobName;

	private String state;

	private Boolean success;

	private Integer total;

	private String requestId;

	private String jobId;

	private Long pageNumber;

	private Long pageRecordCount;

	private Long totalRecordCount;

	private List<ProgressInfo> jobProgress;

	private List<SubDistributedJobStatusItem> subDistributedJobStatus;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getErrorItem() {
		return this.errorItem;
	}

	public void setErrorItem(Integer errorItem) {
		this.errorItem = errorItem;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Long pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<ProgressInfo> getJobProgress() {
		return this.jobProgress;
	}

	public void setJobProgress(List<ProgressInfo> jobProgress) {
		this.jobProgress = jobProgress;
	}

	public List<SubDistributedJobStatusItem> getSubDistributedJobStatus() {
		return this.subDistributedJobStatus;
	}

	public void setSubDistributedJobStatus(List<SubDistributedJobStatusItem> subDistributedJobStatus) {
		this.subDistributedJobStatus = subDistributedJobStatus;
	}

	public static class ProgressInfo {

		private Boolean skip;

		private Boolean canSkip;

		private String errMsg;

		private String bootTime;

		private Integer delaySeconds;

		private String finishTime;

		private String ignoreFlag;

		private String item;

		private String jobId;

		private String names;

		private Integer orderNum;

		private String state;

		private String sub;

		private String repairMethod;

		private String targetNames;

		private Integer total;

		private String sourceSchema;

		private String parentObj;

		private Long diffRow;

		private String destSchema;

		private String errDetail;

		private String ddlSql;

		private String id;

		private List<JobLog> logs;

		public Boolean getSkip() {
			return this.skip;
		}

		public void setSkip(Boolean skip) {
			this.skip = skip;
		}

		public Boolean getCanSkip() {
			return this.canSkip;
		}

		public void setCanSkip(Boolean canSkip) {
			this.canSkip = canSkip;
		}

		public String getErrMsg() {
			return this.errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}

		public String getBootTime() {
			return this.bootTime;
		}

		public void setBootTime(String bootTime) {
			this.bootTime = bootTime;
		}

		public Integer getDelaySeconds() {
			return this.delaySeconds;
		}

		public void setDelaySeconds(Integer delaySeconds) {
			this.delaySeconds = delaySeconds;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getIgnoreFlag() {
			return this.ignoreFlag;
		}

		public void setIgnoreFlag(String ignoreFlag) {
			this.ignoreFlag = ignoreFlag;
		}

		public String getItem() {
			return this.item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getNames() {
			return this.names;
		}

		public void setNames(String names) {
			this.names = names;
		}

		public Integer getOrderNum() {
			return this.orderNum;
		}

		public void setOrderNum(Integer orderNum) {
			this.orderNum = orderNum;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getSub() {
			return this.sub;
		}

		public void setSub(String sub) {
			this.sub = sub;
		}

		public String getRepairMethod() {
			return this.repairMethod;
		}

		public void setRepairMethod(String repairMethod) {
			this.repairMethod = repairMethod;
		}

		public String getTargetNames() {
			return this.targetNames;
		}

		public void setTargetNames(String targetNames) {
			this.targetNames = targetNames;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getSourceSchema() {
			return this.sourceSchema;
		}

		public void setSourceSchema(String sourceSchema) {
			this.sourceSchema = sourceSchema;
		}

		public String getParentObj() {
			return this.parentObj;
		}

		public void setParentObj(String parentObj) {
			this.parentObj = parentObj;
		}

		public Long getDiffRow() {
			return this.diffRow;
		}

		public void setDiffRow(Long diffRow) {
			this.diffRow = diffRow;
		}

		public String getDestSchema() {
			return this.destSchema;
		}

		public void setDestSchema(String destSchema) {
			this.destSchema = destSchema;
		}

		public String getErrDetail() {
			return this.errDetail;
		}

		public void setErrDetail(String errDetail) {
			this.errDetail = errDetail;
		}

		public String getDdlSql() {
			return this.ddlSql;
		}

		public void setDdlSql(String ddlSql) {
			this.ddlSql = ddlSql;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<JobLog> getLogs() {
			return this.logs;
		}

		public void setLogs(List<JobLog> logs) {
			this.logs = logs;
		}

		public static class JobLog {

			private String errData;

			private String errMsg;

			private String errType;

			private String logLevel;

			public String getErrData() {
				return this.errData;
			}

			public void setErrData(String errData) {
				this.errData = errData;
			}

			public String getErrMsg() {
				return this.errMsg;
			}

			public void setErrMsg(String errMsg) {
				this.errMsg = errMsg;
			}

			public String getErrType() {
				return this.errType;
			}

			public void setErrType(String errType) {
				this.errType = errType;
			}

			public String getLogLevel() {
				return this.logLevel;
			}

			public void setLogLevel(String logLevel) {
				this.logLevel = logLevel;
			}
		}
	}

	public static class SubDistributedJobStatusItem {

		private String state;

		private Integer errorItem;

		private String jobName;

		private String jobId;

		private String code;

		private Integer total;

		private List<ProgressInfo2> jobProgress1;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getErrorItem() {
			return this.errorItem;
		}

		public void setErrorItem(Integer errorItem) {
			this.errorItem = errorItem;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<ProgressInfo2> getJobProgress1() {
			return this.jobProgress1;
		}

		public void setJobProgress1(List<ProgressInfo2> jobProgress1) {
			this.jobProgress1 = jobProgress1;
		}

		public static class ProgressInfo2 {

			private Boolean skip;

			private Boolean canSkip;

			private String errMsg;

			private String bootTime;

			private Integer delaySeconds;

			private String finishTime;

			private String ignoreFlag;

			private String item;

			private String jobId;

			private String names;

			private Integer orderNum;

			private String state;

			private String sub;

			private String repairMethod;

			private String targetNames;

			private Integer total;

			private String sourceSchema;

			private String parentObj;

			private Long diffRow;

			private String destSchema;

			private String errDetail;

			private String ddlSql;

			private String id;

			private List<JobLog4> logs3;

			public Boolean getSkip() {
				return this.skip;
			}

			public void setSkip(Boolean skip) {
				this.skip = skip;
			}

			public Boolean getCanSkip() {
				return this.canSkip;
			}

			public void setCanSkip(Boolean canSkip) {
				this.canSkip = canSkip;
			}

			public String getErrMsg() {
				return this.errMsg;
			}

			public void setErrMsg(String errMsg) {
				this.errMsg = errMsg;
			}

			public String getBootTime() {
				return this.bootTime;
			}

			public void setBootTime(String bootTime) {
				this.bootTime = bootTime;
			}

			public Integer getDelaySeconds() {
				return this.delaySeconds;
			}

			public void setDelaySeconds(Integer delaySeconds) {
				this.delaySeconds = delaySeconds;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public String getIgnoreFlag() {
				return this.ignoreFlag;
			}

			public void setIgnoreFlag(String ignoreFlag) {
				this.ignoreFlag = ignoreFlag;
			}

			public String getItem() {
				return this.item;
			}

			public void setItem(String item) {
				this.item = item;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getNames() {
				return this.names;
			}

			public void setNames(String names) {
				this.names = names;
			}

			public Integer getOrderNum() {
				return this.orderNum;
			}

			public void setOrderNum(Integer orderNum) {
				this.orderNum = orderNum;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getSub() {
				return this.sub;
			}

			public void setSub(String sub) {
				this.sub = sub;
			}

			public String getRepairMethod() {
				return this.repairMethod;
			}

			public void setRepairMethod(String repairMethod) {
				this.repairMethod = repairMethod;
			}

			public String getTargetNames() {
				return this.targetNames;
			}

			public void setTargetNames(String targetNames) {
				this.targetNames = targetNames;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public String getSourceSchema() {
				return this.sourceSchema;
			}

			public void setSourceSchema(String sourceSchema) {
				this.sourceSchema = sourceSchema;
			}

			public String getParentObj() {
				return this.parentObj;
			}

			public void setParentObj(String parentObj) {
				this.parentObj = parentObj;
			}

			public Long getDiffRow() {
				return this.diffRow;
			}

			public void setDiffRow(Long diffRow) {
				this.diffRow = diffRow;
			}

			public String getDestSchema() {
				return this.destSchema;
			}

			public void setDestSchema(String destSchema) {
				this.destSchema = destSchema;
			}

			public String getErrDetail() {
				return this.errDetail;
			}

			public void setErrDetail(String errDetail) {
				this.errDetail = errDetail;
			}

			public String getDdlSql() {
				return this.ddlSql;
			}

			public void setDdlSql(String ddlSql) {
				this.ddlSql = ddlSql;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<JobLog4> getLogs3() {
				return this.logs3;
			}

			public void setLogs3(List<JobLog4> logs3) {
				this.logs3 = logs3;
			}

			public static class JobLog4 {

				private String errData;

				private String errMsg;

				private String errType;

				private String logLevel;

				public String getErrData() {
					return this.errData;
				}

				public void setErrData(String errData) {
					this.errData = errData;
				}

				public String getErrMsg() {
					return this.errMsg;
				}

				public void setErrMsg(String errMsg) {
					this.errMsg = errMsg;
				}

				public String getErrType() {
					return this.errType;
				}

				public void setErrType(String errType) {
					this.errType = errType;
				}

				public String getLogLevel() {
					return this.logLevel;
				}

				public void setLogLevel(String logLevel) {
					this.logLevel = logLevel;
				}
			}
		}
	}

	@Override
	public DescribePreCheckStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribePreCheckStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
