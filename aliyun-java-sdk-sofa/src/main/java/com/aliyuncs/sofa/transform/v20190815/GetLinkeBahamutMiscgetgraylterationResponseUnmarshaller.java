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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMiscgetgraylterationResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMiscgetgraylterationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutMiscgetgraylterationResponseUnmarshaller {

	public static GetLinkeBahamutMiscgetgraylterationResponse unmarshall(GetLinkeBahamutMiscgetgraylterationResponse getLinkeBahamutMiscgetgraylterationResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutMiscgetgraylterationResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.RequestId"));
		getLinkeBahamutMiscgetgraylterationResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.ResultCode"));
		getLinkeBahamutMiscgetgraylterationResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.ResultMessage"));
		getLinkeBahamutMiscgetgraylterationResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.ErrorMessage"));
		getLinkeBahamutMiscgetgraylterationResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.ErrorMsgParamsMap"));
		getLinkeBahamutMiscgetgraylterationResponse.setMessage(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.Message"));
		getLinkeBahamutMiscgetgraylterationResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutMiscgetgraylterationResponse.ResponseStatusCode"));
		getLinkeBahamutMiscgetgraylterationResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutMiscgetgraylterationResponse.Success"));

		Result result = new Result();
		result.setCreateTime(_ctx.longValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.CreateTime"));
		result.setCreator(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.Creator"));
		result.setFinished(_ctx.booleanValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.Finished"));
		result.setId(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.Name"));
		result.setReleaseId(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.ReleaseId"));
		result.setReleaseTime(_ctx.longValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.ReleaseTime"));
		result.setStage(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.Stage"));
		result.setType(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.Type"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);
		getLinkeBahamutMiscgetgraylterationResponse.setResult(result);
	 
	 	return getLinkeBahamutMiscgetgraylterationResponse;
	}
}