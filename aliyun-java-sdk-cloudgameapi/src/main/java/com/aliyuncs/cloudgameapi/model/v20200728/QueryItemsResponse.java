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

package com.aliyuncs.cloudgameapi.model.v20200728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudgameapi.transform.v20200728.QueryItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryItemsResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Long httpStatusCode;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Long totalCount;

		private List<ItemsItem> items;

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

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private Long modifyTime;

			private Long salePrice;

			private String description;

			private Long originPrice;

			private Long createTime;

			private String title;

			private String itemId;

			private String sellerId;

			private String supplier;

			private Long categoryId;

			private Integer status;

			private List<Units> skus;

			private List<GamesItem> games;

			public Long getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(Long modifyTime) {
				this.modifyTime = modifyTime;
			}

			public Long getSalePrice() {
				return this.salePrice;
			}

			public void setSalePrice(Long salePrice) {
				this.salePrice = salePrice;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getOriginPrice() {
				return this.originPrice;
			}

			public void setOriginPrice(Long originPrice) {
				this.originPrice = originPrice;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}

			public String getSellerId() {
				return this.sellerId;
			}

			public void setSellerId(String sellerId) {
				this.sellerId = sellerId;
			}

			public String getSupplier() {
				return this.supplier;
			}

			public void setSupplier(String supplier) {
				this.supplier = supplier;
			}

			public Long getCategoryId() {
				return this.categoryId;
			}

			public void setCategoryId(Long categoryId) {
				this.categoryId = categoryId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public List<Units> getSkus() {
				return this.skus;
			}

			public void setSkus(List<Units> skus) {
				this.skus = skus;
			}

			public List<GamesItem> getGames() {
				return this.games;
			}

			public void setGames(List<GamesItem> games) {
				this.games = games;
			}

			public static class Units {

				private String itemId;

				private Long modifyTime;

				private Long salePrice;

				private Long originPrice;

				private Long createTime;

				private String skuId;

				private Integer status;

				private List<SalePropsItem> saleProps;

				public String getItemId() {
					return this.itemId;
				}

				public void setItemId(String itemId) {
					this.itemId = itemId;
				}

				public Long getModifyTime() {
					return this.modifyTime;
				}

				public void setModifyTime(Long modifyTime) {
					this.modifyTime = modifyTime;
				}

				public Long getSalePrice() {
					return this.salePrice;
				}

				public void setSalePrice(Long salePrice) {
					this.salePrice = salePrice;
				}

				public Long getOriginPrice() {
					return this.originPrice;
				}

				public void setOriginPrice(Long originPrice) {
					this.originPrice = originPrice;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public String getSkuId() {
					return this.skuId;
				}

				public void setSkuId(String skuId) {
					this.skuId = skuId;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public List<SalePropsItem> getSaleProps() {
					return this.saleProps;
				}

				public void setSaleProps(List<SalePropsItem> saleProps) {
					this.saleProps = saleProps;
				}

				public static class SalePropsItem {

					private Long valueId;

					private String propertyName;

					private Long propertyId;

					private String value;

					public Long getValueId() {
						return this.valueId;
					}

					public void setValueId(Long valueId) {
						this.valueId = valueId;
					}

					public String getPropertyName() {
						return this.propertyName;
					}

					public void setPropertyName(String propertyName) {
						this.propertyName = propertyName;
					}

					public Long getPropertyId() {
						return this.propertyId;
					}

					public void setPropertyId(Long propertyId) {
						this.propertyId = propertyId;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class GamesItem {

				private String gameId;

				private String name;

				public String getGameId() {
					return this.gameId;
				}

				public void setGameId(String gameId) {
					this.gameId = gameId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public QueryItemsResponse getInstance(UnmarshallerContext context) {
		return	QueryItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
