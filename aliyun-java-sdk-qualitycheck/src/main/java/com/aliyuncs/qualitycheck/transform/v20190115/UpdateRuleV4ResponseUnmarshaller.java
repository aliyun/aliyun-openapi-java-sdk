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

import com.aliyuncs.qualitycheck.model.v20190115.UpdateRuleV4Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRuleV4ResponseUnmarshaller {

	public static UpdateRuleV4Response unmarshall(UpdateRuleV4Response updateRuleV4Response, UnmarshallerContext _ctx) {
		
		updateRuleV4Response.setRequestId(_ctx.stringValue("UpdateRuleV4Response.RequestId"));
		updateRuleV4Response.setSuccess(_ctx.booleanValue("UpdateRuleV4Response.Success"));
		updateRuleV4Response.setCode(_ctx.stringValue("UpdateRuleV4Response.Code"));
		updateRuleV4Response.setMessage(_ctx.stringValue("UpdateRuleV4Response.Message"));
		updateRuleV4Response.setHttpStatusCode(_ctx.integerValue("UpdateRuleV4Response.HttpStatusCode"));
		updateRuleV4Response.setData(_ctx.longValue("UpdateRuleV4Response.Data"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateRuleV4Response.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("UpdateRuleV4Response.Messages["+ i +"]"));
		}
		updateRuleV4Response.setMessages(messages);
	 
	 	return updateRuleV4Response;
	}
}