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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeServerInstancesResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeServerInstancesResponse.ServerInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerInstancesResponseUnmarshaller {

	public static DescribeServerInstancesResponse unmarshall(DescribeServerInstancesResponse describeServerInstancesResponse, UnmarshallerContext _ctx) {
		
		describeServerInstancesResponse.setRequestId(_ctx.stringValue("DescribeServerInstancesResponse.RequestId"));
		describeServerInstancesResponse.setSuccess(_ctx.booleanValue("DescribeServerInstancesResponse.Success"));
		describeServerInstancesResponse.setCode(_ctx.stringValue("DescribeServerInstancesResponse.Code"));
		describeServerInstancesResponse.setMessage(_ctx.stringValue("DescribeServerInstancesResponse.Message"));
		describeServerInstancesResponse.setTotalCount(_ctx.integerValue("DescribeServerInstancesResponse.TotalCount"));
		describeServerInstancesResponse.setPageNumber(_ctx.integerValue("DescribeServerInstancesResponse.PageNumber"));
		describeServerInstancesResponse.setPageSize(_ctx.integerValue("DescribeServerInstancesResponse.PageSize"));

		List<ServerInstance> serverInstances = new ArrayList<ServerInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServerInstancesResponse.ServerInstances.Length"); i++) {
			ServerInstance serverInstance = new ServerInstance();
			serverInstance.setInstanceId(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].InstanceId"));
			serverInstance.setInstanceName(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].InstanceName"));
			serverInstance.setRegionId(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].RegionId"));
			serverInstance.setZoneId(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].ZoneId"));
			serverInstance.setPrivateIpAddress(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].PrivateIpAddress"));
			serverInstance.setPublicIpAddress(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].PublicIpAddress"));
			serverInstance.setStatus(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].Status"));
			serverInstance.setInstanceChargeType(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].InstanceChargeType"));
			serverInstance.setOsType(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].OsType"));
			serverInstance.setOsName(_ctx.stringValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].OsName"));
			serverInstance.setCpu(_ctx.integerValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].Cpu"));
			serverInstance.setMemory(_ctx.longValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].Memory"));
			serverInstance.setRegistered(_ctx.booleanValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].Registered"));
			serverInstance.setCloudAssistantInstalled(_ctx.booleanValue("DescribeServerInstancesResponse.ServerInstances["+ i +"].CloudAssistantInstalled"));

			serverInstances.add(serverInstance);
		}
		describeServerInstancesResponse.setServerInstances(serverInstances);
	 
	 	return describeServerInstancesResponse;
	}
}