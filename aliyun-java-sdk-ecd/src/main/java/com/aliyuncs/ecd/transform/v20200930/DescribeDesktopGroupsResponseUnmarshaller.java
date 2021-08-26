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
			desktopGroup.setDesktopGroupId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DesktopGroupId"));
			desktopGroup.setDesktopGroupName(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DesktopGroupName"));
			desktopGroup.setOfficeSiteId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OfficeSiteId"));
			desktopGroup.setOfficeSiteName(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OfficeSiteName"));
			desktopGroup.setOfficeSiteType(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OfficeSiteType"));
			desktopGroup.setPolicyGroupId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].PolicyGroupId"));
			desktopGroup.setPolicyGroupName(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].PolicyGroupName"));
			desktopGroup.setOwnBundleId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OwnBundleId"));
			desktopGroup.setOwnBundleName(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].OwnBundleName"));
			desktopGroup.setEndUserCount(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].EndUserCount"));
			desktopGroup.setPayType(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].PayType"));
			desktopGroup.setExpiredTime(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].ExpiredTime"));
			desktopGroup.setCreateTime(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].CreateTime"));
			desktopGroup.setDirectoryId(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DirectoryId"));
			desktopGroup.setDirectoryType(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DirectoryType"));
			desktopGroup.setCpu(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Cpu"));
			desktopGroup.setMemory(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Memory"));
			desktopGroup.setGpuCount(_ctx.floatValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].GpuCount"));
			desktopGroup.setGpuSpec(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].GpuSpec"));
			desktopGroup.setSystemDiskCategory(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].SystemDiskCategory"));
			desktopGroup.setSystemDiskSize(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].SystemDiskSize"));
			desktopGroup.setDataDiskCategory(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DataDiskCategory"));
			desktopGroup.setDataDiskSize(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].DataDiskSize"));
			desktopGroup.setCreator(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Creator"));
			desktopGroup.setComments(_ctx.stringValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].Comments"));
			desktopGroup.setEndUserCount1(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].EndUserCount"));
			desktopGroup.setKeepDuration(_ctx.longValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].KeepDuration"));
			desktopGroup.setMinDesktopsCount(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].MinDesktopsCount"));
			desktopGroup.setMaxDesktopsCount(_ctx.integerValue("DescribeDesktopGroupsResponse.DesktopGroups["+ i +"].MaxDesktopsCount"));

			desktopGroups.add(desktopGroup);
		}
		describeDesktopGroupsResponse.setDesktopGroups(desktopGroups);
	 
	 	return describeDesktopGroupsResponse;
	}
}