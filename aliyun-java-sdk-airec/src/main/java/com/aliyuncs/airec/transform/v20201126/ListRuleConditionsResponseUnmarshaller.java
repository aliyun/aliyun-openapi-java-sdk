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

import com.aliyuncs.airec.model.v20201126.ListRuleConditionsResponse;
import com.aliyuncs.airec.model.v20201126.ListRuleConditionsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleConditionsResponseUnmarshaller {

	public static ListRuleConditionsResponse unmarshall(ListRuleConditionsResponse listRuleConditionsResponse, UnmarshallerContext _ctx) {
		
		listRuleConditionsResponse.setRequestId(_ctx.stringValue("ListRuleConditionsResponse.requestId"));
		listRuleConditionsResponse.setCode(_ctx.stringValue("ListRuleConditionsResponse.code"));
		listRuleConditionsResponse.setMessage(_ctx.stringValue("ListRuleConditionsResponse.message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRuleConditionsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setSelectType(_ctx.stringValue("ListRuleConditionsResponse.result["+ i +"].selectType"));
			resultItem.setSelectValue(_ctx.stringValue("ListRuleConditionsResponse.result["+ i +"].selectValue"));
			resultItem.setSelectionOperation(_ctx.stringValue("ListRuleConditionsResponse.result["+ i +"].selectionOperation"));

			result.add(resultItem);
		}
		listRuleConditionsResponse.setResult(result);
	 
	 	return listRuleConditionsResponse;
	}
}