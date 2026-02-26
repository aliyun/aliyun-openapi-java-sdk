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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.GetConversationalAutomationResponse;
import com.aliyuncs.cams.model.v20200606.GetConversationalAutomationResponse.Data;
import com.aliyuncs.cams.model.v20200606.GetConversationalAutomationResponse.Data.CommandsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConversationalAutomationResponseUnmarshaller {

	public static GetConversationalAutomationResponse unmarshall(GetConversationalAutomationResponse getConversationalAutomationResponse, UnmarshallerContext _ctx) {
		
		getConversationalAutomationResponse.setRequestId(_ctx.stringValue("GetConversationalAutomationResponse.RequestId"));
		getConversationalAutomationResponse.setAccessDeniedDetail(_ctx.stringValue("GetConversationalAutomationResponse.AccessDeniedDetail"));
		getConversationalAutomationResponse.setMessage(_ctx.stringValue("GetConversationalAutomationResponse.Message"));
		getConversationalAutomationResponse.setCode(_ctx.stringValue("GetConversationalAutomationResponse.Code"));
		getConversationalAutomationResponse.setSuccess(_ctx.booleanValue("GetConversationalAutomationResponse.Success"));

		Data data = new Data();
		data.setPhoneNumber(_ctx.stringValue("GetConversationalAutomationResponse.Data.PhoneNumber"));
		data.setEnableWelcomeMessage(_ctx.booleanValue("GetConversationalAutomationResponse.Data.EnableWelcomeMessage"));

		List<String> prompts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConversationalAutomationResponse.Data.Prompts.Length"); i++) {
			prompts.add(_ctx.stringValue("GetConversationalAutomationResponse.Data.Prompts["+ i +"]"));
		}
		data.setPrompts(prompts);

		List<CommandsItem> commands = new ArrayList<CommandsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetConversationalAutomationResponse.Data.Commands.Length"); i++) {
			CommandsItem commandsItem = new CommandsItem();
			commandsItem.setCommandDescription(_ctx.stringValue("GetConversationalAutomationResponse.Data.Commands["+ i +"].CommandDescription"));
			commandsItem.setCommandName(_ctx.stringValue("GetConversationalAutomationResponse.Data.Commands["+ i +"].CommandName"));

			commands.add(commandsItem);
		}
		data.setCommands(commands);
		getConversationalAutomationResponse.setData(data);
	 
	 	return getConversationalAutomationResponse;
	}
}