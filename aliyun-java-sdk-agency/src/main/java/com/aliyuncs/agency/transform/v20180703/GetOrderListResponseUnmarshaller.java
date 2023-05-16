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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.GetOrderListResponse;
import com.aliyuncs.agency.model.v20180703.GetOrderListResponse.PageInfo;
import com.aliyuncs.agency.model.v20180703.GetOrderListResponse.PopOrderJson;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderListResponseUnmarshaller {

	public static GetOrderListResponse unmarshall(GetOrderListResponse getOrderListResponse, UnmarshallerContext _ctx) {
		
		getOrderListResponse.setCode(_ctx.stringValue("GetOrderListResponse.Code"));
		getOrderListResponse.setMessage(_ctx.stringValue("GetOrderListResponse.Message"));
		getOrderListResponse.setSuccess(_ctx.booleanValue("GetOrderListResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetOrderListResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetOrderListResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetOrderListResponse.PageInfo.Page"));
		getOrderListResponse.setPageInfo(pageInfo);

		List<PopOrderJson> data = new ArrayList<PopOrderJson>();
		for (int i = 0; i < _ctx.lengthValue("GetOrderListResponse.Data.Length"); i++) {
			PopOrderJson popOrderJson = new PopOrderJson();
			popOrderJson.setAnotherPay(_ctx.integerValue("GetOrderListResponse.Data["+ i +"].AnotherPay"));
			popOrderJson.setOrderStatus(_ctx.longValue("GetOrderListResponse.Data["+ i +"].OrderStatus"));
			popOrderJson.setRamUid(_ctx.longValue("GetOrderListResponse.Data["+ i +"].RamUid"));
			popOrderJson.setOrderTypeName(_ctx.stringValue("GetOrderListResponse.Data["+ i +"].OrderTypeName"));
			popOrderJson.setPayTime(_ctx.stringValue("GetOrderListResponse.Data["+ i +"].PayTime"));
			popOrderJson.setGmtCreate(_ctx.stringValue("GetOrderListResponse.Data["+ i +"].GmtCreate"));
			popOrderJson.setPayment(_ctx.stringValue("GetOrderListResponse.Data["+ i +"].Payment"));
			popOrderJson.setOrderId(_ctx.longValue("GetOrderListResponse.Data["+ i +"].OrderId"));
			popOrderJson.setFee(_ctx.stringValue("GetOrderListResponse.Data["+ i +"].Fee"));
			popOrderJson.setArticleName(_ctx.stringValue("GetOrderListResponse.Data["+ i +"].ArticleName"));

			data.add(popOrderJson);
		}
		getOrderListResponse.setData(data);
	 
	 	return getOrderListResponse;
	}
}