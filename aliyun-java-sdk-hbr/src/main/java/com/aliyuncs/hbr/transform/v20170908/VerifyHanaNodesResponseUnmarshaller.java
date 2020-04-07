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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.VerifyHanaNodesResponse;
import com.aliyuncs.hbr.model.v20170908.VerifyHanaNodesResponse.VerificationResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyHanaNodesResponseUnmarshaller {

	public static VerifyHanaNodesResponse unmarshall(VerifyHanaNodesResponse verifyHanaNodesResponse, UnmarshallerContext _ctx) {
		
		verifyHanaNodesResponse.setRequestId(_ctx.stringValue("VerifyHanaNodesResponse.RequestId"));
		verifyHanaNodesResponse.setSuccess(_ctx.booleanValue("VerifyHanaNodesResponse.Success"));
		verifyHanaNodesResponse.setCode(_ctx.stringValue("VerifyHanaNodesResponse.Code"));
		verifyHanaNodesResponse.setMessage(_ctx.stringValue("VerifyHanaNodesResponse.Message"));

		List<VerificationResult> verificationResults = new ArrayList<VerificationResult>();
		for (int i = 0; i < _ctx.lengthValue("VerifyHanaNodesResponse.VerificationResults.Length"); i++) {
			VerificationResult verificationResult = new VerificationResult();
			verificationResult.setInstanceId(_ctx.stringValue("VerifyHanaNodesResponse.VerificationResults["+ i +"].InstanceId"));
			verificationResult.setStatus(_ctx.stringValue("VerifyHanaNodesResponse.VerificationResults["+ i +"].Status"));
			verificationResult.setClientId(_ctx.stringValue("VerifyHanaNodesResponse.VerificationResults["+ i +"].ClientId"));

			List<String> sourceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("VerifyHanaNodesResponse.VerificationResults["+ i +"].SourceTypes.Length"); j++) {
				sourceTypes.add(_ctx.stringValue("VerifyHanaNodesResponse.VerificationResults["+ i +"].SourceTypes["+ j +"]"));
			}
			verificationResult.setSourceTypes(sourceTypes);

			verificationResults.add(verificationResult);
		}
		verifyHanaNodesResponse.setVerificationResults(verificationResults);
	 
	 	return verifyHanaNodesResponse;
	}
}