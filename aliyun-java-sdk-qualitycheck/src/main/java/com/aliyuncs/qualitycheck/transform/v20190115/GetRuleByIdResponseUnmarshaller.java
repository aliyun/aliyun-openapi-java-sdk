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

import com.aliyuncs.qualitycheck.model.v20190115.GetRuleByIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleByIdResponseUnmarshaller {

	public static GetRuleByIdResponse unmarshall(GetRuleByIdResponse getRuleByIdResponse, UnmarshallerContext _ctx) {
		
		getRuleByIdResponse.setRequestId(_ctx.stringValue("GetRuleByIdResponse.RequestId"));
		getRuleByIdResponse.setData(_ctx.stringValue("GetRuleByIdResponse.Data"));
		getRuleByIdResponse.setSuccess(_ctx.booleanValue("GetRuleByIdResponse.Success"));
		getRuleByIdResponse.setCode(_ctx.stringValue("GetRuleByIdResponse.Code"));
		getRuleByIdResponse.setMessage(_ctx.stringValue("GetRuleByIdResponse.Message"));
		getRuleByIdResponse.setHttpStatusCode(_ctx.integerValue("GetRuleByIdResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRuleByIdResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("GetRuleByIdResponse.Messages["+ i +"]"));
		}
		getRuleByIdResponse.setMessages(messages);
	 
	 	return getRuleByIdResponse;
	}
}