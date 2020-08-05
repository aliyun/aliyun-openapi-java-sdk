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

import com.aliyuncs.sae.model.v20190506.DeleteIngressResponse;
import com.aliyuncs.sae.model.v20190506.DeleteIngressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteIngressResponseUnmarshaller {

	public static DeleteIngressResponse unmarshall(DeleteIngressResponse deleteIngressResponse, UnmarshallerContext _ctx) {
		
		deleteIngressResponse.setRequestId(_ctx.stringValue("DeleteIngressResponse.RequestId"));
		deleteIngressResponse.setCode(_ctx.stringValue("DeleteIngressResponse.Code"));
		deleteIngressResponse.setMessage(_ctx.stringValue("DeleteIngressResponse.Message"));
		deleteIngressResponse.setSuccess(_ctx.booleanValue("DeleteIngressResponse.Success"));
		deleteIngressResponse.setErrorCode(_ctx.stringValue("DeleteIngressResponse.ErrorCode"));
		deleteIngressResponse.setTraceId(_ctx.stringValue("DeleteIngressResponse.TraceId"));

		Data data = new Data();
		data.setIngressId(_ctx.longValue("DeleteIngressResponse.Data.IngressId"));
		deleteIngressResponse.setData(data);
	 
	 	return deleteIngressResponse;
	}
}