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

package com.aliyuncs.cas.transform.v20200407;

import com.aliyuncs.cas.model.v20200407.GetUserCertificateDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserCertificateDetailResponseUnmarshaller {

	public static GetUserCertificateDetailResponse unmarshall(GetUserCertificateDetailResponse getUserCertificateDetailResponse, UnmarshallerContext _ctx) {
		
		getUserCertificateDetailResponse.setRequestId(_ctx.stringValue("GetUserCertificateDetailResponse.RequestId"));
		getUserCertificateDetailResponse.setCert(_ctx.stringValue("GetUserCertificateDetailResponse.Cert"));
		getUserCertificateDetailResponse.setKey(_ctx.stringValue("GetUserCertificateDetailResponse.Key"));
		getUserCertificateDetailResponse.setId(_ctx.longValue("GetUserCertificateDetailResponse.Id"));
		getUserCertificateDetailResponse.setName(_ctx.stringValue("GetUserCertificateDetailResponse.Name"));
		getUserCertificateDetailResponse.setCommon(_ctx.stringValue("GetUserCertificateDetailResponse.Common"));
		getUserCertificateDetailResponse.setFingerprint(_ctx.stringValue("GetUserCertificateDetailResponse.Fingerprint"));
		getUserCertificateDetailResponse.setIssuer(_ctx.stringValue("GetUserCertificateDetailResponse.Issuer"));
		getUserCertificateDetailResponse.setOrgName(_ctx.stringValue("GetUserCertificateDetailResponse.OrgName"));
		getUserCertificateDetailResponse.setProvince(_ctx.stringValue("GetUserCertificateDetailResponse.Province"));
		getUserCertificateDetailResponse.setCity(_ctx.stringValue("GetUserCertificateDetailResponse.City"));
		getUserCertificateDetailResponse.setCountry(_ctx.stringValue("GetUserCertificateDetailResponse.Country"));
		getUserCertificateDetailResponse.setStartDate(_ctx.stringValue("GetUserCertificateDetailResponse.StartDate"));
		getUserCertificateDetailResponse.setEndDate(_ctx.stringValue("GetUserCertificateDetailResponse.EndDate"));
		getUserCertificateDetailResponse.setSans(_ctx.stringValue("GetUserCertificateDetailResponse.Sans"));
		getUserCertificateDetailResponse.setExpired(_ctx.booleanValue("GetUserCertificateDetailResponse.Expired"));
		getUserCertificateDetailResponse.setBuyInAliyun(_ctx.booleanValue("GetUserCertificateDetailResponse.BuyInAliyun"));
	 
	 	return getUserCertificateDetailResponse;
	}
}