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
import com.aliyuncs.ens.transform.v20171110.DescribeReservedResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReservedResourceResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private List<SupportResource> supportResources;

	private List<Image> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

		private String instanceSpec;

		private String supportResourcesCount;

		private String ensRegionId;

		private List<String> systemDiskSizes;

		private List<String> dataDiskSizes;

		public String getInstanceSpec() {
			return this.instanceSpec;
		}

		public void setInstanceSpec(String instanceSpec) {
			this.instanceSpec = instanceSpec;
		}

		public String getSupportResourcesCount() {
			return this.supportResourcesCount;
		}

		public void setSupportResourcesCount(String supportResourcesCount) {
			this.supportResourcesCount = supportResourcesCount;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public List<String> getSystemDiskSizes() {
			return this.systemDiskSizes;
		}

		public void setSystemDiskSizes(List<String> systemDiskSizes) {
			this.systemDiskSizes = systemDiskSizes;
		}

		public List<String> getDataDiskSizes() {
			return this.dataDiskSizes;
		}

		public void setDataDiskSizes(List<String> dataDiskSizes) {
			this.dataDiskSizes = dataDiskSizes;
		}
	}

	public static class Image {

		private String imageName;

		private String imageId;

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}
	}

	@Override
	public DescribeReservedResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeReservedResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
