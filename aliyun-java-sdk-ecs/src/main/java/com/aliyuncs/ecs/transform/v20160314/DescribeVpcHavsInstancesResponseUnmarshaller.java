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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeVpcHavsInstancesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeVpcHavsInstancesResponse.VpcHavsInstance;
import com.aliyuncs.ecs.model.v20160314.DescribeVpcHavsInstancesResponse.VpcHavsInstance.HavsInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcHavsInstancesResponseUnmarshaller {

	public static DescribeVpcHavsInstancesResponse unmarshall(DescribeVpcHavsInstancesResponse describeVpcHavsInstancesResponse, UnmarshallerContext _ctx) {
		
		describeVpcHavsInstancesResponse.setRequestId(_ctx.stringValue("DescribeVpcHavsInstancesResponse.RequestId"));

		List<VpcHavsInstance> vpcHavsInstances = new ArrayList<VpcHavsInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcHavsInstancesResponse.VpcHavsInstances.Length"); i++) {
			VpcHavsInstance vpcHavsInstance = new VpcHavsInstance();
			vpcHavsInstance.setVpcId(_ctx.stringValue("DescribeVpcHavsInstancesResponse.VpcHavsInstances["+ i +"].VpcId"));

			List<HavsInstance> havsInstances = new ArrayList<HavsInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcHavsInstancesResponse.VpcHavsInstances["+ i +"].HavsInstances.Length"); j++) {
				HavsInstance havsInstance = new HavsInstance();
				havsInstance.setEcsInstanceId(_ctx.stringValue("DescribeVpcHavsInstancesResponse.VpcHavsInstances["+ i +"].HavsInstances["+ j +"].EcsInstanceId"));
				havsInstance.setReason(_ctx.stringValue("DescribeVpcHavsInstancesResponse.VpcHavsInstances["+ i +"].HavsInstances["+ j +"].Reason"));

				havsInstances.add(havsInstance);
			}
			vpcHavsInstance.setHavsInstances(havsInstances);

			vpcHavsInstances.add(vpcHavsInstance);
		}
		describeVpcHavsInstancesResponse.setVpcHavsInstances(vpcHavsInstances);
	 
	 	return describeVpcHavsInstancesResponse;
	}
}