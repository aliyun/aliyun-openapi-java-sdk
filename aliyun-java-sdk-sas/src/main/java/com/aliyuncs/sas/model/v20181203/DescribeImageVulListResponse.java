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
import com.aliyuncs.sas.transform.v20181203.DescribeImageVulListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageVulListResponse extends AcsResponse {

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

		private Boolean canUpdate;

		private String type;

		private Integer status;

		private Long modifyTs;

		private Integer progress;

		private String imageDigest;

		private Long primaryId;

		private String tag;

		private String repoNamespace;

		private String repoName;

		private String related;

		private Long firstTs;

		private Long lastTs;

		private String necessity;

		private String uuid;

		private String aliasName;

		private String name;

		private String level;

		private String canFix;

		private List<String> layers;

		private ExtendContentJson extendContentJson;

		public Boolean getCanUpdate() {
			return this.canUpdate;
		}

		public void setCanUpdate(Boolean canUpdate) {
			this.canUpdate = canUpdate;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getModifyTs() {
			return this.modifyTs;
		}

		public void setModifyTs(Long modifyTs) {
			this.modifyTs = modifyTs;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getImageDigest() {
			return this.imageDigest;
		}

		public void setImageDigest(String imageDigest) {
			this.imageDigest = imageDigest;
		}

		public Long getPrimaryId() {
			return this.primaryId;
		}

		public void setPrimaryId(Long primaryId) {
			this.primaryId = primaryId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getRepoNamespace() {
			return this.repoNamespace;
		}

		public void setRepoNamespace(String repoNamespace) {
			this.repoNamespace = repoNamespace;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getRelated() {
			return this.related;
		}

		public void setRelated(String related) {
			this.related = related;
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

		public String getNecessity() {
			return this.necessity;
		}

		public void setNecessity(String necessity) {
			this.necessity = necessity;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
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

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getCanFix() {
			return this.canFix;
		}

		public void setCanFix(String canFix) {
			this.canFix = canFix;
		}

		public List<String> getLayers() {
			return this.layers;
		}

		public void setLayers(List<String> layers) {
			this.layers = layers;
		}

		public ExtendContentJson getExtendContentJson() {
			return this.extendContentJson;
		}

		public void setExtendContentJson(ExtendContentJson extendContentJson) {
			this.extendContentJson = extendContentJson;
		}

		public static class ExtendContentJson {

			private String osRelease;

			private String os;

			private List<RpmEntity> rpmEntityList;

			public String getOsRelease() {
				return this.osRelease;
			}

			public void setOsRelease(String osRelease) {
				this.osRelease = osRelease;
			}

			public String getOs() {
				return this.os;
			}

			public void setOs(String os) {
				this.os = os;
			}

			public List<RpmEntity> getRpmEntityList() {
				return this.rpmEntityList;
			}

			public void setRpmEntityList(List<RpmEntity> rpmEntityList) {
				this.rpmEntityList = rpmEntityList;
			}

			public static class RpmEntity {

				private String layer;

				private String fullVersion;

				private String version;

				private String matchDetail;

				private String path;

				private String name;

				private String updateCmd;

				private List<String> matchList;

				public String getLayer() {
					return this.layer;
				}

				public void setLayer(String layer) {
					this.layer = layer;
				}

				public String getFullVersion() {
					return this.fullVersion;
				}

				public void setFullVersion(String fullVersion) {
					this.fullVersion = fullVersion;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public String getMatchDetail() {
					return this.matchDetail;
				}

				public void setMatchDetail(String matchDetail) {
					this.matchDetail = matchDetail;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getUpdateCmd() {
					return this.updateCmd;
				}

				public void setUpdateCmd(String updateCmd) {
					this.updateCmd = updateCmd;
				}

				public List<String> getMatchList() {
					return this.matchList;
				}

				public void setMatchList(List<String> matchList) {
					this.matchList = matchList;
				}
			}
		}
	}

	@Override
	public DescribeImageVulListResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageVulListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
