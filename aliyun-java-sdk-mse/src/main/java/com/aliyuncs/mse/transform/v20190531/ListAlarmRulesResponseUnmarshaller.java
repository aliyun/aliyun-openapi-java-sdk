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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListAlarmRulesResponse;
import com.aliyuncs.mse.model.v20190531.ListAlarmRulesResponse.AlarmRuleModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlarmRulesResponseUnmarshaller {

	public static ListAlarmRulesResponse unmarshall(ListAlarmRulesResponse listAlarmRulesResponse, UnmarshallerContext _ctx) {
		
		listAlarmRulesResponse.setRequestId(_ctx.stringValue("ListAlarmRulesResponse.RequestId"));
		listAlarmRulesResponse.setSuccess(_ctx.booleanValue("ListAlarmRulesResponse.Success"));
		listAlarmRulesResponse.setMessage(_ctx.stringValue("ListAlarmRulesResponse.Message"));
		listAlarmRulesResponse.setErrorCode(_ctx.stringValue("ListAlarmRulesResponse.ErrorCode"));
		listAlarmRulesResponse.setPageNumber(_ctx.integerValue("ListAlarmRulesResponse.PageNumber"));
		listAlarmRulesResponse.setPageSize(_ctx.integerValue("ListAlarmRulesResponse.PageSize"));
		listAlarmRulesResponse.setTotalCount(_ctx.integerValue("ListAlarmRulesResponse.TotalCount"));
		listAlarmRulesResponse.setHttpCode(_ctx.stringValue("ListAlarmRulesResponse.HttpCode"));

		List<AlarmRuleModel> data = new ArrayList<AlarmRuleModel>();
		for (int i = 0; i < _ctx.lengthValue("ListAlarmRulesResponse.Data.Length"); i++) {
			AlarmRuleModel alarmRuleModel = new AlarmRuleModel();
			alarmRuleModel.setAlarmStatus(_ctx.stringValue("ListAlarmRulesResponse.Data["+ i +"].AlarmStatus"));
			alarmRuleModel.setAlarmName(_ctx.stringValue("ListAlarmRulesResponse.Data["+ i +"].AlarmName"));
			alarmRuleModel.setCreateTime(_ctx.stringValue("ListAlarmRulesResponse.Data["+ i +"].CreateTime"));
			alarmRuleModel.setAlarmRuleDetail(_ctx.stringValue("ListAlarmRulesResponse.Data["+ i +"].AlarmRuleDetail"));
			alarmRuleModel.setAlarmRuleId(_ctx.stringValue("ListAlarmRulesResponse.Data["+ i +"].AlarmRuleId"));

			data.add(alarmRuleModel);
		}
		listAlarmRulesResponse.setData(data);
	 
	 	return listAlarmRulesResponse;
	}
}