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

package com.aliyuncs.trademark.transform.v20190902;

import com.aliyuncs.trademark.model.v20190902.DescribeApplicantResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicantResponseUnmarshaller {

	public static DescribeApplicantResponse unmarshall(DescribeApplicantResponse describeApplicantResponse, UnmarshallerContext _ctx) {
		
		describeApplicantResponse.setRequestId(_ctx.stringValue("DescribeApplicantResponse.RequestId"));
		describeApplicantResponse.setContactDistrict(_ctx.stringValue("DescribeApplicantResponse.ContactDistrict"));
		describeApplicantResponse.setBusinessLicenceUrl(_ctx.stringValue("DescribeApplicantResponse.BusinessLicenceUrl"));
		describeApplicantResponse.setPassportUrl(_ctx.stringValue("DescribeApplicantResponse.PassportUrl"));
		describeApplicantResponse.setContactProvince(_ctx.stringValue("DescribeApplicantResponse.ContactProvince"));
		describeApplicantResponse.setLegalNoticeUrl(_ctx.stringValue("DescribeApplicantResponse.LegalNoticeUrl"));
		describeApplicantResponse.setEAddress(_ctx.stringValue("DescribeApplicantResponse.EAddress"));
		describeApplicantResponse.setContactCounty(_ctx.stringValue("DescribeApplicantResponse.ContactCounty"));
		describeApplicantResponse.setApplicantName(_ctx.stringValue("DescribeApplicantResponse.ApplicantName"));
		describeApplicantResponse.setContactEmail(_ctx.stringValue("DescribeApplicantResponse.ContactEmail"));
		describeApplicantResponse.setContactCity(_ctx.stringValue("DescribeApplicantResponse.ContactCity"));
		describeApplicantResponse.setAuthorizationAuditStatus(_ctx.integerValue("DescribeApplicantResponse.AuthorizationAuditStatus"));
		describeApplicantResponse.setApplicantRegion(_ctx.integerValue("DescribeApplicantResponse.ApplicantRegion"));
		describeApplicantResponse.setApplicantId(_ctx.longValue("DescribeApplicantResponse.ApplicantId"));
		describeApplicantResponse.setAddress(_ctx.stringValue("DescribeApplicantResponse.Address"));
		describeApplicantResponse.setNote(_ctx.stringValue("DescribeApplicantResponse.Note"));
		describeApplicantResponse.setPrincipalName(_ctx.integerValue("DescribeApplicantResponse.PrincipalName"));
		describeApplicantResponse.setApplicantType(_ctx.integerValue("DescribeApplicantResponse.ApplicantType"));
		describeApplicantResponse.setAuditStatus(_ctx.integerValue("DescribeApplicantResponse.AuditStatus"));
		describeApplicantResponse.setContactNumber(_ctx.stringValue("DescribeApplicantResponse.ContactNumber"));
		describeApplicantResponse.setContactAddress(_ctx.stringValue("DescribeApplicantResponse.ContactAddress"));
		describeApplicantResponse.setContactZipcode(_ctx.stringValue("DescribeApplicantResponse.ContactZipcode"));
		describeApplicantResponse.setAuthorizationUrl(_ctx.stringValue("DescribeApplicantResponse.AuthorizationUrl"));
		describeApplicantResponse.setContactName(_ctx.stringValue("DescribeApplicantResponse.ContactName"));
		describeApplicantResponse.setEName(_ctx.stringValue("DescribeApplicantResponse.EName"));
		describeApplicantResponse.setValidDate(_ctx.longValue("DescribeApplicantResponse.ValidDate"));
		describeApplicantResponse.setCardNumber(_ctx.stringValue("DescribeApplicantResponse.CardNumber"));
		describeApplicantResponse.setIdCardUrl(_ctx.stringValue("DescribeApplicantResponse.IdCardUrl"));
		describeApplicantResponse.setCountry(_ctx.stringValue("DescribeApplicantResponse.Country"));
		describeApplicantResponse.setProvince(_ctx.stringValue("DescribeApplicantResponse.Province"));
		describeApplicantResponse.setPersonalType(_ctx.longValue("DescribeApplicantResponse.PersonalType"));
		describeApplicantResponse.setIdCardName(_ctx.stringValue("DescribeApplicantResponse.IdCardName"));
		describeApplicantResponse.setIdCardNumber(_ctx.stringValue("DescribeApplicantResponse.IdCardNumber"));
		describeApplicantResponse.setApplicantVersion(_ctx.stringValue("DescribeApplicantResponse.ApplicantVersion"));
	 
	 	return describeApplicantResponse;
	}
}