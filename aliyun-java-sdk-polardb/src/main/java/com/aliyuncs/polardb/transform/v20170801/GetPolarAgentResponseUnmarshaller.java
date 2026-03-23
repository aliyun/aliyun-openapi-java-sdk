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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.GetPolarAgentResponse;
import com.aliyuncs.polardb.model.v20170801.GetPolarAgentResponse.FunctionCallItem;
import com.aliyuncs.polardb.model.v20170801.GetPolarAgentResponse.UiFunctionCallItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolarAgentResponseUnmarshaller {

	public static GetPolarAgentResponse unmarshall(GetPolarAgentResponse getPolarAgentResponse, UnmarshallerContext _ctx) {
		
		getPolarAgentResponse.setRequestId(_ctx.stringValue("GetPolarAgentResponse.RequestId"));
		getPolarAgentResponse.setContent(_ctx.stringValue("GetPolarAgentResponse.Content"));
		getPolarAgentResponse.setReasoningContent(_ctx.stringValue("GetPolarAgentResponse.ReasoningContent"));
		getPolarAgentResponse.setProduct(_ctx.stringValue("GetPolarAgentResponse.Product"));
		getPolarAgentResponse.setSessionId(_ctx.stringValue("GetPolarAgentResponse.SessionId"));
		getPolarAgentResponse.setQueryId(_ctx.stringValue("GetPolarAgentResponse.QueryId"));

		List<FunctionCallItem> functionCall = new ArrayList<FunctionCallItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPolarAgentResponse.FunctionCall.Length"); i++) {
			FunctionCallItem functionCallItem = new FunctionCallItem();
			functionCallItem.setName(_ctx.stringValue("GetPolarAgentResponse.FunctionCall["+ i +"].Name"));
			functionCallItem.setArguments(_ctx.stringValue("GetPolarAgentResponse.FunctionCall["+ i +"].Arguments"));
			functionCallItem.setId(_ctx.stringValue("GetPolarAgentResponse.FunctionCall["+ i +"].Id"));
			functionCallItem.setStatus(_ctx.stringValue("GetPolarAgentResponse.FunctionCall["+ i +"].Status"));

			functionCall.add(functionCallItem);
		}
		getPolarAgentResponse.setFunctionCall(functionCall);

		List<UiFunctionCallItem> uiFunctionCall = new ArrayList<UiFunctionCallItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPolarAgentResponse.UiFunctionCall.Length"); i++) {
			UiFunctionCallItem uiFunctionCallItem = new UiFunctionCallItem();
			uiFunctionCallItem.setArgsText(_ctx.stringValue("GetPolarAgentResponse.UiFunctionCall["+ i +"].ArgsText"));
			uiFunctionCallItem.setToolName(_ctx.stringValue("GetPolarAgentResponse.UiFunctionCall["+ i +"].ToolName"));

			uiFunctionCall.add(uiFunctionCallItem);
		}
		getPolarAgentResponse.setUiFunctionCall(uiFunctionCall);
	 
	 	return getPolarAgentResponse;
	}
}