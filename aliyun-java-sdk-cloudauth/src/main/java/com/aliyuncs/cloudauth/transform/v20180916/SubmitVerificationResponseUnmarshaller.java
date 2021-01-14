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

package com.aliyuncs.cloudauth.transform.v20180916;

import com.aliyuncs.cloudauth.model.v20180916.SubmitVerificationResponse;
import com.aliyuncs.cloudauth.model.v20180916.SubmitVerificationResponse.Data;
import com.aliyuncs.cloudauth.model.v20180916.SubmitVerificationResponse.Data.VerifyStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitVerificationResponseUnmarshaller {

	public static SubmitVerificationResponse unmarshall(SubmitVerificationResponse submitVerificationResponse, UnmarshallerContext _ctx) {
		
		submitVerificationResponse.setRequestId(_ctx.stringValue("SubmitVerificationResponse.RequestId"));
		submitVerificationResponse.setSuccess(_ctx.booleanValue("SubmitVerificationResponse.Success"));
		submitVerificationResponse.setCode(_ctx.stringValue("SubmitVerificationResponse.Code"));
		submitVerificationResponse.setMessage(_ctx.stringValue("SubmitVerificationResponse.Message"));

		Data data = new Data();

		VerifyStatus verifyStatus = new VerifyStatus();
		verifyStatus.setStatusCode(_ctx.integerValue("SubmitVerificationResponse.Data.VerifyStatus.StatusCode"));
		verifyStatus.setTrustedScore(_ctx.floatValue("SubmitVerificationResponse.Data.VerifyStatus.TrustedScore"));
		verifyStatus.setSimilarityScore(_ctx.floatValue("SubmitVerificationResponse.Data.VerifyStatus.SimilarityScore"));
		verifyStatus.setAuditConclusions(_ctx.stringValue("SubmitVerificationResponse.Data.VerifyStatus.AuditConclusions"));
		verifyStatus.setAuthorityComparisonScore(_ctx.floatValue("SubmitVerificationResponse.Data.VerifyStatus.AuthorityComparisonScore"));
		data.setVerifyStatus(verifyStatus);
		submitVerificationResponse.setData(data);
	 
	 	return submitVerificationResponse;
	}
}