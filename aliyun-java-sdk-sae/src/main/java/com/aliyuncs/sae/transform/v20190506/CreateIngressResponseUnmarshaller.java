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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.CreateIngressResponse;
import com.aliyuncs.sae.model.v20190506.CreateIngressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIngressResponseUnmarshaller {

	public static CreateIngressResponse unmarshall(CreateIngressResponse createIngressResponse, UnmarshallerContext _ctx) {
		
		createIngressResponse.setRequestId(_ctx.stringValue("CreateIngressResponse.RequestId"));
		createIngressResponse.setCode(_ctx.stringValue("CreateIngressResponse.Code"));
		createIngressResponse.setMessage(_ctx.stringValue("CreateIngressResponse.Message"));
		createIngressResponse.setSuccess(_ctx.booleanValue("CreateIngressResponse.Success"));
		createIngressResponse.setErrorCode(_ctx.stringValue("CreateIngressResponse.ErrorCode"));
		createIngressResponse.setTraceId(_ctx.stringValue("CreateIngressResponse.TraceId"));

		Data data = new Data();
		data.setIngressId(_ctx.longValue("CreateIngressResponse.Data.IngressId"));
		createIngressResponse.setData(data);
	 
	 	return createIngressResponse;
	}
}