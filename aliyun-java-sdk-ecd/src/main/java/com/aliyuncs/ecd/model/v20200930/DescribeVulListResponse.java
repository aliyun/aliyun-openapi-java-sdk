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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeVulListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulListResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<VulRecord> vulRecords;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<VulRecord> getVulRecords() {
		return this.vulRecords;
	}

	public void setVulRecords(List<VulRecord> vulRecords) {
		this.vulRecords = vulRecords;
	}

	public static class VulRecord {

		private Integer status;

		private String type;

		private Long modifyTs;

		private String desktopName;

		private String resultCode;

		private String tag;

		private String desktopId;

		private String related;

		private Long lastTs;

		private Long firstTs;

		private String necessity;

		private Long repairTs;

		private Boolean online;

		private String resultMessage;

		private String osVersion;

		private String aliasName;

		private String name;

		private ExtendContentJson extendContentJson;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getModifyTs() {
			return this.modifyTs;
		}

		public void setModifyTs(Long modifyTs) {
			this.modifyTs = modifyTs;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getRelated() {
			return this.related;
		}

		public void setRelated(String related) {
			this.related = related;
		}

		public Long getLastTs() {
			return this.lastTs;
		}

		public void setLastTs(Long lastTs) {
			this.lastTs = lastTs;
		}

		public Long getFirstTs() {
			return this.firstTs;
		}

		public void setFirstTs(Long firstTs) {
			this.firstTs = firstTs;
		}

		public String getNecessity() {
			return this.necessity;
		}

		public void setNecessity(String necessity) {
			this.necessity = necessity;
		}

		public Long getRepairTs() {
			return this.repairTs;
		}

		public void setRepairTs(Long repairTs) {
			this.repairTs = repairTs;
		}

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public String getResultMessage() {
			return this.resultMessage;
		}

		public void setResultMessage(String resultMessage) {
			this.resultMessage = resultMessage;
		}

		public String getOsVersion() {
			return this.osVersion;
		}

		public void setOsVersion(String osVersion) {
			this.osVersion = osVersion;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ExtendContentJson getExtendContentJson() {
			return this.extendContentJson;
		}

		public void setExtendContentJson(ExtendContentJson extendContentJson) {
			this.extendContentJson = extendContentJson;
		}

		public static class ExtendContentJson {

			private List<RpmEntity> rpmEntityList;

			public List<RpmEntity> getRpmEntityList() {
				return this.rpmEntityList;
			}

			public void setRpmEntityList(List<RpmEntity> rpmEntityList) {
				this.rpmEntityList = rpmEntityList;
			}

			public static class RpmEntity {

				private String path;

				private String updateCmd;

				private String name;

				private String fullVersion;

				private String matchDetail;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getUpdateCmd() {
					return this.updateCmd;
				}

				public void setUpdateCmd(String updateCmd) {
					this.updateCmd = updateCmd;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getFullVersion() {
					return this.fullVersion;
				}

				public void setFullVersion(String fullVersion) {
					this.fullVersion = fullVersion;
				}

				public String getMatchDetail() {
					return this.matchDetail;
				}

				public void setMatchDetail(String matchDetail) {
					this.matchDetail = matchDetail;
				}
			}
		}
	}

	@Override
	public DescribeVulListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
