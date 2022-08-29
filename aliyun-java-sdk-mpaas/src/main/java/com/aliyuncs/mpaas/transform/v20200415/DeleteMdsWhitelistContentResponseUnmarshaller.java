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

package com.aliyuncs.mpaas.transform.v20200415;

import com.aliyuncs.mpaas.model.v20200415.DeleteMdsWhitelistContentResponse;
import com.aliyuncs.mpaas.model.v20200415.DeleteMdsWhitelistContentResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMdsWhitelistContentResponseUnmarshaller {

	public static DeleteMdsWhitelistContentResponse unmarshall(DeleteMdsWhitelistContentResponse deleteMdsWhitelistContentResponse, UnmarshallerContext _ctx) {
		
		deleteMdsWhitelistContentResponse.setRequestId(_ctx.stringValue("DeleteMdsWhitelistContentResponse.RequestId"));
		deleteMdsWhitelistContentResponse.setResultMessage(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultMessage"));
		deleteMdsWhitelistContentResponse.setResultCode(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultContent.RequestId"));
		resultContent.setContent(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultContent.Content"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMdsWhitelistContentResponse.ResultContent.Success"));
		resultContent.setErrorCode(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultContent.ErrorCode"));
		resultContent.setResultMsg(_ctx.stringValue("DeleteMdsWhitelistContentResponse.ResultContent.ResultMsg"));
		deleteMdsWhitelistContentResponse.setResultContent(resultContent);
	 
	 	return deleteMdsWhitelistContentResponse;
	}
}