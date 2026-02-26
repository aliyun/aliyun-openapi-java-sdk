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

import com.aliyuncs.nlb.model.v20220430.StartListenerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartListenerResponseUnmarshaller {

	public static StartListenerResponse unmarshall(StartListenerResponse startListenerResponse, UnmarshallerContext _ctx) {
		
		startListenerResponse.setRequestId(_ctx.stringValue("StartListenerResponse.RequestId"));
		startListenerResponse.setSuccess(_ctx.booleanValue("StartListenerResponse.Success"));
		startListenerResponse.setCode(_ctx.stringValue("StartListenerResponse.Code"));
		startListenerResponse.setMessage(_ctx.stringValue("StartListenerResponse.Message"));
		startListenerResponse.setHttpStatusCode(_ctx.integerValue("StartListenerResponse.HttpStatusCode"));
		startListenerResponse.setDynamicCode(_ctx.stringValue("StartListenerResponse.DynamicCode"));
		startListenerResponse.setDynamicMessage(_ctx.stringValue("StartListenerResponse.DynamicMessage"));
		startListenerResponse.setJobId(_ctx.stringValue("StartListenerResponse.JobId"));
	 
	 	return startListenerResponse;
	}
}