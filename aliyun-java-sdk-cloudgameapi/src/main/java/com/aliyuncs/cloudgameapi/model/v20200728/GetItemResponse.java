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
import com.aliyuncs.cloudgameapi.transform.v20200728.GetItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetItemResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String itemId;

		private Long createTime;

		private Long modifyTime;

		private String sellerId;

		private Long categoryId;

		private String title;

		private Long originPrice;

		private Long salePrice;

		private Integer status;

		private String description;

		private String supplier;

		private List<GamesItem> games;

		private List<Units> skus;

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Long getOriginPrice() {
			return this.originPrice;
		}

		public void setOriginPrice(Long originPrice) {
			this.originPrice = originPrice;
		}

		public Long getSalePrice() {
			return this.salePrice;
		}

		public void setSalePrice(Long salePrice) {
			this.salePrice = salePrice;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSupplier() {
			return this.supplier;
		}

		public void setSupplier(String supplier) {
			this.supplier = supplier;
		}

		public List<GamesItem> getGames() {
			return this.games;
		}

		public void setGames(List<GamesItem> games) {
			this.games = games;
		}

		public List<Units> getSkus() {
			return this.skus;
		}

		public void setSkus(List<Units> skus) {
			this.skus = skus;
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

		public static class Units {

			private String skuId;

			private Long createTime;

			private Long modifyTime;

			private String itemId;

			private Long originPrice;

			private Long salePrice;

			private Integer status;

			private List<SalePropsItem> saleProps;

			public String getSkuId() {
				return this.skuId;
			}

			public void setSkuId(String skuId) {
				this.skuId = skuId;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(Long modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}

			public Long getOriginPrice() {
				return this.originPrice;
			}

			public void setOriginPrice(Long originPrice) {
				this.originPrice = originPrice;
			}

			public Long getSalePrice() {
				return this.salePrice;
			}

			public void setSalePrice(Long salePrice) {
				this.salePrice = salePrice;
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

				private Long propertyId;

				private String propertyName;

				private Long valueId;

				private String value;

				public Long getPropertyId() {
					return this.propertyId;
				}

				public void setPropertyId(Long propertyId) {
					this.propertyId = propertyId;
				}

				public String getPropertyName() {
					return this.propertyName;
				}

				public void setPropertyName(String propertyName) {
					this.propertyName = propertyName;
				}

				public Long getValueId() {
					return this.valueId;
				}

				public void setValueId(Long valueId) {
					this.valueId = valueId;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public GetItemResponse getInstance(UnmarshallerContext context) {
		return	GetItemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
