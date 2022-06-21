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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetVerifiableInstancesResponse;
import com.aliyuncs.swas.model.v20170810.GetVerifiableInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVerifiableInstancesResponseUnmarshaller {

	public static GetVerifiableInstancesResponse unmarshall(GetVerifiableInstancesResponse getVerifiableInstancesResponse, UnmarshallerContext _ctx) {
		
		getVerifiableInstancesResponse.setRequestId(_ctx.stringValue("GetVerifiableInstancesResponse.RequestId"));
		getVerifiableInstancesResponse.setIsSuccess(_ctx.booleanValue("GetVerifiableInstancesResponse.IsSuccess"));
		getVerifiableInstancesResponse.setTotalCount(_ctx.integerValue("GetVerifiableInstancesResponse.TotalCount"));
		getVerifiableInstancesResponse.setPageSize(_ctx.integerValue("GetVerifiableInstancesResponse.PageSize"));
		getVerifiableInstancesResponse.setPageNo(_ctx.integerValue("GetVerifiableInstancesResponse.PageNo"));
		getVerifiableInstancesResponse.setCode(_ctx.stringValue("GetVerifiableInstancesResponse.Code"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("GetVerifiableInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setICP(_ctx.booleanValue("GetVerifiableInstancesResponse.Instances["+ i +"].ICP"));
			instance.setExpireTime(_ctx.longValue("GetVerifiableInstancesResponse.Instances["+ i +"].ExpireTime"));
			instance.setInternetIp(_ctx.stringValue("GetVerifiableInstancesResponse.Instances["+ i +"].InternetIp"));
			instance.setInstanceName(_ctx.stringValue("GetVerifiableInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setCreateTime(_ctx.longValue("GetVerifiableInstancesResponse.Instances["+ i +"].CreateTime"));
			instance.setExpireDate(_ctx.stringValue("GetVerifiableInstancesResponse.Instances["+ i +"].ExpireDate"));
			instance.setInstanceId(_ctx.stringValue("GetVerifiableInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setCreateDate(_ctx.stringValue("GetVerifiableInstancesResponse.Instances["+ i +"].CreateDate"));

			instances.add(instance);
		}
		getVerifiableInstancesResponse.setInstances(instances);
	 
	 	return getVerifiableInstancesResponse;
	}
}