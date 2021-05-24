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
import com.aliyuncs.dts.transform.v20200101.DescribeJobDiffStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobDiffStatusResponse extends AcsResponse {

	private String dynamicCode;

	private String dynamicMessage;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private Long total;

	private List<DiffInfosItem> diffInfos;

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<DiffInfosItem> getDiffInfos() {
		return this.diffInfos;
	}

	public void setDiffInfos(List<DiffInfosItem> diffInfos) {
		this.diffInfos = diffInfos;
	}

	public static class DiffInfosItem {

		private String scheduleJobId;

		private String dbName;

		private String tableName;

		private String pkName;

		private String pkValue;

		private String diff;

		public String getScheduleJobId() {
			return this.scheduleJobId;
		}

		public void setScheduleJobId(String scheduleJobId) {
			this.scheduleJobId = scheduleJobId;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getPkName() {
			return this.pkName;
		}

		public void setPkName(String pkName) {
			this.pkName = pkName;
		}

		public String getPkValue() {
			return this.pkValue;
		}

		public void setPkValue(String pkValue) {
			this.pkValue = pkValue;
		}

		public String getDiff() {
			return this.diff;
		}

		public void setDiff(String diff) {
			this.diff = diff;
		}
	}

	@Override
	public DescribeJobDiffStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeJobDiffStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
