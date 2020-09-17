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

import com.aliyuncs.sofa.model.v20190815.QueryOneconsoleIndexesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryOneconsoleIndexesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOneconsoleIndexesResponseUnmarshaller {

	public static QueryOneconsoleIndexesResponse unmarshall(QueryOneconsoleIndexesResponse queryOneconsoleIndexesResponse, UnmarshallerContext _ctx) {
		
		queryOneconsoleIndexesResponse.setRequestId(_ctx.stringValue("QueryOneconsoleIndexesResponse.RequestId"));
		queryOneconsoleIndexesResponse.setResultCode(_ctx.stringValue("QueryOneconsoleIndexesResponse.ResultCode"));
		queryOneconsoleIndexesResponse.setResultMessage(_ctx.stringValue("QueryOneconsoleIndexesResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOneconsoleIndexesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMatch(_ctx.longValue("QueryOneconsoleIndexesResponse.Data["+ i +"].Match"));
			dataItem.setName(_ctx.stringValue("QueryOneconsoleIndexesResponse.Data["+ i +"].Name"));
			dataItem.setPath(_ctx.stringValue("QueryOneconsoleIndexesResponse.Data["+ i +"].Path"));

			List<String> hits = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryOneconsoleIndexesResponse.Data["+ i +"].Hits.Length"); j++) {
				hits.add(_ctx.stringValue("QueryOneconsoleIndexesResponse.Data["+ i +"].Hits["+ j +"]"));
			}
			dataItem.setHits(hits);

			data.add(dataItem);
		}
		queryOneconsoleIndexesResponse.setData(data);
	 
	 	return queryOneconsoleIndexesResponse;
	}
}