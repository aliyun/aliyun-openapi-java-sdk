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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryLiveStreamingResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryLiveStreamingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLiveStreamingResponseUnmarshaller {

	public static QueryLiveStreamingResponse unmarshall(QueryLiveStreamingResponse queryLiveStreamingResponse, UnmarshallerContext _ctx) {
		
		queryLiveStreamingResponse.setRequestId(_ctx.stringValue("QueryLiveStreamingResponse.RequestId"));
		queryLiveStreamingResponse.setSuccess(_ctx.booleanValue("QueryLiveStreamingResponse.Success"));
		queryLiveStreamingResponse.setErrorMessage(_ctx.stringValue("QueryLiveStreamingResponse.ErrorMessage"));
		queryLiveStreamingResponse.setCode(_ctx.stringValue("QueryLiveStreamingResponse.Code"));

		Data data = new Data();
		data.setPath(_ctx.stringValue("QueryLiveStreamingResponse.Data.Path"));
		data.setDecryptKey(_ctx.stringValue("QueryLiveStreamingResponse.Data.DecryptKey"));
		queryLiveStreamingResponse.setData(data);
	 
	 	return queryLiveStreamingResponse;
	}
}