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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeInstancesInVaultResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeInstancesInVaultResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesInVaultResponseUnmarshaller {

	public static DescribeInstancesInVaultResponse unmarshall(DescribeInstancesInVaultResponse describeInstancesInVaultResponse, UnmarshallerContext _ctx) {
		
		describeInstancesInVaultResponse.setRequestId(_ctx.stringValue("DescribeInstancesInVaultResponse.RequestId"));
		describeInstancesInVaultResponse.setSuccess(_ctx.booleanValue("DescribeInstancesInVaultResponse.Success"));
		describeInstancesInVaultResponse.setCode(_ctx.stringValue("DescribeInstancesInVaultResponse.Code"));
		describeInstancesInVaultResponse.setMessage(_ctx.stringValue("DescribeInstancesInVaultResponse.Message"));
		describeInstancesInVaultResponse.setTotalCount(_ctx.integerValue("DescribeInstancesInVaultResponse.TotalCount"));
		describeInstancesInVaultResponse.setPageSize(_ctx.integerValue("DescribeInstancesInVaultResponse.PageSize"));
		describeInstancesInVaultResponse.setPageNumber(_ctx.integerValue("DescribeInstancesInVaultResponse.PageNumber"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesInVaultResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setClientId(_ctx.stringValue("DescribeInstancesInVaultResponse.Instances["+ i +"].ClientId"));
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesInVaultResponse.Instances["+ i +"].InstanceId"));

			instances.add(instance);
		}
		describeInstancesInVaultResponse.setInstances(instances);
	 
	 	return describeInstancesInVaultResponse;
	}
}