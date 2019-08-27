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

	public static ListClusterHostResponse unmarshall(ListClusterHostResponse listClusterHostResponse, UnmarshallerContext _ctx) {
		
		listClusterHostResponse.setRequestId(_ctx.stringValue("ListClusterHostResponse.RequestId"));
		listClusterHostResponse.setPageNumber(_ctx.integerValue("ListClusterHostResponse.PageNumber"));
		listClusterHostResponse.setPageSize(_ctx.integerValue("ListClusterHostResponse.PageSize"));
		listClusterHostResponse.setTotal(_ctx.integerValue("ListClusterHostResponse.Total"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterHostResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostName(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].Role"));
			host.setZoneId(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].ZoneId"));
			host.setInstanceType(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(_ctx.integerValue("ListClusterHostResponse.HostList["+ i +"].Cpu"));
			host.setMemory(_ctx.integerValue("ListClusterHostResponse.HostList["+ i +"].Memory"));
			host.setStatus(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].Status"));
			host.setInstanceStatus(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].InstanceStatus"));
			host.setType(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].SerialNumber"));
			host.setChargeType(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].ChargeType"));
			host.setExpiredTime(_ctx.longValue("ListClusterHostResponse.HostList["+ i +"].ExpiredTime"));
			host.setHostGroupId(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].HostGroupId"));
			host.setCreateTime(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].CreateTime"));
			host.setEmrExpiredTime(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].EmrExpiredTime"));
			host.setSupportIpV6(_ctx.booleanValue("ListClusterHostResponse.HostList["+ i +"].SupportIpV6"));

			List<Disk> diskList = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterHostResponse.HostList["+ i +"].DiskList.Length"); j++) {
				Disk disk = new Disk();
				disk.setDiskId(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].DiskId"));
				disk.setType(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].Type"));
				disk.setDevice(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].Device"));
				disk.setDiskType(_ctx.stringValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].DiskType"));
				disk.setDiskSize(_ctx.integerValue("ListClusterHostResponse.HostList["+ i +"].DiskList["+ j +"].DiskSize"));

				diskList.add(disk);
			}
			host.setDiskList(diskList);

			hostList.add(host);
		}
		listClusterHostResponse.setHostList(hostList);
	 
	 	return listClusterHostResponse;
	}
}