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

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ImageProduct> result;

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

	public List<ImageProduct> getResult() {
		return this.result;
	}

	public void setResult(List<ImageProduct> result) {
		this.result = result;
	}

	public static class ImageProduct {

		private String osKind;

		private String baseSystem;

		private String productName;

		private Boolean supportIO;

		private Float score;

		private Integer osBit;

		private String categoryName;

		private String pictureUrl;

		private String agreementUrl;

		private String imageProductCode;

		private String storeUrl;

		private String buyUrl;

		private String shortDescription;

		private Long createdOn;

		private Long userCount;

		private String smallPicUrl;

		private String detailUrl;

		private String supplierName;

		private List<Image> images;

		private List<String> skuCodes;

		private Quota quota;

		private PriceInfo priceInfo;

		public String getOsKind() {
			return this.osKind;
		}

		public void setOsKind(String osKind) {
			this.osKind = osKind;
		}

		public String getBaseSystem() {
			return this.baseSystem;
		}

		public void setBaseSystem(String baseSystem) {
			this.baseSystem = baseSystem;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Boolean getSupportIO() {
			return this.supportIO;
		}

		public void setSupportIO(Boolean supportIO) {
			this.supportIO = supportIO;
		}

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}

		public Integer getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Integer osBit) {
			this.osBit = osBit;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getPictureUrl() {
			return this.pictureUrl;
		}

		public void setPictureUrl(String pictureUrl) {
			this.pictureUrl = pictureUrl;
		}

		public String getAgreementUrl() {
			return this.agreementUrl;
		}

		public void setAgreementUrl(String agreementUrl) {
			this.agreementUrl = agreementUrl;
		}

		public String getImageProductCode() {
			return this.imageProductCode;
		}

		public void setImageProductCode(String imageProductCode) {
			this.imageProductCode = imageProductCode;
		}

		public String getStoreUrl() {
			return this.storeUrl;
		}

		public void setStoreUrl(String storeUrl) {
			this.storeUrl = storeUrl;
		}

		public String getBuyUrl() {
			return this.buyUrl;
		}

		public void setBuyUrl(String buyUrl) {
			this.buyUrl = buyUrl;
		}

		public String getShortDescription() {
			return this.shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public Long getCreatedOn() {
			return this.createdOn;
		}

		public void setCreatedOn(Long createdOn) {
			this.createdOn = createdOn;
		}

		public Long getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Long userCount) {
			this.userCount = userCount;
		}

		public String getSmallPicUrl() {
			return this.smallPicUrl;
		}

		public void setSmallPicUrl(String smallPicUrl) {
			this.smallPicUrl = smallPicUrl;
		}

		public String getDetailUrl() {
			return this.detailUrl;
		}

		public void setDetailUrl(String detailUrl) {
			this.detailUrl = detailUrl;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
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

			private Integer imageSize;

			private Boolean isDefault;

			private Boolean supportIO;

			private String version;

			private String region;

			private String versionDescription;

			private String imageId;

			private List<DiskDeviceMapping> diskDeviceMappings;

			public Integer getImageSize() {
				return this.imageSize;
			}

			public void setImageSize(Integer imageSize) {
				this.imageSize = imageSize;
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

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
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

			public List<DiskDeviceMapping> getDiskDeviceMappings() {
				return this.diskDeviceMappings;
			}

			public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
				this.diskDeviceMappings = diskDeviceMappings;
			}

			public static class DiskDeviceMapping {

				private String importOSSBucket;

				private String snapshotId;

				private String importOSSObject;

				private Integer size;

				private String device;

				private String diskType;

				private String format;

				public String getImportOSSBucket() {
					return this.importOSSBucket;
				}

				public void setImportOSSBucket(String importOSSBucket) {
					this.importOSSBucket = importOSSBucket;
				}

				public String getSnapshotId() {
					return this.snapshotId;
				}

				public void setSnapshotId(String snapshotId) {
					this.snapshotId = snapshotId;
				}

				public String getImportOSSObject() {
					return this.importOSSObject;
				}

				public void setImportOSSObject(String importOSSObject) {
					this.importOSSObject = importOSSObject;
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
			}
		}

		public static class Quota {

			private Long usingQuota;

			private Long unusedQuota;

			private Long totalQuota;

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

			public Long getTotalQuota() {
				return this.totalQuota;
			}

			public void setTotalQuota(Long totalQuota) {
				this.totalQuota = totalQuota;
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

				private String title;

				private String name;

				private Long ruleId;

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

				public Long getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(Long ruleId) {
					this.ruleId = ruleId;
				}
			}

			public static class Order {

				private Float discountPrice;

				private Float tradePrice;

				private String priceUnit;

				private Float originalPrice;

				private String currency;

				private Integer period;

				private List<String> ruleIdSet;

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

				public String getPriceUnit() {
					return this.priceUnit;
				}

				public void setPriceUnit(String priceUnit) {
					this.priceUnit = priceUnit;
				}

				public Float getOriginalPrice() {
					return this.originalPrice;
				}

				public void setOriginalPrice(Float originalPrice) {
					this.originalPrice = originalPrice;
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
