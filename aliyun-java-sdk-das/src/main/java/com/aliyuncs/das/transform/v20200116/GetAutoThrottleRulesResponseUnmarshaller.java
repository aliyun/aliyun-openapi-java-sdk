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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetAutoThrottleRulesResponse;
import com.aliyuncs.das.model.v20200116.GetAutoThrottleRulesResponse.Data;
import com.aliyuncs.das.model.v20200116.GetAutoThrottleRulesResponse.Data.EnableAutoThrottleListItem;
import com.aliyuncs.das.model.v20200116.GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoThrottleRulesResponseUnmarshaller {

	public static GetAutoThrottleRulesResponse unmarshall(GetAutoThrottleRulesResponse getAutoThrottleRulesResponse, UnmarshallerContext _ctx) {
		
		getAutoThrottleRulesResponse.setRequestId(_ctx.stringValue("GetAutoThrottleRulesResponse.RequestId"));
		getAutoThrottleRulesResponse.setCode(_ctx.longValue("GetAutoThrottleRulesResponse.Code"));
		getAutoThrottleRulesResponse.setMessage(_ctx.stringValue("GetAutoThrottleRulesResponse.Message"));
		getAutoThrottleRulesResponse.setSuccess(_ctx.booleanValue("GetAutoThrottleRulesResponse.Success"));

		Data data = new Data();
		data.setTotalAutoThrottleRulesCount(_ctx.longValue("GetAutoThrottleRulesResponse.Data.TotalAutoThrottleRulesCount"));
		data.setEnableAutoThrottleCount(_ctx.longValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleCount"));
		data.setTurnOffAutoThrottleCount(_ctx.longValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleCount"));
		data.setNeverEnableAutoThrottleOrReleasedInstanceCount(_ctx.longValue("GetAutoThrottleRulesResponse.Data.NeverEnableAutoThrottleOrReleasedInstanceCount"));

		List<String> neverEnableAutoThrottleOrReleasedInstanceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoThrottleRulesResponse.Data.NeverEnableAutoThrottleOrReleasedInstanceIdList.Length"); i++) {
			neverEnableAutoThrottleOrReleasedInstanceIdList.add(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.NeverEnableAutoThrottleOrReleasedInstanceIdList["+ i +"]"));
		}
		data.setNeverEnableAutoThrottleOrReleasedInstanceIdList(neverEnableAutoThrottleOrReleasedInstanceIdList);

		List<EnableAutoThrottleListItem> enableAutoThrottleList = new ArrayList<EnableAutoThrottleListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList.Length"); i++) {
			EnableAutoThrottleListItem enableAutoThrottleListItem = new EnableAutoThrottleListItem();
			enableAutoThrottleListItem.setAbnormalDuration(_ctx.doubleValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].AbnormalDuration"));
			enableAutoThrottleListItem.setCpuUsage(_ctx.doubleValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].CpuUsage"));
			enableAutoThrottleListItem.setCpuSessionRelation(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].CpuSessionRelation"));
			enableAutoThrottleListItem.setActiveSessions(_ctx.longValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].ActiveSessions"));
			enableAutoThrottleListItem.setMaxThrottleTime(_ctx.doubleValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].MaxThrottleTime"));
			enableAutoThrottleListItem.setAllowThrottleStartTime(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].AllowThrottleStartTime"));
			enableAutoThrottleListItem.setAllowThrottleEndTime(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].AllowThrottleEndTime"));
			enableAutoThrottleListItem.setVisible(_ctx.booleanValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].Visible"));
			enableAutoThrottleListItem.setAutoKillSession(_ctx.booleanValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].AutoKillSession"));
			enableAutoThrottleListItem.setInstanceId(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].InstanceId"));
			enableAutoThrottleListItem.setUserId(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.EnableAutoThrottleList["+ i +"].UserId"));

			enableAutoThrottleList.add(enableAutoThrottleListItem);
		}
		data.setEnableAutoThrottleList(enableAutoThrottleList);

		List<TurnOffAutoThrottleListItem> turnOffAutoThrottleList = new ArrayList<TurnOffAutoThrottleListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList.Length"); i++) {
			TurnOffAutoThrottleListItem turnOffAutoThrottleListItem = new TurnOffAutoThrottleListItem();
			turnOffAutoThrottleListItem.setAbnormalDuration(_ctx.doubleValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].AbnormalDuration"));
			turnOffAutoThrottleListItem.setCpuUsage(_ctx.doubleValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].CpuUsage"));
			turnOffAutoThrottleListItem.setAllowThrottleEndTime(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].AllowThrottleEndTime"));
			turnOffAutoThrottleListItem.setInstanceId(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].InstanceId"));
			turnOffAutoThrottleListItem.setVisible(_ctx.booleanValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].Visible"));
			turnOffAutoThrottleListItem.setCpuSessionRelation(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].CpuSessionRelation"));
			turnOffAutoThrottleListItem.setAutoKillSession(_ctx.booleanValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].AutoKillSession"));
			turnOffAutoThrottleListItem.setActiveSessions(_ctx.longValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].ActiveSessions"));
			turnOffAutoThrottleListItem.setMaxThrottleTime(_ctx.doubleValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].MaxThrottleTime"));
			turnOffAutoThrottleListItem.setUserId(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].UserId"));
			turnOffAutoThrottleListItem.setAllowThrottleStartTime(_ctx.stringValue("GetAutoThrottleRulesResponse.Data.TurnOffAutoThrottleList["+ i +"].AllowThrottleStartTime"));

			turnOffAutoThrottleList.add(turnOffAutoThrottleListItem);
		}
		data.setTurnOffAutoThrottleList(turnOffAutoThrottleList);
		getAutoThrottleRulesResponse.setData(data);
	 
	 	return getAutoThrottleRulesResponse;
	}
}