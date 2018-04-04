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

	public static QueryContactInfoResponse unmarshall(QueryContactInfoResponse queryContactInfoResponse, UnmarshallerContext context) {
		
		queryContactInfoResponse.setRequestId(context.stringValue("QueryContactInfoResponse.RequestId"));
		queryContactInfoResponse.setCreateDate(context.stringValue("QueryContactInfoResponse.CreateDate"));
		queryContactInfoResponse.setRegistrantName(context.stringValue("QueryContactInfoResponse.RegistrantName"));
		queryContactInfoResponse.setRegistrantOrganization(context.stringValue("QueryContactInfoResponse.RegistrantOrganization"));
		queryContactInfoResponse.setCountry(context.stringValue("QueryContactInfoResponse.Country"));
		queryContactInfoResponse.setProvince(context.stringValue("QueryContactInfoResponse.Province"));
		queryContactInfoResponse.setCity(context.stringValue("QueryContactInfoResponse.City"));
		queryContactInfoResponse.setAddress(context.stringValue("QueryContactInfoResponse.Address"));
		queryContactInfoResponse.setEmail(context.stringValue("QueryContactInfoResponse.Email"));
		queryContactInfoResponse.setPostalCode(context.stringValue("QueryContactInfoResponse.PostalCode"));
		queryContactInfoResponse.setTelArea(context.stringValue("QueryContactInfoResponse.TelArea"));
		queryContactInfoResponse.setTelephone(context.stringValue("QueryContactInfoResponse.Telephone"));
		queryContactInfoResponse.setTelExt(context.stringValue("QueryContactInfoResponse.TelExt"));
	 
	 	return queryContactInfoResponse;
	}
}