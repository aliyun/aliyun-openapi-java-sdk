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

import com.aliyuncs.nas.model.v20170626.ListAccessPointsResponse;
import com.aliyuncs.nas.model.v20170626.ListAccessPointsResponse.AccessPoint;
import com.aliyuncs.nas.model.v20170626.ListAccessPointsResponse.AccessPoint.PosixUser;
import com.aliyuncs.nas.model.v20170626.ListAccessPointsResponse.AccessPoint.RootPathPermission;
import com.aliyuncs.nas.model.v20170626.ListAccessPointsResponse.AccessPoint.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessPointsResponseUnmarshaller {

	public static ListAccessPointsResponse unmarshall(ListAccessPointsResponse listAccessPointsResponse, UnmarshallerContext _ctx) {
		
		listAccessPointsResponse.setRequestId(_ctx.stringValue("ListAccessPointsResponse.RequestId"));
		listAccessPointsResponse.setTotalCount(_ctx.integerValue("ListAccessPointsResponse.TotalCount"));
		listAccessPointsResponse.setNextToken(_ctx.stringValue("ListAccessPointsResponse.NextToken"));

		List<AccessPoint> accessPoints = new ArrayList<AccessPoint>();
		for (int i = 0; i < _ctx.lengthValue("ListAccessPointsResponse.AccessPoints.Length"); i++) {
			AccessPoint accessPoint = new AccessPoint();
			accessPoint.setStatus(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].Status"));
			accessPoint.setModifyTime(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].ModifyTime"));
			accessPoint.setRootPath(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].RootPath"));
			accessPoint.setModifyTimeUtc(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].ModifyTimeUtc"));
			accessPoint.setDomainName(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].DomainName"));
			accessPoint.setCreateTime(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].CreateTime"));
			accessPoint.setVSwitchId(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].VSwitchId"));
			accessPoint.setEnabledRam(_ctx.booleanValue("ListAccessPointsResponse.AccessPoints["+ i +"].EnabledRam"));
			accessPoint.setCreateTimeUtc(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].CreateTimeUtc"));
			accessPoint.setAccessPointName(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].AccessPointName"));
			accessPoint.setVpcId(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].VpcId"));
			accessPoint.setAccessGroup(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].AccessGroup"));
			accessPoint.setAccessPointId(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].AccessPointId"));
			accessPoint.setFileSystemId(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].FileSystemId"));
			accessPoint.setAgenticSpaceId(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].AgenticSpaceId"));
			accessPoint.setARN(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].ARN"));
			accessPoint.setRootPathStatus(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].RootPathStatus"));

			PosixUser posixUser = new PosixUser();
			posixUser.setPosixGroupId(_ctx.integerValue("ListAccessPointsResponse.AccessPoints["+ i +"].PosixUser.PosixGroupId"));
			posixUser.setPosixUserId(_ctx.integerValue("ListAccessPointsResponse.AccessPoints["+ i +"].PosixUser.PosixUserId"));

			List<Integer> posixSecondaryGroupIds = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListAccessPointsResponse.AccessPoints["+ i +"].PosixUser.PosixSecondaryGroupIds.Length"); j++) {
				posixSecondaryGroupIds.add(_ctx.integerValue("ListAccessPointsResponse.AccessPoints["+ i +"].PosixUser.PosixSecondaryGroupIds["+ j +"]"));
			}
			posixUser.setPosixSecondaryGroupIds(posixSecondaryGroupIds);
			accessPoint.setPosixUser(posixUser);

			RootPathPermission rootPathPermission = new RootPathPermission();
			rootPathPermission.setOwnerUserId(_ctx.longValue("ListAccessPointsResponse.AccessPoints["+ i +"].RootPathPermission.OwnerUserId"));
			rootPathPermission.setPermission(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].RootPathPermission.Permission"));
			rootPathPermission.setOwnerGroupId(_ctx.longValue("ListAccessPointsResponse.AccessPoints["+ i +"].RootPathPermission.OwnerGroupId"));
			accessPoint.setRootPathPermission(rootPathPermission);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListAccessPointsResponse.AccessPoints["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			accessPoint.setTags(tags);

			accessPoints.add(accessPoint);
		}
		listAccessPointsResponse.setAccessPoints(accessPoints);
	 
	 	return listAccessPointsResponse;
	}
}