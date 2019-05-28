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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.GetRecordOssUploadParamResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRecordOssUploadParamResponseUnmarshaller {

	public static GetRecordOssUploadParamResponse unmarshall(GetRecordOssUploadParamResponse getRecordOssUploadParamResponse, UnmarshallerContext context) {
		
		getRecordOssUploadParamResponse.setRequestId(context.stringValue("GetRecordOssUploadParamResponse.RequestId"));
		getRecordOssUploadParamResponse.setSuccess(context.booleanValue("GetRecordOssUploadParamResponse.Success"));
		getRecordOssUploadParamResponse.setCode(context.stringValue("GetRecordOssUploadParamResponse.Code"));
		getRecordOssUploadParamResponse.setMessage(context.stringValue("GetRecordOssUploadParamResponse.Message"));
		getRecordOssUploadParamResponse.setHttpStatusCode(context.integerValue("GetRecordOssUploadParamResponse.HttpStatusCode"));
		getRecordOssUploadParamResponse.setOssAccessKeyId(context.stringValue("GetRecordOssUploadParamResponse.OssAccessKeyId"));
		getRecordOssUploadParamResponse.setPolicy(context.stringValue("GetRecordOssUploadParamResponse.Policy"));
		getRecordOssUploadParamResponse.setSignature(context.stringValue("GetRecordOssUploadParamResponse.Signature"));
		getRecordOssUploadParamResponse.setExpires(context.stringValue("GetRecordOssUploadParamResponse.Expires"));
		getRecordOssUploadParamResponse.setDir(context.stringValue("GetRecordOssUploadParamResponse.Dir"));
		getRecordOssUploadParamResponse.setHost(context.stringValue("GetRecordOssUploadParamResponse.Host"));
		getRecordOssUploadParamResponse.setOssFileName(context.stringValue("GetRecordOssUploadParamResponse.OssFileName"));
	 
	 	return getRecordOssUploadParamResponse;
	}
}