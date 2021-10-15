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

import com.aliyuncs.linkedmall.model.v20180116.QueryUserGameProcessResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryUserGameProcessResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserGameProcessResponseUnmarshaller {

	public static QueryUserGameProcessResponse unmarshall(QueryUserGameProcessResponse queryUserGameProcessResponse, UnmarshallerContext _ctx) {
		
		queryUserGameProcessResponse.setRequestId(_ctx.stringValue("QueryUserGameProcessResponse.RequestId"));
		queryUserGameProcessResponse.setCode(_ctx.stringValue("QueryUserGameProcessResponse.Code"));
		queryUserGameProcessResponse.setMessage(_ctx.stringValue("QueryUserGameProcessResponse.Message"));

		Model model = new Model();
		model.setProcessId(_ctx.stringValue("QueryUserGameProcessResponse.Model.ProcessId"));
		model.setGameId(_ctx.stringValue("QueryUserGameProcessResponse.Model.GameId"));
		model.setActivityId(_ctx.stringValue("QueryUserGameProcessResponse.Model.ActivityId"));
		model.setName(_ctx.stringValue("QueryUserGameProcessResponse.Model.Name"));
		model.setType(_ctx.stringValue("QueryUserGameProcessResponse.Model.Type"));
		model.setDesc(_ctx.stringValue("QueryUserGameProcessResponse.Model.Desc"));
		model.setContent(_ctx.stringValue("QueryUserGameProcessResponse.Model.Content"));
		model.setStatus(_ctx.stringValue("QueryUserGameProcessResponse.Model.Status"));
		model.setCurrentStepStatus(_ctx.stringValue("QueryUserGameProcessResponse.Model.CurrentStepStatus"));
		model.setCurrentStepId(_ctx.stringValue("QueryUserGameProcessResponse.Model.CurrentStepId"));
		model.setGameCoinRecords(_ctx.stringValue("QueryUserGameProcessResponse.Model.GameCoinRecords"));
		model.setGameAwardRecords(_ctx.stringValue("QueryUserGameProcessResponse.Model.GameAwardRecords"));
		model.setExtInfo(_ctx.stringValue("QueryUserGameProcessResponse.Model.ExtInfo"));
		model.setRouteId(_ctx.stringValue("QueryUserGameProcessResponse.Model.RouteId"));
		queryUserGameProcessResponse.setModel(model);
	 
	 	return queryUserGameProcessResponse;
	}
}