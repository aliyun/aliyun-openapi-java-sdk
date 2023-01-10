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

import com.aliyuncs.das.model.v20200116.GetAutoResourceOptimizeRulesResponse;
import com.aliyuncs.das.model.v20200116.GetAutoResourceOptimizeRulesResponse.Data;
import com.aliyuncs.das.model.v20200116.GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeListItem;
import com.aliyuncs.das.model.v20200116.GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProListItem;
import com.aliyuncs.das.model.v20200116.GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoResourceOptimizeRulesResponseUnmarshaller {

	public static GetAutoResourceOptimizeRulesResponse unmarshall(GetAutoResourceOptimizeRulesResponse getAutoResourceOptimizeRulesResponse, UnmarshallerContext _ctx) {
		
		getAutoResourceOptimizeRulesResponse.setRequestId(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.RequestId"));
		getAutoResourceOptimizeRulesResponse.setCode(_ctx.longValue("GetAutoResourceOptimizeRulesResponse.Code"));
		getAutoResourceOptimizeRulesResponse.setMessage(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.Message"));
		getAutoResourceOptimizeRulesResponse.setSuccess(_ctx.booleanValue("GetAutoResourceOptimizeRulesResponse.Success"));

		Data data = new Data();
		data.setTotalAutoResourceOptimizeRulesCount(_ctx.longValue("GetAutoResourceOptimizeRulesResponse.Data.TotalAutoResourceOptimizeRulesCount"));
		data.setEnableAutoResourceOptimizeCount(_ctx.longValue("GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeCount"));
		data.setTurnOffAutoResourceOptimizeCount(_ctx.longValue("GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeCount"));
		data.setHasEnableRuleButNotDasProCount(_ctx.longValue("GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProCount"));
		data.setNeverEnableAutoResourceOptimizeOrReleasedInstanceCount(_ctx.longValue("GetAutoResourceOptimizeRulesResponse.Data.NeverEnableAutoResourceOptimizeOrReleasedInstanceCount"));

		List<String> neverEnableAutoResourceOptimizeOrReleasedInstanceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoResourceOptimizeRulesResponse.Data.NeverEnableAutoResourceOptimizeOrReleasedInstanceIdList.Length"); i++) {
			neverEnableAutoResourceOptimizeOrReleasedInstanceIdList.add(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.Data.NeverEnableAutoResourceOptimizeOrReleasedInstanceIdList["+ i +"]"));
		}
		data.setNeverEnableAutoResourceOptimizeOrReleasedInstanceIdList(neverEnableAutoResourceOptimizeOrReleasedInstanceIdList);

		List<EnableAutoResourceOptimizeListItem> enableAutoResourceOptimizeList = new ArrayList<EnableAutoResourceOptimizeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeList.Length"); i++) {
			EnableAutoResourceOptimizeListItem enableAutoResourceOptimizeListItem = new EnableAutoResourceOptimizeListItem();
			enableAutoResourceOptimizeListItem.setInstanceId(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeList["+ i +"].InstanceId"));
			enableAutoResourceOptimizeListItem.setAutoDefragment(_ctx.booleanValue("GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeList["+ i +"].AutoDefragment"));
			enableAutoResourceOptimizeListItem.setTableSpaceSize(_ctx.doubleValue("GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeList["+ i +"].TableSpaceSize"));
			enableAutoResourceOptimizeListItem.setDasProOn(_ctx.booleanValue("GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeList["+ i +"].DasProOn"));
			enableAutoResourceOptimizeListItem.setTableFragmentationRatio(_ctx.doubleValue("GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeList["+ i +"].TableFragmentationRatio"));
			enableAutoResourceOptimizeListItem.setUserId(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.Data.EnableAutoResourceOptimizeList["+ i +"].UserId"));

			enableAutoResourceOptimizeList.add(enableAutoResourceOptimizeListItem);
		}
		data.setEnableAutoResourceOptimizeList(enableAutoResourceOptimizeList);

		List<TurnOffAutoResourceOptimizeListItem> turnOffAutoResourceOptimizeList = new ArrayList<TurnOffAutoResourceOptimizeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeList.Length"); i++) {
			TurnOffAutoResourceOptimizeListItem turnOffAutoResourceOptimizeListItem = new TurnOffAutoResourceOptimizeListItem();
			turnOffAutoResourceOptimizeListItem.setInstanceId(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeList["+ i +"].InstanceId"));
			turnOffAutoResourceOptimizeListItem.setAutoDefragment(_ctx.booleanValue("GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeList["+ i +"].AutoDefragment"));
			turnOffAutoResourceOptimizeListItem.setTableSpaceSize(_ctx.doubleValue("GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeList["+ i +"].TableSpaceSize"));
			turnOffAutoResourceOptimizeListItem.setDasProOn(_ctx.booleanValue("GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeList["+ i +"].DasProOn"));
			turnOffAutoResourceOptimizeListItem.setTableFragmentationRatio(_ctx.doubleValue("GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeList["+ i +"].TableFragmentationRatio"));
			turnOffAutoResourceOptimizeListItem.setUserId(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.Data.TurnOffAutoResourceOptimizeList["+ i +"].UserId"));

			turnOffAutoResourceOptimizeList.add(turnOffAutoResourceOptimizeListItem);
		}
		data.setTurnOffAutoResourceOptimizeList(turnOffAutoResourceOptimizeList);

		List<HasEnableRuleButNotDasProListItem> hasEnableRuleButNotDasProList = new ArrayList<HasEnableRuleButNotDasProListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProList.Length"); i++) {
			HasEnableRuleButNotDasProListItem hasEnableRuleButNotDasProListItem = new HasEnableRuleButNotDasProListItem();
			hasEnableRuleButNotDasProListItem.setInstanceId(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProList["+ i +"].InstanceId"));
			hasEnableRuleButNotDasProListItem.setAutoDefragment(_ctx.booleanValue("GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProList["+ i +"].AutoDefragment"));
			hasEnableRuleButNotDasProListItem.setTableSpaceSize(_ctx.doubleValue("GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProList["+ i +"].TableSpaceSize"));
			hasEnableRuleButNotDasProListItem.setDasProOn(_ctx.booleanValue("GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProList["+ i +"].DasProOn"));
			hasEnableRuleButNotDasProListItem.setTableFragmentationRatio(_ctx.doubleValue("GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProList["+ i +"].TableFragmentationRatio"));
			hasEnableRuleButNotDasProListItem.setUserId(_ctx.stringValue("GetAutoResourceOptimizeRulesResponse.Data.HasEnableRuleButNotDasProList["+ i +"].UserId"));

			hasEnableRuleButNotDasProList.add(hasEnableRuleButNotDasProListItem);
		}
		data.setHasEnableRuleButNotDasProList(hasEnableRuleButNotDasProList);
		getAutoResourceOptimizeRulesResponse.setData(data);
	 
	 	return getAutoResourceOptimizeRulesResponse;
	}
}