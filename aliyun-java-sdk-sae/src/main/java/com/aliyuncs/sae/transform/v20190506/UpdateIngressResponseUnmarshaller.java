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

import com.aliyuncs.sae.model.v20190506.UpdateIngressResponse;
import com.aliyuncs.sae.model.v20190506.UpdateIngressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateIngressResponseUnmarshaller {

	public static UpdateIngressResponse unmarshall(UpdateIngressResponse updateIngressResponse, UnmarshallerContext _ctx) {
		
		updateIngressResponse.setRequestId(_ctx.stringValue("UpdateIngressResponse.RequestId"));
		updateIngressResponse.setCode(_ctx.stringValue("UpdateIngressResponse.Code"));
		updateIngressResponse.setMessage(_ctx.stringValue("UpdateIngressResponse.Message"));
		updateIngressResponse.setSuccess(_ctx.booleanValue("UpdateIngressResponse.Success"));
		updateIngressResponse.setErrorCode(_ctx.stringValue("UpdateIngressResponse.ErrorCode"));
		updateIngressResponse.setTraceId(_ctx.stringValue("UpdateIngressResponse.TraceId"));

		Data data = new Data();
		data.setIngressId(_ctx.longValue("UpdateIngressResponse.Data.IngressId"));
		updateIngressResponse.setData(data);
	 
	 	return updateIngressResponse;
	}
}