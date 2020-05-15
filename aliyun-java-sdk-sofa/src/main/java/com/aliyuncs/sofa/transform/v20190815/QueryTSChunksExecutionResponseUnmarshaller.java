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

import com.aliyuncs.sofa.model.v20190815.QueryTSChunksExecutionResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSChunksExecutionResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryTSChunksExecutionResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSChunksExecutionResponseUnmarshaller {

	public static QueryTSChunksExecutionResponse unmarshall(QueryTSChunksExecutionResponse queryTSChunksExecutionResponse, UnmarshallerContext _ctx) {
		
		queryTSChunksExecutionResponse.setRequestId(_ctx.stringValue("QueryTSChunksExecutionResponse.RequestId"));
		queryTSChunksExecutionResponse.setResultCode(_ctx.stringValue("QueryTSChunksExecutionResponse.ResultCode"));
		queryTSChunksExecutionResponse.setResultMessage(_ctx.stringValue("QueryTSChunksExecutionResponse.ResultMessage"));

		Data data = new Data();
		data.setConsume(_ctx.longValue("QueryTSChunksExecutionResponse.Data.Consume"));
		data.setProgress(_ctx.stringValue("QueryTSChunksExecutionResponse.Data.Progress"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSChunksExecutionResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("QueryTSChunksExecutionResponse.Data.List["+ i +"].Id"));
			listItem.setStatus(_ctx.stringValue("QueryTSChunksExecutionResponse.Data.List["+ i +"].Status"));

			list.add(listItem);
		}
		data.setList(list);
		queryTSChunksExecutionResponse.setData(data);
	 
	 	return queryTSChunksExecutionResponse;
	}
}