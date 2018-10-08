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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.GenerateUploadFilePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateUploadFilePolicyResponseUnmarshaller {

	public static GenerateUploadFilePolicyResponse unmarshall(GenerateUploadFilePolicyResponse generateUploadFilePolicyResponse, UnmarshallerContext context) {
		
		generateUploadFilePolicyResponse.setRequestId(context.stringValue("GenerateUploadFilePolicyResponse.RequestId"));
		generateUploadFilePolicyResponse.setEncodedPolicy(context.stringValue("GenerateUploadFilePolicyResponse.EncodedPolicy"));
		generateUploadFilePolicyResponse.setAccessId(context.stringValue("GenerateUploadFilePolicyResponse.AccessId"));
		generateUploadFilePolicyResponse.setSignature(context.stringValue("GenerateUploadFilePolicyResponse.Signature"));
		generateUploadFilePolicyResponse.setFileDir(context.stringValue("GenerateUploadFilePolicyResponse.FileDir"));
		generateUploadFilePolicyResponse.setHost(context.stringValue("GenerateUploadFilePolicyResponse.Host"));
		generateUploadFilePolicyResponse.setExpireTime(context.longValue("GenerateUploadFilePolicyResponse.ExpireTime"));
	 
	 	return generateUploadFilePolicyResponse;
	}
}