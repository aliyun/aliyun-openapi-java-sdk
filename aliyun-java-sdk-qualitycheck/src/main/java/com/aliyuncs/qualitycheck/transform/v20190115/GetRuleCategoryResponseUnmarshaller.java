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

import com.aliyuncs.qualitycheck.model.v20190115.GetRuleCategoryResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleCategoryResponse.RuleCountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleCategoryResponseUnmarshaller {

	public static GetRuleCategoryResponse unmarshall(GetRuleCategoryResponse getRuleCategoryResponse, UnmarshallerContext _ctx) {
		
		getRuleCategoryResponse.setRequestId(_ctx.stringValue("GetRuleCategoryResponse.RequestId"));
		getRuleCategoryResponse.setSuccess(_ctx.booleanValue("GetRuleCategoryResponse.Success"));
		getRuleCategoryResponse.setCode(_ctx.stringValue("GetRuleCategoryResponse.Code"));
		getRuleCategoryResponse.setMessage(_ctx.stringValue("GetRuleCategoryResponse.Message"));

		List<RuleCountInfo> data = new ArrayList<RuleCountInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetRuleCategoryResponse.Data.Length"); i++) {
			RuleCountInfo ruleCountInfo = new RuleCountInfo();
			ruleCountInfo.setType(_ctx.integerValue("GetRuleCategoryResponse.Data["+ i +"].Type"));
			ruleCountInfo.setTypeName(_ctx.stringValue("GetRuleCategoryResponse.Data["+ i +"].TypeName"));
			ruleCountInfo.setSelect(_ctx.booleanValue("GetRuleCategoryResponse.Data["+ i +"].Select"));

			data.add(ruleCountInfo);
		}
		getRuleCategoryResponse.setData(data);
	 
	 	return getRuleCategoryResponse;
	}
}