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

import com.aliyuncs.retailadvqa_public.model.v20200515.RecieveEventMessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecieveEventMessageResponseUnmarshaller {

	public static RecieveEventMessageResponse unmarshall(RecieveEventMessageResponse recieveEventMessageResponse, UnmarshallerContext _ctx) {
		
		recieveEventMessageResponse.setRequestId(_ctx.stringValue("RecieveEventMessageResponse.RequestId"));
		recieveEventMessageResponse.setErrorDesc(_ctx.stringValue("RecieveEventMessageResponse.ErrorDesc"));
		recieveEventMessageResponse.setTraceId(_ctx.stringValue("RecieveEventMessageResponse.TraceId"));
		recieveEventMessageResponse.setErrorCode(_ctx.stringValue("RecieveEventMessageResponse.ErrorCode"));
		recieveEventMessageResponse.setSuccess(_ctx.booleanValue("RecieveEventMessageResponse.Success"));
		recieveEventMessageResponse.setData(_ctx.stringValue("RecieveEventMessageResponse.Data"));
	 
	 	return recieveEventMessageResponse;
	}
}