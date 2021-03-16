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
import com.aliyuncs.ens.transform.v20171110.DescribeAvailableResourceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableResourceInfoResponse extends AcsResponse {

	private String requestId;

	private List<SupportResource> supportResources;

	private List<Image> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SupportResource> getSupportResources() {
		return this.supportResources;
	}

	public void setSupportResources(List<SupportResource> supportResources) {
		this.supportResources = supportResources;
	}

	public List<Image> getImages() {
		return this.images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public static class SupportResource {

		private Integer dataDiskMinSize;

		private Integer systemDiskMinSize;

		private Integer systemDiskMaxSize;

		private Integer dataDiskMaxSize;

		private List<EnsRegionId> ensRegionIdsExtends;

		private List<String> instanceSpeces;

		private List<String> bandwidthTypes;

		private List<String> ensRegionIds;

		public Integer getDataDiskMinSize() {
			return this.dataDiskMinSize;
		}

		public void setDataDiskMinSize(Integer dataDiskMinSize) {
			this.dataDiskMinSize = dataDiskMinSize;
		}

		public Integer getSystemDiskMinSize() {
			return this.systemDiskMinSize;
		}

		public void setSystemDiskMinSize(Integer systemDiskMinSize) {
			this.systemDiskMinSize = systemDiskMinSize;
		}

		public Integer getSystemDiskMaxSize() {
			return this.systemDiskMaxSize;
		}

		public void setSystemDiskMaxSize(Integer systemDiskMaxSize) {
			this.systemDiskMaxSize = systemDiskMaxSize;
		}

		public Integer getDataDiskMaxSize() {
			return this.dataDiskMaxSize;
		}

		public void setDataDiskMaxSize(Integer dataDiskMaxSize) {
			this.dataDiskMaxSize = dataDiskMaxSize;
		}

		public List<EnsRegionId> getEnsRegionIdsExtends() {
			return this.ensRegionIdsExtends;
		}

		public void setEnsRegionIdsExtends(List<EnsRegionId> ensRegionIdsExtends) {
			this.ensRegionIdsExtends = ensRegionIdsExtends;
		}

		public List<String> getInstanceSpeces() {
			return this.instanceSpeces;
		}

		public void setInstanceSpeces(List<String> instanceSpeces) {
			this.instanceSpeces = instanceSpeces;
		}

		public List<String> getBandwidthTypes() {
			return this.bandwidthTypes;
		}

		public void setBandwidthTypes(List<String> bandwidthTypes) {
			this.bandwidthTypes = bandwidthTypes;
		}

		public List<String> getEnsRegionIds() {
			return this.ensRegionIds;
		}

		public void setEnsRegionIds(List<String> ensRegionIds) {
			this.ensRegionIds = ensRegionIds;
		}

		public static class EnsRegionId {

			private String area;

			private String enName;

			private String ensRegionId;

			private String province;

			private String name;

			public String getArea() {
				return this.area;
			}

			public void setArea(String area) {
				this.area = area;
			}

			public String getEnName() {
				return this.enName;
			}

			public void setEnName(String enName) {
				this.enName = enName;
			}

			public String getEnsRegionId() {
				return this.ensRegionId;
			}

			public void setEnsRegionId(String ensRegionId) {
				this.ensRegionId = ensRegionId;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	public static class Image {

		private String imageName;

		private Integer imageSize;

		private String imageId;

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public Integer getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(Integer imageSize) {
			this.imageSize = imageSize;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}
	}

	@Override
	public DescribeAvailableResourceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableResourceInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
