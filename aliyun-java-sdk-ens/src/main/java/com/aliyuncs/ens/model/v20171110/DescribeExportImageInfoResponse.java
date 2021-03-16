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
import com.aliyuncs.ens.transform.v20171110.DescribeExportImageInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExportImageInfoResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Image> images;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Image> getImages() {
		return this.images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public static class Image {

		private String imageOwnerAlias;

		private String imageName;

		private String platform;

		private String architecture;

		private String exportedImageURL;

		private String imageId;

		private String creationTime;

		private String imageExportStatus;

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
		}

		public String getExportedImageURL() {
			return this.exportedImageURL;
		}

		public void setExportedImageURL(String exportedImageURL) {
			this.exportedImageURL = exportedImageURL;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getImageExportStatus() {
			return this.imageExportStatus;
		}

		public void setImageExportStatus(String imageExportStatus) {
			this.imageExportStatus = imageExportStatus;
		}
	}

	@Override
	public DescribeExportImageInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeExportImageInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
