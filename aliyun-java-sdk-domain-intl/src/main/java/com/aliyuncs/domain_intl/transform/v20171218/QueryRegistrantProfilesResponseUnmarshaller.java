/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.QueryRegistrantProfilesResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryRegistrantProfilesResponse.RegistrantProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRegistrantProfilesResponseUnmarshaller {

	public static QueryRegistrantProfilesResponse unmarshall(QueryRegistrantProfilesResponse queryRegistrantProfilesResponse, UnmarshallerContext context) {
		
		queryRegistrantProfilesResponse.setRequestId(context.stringValue("QueryRegistrantProfilesResponse.RequestId"));
		queryRegistrantProfilesResponse.setTotalItemNum(context.integerValue("QueryRegistrantProfilesResponse.TotalItemNum"));
		queryRegistrantProfilesResponse.setCurrentPageNum(context.integerValue("QueryRegistrantProfilesResponse.CurrentPageNum"));
		queryRegistrantProfilesResponse.setTotalPageNum(context.integerValue("QueryRegistrantProfilesResponse.TotalPageNum"));
		queryRegistrantProfilesResponse.setPageSize(context.integerValue("QueryRegistrantProfilesResponse.PageSize"));
		queryRegistrantProfilesResponse.setPrePage(context.booleanValue("QueryRegistrantProfilesResponse.PrePage"));
		queryRegistrantProfilesResponse.setNextPage(context.booleanValue("QueryRegistrantProfilesResponse.NextPage"));

		List<RegistrantProfile> registrantProfiles = new ArrayList<RegistrantProfile>();
		for (int i = 0; i < context.lengthValue("QueryRegistrantProfilesResponse.RegistrantProfiles.Length"); i++) {
			RegistrantProfile registrantProfile = new RegistrantProfile();
			registrantProfile.setRegistrantProfileId(context.longValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantProfileId"));
			registrantProfile.setCreateTime(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].CreateTime"));
			registrantProfile.setUpdateTime(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].UpdateTime"));
			registrantProfile.setDefaultRegistrantProfile(context.booleanValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].DefaultRegistrantProfile"));
			registrantProfile.setRegistrantName(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantName"));
			registrantProfile.setRegistrantOrganization(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].RegistrantOrganization"));
			registrantProfile.setCountry(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Country"));
			registrantProfile.setProvince(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Province"));
			registrantProfile.setCity(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].City"));
			registrantProfile.setAddress(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Address"));
			registrantProfile.setEmail(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Email"));
			registrantProfile.setPostalCode(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].PostalCode"));
			registrantProfile.setTelArea(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].TelArea"));
			registrantProfile.setTelephone(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].Telephone"));
			registrantProfile.setTelExt(context.stringValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].TelExt"));
			registrantProfile.setEmailVerificationStatus(context.integerValue("QueryRegistrantProfilesResponse.RegistrantProfiles["+ i +"].EmailVerificationStatus"));

			registrantProfiles.add(registrantProfile);
		}
		queryRegistrantProfilesResponse.setRegistrantProfiles(registrantProfiles);
	 
	 	return queryRegistrantProfilesResponse;
	}
}