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

import com.aliyuncs.sofa.model.v20190815.SyncLinkeBahamutIterationsyncstagetagsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncLinkeBahamutIterationsyncstagetagsResponseUnmarshaller {

	public static SyncLinkeBahamutIterationsyncstagetagsResponse unmarshall(SyncLinkeBahamutIterationsyncstagetagsResponse syncLinkeBahamutIterationsyncstagetagsResponse, UnmarshallerContext _ctx) {
		
		syncLinkeBahamutIterationsyncstagetagsResponse.setRequestId(_ctx.stringValue("SyncLinkeBahamutIterationsyncstagetagsResponse.RequestId"));
		syncLinkeBahamutIterationsyncstagetagsResponse.setResultCode(_ctx.stringValue("SyncLinkeBahamutIterationsyncstagetagsResponse.ResultCode"));
		syncLinkeBahamutIterationsyncstagetagsResponse.setResultMessage(_ctx.stringValue("SyncLinkeBahamutIterationsyncstagetagsResponse.ResultMessage"));
		syncLinkeBahamutIterationsyncstagetagsResponse.setErrorMessage(_ctx.stringValue("SyncLinkeBahamutIterationsyncstagetagsResponse.ErrorMessage"));
		syncLinkeBahamutIterationsyncstagetagsResponse.setErrorMsgParamsMap(_ctx.stringValue("SyncLinkeBahamutIterationsyncstagetagsResponse.ErrorMsgParamsMap"));
		syncLinkeBahamutIterationsyncstagetagsResponse.setMessage(_ctx.stringValue("SyncLinkeBahamutIterationsyncstagetagsResponse.Message"));
		syncLinkeBahamutIterationsyncstagetagsResponse.setResponseStatusCode(_ctx.longValue("SyncLinkeBahamutIterationsyncstagetagsResponse.ResponseStatusCode"));
		syncLinkeBahamutIterationsyncstagetagsResponse.setResult(_ctx.stringValue("SyncLinkeBahamutIterationsyncstagetagsResponse.Result"));
		syncLinkeBahamutIterationsyncstagetagsResponse.setSuccess(_ctx.booleanValue("SyncLinkeBahamutIterationsyncstagetagsResponse.Success"));
	 
	 	return syncLinkeBahamutIterationsyncstagetagsResponse;
	}
}