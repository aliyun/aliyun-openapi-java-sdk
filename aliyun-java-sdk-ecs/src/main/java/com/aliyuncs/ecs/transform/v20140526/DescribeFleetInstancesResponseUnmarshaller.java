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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeFleetInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeFleetInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFleetInstancesResponseUnmarshaller {

	public static DescribeFleetInstancesResponse unmarshall(DescribeFleetInstancesResponse describeFleetInstancesResponse, UnmarshallerContext context) {
		
		describeFleetInstancesResponse.setRequestId(context.stringValue("DescribeFleetInstancesResponse.RequestId"));
		describeFleetInstancesResponse.setTotalCount(context.integerValue("DescribeFleetInstancesResponse.TotalCount"));
		describeFleetInstancesResponse.setPageNumber(context.integerValue("DescribeFleetInstancesResponse.PageNumber"));
		describeFleetInstancesResponse.setPageSize(context.integerValue("DescribeFleetInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeFleetInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("DescribeFleetInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setStatus(context.stringValue("DescribeFleetInstancesResponse.Instances["+ i +"].Status"));
			instance.setRegionId(context.stringValue("DescribeFleetInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setIzNo(context.stringValue("DescribeFleetInstancesResponse.Instances["+ i +"].IzNo"));
			instance.setZoneNo(context.stringValue("DescribeFleetInstancesResponse.Instances["+ i +"].ZoneNo"));
			instance.setCores(context.integerValue("DescribeFleetInstancesResponse.Instances["+ i +"].Cores"));
			instance.setMemory(context.integerValue("DescribeFleetInstancesResponse.Instances["+ i +"].Memory"));
			instance.setInstanceType(context.stringValue("DescribeFleetInstancesResponse.Instances["+ i +"].InstanceType"));
			instance.setIsSpot(context.booleanValue("DescribeFleetInstancesResponse.Instances["+ i +"].IsSpot"));
			instance.setIoOptimized(context.booleanValue("DescribeFleetInstancesResponse.Instances["+ i +"].IoOptimized"));
			instance.setNetworkType(context.booleanValue("DescribeFleetInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setOsType(context.booleanValue("DescribeFleetInstancesResponse.Instances["+ i +"].OsType"));
			instance.setCreationTime(context.stringValue("DescribeFleetInstancesResponse.Instances["+ i +"].CreationTime"));

			instances.add(instance);
		}
		describeFleetInstancesResponse.setInstances(instances);
	 
	 	return describeFleetInstancesResponse;
	}
}