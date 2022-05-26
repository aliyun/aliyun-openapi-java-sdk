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

import com.aliyuncs.account_crm.model.v20160606.QueryAccountProfileInfoResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountProfileInfoResponse.ProfileInfo;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountProfileInfoResponse.ProfileInfo.City;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountProfileInfoResponse.ProfileInfo.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountProfileInfoResponseUnmarshaller {

	public static QueryAccountProfileInfoResponse unmarshall(QueryAccountProfileInfoResponse queryAccountProfileInfoResponse, UnmarshallerContext _ctx) {
		
		queryAccountProfileInfoResponse.setRequestId(_ctx.stringValue("QueryAccountProfileInfoResponse.RequestId"));

		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setUpdateTime(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.UpdateTime"));
		profileInfo.setRegisterIP(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.RegisterIP"));
		profileInfo.setCreateTime(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.CreateTime"));
		profileInfo.setContactMethod(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.ContactMethod"));
		profileInfo.setActiveNotSetMobile(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.ActiveNotSetMobile"));
		profileInfo.setMobile(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Mobile"));
		profileInfo.setFax(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Fax"));
		profileInfo.setBankId(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.BankId"));
		profileInfo.setFirstName(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.FirstName"));
		profileInfo.setSecurityMobile(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.SecurityMobile"));
		profileInfo.setTaobaoAccount(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.TaobaoAccount"));
		profileInfo.setYahooEmail(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.YahooEmail"));
		profileInfo.setIsCertified(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.IsCertified"));
		profileInfo.setAlipayUid(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.AlipayUid"));
		profileInfo.setAlipayAccount(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.AlipayAccount"));
		profileInfo.setSrc(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Src"));
		profileInfo.setNickName(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.NickName"));
		profileInfo.setAuthDomainUserId(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.AuthDomainUserId"));
		profileInfo.setPhone(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Phone"));
		profileInfo.setCertifiedFrom(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.CertifiedFrom"));
		profileInfo.setBeiAnMobile(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.BeiAnMobile"));
		profileInfo.setNationalityCode(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.NationalityCode"));
		profileInfo.setIDNumber(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.IDNumber"));
		profileInfo.setAddress2(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Address2"));
		profileInfo.setTrueName(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.TrueName"));
		profileInfo.setAddress6(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Address6"));
		profileInfo.setOwn(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Own"));
		profileInfo.setEid(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Eid"));
		profileInfo.setAddress4(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Address4"));
		profileInfo.setFyl(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Fyl"));
		profileInfo.setBeiAnAuthCId(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.BeiAnAuthCId"));
		profileInfo.setAddress(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Address"));
		profileInfo.setTaobaoNickFromHavana(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.TaobaoNickFromHavana"));
		profileInfo.setBeiAnIcpNumber(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.BeiAnIcpNumber"));
		profileInfo.setAliyunPK(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.AliyunPK"));
		profileInfo.setAliyunID(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.AliyunID"));
		profileInfo.setAccountAttr(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.AccountAttr"));
		profileInfo.setPostCode(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.PostCode"));
		profileInfo.setProcessingEnterpriseCertify(_ctx.booleanValue("QueryAccountProfileInfoResponse.ProfileInfo.ProcessingEnterpriseCertify"));
		profileInfo.setBindAlipayNo(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.BindAlipayNo"));
		profileInfo.setTbhid(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Tbhid"));
		profileInfo.setB2bhid(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.B2bhid"));
		profileInfo.setIsBankIDAuth(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.IsBankIDAuth"));
		profileInfo.setHead(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Head"));
		profileInfo.setCertifiedTime(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.CertifiedTime"));
		profileInfo.setEmail(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Email"));
		profileInfo.setAuthAlipay(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.AuthAlipay"));
		profileInfo.setSecurityQuestionExists(_ctx.booleanValue("QueryAccountProfileInfoResponse.ProfileInfo.SecurityQuestionExists"));
		profileInfo.setHavanaId(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.HavanaId"));
		profileInfo.setPreferredLanguage(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.PreferredLanguage"));
		profileInfo.setAddress3(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Address3"));
		profileInfo.setAddress5(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Address5"));
		profileInfo.setCertType(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.CertType"));
		profileInfo.setAccountCertifyType(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.AccountCertifyType"));
		profileInfo.setBankName(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.BankName"));
		profileInfo.setLastName(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.LastName"));

		Province province = new Province();
		province.setName(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Province.Name"));
		province.setId(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.Province.Id"));
		profileInfo.setProvince(province);

		City city = new City();
		city.setName(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.City.Name"));
		city.setId(_ctx.stringValue("QueryAccountProfileInfoResponse.ProfileInfo.City.Id"));
		profileInfo.setCity(city);
		queryAccountProfileInfoResponse.setProfileInfo(profileInfo);
	 
	 	return queryAccountProfileInfoResponse;
	}
}