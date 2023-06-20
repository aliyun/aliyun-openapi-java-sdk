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

package com.aliyuncs.cd.model.v2021127;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cd.transform.v2021127.ListMenuDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMenuDataResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String code;

	private Integer httpStatusCode;

	private String requestId;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String productContainerId;

		private String batchId;

		private String shopGroupId;

		private String type;

		private Integer priority;

		private List<ProductCombineListItem> productCombineList;

		private List<String> shopIdList;

		public String getProductContainerId() {
			return this.productContainerId;
		}

		public void setProductContainerId(String productContainerId) {
			this.productContainerId = productContainerId;
		}

		public String getBatchId() {
			return this.batchId;
		}

		public void setBatchId(String batchId) {
			this.batchId = batchId;
		}

		public String getShopGroupId() {
			return this.shopGroupId;
		}

		public void setShopGroupId(String shopGroupId) {
			this.shopGroupId = shopGroupId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public List<ProductCombineListItem> getProductCombineList() {
			return this.productCombineList;
		}

		public void setProductCombineList(List<ProductCombineListItem> productCombineList) {
			this.productCombineList = productCombineList;
		}

		public List<String> getShopIdList() {
			return this.shopIdList;
		}

		public void setShopIdList(List<String> shopIdList) {
			this.shopIdList = shopIdList;
		}

		public static class ProductCombineListItem {

			private Integer order;

			private String name;

			private List<ProductItemListItem> productItemList;

			public Integer getOrder() {
				return this.order;
			}

			public void setOrder(Integer order) {
				this.order = order;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<ProductItemListItem> getProductItemList() {
				return this.productItemList;
			}

			public void setProductItemList(List<ProductItemListItem> productItemList) {
				this.productItemList = productItemList;
			}

			public static class ProductItemListItem {

				private Integer order;

				private ProductInfo productInfo;

				public Integer getOrder() {
					return this.order;
				}

				public void setOrder(Integer order) {
					this.order = order;
				}

				public ProductInfo getProductInfo() {
					return this.productInfo;
				}

				public void setProductInfo(ProductInfo productInfo) {
					this.productInfo = productInfo;
				}

				public static class ProductInfo {

					private String productId;

					private String chineseName;

					private String englishName;

					private String description;

					private String iconText;

					private String productType;

					private String temperature;

					private String originalPrice;

					private String currentPrice;

					public String getProductId() {
						return this.productId;
					}

					public void setProductId(String productId) {
						this.productId = productId;
					}

					public String getChineseName() {
						return this.chineseName;
					}

					public void setChineseName(String chineseName) {
						this.chineseName = chineseName;
					}

					public String getEnglishName() {
						return this.englishName;
					}

					public void setEnglishName(String englishName) {
						this.englishName = englishName;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}

					public String getIconText() {
						return this.iconText;
					}

					public void setIconText(String iconText) {
						this.iconText = iconText;
					}

					public String getProductType() {
						return this.productType;
					}

					public void setProductType(String productType) {
						this.productType = productType;
					}

					public String getTemperature() {
						return this.temperature;
					}

					public void setTemperature(String temperature) {
						this.temperature = temperature;
					}

					public String getOriginalPrice() {
						return this.originalPrice;
					}

					public void setOriginalPrice(String originalPrice) {
						this.originalPrice = originalPrice;
					}

					public String getCurrentPrice() {
						return this.currentPrice;
					}

					public void setCurrentPrice(String currentPrice) {
						this.currentPrice = currentPrice;
					}
				}
			}
		}
	}

	@Override
	public ListMenuDataResponse getInstance(UnmarshallerContext context) {
		return	ListMenuDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
