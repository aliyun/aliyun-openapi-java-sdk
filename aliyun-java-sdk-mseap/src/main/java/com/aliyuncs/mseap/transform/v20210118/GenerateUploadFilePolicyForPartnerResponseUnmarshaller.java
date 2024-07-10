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

package com.aliyuncs.mseap.transform.v20210118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mseap.model.v20210118.GenerateUploadFilePolicyForPartnerResponse;
import com.aliyuncs.mseap.model.v20210118.GenerateUploadFilePolicyForPartnerResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateUploadFilePolicyForPartnerResponseUnmarshaller {

	public static GenerateUploadFilePolicyForPartnerResponse unmarshall(GenerateUploadFilePolicyForPartnerResponse generateUploadFilePolicyForPartnerResponse, UnmarshallerContext _ctx) {
		
		generateUploadFilePolicyForPartnerResponse.setRequestId(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.RequestId"));
		generateUploadFilePolicyForPartnerResponse.setHttpStatusCode(_ctx.integerValue("GenerateUploadFilePolicyForPartnerResponse.HttpStatusCode"));
		generateUploadFilePolicyForPartnerResponse.setDynamicCode(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.DynamicCode"));
		generateUploadFilePolicyForPartnerResponse.setDynamicMessage(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.DynamicMessage"));
		generateUploadFilePolicyForPartnerResponse.setErrorMsg(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.ErrorMsg"));
		generateUploadFilePolicyForPartnerResponse.setErrorCode(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.ErrorCode"));
		generateUploadFilePolicyForPartnerResponse.setSuccess(_ctx.booleanValue("GenerateUploadFilePolicyForPartnerResponse.Success"));
		generateUploadFilePolicyForPartnerResponse.setAllowRetry(_ctx.booleanValue("GenerateUploadFilePolicyForPartnerResponse.AllowRetry"));
		generateUploadFilePolicyForPartnerResponse.setAppName(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GenerateUploadFilePolicyForPartnerResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.ErrorArgs["+ i +"]"));
		}
		generateUploadFilePolicyForPartnerResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setAccessId(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.Module.AccessId"));
		module.setEncodedPolicy(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.Module.EncodedPolicy"));
		module.setSignature(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.Module.Signature"));
		module.setFileDir(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.Module.FileDir"));
		module.setHost(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.Module.Host"));
		module.setExpireTime(_ctx.longValue("GenerateUploadFilePolicyForPartnerResponse.Module.ExpireTime"));
		module.setOssUrl(_ctx.stringValue("GenerateUploadFilePolicyForPartnerResponse.Module.OssUrl"));
		generateUploadFilePolicyForPartnerResponse.setModule(module);
	 
	 	return generateUploadFilePolicyForPartnerResponse;
	}
}