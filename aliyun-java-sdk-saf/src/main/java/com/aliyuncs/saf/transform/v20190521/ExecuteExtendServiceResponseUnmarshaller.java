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

package com.aliyuncs.saf.transform.v20190521;

import com.aliyuncs.saf.model.v20190521.ExecuteExtendServiceResponse;
import com.aliyuncs.saf.model.v20190521.ExecuteExtendServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteExtendServiceResponseUnmarshaller {

	public static ExecuteExtendServiceResponse unmarshall(ExecuteExtendServiceResponse executeExtendServiceResponse, UnmarshallerContext _ctx) {
		
		executeExtendServiceResponse.setRequestId(_ctx.stringValue("ExecuteExtendServiceResponse.RequestId"));
		executeExtendServiceResponse.setCode(_ctx.stringValue("ExecuteExtendServiceResponse.Code"));
		executeExtendServiceResponse.setSuccess(_ctx.booleanValue("ExecuteExtendServiceResponse.Success"));
		executeExtendServiceResponse.setMessage(_ctx.stringValue("ExecuteExtendServiceResponse.Message"));
		executeExtendServiceResponse.setHttpStatusCode(_ctx.stringValue("ExecuteExtendServiceResponse.HttpStatusCode"));

		Data data = new Data();
		data.setInvokeResult(_ctx.stringValue("ExecuteExtendServiceResponse.Data.InvokeResult"));
		executeExtendServiceResponse.setData(data);
	 
	 	return executeExtendServiceResponse;
	}
}