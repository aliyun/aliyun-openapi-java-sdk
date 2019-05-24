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
import com.aliyuncs.linkedmall.transform.v20180116.QueryLogisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLogisticsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String mailNo;

		private String dataProvider;

		private String dataProviderTitle;

		private String logisticsCompanyName;

		private List<LogisticsDetailListItem> logisticsDetailList;

		private List<GoodsItem> goods;

		public String getMailNo() {
			return this.mailNo;
		}

		public void setMailNo(String mailNo) {
			this.mailNo = mailNo;
		}

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

		public List<GoodsItem> getGoods() {
			return this.goods;
		}

		public void setGoods(List<GoodsItem> goods) {
			this.goods = goods;
		}

		public static class LogisticsDetailListItem {

			private String standerdDesc;

			private String ocurrTimeStr;

			public String getStanderdDesc() {
				return this.standerdDesc;
			}

			public void setStanderdDesc(String standerdDesc) {
				this.standerdDesc = standerdDesc;
			}

			public String getOcurrTimeStr() {
				return this.ocurrTimeStr;
			}

			public void setOcurrTimeStr(String ocurrTimeStr) {
				this.ocurrTimeStr = ocurrTimeStr;
			}
		}

		public static class GoodsItem {

			private String goodName;

			private Integer quantity;

			private Long itemId;

			public String getGoodName() {
				return this.goodName;
			}

			public void setGoodName(String goodName) {
				this.goodName = goodName;
			}

			public Integer getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}
		}
	}

	@Override
	public QueryLogisticsResponse getInstance(UnmarshallerContext context) {
		return	QueryLogisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
