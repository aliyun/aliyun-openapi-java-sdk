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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryFpImportResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFpImportResultResponse extends AcsResponse {

	private String requestId;

	private Long logCount;

	private List<FpResultLogInfo> fpResultLogInfoList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getLogCount() {
		return this.logCount;
	}

	public void setLogCount(Long logCount) {
		this.logCount = logCount;
	}

	public List<FpResultLogInfo> getFpResultLogInfoList() {
		return this.fpResultLogInfoList;
	}

	public void setFpResultLogInfoList(List<FpResultLogInfo> fpResultLogInfoList) {
		this.fpResultLogInfoList = fpResultLogInfoList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class FpResultLogInfo {

		private Long logStartTime;

		private String logPath;

		private Long createTime;

		private Long logSize;

		private String logName;

		private Long logEndTime;

		public Long getLogStartTime() {
			return this.logStartTime;
		}

		public void setLogStartTime(Long logStartTime) {
			this.logStartTime = logStartTime;
		}

		public String getLogPath() {
			return this.logPath;
		}

		public void setLogPath(String logPath) {
			this.logPath = logPath;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getLogSize() {
			return this.logSize;
		}

		public void setLogSize(Long logSize) {
			this.logSize = logSize;
		}

		public String getLogName() {
			return this.logName;
		}

		public void setLogName(String logName) {
			this.logName = logName;
		}

		public Long getLogEndTime() {
			return this.logEndTime;
		}

		public void setLogEndTime(Long logEndTime) {
			this.logEndTime = logEndTime;
		}
	}

	public static class PageInfo {

		private Long pageIndex;

		private Long pageSize;

		private Long total;

		public Long getPageIndex() {
			return this.pageIndex;
		}

		public void setPageIndex(Long pageIndex) {
			this.pageIndex = pageIndex;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}
	}

	@Override
	public QueryFpImportResultResponse getInstance(UnmarshallerContext context) {
		return	QueryFpImportResultResponseUnmarshaller.unmarshall(this, context);
	}
}
