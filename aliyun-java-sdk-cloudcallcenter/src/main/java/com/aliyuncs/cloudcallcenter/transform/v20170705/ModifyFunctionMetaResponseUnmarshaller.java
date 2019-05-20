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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyFunctionMetaResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyFunctionMetaResponse.FunctionMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyFunctionMetaResponseUnmarshaller {

	public static ModifyFunctionMetaResponse unmarshall(ModifyFunctionMetaResponse modifyFunctionMetaResponse, UnmarshallerContext context) {
		
		modifyFunctionMetaResponse.setRequestId(context.stringValue("ModifyFunctionMetaResponse.RequestId"));
		modifyFunctionMetaResponse.setSuccess(context.booleanValue("ModifyFunctionMetaResponse.Success"));
		modifyFunctionMetaResponse.setCode(context.stringValue("ModifyFunctionMetaResponse.Code"));
		modifyFunctionMetaResponse.setMessage(context.stringValue("ModifyFunctionMetaResponse.Message"));
		modifyFunctionMetaResponse.setHttpStatusCode(context.integerValue("ModifyFunctionMetaResponse.HttpStatusCode"));

		FunctionMeta functionMeta = new FunctionMeta();
		functionMeta.setFunctionId(context.stringValue("ModifyFunctionMetaResponse.FunctionMeta.FunctionId"));
		functionMeta.setInstance(context.stringValue("ModifyFunctionMetaResponse.FunctionMeta.Instance"));
		functionMeta.setAlipkUserId(context.stringValue("ModifyFunctionMetaResponse.FunctionMeta.AlipkUserId"));
		functionMeta.setRegion(context.stringValue("ModifyFunctionMetaResponse.FunctionMeta.Region"));
		functionMeta.setService(context.stringValue("ModifyFunctionMetaResponse.FunctionMeta.Service"));
		functionMeta.setFunctionName(context.stringValue("ModifyFunctionMetaResponse.FunctionMeta.FunctionName"));
		functionMeta.setRole(context.stringValue("ModifyFunctionMetaResponse.FunctionMeta.Role"));
		functionMeta.setDescription(context.stringValue("ModifyFunctionMetaResponse.FunctionMeta.Description"));
		modifyFunctionMetaResponse.setFunctionMeta(functionMeta);
	 
	 	return modifyFunctionMetaResponse;
	}
}