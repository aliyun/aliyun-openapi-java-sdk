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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListBeebotIntentResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListBeebotIntentResponse.Intent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBeebotIntentResponseUnmarshaller {

	public static ListBeebotIntentResponse unmarshall(ListBeebotIntentResponse listBeebotIntentResponse, UnmarshallerContext _ctx) {
		
		listBeebotIntentResponse.setRequestId(_ctx.stringValue("ListBeebotIntentResponse.RequestId"));
		listBeebotIntentResponse.setHttpStatusCode(_ctx.integerValue("ListBeebotIntentResponse.HttpStatusCode"));
		listBeebotIntentResponse.setSuccess(_ctx.booleanValue("ListBeebotIntentResponse.Success"));
		listBeebotIntentResponse.setBeebotRequestId(_ctx.stringValue("ListBeebotIntentResponse.BeebotRequestId"));
		listBeebotIntentResponse.setCode(_ctx.stringValue("ListBeebotIntentResponse.Code"));
		listBeebotIntentResponse.setMessage(_ctx.stringValue("ListBeebotIntentResponse.Message"));
		listBeebotIntentResponse.setPageSize(_ctx.integerValue("ListBeebotIntentResponse.PageSize"));
		listBeebotIntentResponse.setPageNumber(_ctx.integerValue("ListBeebotIntentResponse.PageNumber"));
		listBeebotIntentResponse.setTotalCount(_ctx.integerValue("ListBeebotIntentResponse.TotalCount"));

		List<Intent> intents = new ArrayList<Intent>();
		for (int i = 0; i < _ctx.lengthValue("ListBeebotIntentResponse.Intents.Length"); i++) {
			Intent intent = new Intent();
			intent.setIntentId(_ctx.longValue("ListBeebotIntentResponse.Intents["+ i +"].IntentId"));
			intent.setIntentName(_ctx.stringValue("ListBeebotIntentResponse.Intents["+ i +"].IntentName"));
			intent.setAliasName(_ctx.stringValue("ListBeebotIntentResponse.Intents["+ i +"].AliasName"));
			intent.setModifyUserId(_ctx.stringValue("ListBeebotIntentResponse.Intents["+ i +"].ModifyUserId"));
			intent.setModifyUserName(_ctx.stringValue("ListBeebotIntentResponse.Intents["+ i +"].ModifyUserName"));
			intent.setCreateUserName(_ctx.stringValue("ListBeebotIntentResponse.Intents["+ i +"].CreateUserName"));
			intent.setCreateTime(_ctx.stringValue("ListBeebotIntentResponse.Intents["+ i +"].CreateTime"));
			intent.setCreateUserId(_ctx.stringValue("ListBeebotIntentResponse.Intents["+ i +"].CreateUserId"));
			intent.setModifyTime(_ctx.stringValue("ListBeebotIntentResponse.Intents["+ i +"].ModifyTime"));

			intents.add(intent);
		}
		listBeebotIntentResponse.setIntents(intents);
	 
	 	return listBeebotIntentResponse;
	}
}