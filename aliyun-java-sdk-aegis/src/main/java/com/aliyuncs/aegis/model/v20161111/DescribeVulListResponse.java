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
import com.aliyuncs.aegis.transform.v20161111.DescribeVulListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulListResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<VulRecord> vulRecords;

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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
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

		private Long primaryId;

		private String uuid;

		private String name;

		private String tag;

		private String aliasName;

		private Long recordId;

		private String type;

		private String level;

		private String product;

		private Long firstTs;

		private Long lastTs;

		private Long repairTs;

		private Integer status;

		private String related;

		private String resultCode;

		private String resultMessage;

		private Long modifyTs;

		private String necessity;

		private ExtendContentJson extendContentJson;

		public Long getPrimaryId() {
			return this.primaryId;
		}

		public void setPrimaryId(Long primaryId) {
			this.primaryId = primaryId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public Long getRecordId() {
			return this.recordId;
		}

		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public Long getFirstTs() {
			return this.firstTs;
		}

		public void setFirstTs(Long firstTs) {
			this.firstTs = firstTs;
		}

		public Long getLastTs() {
			return this.lastTs;
		}

		public void setLastTs(Long lastTs) {
			this.lastTs = lastTs;
		}

		public Long getRepairTs() {
			return this.repairTs;
		}

		public void setRepairTs(Long repairTs) {
			this.repairTs = repairTs;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getRelated() {
			return this.related;
		}

		public void setRelated(String related) {
			this.related = related;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getResultMessage() {
			return this.resultMessage;
		}

		public void setResultMessage(String resultMessage) {
			this.resultMessage = resultMessage;
		}

		public Long getModifyTs() {
			return this.modifyTs;
		}

		public void setModifyTs(Long modifyTs) {
			this.modifyTs = modifyTs;
		}

		public String getNecessity() {
			return this.necessity;
		}

		public void setNecessity(String necessity) {
			this.necessity = necessity;
		}

		public ExtendContentJson getExtendContentJson() {
			return this.extendContentJson;
		}

		public void setExtendContentJson(ExtendContentJson extendContentJson) {
			this.extendContentJson = extendContentJson;
		}

		public static class ExtendContentJson {

			private String os;

			private String osRelease;

			private Integer status;

			private Long lastTs;

			private String aliasName;

			private String tag;

			private Long primaryId;

			private String level;

			private List<RpmEntityListItem> rpmEntityList;

			private List<String> cveList;

			private Necessity necessity;

			public String getOs() {
				return this.os;
			}

			public void setOs(String os) {
				this.os = os;
			}

			public String getOsRelease() {
				return this.osRelease;
			}

			public void setOsRelease(String osRelease) {
				this.osRelease = osRelease;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getLastTs() {
				return this.lastTs;
			}

			public void setLastTs(Long lastTs) {
				this.lastTs = lastTs;
			}

			public String getAliasName() {
				return this.aliasName;
			}

			public void setAliasName(String aliasName) {
				this.aliasName = aliasName;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public Long getPrimaryId() {
				return this.primaryId;
			}

			public void setPrimaryId(Long primaryId) {
				this.primaryId = primaryId;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public List<RpmEntityListItem> getRpmEntityList() {
				return this.rpmEntityList;
			}

			public void setRpmEntityList(List<RpmEntityListItem> rpmEntityList) {
				this.rpmEntityList = rpmEntityList;
			}

			public List<String> getCveList() {
				return this.cveList;
			}

			public void setCveList(List<String> cveList) {
				this.cveList = cveList;
			}

			public Necessity getNecessity() {
				return this.necessity;
			}

			public void setNecessity(Necessity necessity) {
				this.necessity = necessity;
			}

			public static class RpmEntityListItem {

				private String fullVersion;

				private String matchDetail;

				private String name;

				private String path;

				private String updateCmd;

				private String version;

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

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

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

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}
			}

			public static class Necessity {

				private String cvss_factor;

				private String gmt_create;

				private String status;

				private String enviroment_factor;

				private String assets_factor;

				private String is_calc;

				private String total_score;

				private String time_factor;

				public String getCvss_factor() {
					return this.cvss_factor;
				}

				public void setCvss_factor(String cvss_factor) {
					this.cvss_factor = cvss_factor;
				}

				public String getGmt_create() {
					return this.gmt_create;
				}

				public void setGmt_create(String gmt_create) {
					this.gmt_create = gmt_create;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getEnviroment_factor() {
					return this.enviroment_factor;
				}

				public void setEnviroment_factor(String enviroment_factor) {
					this.enviroment_factor = enviroment_factor;
				}

				public String getAssets_factor() {
					return this.assets_factor;
				}

				public void setAssets_factor(String assets_factor) {
					this.assets_factor = assets_factor;
				}

				public String getIs_calc() {
					return this.is_calc;
				}

				public void setIs_calc(String is_calc) {
					this.is_calc = is_calc;
				}

				public String getTotal_score() {
					return this.total_score;
				}

				public void setTotal_score(String total_score) {
					this.total_score = total_score;
				}

				public String getTime_factor() {
					return this.time_factor;
				}

				public void setTime_factor(String time_factor) {
					this.time_factor = time_factor;
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
