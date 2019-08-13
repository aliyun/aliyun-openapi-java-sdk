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

import com.aliyuncs.emr.model.v20160408.DescribeHpHostResponse;
import com.aliyuncs.emr.model.v20160408.DescribeHpHostResponse.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHpHostResponseUnmarshaller {

	public static DescribeHpHostResponse unmarshall(DescribeHpHostResponse describeHpHostResponse, UnmarshallerContext _ctx) {
		
		describeHpHostResponse.setRequestId(_ctx.stringValue("DescribeHpHostResponse.RequestId"));
		describeHpHostResponse.setBizId(_ctx.stringValue("DescribeHpHostResponse.BizId"));
		describeHpHostResponse.setHostName(_ctx.stringValue("DescribeHpHostResponse.HostName"));
		describeHpHostResponse.setInnerIp(_ctx.stringValue("DescribeHpHostResponse.InnerIp"));
		describeHpHostResponse.setRole(_ctx.stringValue("DescribeHpHostResponse.Role"));
		describeHpHostResponse.setStatus(_ctx.stringValue("DescribeHpHostResponse.Status"));
		describeHpHostResponse.setCpuCore(_ctx.integerValue("DescribeHpHostResponse.CpuCore"));
		describeHpHostResponse.setMemSize(_ctx.integerValue("DescribeHpHostResponse.MemSize"));
		describeHpHostResponse.setVpcId(_ctx.stringValue("DescribeHpHostResponse.VpcId"));
		describeHpHostResponse.setVswitchId(_ctx.stringValue("DescribeHpHostResponse.VswitchId"));
		describeHpHostResponse.setSecurityGroupId(_ctx.stringValue("DescribeHpHostResponse.SecurityGroupId"));
		describeHpHostResponse.setExternalIp(_ctx.stringValue("DescribeHpHostResponse.ExternalIp"));
		describeHpHostResponse.setExternalKey(_ctx.stringValue("DescribeHpHostResponse.ExternalKey"));

		List<String> installedComponents = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHpHostResponse.InstalledComponents.Length"); i++) {
			installedComponents.add(_ctx.stringValue("DescribeHpHostResponse.InstalledComponents["+ i +"]"));
		}
		describeHpHostResponse.setInstalledComponents(installedComponents);

		List<Disk> diskList = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHpHostResponse.DiskList.Length"); i++) {
			Disk disk = new Disk();
			disk.setDiskDevice(_ctx.stringValue("DescribeHpHostResponse.DiskList["+ i +"].DiskDevice"));
			disk.setDiskSize(_ctx.integerValue("DescribeHpHostResponse.DiskList["+ i +"].DiskSize"));
			disk.setMountPath(_ctx.stringValue("DescribeHpHostResponse.DiskList["+ i +"].MountPath"));

			diskList.add(disk);
		}
		describeHpHostResponse.setDiskList(diskList);
	 
	 	return describeHpHostResponse;
	}
}