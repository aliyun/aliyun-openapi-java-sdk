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

import com.aliyuncs.domain.model.v20180129.QueryDomainRealNameVerificationInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainRealNameVerificationInfoResponseUnmarshaller {

	public static QueryDomainRealNameVerificationInfoResponse unmarshall(QueryDomainRealNameVerificationInfoResponse queryDomainRealNameVerificationInfoResponse, UnmarshallerContext _ctx) {
		
		queryDomainRealNameVerificationInfoResponse.setRequestId(_ctx.stringValue("QueryDomainRealNameVerificationInfoResponse.RequestId"));
		queryDomainRealNameVerificationInfoResponse.setIdentityCredentialType(_ctx.stringValue("QueryDomainRealNameVerificationInfoResponse.IdentityCredentialType"));
		queryDomainRealNameVerificationInfoResponse.setInstanceId(_ctx.stringValue("QueryDomainRealNameVerificationInfoResponse.InstanceId"));
		queryDomainRealNameVerificationInfoResponse.setDomainName(_ctx.stringValue("QueryDomainRealNameVerificationInfoResponse.DomainName"));
		queryDomainRealNameVerificationInfoResponse.setIdentityCredential(_ctx.stringValue("QueryDomainRealNameVerificationInfoResponse.IdentityCredential"));
		queryDomainRealNameVerificationInfoResponse.setSubmissionDate(_ctx.stringValue("QueryDomainRealNameVerificationInfoResponse.SubmissionDate"));
		queryDomainRealNameVerificationInfoResponse.setIdentityCredentialNo(_ctx.stringValue("QueryDomainRealNameVerificationInfoResponse.IdentityCredentialNo"));
		queryDomainRealNameVerificationInfoResponse.setIdentityCredentialUrl(_ctx.stringValue("QueryDomainRealNameVerificationInfoResponse.IdentityCredentialUrl"));
	 
	 	return queryDomainRealNameVerificationInfoResponse;
	}
}