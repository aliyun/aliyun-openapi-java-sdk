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
import com.aliyuncs.rds.transform.v20140815.DescribeRCImageListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCImageListResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String regionId;

	private List<Image> images;

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

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<Image> getImages() {
		return this.images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public static class Image {

		private String architecture;

		private String creationTime;

		private String description;

		private String imageId;

		private String imageName;

		private String imageVersion;

		private Boolean isPublic;

		private String oSName;

		private String oSNameEn;

		private String oSType;

		private Long size;

		private String status;

		private String usage;

		private Boolean isSupportRdsCustom;

		private String platform;

		private List<DiskDeviceMapping> diskDeviceMappings;

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public Boolean getIsPublic() {
			return this.isPublic;
		}

		public void setIsPublic(Boolean isPublic) {
			this.isPublic = isPublic;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public String getOSNameEn() {
			return this.oSNameEn;
		}

		public void setOSNameEn(String oSNameEn) {
			this.oSNameEn = oSNameEn;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public Boolean getIsSupportRdsCustom() {
			return this.isSupportRdsCustom;
		}

		public void setIsSupportRdsCustom(Boolean isSupportRdsCustom) {
			this.isSupportRdsCustom = isSupportRdsCustom;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public List<DiskDeviceMapping> getDiskDeviceMappings() {
			return this.diskDeviceMappings;
		}

		public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
			this.diskDeviceMappings = diskDeviceMappings;
		}

		public static class DiskDeviceMapping {

			private String type;

			private String device;

			private String size;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}
		}
	}

	@Override
	public DescribeRCImageListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCImageListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
