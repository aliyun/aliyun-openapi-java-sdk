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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsResponse.Desktop;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsResponse.Desktop.Disk;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsResponse.Desktop.Session;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsResponse.Desktop.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopsResponseUnmarshaller {

	public static DescribeDesktopsResponse unmarshall(DescribeDesktopsResponse describeDesktopsResponse, UnmarshallerContext _ctx) {
		
		describeDesktopsResponse.setRequestId(_ctx.stringValue("DescribeDesktopsResponse.RequestId"));
		describeDesktopsResponse.setTotalCount(_ctx.integerValue("DescribeDesktopsResponse.TotalCount"));
		describeDesktopsResponse.setNextToken(_ctx.stringValue("DescribeDesktopsResponse.NextToken"));

		List<Desktop> desktops = new ArrayList<Desktop>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopsResponse.Desktops.Length"); i++) {
			Desktop desktop = new Desktop();
			desktop.setDirectoryId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DirectoryId"));
			desktop.setOfficeSiteId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OfficeSiteId"));
			desktop.setOfficeSiteName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OfficeSiteName"));
			desktop.setDirectoryType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DirectoryType"));
			desktop.setOfficeSiteType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OfficeSiteType"));
			desktop.setCreationTime(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].CreationTime"));
			desktop.setDesktopId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopId"));
			desktop.setBundleId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].BundleId"));
			desktop.setDesktopStatus(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopStatus"));
			desktop.setDesktopName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopName"));
			desktop.setImageId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ImageId"));
			desktop.setDesktopType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopType"));
			desktop.setSystemDiskCategory(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].SystemDiskCategory"));
			desktop.setSystemDiskSize(_ctx.integerValue("DescribeDesktopsResponse.Desktops["+ i +"].SystemDiskSize"));
			desktop.setDataDiskCategory(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DataDiskCategory"));
			desktop.setDataDiskSize(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DataDiskSize"));
			desktop.setPolicyGroupId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].PolicyGroupId"));
			desktop.setPolicyGroupName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].PolicyGroupName"));
			desktop.setCpu(_ctx.integerValue("DescribeDesktopsResponse.Desktops["+ i +"].Cpu"));
			desktop.setMemory(_ctx.longValue("DescribeDesktopsResponse.Desktops["+ i +"].Memory"));
			desktop.setNetworkInterfaceId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].NetworkInterfaceId"));
			desktop.setExpiredTime(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ExpiredTime"));
			desktop.setChargeType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ChargeType"));
			desktop.setGpuCount(_ctx.floatValue("DescribeDesktopsResponse.Desktops["+ i +"].GpuCount"));
			desktop.setGpuSpec(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].GpuSpec"));
			desktop.setStartTime(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].StartTime"));
			desktop.setConnectionStatus(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ConnectionStatus"));
			desktop.setOsType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OsType"));
			desktop.setProtocolType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ProtocolType"));
			desktop.setManagementFlag(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ManagementFlag"));
			desktop.setNetworkInterfaceIp(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].NetworkInterfaceIp"));
			desktop.setDesktopGroupId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopGroupId"));
			desktop.setNetworkInterfaceIp1(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].NetworkInterfaceIp"));

			List<String> endUserIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDesktopsResponse.Desktops["+ i +"].EndUserIds.Length"); j++) {
				endUserIds.add(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].EndUserIds["+ j +"]"));
			}
			desktop.setEndUserIds(endUserIds);

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setDiskId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks["+ j +"].DiskId"));
				disk.setDiskSize(_ctx.integerValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks["+ j +"].DiskSize"));
				disk.setDiskType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks["+ j +"].DiskType"));

				disks.add(disk);
			}
			desktop.setDisks(disks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDesktopsResponse.Desktops["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			desktop.setTags(tags);

			List<Session> sessions = new ArrayList<Session>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDesktopsResponse.Desktops["+ i +"].Sessions.Length"); j++) {
				Session session = new Session();
				session.setEndUserId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Sessions["+ j +"].EndUserId"));
				session.setEstablishmentTime(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Sessions["+ j +"].EstablishmentTime"));

				sessions.add(session);
			}
			desktop.setSessions(sessions);

			desktops.add(desktop);
		}
		describeDesktopsResponse.setDesktops(desktops);
	 
	 	return describeDesktopsResponse;
	}
}