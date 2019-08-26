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

	public static QueryOrderLogisticsResponse unmarshall(QueryOrderLogisticsResponse queryOrderLogisticsResponse, UnmarshallerContext _ctx) {
		
		queryOrderLogisticsResponse.setRequestId(_ctx.stringValue("QueryOrderLogisticsResponse.RequestId"));
		queryOrderLogisticsResponse.setCode(_ctx.stringValue("QueryOrderLogisticsResponse.Code"));
		queryOrderLogisticsResponse.setMessage(_ctx.stringValue("QueryOrderLogisticsResponse.Message"));

		OrderLogistics orderLogistics = new OrderLogistics();
		orderLogistics.setDataProvider(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.DataProvider"));
		orderLogistics.setDataProviderTitle(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.DataProviderTitle"));
		orderLogistics.setLogisticsCompanyCode(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsCompanyCode"));
		orderLogistics.setLogisticsCompanyName(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsCompanyName"));

		Receiver receiver = new Receiver();
		receiver.setAddress(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Receiver.Address"));
		receiver.setName(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Receiver.Name"));
		receiver.setPhoneNumber(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Receiver.PhoneNumber"));
		receiver.setZipCode(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Receiver.ZipCode"));
		orderLogistics.setReceiver(receiver);

		Fetcher fetcher = new Fetcher();
		fetcher.setAddress(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Fetcher.Address"));
		fetcher.setName(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Fetcher.Name"));
		fetcher.setPhoneNumber(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Fetcher.PhoneNumber"));
		fetcher.setZipCode(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.Fetcher.ZipCode"));
		orderLogistics.setFetcher(fetcher);

		List<LogisticsDetailListItem> logisticsDetailList = new ArrayList<LogisticsDetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailList.Length"); i++) {
			LogisticsDetailListItem logisticsDetailListItem = new LogisticsDetailListItem();
			logisticsDetailListItem.setOcurrTimeStr(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailList["+ i +"].OcurrTimeStr"));
			logisticsDetailListItem.setStanderdDesc(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailList["+ i +"].StanderdDesc"));
			logisticsDetailListItem.setStatusIcon(_ctx.stringValue("QueryOrderLogisticsResponse.OrderLogistics.LogisticsDetailList["+ i +"].StatusIcon"));

			logisticsDetailList.add(logisticsDetailListItem);
		}
		orderLogistics.setLogisticsDetailList(logisticsDetailList);
		queryOrderLogisticsResponse.setOrderLogistics(orderLogistics);
	 
	 	return queryOrderLogisticsResponse;
	}
}