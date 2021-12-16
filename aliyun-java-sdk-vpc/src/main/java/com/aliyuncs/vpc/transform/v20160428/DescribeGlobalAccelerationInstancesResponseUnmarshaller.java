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

import com.aliyuncs.vpc.model.v20160428.DescribeGlobalAccelerationInstancesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstance;
import com.aliyuncs.vpc.model.v20160428.DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstance.BackendServer;
import com.aliyuncs.vpc.model.v20160428.DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstance.LockReason;
import com.aliyuncs.vpc.model.v20160428.DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstance.PublicIpAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGlobalAccelerationInstancesResponseUnmarshaller {

	public static DescribeGlobalAccelerationInstancesResponse unmarshall(DescribeGlobalAccelerationInstancesResponse describeGlobalAccelerationInstancesResponse, UnmarshallerContext _ctx) {
		
		describeGlobalAccelerationInstancesResponse.setRequestId(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.RequestId"));
		describeGlobalAccelerationInstancesResponse.setPageSize(_ctx.integerValue("DescribeGlobalAccelerationInstancesResponse.PageSize"));
		describeGlobalAccelerationInstancesResponse.setPageNumber(_ctx.integerValue("DescribeGlobalAccelerationInstancesResponse.PageNumber"));
		describeGlobalAccelerationInstancesResponse.setTotalCount(_ctx.integerValue("DescribeGlobalAccelerationInstancesResponse.TotalCount"));

		List<GlobalAccelerationInstance> globalAccelerationInstances = new ArrayList<GlobalAccelerationInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances.Length"); i++) {
			GlobalAccelerationInstance globalAccelerationInstance = new GlobalAccelerationInstance();
			globalAccelerationInstance.setReservationActiveTime(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ReservationActiveTime"));
			globalAccelerationInstance.setCreationTime(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].CreationTime"));
			globalAccelerationInstance.setStatus(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].Status"));
			globalAccelerationInstance.setReservationOrderType(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ReservationOrderType"));
			globalAccelerationInstance.setBandwidthType(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].BandwidthType"));
			globalAccelerationInstance.setChargeType(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ChargeType"));
			globalAccelerationInstance.setGlobalAccelerationInstanceId(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].GlobalAccelerationInstanceId"));
			globalAccelerationInstance.setServiceLocation(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ServiceLocation"));
			globalAccelerationInstance.setReservationInternetChargeType(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ReservationInternetChargeType"));
			globalAccelerationInstance.setRegionId(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].RegionId"));
			globalAccelerationInstance.setAccelerationLocation(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].AccelerationLocation"));
			globalAccelerationInstance.setIpAddress(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].IpAddress"));
			globalAccelerationInstance.setDescription(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].Description"));
			globalAccelerationInstance.setBandwidth(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].Bandwidth"));
			globalAccelerationInstance.setExpiredTime(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ExpiredTime"));
			globalAccelerationInstance.setReservationBandwidth(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ReservationBandwidth"));
			globalAccelerationInstance.setInternetChargeType(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].InternetChargeType"));
			globalAccelerationInstance.setName(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].Name"));
			globalAccelerationInstance.setHasReservationData(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].HasReservationData"));

			List<LockReason> operationLocks = new ArrayList<LockReason>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].OperationLocks.Length"); j++) {
				LockReason lockReason = new LockReason();
				lockReason.setLockReason(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(lockReason);
			}
			globalAccelerationInstance.setOperationLocks(operationLocks);

			List<BackendServer> backendServers = new ArrayList<BackendServer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].BackendServers.Length"); j++) {
				BackendServer backendServer = new BackendServer();
				backendServer.setServerIpAddress(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].BackendServers["+ j +"].ServerIpAddress"));
				backendServer.setServerId(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].BackendServers["+ j +"].ServerId"));
				backendServer.setServerType(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].BackendServers["+ j +"].ServerType"));
				backendServer.setRegionId(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].BackendServers["+ j +"].RegionId"));

				backendServers.add(backendServer);
			}
			globalAccelerationInstance.setBackendServers(backendServers);

			List<PublicIpAddress> publicIpAddresses = new ArrayList<PublicIpAddress>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].PublicIpAddresses.Length"); j++) {
				PublicIpAddress publicIpAddress = new PublicIpAddress();
				publicIpAddress.setIpAddress(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].PublicIpAddresses["+ j +"].IpAddress"));
				publicIpAddress.setAllocationId(_ctx.stringValue("DescribeGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].PublicIpAddresses["+ j +"].AllocationId"));

				publicIpAddresses.add(publicIpAddress);
			}
			globalAccelerationInstance.setPublicIpAddresses(publicIpAddresses);

			globalAccelerationInstances.add(globalAccelerationInstance);
		}
		describeGlobalAccelerationInstancesResponse.setGlobalAccelerationInstances(globalAccelerationInstances);
	 
	 	return describeGlobalAccelerationInstancesResponse;
	}
}