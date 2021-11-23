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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAvailableInstancesResponseUnmarshaller {

	public static QueryAvailableInstancesResponse unmarshall(QueryAvailableInstancesResponse queryAvailableInstancesResponse, UnmarshallerContext _ctx) {
		
		queryAvailableInstancesResponse.setRequestId(_ctx.stringValue("QueryAvailableInstancesResponse.RequestId"));
		queryAvailableInstancesResponse.setCode(_ctx.stringValue("QueryAvailableInstancesResponse.Code"));
		queryAvailableInstancesResponse.setMessage(_ctx.stringValue("QueryAvailableInstancesResponse.Message"));
		queryAvailableInstancesResponse.setSuccess(_ctx.booleanValue("QueryAvailableInstancesResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QueryAvailableInstancesResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryAvailableInstancesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryAvailableInstancesResponse.Data.TotalCount"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("QueryAvailableInstancesResponse.Data.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setSubStatus(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].SubStatus"));
			instance.setStatus(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].Status"));
			instance.setExpectedReleaseTime(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].ExpectedReleaseTime"));
			instance.setRenewStatus(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].RenewStatus"));
			instance.setCreateTime(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].CreateTime"));
			instance.setSellerId(_ctx.longValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].SellerId"));
			instance.setInstanceID(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].InstanceID"));
			instance.setSeller(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].Seller"));
			instance.setStopTime(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].StopTime"));
			instance.setRenewalDurationUnit(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].RenewalDurationUnit"));
			instance.setSubscriptionType(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].SubscriptionType"));
			instance.setOwnerId(_ctx.longValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].OwnerId"));
			instance.setEndTime(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].EndTime"));
			instance.setProductType(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].ProductType"));
			instance.setRegion(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].Region"));
			instance.setReleaseTime(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].ReleaseTime"));
			instance.setRenewalDuration(_ctx.integerValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].RenewalDuration"));
			instance.setProductCode(_ctx.stringValue("QueryAvailableInstancesResponse.Data.InstanceList["+ i +"].ProductCode"));

			instanceList.add(instance);
		}
		data.setInstanceList(instanceList);
		queryAvailableInstancesResponse.setData(data);
	 
	 	return queryAvailableInstancesResponse;
	}
}