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

import com.aliyuncs.qualitycheck.model.v20190115.UpdateRuleToSchemeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRuleToSchemeResponseUnmarshaller {

	public static UpdateRuleToSchemeResponse unmarshall(UpdateRuleToSchemeResponse updateRuleToSchemeResponse, UnmarshallerContext _ctx) {
		
		updateRuleToSchemeResponse.setRequestId(_ctx.stringValue("UpdateRuleToSchemeResponse.RequestId"));
		updateRuleToSchemeResponse.setData(_ctx.longValue("UpdateRuleToSchemeResponse.Data"));
		updateRuleToSchemeResponse.setSuccess(_ctx.booleanValue("UpdateRuleToSchemeResponse.Success"));
		updateRuleToSchemeResponse.setCode(_ctx.stringValue("UpdateRuleToSchemeResponse.Code"));
		updateRuleToSchemeResponse.setMessage(_ctx.stringValue("UpdateRuleToSchemeResponse.Message"));
		updateRuleToSchemeResponse.setHttpStatusCode(_ctx.integerValue("UpdateRuleToSchemeResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateRuleToSchemeResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("UpdateRuleToSchemeResponse.Messages["+ i +"]"));
		}
		updateRuleToSchemeResponse.setMessages(messages);
	 
	 	return updateRuleToSchemeResponse;
	}
}