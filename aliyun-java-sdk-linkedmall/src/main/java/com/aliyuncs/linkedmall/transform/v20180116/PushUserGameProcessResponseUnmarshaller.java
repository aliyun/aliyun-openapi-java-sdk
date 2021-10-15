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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.PushUserGameProcessResponse;
import com.aliyuncs.linkedmall.model.v20180116.PushUserGameProcessResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushUserGameProcessResponseUnmarshaller {

	public static PushUserGameProcessResponse unmarshall(PushUserGameProcessResponse pushUserGameProcessResponse, UnmarshallerContext _ctx) {
		
		pushUserGameProcessResponse.setRequestId(_ctx.stringValue("PushUserGameProcessResponse.RequestId"));
		pushUserGameProcessResponse.setCode(_ctx.stringValue("PushUserGameProcessResponse.Code"));
		pushUserGameProcessResponse.setMessage(_ctx.stringValue("PushUserGameProcessResponse.Message"));

		Model model = new Model();
		model.setProcessId(_ctx.stringValue("PushUserGameProcessResponse.Model.ProcessId"));
		model.setGameId(_ctx.stringValue("PushUserGameProcessResponse.Model.GameId"));
		model.setActivityId(_ctx.stringValue("PushUserGameProcessResponse.Model.ActivityId"));
		model.setName(_ctx.stringValue("PushUserGameProcessResponse.Model.Name"));
		model.setType(_ctx.stringValue("PushUserGameProcessResponse.Model.Type"));
		model.setDesc(_ctx.stringValue("PushUserGameProcessResponse.Model.Desc"));
		model.setContent(_ctx.stringValue("PushUserGameProcessResponse.Model.Content"));
		model.setStatus(_ctx.stringValue("PushUserGameProcessResponse.Model.Status"));
		model.setCurrentStepStatus(_ctx.stringValue("PushUserGameProcessResponse.Model.CurrentStepStatus"));
		model.setCurrentStepId(_ctx.stringValue("PushUserGameProcessResponse.Model.CurrentStepId"));
		model.setGameCoinRecords(_ctx.stringValue("PushUserGameProcessResponse.Model.GameCoinRecords"));
		model.setGameAwardRecords(_ctx.stringValue("PushUserGameProcessResponse.Model.GameAwardRecords"));
		model.setExtInfo(_ctx.stringValue("PushUserGameProcessResponse.Model.ExtInfo"));
		model.setRouteId(_ctx.stringValue("PushUserGameProcessResponse.Model.RouteId"));
		pushUserGameProcessResponse.setModel(model);
	 
	 	return pushUserGameProcessResponse;
	}
}