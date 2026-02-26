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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetClientRatioStatisticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClientRatioStatisticResponse extends AcsResponse {

	private String requestId;

	private List<Long> dates;

	private ClientInstallRatio clientInstallRatio;

	private ClientOnlineRatio clientOnlineRatio;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Long> getDates() {
		return this.dates;
	}

	public void setDates(List<Long> dates) {
		this.dates = dates;
	}

	public ClientInstallRatio getClientInstallRatio() {
		return this.clientInstallRatio;
	}

	public void setClientInstallRatio(ClientInstallRatio clientInstallRatio) {
		this.clientInstallRatio = clientInstallRatio;
	}

	public ClientOnlineRatio getClientOnlineRatio() {
		return this.clientOnlineRatio;
	}

	public void setClientOnlineRatio(ClientOnlineRatio clientOnlineRatio) {
		this.clientOnlineRatio = clientOnlineRatio;
	}

	public static class ClientInstallRatio {

		private List<HistoryItemsItem> historyItems;

		private List<CurrentItemsItem> currentItems;

		public List<HistoryItemsItem> getHistoryItems() {
			return this.historyItems;
		}

		public void setHistoryItems(List<HistoryItemsItem> historyItems) {
			this.historyItems = historyItems;
		}

		public List<CurrentItemsItem> getCurrentItems() {
			return this.currentItems;
		}

		public void setCurrentItems(List<CurrentItemsItem> currentItems) {
			this.currentItems = currentItems;
		}

		public static class HistoryItemsItem {

			private Long vendor;

			private List<HistoryItem> items;

			public Long getVendor() {
				return this.vendor;
			}

			public void setVendor(Long vendor) {
				this.vendor = vendor;
			}

			public List<HistoryItem> getItems() {
				return this.items;
			}

			public void setItems(List<HistoryItem> items) {
				this.items = items;
			}

			public static class HistoryItem {

				private Long calculateTime;

				private Integer assetTotalCount;

				private Double installRatio;

				private Integer installedAssetCount;

				public Long getCalculateTime() {
					return this.calculateTime;
				}

				public void setCalculateTime(Long calculateTime) {
					this.calculateTime = calculateTime;
				}

				public Integer getAssetTotalCount() {
					return this.assetTotalCount;
				}

				public void setAssetTotalCount(Integer assetTotalCount) {
					this.assetTotalCount = assetTotalCount;
				}

				public Double getInstallRatio() {
					return this.installRatio;
				}

				public void setInstallRatio(Double installRatio) {
					this.installRatio = installRatio;
				}

				public Integer getInstalledAssetCount() {
					return this.installedAssetCount;
				}

				public void setInstalledAssetCount(Integer installedAssetCount) {
					this.installedAssetCount = installedAssetCount;
				}
			}
		}

		public static class CurrentItemsItem {

			private Long vendor;

			private List<ItemsItem> items1;

			public Long getVendor() {
				return this.vendor;
			}

			public void setVendor(Long vendor) {
				this.vendor = vendor;
			}

			public List<ItemsItem> getItems1() {
				return this.items1;
			}

			public void setItems1(List<ItemsItem> items1) {
				this.items1 = items1;
			}

			public static class ItemsItem {

				private Long calculateTime;

				private Integer assetTotalCount;

				private Double installRatio;

				private Integer installedAssetCount;

				public Long getCalculateTime() {
					return this.calculateTime;
				}

				public void setCalculateTime(Long calculateTime) {
					this.calculateTime = calculateTime;
				}

				public Integer getAssetTotalCount() {
					return this.assetTotalCount;
				}

				public void setAssetTotalCount(Integer assetTotalCount) {
					this.assetTotalCount = assetTotalCount;
				}

				public Double getInstallRatio() {
					return this.installRatio;
				}

				public void setInstallRatio(Double installRatio) {
					this.installRatio = installRatio;
				}

				public Integer getInstalledAssetCount() {
					return this.installedAssetCount;
				}

				public void setInstalledAssetCount(Integer installedAssetCount) {
					this.installedAssetCount = installedAssetCount;
				}
			}
		}
	}

	public static class ClientOnlineRatio {

		private List<HistoryItemsItem4> historyItems2;

		private List<CurrentItemsItem7> currentItems3;

		public List<HistoryItemsItem4> getHistoryItems2() {
			return this.historyItems2;
		}

		public void setHistoryItems2(List<HistoryItemsItem4> historyItems2) {
			this.historyItems2 = historyItems2;
		}

		public List<CurrentItemsItem7> getCurrentItems3() {
			return this.currentItems3;
		}

		public void setCurrentItems3(List<CurrentItemsItem7> currentItems3) {
			this.currentItems3 = currentItems3;
		}

		public static class HistoryItemsItem4 {

			private Long vendor;

			private List<HistoryItem6> items5;

			public Long getVendor() {
				return this.vendor;
			}

			public void setVendor(Long vendor) {
				this.vendor = vendor;
			}

			public List<HistoryItem6> getItems5() {
				return this.items5;
			}

			public void setItems5(List<HistoryItem6> items5) {
				this.items5 = items5;
			}

			public static class HistoryItem6 {

				private Long calculateTime;

				private Integer assetInstallCount;

				private Double onlineRatio;

				private Integer onlineAssetCount;

				public Long getCalculateTime() {
					return this.calculateTime;
				}

				public void setCalculateTime(Long calculateTime) {
					this.calculateTime = calculateTime;
				}

				public Integer getAssetInstallCount() {
					return this.assetInstallCount;
				}

				public void setAssetInstallCount(Integer assetInstallCount) {
					this.assetInstallCount = assetInstallCount;
				}

				public Double getOnlineRatio() {
					return this.onlineRatio;
				}

				public void setOnlineRatio(Double onlineRatio) {
					this.onlineRatio = onlineRatio;
				}

				public Integer getOnlineAssetCount() {
					return this.onlineAssetCount;
				}

				public void setOnlineAssetCount(Integer onlineAssetCount) {
					this.onlineAssetCount = onlineAssetCount;
				}
			}
		}

		public static class CurrentItemsItem7 {

			private Long vendor;

			private List<ItemsItem9> items8;

			public Long getVendor() {
				return this.vendor;
			}

			public void setVendor(Long vendor) {
				this.vendor = vendor;
			}

			public List<ItemsItem9> getItems8() {
				return this.items8;
			}

			public void setItems8(List<ItemsItem9> items8) {
				this.items8 = items8;
			}

			public static class ItemsItem9 {

				private Long calculateTime;

				private Integer assetInstallCount;

				private Double onlineRatio;

				private Integer onlineAssetCount;

				public Long getCalculateTime() {
					return this.calculateTime;
				}

				public void setCalculateTime(Long calculateTime) {
					this.calculateTime = calculateTime;
				}

				public Integer getAssetInstallCount() {
					return this.assetInstallCount;
				}

				public void setAssetInstallCount(Integer assetInstallCount) {
					this.assetInstallCount = assetInstallCount;
				}

				public Double getOnlineRatio() {
					return this.onlineRatio;
				}

				public void setOnlineRatio(Double onlineRatio) {
					this.onlineRatio = onlineRatio;
				}

				public Integer getOnlineAssetCount() {
					return this.onlineAssetCount;
				}

				public void setOnlineAssetCount(Integer onlineAssetCount) {
					this.onlineAssetCount = onlineAssetCount;
				}
			}
		}
	}

	@Override
	public GetClientRatioStatisticResponse getInstance(UnmarshallerContext context) {
		return	GetClientRatioStatisticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
