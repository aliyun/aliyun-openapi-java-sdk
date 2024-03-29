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

package com.aliyuncs.premiumpics.model.v20200505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.premiumpics.transform.v20200505.QueryBarrelImageListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBarrelImageListResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private String errorMsg;

	private String errorCode;

	private Boolean hasNext;

	private Boolean success;

	private Integer nextId;

	private List<Image> images;

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

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getHasNext() {
		return this.hasNext;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getNextId() {
		return this.nextId;
	}

	public void setNextId(Integer nextId) {
		this.nextId = nextId;
	}

	public List<Image> getImages() {
		return this.images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public static class Image {

		private Boolean buy;

		private String midImage;

		private String bigImage;

		private String smallImage;

		private String title;

		private String tag;

		private String imageId;

		private List<Specification> specifications;

		public Boolean getBuy() {
			return this.buy;
		}

		public void setBuy(Boolean buy) {
			this.buy = buy;
		}

		public String getMidImage() {
			return this.midImage;
		}

		public void setMidImage(String midImage) {
			this.midImage = midImage;
		}

		public String getBigImage() {
			return this.bigImage;
		}

		public void setBigImage(String bigImage) {
			this.bigImage = bigImage;
		}

		public String getSmallImage() {
			return this.smallImage;
		}

		public void setSmallImage(String smallImage) {
			this.smallImage = smallImage;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public List<Specification> getSpecifications() {
			return this.specifications;
		}

		public void setSpecifications(List<Specification> specifications) {
			this.specifications = specifications;
		}

		public static class Specification {

			private String price;

			private Integer width;

			private Integer height;

			private String name;

			private String imageId;

			private Long id;

			private String suffix;

			public String getPrice() {
				return this.price;
			}

			public void setPrice(String price) {
				this.price = price;
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

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getSuffix() {
				return this.suffix;
			}

			public void setSuffix(String suffix) {
				this.suffix = suffix;
			}
		}
	}

	@Override
	public QueryBarrelImageListResponse getInstance(UnmarshallerContext context) {
		return	QueryBarrelImageListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
