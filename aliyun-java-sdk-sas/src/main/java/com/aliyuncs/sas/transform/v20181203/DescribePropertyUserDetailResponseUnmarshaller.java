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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribePropertyUserDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyUserDetailResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyUserDetailResponse.PropertyUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyUserDetailResponseUnmarshaller {

	public static DescribePropertyUserDetailResponse unmarshall(DescribePropertyUserDetailResponse describePropertyUserDetailResponse, UnmarshallerContext _ctx) {
		
		describePropertyUserDetailResponse.setRequestId(_ctx.stringValue("DescribePropertyUserDetailResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyUserDetailResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyUserDetailResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyUserDetailResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribePropertyUserDetailResponse.PageInfo.Count"));
		describePropertyUserDetailResponse.setPageInfo(pageInfo);

		List<PropertyUser> propertys = new ArrayList<PropertyUser>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyUserDetailResponse.Propertys.Length"); i++) {
			PropertyUser propertyUser = new PropertyUser();
			propertyUser.setStatus(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].Status"));
			propertyUser.setLastLoginIp(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].LastLoginIp"));
			propertyUser.setInternetIp(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].InternetIp"));
			propertyUser.setLastLoginTime(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].LastLoginTime"));
			propertyUser.setIsRoot(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].IsRoot"));
			propertyUser.setIp(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].Ip"));
			propertyUser.setUser(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].User"));
			propertyUser.setInstanceId(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].InstanceId"));
			propertyUser.setIntranetIp(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].IntranetIp"));
			propertyUser.setPasswordExpirationDate(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].PasswordExpirationDate"));
			propertyUser.setUuid(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].Uuid"));
			propertyUser.setLastLoginTimestamp(_ctx.longValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].LastLoginTimestamp"));
			propertyUser.setInstanceName(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].InstanceName"));
			propertyUser.setAccountsExpirationDate(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].AccountsExpirationDate"));
			propertyUser.setCreateTimestamp(_ctx.longValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].CreateTimestamp"));
			propertyUser.setLastLoginTimeDt(_ctx.longValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].LastLoginTimeDt"));
			propertyUser.setIsPasswdExpired(_ctx.integerValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].IsPasswdExpired"));
			propertyUser.setIsPasswdLocked(_ctx.integerValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].IsPasswdLocked"));
			propertyUser.setIsUserExpired(_ctx.integerValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].IsUserExpired"));
			propertyUser.setIsCouldLogin(_ctx.integerValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].IsCouldLogin"));
			propertyUser.setIsSudoer(_ctx.integerValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].IsSudoer"));

			List<String> groupNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].GroupNames.Length"); j++) {
				groupNames.add(_ctx.stringValue("DescribePropertyUserDetailResponse.Propertys["+ i +"].GroupNames["+ j +"]"));
			}
			propertyUser.setGroupNames(groupNames);

			propertys.add(propertyUser);
		}
		describePropertyUserDetailResponse.setPropertys(propertys);
	 
	 	return describePropertyUserDetailResponse;
	}
}