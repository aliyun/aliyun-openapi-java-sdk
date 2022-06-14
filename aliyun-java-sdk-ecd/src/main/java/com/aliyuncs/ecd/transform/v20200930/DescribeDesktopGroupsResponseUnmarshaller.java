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

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopGroupsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopGroupsResponse.DesktopGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopGroupsResponseUnmarshaller {

	public static DescribeDesktopGroupsResponse unmarshall(DescribeDesktopGroupsResponse describeDesktopGroupsResponse, UnmarshallerContext _ctx) {
		
		describeDesktopGroupsResponse.setRequestId(_ctx.stringValue("DescribeDesktopGroupsResponse.RequestId"));
		describeDesktopGroupsResponse.setNextToken(_ctx.stringValue("DescribeDesktopGroupsResponse.NextToken"));

		List<DesktopGroup> desktopGroups = new ArrayList<DesktopGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopGroupsResponse.DesktopGroups.Length"); i++) {
			DesktopGroup desktopGroup = new DesktopGroup();
			desktopGroup.setCreateTime(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].CreateTime"));
			desktopGroup.setPayType(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].PayType"));
			desktopGroup.setPolicyGroupName(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].PolicyGroupName"));
			desktopGroup.setCreator(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Creator"));
			desktopGroup.setMaxDesktopsCount(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].MaxDesktopsCount"));
			desktopGroup.setSystemDiskSize(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].SystemDiskSize"));
			desktopGroup.setPolicyGroupId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].PolicyGroupId"));
			desktopGroup.setOwnBundleId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OwnBundleId"));
			desktopGroup.setGpuCount(_ctx.floatValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].GpuCount"));
			desktopGroup.setMemory(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Memory"));
			desktopGroup.setGpuSpec(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].GpuSpec"));
			desktopGroup.setDirectoryId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DirectoryId"));
			desktopGroup.setOwnBundleName(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OwnBundleName"));
			desktopGroup.setDataDiskCategory(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DataDiskCategory"));
			desktopGroup.setDesktopGroupName(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DesktopGroupName"));
			desktopGroup.setSystemDiskCategory(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].SystemDiskCategory"));
			desktopGroup.setOfficeSiteId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OfficeSiteId"));
			desktopGroup.setKeepDuration(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].KeepDuration"));
			desktopGroup.setMinDesktopsCount(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].MinDesktopsCount"));
			desktopGroup.setEndUserCount(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].EndUserCount"));
			desktopGroup.setDataDiskSize(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DataDiskSize"));
			desktopGroup.setDesktopGroupId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DesktopGroupId"));
			desktopGroup.setOfficeSiteName(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OfficeSiteName"));
			desktopGroup.setDirectoryType(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DirectoryType"));
			desktopGroup.setCpu(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Cpu"));
			desktopGroup.setExpiredTime(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].ExpiredTime"));
			desktopGroup.setComments(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Comments"));
			desktopGroup.setOfficeSiteType(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OfficeSiteType"));
			desktopGroup.setStatus(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Status"));
			desktopGroup.setResetType(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].ResetType"));
			desktopGroup.setLoadPolicy(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].LoadPolicy"));
			desktopGroup.setBindAmount(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].BindAmount"));
			desktopGroup.setOwnType(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OwnType"));
			desktopGroup.setImageId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].ImageId"));
			desktopGroup.setVolumeEncryptionEnabled(_ctx.booleanValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].VolumeEncryptionEnabled"));
			desktopGroup.setVolumeEncryptionKey(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].VolumeEncryptionKey"));

			desktopGroups.add(desktopGroup);
		}
		describeDesktopGroupsResponse.setDesktopGroups(desktopGroups);
	 
	 	return describeDesktopGroupsResponse;
	}
}