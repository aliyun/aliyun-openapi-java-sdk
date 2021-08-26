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

		private String imageId;

		private String bundleId;

		private String bundleType;

		private String bundleName;

		private String description;

		private String desktopType;

		private String osType;

		private String stockState;

		private String protocolType;

		private String language;

		private List<Disk> disks;

		private DesktopTypeAttribute desktopTypeAttribute;

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getBundleId() {
			return this.bundleId;
		}

		public void setBundleId(String bundleId) {
			this.bundleId = bundleId;
		}

		public String getBundleType() {
			return this.bundleType;
		}

		public void setBundleType(String bundleType) {
			this.bundleType = bundleType;
		}

		public String getBundleName() {
			return this.bundleName;
		}

		public void setBundleName(String bundleName) {
			this.bundleName = bundleName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDesktopType() {
			return this.desktopType;
		}

		public void setDesktopType(String desktopType) {
			this.desktopType = desktopType;
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

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
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

			private Integer diskSize;

			private String diskType;

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}
		}

		public static class DesktopTypeAttribute {

			private Integer cpuCount;

			private Integer memorySize;

			private Float gpuCount;

			private String gpuSpec;

			public Integer getCpuCount() {
				return this.cpuCount;
			}

			public void setCpuCount(Integer cpuCount) {
				this.cpuCount = cpuCount;
			}

			public Integer getMemorySize() {
				return this.memorySize;
			}

			public void setMemorySize(Integer memorySize) {
				this.memorySize = memorySize;
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
