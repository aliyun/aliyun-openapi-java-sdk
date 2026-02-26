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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeCustomBlockRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomBlockRecordsResponse extends AcsResponse {

	private String requestId;

	private List<CustomRecord> recordList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CustomRecord> getRecordList() {
		return this.recordList;
	}

	public void setRecordList(List<CustomRecord> recordList) {
		this.recordList = recordList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class CustomRecord {

		private Integer status;

		private Long blockExpireDate;

		private Integer enableCount;

		private Integer serverCount;

		private String blockIp;

		private String bound;

		private String source;

		private Long id;

		private List<Target> targetList;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getBlockExpireDate() {
			return this.blockExpireDate;
		}

		public void setBlockExpireDate(Long blockExpireDate) {
			this.blockExpireDate = blockExpireDate;
		}

		public Integer getEnableCount() {
			return this.enableCount;
		}

		public void setEnableCount(Integer enableCount) {
			this.enableCount = enableCount;
		}

		public Integer getServerCount() {
			return this.serverCount;
		}

		public void setServerCount(Integer serverCount) {
			this.serverCount = serverCount;
		}

		public String getBlockIp() {
			return this.blockIp;
		}

		public void setBlockIp(String blockIp) {
			this.blockIp = blockIp;
		}

		public String getBound() {
			return this.bound;
		}

		public void setBound(String bound) {
			this.bound = bound;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<Target> getTargetList() {
			return this.targetList;
		}

		public void setTargetList(List<Target> targetList) {
			this.targetList = targetList;
		}

		public static class Target {

			private String target;

			private String targetType;

			private String targetResult;

			private String successInfo;

			private Integer status;

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public String getTargetResult() {
				return this.targetResult;
			}

			public void setTargetResult(String targetResult) {
				this.targetResult = targetResult;
			}

			public String getSuccessInfo() {
				return this.successInfo;
			}

			public void setSuccessInfo(String successInfo) {
				this.successInfo = successInfo;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeCustomBlockRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomBlockRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
