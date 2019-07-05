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
		queryRegistrantProfilesResponse.setTotalItemNum(_ctx.integerValue("QueryRegistrantProfilesResponse.TotalItemNum"));
		queryRegistrantProfilesResponse.setCurrentPageNum(_ctx.integerValue("QueryRegistrantProfilesResponse.CurrentPageNum"));
		queryRegistrantProfilesResponse.setTotalPageNum(_ctx.integerValue("QueryRegistrantProfilesResponse.TotalPageNum"));
		queryRegistrantProfilesResponse.setPageSize(_ctx.integerValue("QueryRegistrantProfilesResponse.PageSize"));
		queryRegistrantProfilesResponse.setPrePage(_ctx.booleanValue("QueryRegistrantProfilesResponse.PrePage"));
		queryRegistrantProfilesResponse.setNextPage(_ctx.booleanValue("QueryRegistrantProfilesResponse.NextPage"));

		List<RegistrantProfile> registrantProfiles = new ArrayList<RegistrantProfile>();
		for (int i = 0; i < _ctx.lengthValue("QueryRegistrantProfilesResponse.RegistrantProfiles.Length"); i++) {
			RegistrantProfile registrantProfile = new RegistrantProfile();
			registrantProfile.setRegistrantProfileId(_ctx.longValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantProfileId"));
			registrantProfile.setCreateTime(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].CreateTime"));
			registrantProfile.setUpdateTime(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].UpdateTime"));
			registrantProfile.setDefaultRegistrantProfile(_ctx.booleanValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].DefaultRegistrantProfile"));
			registrantProfile.setRegistrantName(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantName"));
			registrantProfile.setRegistrantOrganization(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantOrganization"));
			registrantProfile.setCountry(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Country"));
			registrantProfile.setProvince(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Province"));
			registrantProfile.setCity(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].City"));
			registrantProfile.setAddress(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Address"));
			registrantProfile.setEmail(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Email"));
			registrantProfile.setPostalCode(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].PostalCode"));
			registrantProfile.setTelArea(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].TelArea"));
			registrantProfile.setTelephone(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Telephone"));
			registrantProfile.setTelExt(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].TelExt"));
			registrantProfile.setEmailVerificationStatus(_ctx.integerValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].EmailVerificationStatus"));
			registrantProfile.setZhRegistrantName(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhRegistrantName"));
			registrantProfile.setZhRegistrantOrganization(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhRegistrantOrganization"));
			registrantProfile.setZhProvince(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhProvince"));
			registrantProfile.setZhCity(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhCity"));
			registrantProfile.setZhAddress(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].ZhAddress"));
			registrantProfile.setRegistrantType(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantType"));
			registrantProfile.setRealNameStatus(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RealNameStatus"));
			registrantProfile.setRegistrantProfileType(_ctx.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantProfileType"));

			registrantProfiles.add(registrantProfile);
		}
		queryRegistrantProfilesResponse.setRegistrantProfiles(registrantProfiles);
	 
	 	return queryRegistrantProfilesResponse;
	}
}