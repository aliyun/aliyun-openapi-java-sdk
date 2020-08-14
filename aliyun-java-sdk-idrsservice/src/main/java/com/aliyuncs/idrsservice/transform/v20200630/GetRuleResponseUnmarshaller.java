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

package com.aliyuncs.idrsservice.transform.v20200630;

import com.aliyuncs.idrsservice.model.v20200630.GetRuleResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleResponseUnmarshaller {

	public static GetRuleResponse unmarshall(GetRuleResponse getRuleResponse, UnmarshallerContext _ctx) {
		
		getRuleResponse.setRequestId(_ctx.stringValue("GetRuleResponse.RequestId"));
		getRuleResponse.setCode(_ctx.stringValue("GetRuleResponse.Code"));
		getRuleResponse.setMessage(_ctx.stringValue("GetRuleResponse.Message"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("GetRuleResponse.Data.Content"));
		data.setCreatedAt(_ctx.stringValue("GetRuleResponse.Data.CreatedAt"));
		data.setId(_ctx.stringValue("GetRuleResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetRuleResponse.Data.Name"));
		getRuleResponse.setData(data);
	 
	 	return getRuleResponse;
	}
}