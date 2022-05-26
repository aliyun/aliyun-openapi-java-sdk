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

import com.aliyuncs.account_crm.model.v20160606.QueryEnterpriseInfoResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryEnterpriseInfoResponse.ProfileInfo;
import com.aliyuncs.account_crm.model.v20160606.QueryEnterpriseInfoResponse.ProfileInfo.City;
import com.aliyuncs.account_crm.model.v20160606.QueryEnterpriseInfoResponse.ProfileInfo.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEnterpriseInfoResponseUnmarshaller {

	public static QueryEnterpriseInfoResponse unmarshall(QueryEnterpriseInfoResponse queryEnterpriseInfoResponse, UnmarshallerContext _ctx) {
		
		queryEnterpriseInfoResponse.setRequestId(_ctx.stringValue("QueryEnterpriseInfoResponse.RequestId"));
		queryEnterpriseInfoResponse.setCode(_ctx.stringValue("QueryEnterpriseInfoResponse.Code"));
		queryEnterpriseInfoResponse.setMessage(_ctx.stringValue("QueryEnterpriseInfoResponse.Message"));
		queryEnterpriseInfoResponse.setSuccess(_ctx.booleanValue("QueryEnterpriseInfoResponse.Success"));

		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setPostalCode(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.PostalCode"));
		profileInfo.setYears(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Years"));
		profileInfo.setAliyunPK(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.AliyunPK"));
		profileInfo.setUpdateTime(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.UpdateTime"));
		profileInfo.setCreateTime(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.CreateTime"));
		profileInfo.setBusinessLicenseType(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.BusinessLicenseType"));
		profileInfo.setPhone(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Phone"));
		profileInfo.setProfile(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Profile"));
		profileInfo.setCertifiedTime(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.CertifiedTime"));
		profileInfo.setExtend(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Extend"));
		profileInfo.setBusinessLicenseImgSrc(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.BusinessLicenseImgSrc"));
		profileInfo.setCertifiedFrom(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.CertifiedFrom"));
		profileInfo.setEntityIDNumber(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.EntityIDNumber"));
		profileInfo.setFax(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Fax"));
		profileInfo.setEInterpriseSize(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.EInterpriseSize"));
		profileInfo.setDetailAddress(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.DetailAddress"));
		profileInfo.setBusinessLicenseNumber(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.BusinessLicenseNumber"));
		profileInfo.setEnterpriseEntity(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.EnterpriseEntity"));
		profileInfo.setName(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Name"));
		profileInfo.setAuditStatus(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.AuditStatus"));
		profileInfo.setAlias(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Alias"));

		Province province = new Province();
		province.setName(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Province.Name"));
		province.setId(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.Province.Id"));
		profileInfo.setProvince(province);

		City city = new City();
		city.setName(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.City.Name"));
		city.setId(_ctx.stringValue("QueryEnterpriseInfoResponse.ProfileInfo.City.Id"));
		profileInfo.setCity(city);
		queryEnterpriseInfoResponse.setProfileInfo(profileInfo);
	 
	 	return queryEnterpriseInfoResponse;
	}
}