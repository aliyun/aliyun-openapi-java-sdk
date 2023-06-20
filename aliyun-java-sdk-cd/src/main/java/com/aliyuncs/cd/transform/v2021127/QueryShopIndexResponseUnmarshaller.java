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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.QueryShopIndexResponse;
import com.aliyuncs.cd.model.v2021127.QueryShopIndexResponse.Data;
import com.aliyuncs.cd.model.v2021127.QueryShopIndexResponse.Data.ShopIndex;
import com.aliyuncs.cd.model.v2021127.QueryShopIndexResponse.Data.ShopScheduleIndex;
import com.aliyuncs.cd.model.v2021127.QueryShopIndexResponse.Data.ShopScheduleIndex.FailShopsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryShopIndexResponseUnmarshaller {

	public static QueryShopIndexResponse unmarshall(QueryShopIndexResponse queryShopIndexResponse, UnmarshallerContext _ctx) {
		
		queryShopIndexResponse.setRequestId(_ctx.stringValue("QueryShopIndexResponse.RequestId"));
		queryShopIndexResponse.setSuccess(_ctx.booleanValue("QueryShopIndexResponse.Success"));
		queryShopIndexResponse.setMessage(_ctx.stringValue("QueryShopIndexResponse.Message"));
		queryShopIndexResponse.setCode(_ctx.stringValue("QueryShopIndexResponse.Code"));
		queryShopIndexResponse.setHttpStatusCode(_ctx.integerValue("QueryShopIndexResponse.HttpStatusCode"));

		Data data = new Data();

		ShopScheduleIndex shopScheduleIndex = new ShopScheduleIndex();
		shopScheduleIndex.setScheduleNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopScheduleIndex.ScheduleNum"));
		shopScheduleIndex.setScheduleShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopScheduleIndex.ScheduleShopNum"));
		shopScheduleIndex.setSuccessRate(_ctx.floatValue("QueryShopIndexResponse.Data.ShopScheduleIndex.SuccessRate"));
		shopScheduleIndex.setFailShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopScheduleIndex.FailShopNum"));
		shopScheduleIndex.setCostTime(_ctx.doubleValue("QueryShopIndexResponse.Data.ShopScheduleIndex.CostTime"));

		List<FailShopsItem> failShops = new ArrayList<FailShopsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryShopIndexResponse.Data.ShopScheduleIndex.FailShops.Length"); i++) {
			FailShopsItem failShopsItem = new FailShopsItem();
			failShopsItem.setShopId(_ctx.stringValue("QueryShopIndexResponse.Data.ShopScheduleIndex.FailShops["+ i +"].ShopId"));
			failShopsItem.setShopName(_ctx.stringValue("QueryShopIndexResponse.Data.ShopScheduleIndex.FailShops["+ i +"].ShopName"));

			failShops.add(failShopsItem);
		}
		shopScheduleIndex.setFailShops(failShops);
		data.setShopScheduleIndex(shopScheduleIndex);

		ShopIndex shopIndex = new ShopIndex();
		shopIndex.setShopTotal(_ctx.integerValue("QueryShopIndexResponse.Data.ShopIndex.ShopTotal"));
		shopIndex.setNetWorkShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopIndex.NetWorkShopNum"));
		shopIndex.setInstalledShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopIndex.InstalledShopNum"));
		shopIndex.setNotWorkShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopIndex.NotWorkShopNum"));
		shopIndex.setUpholdShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopIndex.UpholdShopNum"));
		shopIndex.setNormalShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopIndex.NormalShopNum"));
		shopIndex.setFaultShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopIndex.FaultShopNum"));
		shopIndex.setHighFreqFaultShopNum(_ctx.integerValue("QueryShopIndexResponse.Data.ShopIndex.HighFreqFaultShopNum"));
		data.setShopIndex(shopIndex);
		queryShopIndexResponse.setData(data);
	 
	 	return queryShopIndexResponse;
	}
}