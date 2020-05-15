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

import com.aliyuncs.sofa.model.v20190815.QueryTSChunkResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSChunkResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSChunkResponseUnmarshaller {

	public static QueryTSChunkResponse unmarshall(QueryTSChunkResponse queryTSChunkResponse, UnmarshallerContext _ctx) {
		
		queryTSChunkResponse.setRequestId(_ctx.stringValue("QueryTSChunkResponse.RequestId"));
		queryTSChunkResponse.setResultCode(_ctx.stringValue("QueryTSChunkResponse.ResultCode"));
		queryTSChunkResponse.setResultMessage(_ctx.stringValue("QueryTSChunkResponse.ResultMessage"));

		Data data = new Data();
		data.setAllNum(_ctx.longValue("QueryTSChunkResponse.Data.AllNum"));
		data.setChunkData(_ctx.stringValue("QueryTSChunkResponse.Data.ChunkData"));
		data.setConsume(_ctx.longValue("QueryTSChunkResponse.Data.Consume"));
		data.setDigest(_ctx.stringValue("QueryTSChunkResponse.Data.Digest"));
		data.setExecuteClient(_ctx.stringValue("QueryTSChunkResponse.Data.ExecuteClient"));
		data.setExecuteId(_ctx.stringValue("QueryTSChunkResponse.Data.ExecuteId"));
		data.setGenerateClient(_ctx.stringValue("QueryTSChunkResponse.Data.GenerateClient"));
		data.setGmtBegin(_ctx.stringValue("QueryTSChunkResponse.Data.GmtBegin"));
		data.setGmtEnd(_ctx.stringValue("QueryTSChunkResponse.Data.GmtEnd"));
		data.setId(_ctx.longValue("QueryTSChunkResponse.Data.Id"));
		data.setMsg(_ctx.stringValue("QueryTSChunkResponse.Data.Msg"));
		data.setProgress(_ctx.stringValue("QueryTSChunkResponse.Data.Progress"));
		data.setShardingRule(_ctx.stringValue("QueryTSChunkResponse.Data.ShardingRule"));
		data.setStatus(_ctx.stringValue("QueryTSChunkResponse.Data.Status"));
		data.setSuccessNum(_ctx.longValue("QueryTSChunkResponse.Data.SuccessNum"));
		data.setType(_ctx.stringValue("QueryTSChunkResponse.Data.Type"));
		queryTSChunkResponse.setData(data);
	 
	 	return queryTSChunkResponse;
	}
}