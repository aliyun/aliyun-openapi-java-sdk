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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListRepoTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepoTagResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private Integer pageNo;

	private Integer pageSize;

	private String totalCount;

	private List<ImagesItem> images;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<ImagesItem> getImages() {
		return this.images;
	}

	public void setImages(List<ImagesItem> images) {
		this.images = images;
	}

	public static class ImagesItem {

		private String tag;

		private String digest;

		private String imageId;

		private String status;

		private Long imageSize;

		private String imageCreate;

		private String imageUpdate;

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(Long imageSize) {
			this.imageSize = imageSize;
		}

		public String getImageCreate() {
			return this.imageCreate;
		}

		public void setImageCreate(String imageCreate) {
			this.imageCreate = imageCreate;
		}

		public String getImageUpdate() {
			return this.imageUpdate;
		}

		public void setImageUpdate(String imageUpdate) {
			this.imageUpdate = imageUpdate;
		}
	}

	@Override
	public ListRepoTagResponse getInstance(UnmarshallerContext context) {
		return	ListRepoTagResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
