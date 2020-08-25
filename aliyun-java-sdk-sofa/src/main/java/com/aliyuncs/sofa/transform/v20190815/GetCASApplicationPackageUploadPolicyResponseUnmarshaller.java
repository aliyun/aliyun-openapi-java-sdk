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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetCASApplicationPackageUploadPolicyResponse;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationPackageUploadPolicyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCASApplicationPackageUploadPolicyResponseUnmarshaller {

	public static GetCASApplicationPackageUploadPolicyResponse unmarshall(GetCASApplicationPackageUploadPolicyResponse getCASApplicationPackageUploadPolicyResponse, UnmarshallerContext _ctx) {
		
		getCASApplicationPackageUploadPolicyResponse.setRequestId(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.RequestId"));
		getCASApplicationPackageUploadPolicyResponse.setResultCode(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.ResultCode"));
		getCASApplicationPackageUploadPolicyResponse.setResultMessage(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.ResultMessage"));

		Data data = new Data();
		data.setAccessKey(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.Data.AccessKey"));
		data.setBucket(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.Data.Bucket"));
		data.setEndpoint(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.Data.Endpoint"));
		data.setExpire(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.Data.Expire"));
		data.setPathPrefix(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.Data.PathPrefix"));
		data.setPolicy(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.Data.Policy"));
		data.setSignature(_ctx.stringValue("GetCASApplicationPackageUploadPolicyResponse.Data.Signature"));
		getCASApplicationPackageUploadPolicyResponse.setData(data);
	 
	 	return getCASApplicationPackageUploadPolicyResponse;
	}
}