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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetPatentFeeStatisticsInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentFeeStatisticsInfoResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String userType;

		private Float discountPrice;

		private Integer usedCount;

		private Integer shiyongCount;

		private Integer waiguanCount;

		private Float totalPrice;

		private Integer total;

		private Integer freeCount;

		private Integer famingCount;

		private List<AgeInfoItem> ageInfo;

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public Float getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(Float discountPrice) {
			this.discountPrice = discountPrice;
		}

		public Integer getUsedCount() {
			return this.usedCount;
		}

		public void setUsedCount(Integer usedCount) {
			this.usedCount = usedCount;
		}

		public Integer getShiyongCount() {
			return this.shiyongCount;
		}

		public void setShiyongCount(Integer shiyongCount) {
			this.shiyongCount = shiyongCount;
		}

		public Integer getWaiguanCount() {
			return this.waiguanCount;
		}

		public void setWaiguanCount(Integer waiguanCount) {
			this.waiguanCount = waiguanCount;
		}

		public Float getTotalPrice() {
			return this.totalPrice;
		}

		public void setTotalPrice(Float totalPrice) {
			this.totalPrice = totalPrice;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getFreeCount() {
			return this.freeCount;
		}

		public void setFreeCount(Integer freeCount) {
			this.freeCount = freeCount;
		}

		public Integer getFamingCount() {
			return this.famingCount;
		}

		public void setFamingCount(Integer famingCount) {
			this.famingCount = famingCount;
		}

		public List<AgeInfoItem> getAgeInfo() {
			return this.ageInfo;
		}

		public void setAgeInfo(List<AgeInfoItem> ageInfo) {
			this.ageInfo = ageInfo;
		}

		public static class AgeInfoItem {

			private String type;

			private Float discountPrice;

			private Float salePrice;

			private String age;

			private Integer count;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Float getDiscountPrice() {
				return this.discountPrice;
			}

			public void setDiscountPrice(Float discountPrice) {
				this.discountPrice = discountPrice;
			}

			public Float getSalePrice() {
				return this.salePrice;
			}

			public void setSalePrice(Float salePrice) {
				this.salePrice = salePrice;
			}

			public String getAge() {
				return this.age;
			}

			public void setAge(String age) {
				this.age = age;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public GetPatentFeeStatisticsInfoResponse getInstance(UnmarshallerContext context) {
		return	GetPatentFeeStatisticsInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
