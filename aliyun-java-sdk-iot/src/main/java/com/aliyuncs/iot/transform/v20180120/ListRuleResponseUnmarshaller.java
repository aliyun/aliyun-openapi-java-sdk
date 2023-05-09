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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListRuleResponse;
import com.aliyuncs.iot.model.v20180120.ListRuleResponse.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleResponseUnmarshaller {

	public static ListRuleResponse unmarshall(ListRuleResponse listRuleResponse, UnmarshallerContext _ctx) {
		
		listRuleResponse.setRequestId(_ctx.stringValue("ListRuleResponse.RequestId"));
		listRuleResponse.setErrorMessage(_ctx.stringValue("ListRuleResponse.ErrorMessage"));
		listRuleResponse.setSuccess(_ctx.booleanValue("ListRuleResponse.Success"));
		listRuleResponse.setCode(_ctx.stringValue("ListRuleResponse.Code"));
		listRuleResponse.setPageSize(_ctx.integerValue("ListRuleResponse.PageSize"));
		listRuleResponse.setTotal(_ctx.integerValue("ListRuleResponse.Total"));
		listRuleResponse.setPage(_ctx.integerValue("ListRuleResponse.Page"));

		List<RuleInfo> data = new ArrayList<RuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListRuleResponse.Data.Length"); i++) {
			RuleInfo ruleInfo = new RuleInfo();
			ruleInfo.setModified(_ctx.stringValue("ListRuleResponse.Data["+ i +"].Modified"));
			ruleInfo.setStatus(_ctx.stringValue("ListRuleResponse.Data["+ i +"].Status"));
			ruleInfo.setDataType(_ctx.stringValue("ListRuleResponse.Data["+ i +"].DataType"));
			ruleInfo.setSelect(_ctx.stringValue("ListRuleResponse.Data["+ i +"].Select"));
			ruleInfo.setUtcCreated(_ctx.stringValue("ListRuleResponse.Data["+ i +"].UtcCreated"));
			ruleInfo.setCreateUserId(_ctx.longValue("ListRuleResponse.Data["+ i +"].CreateUserId"));
			ruleInfo.setWhere(_ctx.stringValue("ListRuleResponse.Data["+ i +"].Where"));
			ruleInfo.setProductKey(_ctx.stringValue("ListRuleResponse.Data["+ i +"].ProductKey"));
			ruleInfo.setUtcModified(_ctx.stringValue("ListRuleResponse.Data["+ i +"].UtcModified"));
			ruleInfo.setTopic(_ctx.stringValue("ListRuleResponse.Data["+ i +"].Topic"));
			ruleInfo.setShortTopic(_ctx.stringValue("ListRuleResponse.Data["+ i +"].ShortTopic"));
			ruleInfo.setRuleDesc(_ctx.stringValue("ListRuleResponse.Data["+ i +"].RuleDesc"));
			ruleInfo.setName(_ctx.stringValue("ListRuleResponse.Data["+ i +"].Name"));
			ruleInfo.setCreated(_ctx.stringValue("ListRuleResponse.Data["+ i +"].Created"));
			ruleInfo.setId(_ctx.longValue("ListRuleResponse.Data["+ i +"].Id"));

			data.add(ruleInfo);
		}
		listRuleResponse.setData(data);
	 
	 	return listRuleResponse;
	}
}