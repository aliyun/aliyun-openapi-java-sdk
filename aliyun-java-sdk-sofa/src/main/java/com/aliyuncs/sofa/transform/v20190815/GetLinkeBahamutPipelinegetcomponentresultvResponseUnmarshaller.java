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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetcomponentresultvResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetcomponentresultvResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinegetcomponentresultvResponseUnmarshaller {

	public static GetLinkeBahamutPipelinegetcomponentresultvResponse unmarshall(GetLinkeBahamutPipelinegetcomponentresultvResponse getLinkeBahamutPipelinegetcomponentresultvResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinegetcomponentresultvResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.RequestId"));
		getLinkeBahamutPipelinegetcomponentresultvResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.ResultCode"));
		getLinkeBahamutPipelinegetcomponentresultvResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.ResultMessage"));
		getLinkeBahamutPipelinegetcomponentresultvResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.ErrorMessage"));
		getLinkeBahamutPipelinegetcomponentresultvResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinegetcomponentresultvResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Message"));
		getLinkeBahamutPipelinegetcomponentresultvResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinegetcomponentresultvResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Success"));

		Result result = new Result();
		result.setData(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.Data"));
		result.setDisplayName(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.DisplayName"));
		result.setErrorMsg(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.ErrorMsg"));
		result.setExecutingData(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.ExecutingData"));
		result.setFailedData(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.FailedData"));
		result.setHtml(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.Html"));
		result.setId(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.Name"));
		result.setPassedData(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.PassedData"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.Status"));
		result.setType(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.Type"));
		result.setWarnData(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.WarnData"));

		List<String> outPutList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.OutPutList.Length"); i++) {
			outPutList.add(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultvResponse.Result.OutPutList["+ i +"]"));
		}
		result.setOutPutList(outPutList);
		getLinkeBahamutPipelinegetcomponentresultvResponse.setResult(result);
	 
	 	return getLinkeBahamutPipelinegetcomponentresultvResponse;
	}
}