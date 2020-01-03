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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.QueryServicePackAndPriceResponse;
import com.aliyuncs.ehpc.model.v20180412.QueryServicePackAndPriceResponse.ServicePackInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryServicePackAndPriceResponseUnmarshaller {

	public static QueryServicePackAndPriceResponse unmarshall(QueryServicePackAndPriceResponse queryServicePackAndPriceResponse, UnmarshallerContext _ctx) {
		
		queryServicePackAndPriceResponse.setRequestId(_ctx.stringValue("QueryServicePackAndPriceResponse.RequestId"));
		queryServicePackAndPriceResponse.setRegionId(_ctx.stringValue("QueryServicePackAndPriceResponse.RegionId"));
		queryServicePackAndPriceResponse.setTradePrice(_ctx.floatValue("QueryServicePackAndPriceResponse.TradePrice"));
		queryServicePackAndPriceResponse.setOriginalPrice(_ctx.floatValue("QueryServicePackAndPriceResponse.OriginalPrice"));
		queryServicePackAndPriceResponse.setDiscountPrice(_ctx.floatValue("QueryServicePackAndPriceResponse.DiscountPrice"));
		queryServicePackAndPriceResponse.setCurrency(_ctx.stringValue("QueryServicePackAndPriceResponse.Currency"));
		queryServicePackAndPriceResponse.setOriginalAmount(_ctx.integerValue("QueryServicePackAndPriceResponse.OriginalAmount"));
		queryServicePackAndPriceResponse.setChargeAmount(_ctx.integerValue("QueryServicePackAndPriceResponse.ChargeAmount"));

		List<ServicePackInfo> servicePack = new ArrayList<ServicePackInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryServicePackAndPriceResponse.ServicePack.Length"); i++) {
			ServicePackInfo servicePackInfo = new ServicePackInfo();
			servicePackInfo.setInstanceName(_ctx.stringValue("QueryServicePackAndPriceResponse.ServicePack["+ i +"].InstanceName"));
			servicePackInfo.setCapacity(_ctx.integerValue("QueryServicePackAndPriceResponse.ServicePack["+ i +"].Capacity"));
			servicePackInfo.setStartTime(_ctx.integerValue("QueryServicePackAndPriceResponse.ServicePack["+ i +"].StartTime"));
			servicePackInfo.setEndTime(_ctx.integerValue("QueryServicePackAndPriceResponse.ServicePack["+ i +"].EndTime"));

			servicePack.add(servicePackInfo);
		}
		queryServicePackAndPriceResponse.setServicePack(servicePack);
	 
	 	return queryServicePackAndPriceResponse;
	}
}