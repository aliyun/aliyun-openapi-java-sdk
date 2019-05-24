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

import com.aliyuncs.linkedmall.model.v20180116.QueryOrderLogisticsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderLogisticsResponse.OrderLogistics;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderLogisticsResponse.OrderLogistics.Fetcher;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailListItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderLogisticsResponse.OrderLogistics.Receiver;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderLogisticsResponseUnmarshaller {

	public static QueryOrderLogisticsResponse unmarshall(QueryOrderLogisticsResponse queryOrderLogisticsResponse, UnmarshallerContext context) {
		
		queryOrderLogisticsResponse.setRequestId(context.stringValue("QueryOrderLogisticsResponse.RequestId"));
		queryOrderLogisticsResponse.setCode(context.stringValue("QueryOrderLogisticsResponse.Code"));
		queryOrderLogisticsResponse.setMessage(context.stringValue("QueryOrderLogisticsResponse.Message"));

		OrderLogistics orderLogistics = new OrderLogistics();
		orderLogistics.setDataProvider(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.DataProvider"));
		orderLogistics.setDataProviderTitle(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.DataProviderTitle"));
		orderLogistics.setLogisticsCompanyCode(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsCompanyCode"));
		orderLogistics.setLogisticsCompanyName(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsCompanyName"));

		Receiver receiver = new Receiver();
		receiver.setAddress(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Receiver.Address"));
		receiver.setName(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Receiver.Name"));
		receiver.setPhoneNumber(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Receiver.PhoneNumber"));
		receiver.setZipCode(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Receiver.ZipCode"));
		orderLogistics.setReceiver(receiver);

		Fetcher fetcher = new Fetcher();
		fetcher.setAddress(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Fetcher.Address"));
		fetcher.setName(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Fetcher.Name"));
		fetcher.setPhoneNumber(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Fetcher.PhoneNumber"));
		fetcher.setZipCode(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Fetcher.ZipCode"));
		orderLogistics.setFetcher(fetcher);

		List<LogisticsDetailListItem> logisticsDetailList = new ArrayList<LogisticsDetailListItem>();
		for (int i = 0; i < context.lengthValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailList.Length"); i++) {
			LogisticsDetailListItem logisticsDetailListItem = new LogisticsDetailListItem();
			logisticsDetailListItem.setOcurrTimeStr(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailList["+ i +"].OcurrTimeStr"));
			logisticsDetailListItem.setStanderdDesc(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailList["+ i +"].StanderdDesc"));
			logisticsDetailListItem.setStatusIcon(context.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailList["+ i +"].StatusIcon"));

			logisticsDetailList.add(logisticsDetailListItem);
		}
		orderLogistics.setLogisticsDetailList(logisticsDetailList);
		queryOrderLogisticsResponse.setOrderLogistics(orderLogistics);
	 
	 	return queryOrderLogisticsResponse;
	}
}