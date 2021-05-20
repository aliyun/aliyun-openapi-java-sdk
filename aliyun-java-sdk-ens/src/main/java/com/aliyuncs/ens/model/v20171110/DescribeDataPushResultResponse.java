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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeDataPushResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataPushResultResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<PushResult> pushResults;

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

	public List<PushResult> getPushResults() {
		return this.pushResults;
	}

	public void setPushResults(List<PushResult> pushResults) {
		this.pushResults = pushResults;
	}

	public static class PushResult {

		private String name;

		private String version;

		private List<StatusStat> statusStatS;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<StatusStat> getStatusStatS() {
			return this.statusStatS;
		}

		public void setStatusStatS(List<StatusStat> statusStatS) {
			this.statusStatS = statusStatS;
		}

		public static class StatusStat {

			private Integer regionIdCount;

			private String status;

			private List<RegionId> regionIds;

			public Integer getRegionIdCount() {
				return this.regionIdCount;
			}

			public void setRegionIdCount(Integer regionIdCount) {
				this.regionIdCount = regionIdCount;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<RegionId> getRegionIds() {
				return this.regionIds;
			}

			public void setRegionIds(List<RegionId> regionIds) {
				this.regionIds = regionIds;
			}

			public static class RegionId {

				private String regionId;

				private String startTime;

				private String statusDescrip;

				private String updateTime;

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getStatusDescrip() {
					return this.statusDescrip;
				}

				public void setStatusDescrip(String statusDescrip) {
					this.statusDescrip = statusDescrip;
				}

				public String getUpdateTime() {
					return this.updateTime;
				}

				public void setUpdateTime(String updateTime) {
					this.updateTime = updateTime;
				}
			}
		}
	}

	@Override
	public DescribeDataPushResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataPushResultResponseUnmarshaller.unmarshall(this, context);
	}
}
