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

import com.aliyuncs.das.model.v20200116.GetRunningSqlConcurrencyControlRulesResponse;
import com.aliyuncs.das.model.v20200116.GetRunningSqlConcurrencyControlRulesResponse.Data;
import com.aliyuncs.das.model.v20200116.GetRunningSqlConcurrencyControlRulesResponse.Data.RunningRules;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRunningSqlConcurrencyControlRulesResponseUnmarshaller {

	public static GetRunningSqlConcurrencyControlRulesResponse unmarshall(GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRulesResponse, UnmarshallerContext _ctx) {
		
		getRunningSqlConcurrencyControlRulesResponse.setRequestId(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.RequestId"));
		getRunningSqlConcurrencyControlRulesResponse.setCode(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Code"));
		getRunningSqlConcurrencyControlRulesResponse.setMessage(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Message"));
		getRunningSqlConcurrencyControlRulesResponse.setSuccess(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetRunningSqlConcurrencyControlRulesResponse.Data.Total"));

		List<RunningRules> list = new ArrayList<RunningRules>();
		for (int i = 0; i < _ctx.lengthValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List.Length"); i++) {
			RunningRules runningRules = new RunningRules();
			runningRules.setItemId(_ctx.longValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].ItemId"));
			runningRules.setSqlType(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].SqlType"));
			runningRules.setInstanceId(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].InstanceId"));
			runningRules.setSqlKeywords(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].SqlKeywords"));
			runningRules.setStartTime(_ctx.longValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].StartTime"));
			runningRules.setKeywordsHash(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].KeywordsHash"));
			runningRules.setConcurrencyControlTime(_ctx.longValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].ConcurrencyControlTime"));
			runningRules.setUserId(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].UserId"));
			runningRules.setMaxConcurrency(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].MaxConcurrency"));
			runningRules.setStatus(_ctx.stringValue("GetRunningSqlConcurrencyControlRulesResponse.Data.List["+ i +"].Status"));

			list.add(runningRules);
		}
		data.setList(list);
		getRunningSqlConcurrencyControlRulesResponse.setData(data);
	 
	 	return getRunningSqlConcurrencyControlRulesResponse;
	}
}