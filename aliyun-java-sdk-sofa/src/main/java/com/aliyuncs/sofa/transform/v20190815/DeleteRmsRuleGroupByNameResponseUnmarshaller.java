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

import com.aliyuncs.sofa.model.v20190815.DeleteRmsRuleGroupByNameResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsRuleGroupByNameResponse.Response;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsRuleGroupByNameResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRmsRuleGroupByNameResponseUnmarshaller {

	public static DeleteRmsRuleGroupByNameResponse unmarshall(DeleteRmsRuleGroupByNameResponse deleteRmsRuleGroupByNameResponse, UnmarshallerContext _ctx) {
		
		deleteRmsRuleGroupByNameResponse.setRequestId(_ctx.stringValue("DeleteRmsRuleGroupByNameResponse.RequestId"));
		deleteRmsRuleGroupByNameResponse.setResultCode(_ctx.stringValue("DeleteRmsRuleGroupByNameResponse.ResultCode"));
		deleteRmsRuleGroupByNameResponse.setResultMessage(_ctx.stringValue("DeleteRmsRuleGroupByNameResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("DeleteRmsRuleGroupByNameResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("DeleteRmsRuleGroupByNameResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("DeleteRmsRuleGroupByNameResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("DeleteRmsRuleGroupByNameResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("DeleteRmsRuleGroupByNameResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("DeleteRmsRuleGroupByNameResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("DeleteRmsRuleGroupByNameResponse.Response.Entity.Success"));
		response.setEntity(entity);
		deleteRmsRuleGroupByNameResponse.setResponse(response);
	 
	 	return deleteRmsRuleGroupByNameResponse;
	}
}