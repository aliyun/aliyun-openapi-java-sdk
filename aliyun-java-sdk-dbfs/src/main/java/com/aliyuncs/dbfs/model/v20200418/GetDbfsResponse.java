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
import com.aliyuncs.dbfs.transform.v20200418.GetDbfsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDbfsResponse extends AcsResponse {

	private String requestId;

	private DBFSInfo dBFSInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DBFSInfo getDBFSInfo() {
		return this.dBFSInfo;
	}

	public void setDBFSInfo(DBFSInfo dBFSInfo) {
		this.dBFSInfo = dBFSInfo;
	}

	public static class DBFSInfo {

		private String status;

		private String payType;

		private String fsId;

		private Integer sizeG;

		private String regionId;

		private String dBFSClusterId;

		private String description;

		private String zoneId;

		private String fsName;

		private String category;

		private String createdTime;

		private Integer attachNodeNumber;

		private String kMSKeyId;

		private Boolean encryption;

		private String performanceLevel;

		private String usedScene;

		private String lastMountTime;

		private String lastUmountTime;

		private Boolean enableRaid;

		private Integer raidStrip;

		private List<TagList> tags;

		private List<EcsListItem> ecsList;

		private List<EbsListItem> ebsList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDBFSClusterId() {
			return this.dBFSClusterId;
		}

		public void setDBFSClusterId(String dBFSClusterId) {
			this.dBFSClusterId = dBFSClusterId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getFsName() {
			return this.fsName;
		}

		public void setFsName(String fsName) {
			this.fsName = fsName;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public Integer getAttachNodeNumber() {
			return this.attachNodeNumber;
		}

		public void setAttachNodeNumber(Integer attachNodeNumber) {
			this.attachNodeNumber = attachNodeNumber;
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

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getUsedScene() {
			return this.usedScene;
		}

		public void setUsedScene(String usedScene) {
			this.usedScene = usedScene;
		}

		public String getLastMountTime() {
			return this.lastMountTime;
		}

		public void setLastMountTime(String lastMountTime) {
			this.lastMountTime = lastMountTime;
		}

		public String getLastUmountTime() {
			return this.lastUmountTime;
		}

		public void setLastUmountTime(String lastUmountTime) {
			this.lastUmountTime = lastUmountTime;
		}

		public Boolean getEnableRaid() {
			return this.enableRaid;
		}

		public void setEnableRaid(Boolean enableRaid) {
			this.enableRaid = enableRaid;
		}

		public Integer getRaidStrip() {
			return this.raidStrip;
		}

		public void setRaidStrip(Integer raidStrip) {
			this.raidStrip = raidStrip;
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

		public List<EbsListItem> getEbsList() {
			return this.ebsList;
		}

		public void setEbsList(List<EbsListItem> ebsList) {
			this.ebsList = ebsList;
		}

		public static class TagList {

			private String tagValue;

			private Integer id;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
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

		public static class EbsListItem {

			private String ebsId;

			private Integer sizeG;

			public String getEbsId() {
				return this.ebsId;
			}

			public void setEbsId(String ebsId) {
				this.ebsId = ebsId;
			}

			public Integer getSizeG() {
				return this.sizeG;
			}

			public void setSizeG(Integer sizeG) {
				this.sizeG = sizeG;
			}
		}
	}

	@Override
	public GetDbfsResponse getInstance(UnmarshallerContext context) {
		return	GetDbfsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
