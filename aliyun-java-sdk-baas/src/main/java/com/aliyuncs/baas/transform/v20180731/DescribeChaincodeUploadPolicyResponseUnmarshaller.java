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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.DescribeChaincodeUploadPolicyResponse;
import com.aliyuncs.baas.model.v20180731.DescribeChaincodeUploadPolicyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChaincodeUploadPolicyResponseUnmarshaller {

	public static DescribeChaincodeUploadPolicyResponse unmarshall(DescribeChaincodeUploadPolicyResponse describeChaincodeUploadPolicyResponse, UnmarshallerContext context) {
		
		describeChaincodeUploadPolicyResponse.setRequestId(context.stringValue("DescribeChaincodeUploadPolicyResponse.RequestId"));
		describeChaincodeUploadPolicyResponse.setSuccess(context.booleanValue("DescribeChaincodeUploadPolicyResponse.Success"));
		describeChaincodeUploadPolicyResponse.setErrorCode(context.integerValue("DescribeChaincodeUploadPolicyResponse.ErrorCode"));

		Result result = new Result();
		result.setAccessId(context.stringValue("DescribeChaincodeUploadPolicyResponse.Result.AccessId"));
		result.setPolicy(context.stringValue("DescribeChaincodeUploadPolicyResponse.Result.Policy"));
		result.setSignature(context.stringValue("DescribeChaincodeUploadPolicyResponse.Result.Signature"));
		result.setDir(context.stringValue("DescribeChaincodeUploadPolicyResponse.Result.Dir"));
		result.setHost(context.stringValue("DescribeChaincodeUploadPolicyResponse.Result.Host"));
		result.setExpire(context.integerValue("DescribeChaincodeUploadPolicyResponse.Result.Expire"));
		describeChaincodeUploadPolicyResponse.setResult(result);
	 
	 	return describeChaincodeUploadPolicyResponse;
	}
}