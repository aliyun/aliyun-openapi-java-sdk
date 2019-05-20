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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListFunctionMetasResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListFunctionMetasResponse.FunctionMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionMetasResponseUnmarshaller {

	public static ListFunctionMetasResponse unmarshall(ListFunctionMetasResponse listFunctionMetasResponse, UnmarshallerContext context) {
		
		listFunctionMetasResponse.setRequestId(context.stringValue("ListFunctionMetasResponse.RequestId"));
		listFunctionMetasResponse.setSuccess(context.booleanValue("ListFunctionMetasResponse.Success"));
		listFunctionMetasResponse.setCode(context.stringValue("ListFunctionMetasResponse.Code"));
		listFunctionMetasResponse.setMessage(context.stringValue("ListFunctionMetasResponse.Message"));
		listFunctionMetasResponse.setHttpStatusCode(context.integerValue("ListFunctionMetasResponse.HttpStatusCode"));

		List<FunctionMeta> functionMetas = new ArrayList<FunctionMeta>();
		for (int i = 0; i < context.lengthValue("ListFunctionMetasResponse.FunctionMetas.Length"); i++) {
			FunctionMeta functionMeta = new FunctionMeta();
			functionMeta.setFunctionId(context.stringValue("ListFunctionMetasResponse.FunctionMetas["+ i +"].FunctionId"));
			functionMeta.setInstance(context.stringValue("ListFunctionMetasResponse.FunctionMetas["+ i +"].Instance"));
			functionMeta.setAlipkUserId(context.stringValue("ListFunctionMetasResponse.FunctionMetas["+ i +"].AlipkUserId"));
			functionMeta.setRegion(context.stringValue("ListFunctionMetasResponse.FunctionMetas["+ i +"].Region"));
			functionMeta.setService(context.stringValue("ListFunctionMetasResponse.FunctionMetas["+ i +"].Service"));
			functionMeta.setFunctionName(context.stringValue("ListFunctionMetasResponse.FunctionMetas["+ i +"].FunctionName"));
			functionMeta.setRole(context.stringValue("ListFunctionMetasResponse.FunctionMetas["+ i +"].Role"));
			functionMeta.setDescription(context.stringValue("ListFunctionMetasResponse.FunctionMetas["+ i +"].Description"));

			functionMetas.add(functionMeta);
		}
		listFunctionMetasResponse.setFunctionMetas(functionMetas);
	 
	 	return listFunctionMetasResponse;
	}
}