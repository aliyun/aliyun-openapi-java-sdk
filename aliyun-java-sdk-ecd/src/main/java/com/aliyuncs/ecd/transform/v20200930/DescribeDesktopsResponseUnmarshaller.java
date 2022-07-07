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
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsResponse.Desktop.FotaUpdate;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsResponse.Desktop.Session;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsResponse.Desktop.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopsResponseUnmarshaller {

	public static DescribeDesktopsResponse unmarshall(DescribeDesktopsResponse describeDesktopsResponse, UnmarshallerContext _ctx) {
		
		describeDesktopsResponse.setRequestId(_ctx.stringValue("DescribeDesktopsResponse.RequestId"));
		describeDesktopsResponse.setNextToken(_ctx.stringValue("DescribeDesktopsResponse.NextToken"));
		describeDesktopsResponse.setTotalCount(_ctx.integerValue("DescribeDesktopsResponse.TotalCount"));

		List<Desktop> desktops = new ArrayList<Desktop>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopsResponse.Desktops.Length"); i++) {
			Desktop desktop = new Desktop();
			desktop.setCreationTime(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].CreationTime"));
			desktop.setChargeType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ChargeType"));
			desktop.setDesktopName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopName"));
			desktop.setPolicyGroupName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].PolicyGroupName"));
			desktop.setSystemDiskSize(_ctx.integerValue("DescribeDesktopsResponse.Desktops["+ i +"].SystemDiskSize"));
			desktop.setPolicyGroupId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].PolicyGroupId"));
			desktop.setDesktopStatus(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopStatus"));
			desktop.setDesktopType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopType"));
			desktop.setGpuCount(_ctx.floatValue("DescribeDesktopsResponse.Desktops["+ i +"].GpuCount"));
			desktop.setProtocolType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ProtocolType"));
			desktop.setMemory(_ctx.longValue("DescribeDesktopsResponse.Desktops["+ i +"].Memory"));
			desktop.setGpuSpec(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].GpuSpec"));
			desktop.setImageId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ImageId"));
			desktop.setDirectoryId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DirectoryId"));
			desktop.setManagementFlag(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ManagementFlag"));
			desktop.setDataDiskCategory(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DataDiskCategory"));
			desktop.setSystemDiskCategory(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].SystemDiskCategory"));
			desktop.setNetworkInterfaceId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].NetworkInterfaceId"));
			desktop.setOfficeSiteId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OfficeSiteId"));
			desktop.setDataDiskSize(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DataDiskSize"));
			desktop.setDesktopGroupId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopGroupId"));
			desktop.setDesktopId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DesktopId"));
			desktop.setOfficeSiteName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OfficeSiteName"));
			desktop.setStartTime(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].StartTime"));
			desktop.setDirectoryType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].DirectoryType"));
			desktop.setCpu(_ctx.integerValue("DescribeDesktopsResponse.Desktops["+ i +"].Cpu"));
			desktop.setNetworkInterfaceIp(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].NetworkInterfaceIp"));
			desktop.setExpiredTime(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ExpiredTime"));
			desktop.setOsType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OsType"));
			desktop.setConnectionStatus(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ConnectionStatus"));
			desktop.setBundleId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].BundleId"));
			desktop.setBundleName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].BundleName"));
			desktop.setOfficeSiteType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OfficeSiteType"));
			desktop.setHostName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].HostName"));
			desktop.setDowngradeQuota(_ctx.longValue("DescribeDesktopsResponse.Desktops["+ i +"].DowngradeQuota"));
			desktop.setDowngradedTimes(_ctx.longValue("DescribeDesktopsResponse.Desktops["+ i +"].DowngradedTimes"));
			desktop.setGpuCategory(_ctx.longValue("DescribeDesktopsResponse.Desktops["+ i +"].GpuCategory"));
			desktop.setGpuDriverVersion(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].GpuDriverVersion"));
			desktop.setZoneType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].ZoneType"));
			desktop.setProgress(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Progress"));
			desktop.setVolumeEncryptionEnabled(_ctx.booleanValue("DescribeDesktopsResponse.Desktops["+ i +"].VolumeEncryptionEnabled"));
			desktop.setVolumeEncryptionKey(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].VolumeEncryptionKey"));
			desktop.setOfficeSiteVpcType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].OfficeSiteVpcType"));
			desktop.setPlatform(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Platform"));
			desktop.setSessionType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].SessionType"));

			List<String> endUserIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDesktopsResponse.Desktops["+ i +"].EndUserIds.Length"); j++) {
				endUserIds.add(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].EndUserIds["+ j +"]"));
			}
			desktop.setEndUserIds(endUserIds);

			FotaUpdate fotaUpdate = new FotaUpdate();
			fotaUpdate.setCurrentAppVersion(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].FotaUpdate.CurrentAppVersion"));
			fotaUpdate.setNewAppVersion(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].FotaUpdate.NewAppVersion"));
			fotaUpdate.setReleaseNote(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].FotaUpdate.ReleaseNote"));
			fotaUpdate.setSize(_ctx.longValue("DescribeDesktopsResponse.Desktops["+ i +"].FotaUpdate.Size"));
			desktop.setFotaUpdate(fotaUpdate);

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setDiskType(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks["+ j +"].DiskType"));
				disk.setDiskId(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks["+ j +"].DiskId"));
				disk.setDiskSize(_ctx.integerValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks["+ j +"].DiskSize"));
				disk.setPerformanceLevel(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Disks["+ j +"].PerformanceLevel"));

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
				session.setExternalUserName(_ctx.stringValue("DescribeDesktopsResponse.Desktops["+ i +"].Sessions["+ j +"].ExternalUserName"));

				sessions.add(session);
			}
			desktop.setSessions(sessions);

			desktops.add(desktop);
		}
		describeDesktopsResponse.setDesktops(desktops);
	 
	 	return describeDesktopsResponse;
	}
}