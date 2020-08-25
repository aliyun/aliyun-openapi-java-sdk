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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetreleasebyldResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetreleasebyldResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetreleasebyldResponseUnmarshaller {

	public static GetLinkeBahamutOpengetreleasebyldResponse unmarshall(GetLinkeBahamutOpengetreleasebyldResponse getLinkeBahamutOpengetreleasebyldResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetreleasebyldResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.RequestId"));
		getLinkeBahamutOpengetreleasebyldResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.ResultCode"));
		getLinkeBahamutOpengetreleasebyldResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.ResultMessage"));
		getLinkeBahamutOpengetreleasebyldResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.ErrorMessage"));
		getLinkeBahamutOpengetreleasebyldResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetreleasebyldResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.Message"));
		getLinkeBahamutOpengetreleasebyldResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetreleasebyldResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetreleasebyldResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetreleasebyldResponse.Success"));

		Result result = new Result();
		result.setAttachable(_ctx.booleanValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.Attachable"));
		result.setBetaRelease(_ctx.booleanValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.BetaRelease"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.Created"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.ExternalId"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.Name"));
		result.setReleaseDate(_ctx.longValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.ReleaseDate"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.Status"));
		result.setTenantId(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.TenantId"));
		result.setTicket(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.Ticket"));
		result.setType(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.Type"));

		List<String> managers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.Managers.Length"); i++) {
			managers.add(_ctx.stringValue("GetLinkeBahamutOpengetreleasebyldResponse.Result.Managers["+ i +"]"));
		}
		result.setManagers(managers);
		getLinkeBahamutOpengetreleasebyldResponse.setResult(result);
	 
	 	return getLinkeBahamutOpengetreleasebyldResponse;
	}
}