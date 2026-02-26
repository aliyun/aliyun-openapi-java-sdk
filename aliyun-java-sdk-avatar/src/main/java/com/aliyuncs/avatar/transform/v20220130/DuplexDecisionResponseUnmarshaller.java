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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.DuplexDecisionResponse;
import com.aliyuncs.avatar.model.v20220130.DuplexDecisionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DuplexDecisionResponseUnmarshaller {

	public static DuplexDecisionResponse unmarshall(DuplexDecisionResponse duplexDecisionResponse, UnmarshallerContext _ctx) {
		
		duplexDecisionResponse.setRequestId(_ctx.stringValue("DuplexDecisionResponse.RequestId"));
		duplexDecisionResponse.setCode(_ctx.stringValue("DuplexDecisionResponse.Code"));
		duplexDecisionResponse.setMessage(_ctx.stringValue("DuplexDecisionResponse.Message"));
		duplexDecisionResponse.setSuccess(_ctx.stringValue("DuplexDecisionResponse.Success"));

		Data data = new Data();
		data.setActionType(_ctx.stringValue("DuplexDecisionResponse.Data.ActionType"));
		data.setOutputText(_ctx.stringValue("DuplexDecisionResponse.Data.OutputText"));
		data.setGrabType(_ctx.stringValue("DuplexDecisionResponse.Data.GrabType"));
		duplexDecisionResponse.setData(data);
	 
	 	return duplexDecisionResponse;
	}
}