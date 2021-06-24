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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryCloudBoxSkuInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryCloudBoxSkuInfoResponse extends AcsResponse {

	private String requestId;

	private List<CloudBoxSkuInfoModel> cloudBoxSkuInfoModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CloudBoxSkuInfoModel> getCloudBoxSkuInfoModels() {
		return this.cloudBoxSkuInfoModels;
	}

	public void setCloudBoxSkuInfoModels(List<CloudBoxSkuInfoModel> cloudBoxSkuInfoModels) {
		this.cloudBoxSkuInfoModels = cloudBoxSkuInfoModels;
	}

	public static class CloudBoxSkuInfoModel {

		private String comment;

		private String powerConsumption;

		private String skuType;

		private String skuDescribe;

		private String skuCabinetType;

		private String weight;

		private String submitterName;

		private String bandwidth;

		private String hight;

		private String size;

		private String width;

		private String skuId;

		private String length;

		private List<CloudBoxSkuStoreInfoModel> cloudBoxSkuStoreInfoModels;

		private List<CloudBoxSkuCalInfoModel> cloudBoxSkuCalInfoModels;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getPowerConsumption() {
			return this.powerConsumption;
		}

		public void setPowerConsumption(String powerConsumption) {
			this.powerConsumption = powerConsumption;
		}

		public String getSkuType() {
			return this.skuType;
		}

		public void setSkuType(String skuType) {
			this.skuType = skuType;
		}

		public String getSkuDescribe() {
			return this.skuDescribe;
		}

		public void setSkuDescribe(String skuDescribe) {
			this.skuDescribe = skuDescribe;
		}

		public String getSkuCabinetType() {
			return this.skuCabinetType;
		}

		public void setSkuCabinetType(String skuCabinetType) {
			this.skuCabinetType = skuCabinetType;
		}

		public String getWeight() {
			return this.weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getSubmitterName() {
			return this.submitterName;
		}

		public void setSubmitterName(String submitterName) {
			this.submitterName = submitterName;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getHight() {
			return this.hight;
		}

		public void setHight(String hight) {
			this.hight = hight;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getWidth() {
			return this.width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}

		public String getLength() {
			return this.length;
		}

		public void setLength(String length) {
			this.length = length;
		}

		public List<CloudBoxSkuStoreInfoModel> getCloudBoxSkuStoreInfoModels() {
			return this.cloudBoxSkuStoreInfoModels;
		}

		public void setCloudBoxSkuStoreInfoModels(List<CloudBoxSkuStoreInfoModel> cloudBoxSkuStoreInfoModels) {
			this.cloudBoxSkuStoreInfoModels = cloudBoxSkuStoreInfoModels;
		}

		public List<CloudBoxSkuCalInfoModel> getCloudBoxSkuCalInfoModels() {
			return this.cloudBoxSkuCalInfoModels;
		}

		public void setCloudBoxSkuCalInfoModels(List<CloudBoxSkuCalInfoModel> cloudBoxSkuCalInfoModels) {
			this.cloudBoxSkuCalInfoModels = cloudBoxSkuCalInfoModels;
		}

		public static class CloudBoxSkuStoreInfoModel {

			private String storeNcType;

			private String storeMax;

			private String storeMin;

			private String storeProduct;

			public String getStoreNcType() {
				return this.storeNcType;
			}

			public void setStoreNcType(String storeNcType) {
				this.storeNcType = storeNcType;
			}

			public String getStoreMax() {
				return this.storeMax;
			}

			public void setStoreMax(String storeMax) {
				this.storeMax = storeMax;
			}

			public String getStoreMin() {
				return this.storeMin;
			}

			public void setStoreMin(String storeMin) {
				this.storeMin = storeMin;
			}

			public String getStoreProduct() {
				return this.storeProduct;
			}

			public void setStoreProduct(String storeProduct) {
				this.storeProduct = storeProduct;
			}
		}

		public static class CloudBoxSkuCalInfoModel {

			private Integer amount;

			private Integer ncAmount;

			private String calProduct;

			private String ncType;

			private String instanceType;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public Integer getNcAmount() {
				return this.ncAmount;
			}

			public void setNcAmount(Integer ncAmount) {
				this.ncAmount = ncAmount;
			}

			public String getCalProduct() {
				return this.calProduct;
			}

			public void setCalProduct(String calProduct) {
				this.calProduct = calProduct;
			}

			public String getNcType() {
				return this.ncType;
			}

			public void setNcType(String ncType) {
				this.ncType = ncType;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}
		}
	}

	@Override
	public OpsQueryCloudBoxSkuInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryCloudBoxSkuInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
