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
import com.aliyuncs.rds.transform.v20140815.DescribeDedicatedHostImageCategoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedHostImageCategoriesResponse extends AcsResponse {

	private String requestId;

	private List<ImagesItem> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImagesItem> getImages() {
		return this.images;
	}

	public void setImages(List<ImagesItem> images) {
		this.images = images;
	}

	public static class ImagesItem {

		private String imageName;

		private String imageCode;

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getImageCode() {
			return this.imageCode;
		}

		public void setImageCode(String imageCode) {
			this.imageCode = imageCode;
		}
	}

	@Override
	public DescribeDedicatedHostImageCategoriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedHostImageCategoriesResponseUnmarshaller.unmarshall(this, context);
	}
}
