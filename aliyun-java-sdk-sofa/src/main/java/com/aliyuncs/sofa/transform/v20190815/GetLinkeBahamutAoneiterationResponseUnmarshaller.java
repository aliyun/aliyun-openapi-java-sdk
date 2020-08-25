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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneiterationResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneiterationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneiterationResponseUnmarshaller {

	public static GetLinkeBahamutAoneiterationResponse unmarshall(GetLinkeBahamutAoneiterationResponse getLinkeBahamutAoneiterationResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneiterationResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.RequestId"));
		getLinkeBahamutAoneiterationResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.ResultCode"));
		getLinkeBahamutAoneiterationResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.ResultMessage"));
		getLinkeBahamutAoneiterationResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.ErrorMessage"));
		getLinkeBahamutAoneiterationResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneiterationResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Message"));
		getLinkeBahamutAoneiterationResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneiterationResponse.ResponseStatusCode"));
		getLinkeBahamutAoneiterationResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneiterationResponse.Success"));

		Result result = new Result();
		result.setCreator(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Creator"));
		result.setFinished(_ctx.booleanValue("GetLinkeBahamutAoneiterationResponse.Result.Finished"));
		result.setId(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Id"));
		result.setLink(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Link"));
		result.setName(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Name"));
		result.setNewLink(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.NewLink"));
		result.setReleaseId(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.ReleaseId"));
		result.setTenant(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Tenant"));
		result.setType(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Type"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneiterationResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneiterationResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> quality = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneiterationResponse.Result.Quality.Length"); i++) {
			quality.add(_ctx.stringValue("GetLinkeBahamutAoneiterationResponse.Result.Quality["+ i +"]"));
		}
		result.setQuality(quality);
		getLinkeBahamutAoneiterationResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneiterationResponse;
	}
}