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

import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyShardingsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyShardingsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSTopologyShardingsResponseUnmarshaller {

	public static QueryTSTopologyShardingsResponse unmarshall(QueryTSTopologyShardingsResponse queryTSTopologyShardingsResponse, UnmarshallerContext _ctx) {
		
		queryTSTopologyShardingsResponse.setRequestId(_ctx.stringValue("QueryTSTopologyShardingsResponse.RequestId"));
		queryTSTopologyShardingsResponse.setResultCode(_ctx.stringValue("QueryTSTopologyShardingsResponse.ResultCode"));
		queryTSTopologyShardingsResponse.setResultMessage(_ctx.stringValue("QueryTSTopologyShardingsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTopologyShardingsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSharding(_ctx.stringValue("QueryTSTopologyShardingsResponse.Data["+ i +"].Sharding"));

			List<String> statusEnums = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSTopologyShardingsResponse.Data["+ i +"].StatusEnums.Length"); j++) {
				statusEnums.add(_ctx.stringValue("QueryTSTopologyShardingsResponse.Data["+ i +"].StatusEnums["+ j +"]"));
			}
			dataItem.setStatusEnums(statusEnums);

			data.add(dataItem);
		}
		queryTSTopologyShardingsResponse.setData(data);
	 
	 	return queryTSTopologyShardingsResponse;
	}
}