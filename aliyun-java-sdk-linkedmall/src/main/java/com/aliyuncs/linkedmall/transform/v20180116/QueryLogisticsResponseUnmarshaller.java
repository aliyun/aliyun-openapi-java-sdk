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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryLogisticsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryLogisticsResponse.DataItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryLogisticsResponse.DataItem.GoodsItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryLogisticsResponse.DataItem.LogisticsDetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLogisticsResponseUnmarshaller {

	public static QueryLogisticsResponse unmarshall(QueryLogisticsResponse queryLogisticsResponse, UnmarshallerContext context) {
		
		queryLogisticsResponse.setRequestId(context.stringValue("QueryLogisticsResponse.RequestId"));
		queryLogisticsResponse.setCode(context.stringValue("QueryLogisticsResponse.Code"));
		queryLogisticsResponse.setMessage(context.stringValue("QueryLogisticsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("QueryLogisticsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMailNo(context.stringValue("QueryLogisticsResponse.Data["+ i +"].MailNo"));
			dataItem.setDataProvider(context.stringValue("QueryLogisticsResponse.Data["+ i +"].DataProvider"));
			dataItem.setDataProviderTitle(context.stringValue("QueryLogisticsResponse.Data["+ i +"].DataProviderTitle"));
			dataItem.setLogisticsCompanyName(context.stringValue("QueryLogisticsResponse.Data["+ i +"].LogisticsCompanyName"));

			List<LogisticsDetailListItem> logisticsDetailList = new ArrayList<LogisticsDetailListItem>();
			for (int j = 0; j < context.lengthValue("QueryLogisticsResponse.Data["+ i +"].LogisticsDetailList.Length"); j++) {
				LogisticsDetailListItem logisticsDetailListItem = new LogisticsDetailListItem();
				logisticsDetailListItem.setStanderdDesc(context.stringValue("QueryLogisticsResponse.Data["+ i +"].LogisticsDetailList["+ j +"].StanderdDesc"));
				logisticsDetailListItem.setOcurrTimeStr(context.stringValue("QueryLogisticsResponse.Data["+ i +"].LogisticsDetailList["+ j +"].OcurrTimeStr"));

				logisticsDetailList.add(logisticsDetailListItem);
			}
			dataItem.setLogisticsDetailList(logisticsDetailList);

			List<GoodsItem> goods = new ArrayList<GoodsItem>();
			for (int j = 0; j < context.lengthValue("QueryLogisticsResponse.Data["+ i +"].Goods.Length"); j++) {
				GoodsItem goodsItem = new GoodsItem();
				goodsItem.setGoodName(context.stringValue("QueryLogisticsResponse.Data["+ i +"].Goods["+ j +"].GoodName"));
				goodsItem.setQuantity(context.integerValue("QueryLogisticsResponse.Data["+ i +"].Goods["+ j +"].Quantity"));

				goods.add(goodsItem);
			}
			dataItem.setGoods(goods);

			data.add(dataItem);
		}
		queryLogisticsResponse.setData(data);
	 
	 	return queryLogisticsResponse;
	}
}