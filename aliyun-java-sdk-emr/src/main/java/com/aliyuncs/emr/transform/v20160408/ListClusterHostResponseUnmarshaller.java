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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterHostResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHostResponse.Host;
import com.aliyuncs.emr.model.v20160408.ListClusterHostResponse.Host.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHostResponseUnmarshaller {

	public static ListClusterHostResponse unmarshall(ListClusterHostResponse listClusterHostResponse, UnmarshallerContext context) {
		
		listClusterHostResponse.setRequestId(context.stringValue("ListClusterHostResponse.RequestId"));
		listClusterHostResponse.setPageNumber(context.integerValue("ListClusterHostResponse.PageNumber"));
		listClusterHostResponse.setPageSize(context.integerValue("ListClusterHostResponse.PageSize"));
		listClusterHostResponse.setTotal(context.integerValue("ListClusterHostResponse.Total"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < context.lengthValue("ListClusterHostResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostName(context.stringValue("ListClusterHostResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(context.stringValue("ListClusterHostResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(context.stringValue("ListClusterHostResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(context.stringValue("ListClusterHostResponse.HostList["+ i +"].Role"));
			host.setInstanceType(context.stringValue("ListClusterHostResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(context.integerValue("ListClusterHostResponse.HostList["+ i +"].Cpu"));
			host.setMemory(context.integerValue("ListClusterHostResponse.HostList["+ i +"].Memory"));
			host.setStatus(context.stringValue("ListClusterHostResponse.HostList["+ i +"].Status"));
			host.setInstanceStatus(context.stringValue("ListClusterHostResponse.HostList["+ i +"].InstanceStatus"));
			host.setType(context.stringValue("ListClusterHostResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(context.stringValue("ListClusterHostResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(context.stringValue("ListClusterHostResponse.HostList["+ i +"].SerialNumber"));
			host.setChargeType(context.stringValue("ListClusterHostResponse.HostList["+ i +"].ChargeType"));
			host.setExpiredTime(context.longValue("ListClusterHostResponse.HostList["+ i +"].ExpiredTime"));
			host.setHostGroupId(context.stringValue("ListClusterHostResponse.HostList["+ i +"].HostGroupId"));
			host.setCreateTime(context.stringValue("ListClusterHostResponse.HostList["+ i +"].CreateTime"));
			host.setEmrExpiredTime(context.stringValue("ListClusterHostResponse.HostList["+ i +"].EmrExpiredTime"));
			host.setSupportIpV6(context.booleanValue("ListClusterHostResponse.HostList["+ i +"].SupportIpV6"));

			List<Disk> diskList = new ArrayList<Disk>();
			for (int j = 0; j < context.lengthValue("ListClusterHostResponse.HostList["+ i +"].DiskList.Length"); j++) {
				Disk disk = new Disk();
				disk.setDiskId(context.stringValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].DiskId"));
				disk.setType(context.stringValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].Type"));
				disk.setDiskType(context.stringValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].DiskType"));
				disk.setDiskSize(context.integerValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].DiskSize"));

				diskList.add(disk);
			}
			host.setDiskList(diskList);

			hostList.add(host);
		}
		listClusterHostResponse.setHostList(hostList);
	 
	 	return listClusterHostResponse;
	}
}