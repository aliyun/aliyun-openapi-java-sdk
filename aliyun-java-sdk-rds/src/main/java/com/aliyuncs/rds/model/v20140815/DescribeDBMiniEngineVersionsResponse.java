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
import com.aliyuncs.rds.transform.v20140815.DescribeDBMiniEngineVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBMiniEngineVersionsResponse extends AcsResponse {

	private String dBInstanceId;

	private String requestId;

	private Integer totalCount;

	private Integer pageNumbers;

	private Integer maxRecordsPerPage;

	private List<MinorVersionItemsItem> minorVersionItems;

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

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

	public Integer getPageNumbers() {
		return this.pageNumbers;
	}

	public void setPageNumbers(Integer pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	public Integer getMaxRecordsPerPage() {
		return this.maxRecordsPerPage;
	}

	public void setMaxRecordsPerPage(Integer maxRecordsPerPage) {
		this.maxRecordsPerPage = maxRecordsPerPage;
	}

	public List<MinorVersionItemsItem> getMinorVersionItems() {
		return this.minorVersionItems;
	}

	public void setMinorVersionItems(List<MinorVersionItemsItem> minorVersionItems) {
		this.minorVersionItems = minorVersionItems;
	}

	public static class MinorVersionItemsItem {

		private String releaseNote;

		private String nodeType;

		private Boolean isHotfixVersion;

		private String engine;

		private String releaseType;

		private String statusDesc;

		private String engineVersion;

		private String minorVersion;

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public Boolean getIsHotfixVersion() {
			return this.isHotfixVersion;
		}

		public void setIsHotfixVersion(Boolean isHotfixVersion) {
			this.isHotfixVersion = isHotfixVersion;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getReleaseType() {
			return this.releaseType;
		}

		public void setReleaseType(String releaseType) {
			this.releaseType = releaseType;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}
	}

	@Override
	public DescribeDBMiniEngineVersionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBMiniEngineVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
