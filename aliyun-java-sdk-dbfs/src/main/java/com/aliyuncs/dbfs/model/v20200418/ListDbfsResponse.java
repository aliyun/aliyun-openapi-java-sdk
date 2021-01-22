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

package com.aliyuncs.dbfs.model.v20200418;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.ListDbfsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDbfsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Info> dBFSInfo;

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

	public List<Info> getDBFSInfo() {
		return this.dBFSInfo;
	}

	public void setDBFSInfo(List<Info> dBFSInfo) {
		this.dBFSInfo = dBFSInfo;
	}

	public static class Info {

		private String fsName;

		private String dBFSClusterId;

		private String category;

		private String status;

		private String regionId;

		private String zoneId;

		private Integer attachNodeNumber;

		private String payType;

		private String fsId;

		private Integer sizeG;

		private String createdTime;

		private String kMSKeyId;

		private Boolean encryption;

		private List<TagList> tags;

		private List<EcsListItem> ecsList;

		public String getFsName() {
			return this.fsName;
		}

		public void setFsName(String fsName) {
			this.fsName = fsName;
		}

		public String getDBFSClusterId() {
			return this.dBFSClusterId;
		}

		public void setDBFSClusterId(String dBFSClusterId) {
			this.dBFSClusterId = dBFSClusterId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getAttachNodeNumber() {
			return this.attachNodeNumber;
		}

		public void setAttachNodeNumber(Integer attachNodeNumber) {
			this.attachNodeNumber = attachNodeNumber;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getFsId() {
			return this.fsId;
		}

		public void setFsId(String fsId) {
			this.fsId = fsId;
		}

		public Integer getSizeG() {
			return this.sizeG;
		}

		public void setSizeG(Integer sizeG) {
			this.sizeG = sizeG;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public Boolean getEncryption() {
			return this.encryption;
		}

		public void setEncryption(Boolean encryption) {
			this.encryption = encryption;
		}

		public List<TagList> getTags() {
			return this.tags;
		}

		public void setTags(List<TagList> tags) {
			this.tags = tags;
		}

		public List<EcsListItem> getEcsList() {
			return this.ecsList;
		}

		public void setEcsList(List<EcsListItem> ecsList) {
			this.ecsList = ecsList;
		}

		public static class TagList {

			private String tagKey;

			private String tagValue;

			private Long id;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}

		public static class EcsListItem {

			private String ecsId;

			public String getEcsId() {
				return this.ecsId;
			}

			public void setEcsId(String ecsId) {
				this.ecsId = ecsId;
			}
		}
	}

	@Override
	public ListDbfsResponse getInstance(UnmarshallerContext context) {
		return	ListDbfsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
