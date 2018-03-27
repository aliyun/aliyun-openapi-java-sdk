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

import com.aliyuncs.phoenixsp_inner.model.v20160805.FindResourceInfoResponse;
import com.aliyuncs.phoenixsp_inner.model.v20160805.FindResourceInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindResourceInfoResponseUnmarshaller {

	public static FindResourceInfoResponse unmarshall(FindResourceInfoResponse findResourceInfoResponse, UnmarshallerContext context) {
		
		findResourceInfoResponse.setRequestId(context.stringValue("FindResourceInfoResponse.RequestId"));
		findResourceInfoResponse.setCode(context.stringValue("FindResourceInfoResponse.Code"));
		findResourceInfoResponse.setCount(context.integerValue("FindResourceInfoResponse.Count"));

		List<Data> datas = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("FindResourceInfoResponse.Datas.Length"); i++) {
			Data data = new Data();
			data.setAliuid(context.longValue("FindResourceInfoResponse.Datas["+ i +"].Aliuid"));
			data.setBuyerId(context.longValue("FindResourceInfoResponse.Datas["+ i +"].BuyerId"));
			data.setInstanceId(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].InstanceId"));
			data.setRegion(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].Region"));
			data.setResourceType(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].ResourceType"));
			data.setChargeType(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].ChargeType"));
			data.setEndTime(context.longValue("FindResourceInfoResponse.Datas["+ i +"].EndTime"));
			data.setReleaseTime(context.longValue("FindResourceInfoResponse.Datas["+ i +"].ReleaseTime"));
			data.setExtraEndTime(context.longValue("FindResourceInfoResponse.Datas["+ i +"].ExtraEndTime"));
			data.setResCreateTime(context.longValue("FindResourceInfoResponse.Datas["+ i +"].ResCreateTime"));
			data.setBillingTag(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].BillingTag"));
			data.setCommodityCode(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].CommodityCode"));
			data.setResourceStatus(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].ResourceStatus"));
			data.setResourceSubStatus(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].ResourceSubStatus"));
			data.setExpectedReleaseTime(context.longValue("FindResourceInfoResponse.Datas["+ i +"].ExpectedReleaseTime"));
			data.setBid(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].Bid"));
			data.setAutoRenewal(context.booleanValue("FindResourceInfoResponse.Datas["+ i +"].AutoRenewal"));
			data.setRenewalStatus(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].RenewalStatus"));
			data.setRenewalDuration(context.integerValue("FindResourceInfoResponse.Datas["+ i +"].RenewalDuration"));
			data.setRenewalCycUnit(context.integerValue("FindResourceInfoResponse.Datas["+ i +"].RenewalCycUnit"));
			data.setSaleCycle(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].SaleCycle"));
			data.setMarketType(context.stringValue("FindResourceInfoResponse.Datas["+ i +"].MarketType"));

			datas.add(data);
		}
		findResourceInfoResponse.setDatas(datas);
	 
	 	return findResourceInfoResponse;
	}
}