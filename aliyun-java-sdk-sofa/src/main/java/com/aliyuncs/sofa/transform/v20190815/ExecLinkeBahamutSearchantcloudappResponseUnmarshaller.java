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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutSearchantcloudappResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutSearchantcloudappResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeBahamutSearchantcloudappResponseUnmarshaller {

	public static ExecLinkeBahamutSearchantcloudappResponse unmarshall(ExecLinkeBahamutSearchantcloudappResponse execLinkeBahamutSearchantcloudappResponse, UnmarshallerContext _ctx) {
		
		execLinkeBahamutSearchantcloudappResponse.setRequestId(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.RequestId"));
		execLinkeBahamutSearchantcloudappResponse.setResultCode(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.ResultCode"));
		execLinkeBahamutSearchantcloudappResponse.setResultMessage(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.ResultMessage"));
		execLinkeBahamutSearchantcloudappResponse.setErrorMessage(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.ErrorMessage"));
		execLinkeBahamutSearchantcloudappResponse.setErrorMsgParamsMap(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.ErrorMsgParamsMap"));
		execLinkeBahamutSearchantcloudappResponse.setMessage(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Message"));
		execLinkeBahamutSearchantcloudappResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeBahamutSearchantcloudappResponse.ResponseStatusCode"));
		execLinkeBahamutSearchantcloudappResponse.setSuccess(_ctx.booleanValue("ExecLinkeBahamutSearchantcloudappResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeBahamutSearchantcloudappResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAlias(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].Alias"));
			resultItem.setApplicationName(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].ApplicationName"));
			resultItem.setAppGroupName(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].AppGroupName"));
			resultItem.setAppLevel(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].AppLevel"));
			resultItem.setBuildpackName(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].BuildpackName"));
			resultItem.setBuildpackVersion(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].BuildpackVersion"));
			resultItem.setCreationTime(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].CreationTime"));
			resultItem.setDescription(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].Description"));
			resultItem.setHasImported(_ctx.booleanValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].HasImported"));
			resultItem.setOwnerLoginName(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].OwnerLoginName"));
			resultItem.setStatus(_ctx.stringValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].Status"));
			resultItem.setTechV2(_ctx.booleanValue("ExecLinkeBahamutSearchantcloudappResponse.Result["+ i +"].TechV2"));

			result.add(resultItem);
		}
		execLinkeBahamutSearchantcloudappResponse.setResult(result);
	 
	 	return execLinkeBahamutSearchantcloudappResponse;
	}
}