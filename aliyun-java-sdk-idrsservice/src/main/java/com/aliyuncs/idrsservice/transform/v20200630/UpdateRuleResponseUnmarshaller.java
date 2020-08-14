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

import com.aliyuncs.idrsservice.model.v20200630.UpdateRuleResponse;
import com.aliyuncs.idrsservice.model.v20200630.UpdateRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRuleResponseUnmarshaller {

	public static UpdateRuleResponse unmarshall(UpdateRuleResponse updateRuleResponse, UnmarshallerContext _ctx) {
		
		updateRuleResponse.setRequestId(_ctx.stringValue("UpdateRuleResponse.RequestId"));
		updateRuleResponse.setCode(_ctx.stringValue("UpdateRuleResponse.Code"));
		updateRuleResponse.setMessage(_ctx.stringValue("UpdateRuleResponse.Message"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("UpdateRuleResponse.Data.Content"));
		data.setCreatedAt(_ctx.stringValue("UpdateRuleResponse.Data.CreatedAt"));
		data.setId(_ctx.stringValue("UpdateRuleResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateRuleResponse.Data.Name"));
		updateRuleResponse.setData(data);
	 
	 	return updateRuleResponse;
	}
}