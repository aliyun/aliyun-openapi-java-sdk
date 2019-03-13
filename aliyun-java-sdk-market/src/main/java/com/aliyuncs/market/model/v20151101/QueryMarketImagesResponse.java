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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.QueryMarketImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMarketImagesResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String requestId;

	private List<ImageProduct> result;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageProduct> getResult() {
		return this.result;
	}

	public void setResult(List<ImageProduct> result) {
		this.result = result;
	}

	public static class ImageProduct {

		private String imageProductCode;

		private String productName;

		private String categoryName;

		private String supplierName;

		private String baseSystem;

		private String osKind;

		private Integer osBit;

		private String pictureUrl;

		private String smallPicUrl;

		private String shortDescription;

		private String agreementUrl;

		private String detailUrl;

		private String buyUrl;

		private String storeUrl;

		private Float score;

		private Long userCount;

		private Boolean supportIO;

		private Long createdOn;

		private List<Image> images;

		private List<String> skuCodes;

		private Quota quota;

		private PriceInfo priceInfo;

		public String getImageProductCode() {
			return this.imageProductCode;
		}

		public void setImageProductCode(String imageProductCode) {
			this.imageProductCode = imageProductCode;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getBaseSystem() {
			return this.baseSystem;
		}

		public void setBaseSystem(String baseSystem) {
			this.baseSystem = baseSystem;
		}

		public String getOsKind() {
			return this.osKind;
		}

		public void setOsKind(String osKind) {
			this.osKind = osKind;
		}

		public Integer getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Integer osBit) {
			this.osBit = osBit;
		}

		public String getPictureUrl() {
			return this.pictureUrl;
		}

		public void setPictureUrl(String pictureUrl) {
			this.pictureUrl = pictureUrl;
		}

		public String getSmallPicUrl() {
			return this.smallPicUrl;
		}

		public void setSmallPicUrl(String smallPicUrl) {
			this.smallPicUrl = smallPicUrl;
		}

		public String getShortDescription() {
			return this.shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getAgreementUrl() {
			return this.agreementUrl;
		}

		public void setAgreementUrl(String agreementUrl) {
			this.agreementUrl = agreementUrl;
		}

		public String getDetailUrl() {
			return this.detailUrl;
		}

		public void setDetailUrl(String detailUrl) {
			this.detailUrl = detailUrl;
		}

		public String getBuyUrl() {
			return this.buyUrl;
		}

		public void setBuyUrl(String buyUrl) {
			this.buyUrl = buyUrl;
		}

		public String getStoreUrl() {
			return this.storeUrl;
		}

		public void setStoreUrl(String storeUrl) {
			this.storeUrl = storeUrl;
		}

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}

		public Long getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Long userCount) {
			this.userCount = userCount;
		}

		public Boolean getSupportIO() {
			return this.supportIO;
		}

		public void setSupportIO(Boolean supportIO) {
			this.supportIO = supportIO;
		}

		public Long getCreatedOn() {
			return this.createdOn;
		}

		public void setCreatedOn(Long createdOn) {
			this.createdOn = createdOn;
		}

		public List<Image> getImages() {
			return this.images;
		}

		public void setImages(List<Image> images) {
			this.images = images;
		}

		public List<String> getSkuCodes() {
			return this.skuCodes;
		}

		public void setSkuCodes(List<String> skuCodes) {
			this.skuCodes = skuCodes;
		}

		public Quota getQuota() {
			return this.quota;
		}

		public void setQuota(Quota quota) {
			this.quota = quota;
		}

		public PriceInfo getPriceInfo() {
			return this.priceInfo;
		}

		public void setPriceInfo(PriceInfo priceInfo) {
			this.priceInfo = priceInfo;
		}

		public static class Image {

			private String version;

			private String versionDescription;

			private String imageId;

			private Integer imageSize;

			private String region;

			private Boolean isDefault;

			private Boolean supportIO;

			private List<DiskDeviceMapping> diskDeviceMappings;

			public String getBizVersion() {
				return this.version;
			}

			public void setBizVersion(String version) {
				this.version = version;
			}

			/**
			 * @deprecated use getBizVersion instead of this.
			 */
			@Deprecated
			public String getVersion() {
				return this.version;
			}

			/**
			 * @deprecated use setBizVersion instead of this.
			 */
			@Deprecated
			public void setVersion(String version) {
				this.version = version;
			}

			public String getVersionDescription() {
				return this.versionDescription;
			}

			public void setVersionDescription(String versionDescription) {
				this.versionDescription = versionDescription;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public Integer getImageSize() {
				return this.imageSize;
			}

			public void setImageSize(Integer imageSize) {
				this.imageSize = imageSize;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}

			public Boolean getSupportIO() {
				return this.supportIO;
			}

			public void setSupportIO(Boolean supportIO) {
				this.supportIO = supportIO;
			}

			public List<DiskDeviceMapping> getDiskDeviceMappings() {
				return this.diskDeviceMappings;
			}

			public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
				this.diskDeviceMappings = diskDeviceMappings;
			}

			public static class DiskDeviceMapping {

				private String diskType;

				private String format;

				private String snapshotId;

				private Integer size;

				private String device;

				private String importOSSBucket;

				private String importOSSObject;

				public String getDiskType() {
					return this.diskType;
				}

				public void setDiskType(String diskType) {
					this.diskType = diskType;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public String getSnapshotId() {
					return this.snapshotId;
				}

				public void setSnapshotId(String snapshotId) {
					this.snapshotId = snapshotId;
				}

				public Integer getSize() {
					return this.size;
				}

				public void setSize(Integer size) {
					this.size = size;
				}

				public String getDevice() {
					return this.device;
				}

				public void setDevice(String device) {
					this.device = device;
				}

				public String getImportOSSBucket() {
					return this.importOSSBucket;
				}

				public void setImportOSSBucket(String importOSSBucket) {
					this.importOSSBucket = importOSSBucket;
				}

				public String getImportOSSObject() {
					return this.importOSSObject;
				}

				public void setImportOSSObject(String importOSSObject) {
					this.importOSSObject = importOSSObject;
				}
			}
		}

		public static class Quota {

			private Long totalQuota;

			private Long usingQuota;

			private Long unusedQuota;

			public Long getTotalQuota() {
				return this.totalQuota;
			}

			public void setTotalQuota(Long totalQuota) {
				this.totalQuota = totalQuota;
			}

			public Long getUsingQuota() {
				return this.usingQuota;
			}

			public void setUsingQuota(Long usingQuota) {
				this.usingQuota = usingQuota;
			}

			public Long getUnusedQuota() {
				return this.unusedQuota;
			}

			public void setUnusedQuota(Long unusedQuota) {
				this.unusedQuota = unusedQuota;
			}
		}

		public static class PriceInfo {

			private List<Rule> rules;

			private Order order;

			public List<Rule> getRules() {
				return this.rules;
			}

			public void setRules(List<Rule> rules) {
				this.rules = rules;
			}

			public Order getOrder() {
				return this.order;
			}

			public void setOrder(Order order) {
				this.order = order;
			}

			public static class Rule {

				private Long ruleId;

				private String title;

				private String name;

				public Long getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(Long ruleId) {
					this.ruleId = ruleId;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Order {

				private Float originalPrice;

				private Float discountPrice;

				private Float tradePrice;

				private String currency;

				private Integer period;

				private String priceUnit;

				private List<String> ruleIdSet;

				public Float getOriginalPrice() {
					return this.originalPrice;
				}

				public void setOriginalPrice(Float originalPrice) {
					this.originalPrice = originalPrice;
				}

				public Float getDiscountPrice() {
					return this.discountPrice;
				}

				public void setDiscountPrice(Float discountPrice) {
					this.discountPrice = discountPrice;
				}

				public Float getTradePrice() {
					return this.tradePrice;
				}

				public void setTradePrice(Float tradePrice) {
					this.tradePrice = tradePrice;
				}

				public String getCurrency() {
					return this.currency;
				}

				public void setCurrency(String currency) {
					this.currency = currency;
				}

				public Integer getPeriod() {
					return this.period;
				}

				public void setPeriod(Integer period) {
					this.period = period;
				}

				public String getPriceUnit() {
					return this.priceUnit;
				}

				public void setPriceUnit(String priceUnit) {
					this.priceUnit = priceUnit;
				}

				public List<String> getRuleIdSet() {
					return this.ruleIdSet;
				}

				public void setRuleIdSet(List<String> ruleIdSet) {
					this.ruleIdSet = ruleIdSet;
				}
			}
		}
	}

	@Override
	public QueryMarketImagesResponse getInstance(UnmarshallerContext context) {
		return	QueryMarketImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
