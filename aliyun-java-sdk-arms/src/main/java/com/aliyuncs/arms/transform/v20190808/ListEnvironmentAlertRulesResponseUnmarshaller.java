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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListEnvironmentAlertRulesResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAlertRulesResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAlertRulesResponse.Data.RulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentAlertRulesResponseUnmarshaller {

	public static ListEnvironmentAlertRulesResponse unmarshall(ListEnvironmentAlertRulesResponse listEnvironmentAlertRulesResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentAlertRulesResponse.setRequestId(_ctx.stringValue("ListEnvironmentAlertRulesResponse.RequestId"));
		listEnvironmentAlertRulesResponse.setCode(_ctx.integerValue("ListEnvironmentAlertRulesResponse.Code"));
		listEnvironmentAlertRulesResponse.setMessage(_ctx.stringValue("ListEnvironmentAlertRulesResponse.Message"));
		listEnvironmentAlertRulesResponse.setSuccess(_ctx.booleanValue("ListEnvironmentAlertRulesResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListEnvironmentAlertRulesResponse.Data.Total"));

		List<String> groups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentAlertRulesResponse.Data.Groups.Length"); i++) {
			groups.add(_ctx.stringValue("ListEnvironmentAlertRulesResponse.Data.Groups["+ i +"]"));
		}
		data.setGroups(groups);

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentAlertRulesResponse.Data.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setAlertId(_ctx.longValue("ListEnvironmentAlertRulesResponse.Data.Rules["+ i +"].AlertId"));
			rulesItem.setName(_ctx.stringValue("ListEnvironmentAlertRulesResponse.Data.Rules["+ i +"].Name"));

			rules.add(rulesItem);
		}
		data.setRules(rules);
		listEnvironmentAlertRulesResponse.setData(data);
	 
	 	return listEnvironmentAlertRulesResponse;
	}
}