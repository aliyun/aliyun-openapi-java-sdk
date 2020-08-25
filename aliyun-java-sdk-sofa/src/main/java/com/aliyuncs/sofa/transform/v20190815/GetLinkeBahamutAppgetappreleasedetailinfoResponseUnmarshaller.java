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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppgetappreleasedetailinfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppgetappreleasedetailinfoResponseUnmarshaller {

	public static GetLinkeBahamutAppgetappreleasedetailinfoResponse unmarshall(GetLinkeBahamutAppgetappreleasedetailinfoResponse getLinkeBahamutAppgetappreleasedetailinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.RequestId"));
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.ResultCode"));
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.ResultMessage"));
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.ErrorMessage"));
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Message"));
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.ResponseStatusCode"));
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.AppName"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.LastModified"));
		result.setNeedMerge(_ctx.booleanValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.NeedMerge"));
		result.setReleaseExternalId(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.ReleaseExternalId"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.Status"));

		List<String> activeStages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.ActiveStages.Length"); i++) {
			activeStages.add(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.ActiveStages["+ i +"]"));
		}
		result.setActiveStages(activeStages);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("GetLinkeBahamutAppgetappreleasedetailinfoResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		getLinkeBahamutAppgetappreleasedetailinfoResponse.setResult(result);
	 
	 	return getLinkeBahamutAppgetappreleasedetailinfoResponse;
	}
}