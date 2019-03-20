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

package com.aliyuncs.ocs.transform.v20150301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocs.model.v20150301.DescribeInstancesResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeInstancesResponse.OcsInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setTotalCount(context.integerValue("DescribeInstancesResponse.TotalCount"));
		describeInstancesResponse.setPageNumber(context.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(context.integerValue("DescribeInstancesResponse.PageSize"));

		List<OcsInstance> instances = new ArrayList<OcsInstance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			OcsInstance ocsInstance = new OcsInstance();
			ocsInstance.setInstanceId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			ocsInstance.setInstanceName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			ocsInstance.setConnectionDomain(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ConnectionDomain"));
			ocsInstance.setPort(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].Port"));
			ocsInstance.setUserName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].UserName"));
			ocsInstance.setInstanceStatus(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceStatus"));
			ocsInstance.setCapacity(context.longValue("DescribeInstancesResponse.Instances["+ i +"].Capacity"));
			ocsInstance.setQPS(context.longValue("DescribeInstancesResponse.Instances["+ i +"].QPS"));
			ocsInstance.setBandwidth(context.longValue("DescribeInstancesResponse.Instances["+ i +"].Bandwidth"));
			ocsInstance.setConnections(context.longValue("DescribeInstancesResponse.Instances["+ i +"].Connections"));
			ocsInstance.setRegionId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			ocsInstance.setZoneId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			ocsInstance.setNetworkType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkType"));
			ocsInstance.setVpcId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			ocsInstance.setVSwitchId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VSwitchId"));
			ocsInstance.setPrivateIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddress"));
			ocsInstance.setCreationTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreationTime"));
			ocsInstance.setHotkeyEnabled(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].HotkeyEnabled"));

			instances.add(ocsInstance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}