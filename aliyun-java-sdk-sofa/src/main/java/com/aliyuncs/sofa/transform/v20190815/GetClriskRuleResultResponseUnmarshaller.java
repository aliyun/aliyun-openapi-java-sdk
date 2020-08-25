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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetClriskRuleResultResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskRuleResultResponse.ValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskRuleResultResponseUnmarshaller {

	public static GetClriskRuleResultResponse unmarshall(GetClriskRuleResultResponse getClriskRuleResultResponse, UnmarshallerContext _ctx) {
		
		getClriskRuleResultResponse.setRequestId(_ctx.stringValue("GetClriskRuleResultResponse.RequestId"));
		getClriskRuleResultResponse.setResultCode(_ctx.stringValue("GetClriskRuleResultResponse.ResultCode"));
		getClriskRuleResultResponse.setResultMessage(_ctx.stringValue("GetClriskRuleResultResponse.ResultMessage"));
		getClriskRuleResultResponse.setResult(_ctx.stringValue("GetClriskRuleResultResponse.Result"));
		getClriskRuleResultResponse.setStatus(_ctx.stringValue("GetClriskRuleResultResponse.Status"));

		List<String> heads = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskRuleResultResponse.Heads.Length"); i++) {
			heads.add(_ctx.stringValue("GetClriskRuleResultResponse.Heads["+ i +"]"));
		}
		getClriskRuleResultResponse.setHeads(heads);

		List<ValuesItem> values = new ArrayList<ValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskRuleResultResponse.Values.Length"); i++) {
			ValuesItem valuesItem = new ValuesItem();

			List<String> values1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetClriskRuleResultResponse.Values["+ i +"].Values.Length"); j++) {
				values1.add(_ctx.stringValue("GetClriskRuleResultResponse.Values["+ i +"].Values["+ j +"]"));
			}
			valuesItem.setValues1(values1);

			values.add(valuesItem);
		}
		getClriskRuleResultResponse.setValues(values);
	 
	 	return getClriskRuleResultResponse;
	}
}