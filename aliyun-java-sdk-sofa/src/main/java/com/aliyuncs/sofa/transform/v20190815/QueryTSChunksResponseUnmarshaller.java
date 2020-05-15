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

import com.aliyuncs.sofa.model.v20190815.QueryTSChunksResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSChunksResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSChunksResponseUnmarshaller {

	public static QueryTSChunksResponse unmarshall(QueryTSChunksResponse queryTSChunksResponse, UnmarshallerContext _ctx) {
		
		queryTSChunksResponse.setRequestId(_ctx.stringValue("QueryTSChunksResponse.RequestId"));
		queryTSChunksResponse.setResultCode(_ctx.stringValue("QueryTSChunksResponse.ResultCode"));
		queryTSChunksResponse.setResultMessage(_ctx.stringValue("QueryTSChunksResponse.ResultMessage"));
		queryTSChunksResponse.setPageNum(_ctx.longValue("QueryTSChunksResponse.PageNum"));
		queryTSChunksResponse.setPageSize(_ctx.longValue("QueryTSChunksResponse.PageSize"));
		queryTSChunksResponse.setTotalCount(_ctx.longValue("QueryTSChunksResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSChunksResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAllNum(_ctx.longValue("QueryTSChunksResponse.List["+ i +"].AllNum"));
			listItem.setChunkData(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].ChunkData"));
			listItem.setConsume(_ctx.longValue("QueryTSChunksResponse.List["+ i +"].Consume"));
			listItem.setDigest(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].Digest"));
			listItem.setExecuteClient(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].ExecuteClient"));
			listItem.setExecuteId(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].ExecuteId"));
			listItem.setGenerateClient(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].GenerateClient"));
			listItem.setGmtBegin(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].GmtBegin"));
			listItem.setGmtEnd(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].GmtEnd"));
			listItem.setId(_ctx.longValue("QueryTSChunksResponse.List["+ i +"].Id"));
			listItem.setMsg(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].Msg"));
			listItem.setProgress(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].Progress"));
			listItem.setShardingRule(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].ShardingRule"));
			listItem.setStatus(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].Status"));
			listItem.setSuccessNum(_ctx.longValue("QueryTSChunksResponse.List["+ i +"].SuccessNum"));
			listItem.setType(_ctx.stringValue("QueryTSChunksResponse.List["+ i +"].Type"));

			list.add(listItem);
		}
		queryTSChunksResponse.setList(list);
	 
	 	return queryTSChunksResponse;
	}
}