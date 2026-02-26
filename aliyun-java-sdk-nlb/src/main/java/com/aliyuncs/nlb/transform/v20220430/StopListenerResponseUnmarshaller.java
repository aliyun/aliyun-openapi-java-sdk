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

package com.aliyuncs.nlb.transform.v20220430;

import com.aliyuncs.nlb.model.v20220430.StopListenerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopListenerResponseUnmarshaller {

	public static StopListenerResponse unmarshall(StopListenerResponse stopListenerResponse, UnmarshallerContext _ctx) {
		
		stopListenerResponse.setRequestId(_ctx.stringValue("StopListenerResponse.RequestId"));
		stopListenerResponse.setSuccess(_ctx.booleanValue("StopListenerResponse.Success"));
		stopListenerResponse.setCode(_ctx.stringValue("StopListenerResponse.Code"));
		stopListenerResponse.setMessage(_ctx.stringValue("StopListenerResponse.Message"));
		stopListenerResponse.setHttpStatusCode(_ctx.integerValue("StopListenerResponse.HttpStatusCode"));
		stopListenerResponse.setDynamicCode(_ctx.stringValue("StopListenerResponse.DynamicCode"));
		stopListenerResponse.setDynamicMessage(_ctx.stringValue("StopListenerResponse.DynamicMessage"));
		stopListenerResponse.setJobId(_ctx.stringValue("StopListenerResponse.JobId"));
	 
	 	return stopListenerResponse;
	}
}