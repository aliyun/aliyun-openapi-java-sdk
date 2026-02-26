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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeAccessPointResponse;
import com.aliyuncs.nas.model.v20170626.DescribeAccessPointResponse.AccessPoint;
import com.aliyuncs.nas.model.v20170626.DescribeAccessPointResponse.AccessPoint.PosixUser;
import com.aliyuncs.nas.model.v20170626.DescribeAccessPointResponse.AccessPoint.RootPathPermission;
import com.aliyuncs.nas.model.v20170626.DescribeAccessPointResponse.AccessPoint.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessPointResponseUnmarshaller {

	public static DescribeAccessPointResponse unmarshall(DescribeAccessPointResponse describeAccessPointResponse, UnmarshallerContext _ctx) {
		
		describeAccessPointResponse.setRequestId(_ctx.stringValue("DescribeAccessPointResponse.RequestId"));

		AccessPoint accessPoint = new AccessPoint();
		accessPoint.setARN(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.ARN"));
		accessPoint.setAccessGroup(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.AccessGroup"));
		accessPoint.setAccessPointId(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.AccessPointId"));
		accessPoint.setAccessPointName(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.AccessPointName"));
		accessPoint.setCreateTime(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.CreateTime"));
		accessPoint.setDomainName(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.DomainName"));
		accessPoint.setEnabledRam(_ctx.booleanValue("DescribeAccessPointResponse.AccessPoint.EnabledRam"));
		accessPoint.setFileSystemId(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.FileSystemId"));
		accessPoint.setModifyTime(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.ModifyTime"));
		accessPoint.setRootPath(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.RootPath"));
		accessPoint.setRootPathStatus(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.RootPathStatus"));
		accessPoint.setStatus(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.Status"));
		accessPoint.setVSwitchId(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.VSwitchId"));
		accessPoint.setVpcId(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.VpcId"));
		accessPoint.setRegionId(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.RegionId"));

		RootPathPermission rootPathPermission = new RootPathPermission();
		rootPathPermission.setOwnerGroupId(_ctx.integerValue("DescribeAccessPointResponse.AccessPoint.RootPathPermission.OwnerGroupId"));
		rootPathPermission.setOwnerUserId(_ctx.integerValue("DescribeAccessPointResponse.AccessPoint.RootPathPermission.OwnerUserId"));
		rootPathPermission.setPermission(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.RootPathPermission.Permission"));
		accessPoint.setRootPathPermission(rootPathPermission);

		PosixUser posixUser = new PosixUser();
		posixUser.setPosixGroupId(_ctx.integerValue("DescribeAccessPointResponse.AccessPoint.PosixUser.PosixGroupId"));
		posixUser.setPosixUserId(_ctx.integerValue("DescribeAccessPointResponse.AccessPoint.PosixUser.PosixUserId"));

		List<Integer> posixSecondaryGroupIds = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessPointResponse.AccessPoint.PosixUser.PosixSecondaryGroupIds.Length"); i++) {
			posixSecondaryGroupIds.add(_ctx.integerValue("DescribeAccessPointResponse.AccessPoint.PosixUser.PosixSecondaryGroupIds["+ i +"]"));
		}
		posixUser.setPosixSecondaryGroupIds(posixSecondaryGroupIds);
		accessPoint.setPosixUser(posixUser);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessPointResponse.AccessPoint.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeAccessPointResponse.AccessPoint.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		accessPoint.setTags(tags);
		describeAccessPointResponse.setAccessPoint(accessPoint);
	 
	 	return describeAccessPointResponse;
	}
}