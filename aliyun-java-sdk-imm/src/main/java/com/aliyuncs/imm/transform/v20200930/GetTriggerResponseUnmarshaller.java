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

import com.aliyuncs.imm.model.v20200930.GetTriggerResponse;
import com.aliyuncs.imm.model.v20200930.GetTriggerResponse.Trigger;
import com.aliyuncs.imm.model.v20200930.GetTriggerResponse.Trigger.ActionsItem;
import com.aliyuncs.imm.model.v20200930.GetTriggerResponse.Trigger.Input;
import com.aliyuncs.imm.model.v20200930.GetTriggerResponse.Trigger.Input.OSS;
import com.aliyuncs.imm.model.v20200930.GetTriggerResponse.Trigger.Notification;
import com.aliyuncs.imm.model.v20200930.GetTriggerResponse.Trigger.Statistic;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTriggerResponseUnmarshaller {

	public static GetTriggerResponse unmarshall(GetTriggerResponse getTriggerResponse, UnmarshallerContext _ctx) {
		
		getTriggerResponse.setRequestId(_ctx.stringValue("GetTriggerResponse.RequestId"));

		Trigger trigger = new Trigger();
		trigger.setId(_ctx.stringValue("GetTriggerResponse.Trigger.Id"));
		trigger.setState(_ctx.stringValue("GetTriggerResponse.Trigger.State"));
		trigger.setMarker(_ctx.stringValue("GetTriggerResponse.Trigger.Marker"));
		trigger.setCreateTime(_ctx.stringValue("GetTriggerResponse.Trigger.CreateTime"));
		trigger.setUpdateTime(_ctx.stringValue("GetTriggerResponse.Trigger.UpdateTime"));
		trigger.setTags(_ctx.mapValue("GetTriggerResponse.Trigger.Tags"));
		trigger.setError(_ctx.stringValue("GetTriggerResponse.Trigger.Error"));

		Input input = new Input();

		OSS oSS = new OSS();
		oSS.setBucket(_ctx.stringValue("GetTriggerResponse.Trigger.Input.OSS.Bucket"));
		oSS.setPrefix(_ctx.stringValue("GetTriggerResponse.Trigger.Input.OSS.Prefix"));

		List<String> matchExpressions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTriggerResponse.Trigger.Input.OSS.MatchExpressions.Length"); i++) {
			matchExpressions.add(_ctx.stringValue("GetTriggerResponse.Trigger.Input.OSS.MatchExpressions["+ i +"]"));
		}
		oSS.setMatchExpressions(matchExpressions);
		input.setOSS(oSS);
		trigger.setInput(input);

		Notification notification = new Notification();
		notification.setEndpoint(_ctx.stringValue("GetTriggerResponse.Trigger.Notification.Endpoint"));
		notification.setTopic(_ctx.stringValue("GetTriggerResponse.Trigger.Notification.Topic"));
		trigger.setNotification(notification);

		Statistic statistic = new Statistic();
		statistic.setSubmitSuccess(_ctx.longValue("GetTriggerResponse.Trigger.Statistic.SubmitSuccess"));
		statistic.setSubmitFailure(_ctx.longValue("GetTriggerResponse.Trigger.Statistic.SubmitFailure"));
		trigger.setStatistic(statistic);

		List<ActionsItem> actions = new ArrayList<ActionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTriggerResponse.Trigger.Actions.Length"); i++) {
			ActionsItem actionsItem = new ActionsItem();
			actionsItem.setName(_ctx.stringValue("GetTriggerResponse.Trigger.Actions["+ i +"].Name"));

			List<String> parameters = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTriggerResponse.Trigger.Actions["+ i +"].Parameters.Length"); j++) {
				parameters.add(_ctx.stringValue("GetTriggerResponse.Trigger.Actions["+ i +"].Parameters["+ j +"]"));
			}
			actionsItem.setParameters(parameters);

			actions.add(actionsItem);
		}
		trigger.setActions(actions);
		getTriggerResponse.setTrigger(trigger);
	 
	 	return getTriggerResponse;
	}
}