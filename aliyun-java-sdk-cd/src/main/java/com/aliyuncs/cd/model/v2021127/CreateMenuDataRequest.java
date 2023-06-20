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

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateMenuDataRequest extends RoaAcsRequest<CreateMenuDataResponse> {
	   

	private String country;

	@SerializedName("shopIdList")
	private List<String> shopIdList;

	private String batchId;

	private String type;

	private Integer priority;

	@SerializedName("productCombineList")
	private List<ProductCombineList> productCombineList;

	private String productContainerId;

	private String shopGroupId;
	public CreateMenuDataRequest() {
		super("cd", "2021-12-7", "CreateMenuData");
		setUriPattern("/CreateMenuData");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
		}
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}

	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;	
		if (shopIdList != null) {
			putBodyParameter("ShopIdList" , new Gson().toJson(shopIdList));
		}	
	}

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
		if(batchId != null){
			putBodyParameter("BatchId", batchId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
		}
	}

	public List<ProductCombineList> getProductCombineList() {
		return this.productCombineList;
	}

	public void setProductCombineList(List<ProductCombineList> productCombineList) {
		this.productCombineList = productCombineList;	
		if (productCombineList != null) {
			putBodyParameter("ProductCombineList" , new Gson().toJson(productCombineList));
		}	
	}

	public String getProductContainerId() {
		return this.productContainerId;
	}

	public void setProductContainerId(String productContainerId) {
		this.productContainerId = productContainerId;
		if(productContainerId != null){
			putBodyParameter("ProductContainerId", productContainerId);
		}
	}

	public String getShopGroupId() {
		return this.shopGroupId;
	}

	public void setShopGroupId(String shopGroupId) {
		this.shopGroupId = shopGroupId;
		if(shopGroupId != null){
			putBodyParameter("ShopGroupId", shopGroupId);
		}
	}

	public static class ProductCombineList {

		@SerializedName("Order")
		private Integer order;

		@SerializedName("Name")
		private String name;

		@SerializedName("EnglishName")
		private String englishName;

		@SerializedName("ProductItemList")
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

		public String getEnglishName() {
			return this.englishName;
		}

		public void setEnglishName(String englishName) {
			this.englishName = englishName;
		}

		public List<ProductItemListItem> getProductItemList() {
			return this.productItemList;
		}

		public void setProductItemList(List<ProductItemListItem> productItemList) {
			this.productItemList = productItemList;
		}

		public static class ProductItemListItem {

			@SerializedName("Order")
			private Integer order;

			@SerializedName("ProductInfo")
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

				@SerializedName("ProductId")
				private String productId;

				@SerializedName("ChineseName")
				private String chineseName;

				@SerializedName("EnglishName")
				private String englishName;

				@SerializedName("Description")
				private String description;

				@SerializedName("IconText")
				private String iconText;

				@SerializedName("ProductType")
				private String productType;

				@SerializedName("Temperature")
				private String temperature;

				@SerializedName("OriginalPrice")
				private String originalPrice;

				@SerializedName("CurrentPrice")
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

	@Override
	public Class<CreateMenuDataResponse> getResponseClass() {
		return CreateMenuDataResponse.class;
	}

}
