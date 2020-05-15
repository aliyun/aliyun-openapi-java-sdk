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

import com.aliyuncs.sofa.model.v20190815.RetryTSChunksResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryTSChunksResponseUnmarshaller {

	public static RetryTSChunksResponse unmarshall(RetryTSChunksResponse retryTSChunksResponse, UnmarshallerContext _ctx) {
		
		retryTSChunksResponse.setRequestId(_ctx.stringValue("RetryTSChunksResponse.RequestId"));
		retryTSChunksResponse.setResultCode(_ctx.stringValue("RetryTSChunksResponse.ResultCode"));
		retryTSChunksResponse.setResultMessage(_ctx.stringValue("RetryTSChunksResponse.ResultMessage"));
		retryTSChunksResponse.setChunkIds(_ctx.stringValue("RetryTSChunksResponse.ChunkIds"));
		retryTSChunksResponse.setJobRequestId(_ctx.stringValue("RetryTSChunksResponse.JobRequestId"));
	 
	 	return retryTSChunksResponse;
	}
}