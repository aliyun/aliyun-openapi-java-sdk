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

package com.aliyuncs.domain_intl.transform.v20171218;

import com.aliyuncs.domain_intl.model.v20171218.QueryContactInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryContactInfoResponseUnmarshaller {

	public static QueryContactInfoResponse unmarshall(QueryContactInfoResponse queryContactInfoResponse, UnmarshallerContext _ctx) {
		
		queryContactInfoResponse.setRequestId(_ctx.stringValue("QueryContactInfoResponse.RequestId"));
		queryContactInfoResponse.setEmail(_ctx.stringValue("QueryContactInfoResponse.Email"));
		queryContactInfoResponse.setTelephone(_ctx.stringValue("QueryContactInfoResponse.Telephone"));
		queryContactInfoResponse.setAddress(_ctx.stringValue("QueryContactInfoResponse.Address"));
		queryContactInfoResponse.setPostalCode(_ctx.stringValue("QueryContactInfoResponse.PostalCode"));
		queryContactInfoResponse.setCity(_ctx.stringValue("QueryContactInfoResponse.City"));
		queryContactInfoResponse.setCreateDate(_ctx.stringValue("QueryContactInfoResponse.CreateDate"));
		queryContactInfoResponse.setProvince(_ctx.stringValue("QueryContactInfoResponse.Province"));
		queryContactInfoResponse.setRegistrantName(_ctx.stringValue("QueryContactInfoResponse.RegistrantName"));
		queryContactInfoResponse.setCountry(_ctx.stringValue("QueryContactInfoResponse.Country"));
		queryContactInfoResponse.setRegistrantOrganization(_ctx.stringValue("QueryContactInfoResponse.RegistrantOrganization"));
		queryContactInfoResponse.setTelExt(_ctx.stringValue("QueryContactInfoResponse.TelExt"));
		queryContactInfoResponse.setTelArea(_ctx.stringValue("QueryContactInfoResponse.TelArea"));
	 
	 	return queryContactInfoResponse;
	}
}