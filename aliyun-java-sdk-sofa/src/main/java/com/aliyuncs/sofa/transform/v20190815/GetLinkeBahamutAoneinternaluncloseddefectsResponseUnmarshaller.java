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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaluncloseddefectsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaluncloseddefectsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternaluncloseddefectsResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternaluncloseddefectsResponse unmarshall(GetLinkeBahamutAoneinternaluncloseddefectsResponse getLinkeBahamutAoneinternaluncloseddefectsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.RequestId"));
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.ResultCode"));
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.ResultMessage"));
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.ErrorMessage"));
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.Message"));
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.Result.Count"));
		result.setPage(_ctx.longValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.Result.Page"));
		result.setPageSize(_ctx.longValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.Result.PageSize"));

		List<String> datas = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.Result.Datas.Length"); i++) {
			datas.add(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectsResponse.Result.Datas["+ i +"]"));
		}
		result.setDatas(datas);
		getLinkeBahamutAoneinternaluncloseddefectsResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternaluncloseddefectsResponse;
	}
}