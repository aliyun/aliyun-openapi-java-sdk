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

import com.aliyuncs.das.model.v20200116.GetSqlConcurrencyControlRulesHistoryResponse;
import com.aliyuncs.das.model.v20200116.GetSqlConcurrencyControlRulesHistoryResponse.Data;
import com.aliyuncs.das.model.v20200116.GetSqlConcurrencyControlRulesHistoryResponse.Data.Rules;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSqlConcurrencyControlRulesHistoryResponseUnmarshaller {

	public static GetSqlConcurrencyControlRulesHistoryResponse unmarshall(GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistoryResponse, UnmarshallerContext _ctx) {
		
		getSqlConcurrencyControlRulesHistoryResponse.setRequestId(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.RequestId"));
		getSqlConcurrencyControlRulesHistoryResponse.setCode(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Code"));
		getSqlConcurrencyControlRulesHistoryResponse.setMessage(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Message"));
		getSqlConcurrencyControlRulesHistoryResponse.setSuccess(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.Total"));

		List<Rules> list = new ArrayList<Rules>();
		for (int i = 0; i < _ctx.lengthValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List.Length"); i++) {
			Rules rules = new Rules();
			rules.setItemId(_ctx.longValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].ItemId"));
			rules.setSqlType(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].SqlType"));
			rules.setInstanceId(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].InstanceId"));
			rules.setSqlKeywords(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].SqlKeywords"));
			rules.setStartTime(_ctx.longValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].StartTime"));
			rules.setKeywordsHash(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].KeywordsHash"));
			rules.setConcurrencyControlTime(_ctx.longValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].ConcurrencyControlTime"));
			rules.setUserId(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].UserId"));
			rules.setMaxConcurrency(_ctx.longValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].MaxConcurrency"));
			rules.setStatus(_ctx.stringValue("GetSqlConcurrencyControlRulesHistoryResponse.Data.List["+ i +"].Status"));

			list.add(rules);
		}
		data.setList(list);
		getSqlConcurrencyControlRulesHistoryResponse.setData(data);
	 
	 	return getSqlConcurrencyControlRulesHistoryResponse;
	}
}