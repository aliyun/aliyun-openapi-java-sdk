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

import com.aliyuncs.hbr.model.v20170908.DescribeUdmEcsInstancesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeUdmEcsInstancesResponse.UdmEcsInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUdmEcsInstancesResponseUnmarshaller {

	public static DescribeUdmEcsInstancesResponse unmarshall(DescribeUdmEcsInstancesResponse describeUdmEcsInstancesResponse, UnmarshallerContext _ctx) {
		
		describeUdmEcsInstancesResponse.setRequestId(_ctx.stringValue("DescribeUdmEcsInstancesResponse.RequestId"));
		describeUdmEcsInstancesResponse.setSuccess(_ctx.booleanValue("DescribeUdmEcsInstancesResponse.Success"));
		describeUdmEcsInstancesResponse.setCode(_ctx.stringValue("DescribeUdmEcsInstancesResponse.Code"));
		describeUdmEcsInstancesResponse.setMessage(_ctx.stringValue("DescribeUdmEcsInstancesResponse.Message"));
		describeUdmEcsInstancesResponse.setTotalCount(_ctx.integerValue("DescribeUdmEcsInstancesResponse.TotalCount"));
		describeUdmEcsInstancesResponse.setPageNumber(_ctx.integerValue("DescribeUdmEcsInstancesResponse.PageNumber"));
		describeUdmEcsInstancesResponse.setPageSize(_ctx.integerValue("DescribeUdmEcsInstancesResponse.PageSize"));

		List<UdmEcsInstance> udmEcsInstances = new ArrayList<UdmEcsInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances.Length"); i++) {
			UdmEcsInstance udmEcsInstance = new UdmEcsInstance();
			udmEcsInstance.setInstanceId(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].InstanceId"));
			udmEcsInstance.setVaultId(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].VaultId"));
			udmEcsInstance.setInstanceName(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].InstanceName"));
			udmEcsInstance.setZoneId(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].ZoneId"));
			udmEcsInstance.setVpcId(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].VpcId"));
			udmEcsInstance.setVswitchId(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].VswitchId"));
			udmEcsInstance.setPlanCount(_ctx.longValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].PlanCount"));
			udmEcsInstance.setNativeSnapshotCount(_ctx.longValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].NativeSnapshotCount"));
			udmEcsInstance.setBackupCount(_ctx.longValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].BackupCount"));
			udmEcsInstance.setRunningJobCount(_ctx.longValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].RunningJobCount"));
			udmEcsInstance.setCompleteJobCount(_ctx.longValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].CompleteJobCount"));
			udmEcsInstance.setFailedJobCount(_ctx.longValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].FailedJobCount"));
			udmEcsInstance.setDoBackup(_ctx.booleanValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].DoBackup"));
			udmEcsInstance.setPublicIpAddress(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].PublicIpAddress"));
			udmEcsInstance.setPrivateIpAddress(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].PrivateIpAddress"));
			udmEcsInstance.setInnerIpAddress(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].InnerIpAddress"));
			udmEcsInstance.setEipAddress(_ctx.stringValue("DescribeUdmEcsInstancesResponse.UdmEcsInstances["+ i +"].EipAddress"));

			udmEcsInstances.add(udmEcsInstance);
		}
		describeUdmEcsInstancesResponse.setUdmEcsInstances(udmEcsInstances);
	 
	 	return describeUdmEcsInstancesResponse;
	}
}