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

import com.aliyuncs.bssopenapi.model.v20171214.QueryResourcePackageInstancesResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryResourcePackageInstancesResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryResourcePackageInstancesResponse.Data.Instance;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryResourcePackageInstancesResponseUnmarshaller {

	public static QueryResourcePackageInstancesResponse unmarshall(QueryResourcePackageInstancesResponse queryResourcePackageInstancesResponse, UnmarshallerContext context) {
		
		queryResourcePackageInstancesResponse.setRequestId(context.stringValue("QueryResourcePackageInstancesResponse.RequestId"));
		queryResourcePackageInstancesResponse.setSuccess(context.booleanValue("QueryResourcePackageInstancesResponse.Success"));
		queryResourcePackageInstancesResponse.setCode(context.stringValue("QueryResourcePackageInstancesResponse.Code"));
		queryResourcePackageInstancesResponse.setMessage(context.stringValue("QueryResourcePackageInstancesResponse.Message"));
		queryResourcePackageInstancesResponse.setPage(context.integerValue("QueryResourcePackageInstancesResponse.Page"));
		queryResourcePackageInstancesResponse.setPageSize(context.integerValue("QueryResourcePackageInstancesResponse.PageSize"));
		queryResourcePackageInstancesResponse.setTotal(context.integerValue("QueryResourcePackageInstancesResponse.Total"));

		Data data = new Data();
		data.setHostId(context.stringValue("QueryResourcePackageInstancesResponse.Data.HostId"));
		data.setPageNum(context.stringValue("QueryResourcePackageInstancesResponse.Data.PageNum"));
		data.setPageSize(context.stringValue("QueryResourcePackageInstancesResponse.Data.PageSize"));
		data.setTotalCount(context.stringValue("QueryResourcePackageInstancesResponse.Data.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("QueryResourcePackageInstancesResponse.Data.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].InstanceId"));
			instance.setRegion(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].Region"));
			instance.setTotalAmount(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].TotalAmount"));
			instance.setTotalAmountUnit(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].TotalAmountUnit"));
			instance.setRemainingAmount(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].RemainingAmount"));
			instance.setRemainingAmountUnit(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].RemainingAmountUnit"));
			instance.setEffectiveTime(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].EffectiveTime"));
			instance.setExpiryTime(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].ExpiryTime"));
			instance.setRemark(context.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].Remark"));

			instances.add(instance);
		}
		data.setInstances(instances);
		queryResourcePackageInstancesResponse.setData(data);
	 
	 	return queryResourcePackageInstancesResponse;
	}
}