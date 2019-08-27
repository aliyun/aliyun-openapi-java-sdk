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

import com.aliyuncs.emr.model.v20160408.ListHpHostResponse;
import com.aliyuncs.emr.model.v20160408.ListHpHostResponse.HpHost;
import com.aliyuncs.emr.model.v20160408.ListHpHostResponse.HpHost.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHpHostResponseUnmarshaller {

	public static ListHpHostResponse unmarshall(ListHpHostResponse listHpHostResponse, UnmarshallerContext _ctx) {
		
		listHpHostResponse.setRequestId(_ctx.stringValue("ListHpHostResponse.RequestId"));
		listHpHostResponse.setPageNumber(_ctx.integerValue("ListHpHostResponse.PageNumber"));
		listHpHostResponse.setPageSize(_ctx.integerValue("ListHpHostResponse.PageSize"));
		listHpHostResponse.setTotalCount(_ctx.integerValue("ListHpHostResponse.TotalCount"));

		List<HpHost> hpHostList = new ArrayList<HpHost>();
		for (int i = 0; i < _ctx.lengthValue("ListHpHostResponse.HpHostList.Length"); i++) {
			HpHost hpHost = new HpHost();
			hpHost.setBizId(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].BizId"));
			hpHost.setHostName(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].HostName"));
			hpHost.setInnerIp(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].InnerIp"));
			hpHost.setRole(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].Role"));
			hpHost.setStatus(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].Status"));
			hpHost.setDescription(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].Description"));
			hpHost.setCpuCore(_ctx.integerValue("ListHpHostResponse.HpHostList["+ i +"].CpuCore"));
			hpHost.setMemSize(_ctx.integerValue("ListHpHostResponse.HpHostList["+ i +"].MemSize"));
			hpHost.setVpcId(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].VpcId"));
			hpHost.setVswitchId(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].VswitchId"));
			hpHost.setSecurityGroupId(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].SecurityGroupId"));
			hpHost.setExternalIp(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].ExternalIp"));
			hpHost.setExternalKey(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].ExternalKey"));

			List<String> installedComponents = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListHpHostResponse.HpHostList["+ i +"].InstalledComponents.Length"); j++) {
				installedComponents.add(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].InstalledComponents["+ j +"]"));
			}
			hpHost.setInstalledComponents(installedComponents);

			List<Disk> diskList = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("ListHpHostResponse.HpHostList["+ i +"].DiskList.Length"); j++) {
				Disk disk = new Disk();
				disk.setDiskDevice(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].DiskList["+ j +"].DiskDevice"));
				disk.setDiskSize(_ctx.integerValue("ListHpHostResponse.HpHostList["+ i +"].DiskList["+ j +"].DiskSize"));
				disk.setMountPath(_ctx.stringValue("ListHpHostResponse.HpHostList["+ i +"].DiskList["+ j +"].MountPath"));

				diskList.add(disk);
			}
			hpHost.setDiskList(diskList);

			hpHostList.add(hpHost);
		}
		listHpHostResponse.setHpHostList(hpHostList);
	 
	 	return listHpHostResponse;
	}
}