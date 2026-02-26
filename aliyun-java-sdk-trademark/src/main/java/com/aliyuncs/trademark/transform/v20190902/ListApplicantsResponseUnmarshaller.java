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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.ListApplicantsResponse;
import com.aliyuncs.trademark.model.v20190902.ListApplicantsResponse.Applicant;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicantsResponseUnmarshaller {

	public static ListApplicantsResponse unmarshall(ListApplicantsResponse listApplicantsResponse, UnmarshallerContext _ctx) {
		
		listApplicantsResponse.setRequestId(_ctx.stringValue("ListApplicantsResponse.RequestId"));
		listApplicantsResponse.setPageNumber(_ctx.integerValue("ListApplicantsResponse.PageNumber"));
		listApplicantsResponse.setPageSize(_ctx.integerValue("ListApplicantsResponse.PageSize"));
		listApplicantsResponse.setTotalCount(_ctx.integerValue("ListApplicantsResponse.TotalCount"));

		List<Applicant> applicants = new ArrayList<Applicant>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicantsResponse.Applicants.Length"); i++) {
			Applicant applicant = new Applicant();
			applicant.setValidDate(_ctx.longValue("ListApplicantsResponse.Applicants["+ i +"].ValidDate"));
			applicant.setCardNumber(_ctx.stringValue("ListApplicantsResponse.Applicants["+ i +"].CardNumber"));
			applicant.setApplicantName(_ctx.stringValue("ListApplicantsResponse.Applicants["+ i +"].ApplicantName"));
			applicant.setAuthorizationAuditStatus(_ctx.integerValue("ListApplicantsResponse.Applicants["+ i +"].AuthorizationAuditStatus"));
			applicant.setApplicantRegion(_ctx.integerValue("ListApplicantsResponse.Applicants["+ i +"].ApplicantRegion"));
			applicant.setApplicantId(_ctx.longValue("ListApplicantsResponse.Applicants["+ i +"].ApplicantId"));
			applicant.setAuthorizationUrl(_ctx.stringValue("ListApplicantsResponse.Applicants["+ i +"].AuthorizationUrl"));
			applicant.setContactName(_ctx.stringValue("ListApplicantsResponse.Applicants["+ i +"].ContactName"));
			applicant.setPrincipalName(_ctx.integerValue("ListApplicantsResponse.Applicants["+ i +"].PrincipalName"));
			applicant.setApplicantType(_ctx.integerValue("ListApplicantsResponse.Applicants["+ i +"].ApplicantType"));
			applicant.setAuditStatus(_ctx.integerValue("ListApplicantsResponse.Applicants["+ i +"].AuditStatus"));
			applicant.setApplicantVersion(_ctx.stringValue("ListApplicantsResponse.Applicants["+ i +"].ApplicantVersion"));
			applicant.setSystemVersion(_ctx.stringValue("ListApplicantsResponse.Applicants["+ i +"].SystemVersion"));

			applicants.add(applicant);
		}
		listApplicantsResponse.setApplicants(applicants);
	 
	 	return listApplicantsResponse;
	}
}