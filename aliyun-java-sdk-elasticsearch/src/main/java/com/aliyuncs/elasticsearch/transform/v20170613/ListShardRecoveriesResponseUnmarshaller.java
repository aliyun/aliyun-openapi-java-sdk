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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListShardRecoveriesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListShardRecoveriesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListShardRecoveriesResponseUnmarshaller {

	public static ListShardRecoveriesResponse unmarshall(ListShardRecoveriesResponse listShardRecoveriesResponse, UnmarshallerContext _ctx) {
		
		listShardRecoveriesResponse.setRequestId(_ctx.stringValue("ListShardRecoveriesResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListShardRecoveriesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setIndex(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].index"));
			resultItem.setSourceHost(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].sourceHost"));
			resultItem.setTargetNode(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].targetNode"));
			resultItem.setStage(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].stage"));
			resultItem.setFilesTotal(_ctx.longValue("ListShardRecoveriesResponse.Result["+ i +"].filesTotal"));
			resultItem.setFilesPercent(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].filesPercent"));
			resultItem.setBytesTotal(_ctx.longValue("ListShardRecoveriesResponse.Result["+ i +"].bytesTotal"));
			resultItem.setBytesPercent(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].bytesPercent"));
			resultItem.setTranslogOps(_ctx.longValue("ListShardRecoveriesResponse.Result["+ i +"].translogOps"));
			resultItem.setTranslogOpsPercent(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].translogOpsPercent"));
			resultItem.setSourceNode(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].sourceNode"));
			resultItem.setTargetHost(_ctx.stringValue("ListShardRecoveriesResponse.Result["+ i +"].targetHost"));

			result.add(resultItem);
		}
		listShardRecoveriesResponse.setResult(result);
	 
	 	return listShardRecoveriesResponse;
	}
}