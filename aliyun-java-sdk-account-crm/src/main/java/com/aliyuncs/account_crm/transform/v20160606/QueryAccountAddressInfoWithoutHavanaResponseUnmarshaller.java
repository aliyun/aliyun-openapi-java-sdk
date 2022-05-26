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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.QueryAccountAddressInfoWithoutHavanaResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.City;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountAddressInfoWithoutHavanaResponseUnmarshaller {

	public static QueryAccountAddressInfoWithoutHavanaResponse unmarshall(QueryAccountAddressInfoWithoutHavanaResponse queryAccountAddressInfoWithoutHavanaResponse, UnmarshallerContext _ctx) {
		
		queryAccountAddressInfoWithoutHavanaResponse.setRequestId(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.RequestId"));
		queryAccountAddressInfoWithoutHavanaResponse.setCode(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.Code"));
		queryAccountAddressInfoWithoutHavanaResponse.setMessage(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.Message"));
		queryAccountAddressInfoWithoutHavanaResponse.setSuccess(_ctx.booleanValue("QueryAccountAddressInfoWithoutHavanaResponse.Success"));

		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setAddress6(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Address6"));
		profileInfo.setAddress4(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Address4"));
		profileInfo.setAccountAttr(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.AccountAttr"));
		profileInfo.setVersion(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Version"));
		profileInfo.setPostCode(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.PostCode"));
		profileInfo.setAddress5(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Address5"));
		profileInfo.setAddress3(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Address3"));
		profileInfo.setHavanaId(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.HavanaId"));
		profileInfo.setAddress(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Address"));
		profileInfo.setAddress2(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Address2"));
		profileInfo.setTrueName(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.TrueName"));

		Province province = new Province();
		province.setName(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Province.Name"));
		province.setId(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.Province.Id"));
		profileInfo.setProvince(province);

		City city = new City();
		city.setName(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.City.Name"));
		city.setId(_ctx.stringValue("QueryAccountAddressInfoWithoutHavanaResponse.ProfileInfo.City.Id"));
		profileInfo.setCity(city);
		queryAccountAddressInfoWithoutHavanaResponse.setProfileInfo(profileInfo);
	 
	 	return queryAccountAddressInfoWithoutHavanaResponse;
	}
}