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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribeEstackImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEstackImageResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<ImageListInfo> imageList;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ImageListInfo> getImageList() {
		return this.imageList;
	}

	public void setImageList(List<ImageListInfo> imageList) {
		this.imageList = imageList;
	}

	public static class ImageListInfo {

		private String imageName;

		private Integer imageSize;

		private String recentUpdateTime;

		private String imageUrl;

		private String imageType;

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

		public String getRecentUpdateTime() {
			return this.recentUpdateTime;
		}

		public void setRecentUpdateTime(String recentUpdateTime) {
			this.recentUpdateTime = recentUpdateTime;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getImageType() {
			return this.imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
		}
	}

	@Override
	public DescribeEstackImageResponse getInstance(UnmarshallerContext context) {
		return	DescribeEstackImageResponseUnmarshaller.unmarshall(this, context);
	}
}
