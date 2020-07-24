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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.GetImageCroppingSuggestionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageCroppingSuggestionsResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private List<CroppingSuggestionsItem> croppingSuggestions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public List<CroppingSuggestionsItem> getCroppingSuggestions() {
		return this.croppingSuggestions;
	}

	public void setCroppingSuggestions(List<CroppingSuggestionsItem> croppingSuggestions) {
		this.croppingSuggestions = croppingSuggestions;
	}

	public static class CroppingSuggestionsItem {

		private Float score;

		private String aspectRatio;

		private CroppingBoundary croppingBoundary;

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}

		public String getAspectRatio() {
			return this.aspectRatio;
		}

		public void setAspectRatio(String aspectRatio) {
			this.aspectRatio = aspectRatio;
		}

		public CroppingBoundary getCroppingBoundary() {
			return this.croppingBoundary;
		}

		public void setCroppingBoundary(CroppingBoundary croppingBoundary) {
			this.croppingBoundary = croppingBoundary;
		}

		public static class CroppingBoundary {

			private Integer left;

			private Integer top;

			private Integer width;

			private Integer height;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
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
		}
	}

	@Override
	public GetImageCroppingSuggestionsResponse getInstance(UnmarshallerContext context) {
		return	GetImageCroppingSuggestionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
