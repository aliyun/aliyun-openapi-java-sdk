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

import com.aliyuncs.mpaas.model.v20201028.QueryCubecardFiletokenResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryCubecardFiletokenResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.QueryCubecardFiletokenResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.QueryCubecardFiletokenResponse.ResultContent.Data.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCubecardFiletokenResponseUnmarshaller {

	public static QueryCubecardFiletokenResponse unmarshall(QueryCubecardFiletokenResponse queryCubecardFiletokenResponse, UnmarshallerContext _ctx) {
		
		queryCubecardFiletokenResponse.setRequestId(_ctx.stringValue("QueryCubecardFiletokenResponse.RequestId"));
		queryCubecardFiletokenResponse.setResultMessage(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultMessage"));
		queryCubecardFiletokenResponse.setResultCode(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setErrorCode(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.Data.ErrorCode"));
		data.setSuccess(_ctx.booleanValue("QueryCubecardFiletokenResponse.ResultContent.Data.Success"));
		data.setResultMsg(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.Data.ResultMsg"));

		Content content = new Content();
		content.setSignature(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.Data.Content.Signature"));
		content.setHost(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.Data.Content.Host"));
		content.setPolicy(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.Data.Content.Policy"));
		content.setAccessid(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.Data.Content.Accessid"));
		content.setDir(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.Data.Content.Dir"));
		content.setExpire(_ctx.stringValue("QueryCubecardFiletokenResponse.ResultContent.Data.Content.Expire"));
		data.setContent(content);
		resultContent.setData(data);
		queryCubecardFiletokenResponse.setResultContent(resultContent);
	 
	 	return queryCubecardFiletokenResponse;
	}
}