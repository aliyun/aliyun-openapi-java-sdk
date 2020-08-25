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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalprojectResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalprojectResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternalprojectResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternalprojectResponse unmarshall(GetLinkeBahamutAoneinternalprojectResponse getLinkeBahamutAoneinternalprojectResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternalprojectResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.RequestId"));
		getLinkeBahamutAoneinternalprojectResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.ResultCode"));
		getLinkeBahamutAoneinternalprojectResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.ResultMessage"));
		getLinkeBahamutAoneinternalprojectResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.ErrorMessage"));
		getLinkeBahamutAoneinternalprojectResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternalprojectResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Message"));
		getLinkeBahamutAoneinternalprojectResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternalprojectResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternalprojectResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternalprojectResponse.Success"));

		Result result = new Result();
		result.setCreator(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Creator"));
		result.setFullName(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.FullName"));
		result.setId(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Id"));
		result.setIdPath(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.IdPath"));
		result.setLink(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Link"));
		result.setMode(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Mode"));
		result.setName(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Name"));
		result.setParentId(_ctx.longValue("GetLinkeBahamutAoneinternalprojectResponse.Result.ParentId"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Status"));
		result.setType(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Type"));

		List<String> admins = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Admins.Length"); i++) {
			admins.add(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectResponse.Result.Admins["+ i +"]"));
		}
		result.setAdmins(admins);
		getLinkeBahamutAoneinternalprojectResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternalprojectResponse;
	}
}