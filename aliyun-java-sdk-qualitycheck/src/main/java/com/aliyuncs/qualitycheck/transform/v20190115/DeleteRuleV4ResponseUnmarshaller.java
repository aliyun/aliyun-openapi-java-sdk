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

import com.aliyuncs.qualitycheck.model.v20190115.DeleteRuleV4Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRuleV4ResponseUnmarshaller {

	public static DeleteRuleV4Response unmarshall(DeleteRuleV4Response deleteRuleV4Response, UnmarshallerContext _ctx) {
		
		deleteRuleV4Response.setRequestId(_ctx.stringValue("DeleteRuleV4Response.RequestId"));
		deleteRuleV4Response.setSuccess(_ctx.booleanValue("DeleteRuleV4Response.Success"));
		deleteRuleV4Response.setCode(_ctx.stringValue("DeleteRuleV4Response.Code"));
		deleteRuleV4Response.setMessage(_ctx.stringValue("DeleteRuleV4Response.Message"));
		deleteRuleV4Response.setHttpStatusCode(_ctx.integerValue("DeleteRuleV4Response.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteRuleV4Response.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("DeleteRuleV4Response.Messages["+ i +"]"));
		}
		deleteRuleV4Response.setMessages(messages);
	 
	 	return deleteRuleV4Response;
	}
}