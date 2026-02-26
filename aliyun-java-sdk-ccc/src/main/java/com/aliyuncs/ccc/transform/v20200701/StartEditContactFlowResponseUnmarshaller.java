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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.StartEditContactFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartEditContactFlowResponseUnmarshaller {

	public static StartEditContactFlowResponse unmarshall(StartEditContactFlowResponse startEditContactFlowResponse, UnmarshallerContext _ctx) {
		
		startEditContactFlowResponse.setRequestId(_ctx.stringValue("StartEditContactFlowResponse.RequestId"));
		startEditContactFlowResponse.setHttpStatusCode(_ctx.integerValue("StartEditContactFlowResponse.HttpStatusCode"));
		startEditContactFlowResponse.setCode(_ctx.stringValue("StartEditContactFlowResponse.Code"));
		startEditContactFlowResponse.setMessage(_ctx.stringValue("StartEditContactFlowResponse.Message"));
		startEditContactFlowResponse.setData(_ctx.stringValue("StartEditContactFlowResponse.Data"));
	 
	 	return startEditContactFlowResponse;
	}
}