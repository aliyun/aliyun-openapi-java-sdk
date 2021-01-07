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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListRulesResponse;
import com.aliyuncs.airec.model.v20201126.ListRulesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRulesResponseUnmarshaller {

	public static ListRulesResponse unmarshall(ListRulesResponse listRulesResponse, UnmarshallerContext _ctx) {
		
		listRulesResponse.setRequestId(_ctx.stringValue("ListRulesResponse.requestId"));
		listRulesResponse.setCode(_ctx.stringValue("ListRulesResponse.code"));
		listRulesResponse.setMessage(_ctx.stringValue("ListRulesResponse.message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRulesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setGmtCreate(_ctx.stringValue("ListRulesResponse.result["+ i +"].gmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListRulesResponse.result["+ i +"].gmtModified"));
			resultItem.setRuleId(_ctx.stringValue("ListRulesResponse.result["+ i +"].ruleId"));
			resultItem.setStatus(_ctx.stringValue("ListRulesResponse.result["+ i +"].status"));

			result.add(resultItem);
		}
		listRulesResponse.setResult(result);
	 
	 	return listRulesResponse;
	}
}