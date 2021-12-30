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

	public static GetRecordOssUploadParamResponse unmarshall(GetRecordOssUploadParamResponse getRecordOssUploadParamResponse, UnmarshallerContext _ctx) {
		
		getRecordOssUploadParamResponse.setRequestId(_ctx.stringValue("GetRecordOssUploadParamResponse.RequestId"));
		getRecordOssUploadParamResponse.setSuccess(_ctx.booleanValue("GetRecordOssUploadParamResponse.Success"));
		getRecordOssUploadParamResponse.setCode(_ctx.stringValue("GetRecordOssUploadParamResponse.Code"));
		getRecordOssUploadParamResponse.setMessage(_ctx.stringValue("GetRecordOssUploadParamResponse.Message"));
		getRecordOssUploadParamResponse.setHttpStatusCode(_ctx.integerValue("GetRecordOssUploadParamResponse.HttpStatusCode"));
		getRecordOssUploadParamResponse.setOssAccessKeyId(_ctx.stringValue("GetRecordOssUploadParamResponse.OssAccessKeyId"));
		getRecordOssUploadParamResponse.setPolicy(_ctx.stringValue("GetRecordOssUploadParamResponse.Policy"));
		getRecordOssUploadParamResponse.setSignature(_ctx.stringValue("GetRecordOssUploadParamResponse.Signature"));
		getRecordOssUploadParamResponse.setExpires(_ctx.stringValue("GetRecordOssUploadParamResponse.Expires"));
		getRecordOssUploadParamResponse.setDir(_ctx.stringValue("GetRecordOssUploadParamResponse.Dir"));
		getRecordOssUploadParamResponse.setHost(_ctx.stringValue("GetRecordOssUploadParamResponse.Host"));
		getRecordOssUploadParamResponse.setOssFileName(_ctx.stringValue("GetRecordOssUploadParamResponse.OssFileName"));
	 
	 	return getRecordOssUploadParamResponse;
	}
}