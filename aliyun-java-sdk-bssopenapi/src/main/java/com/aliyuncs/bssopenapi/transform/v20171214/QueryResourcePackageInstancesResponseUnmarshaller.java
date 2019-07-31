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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryResourcePackageInstancesResponseUnmarshaller {

	public static QueryResourcePackageInstancesResponse unmarshall(QueryResourcePackageInstancesResponse queryResourcePackageInstancesResponse, UnmarshallerContext _ctx) {
		
		queryResourcePackageInstancesResponse.setRequestId(_ctx.stringValue("QueryResourcePackageInstancesResponse.RequestId"));
		queryResourcePackageInstancesResponse.setSuccess(_ctx.booleanValue("QueryResourcePackageInstancesResponse.Success"));
		queryResourcePackageInstancesResponse.setCode(_ctx.stringValue("QueryResourcePackageInstancesResponse.Code"));
		queryResourcePackageInstancesResponse.setMessage(_ctx.stringValue("QueryResourcePackageInstancesResponse.Message"));
		queryResourcePackageInstancesResponse.setPage(_ctx.integerValue("QueryResourcePackageInstancesResponse.Page"));
		queryResourcePackageInstancesResponse.setPageSize(_ctx.integerValue("QueryResourcePackageInstancesResponse.PageSize"));
		queryResourcePackageInstancesResponse.setTotal(_ctx.integerValue("QueryResourcePackageInstancesResponse.Total"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.HostId"));
		data.setPageNum(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.PageNum"));
		data.setPageSize(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("QueryResourcePackageInstancesResponse.Data.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].InstanceId"));
			instance.setRegion(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].Region"));
			instance.setTotalAmount(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].TotalAmount"));
			instance.setTotalAmountUnit(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].TotalAmountUnit"));
			instance.setRemainingAmount(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].RemainingAmount"));
			instance.setRemainingAmountUnit(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].RemainingAmountUnit"));
			instance.setEffectiveTime(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].EffectiveTime"));
			instance.setExpiryTime(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].ExpiryTime"));
			instance.setRemark(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].Remark"));
			instance.setPackageType(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].PackageType"));
			instance.setStatus(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].Status"));
			instance.setDeductType(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].DeductType"));

			List<String> applicableProducts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].ApplicableProducts.Length"); j++) {
				applicableProducts.add(_ctx.stringValue("QueryResourcePackageInstancesResponse.Data.Instances["+ i +"].ApplicableProducts["+ j +"]"));
			}
			instance.setApplicableProducts(applicableProducts);

			instances.add(instance);
		}
		data.setInstances(instances);
		queryResourcePackageInstancesResponse.setData(data);
	 
	 	return queryResourcePackageInstancesResponse;
	}
}