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

import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyBaseVersionsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyBaseVersionsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSTopologyBaseVersionsResponseUnmarshaller {

	public static QueryTSTopologyBaseVersionsResponse unmarshall(QueryTSTopologyBaseVersionsResponse queryTSTopologyBaseVersionsResponse, UnmarshallerContext _ctx) {
		
		queryTSTopologyBaseVersionsResponse.setRequestId(_ctx.stringValue("QueryTSTopologyBaseVersionsResponse.RequestId"));
		queryTSTopologyBaseVersionsResponse.setResultCode(_ctx.stringValue("QueryTSTopologyBaseVersionsResponse.ResultCode"));
		queryTSTopologyBaseVersionsResponse.setResultMessage(_ctx.stringValue("QueryTSTopologyBaseVersionsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTopologyBaseVersionsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBaseVerison(_ctx.stringValue("QueryTSTopologyBaseVersionsResponse.Data["+ i +"].BaseVerison"));
			dataItem.setStatus(_ctx.stringValue("QueryTSTopologyBaseVersionsResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		queryTSTopologyBaseVersionsResponse.setData(data);
	 
	 	return queryTSTopologyBaseVersionsResponse;
	}
}