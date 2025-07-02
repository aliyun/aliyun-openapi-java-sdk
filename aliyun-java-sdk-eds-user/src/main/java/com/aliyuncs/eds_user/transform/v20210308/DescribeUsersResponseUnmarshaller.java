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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.DescribeUsersResponse;
import com.aliyuncs.eds_user.model.v20210308.DescribeUsersResponse.Data;
import com.aliyuncs.eds_user.model.v20210308.DescribeUsersResponse.Data.Extras;
import com.aliyuncs.eds_user.model.v20210308.DescribeUsersResponse.Data.Group;
import com.aliyuncs.eds_user.model.v20210308.DescribeUsersResponse.Data.Org;
import com.aliyuncs.eds_user.model.v20210308.DescribeUsersResponse.Data.Property;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUsersResponseUnmarshaller {

	public static DescribeUsersResponse unmarshall(DescribeUsersResponse describeUsersResponse, UnmarshallerContext _ctx) {
		
		describeUsersResponse.setRequestId(_ctx.stringValue("DescribeUsersResponse.RequestId"));
		describeUsersResponse.setNextToken(_ctx.stringValue("DescribeUsersResponse.NextToken"));

		List<Data> users = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUsersResponse.Users.Length"); i++) {
			Data data = new Data();
			data.setId(_ctx.longValue("DescribeUsersResponse.Users["+ i +"].Id"));
			data.setEndUserId(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].EndUserId"));
			data.setEmail(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Email"));
			data.setPhone(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Phone"));
			data.setStatus(_ctx.longValue("DescribeUsersResponse.Users["+ i +"].Status"));
			data.setOwnerType(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].OwnerType"));
			data.setRemark(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Remark"));
			data.setOrgId(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].OrgId"));
			data.setWyId(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].WyId"));
			data.setIsTenantManager(_ctx.booleanValue("DescribeUsersResponse.Users["+ i +"].IsTenantManager"));
			data.setAvatar(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Avatar"));
			data.setAddress(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Address"));
			data.setNickName(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].NickName"));
			data.setRealNickName(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].RealNickName"));
			data.setJobNumber(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].JobNumber"));
			data.setExternalName(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].ExternalName"));

			Extras extras = new Extras();
			extras.setAssignedResourceCount(_ctx.mapValue("DescribeUsersResponse.Users["+ i +"].Extras.AssignedResourceCount"));
			data.setExtras(extras);

			List<Group> groups = new ArrayList<Group>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUsersResponse.Users["+ i +"].Groups.Length"); j++) {
				Group group = new Group();
				group.setGroupId(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Groups["+ j +"].GroupId"));
				group.setGroupName(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Groups["+ j +"].GroupName"));

				groups.add(group);
			}
			data.setGroups(groups);

			List<Org> orgs = new ArrayList<Org>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUsersResponse.Users["+ i +"].Orgs.Length"); j++) {
				Org org = new Org();
				org.setOrgId(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Orgs["+ j +"].OrgId"));
				org.setOrgName(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Orgs["+ j +"].OrgName"));
				org.setOrgNamePath(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Orgs["+ j +"].OrgNamePath"));

				orgs.add(org);
			}
			data.setOrgs(orgs);

			List<Property> properties = new ArrayList<Property>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUsersResponse.Users["+ i +"].Properties.Length"); j++) {
				Property property = new Property();
				property.setKey(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Properties["+ j +"].Key"));
				property.setValue(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Properties["+ j +"].Value"));

				properties.add(property);
			}
			data.setProperties(properties);

			users.add(data);
		}
		describeUsersResponse.setUsers(users);
	 
	 	return describeUsersResponse;
	}
}