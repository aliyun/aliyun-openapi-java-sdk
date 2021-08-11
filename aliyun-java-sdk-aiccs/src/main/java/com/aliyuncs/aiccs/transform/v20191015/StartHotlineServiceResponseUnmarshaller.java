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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.StartHotlineServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartHotlineServiceResponseUnmarshaller {

	public static StartHotlineServiceResponse unmarshall(StartHotlineServiceResponse startHotlineServiceResponse, UnmarshallerContext _ctx) {
		
		startHotlineServiceResponse.setRequestId(_ctx.stringValue("StartHotlineServiceResponse.RequestId"));
		startHotlineServiceResponse.setMessage(_ctx.stringValue("StartHotlineServiceResponse.Message"));
		startHotlineServiceResponse.setData(_ctx.stringValue("StartHotlineServiceResponse.Data"));
		startHotlineServiceResponse.setCode(_ctx.stringValue("StartHotlineServiceResponse.Code"));
		startHotlineServiceResponse.setSuccess(_ctx.booleanValue("StartHotlineServiceResponse.Success"));
		startHotlineServiceResponse.setHttpStatusCode(_ctx.longValue("StartHotlineServiceResponse.HttpStatusCode"));
	 
	 	return startHotlineServiceResponse;
	}
}