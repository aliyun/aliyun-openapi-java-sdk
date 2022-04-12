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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import com.aliyuncs.idaas_doraemon.model.v20210520.ServiceInvokeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ServiceInvokeResponseUnmarshaller {

	public static ServiceInvokeResponse unmarshall(ServiceInvokeResponse serviceInvokeResponse, UnmarshallerContext _ctx) {
		
		serviceInvokeResponse.setRequestId(_ctx.stringValue("ServiceInvokeResponse.RequestId"));
		serviceInvokeResponse.setData(_ctx.stringValue("ServiceInvokeResponse.Data"));
		serviceInvokeResponse.setMessage(_ctx.stringValue("ServiceInvokeResponse.Message"));
		serviceInvokeResponse.setCode(_ctx.stringValue("ServiceInvokeResponse.Code"));
		serviceInvokeResponse.setSuccess(_ctx.booleanValue("ServiceInvokeResponse.Success"));
		serviceInvokeResponse.setIdToken(_ctx.stringValue("ServiceInvokeResponse.IdToken"));
	 
	 	return serviceInvokeResponse;
	}
}