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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeLogItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogItemsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer crackTotalCount;

	private Integer setPageSize;

	private Integer processOffset;

	private Integer networkOffset;

	private Integer portSnapshotOffset;

	private Integer processSnapshotTotalCount;

	private Integer crackOffset;

	private Integer networkTotalCount;

	private Integer portSnapshotTotalCount;

	private Integer processSnapshotOffset;

	private Integer processTotalCount;

	private Integer loginTotalCount;

	private Integer currentPage;

	private Integer accountSnapshotOffset;

	private Integer accountSnapshotTotalCount;

	private List<LogsListItem> logsList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCrackTotalCount() {
		return this.crackTotalCount;
	}

	public void setCrackTotalCount(Integer crackTotalCount) {
		this.crackTotalCount = crackTotalCount;
	}

	public Integer getSetPageSize() {
		return this.setPageSize;
	}

	public void setSetPageSize(Integer setPageSize) {
		this.setPageSize = setPageSize;
	}

	public Integer getProcessOffset() {
		return this.processOffset;
	}

	public void setProcessOffset(Integer processOffset) {
		this.processOffset = processOffset;
	}

	public Integer getNetworkOffset() {
		return this.networkOffset;
	}

	public void setNetworkOffset(Integer networkOffset) {
		this.networkOffset = networkOffset;
	}

	public Integer getPortSnapshotOffset() {
		return this.portSnapshotOffset;
	}

	public void setPortSnapshotOffset(Integer portSnapshotOffset) {
		this.portSnapshotOffset = portSnapshotOffset;
	}

	public Integer getProcessSnapshotTotalCount() {
		return this.processSnapshotTotalCount;
	}

	public void setProcessSnapshotTotalCount(Integer processSnapshotTotalCount) {
		this.processSnapshotTotalCount = processSnapshotTotalCount;
	}

	public Integer getCrackOffset() {
		return this.crackOffset;
	}

	public void setCrackOffset(Integer crackOffset) {
		this.crackOffset = crackOffset;
	}

	public Integer getNetworkTotalCount() {
		return this.networkTotalCount;
	}

	public void setNetworkTotalCount(Integer networkTotalCount) {
		this.networkTotalCount = networkTotalCount;
	}

	public Integer getPortSnapshotTotalCount() {
		return this.portSnapshotTotalCount;
	}

	public void setPortSnapshotTotalCount(Integer portSnapshotTotalCount) {
		this.portSnapshotTotalCount = portSnapshotTotalCount;
	}

	public Integer getProcessSnapshotOffset() {
		return this.processSnapshotOffset;
	}

	public void setProcessSnapshotOffset(Integer processSnapshotOffset) {
		this.processSnapshotOffset = processSnapshotOffset;
	}

	public Integer getProcessTotalCount() {
		return this.processTotalCount;
	}

	public void setProcessTotalCount(Integer processTotalCount) {
		this.processTotalCount = processTotalCount;
	}

	public Integer getLoginTotalCount() {
		return this.loginTotalCount;
	}

	public void setLoginTotalCount(Integer loginTotalCount) {
		this.loginTotalCount = loginTotalCount;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getAccountSnapshotOffset() {
		return this.accountSnapshotOffset;
	}

	public void setAccountSnapshotOffset(Integer accountSnapshotOffset) {
		this.accountSnapshotOffset = accountSnapshotOffset;
	}

	public Integer getAccountSnapshotTotalCount() {
		return this.accountSnapshotTotalCount;
	}

	public void setAccountSnapshotTotalCount(Integer accountSnapshotTotalCount) {
		this.accountSnapshotTotalCount = accountSnapshotTotalCount;
	}

	public List<LogsListItem> getLogsList() {
		return this.logsList;
	}

	public void setLogsList(List<LogsListItem> logsList) {
		this.logsList = logsList;
	}

	public static class LogsListItem {

		private String mLogTime;

		private String logSourceId;

		private String logSource;

		private List<MContentsItem> mContents;

		public String getMLogTime() {
			return this.mLogTime;
		}

		public void setMLogTime(String mLogTime) {
			this.mLogTime = mLogTime;
		}

		public String getLogSourceId() {
			return this.logSourceId;
		}

		public void setLogSourceId(String logSourceId) {
			this.logSourceId = logSourceId;
		}

		public String getLogSource() {
			return this.logSource;
		}

		public void setLogSource(String logSource) {
			this.logSource = logSource;
		}

		public List<MContentsItem> getMContents() {
			return this.mContents;
		}

		public void setMContents(List<MContentsItem> mContents) {
			this.mContents = mContents;
		}

		public static class MContentsItem {

			private String mKey;

			private String mValue;

			public String getMKey() {
				return this.mKey;
			}

			public void setMKey(String mKey) {
				this.mKey = mKey;
			}

			public String getMValue() {
				return this.mValue;
			}

			public void setMValue(String mValue) {
				this.mValue = mValue;
			}
		}
	}

	@Override
	public DescribeLogItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
