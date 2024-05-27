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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.DeleteCubecardWhitelistContentResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteCubecardWhitelistContentResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.DeleteCubecardWhitelistContentResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCubecardWhitelistContentResponseUnmarshaller {

	public static DeleteCubecardWhitelistContentResponse unmarshall(DeleteCubecardWhitelistContentResponse deleteCubecardWhitelistContentResponse, UnmarshallerContext _ctx) {
		
		deleteCubecardWhitelistContentResponse.setRequestId(_ctx.stringValue("DeleteCubecardWhitelistContentResponse.RequestId"));
		deleteCubecardWhitelistContentResponse.setResultMessage(_ctx.stringValue("DeleteCubecardWhitelistContentResponse.ResultMessage"));
		deleteCubecardWhitelistContentResponse.setResultCode(_ctx.stringValue("DeleteCubecardWhitelistContentResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("DeleteCubecardWhitelistContentResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("DeleteCubecardWhitelistContentResponse.ResultContent.Data.Content"));
		data.setErrorCode(_ctx.stringValue("DeleteCubecardWhitelistContentResponse.ResultContent.Data.ErrorCode"));
		data.setSuccess(_ctx.booleanValue("DeleteCubecardWhitelistContentResponse.ResultContent.Data.Success"));
		data.setResultMsg(_ctx.stringValue("DeleteCubecardWhitelistContentResponse.ResultContent.Data.ResultMsg"));
		resultContent.setData(data);
		deleteCubecardWhitelistContentResponse.setResultContent(resultContent);
	 
	 	return deleteCubecardWhitelistContentResponse;
	}
}