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

import com.aliyuncs.cloudauth.model.v20180916.SubmitMaterialsResponse;
import com.aliyuncs.cloudauth.model.v20180916.SubmitMaterialsResponse.Data;
import com.aliyuncs.cloudauth.model.v20180916.SubmitMaterialsResponse.Data.VerifyStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitMaterialsResponseUnmarshaller {

	public static SubmitMaterialsResponse unmarshall(SubmitMaterialsResponse submitMaterialsResponse, UnmarshallerContext _ctx) {
		
		submitMaterialsResponse.setRequestId(_ctx.stringValue("SubmitMaterialsResponse.RequestId"));
		submitMaterialsResponse.setSuccess(_ctx.booleanValue("SubmitMaterialsResponse.Success"));
		submitMaterialsResponse.setCode(_ctx.stringValue("SubmitMaterialsResponse.Code"));
		submitMaterialsResponse.setMessage(_ctx.stringValue("SubmitMaterialsResponse.Message"));

		Data data = new Data();

		VerifyStatus verifyStatus = new VerifyStatus();
		verifyStatus.setStatusCode(_ctx.integerValue("SubmitMaterialsResponse.Data.VerifyStatus.StatusCode"));
		verifyStatus.setTrustedScore(_ctx.floatValue("SubmitMaterialsResponse.Data.VerifyStatus.TrustedScore"));
		verifyStatus.setSimilarityScore(_ctx.floatValue("SubmitMaterialsResponse.Data.VerifyStatus.SimilarityScore"));
		verifyStatus.setAuditConclusions(_ctx.stringValue("SubmitMaterialsResponse.Data.VerifyStatus.AuditConclusions"));
		verifyStatus.setAuthorityComparisonScore(_ctx.floatValue("SubmitMaterialsResponse.Data.VerifyStatus.AuthorityComparisonScore"));
		data.setVerifyStatus(verifyStatus);
		submitMaterialsResponse.setData(data);
	 
	 	return submitMaterialsResponse;
	}
}