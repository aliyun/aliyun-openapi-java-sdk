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

import com.aliyuncs.eds_user.model.v20210308.DescribeUserResponse;
import com.aliyuncs.eds_user.model.v20210308.DescribeUserResponse.User;
import com.aliyuncs.eds_user.model.v20210308.DescribeUserResponse.User.ExternalInfo;
import com.aliyuncs.eds_user.model.v20210308.DescribeUserResponse.User.Property;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserResponseUnmarshaller {

	public static DescribeUserResponse unmarshall(DescribeUserResponse describeUserResponse, UnmarshallerContext _ctx) {
		
		describeUserResponse.setRequestId(_ctx.stringValue("DescribeUserResponse.RequestId"));

		User user = new User();
		user.setEndUserId(_ctx.stringValue("DescribeUserResponse.User.EndUserId"));
		user.setEmail(_ctx.stringValue("DescribeUserResponse.User.Email"));
		user.setPhone(_ctx.stringValue("DescribeUserResponse.User.Phone"));
		user.setRemark(_ctx.stringValue("DescribeUserResponse.User.Remark"));
		user.setWyId(_ctx.stringValue("DescribeUserResponse.User.WyId"));
		user.setStatus(_ctx.integerValue("DescribeUserResponse.User.Status"));
		user.setExtras(_ctx.mapValue("DescribeUserResponse.User.Extras"));
		user.setGmtCreate(_ctx.longValue("DescribeUserResponse.User.GmtCreate"));
		user.setNickName(_ctx.stringValue("DescribeUserResponse.User.NickName"));

		List<String> orgIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserResponse.User.OrgIds.Length"); i++) {
			orgIds.add(_ctx.stringValue("DescribeUserResponse.User.OrgIds["+ i +"]"));
		}
		user.setOrgIds(orgIds);

		List<String> orgPaths = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserResponse.User.OrgPaths.Length"); i++) {
			orgPaths.add(_ctx.stringValue("DescribeUserResponse.User.OrgPaths["+ i +"]"));
		}
		user.setOrgPaths(orgPaths);

		ExternalInfo externalInfo = new ExternalInfo();
		externalInfo.setExternalName(_ctx.stringValue("DescribeUserResponse.User.ExternalInfo.ExternalName"));
		externalInfo.setJobNumber(_ctx.stringValue("DescribeUserResponse.User.ExternalInfo.JobNumber"));
		externalInfo.setSsoType(_ctx.stringValue("DescribeUserResponse.User.ExternalInfo.SsoType"));
		externalInfo.setExternalId(_ctx.stringValue("DescribeUserResponse.User.ExternalInfo.ExternalId"));
		user.setExternalInfo(externalInfo);

		List<Property> properties = new ArrayList<Property>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserResponse.User.Properties.Length"); i++) {
			Property property = new Property();
			property.setKey(_ctx.stringValue("DescribeUserResponse.User.Properties["+ i +"].Key"));
			property.setValue(_ctx.stringValue("DescribeUserResponse.User.Properties["+ i +"].Value"));

			properties.add(property);
		}
		user.setProperties(properties);
		describeUserResponse.setUser(user);
	 
	 	return describeUserResponse;
	}
}