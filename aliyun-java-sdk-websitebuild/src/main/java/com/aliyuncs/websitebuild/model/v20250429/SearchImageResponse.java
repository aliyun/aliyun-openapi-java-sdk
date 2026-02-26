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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.SearchImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchImageResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String success;

	private String errorCode;

	private ImageResponse imageResponse;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public ImageResponse getImageResponse() {
		return this.imageResponse;
	}

	public void setImageResponse(ImageResponse imageResponse) {
		this.imageResponse = imageResponse;
	}

	public static class ImageResponse {

		private Integer maxResults;

		private String nextToken;

		private List<Image> imageList;

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<Image> getImageList() {
			return this.imageList;
		}

		public void setImageList(List<Image> imageList) {
			this.imageList = imageList;
		}

		public static class Image {

			private String imageUuid;

			private String ossKey;

			private String url;

			private Integer width;

			private Integer height;

			private String imageRatio;

			private String imageCategory;

			private String tagsFromImage;

			private String descriptiveTones;

			private String quantitativePalette;

			public String getImageUuid() {
				return this.imageUuid;
			}

			public void setImageUuid(String imageUuid) {
				this.imageUuid = imageUuid;
			}

			public String getOssKey() {
				return this.ossKey;
			}

			public void setOssKey(String ossKey) {
				this.ossKey = ossKey;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public String getImageRatio() {
				return this.imageRatio;
			}

			public void setImageRatio(String imageRatio) {
				this.imageRatio = imageRatio;
			}

			public String getImageCategory() {
				return this.imageCategory;
			}

			public void setImageCategory(String imageCategory) {
				this.imageCategory = imageCategory;
			}

			public String getTagsFromImage() {
				return this.tagsFromImage;
			}

			public void setTagsFromImage(String tagsFromImage) {
				this.tagsFromImage = tagsFromImage;
			}

			public String getDescriptiveTones() {
				return this.descriptiveTones;
			}

			public void setDescriptiveTones(String descriptiveTones) {
				this.descriptiveTones = descriptiveTones;
			}

			public String getQuantitativePalette() {
				return this.quantitativePalette;
			}

			public void setQuantitativePalette(String quantitativePalette) {
				this.quantitativePalette = quantitativePalette;
			}
		}
	}

	@Override
	public SearchImageResponse getInstance(UnmarshallerContext context) {
		return	SearchImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
