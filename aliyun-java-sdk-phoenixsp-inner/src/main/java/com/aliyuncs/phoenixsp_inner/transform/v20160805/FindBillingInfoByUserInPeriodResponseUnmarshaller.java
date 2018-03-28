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

import com.aliyuncs.phoenixsp_inner.model.v20160805.FindBillingInfoByUserInPeriodResponse;
import com.aliyuncs.phoenixsp_inner.model.v20160805.FindBillingInfoByUserInPeriodResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindBillingInfoByUserInPeriodResponseUnmarshaller {

	public static FindBillingInfoByUserInPeriodResponse unmarshall(FindBillingInfoByUserInPeriodResponse findBillingInfoByUserInPeriodResponse, UnmarshallerContext context) {
		
		findBillingInfoByUserInPeriodResponse.setRequestId(context.stringValue("FindBillingInfoByUserInPeriodResponse.RequestId"));
		findBillingInfoByUserInPeriodResponse.setCode(context.stringValue("FindBillingInfoByUserInPeriodResponse.Code"));
		findBillingInfoByUserInPeriodResponse.setCount(context.integerValue("FindBillingInfoByUserInPeriodResponse.Count"));

		List<Data> datas = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("FindBillingInfoByUserInPeriodResponse.Datas.Length"); i++) {
			Data data = new Data();
			data.setAliUID(context.longValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].AliUID"));
			data.setResourceType(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].ResourceType"));
			data.setResourceStatus(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].ResourceStatus"));
			data.setInstanceId(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].InstanceId"));
			data.setBillingTag(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].BillingTag"));
			data.setChargeType(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].ChargeType"));
			data.setResourceSource(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].ResourceSource"));
			data.setCommodityCode(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].CommodityCode"));
			data.setPropertyDetail(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].PropertyDetail"));
			data.setOperation(context.stringValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].Operation"));
			data.setCommandStartTime(context.longValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].CommandStartTime"));
			data.setActualStartTime(context.longValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].ActualStartTime"));
			data.setExpectStartTime(context.longValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].ExpectStartTime"));
			data.setCommandEndTime(context.longValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].CommandEndTime"));
			data.setActualEndTime(context.longValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].ActualEndTime"));
			data.setExpectEndTime(context.longValue("FindBillingInfoByUserInPeriodResponse.Datas["+ i +"].ExpectEndTime"));

			datas.add(data);
		}
		findBillingInfoByUserInPeriodResponse.setDatas(datas);
	 
	 	return findBillingInfoByUserInPeriodResponse;
	}
}