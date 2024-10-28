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

import com.aliyuncs.nas.model.v20170626.DescribeAccessPointsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeAccessPointsResponse.AccessPoint;
import com.aliyuncs.nas.model.v20170626.DescribeAccessPointsResponse.AccessPoint.PosixUser;
import com.aliyuncs.nas.model.v20170626.DescribeAccessPointsResponse.AccessPoint.RootPathPermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessPointsResponseUnmarshaller {

	public static DescribeAccessPointsResponse unmarshall(DescribeAccessPointsResponse describeAccessPointsResponse, UnmarshallerContext _ctx) {
		
		describeAccessPointsResponse.setRequestId(_ctx.stringValue("DescribeAccessPointsResponse.RequestId"));
		describeAccessPointsResponse.setNextToken(_ctx.stringValue("DescribeAccessPointsResponse.NextToken"));
		describeAccessPointsResponse.setTotalCount(_ctx.integerValue("DescribeAccessPointsResponse.TotalCount"));

		List<AccessPoint> accessPoints = new ArrayList<AccessPoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessPointsResponse.AccessPoints.Length"); i++) {
			AccessPoint accessPoint = new AccessPoint();
			accessPoint.setARN(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].ARN"));
			accessPoint.setAccessGroup(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].AccessGroup"));
			accessPoint.setAccessPointId(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].AccessPointId"));
			accessPoint.setAccessPointName(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].AccessPointName"));
			accessPoint.setCreateTime(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].CreateTime"));
			accessPoint.setDomainName(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].DomainName"));
			accessPoint.setEnabledRam(_ctx.booleanValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].EnabledRam"));
			accessPoint.setFileSystemId(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].FileSystemId"));
			accessPoint.setModifyTime(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].ModifyTime"));
			accessPoint.setRootPath(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].RootPath"));
			accessPoint.setRootPathStatus(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].RootPathStatus"));
			accessPoint.setStatus(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].Status"));
			accessPoint.setVSwitchId(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].VSwitchId"));
			accessPoint.setVpcId(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].VpcId"));

			PosixUser posixUser = new PosixUser();
			posixUser.setPosixGroupId(_ctx.integerValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].PosixUser.PosixGroupId"));
			posixUser.setPosixUserId(_ctx.integerValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].PosixUser.PosixUserId"));

			List<Integer> posixSecondaryGroupIds = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].PosixUser.PosixSecondaryGroupIds.Length"); j++) {
				posixSecondaryGroupIds.add(_ctx.integerValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].PosixUser.PosixSecondaryGroupIds["+ j +"]"));
			}
			posixUser.setPosixSecondaryGroupIds(posixSecondaryGroupIds);
			accessPoint.setPosixUser(posixUser);

			RootPathPermission rootPathPermission = new RootPathPermission();
			rootPathPermission.setOwnerGroupId(_ctx.longValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].RootPathPermission.OwnerGroupId"));
			rootPathPermission.setOwnerUserId(_ctx.longValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].RootPathPermission.OwnerUserId"));
			rootPathPermission.setPermission(_ctx.stringValue("DescribeAccessPointsResponse.AccessPoints["+ i +"].RootPathPermission.Permission"));
			accessPoint.setRootPathPermission(rootPathPermission);

			accessPoints.add(accessPoint);
		}
		describeAccessPointsResponse.setAccessPoints(accessPoints);
	 
	 	return describeAccessPointsResponse;
	}
}