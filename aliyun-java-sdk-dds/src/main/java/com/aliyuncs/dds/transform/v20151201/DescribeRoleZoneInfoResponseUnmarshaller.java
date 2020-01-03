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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeRoleZoneInfoResponse;
import com.aliyuncs.dds.model.v20151201.DescribeRoleZoneInfoResponse.ZoneInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRoleZoneInfoResponseUnmarshaller {

	public static DescribeRoleZoneInfoResponse unmarshall(DescribeRoleZoneInfoResponse describeRoleZoneInfoResponse, UnmarshallerContext _ctx) {
		
		describeRoleZoneInfoResponse.setRequestId(_ctx.stringValue("DescribeRoleZoneInfoResponse.RequestId"));

		List<ZoneInfo> zoneInfos = new ArrayList<ZoneInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRoleZoneInfoResponse.ZoneInfos.Length"); i++) {
			ZoneInfo zoneInfo = new ZoneInfo();
			zoneInfo.setNodeType(_ctx.stringValue("DescribeRoleZoneInfoResponse.ZoneInfos["+ i +"].NodeType"));
			zoneInfo.setRoleType(_ctx.stringValue("DescribeRoleZoneInfoResponse.ZoneInfos["+ i +"].RoleType"));
			zoneInfo.setZoneId(_ctx.stringValue("DescribeRoleZoneInfoResponse.ZoneInfos["+ i +"].ZoneId"));
			zoneInfo.setRoleId(_ctx.stringValue("DescribeRoleZoneInfoResponse.ZoneInfos["+ i +"].RoleId"));
			zoneInfo.setInsName(_ctx.stringValue("DescribeRoleZoneInfoResponse.ZoneInfos["+ i +"].InsName"));

			zoneInfos.add(zoneInfo);
		}
		describeRoleZoneInfoResponse.setZoneInfos(zoneInfos);
	 
	 	return describeRoleZoneInfoResponse;
	}
}