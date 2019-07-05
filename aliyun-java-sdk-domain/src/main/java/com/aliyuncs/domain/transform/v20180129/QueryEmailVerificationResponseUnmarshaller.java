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

import com.aliyuncs.domain.model.v20180129.QueryEmailVerificationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEmailVerificationResponseUnmarshaller {

	public static QueryEmailVerificationResponse unmarshall(QueryEmailVerificationResponse queryEmailVerificationResponse, UnmarshallerContext _ctx) {
		
		queryEmailVerificationResponse.setRequestId(_ctx.stringValue("QueryEmailVerificationResponse.RequestId"));
		queryEmailVerificationResponse.setGmtCreate(_ctx.stringValue("QueryEmailVerificationResponse.GmtCreate"));
		queryEmailVerificationResponse.setGmtModified(_ctx.stringValue("QueryEmailVerificationResponse.GmtModified"));
		queryEmailVerificationResponse.setEmail(_ctx.stringValue("QueryEmailVerificationResponse.Email"));
		queryEmailVerificationResponse.setUserId(_ctx.stringValue("QueryEmailVerificationResponse.UserId"));
		queryEmailVerificationResponse.setEmailVerificationNo(_ctx.stringValue("QueryEmailVerificationResponse.EmailVerificationNo"));
		queryEmailVerificationResponse.setTokenSendTime(_ctx.stringValue("QueryEmailVerificationResponse.TokenSendTime"));
		queryEmailVerificationResponse.setVerificationStatus(_ctx.integerValue("QueryEmailVerificationResponse.VerificationStatus"));
		queryEmailVerificationResponse.setVerificationTime(_ctx.stringValue("QueryEmailVerificationResponse.VerificationTime"));
		queryEmailVerificationResponse.setSendIp(_ctx.stringValue("QueryEmailVerificationResponse.SendIp"));
		queryEmailVerificationResponse.setConfirmIp(_ctx.stringValue("QueryEmailVerificationResponse.ConfirmIp"));
	 
	 	return queryEmailVerificationResponse;
	}
}