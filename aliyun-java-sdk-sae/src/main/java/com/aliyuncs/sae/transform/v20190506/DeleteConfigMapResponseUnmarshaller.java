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

import com.aliyuncs.sae.model.v20190506.DeleteConfigMapResponse;
import com.aliyuncs.sae.model.v20190506.DeleteConfigMapResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteConfigMapResponseUnmarshaller {

	public static DeleteConfigMapResponse unmarshall(DeleteConfigMapResponse deleteConfigMapResponse, UnmarshallerContext _ctx) {
		
		deleteConfigMapResponse.setRequestId(_ctx.stringValue("DeleteConfigMapResponse.RequestId"));
		deleteConfigMapResponse.setMessage(_ctx.stringValue("DeleteConfigMapResponse.Message"));
		deleteConfigMapResponse.setCode(_ctx.stringValue("DeleteConfigMapResponse.Code"));
		deleteConfigMapResponse.setErrorCode(_ctx.stringValue("DeleteConfigMapResponse.ErrorCode"));
		deleteConfigMapResponse.setTraceId(_ctx.stringValue("DeleteConfigMapResponse.TraceId"));
		deleteConfigMapResponse.setSuccess(_ctx.booleanValue("DeleteConfigMapResponse.Success"));

		Data data = new Data();
		data.setConfigMapId(_ctx.longValue("DeleteConfigMapResponse.Data.ConfigMapId"));
		deleteConfigMapResponse.setData(data);
	 
	 	return deleteConfigMapResponse;
	}
}