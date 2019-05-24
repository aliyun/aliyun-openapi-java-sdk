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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryOrderLogisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderLogisticsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private OrderLogistics orderLogistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OrderLogistics getOrderLogistics() {
		return this.orderLogistics;
	}

	public void setOrderLogistics(OrderLogistics orderLogistics) {
		this.orderLogistics = orderLogistics;
	}

	public static class OrderLogistics {

		private String dataProvider;

		private String dataProviderTitle;

		private String logisticsCompanyCode;

		private String logisticsCompanyName;

		private List<LogisticsDetailListItem> logisticsDetailList;

		private Receiver receiver;

		private Fetcher fetcher;

		public String getDataProvider() {
			return this.dataProvider;
		}

		public void setDataProvider(String dataProvider) {
			this.dataProvider = dataProvider;
		}

		public String getDataProviderTitle() {
			return this.dataProviderTitle;
		}

		public void setDataProviderTitle(String dataProviderTitle) {
			this.dataProviderTitle = dataProviderTitle;
		}

		public String getLogisticsCompanyCode() {
			return this.logisticsCompanyCode;
		}

		public void setLogisticsCompanyCode(String logisticsCompanyCode) {
			this.logisticsCompanyCode = logisticsCompanyCode;
		}

		public String getLogisticsCompanyName() {
			return this.logisticsCompanyName;
		}

		public void setLogisticsCompanyName(String logisticsCompanyName) {
			this.logisticsCompanyName = logisticsCompanyName;
		}

		public List<LogisticsDetailListItem> getLogisticsDetailList() {
			return this.logisticsDetailList;
		}

		public void setLogisticsDetailList(List<LogisticsDetailListItem> logisticsDetailList) {
			this.logisticsDetailList = logisticsDetailList;
		}

		public Receiver getReceiver() {
			return this.receiver;
		}

		public void setReceiver(Receiver receiver) {
			this.receiver = receiver;
		}

		public Fetcher getFetcher() {
			return this.fetcher;
		}

		public void setFetcher(Fetcher fetcher) {
			this.fetcher = fetcher;
		}

		public static class LogisticsDetailListItem {

			private String ocurrTimeStr;

			private String standerdDesc;

			private String statusIcon;

			public String getOcurrTimeStr() {
				return this.ocurrTimeStr;
			}

			public void setOcurrTimeStr(String ocurrTimeStr) {
				this.ocurrTimeStr = ocurrTimeStr;
			}

			public String getStanderdDesc() {
				return this.standerdDesc;
			}

			public void setStanderdDesc(String standerdDesc) {
				this.standerdDesc = standerdDesc;
			}

			public String getStatusIcon() {
				return this.statusIcon;
			}

			public void setStatusIcon(String statusIcon) {
				this.statusIcon = statusIcon;
			}
		}

		public static class Receiver {

			private String address;

			private String name;

			private String phoneNumber;

			private String zipCode;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getZipCode() {
				return this.zipCode;
			}

			public void setZipCode(String zipCode) {
				this.zipCode = zipCode;
			}
		}

		public static class Fetcher {

			private String address;

			private String name;

			private String phoneNumber;

			private String zipCode;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getZipCode() {
				return this.zipCode;
			}

			public void setZipCode(String zipCode) {
				this.zipCode = zipCode;
			}
		}
	}

	@Override
	public QueryOrderLogisticsResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderLogisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
