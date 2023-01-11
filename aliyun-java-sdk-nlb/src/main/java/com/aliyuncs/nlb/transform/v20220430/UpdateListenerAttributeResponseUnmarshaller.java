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

import com.aliyuncs.nlb.model.v20220430.UpdateListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateListenerAttributeResponseUnmarshaller {

	public static UpdateListenerAttributeResponse unmarshall(UpdateListenerAttributeResponse updateListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		updateListenerAttributeResponse.setRequestId(_ctx.stringValue("UpdateListenerAttributeResponse.RequestId"));
		updateListenerAttributeResponse.setSuccess(_ctx.booleanValue("UpdateListenerAttributeResponse.Success"));
		updateListenerAttributeResponse.setCode(_ctx.stringValue("UpdateListenerAttributeResponse.Code"));
		updateListenerAttributeResponse.setMessage(_ctx.stringValue("UpdateListenerAttributeResponse.Message"));
		updateListenerAttributeResponse.setHttpStatusCode(_ctx.integerValue("UpdateListenerAttributeResponse.HttpStatusCode"));
		updateListenerAttributeResponse.setDynamicCode(_ctx.stringValue("UpdateListenerAttributeResponse.DynamicCode"));
		updateListenerAttributeResponse.setDynamicMessage(_ctx.stringValue("UpdateListenerAttributeResponse.DynamicMessage"));
		updateListenerAttributeResponse.setJobId(_ctx.stringValue("UpdateListenerAttributeResponse.JobId"));
	 
	 	return updateListenerAttributeResponse;
	}
}