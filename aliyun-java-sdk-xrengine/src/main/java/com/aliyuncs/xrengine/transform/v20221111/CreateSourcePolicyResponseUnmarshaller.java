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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.CreateSourcePolicyResponse;
import com.aliyuncs.xrengine.model.v20221111.CreateSourcePolicyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSourcePolicyResponseUnmarshaller {

	public static CreateSourcePolicyResponse unmarshall(CreateSourcePolicyResponse createSourcePolicyResponse, UnmarshallerContext _ctx) {
		
		createSourcePolicyResponse.setRequestId(_ctx.stringValue("CreateSourcePolicyResponse.RequestId"));
		createSourcePolicyResponse.setSuccess(_ctx.booleanValue("CreateSourcePolicyResponse.Success"));
		createSourcePolicyResponse.setCode(_ctx.stringValue("CreateSourcePolicyResponse.Code"));
		createSourcePolicyResponse.setMessage(_ctx.stringValue("CreateSourcePolicyResponse.Message"));
		createSourcePolicyResponse.setErrorName(_ctx.stringValue("CreateSourcePolicyResponse.ErrorName"));
		createSourcePolicyResponse.setHttpCode(_ctx.integerValue("CreateSourcePolicyResponse.HttpCode"));

		Data data = new Data();
		data.setAccessId(_ctx.stringValue("CreateSourcePolicyResponse.Data.AccessId"));
		data.setPolicy(_ctx.stringValue("CreateSourcePolicyResponse.Data.Policy"));
		data.setSignature(_ctx.stringValue("CreateSourcePolicyResponse.Data.Signature"));
		data.setDir(_ctx.stringValue("CreateSourcePolicyResponse.Data.Dir"));
		data.setHost(_ctx.stringValue("CreateSourcePolicyResponse.Data.Host"));
		data.setExpire(_ctx.stringValue("CreateSourcePolicyResponse.Data.Expire"));
		createSourcePolicyResponse.setData(data);
	 
	 	return createSourcePolicyResponse;
	}
}