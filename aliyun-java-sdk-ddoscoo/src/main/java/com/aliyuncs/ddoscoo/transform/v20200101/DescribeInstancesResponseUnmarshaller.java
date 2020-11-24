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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstancesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setTotalCount(_ctx.longValue("DescribeInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setRemark(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Remark"));
			instance.setStatus(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setDebtStatus(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].DebtStatus"));
			instance.setExpireTime(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].ExpireTime"));
			instance.setCreateTime(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].CreateTime"));
			instance.setEdition(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Edition"));
			instance.setEnabled(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Enabled"));
			instance.setConnInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ConnInstanceId"));

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}