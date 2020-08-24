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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.GetAIActionResponse;
import com.aliyuncs.linkvisual.model.v20180120.GetAIActionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIActionResponseUnmarshaller {

	public static GetAIActionResponse unmarshall(GetAIActionResponse getAIActionResponse, UnmarshallerContext _ctx) {
		
		getAIActionResponse.setRequestId(_ctx.stringValue("GetAIActionResponse.RequestId"));
		getAIActionResponse.setSuccess(_ctx.booleanValue("GetAIActionResponse.Success"));
		getAIActionResponse.setErrorMessage(_ctx.stringValue("GetAIActionResponse.ErrorMessage"));
		getAIActionResponse.setCode(_ctx.stringValue("GetAIActionResponse.Code"));

		Data data = new Data();
		data.setActionId(_ctx.stringValue("GetAIActionResponse.Data.ActionId"));
		data.setPlanId(_ctx.stringValue("GetAIActionResponse.Data.PlanId"));
		data.setAction(_ctx.stringValue("GetAIActionResponse.Data.Action"));
		data.setActionTemplateId(_ctx.stringValue("GetAIActionResponse.Data.ActionTemplateId"));
		data.setActionIndex(_ctx.integerValue("GetAIActionResponse.Data.ActionIndex"));
		data.setAlog(_ctx.stringValue("GetAIActionResponse.Data.Alog"));
		data.setAlgoConfig(_ctx.stringValue("GetAIActionResponse.Data.AlgoConfig"));
		data.setActionConfig(_ctx.stringValue("GetAIActionResponse.Data.ActionConfig"));
		getAIActionResponse.setData(data);
	 
	 	return getAIActionResponse;
	}
}