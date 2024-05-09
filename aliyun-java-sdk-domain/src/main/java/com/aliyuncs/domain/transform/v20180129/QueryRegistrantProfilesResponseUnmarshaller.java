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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryRegistrantProfilesResponse;
import com.aliyuncs.domain.model.v20180129.QueryRegistrantProfilesResponse.RegistrantProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRegistrantProfilesResponseUnmarshaller {

	public static QueryRegistrantProfilesResponse unmarshall(QueryRegistrantProfilesResponse queryRegistrantProfilesResponse, UnmarshallerContext _ctx) {
		
		queryRegistrantProfilesResponse.setRequestId(_ctx.stringValue("QueryRegistrantProfilesResponse.RequestId"));
		queryRegistrantProfilesResponse.setNextPage(_ctx.booleanValue("QueryRegistrantProfilesResponse.NextPage"));
		queryRegistrantProfilesResponse.setTotalItemNum(_ctx.integerValue("QueryRegistrantProfilesResponse.TotalItemNum"));
		queryRegistrantProfilesResponse.setPrePage(_ctx.booleanValue("QueryRegistrantProfilesResponse.PrePage"));
		queryRegistrantProfilesResponse.setCurrentPageNum(_ctx.integerValue("QueryRegistrantProfilesResponse.CurrentPageNum"));
		queryRegistrantProfilesResponse.setTotalPageNum(_ctx.integerValue("QueryRegistrantProfilesResponse.TotalPageNum"));
		queryRegistrantProfilesResponse.setPageSize(_ctx.integerValue("QueryRegistrantProfilesResponse.PageSize"));

		List<RegistrantProfile> registrantProfiles = new ArrayList<RegistrantProfile>();
		for (int i = 0; i < _ctx.lengthValue("QueryRegistrantProfilesResponse.RegistrantProfiles.Length"); i++) {
			RegistrantProfile registrantProfile = new RegistrantProfile();
			registrantProfile.setTelExt(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].TelExt"));
			registrantProfile.setUpdateTime(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].UpdateTime"));
			registrantProfile.setZhProvince(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhProvince"));
			registrantProfile.setCreateTime(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].CreateTime"));
			registrantProfile.setTelephone(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Telephone"));
			registrantProfile.setRegistrantOrganization(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantOrganization"));
			registrantProfile.setCity(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].City"));
			registrantProfile.setZhCity(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhCity"));
			registrantProfile.setTelArea(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].TelArea"));
			registrantProfile.setAddress(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Address"));
			registrantProfile.setRealNameStatus(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RealNameStatus"));
			registrantProfile.setPostalCode(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].PostalCode"));
			registrantProfile.setRegistrantProfileType(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantProfileType"));
			registrantProfile.setRegistrantProfileId(_ctx.longValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantProfileId"));
			registrantProfile.setZhRegistrantOrganization(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhRegistrantOrganization"));
			registrantProfile.setDefaultRegistrantProfile(_ctx.booleanValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].DefaultRegistrantProfile"));
			registrantProfile.setEmail(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Email"));
			registrantProfile.setZhRegistrantName(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhRegistrantName"));
			registrantProfile.setRegistrantType(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantType"));
			registrantProfile.setCountry(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Country"));
			registrantProfile.setRegistrantName(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantName"));
			registrantProfile.setEmailVerificationStatus(_ctx.integerValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].EmailVerificationStatus"));
			registrantProfile.setZhAddress(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhAddress"));
			registrantProfile.setProvince(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Province"));
			registrantProfile.setCredentialNo(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].CredentialNo"));
			registrantProfile.setCredentialType(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].CredentialType"));

			registrantProfiles.add(registrantProfile);
		}
		queryRegistrantProfilesResponse.setRegistrantProfiles(registrantProfiles);
	 
	 	return queryRegistrantProfilesResponse;
	}
}