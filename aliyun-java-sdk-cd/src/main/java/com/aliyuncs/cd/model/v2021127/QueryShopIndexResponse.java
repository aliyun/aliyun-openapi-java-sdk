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
import com.aliyuncs.cd.transform.v2021127.QueryShopIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryShopIndexResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String code;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private ShopScheduleIndex shopScheduleIndex;

		private ShopIndex shopIndex;

		public ShopScheduleIndex getShopScheduleIndex() {
			return this.shopScheduleIndex;
		}

		public void setShopScheduleIndex(ShopScheduleIndex shopScheduleIndex) {
			this.shopScheduleIndex = shopScheduleIndex;
		}

		public ShopIndex getShopIndex() {
			return this.shopIndex;
		}

		public void setShopIndex(ShopIndex shopIndex) {
			this.shopIndex = shopIndex;
		}

		public static class ShopScheduleIndex {

			private Integer scheduleNum;

			private Integer scheduleShopNum;

			private Float successRate;

			private Integer failShopNum;

			private Double costTime;

			private List<FailShopsItem> failShops;

			public Integer getScheduleNum() {
				return this.scheduleNum;
			}

			public void setScheduleNum(Integer scheduleNum) {
				this.scheduleNum = scheduleNum;
			}

			public Integer getScheduleShopNum() {
				return this.scheduleShopNum;
			}

			public void setScheduleShopNum(Integer scheduleShopNum) {
				this.scheduleShopNum = scheduleShopNum;
			}

			public Float getSuccessRate() {
				return this.successRate;
			}

			public void setSuccessRate(Float successRate) {
				this.successRate = successRate;
			}

			public Integer getFailShopNum() {
				return this.failShopNum;
			}

			public void setFailShopNum(Integer failShopNum) {
				this.failShopNum = failShopNum;
			}

			public Double getCostTime() {
				return this.costTime;
			}

			public void setCostTime(Double costTime) {
				this.costTime = costTime;
			}

			public List<FailShopsItem> getFailShops() {
				return this.failShops;
			}

			public void setFailShops(List<FailShopsItem> failShops) {
				this.failShops = failShops;
			}

			public static class FailShopsItem {

				private String shopId;

				private String shopName;

				public String getShopId() {
					return this.shopId;
				}

				public void setShopId(String shopId) {
					this.shopId = shopId;
				}

				public String getShopName() {
					return this.shopName;
				}

				public void setShopName(String shopName) {
					this.shopName = shopName;
				}
			}
		}

		public static class ShopIndex {

			private Integer shopTotal;

			private Integer netWorkShopNum;

			private Integer installedShopNum;

			private Integer notWorkShopNum;

			private Integer upholdShopNum;

			private Integer normalShopNum;

			private Integer faultShopNum;

			private Integer highFreqFaultShopNum;

			public Integer getShopTotal() {
				return this.shopTotal;
			}

			public void setShopTotal(Integer shopTotal) {
				this.shopTotal = shopTotal;
			}

			public Integer getNetWorkShopNum() {
				return this.netWorkShopNum;
			}

			public void setNetWorkShopNum(Integer netWorkShopNum) {
				this.netWorkShopNum = netWorkShopNum;
			}

			public Integer getInstalledShopNum() {
				return this.installedShopNum;
			}

			public void setInstalledShopNum(Integer installedShopNum) {
				this.installedShopNum = installedShopNum;
			}

			public Integer getNotWorkShopNum() {
				return this.notWorkShopNum;
			}

			public void setNotWorkShopNum(Integer notWorkShopNum) {
				this.notWorkShopNum = notWorkShopNum;
			}

			public Integer getUpholdShopNum() {
				return this.upholdShopNum;
			}

			public void setUpholdShopNum(Integer upholdShopNum) {
				this.upholdShopNum = upholdShopNum;
			}

			public Integer getNormalShopNum() {
				return this.normalShopNum;
			}

			public void setNormalShopNum(Integer normalShopNum) {
				this.normalShopNum = normalShopNum;
			}

			public Integer getFaultShopNum() {
				return this.faultShopNum;
			}

			public void setFaultShopNum(Integer faultShopNum) {
				this.faultShopNum = faultShopNum;
			}

			public Integer getHighFreqFaultShopNum() {
				return this.highFreqFaultShopNum;
			}

			public void setHighFreqFaultShopNum(Integer highFreqFaultShopNum) {
				this.highFreqFaultShopNum = highFreqFaultShopNum;
			}
		}
	}

	@Override
	public QueryShopIndexResponse getInstance(UnmarshallerContext context) {
		return	QueryShopIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
