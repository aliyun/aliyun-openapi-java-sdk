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

package com.aliyuncs.phoenixsp_inner.transform.v20160805;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.phoenixsp_inner.model.v20160805.FindUserAvailableResourcesByResponse;
import com.aliyuncs.phoenixsp_inner.model.v20160805.FindUserAvailableResourcesByResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindUserAvailableResourcesByResponseUnmarshaller {

	public static FindUserAvailableResourcesByResponse unmarshall(FindUserAvailableResourcesByResponse findUserAvailableResourcesByResponse, UnmarshallerContext context) {
		
		findUserAvailableResourcesByResponse.setRequestId(context.stringValue("FindUserAvailableResourcesByResponse.RequestId"));
		findUserAvailableResourcesByResponse.setCode(context.stringValue("FindUserAvailableResourcesByResponse.Code"));
		findUserAvailableResourcesByResponse.setCount(context.integerValue("FindUserAvailableResourcesByResponse.Count"));

		List<Data> datas = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("FindUserAvailableResourcesByResponse.Datas.Length"); i++) {
			Data data = new Data();
			data.setAliuid(context.longValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].Aliuid"));
			data.setBuyerId(context.longValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].BuyerId"));
			data.setInstanceId(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].InstanceId"));
			data.setRegion(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].Region"));
			data.setResourceType(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].ResourceType"));
			data.setChargeType(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].ChargeType"));
			data.setEndTime(context.longValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].EndTime"));
			data.setReleaseTime(context.longValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].ReleaseTime"));
			data.setExtraEndTime(context.longValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].ExtraEndTime"));
			data.setResCreateTime(context.longValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].ResCreateTime"));
			data.setBillingTag(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].BillingTag"));
			data.setCommodityCode(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].CommodityCode"));
			data.setResourceStatus(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].ResourceStatus"));
			data.setResourceSubStatus(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].ResourceSubStatus"));
			data.setExpectedReleaseTime(context.longValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].ExpectedReleaseTime"));
			data.setBid(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].Bid"));
			data.setAutoRenewal(context.booleanValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].AutoRenewal"));
			data.setRenewalStatus(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].RenewalStatus"));
			data.setRenewalDuration(context.integerValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].RenewalDuration"));
			data.setRenewalCycUnit(context.integerValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].RenewalCycUnit"));
			data.setSaleCycle(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].SaleCycle"));
			data.setMarketType(context.stringValue("FindUserAvailableResourcesByResponse.Datas["+ i +"].MarketType"));

			datas.add(data);
		}
		findUserAvailableResourcesByResponse.setDatas(datas);
	 
	 	return findUserAvailableResourcesByResponse;
	}
}