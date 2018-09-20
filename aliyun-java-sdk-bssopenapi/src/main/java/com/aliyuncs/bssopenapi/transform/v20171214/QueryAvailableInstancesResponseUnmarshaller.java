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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryAvailableInstancesResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAvailableInstancesResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAvailableInstancesResponse.Data.Instance;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAvailableInstancesResponseUnmarshaller {

	public static QueryAvailableInstancesResponse unmarshall(QueryAvailableInstancesResponse queryAvailableInstancesResponse, UnmarshallerContext context) {
		
		queryAvailableInstancesResponse.setRequestId(context.stringValue("QueryAvailableInstancesResponse.RequestId"));
		queryAvailableInstancesResponse.setSuccess(context.booleanValue("QueryAvailableInstancesResponse.Success"));
		queryAvailableInstancesResponse.setCode(context.stringValue("QueryAvailableInstancesResponse.Code"));
		queryAvailableInstancesResponse.setMessage(context.stringValue("QueryAvailableInstancesResponse.Message"));

		Data data = new Data();
		data.setPageNum(context.integerValue("QueryAvailableInstancesResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("QueryAvailableInstancesResponse.Data.PageSize"));
		data.setTotalCount(context.integerValue("QueryAvailableInstancesResponse.Data.TotalCount"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("QueryAvailableInstancesResponse.Data.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setOwnerId(context.longValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].OwnerId"));
			instance.setSellerId(context.longValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].SellerId"));
			instance.setProductCode(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].ProductCode"));
			instance.setProductType(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].ProductType"));
			instance.setSubscriptionType(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].SubscriptionType"));
			instance.setInstanceID(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].InstanceID"));
			instance.setRegion(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].Region"));
			instance.setCreateTime(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].CreateTime"));
			instance.setEndTime(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].EndTime"));
			instance.setStopTime(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].StopTime"));
			instance.setReleaseTime(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].ReleaseTime"));
			instance.setExpectedReleaseTime(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].ExpectedReleaseTime"));
			instance.setStatus(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].Status"));
			instance.setSubStatus(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].SubStatus"));
			instance.setRenewStatus(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].RenewStatus"));
			instance.setRenewalDuration(context.integerValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].RenewalDuration"));
			instance.setRenewalDurationUnit(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].RenewalDurationUnit"));
			instance.setSeller(context.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].Seller"));

			instanceList.add(instance);
		}
		data.setInstanceList(instanceList);
		queryAvailableInstancesResponse.setData(data);
	 
	 	return queryAvailableInstancesResponse;
	}
}