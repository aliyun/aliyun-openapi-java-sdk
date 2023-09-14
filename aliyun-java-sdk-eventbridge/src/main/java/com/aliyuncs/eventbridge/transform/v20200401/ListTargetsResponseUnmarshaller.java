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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.ListTargetsResponse;
import com.aliyuncs.eventbridge.model.v20200401.ListTargetsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.ListTargetsResponse.Data.TargetsItem;
import com.aliyuncs.eventbridge.model.v20200401.ListTargetsResponse.Data.TargetsItem.ParamListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTargetsResponseUnmarshaller {

	public static ListTargetsResponse unmarshall(ListTargetsResponse listTargetsResponse, UnmarshallerContext _ctx) {
		
		listTargetsResponse.setRequestId(_ctx.stringValue("ListTargetsResponse.RequestId"));
		listTargetsResponse.setMessage(_ctx.stringValue("ListTargetsResponse.Message"));
		listTargetsResponse.setCode(_ctx.stringValue("ListTargetsResponse.Code"));
		listTargetsResponse.setSuccess(_ctx.booleanValue("ListTargetsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListTargetsResponse.Data.NextToken"));
		data.setTotal(_ctx.integerValue("ListTargetsResponse.Data.Total"));

		List<TargetsItem> targets = new ArrayList<TargetsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTargetsResponse.Data.Targets.Length"); i++) {
			TargetsItem targetsItem = new TargetsItem();
			targetsItem.setDetailMap(_ctx.mapValue("ListTargetsResponse.Data.Targets["+ i +"].DetailMap"));
			targetsItem.setType(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].Type"));
			targetsItem.setEndpoint(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].Endpoint"));
			targetsItem.setPushSelector(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].PushSelector"));
			targetsItem.setErrorsTolerance(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].ErrorsTolerance"));
			targetsItem.setId(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].Id"));
			targetsItem.setEventBusName(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].EventBusName"));
			targetsItem.setRuleName(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].RuleName"));

			List<ParamListItem> paramList = new ArrayList<ParamListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTargetsResponse.Data.Targets["+ i +"].ParamList.Length"); j++) {
				ParamListItem paramListItem = new ParamListItem();
				paramListItem.setValue(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].ParamList["+ j +"].Value"));
				paramListItem.setTemplate(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].ParamList["+ j +"].Template"));
				paramListItem.setForm(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].ParamList["+ j +"].Form"));
				paramListItem.setResourceKey(_ctx.stringValue("ListTargetsResponse.Data.Targets["+ i +"].ParamList["+ j +"].ResourceKey"));

				paramList.add(paramListItem);
			}
			targetsItem.setParamList(paramList);

			targets.add(targetsItem);
		}
		data.setTargets(targets);
		listTargetsResponse.setData(data);
	 
	 	return listTargetsResponse;
	}
}