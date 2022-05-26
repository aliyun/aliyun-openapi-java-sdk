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

import com.aliyuncs.account_crm.model.v20160606.QueryAccountAddressInfoResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountAddressInfoResponse.ProfileInfo;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountAddressInfoResponse.ProfileInfo.City;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountAddressInfoResponse.ProfileInfo.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountAddressInfoResponseUnmarshaller {

	public static QueryAccountAddressInfoResponse unmarshall(QueryAccountAddressInfoResponse queryAccountAddressInfoResponse, UnmarshallerContext _ctx) {
		
		queryAccountAddressInfoResponse.setRequestId(_ctx.stringValue("QueryAccountAddressInfoResponse.RequestId"));
		queryAccountAddressInfoResponse.setCode(_ctx.stringValue("QueryAccountAddressInfoResponse.Code"));
		queryAccountAddressInfoResponse.setMessage(_ctx.stringValue("QueryAccountAddressInfoResponse.Message"));
		queryAccountAddressInfoResponse.setSuccess(_ctx.booleanValue("QueryAccountAddressInfoResponse.Success"));

		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setAccountAttr(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.AccountAttr"));
		profileInfo.setAddress6(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Address6"));
		profileInfo.setPostCode(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.PostCode"));
		profileInfo.setAddress4(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Address4"));
		profileInfo.setEmail(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Email"));
		profileInfo.setHavanaId(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.HavanaId"));
		profileInfo.setAddress3(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Address3"));
		profileInfo.setAddress5(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Address5"));
		profileInfo.setVersion(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Version"));
		profileInfo.setAddress(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Address"));
		profileInfo.setNationalityCode(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.NationalityCode"));
		profileInfo.setAddress2(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Address2"));
		profileInfo.setTrueName(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.TrueName"));

		Province province = new Province();
		province.setName(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Province.Name"));
		province.setId(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.Province.Id"));
		profileInfo.setProvince(province);

		City city = new City();
		city.setName(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.City.Name"));
		city.setId(_ctx.stringValue("QueryAccountAddressInfoResponse.ProfileInfo.City.Id"));
		profileInfo.setCity(city);
		queryAccountAddressInfoResponse.setProfileInfo(profileInfo);
	 
	 	return queryAccountAddressInfoResponse;
	}
}