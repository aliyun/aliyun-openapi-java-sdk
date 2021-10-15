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

import com.aliyuncs.linkedmall.model.v20180116.StartUserGameResponse;
import com.aliyuncs.linkedmall.model.v20180116.StartUserGameResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartUserGameResponseUnmarshaller {

	public static StartUserGameResponse unmarshall(StartUserGameResponse startUserGameResponse, UnmarshallerContext _ctx) {
		
		startUserGameResponse.setRequestId(_ctx.stringValue("StartUserGameResponse.RequestId"));
		startUserGameResponse.setCode(_ctx.stringValue("StartUserGameResponse.Code"));
		startUserGameResponse.setMessage(_ctx.stringValue("StartUserGameResponse.Message"));

		Model model = new Model();
		model.setProcessId(_ctx.stringValue("StartUserGameResponse.Model.ProcessId"));
		model.setGameId(_ctx.stringValue("StartUserGameResponse.Model.GameId"));
		model.setActivityId(_ctx.stringValue("StartUserGameResponse.Model.ActivityId"));
		model.setName(_ctx.stringValue("StartUserGameResponse.Model.Name"));
		model.setType(_ctx.stringValue("StartUserGameResponse.Model.Type"));
		model.setDesc(_ctx.stringValue("StartUserGameResponse.Model.Desc"));
		model.setBizId(_ctx.stringValue("StartUserGameResponse.Model.BizId"));
		model.setContent(_ctx.stringValue("StartUserGameResponse.Model.Content"));
		model.setStatus(_ctx.stringValue("StartUserGameResponse.Model.Status"));
		model.setCurrentStepStatus(_ctx.stringValue("StartUserGameResponse.Model.CurrentStepStatus"));
		model.setCurrentStepId(_ctx.stringValue("StartUserGameResponse.Model.CurrentStepId"));
		model.setGameCoinRecords(_ctx.stringValue("StartUserGameResponse.Model.GameCoinRecords"));
		model.setGameAwardRecords(_ctx.stringValue("StartUserGameResponse.Model.GameAwardRecords"));
		model.setExtInfo(_ctx.stringValue("StartUserGameResponse.Model.ExtInfo"));
		model.setRouteId(_ctx.stringValue("StartUserGameResponse.Model.RouteId"));
		startUserGameResponse.setModel(model);
	 
	 	return startUserGameResponse;
	}
}