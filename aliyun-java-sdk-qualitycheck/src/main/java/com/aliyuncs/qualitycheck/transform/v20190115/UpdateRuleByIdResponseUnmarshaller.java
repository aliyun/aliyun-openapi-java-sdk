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

import com.aliyuncs.qualitycheck.model.v20190115.UpdateRuleByIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRuleByIdResponseUnmarshaller {

	public static UpdateRuleByIdResponse unmarshall(UpdateRuleByIdResponse updateRuleByIdResponse, UnmarshallerContext _ctx) {
		
		updateRuleByIdResponse.setRequestId(_ctx.stringValue("UpdateRuleByIdResponse.RequestId"));
		updateRuleByIdResponse.setSuccess(_ctx.booleanValue("UpdateRuleByIdResponse.Success"));
		updateRuleByIdResponse.setCode(_ctx.stringValue("UpdateRuleByIdResponse.Code"));
		updateRuleByIdResponse.setMessage(_ctx.stringValue("UpdateRuleByIdResponse.Message"));
		updateRuleByIdResponse.setHttpStatusCode(_ctx.integerValue("UpdateRuleByIdResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateRuleByIdResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("UpdateRuleByIdResponse.Messages["+ i +"]"));
		}
		updateRuleByIdResponse.setMessages(messages);
	 
	 	return updateRuleByIdResponse;
	}
}