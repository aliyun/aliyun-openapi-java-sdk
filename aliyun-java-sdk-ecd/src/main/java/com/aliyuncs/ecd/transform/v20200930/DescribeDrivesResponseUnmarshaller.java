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

import com.aliyuncs.ecd.model.v20200930.DescribeDrivesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDrivesResponse.Drive;
import com.aliyuncs.ecd.model.v20200930.DescribeDrivesResponse.Drive.DesktopGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrivesResponseUnmarshaller {

	public static DescribeDrivesResponse unmarshall(DescribeDrivesResponse describeDrivesResponse, UnmarshallerContext _ctx) {
		
		describeDrivesResponse.setRequestId(_ctx.stringValue("DescribeDrivesResponse.RequestId"));
		describeDrivesResponse.setSuccess(_ctx.booleanValue("DescribeDrivesResponse.Success"));
		describeDrivesResponse.setCode(_ctx.stringValue("DescribeDrivesResponse.Code"));
		describeDrivesResponse.setMessage(_ctx.stringValue("DescribeDrivesResponse.Message"));

		List<Drive> drives = new ArrayList<Drive>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrivesResponse.Drives.Length"); i++) {
			Drive drive = new Drive();
			drive.setId(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].Id"));
			drive.setGmtCreate(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].GmtCreate"));
			drive.setGmtModified(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].GmtModified"));
			drive.setAliUid(_ctx.longValue("DescribeDrivesResponse.Drives["+ i +"].AliUid"));
			drive.setDomainId(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].DomainId"));
			drive.setExternalDomainId(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].ExternalDomainId"));
			drive.setDriveId(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].DriveId"));
			drive.setExternalDriveId(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].ExternalDriveId"));
			drive.setUserId(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].UserId"));
			drive.setExternalUserId(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].ExternalUserId"));
			drive.setName(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].Name"));
			drive.setDescription(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].Description"));
			drive.setTotalSize(_ctx.longValue("DescribeDrivesResponse.Drives["+ i +"].TotalSize"));
			drive.setUsedSize(_ctx.longValue("DescribeDrivesResponse.Drives["+ i +"].UsedSize"));
			drive.setStatus(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].Status"));
			drive.setType(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].Type"));
			drive.setProfileRoaming(_ctx.booleanValue("DescribeDrivesResponse.Drives["+ i +"].ProfileRoaming"));
			drive.setDesktopGroupCount(_ctx.integerValue("DescribeDrivesResponse.Drives["+ i +"].DesktopGroupCount"));
			drive.setEnableProfileManagement(_ctx.booleanValue("DescribeDrivesResponse.Drives["+ i +"].EnableProfileManagement"));

			List<DesktopGroup> desktopGroups = new ArrayList<DesktopGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrivesResponse.Drives["+ i +"].DesktopGroups.Length"); j++) {
				DesktopGroup desktopGroup = new DesktopGroup();
				desktopGroup.setDesktopGroupId(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].DesktopGroups["+ j +"].DesktopGroupId"));
				desktopGroup.setDesktopGroupName(_ctx.stringValue("DescribeDrivesResponse.Drives["+ i +"].DesktopGroups["+ j +"].DesktopGroupName"));

				desktopGroups.add(desktopGroup);
			}
			drive.setDesktopGroups(desktopGroups);

			drives.add(drive);
		}
		describeDrivesResponse.setDrives(drives);
	 
	 	return describeDrivesResponse;
	}
}