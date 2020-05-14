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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListRulesResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListRulesResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRulesResponseUnmarshaller {

	public static ListRulesResponse unmarshall(ListRulesResponse listRulesResponse, UnmarshallerContext _ctx) {
		
		listRulesResponse.setRequestId(_ctx.stringValue("ListRulesResponse.RequestId"));
		listRulesResponse.setSuccess(_ctx.booleanValue("ListRulesResponse.Success"));
		listRulesResponse.setCode(_ctx.stringValue("ListRulesResponse.Code"));
		listRulesResponse.setMessage(_ctx.stringValue("ListRulesResponse.Message"));
		listRulesResponse.setCount(_ctx.integerValue("ListRulesResponse.Count"));
		listRulesResponse.setPageSize(_ctx.integerValue("ListRulesResponse.PageSize"));
		listRulesResponse.setPageNumber(_ctx.integerValue("ListRulesResponse.PageNumber"));

		List<Rule> data = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListRulesResponse.Data.Length"); i++) {
			Rule rule = new Rule();
			rule.setName(_ctx.stringValue("ListRulesResponse.Data["+ i +"].Name"));
			rule.setType(_ctx.integerValue("ListRulesResponse.Data["+ i +"].Type"));
			rule.setComments(_ctx.stringValue("ListRulesResponse.Data["+ i +"].Comments"));
			rule.setCreateTime(_ctx.stringValue("ListRulesResponse.Data["+ i +"].CreateTime"));
			rule.setTypeName(_ctx.stringValue("ListRulesResponse.Data["+ i +"].TypeName"));
			rule.setRuleType(_ctx.integerValue("ListRulesResponse.Data["+ i +"].RuleType"));
			rule.setRid(_ctx.longValue("ListRulesResponse.Data["+ i +"].Rid"));

			List<String> businessCategoryNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRulesResponse.Data["+ i +"].BusinessCategoryNameList.Length"); j++) {
				businessCategoryNameList.add(_ctx.stringValue("ListRulesResponse.Data["+ i +"].BusinessCategoryNameList["+ j +"]"));
			}
			rule.setBusinessCategoryNameList(businessCategoryNameList);

			data.add(rule);
		}
		listRulesResponse.setData(data);
	 
	 	return listRulesResponse;
	}
}