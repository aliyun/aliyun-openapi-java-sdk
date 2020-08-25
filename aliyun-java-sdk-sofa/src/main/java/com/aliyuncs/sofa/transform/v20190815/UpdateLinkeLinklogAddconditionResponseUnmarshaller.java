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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogAddconditionResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogAddconditionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinklogAddconditionResponseUnmarshaller {

	public static UpdateLinkeLinklogAddconditionResponse unmarshall(UpdateLinkeLinklogAddconditionResponse updateLinkeLinklogAddconditionResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinklogAddconditionResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.RequestId"));
		updateLinkeLinklogAddconditionResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.ResultCode"));
		updateLinkeLinklogAddconditionResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.ResultMessage"));
		updateLinkeLinklogAddconditionResponse.setErrorMsg(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.ErrorMsg"));
		updateLinkeLinklogAddconditionResponse.setResponseContentRange(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.ResponseContentRange"));
		updateLinkeLinklogAddconditionResponse.setResponseContentType(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.ResponseContentType"));
		updateLinkeLinklogAddconditionResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinklogAddconditionResponse.ResponseStatusCode"));
		updateLinkeLinklogAddconditionResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinklogAddconditionResponse.Success"));

		Result result = new Result();
		result.setCompiled(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.Result.Compiled"));
		result.setConditionId(_ctx.longValue("UpdateLinkeLinklogAddconditionResponse.Result.ConditionId"));
		result.setId(_ctx.longValue("UpdateLinkeLinklogAddconditionResponse.Result.Id"));
		result.setIndicationId(_ctx.longValue("UpdateLinkeLinklogAddconditionResponse.Result.IndicationId"));
		result.setLogSample(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.Result.LogSample"));
		result.setPattern(_ctx.stringValue("UpdateLinkeLinklogAddconditionResponse.Result.Pattern"));
		updateLinkeLinklogAddconditionResponse.setResult(result);
	 
	 	return updateLinkeLinklogAddconditionResponse;
	}
}