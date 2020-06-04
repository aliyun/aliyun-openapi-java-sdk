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

import com.aliyuncs.outboundbot.model.v20191226.ListIntentsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentsResponse.Intents;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentsResponse.Intents.Intent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntentsResponseUnmarshaller {

	public static ListIntentsResponse unmarshall(ListIntentsResponse listIntentsResponse, UnmarshallerContext _ctx) {
		
		listIntentsResponse.setRequestId(_ctx.stringValue("ListIntentsResponse.RequestId"));
		listIntentsResponse.setCode(_ctx.stringValue("ListIntentsResponse.Code"));
		listIntentsResponse.setHttpStatusCode(_ctx.integerValue("ListIntentsResponse.HttpStatusCode"));
		listIntentsResponse.setMessage(_ctx.stringValue("ListIntentsResponse.Message"));
		listIntentsResponse.setSuccess(_ctx.booleanValue("ListIntentsResponse.Success"));

		Intents intents = new Intents();
		intents.setPageNumber(_ctx.integerValue("ListIntentsResponse.Intents.PageNumber"));
		intents.setPageSize(_ctx.integerValue("ListIntentsResponse.Intents.PageSize"));
		intents.setTotalCount(_ctx.integerValue("ListIntentsResponse.Intents.TotalCount"));

		List<Intent> list = new ArrayList<Intent>();
		for (int i = 0; i < _ctx.lengthValue("ListIntentsResponse.Intents.List.Length"); i++) {
			Intent intent = new Intent();
			intent.setCreateTime(_ctx.longValue("ListIntentsResponse.Intents.List["+ i +"].CreateTime"));
			intent.setIntentDescription(_ctx.stringValue("ListIntentsResponse.Intents.List["+ i +"].IntentDescription"));
			intent.setIntentId(_ctx.stringValue("ListIntentsResponse.Intents.List["+ i +"].IntentId"));
			intent.setIntentName(_ctx.stringValue("ListIntentsResponse.Intents.List["+ i +"].IntentName"));
			intent.setKeywords(_ctx.stringValue("ListIntentsResponse.Intents.List["+ i +"].Keywords"));
			intent.setScriptId(_ctx.stringValue("ListIntentsResponse.Intents.List["+ i +"].ScriptId"));
			intent.setUpdateTime(_ctx.longValue("ListIntentsResponse.Intents.List["+ i +"].UpdateTime"));
			intent.setUtterances(_ctx.stringValue("ListIntentsResponse.Intents.List["+ i +"].Utterances"));

			list.add(intent);
		}
		intents.setList(list);
		listIntentsResponse.setIntents(intents);
	 
	 	return listIntentsResponse;
	}
}