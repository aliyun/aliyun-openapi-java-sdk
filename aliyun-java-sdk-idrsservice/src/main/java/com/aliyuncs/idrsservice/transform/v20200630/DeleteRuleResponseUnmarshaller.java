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

import com.aliyuncs.idrsservice.model.v20200630.DeleteRuleResponse;
import com.aliyuncs.idrsservice.model.v20200630.DeleteRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRuleResponseUnmarshaller {

	public static DeleteRuleResponse unmarshall(DeleteRuleResponse deleteRuleResponse, UnmarshallerContext _ctx) {
		
		deleteRuleResponse.setRequestId(_ctx.stringValue("DeleteRuleResponse.RequestId"));
		deleteRuleResponse.setCode(_ctx.stringValue("DeleteRuleResponse.Code"));
		deleteRuleResponse.setMessage(_ctx.stringValue("DeleteRuleResponse.Message"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("DeleteRuleResponse.Data.Content"));
		data.setCreatedAt(_ctx.stringValue("DeleteRuleResponse.Data.CreatedAt"));
		data.setId(_ctx.stringValue("DeleteRuleResponse.Data.Id"));
		data.setName(_ctx.stringValue("DeleteRuleResponse.Data.Name"));
		deleteRuleResponse.setData(data);
	 
	 	return deleteRuleResponse;
	}
}