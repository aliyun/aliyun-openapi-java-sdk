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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.AddRuleV4Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRuleV4ResponseUnmarshaller {

	public static AddRuleV4Response unmarshall(AddRuleV4Response addRuleV4Response, UnmarshallerContext _ctx) {
		
		addRuleV4Response.setRequestId(_ctx.stringValue("AddRuleV4Response.RequestId"));
		addRuleV4Response.setSuccess(_ctx.booleanValue("AddRuleV4Response.Success"));
		addRuleV4Response.setCode(_ctx.stringValue("AddRuleV4Response.Code"));
		addRuleV4Response.setMessage(_ctx.stringValue("AddRuleV4Response.Message"));
		addRuleV4Response.setHttpStatusCode(_ctx.integerValue("AddRuleV4Response.HttpStatusCode"));
		addRuleV4Response.setData(_ctx.longValue("AddRuleV4Response.Data"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddRuleV4Response.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("AddRuleV4Response.Messages["+ i +"]"));
		}
		addRuleV4Response.setMessages(messages);
	 
	 	return addRuleV4Response;
	}
}