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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeServerRelatedGlobalAccelerationInstancesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerRelatedGlobalAccelerationInstancesResponseUnmarshaller {

	public static DescribeServerRelatedGlobalAccelerationInstancesResponse unmarshall(DescribeServerRelatedGlobalAccelerationInstancesResponse describeServerRelatedGlobalAccelerationInstancesResponse, UnmarshallerContext _ctx) {
		
		describeServerRelatedGlobalAccelerationInstancesResponse.setRequestId(_ctx.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.RequestId"));

		List<GlobalAccelerationInstance> globalAccelerationInstances = new ArrayList<GlobalAccelerationInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances.Length"); i++) {
			GlobalAccelerationInstance globalAccelerationInstance = new GlobalAccelerationInstance();
			globalAccelerationInstance.setRegionId(_ctx.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].RegionId"));
			globalAccelerationInstance.setGlobalAccelerationInstanceId(_ctx.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].GlobalAccelerationInstanceId"));
			globalAccelerationInstance.setIpAddress(_ctx.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].IpAddress"));
			globalAccelerationInstance.setServerIpAddress(_ctx.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ServerIpAddress"));

			globalAccelerationInstances.add(globalAccelerationInstance);
		}
		describeServerRelatedGlobalAccelerationInstancesResponse.setGlobalAccelerationInstances(globalAccelerationInstances);
	 
	 	return describeServerRelatedGlobalAccelerationInstancesResponse;
	}
}