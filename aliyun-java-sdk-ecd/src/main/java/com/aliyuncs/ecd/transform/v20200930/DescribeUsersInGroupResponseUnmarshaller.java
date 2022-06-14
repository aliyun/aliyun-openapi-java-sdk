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

import com.aliyuncs.ecd.model.v20200930.DescribeUsersInGroupResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeUsersInGroupResponse.EndUser;
import com.aliyuncs.ecd.model.v20200930.DescribeUsersInGroupResponse.EndUser.ExternalInfo;
import com.aliyuncs.ecd.model.v20200930.DescribeUsersInGroupResponse.EndUser.UserSetPropertiesModelsItem;
import com.aliyuncs.ecd.model.v20200930.DescribeUsersInGroupResponse.EndUser.UserSetPropertiesModelsItem.PropertyValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUsersInGroupResponseUnmarshaller {

	public static DescribeUsersInGroupResponse unmarshall(DescribeUsersInGroupResponse describeUsersInGroupResponse, UnmarshallerContext _ctx) {
		
		describeUsersInGroupResponse.setRequestId(_ctx.stringValue("DescribeUsersInGroupResponse.RequestId"));
		describeUsersInGroupResponse.setNextToken(_ctx.stringValue("DescribeUsersInGroupResponse.NextToken"));
		describeUsersInGroupResponse.setUsersCount(_ctx.integerValue("DescribeUsersInGroupResponse.UsersCount"));
		describeUsersInGroupResponse.setOnlineUsersCount(_ctx.integerValue("DescribeUsersInGroupResponse.OnlineUsersCount"));

		List<EndUser> endUsers = new ArrayList<EndUser>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUsersInGroupResponse.EndUsers.Length"); i++) {
			EndUser endUser = new EndUser();
			endUser.setEndUserId(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].EndUserId"));
			endUser.setEndUserEmail(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].EndUserEmail"));
			endUser.setDesktopName(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].DesktopName"));
			endUser.setConnectionStatus(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].ConnectionStatus"));
			endUser.setDesktopId(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].DesktopId"));
			endUser.setEndUserType(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].EndUserType"));
			endUser.setEndUserPhone(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].EndUserPhone"));
			endUser.setEndUserName(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].EndUserName"));

			ExternalInfo externalInfo = new ExternalInfo();
			externalInfo.setExternalName(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].ExternalInfo.ExternalName"));
			externalInfo.setJobNumber(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].ExternalInfo.JobNumber"));
			endUser.setExternalInfo(externalInfo);

			List<UserSetPropertiesModelsItem> userSetPropertiesModels = new ArrayList<UserSetPropertiesModelsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels.Length"); j++) {
				UserSetPropertiesModelsItem userSetPropertiesModelsItem = new UserSetPropertiesModelsItem();
				userSetPropertiesModelsItem.setUserId(_ctx.longValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels["+ j +"].UserId"));
				userSetPropertiesModelsItem.setUserName(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels["+ j +"].UserName"));
				userSetPropertiesModelsItem.setPropertyId(_ctx.longValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels["+ j +"].PropertyId"));
				userSetPropertiesModelsItem.setPropertyKey(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels["+ j +"].PropertyKey"));
				userSetPropertiesModelsItem.setPropertyType(_ctx.integerValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels["+ j +"].PropertyType"));

				List<PropertyValuesItem> propertyValues = new ArrayList<PropertyValuesItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels["+ j +"].PropertyValues.Length"); k++) {
					PropertyValuesItem propertyValuesItem = new PropertyValuesItem();
					propertyValuesItem.setPropertyValueId(_ctx.longValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels["+ j +"].PropertyValues["+ k +"].PropertyValueId"));
					propertyValuesItem.setPropertyValue(_ctx.stringValue("DescribeUsersInGroupResponse.EndUsers["+ i +"].UserSetPropertiesModels["+ j +"].PropertyValues["+ k +"].PropertyValue"));

					propertyValues.add(propertyValuesItem);
				}
				userSetPropertiesModelsItem.setPropertyValues(propertyValues);

				userSetPropertiesModels.add(userSetPropertiesModelsItem);
			}
			endUser.setUserSetPropertiesModels(userSetPropertiesModels);

			endUsers.add(endUser);
		}
		describeUsersInGroupResponse.setEndUsers(endUsers);
	 
	 	return describeUsersInGroupResponse;
	}
}