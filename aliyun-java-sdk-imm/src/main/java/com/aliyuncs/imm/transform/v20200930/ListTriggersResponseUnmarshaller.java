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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.ListTriggersResponse;
import com.aliyuncs.imm.model.v20200930.ListTriggersResponse.TriggersItem;
import com.aliyuncs.imm.model.v20200930.ListTriggersResponse.TriggersItem.ActionsItem;
import com.aliyuncs.imm.model.v20200930.ListTriggersResponse.TriggersItem.Input;
import com.aliyuncs.imm.model.v20200930.ListTriggersResponse.TriggersItem.Input.OSS;
import com.aliyuncs.imm.model.v20200930.ListTriggersResponse.TriggersItem.Notification;
import com.aliyuncs.imm.model.v20200930.ListTriggersResponse.TriggersItem.Statistic;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTriggersResponseUnmarshaller {

	public static ListTriggersResponse unmarshall(ListTriggersResponse listTriggersResponse, UnmarshallerContext _ctx) {
		
		listTriggersResponse.setRequestId(_ctx.stringValue("ListTriggersResponse.RequestId"));
		listTriggersResponse.setNextToken(_ctx.stringValue("ListTriggersResponse.NextToken"));

		List<TriggersItem> triggers = new ArrayList<TriggersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTriggersResponse.Triggers.Length"); i++) {
			TriggersItem triggersItem = new TriggersItem();
			triggersItem.setId(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Id"));
			triggersItem.setState(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].State"));
			triggersItem.setMarker(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Marker"));
			triggersItem.setCreateTime(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].CreateTime"));
			triggersItem.setUpdateTime(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].UpdateTime"));
			triggersItem.setTags(_ctx.mapValue("ListTriggersResponse.Triggers["+ i +"].Tags"));
			triggersItem.setError(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Error"));

			Input input = new Input();

			OSS oSS = new OSS();
			oSS.setBucket(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Input.OSS.Bucket"));
			oSS.setPrefix(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Input.OSS.Prefix"));

			List<String> matchExpressions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTriggersResponse.Triggers["+ i +"].Input.OSS.MatchExpressions.Length"); j++) {
				matchExpressions.add(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Input.OSS.MatchExpressions["+ j +"]"));
			}
			oSS.setMatchExpressions(matchExpressions);
			input.setOSS(oSS);
			triggersItem.setInput(input);

			Notification notification = new Notification();
			notification.setEndpoint(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Notification.Endpoint"));
			notification.setTopic(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Notification.Topic"));
			triggersItem.setNotification(notification);

			Statistic statistic = new Statistic();
			statistic.setSubmitSuccess(_ctx.longValue("ListTriggersResponse.Triggers["+ i +"].Statistic.SubmitSuccess"));
			statistic.setSubmitFailure(_ctx.longValue("ListTriggersResponse.Triggers["+ i +"].Statistic.SubmitFailure"));
			triggersItem.setStatistic(statistic);

			List<ActionsItem> actions = new ArrayList<ActionsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTriggersResponse.Triggers["+ i +"].Actions.Length"); j++) {
				ActionsItem actionsItem = new ActionsItem();
				actionsItem.setName(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Actions["+ j +"].Name"));

				List<String> parameters = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListTriggersResponse.Triggers["+ i +"].Actions["+ j +"].Parameters.Length"); k++) {
					parameters.add(_ctx.stringValue("ListTriggersResponse.Triggers["+ i +"].Actions["+ j +"].Parameters["+ k +"]"));
				}
				actionsItem.setParameters(parameters);

				actions.add(actionsItem);
			}
			triggersItem.setActions(actions);

			triggers.add(triggersItem);
		}
		listTriggersResponse.setTriggers(triggers);
	 
	 	return listTriggersResponse;
	}
}