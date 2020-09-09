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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.RecreateTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecreateTableResponseUnmarshaller {

	public static RecreateTableResponse unmarshall(RecreateTableResponse recreateTableResponse, UnmarshallerContext _ctx) {
		
		recreateTableResponse.setRequestId(_ctx.stringValue("RecreateTableResponse.RequestId"));
		recreateTableResponse.setErrorCode(_ctx.stringValue("RecreateTableResponse.ErrorCode"));
		recreateTableResponse.setErrorDesc(_ctx.stringValue("RecreateTableResponse.ErrorDesc"));
		recreateTableResponse.setData(_ctx.stringValue("RecreateTableResponse.Data"));
		recreateTableResponse.setSuccess(_ctx.booleanValue("RecreateTableResponse.Success"));
		recreateTableResponse.setTraceId(_ctx.stringValue("RecreateTableResponse.TraceId"));
	 
	 	return recreateTableResponse;
	}
}