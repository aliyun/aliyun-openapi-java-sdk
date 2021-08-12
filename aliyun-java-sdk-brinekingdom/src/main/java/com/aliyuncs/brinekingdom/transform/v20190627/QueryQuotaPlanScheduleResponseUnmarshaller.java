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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.QueryQuotaPlanScheduleResponse;
import com.aliyuncs.brinekingdom.model.v20190627.QueryQuotaPlanScheduleResponse.ResultItem;
import com.aliyuncs.brinekingdom.model.v20190627.QueryQuotaPlanScheduleResponse.ResultItem.LadingScheduleListItem;
import com.aliyuncs.brinekingdom.model.v20190627.QueryQuotaPlanScheduleResponse.ResultItem.LadingScheduleListItem.ServerScheduleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryQuotaPlanScheduleResponseUnmarshaller {

	public static QueryQuotaPlanScheduleResponse unmarshall(QueryQuotaPlanScheduleResponse queryQuotaPlanScheduleResponse, UnmarshallerContext _ctx) {
		
		queryQuotaPlanScheduleResponse.setRequestId(_ctx.stringValue("QueryQuotaPlanScheduleResponse.RequestId"));
		queryQuotaPlanScheduleResponse.setSuccess(_ctx.booleanValue("QueryQuotaPlanScheduleResponse.Success"));
		queryQuotaPlanScheduleResponse.setErrorMessage(_ctx.stringValue("QueryQuotaPlanScheduleResponse.ErrorMessage"));
		queryQuotaPlanScheduleResponse.setResultCode(_ctx.stringValue("QueryQuotaPlanScheduleResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryQuotaPlanScheduleResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setQuotaPlanId(_ctx.longValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].QuotaPlanId"));
			resultItem.setProductCode(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].ProductCode"));
			resultItem.setCreatorNick(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].CreatorNick"));
			resultItem.setCreatorWorkNo(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].CreatorWorkNo"));
			resultItem.setConfigModel(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].ConfigModel"));
			resultItem.setQuantity(_ctx.integerValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].Quantity"));
			resultItem.setDeliveryDate(_ctx.longValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].DeliveryDate"));
			resultItem.setTenantName(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].TenantName"));
			resultItem.setStatus(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].Status"));

			List<LadingScheduleListItem> ladingScheduleList = new ArrayList<LadingScheduleListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList.Length"); j++) {
				LadingScheduleListItem ladingScheduleListItem = new LadingScheduleListItem();
				ladingScheduleListItem.setLadingId(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].LadingId"));
				ladingScheduleListItem.setQuantity(_ctx.integerValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].Quantity"));
				ladingScheduleListItem.setDeliveryQuantity(_ctx.integerValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].DeliveryQuantity"));
				ladingScheduleListItem.setStatus(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].Status"));

				List<ServerScheduleListItem> serverScheduleList = new ArrayList<ServerScheduleListItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].ServerScheduleList.Length"); k++) {
					ServerScheduleListItem serverScheduleListItem = new ServerScheduleListItem();
					serverScheduleListItem.setSerialNumber(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].ServerScheduleList["+ k +"].SerialNumber"));
					serverScheduleListItem.setStatus(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].ServerScheduleList["+ k +"].Status"));
					serverScheduleListItem.setDelivery(_ctx.booleanValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].ServerScheduleList["+ k +"].Delivery"));
					serverScheduleListItem.setType(_ctx.stringValue("QueryQuotaPlanScheduleResponse.Result["+ i +"].LadingScheduleList["+ j +"].ServerScheduleList["+ k +"].Type"));

					serverScheduleList.add(serverScheduleListItem);
				}
				ladingScheduleListItem.setServerScheduleList(serverScheduleList);

				ladingScheduleList.add(ladingScheduleListItem);
			}
			resultItem.setLadingScheduleList(ladingScheduleList);

			result.add(resultItem);
		}
		queryQuotaPlanScheduleResponse.setResult(result);
	 
	 	return queryQuotaPlanScheduleResponse;
	}
}