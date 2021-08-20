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

import com.aliyuncs.mpaas.model.v20201028.DeleteMdsWhitelistContentResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMdsWhitelistContentResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.DeleteMdsWhitelistContentResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMdsWhitelistContentResponseUnmarshaller {

	public static DeleteMdsWhitelistContentResponse unmarshall(DeleteMdsWhitelistContentResponse deleteMdsWhitelistContentResponse, UnmarshallerContext _ctx) {
		
		deleteMdsWhitelistContentResponse.setRequestId(_ctx.stringValue("DeleteMdsWhitelistContentResponse.RequestId"));
		deleteMdsWhitelistContentResponse.setResultCode(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultCode"));
		deleteMdsWhitelistContentResponse.setResultMessage(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setErrorCode(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultContent.Data.ErrorCode"));
		data.setResultMsg(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultContent.Data.ResultMsg"));
		data.setSuccess(_ctx.booleanValue("DeleteMdsWhitelistContentResponse.ResultContent.Data.Success"));
		data.setContent(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultContent.Data.Content"));
		resultContent.setData(data);
		deleteMdsWhitelistContentResponse.setResultContent(resultContent);
	 
	 	return deleteMdsWhitelistContentResponse;
	}
}