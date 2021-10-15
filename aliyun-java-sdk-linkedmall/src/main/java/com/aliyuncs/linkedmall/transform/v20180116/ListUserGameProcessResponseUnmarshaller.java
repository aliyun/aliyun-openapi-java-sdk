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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.ListUserGameProcessResponse;
import com.aliyuncs.linkedmall.model.v20180116.ListUserGameProcessResponse.UserProcessModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGameProcessResponseUnmarshaller {

	public static ListUserGameProcessResponse unmarshall(ListUserGameProcessResponse listUserGameProcessResponse, UnmarshallerContext _ctx) {
		
		listUserGameProcessResponse.setRequestId(_ctx.stringValue("ListUserGameProcessResponse.RequestId"));
		listUserGameProcessResponse.setTotalCount(_ctx.longValue("ListUserGameProcessResponse.TotalCount"));
		listUserGameProcessResponse.setCode(_ctx.stringValue("ListUserGameProcessResponse.Code"));
		listUserGameProcessResponse.setMessage(_ctx.stringValue("ListUserGameProcessResponse.Message"));
		listUserGameProcessResponse.setPageSize(_ctx.integerValue("ListUserGameProcessResponse.PageSize"));
		listUserGameProcessResponse.setPageNumber(_ctx.integerValue("ListUserGameProcessResponse.PageNumber"));

		List<UserProcessModel> model = new ArrayList<UserProcessModel>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGameProcessResponse.Model.Length"); i++) {
			UserProcessModel userProcessModel = new UserProcessModel();
			userProcessModel.setProcessId(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].ProcessId"));
			userProcessModel.setGameId(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].GameId"));
			userProcessModel.setActivityId(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].ActivityId"));
			userProcessModel.setName(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].Name"));
			userProcessModel.setType(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].Type"));
			userProcessModel.setDesc(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].Desc"));
			userProcessModel.setContent(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].Content"));
			userProcessModel.setStatus(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].Status"));
			userProcessModel.setCurrentStepStatus(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].CurrentStepStatus"));
			userProcessModel.setCurrentStepId(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].CurrentStepId"));
			userProcessModel.setGameCoinRecords(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].GameCoinRecords"));
			userProcessModel.setGameAwardRecords(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].GameAwardRecords"));
			userProcessModel.setExtInfo(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].ExtInfo"));
			userProcessModel.setRouteId(_ctx.stringValue("ListUserGameProcessResponse.Model["+ i +"].RouteId"));

			model.add(userProcessModel);
		}
		listUserGameProcessResponse.setModel(model);
	 
	 	return listUserGameProcessResponse;
	}
}