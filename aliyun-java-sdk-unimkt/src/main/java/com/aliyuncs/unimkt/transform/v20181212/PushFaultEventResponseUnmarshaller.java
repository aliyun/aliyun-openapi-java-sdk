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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.PushFaultEventResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushFaultEventResponseUnmarshaller {

	public static PushFaultEventResponse unmarshall(PushFaultEventResponse pushFaultEventResponse, UnmarshallerContext _ctx) {
		
		pushFaultEventResponse.setRequestId(_ctx.stringValue("PushFaultEventResponse.RequestId"));
		pushFaultEventResponse.setMsg(_ctx.stringValue("PushFaultEventResponse.Msg"));
		pushFaultEventResponse.setStatus(_ctx.booleanValue("PushFaultEventResponse.Status"));
		pushFaultEventResponse.setData(_ctx.stringValue("PushFaultEventResponse.Data"));
		pushFaultEventResponse.setErrorCode(_ctx.stringValue("PushFaultEventResponse.ErrorCode"));
	 
	 	return pushFaultEventResponse;
	}
}