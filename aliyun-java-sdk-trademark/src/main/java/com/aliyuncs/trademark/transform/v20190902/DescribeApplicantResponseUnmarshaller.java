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
		describeApplicantResponse.setApplicantType(_ctx.integerValue("DescribeApplicantResponse.ApplicantType"));
		describeApplicantResponse.setApplicantRegion(_ctx.integerValue("DescribeApplicantResponse.ApplicantRegion"));
		describeApplicantResponse.setContactName(_ctx.stringValue("DescribeApplicantResponse.ContactName"));
		describeApplicantResponse.setContactNumber(_ctx.stringValue("DescribeApplicantResponse.ContactNumber"));
		describeApplicantResponse.setContactEmail(_ctx.stringValue("DescribeApplicantResponse.ContactEmail"));
		describeApplicantResponse.setContactAddress(_ctx.stringValue("DescribeApplicantResponse.ContactAddress"));
		describeApplicantResponse.setContactZipcode(_ctx.stringValue("DescribeApplicantResponse.ContactZipcode"));
		describeApplicantResponse.setAuditStatus(_ctx.integerValue("DescribeApplicantResponse.AuditStatus"));
		describeApplicantResponse.setAuthorizationUrl(_ctx.stringValue("DescribeApplicantResponse.AuthorizationUrl"));
		describeApplicantResponse.setApplicantName(_ctx.stringValue("DescribeApplicantResponse.ApplicantName"));
		describeApplicantResponse.setCardNumber(_ctx.stringValue("DescribeApplicantResponse.CardNumber"));
		describeApplicantResponse.setProvince(_ctx.stringValue("DescribeApplicantResponse.Province"));
		describeApplicantResponse.setAddress(_ctx.stringValue("DescribeApplicantResponse.Address"));
		describeApplicantResponse.setEName(_ctx.stringValue("DescribeApplicantResponse.EName"));
		describeApplicantResponse.setEAddress(_ctx.stringValue("DescribeApplicantResponse.EAddress"));
		describeApplicantResponse.setAuthorizationAuditStatus(_ctx.integerValue("DescribeApplicantResponse.AuthorizationAuditStatus"));
		describeApplicantResponse.setIdCardUrl(_ctx.stringValue("DescribeApplicantResponse.IdCardUrl"));
		describeApplicantResponse.setBusinessLicenceUrl(_ctx.stringValue("DescribeApplicantResponse.BusinessLicenceUrl"));
		describeApplicantResponse.setPassportUrl(_ctx.stringValue("DescribeApplicantResponse.PassportUrl"));
		describeApplicantResponse.setApplicantId(_ctx.longValue("DescribeApplicantResponse.ApplicantId"));
		describeApplicantResponse.setLegalNoticeUrl(_ctx.stringValue("DescribeApplicantResponse.LegalNoticeUrl"));
		describeApplicantResponse.setNote(_ctx.stringValue("DescribeApplicantResponse.Note"));
		describeApplicantResponse.setCountry(_ctx.stringValue("DescribeApplicantResponse.Country"));
	 
	 	return describeApplicantResponse;
	}
}