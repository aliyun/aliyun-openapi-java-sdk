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
import com.aliyuncs.ecd.transform.v20200930.DescribeBundlesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBundlesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<Bundle> bundles;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Bundle> getBundles() {
		return this.bundles;
	}

	public void setBundles(List<Bundle> bundles) {
		this.bundles = bundles;
	}

	public static class Bundle {

		private String description;

		private String bundleType;

		private String osType;

		private String stockState;

		private String desktopType;

		private String protocolType;

		private String bundleId;

		private String imageId;

		private String imageName;

		private String language;

		private String bundleName;

		private String desktopTypeFamily;

		private String creationTime;

		private String sessionType;

		private Boolean volumeEncryptionEnabled;

		private String volumeEncryptionKey;

		private List<Disk> disks;

		private DesktopTypeAttribute desktopTypeAttribute;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBundleType() {
			return this.bundleType;
		}

		public void setBundleType(String bundleType) {
			this.bundleType = bundleType;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getStockState() {
			return this.stockState;
		}

		public void setStockState(String stockState) {
			this.stockState = stockState;
		}

		public String getDesktopType() {
			return this.desktopType;
		}

		public void setDesktopType(String desktopType) {
			this.desktopType = desktopType;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getBundleId() {
			return this.bundleId;
		}

		public void setBundleId(String bundleId) {
			this.bundleId = bundleId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getBundleName() {
			return this.bundleName;
		}

		public void setBundleName(String bundleName) {
			this.bundleName = bundleName;
		}

		public String getDesktopTypeFamily() {
			return this.desktopTypeFamily;
		}

		public void setDesktopTypeFamily(String desktopTypeFamily) {
			this.desktopTypeFamily = desktopTypeFamily;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getSessionType() {
			return this.sessionType;
		}

		public void setSessionType(String sessionType) {
			this.sessionType = sessionType;
		}

		public Boolean getVolumeEncryptionEnabled() {
			return this.volumeEncryptionEnabled;
		}

		public void setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
			this.volumeEncryptionEnabled = volumeEncryptionEnabled;
		}

		public String getVolumeEncryptionKey() {
			return this.volumeEncryptionKey;
		}

		public void setVolumeEncryptionKey(String volumeEncryptionKey) {
			this.volumeEncryptionKey = volumeEncryptionKey;
		}

		public List<Disk> getDisks() {
			return this.disks;
		}

		public void setDisks(List<Disk> disks) {
			this.disks = disks;
		}

		public DesktopTypeAttribute getDesktopTypeAttribute() {
			return this.desktopTypeAttribute;
		}

		public void setDesktopTypeAttribute(DesktopTypeAttribute desktopTypeAttribute) {
			this.desktopTypeAttribute = desktopTypeAttribute;
		}

		public static class Disk {

			private String diskType;

			private Integer diskSize;

			private String diskPerformanceLevel;

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public String getDiskPerformanceLevel() {
				return this.diskPerformanceLevel;
			}

			public void setDiskPerformanceLevel(String diskPerformanceLevel) {
				this.diskPerformanceLevel = diskPerformanceLevel;
			}
		}

		public static class DesktopTypeAttribute {

			private Integer cpuCount;

			private Float gpuCount;

			private String gpuSpec;

			private Integer memorySize;

			public Integer getCpuCount() {
				return this.cpuCount;
			}

			public void setCpuCount(Integer cpuCount) {
				this.cpuCount = cpuCount;
			}

			public Float getGpuCount() {
				return this.gpuCount;
			}

			public void setGpuCount(Float gpuCount) {
				this.gpuCount = gpuCount;
			}

			public String getGpuSpec() {
				return this.gpuSpec;
			}

			public void setGpuSpec(String gpuSpec) {
				this.gpuSpec = gpuSpec;
			}

			public Integer getMemorySize() {
				return this.memorySize;
			}

			public void setMemorySize(Integer memorySize) {
				this.memorySize = memorySize;
			}
		}
	}

	@Override
	public DescribeBundlesResponse getInstance(UnmarshallerContext context) {
		return	DescribeBundlesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
