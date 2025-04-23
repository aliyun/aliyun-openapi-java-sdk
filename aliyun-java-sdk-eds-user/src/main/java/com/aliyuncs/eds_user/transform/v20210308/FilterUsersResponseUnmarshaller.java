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

import com.aliyuncs.eds_user.model.v20210308.FilterUsersResponse;
import com.aliyuncs.eds_user.model.v20210308.FilterUsersResponse.Data;
import com.aliyuncs.eds_user.model.v20210308.FilterUsersResponse.Data.ExternalInfo;
import com.aliyuncs.eds_user.model.v20210308.FilterUsersResponse.Data.IdpInfo;
import com.aliyuncs.eds_user.model.v20210308.FilterUsersResponse.Data.OrgListItem;
import com.aliyuncs.eds_user.model.v20210308.FilterUsersResponse.Data.UserSetPropertiesModelsItem;
import com.aliyuncs.eds_user.model.v20210308.FilterUsersResponse.Data.UserSetPropertiesModelsItem.PropertyValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FilterUsersResponseUnmarshaller {

	public static FilterUsersResponse unmarshall(FilterUsersResponse filterUsersResponse, UnmarshallerContext _ctx) {
		
		filterUsersResponse.setRequestId(_ctx.stringValue("FilterUsersResponse.RequestId"));
		filterUsersResponse.setNextToken(_ctx.stringValue("FilterUsersResponse.NextToken"));

		List<Data> users = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("FilterUsersResponse.Users.Length"); i++) {
			Data data = new Data();
			data.setId(_ctx.longValue("FilterUsersResponse.Users["+ i +"].Id"));
			data.setEndUserId(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].EndUserId"));
			data.setEmail(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].Email"));
			data.setPhone(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].Phone"));
			data.setStatus(_ctx.longValue("FilterUsersResponse.Users["+ i +"].Status"));
			data.setDesktopCount(_ctx.longValue("FilterUsersResponse.Users["+ i +"].DesktopCount"));
			data.setDesktopGroupCount(_ctx.longValue("FilterUsersResponse.Users["+ i +"].DesktopGroupCount"));
			data.setOwnerType(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].OwnerType"));
			data.setRemark(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].Remark"));
			data.setIsTenantManager(_ctx.booleanValue("FilterUsersResponse.Users["+ i +"].IsTenantManager"));
			data.setEnableAdminAccess(_ctx.booleanValue("FilterUsersResponse.Users["+ i +"].EnableAdminAccess"));
			data.setRealNickName(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].RealNickName"));
			data.setAutoLockTime(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].AutoLockTime"));
			data.setPasswordExpireDays(_ctx.integerValue("FilterUsersResponse.Users["+ i +"].PasswordExpireDays"));
			data.setPasswordExpireRestDays(_ctx.integerValue("FilterUsersResponse.Users["+ i +"].PasswordExpireRestDays"));

			ExternalInfo externalInfo = new ExternalInfo();
			externalInfo.setExternalName(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].ExternalInfo.ExternalName"));
			externalInfo.setJobNumber(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].ExternalInfo.JobNumber"));
			data.setExternalInfo(externalInfo);

			List<UserSetPropertiesModelsItem> userSetPropertiesModels = new ArrayList<UserSetPropertiesModelsItem>();
			for (int j = 0; j < _ctx.lengthValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels.Length"); j++) {
				UserSetPropertiesModelsItem userSetPropertiesModelsItem = new UserSetPropertiesModelsItem();
				userSetPropertiesModelsItem.setUserId(_ctx.longValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels["+ j +"].UserId"));
				userSetPropertiesModelsItem.setUserName(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels["+ j +"].UserName"));
				userSetPropertiesModelsItem.setPropertyId(_ctx.longValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels["+ j +"].PropertyId"));
				userSetPropertiesModelsItem.setPropertyKey(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels["+ j +"].PropertyKey"));
				userSetPropertiesModelsItem.setPropertyType(_ctx.integerValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels["+ j +"].PropertyType"));

				List<PropertyValuesItem> propertyValues = new ArrayList<PropertyValuesItem>();
				for (int k = 0; k < _ctx.lengthValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels["+ j +"].PropertyValues.Length"); k++) {
					PropertyValuesItem propertyValuesItem = new PropertyValuesItem();
					propertyValuesItem.setPropertyValueId(_ctx.longValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels["+ j +"].PropertyValues["+ k +"].PropertyValueId"));
					propertyValuesItem.setPropertyValue(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].UserSetPropertiesModels["+ j +"].PropertyValues["+ k +"].PropertyValue"));

					propertyValues.add(propertyValuesItem);
				}
				userSetPropertiesModelsItem.setPropertyValues(propertyValues);

				userSetPropertiesModels.add(userSetPropertiesModelsItem);
			}
			data.setUserSetPropertiesModels(userSetPropertiesModels);

			List<OrgListItem> orgList = new ArrayList<OrgListItem>();
			for (int j = 0; j < _ctx.lengthValue("FilterUsersResponse.Users["+ i +"].OrgList.Length"); j++) {
				OrgListItem orgListItem = new OrgListItem();
				orgListItem.setOrgId(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].OrgList["+ j +"].OrgId"));
				orgListItem.setOrgName(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].OrgList["+ j +"].OrgName"));

				orgList.add(orgListItem);
			}
			data.setOrgList(orgList);

			List<IdpInfo> supportLoginIdps = new ArrayList<IdpInfo>();
			for (int j = 0; j < _ctx.lengthValue("FilterUsersResponse.Users["+ i +"].SupportLoginIdps.Length"); j++) {
				IdpInfo idpInfo = new IdpInfo();
				idpInfo.setIdpId(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].SupportLoginIdps["+ j +"].IdpId"));
				idpInfo.setIdpName(_ctx.stringValue("FilterUsersResponse.Users["+ i +"].SupportLoginIdps["+ j +"].IdpName"));

				supportLoginIdps.add(idpInfo);
			}
			data.setSupportLoginIdps(supportLoginIdps);

			users.add(data);
		}
		filterUsersResponse.setUsers(users);
	 
	 	return filterUsersResponse;
	}
}