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

import com.aliyuncs.sofa.model.v20190815.QueryODPDbnodesRelatedPhysicalSchemasResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPDbnodesRelatedPhysicalSchemasResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPDbnodesRelatedPhysicalSchemasResponseUnmarshaller {

	public static QueryODPDbnodesRelatedPhysicalSchemasResponse unmarshall(QueryODPDbnodesRelatedPhysicalSchemasResponse queryODPDbnodesRelatedPhysicalSchemasResponse, UnmarshallerContext _ctx) {
		
		queryODPDbnodesRelatedPhysicalSchemasResponse.setRequestId(_ctx.stringValue("QueryODPDbnodesRelatedPhysicalSchemasResponse.RequestId"));
		queryODPDbnodesRelatedPhysicalSchemasResponse.setResultCode(_ctx.stringValue("QueryODPDbnodesRelatedPhysicalSchemasResponse.ResultCode"));
		queryODPDbnodesRelatedPhysicalSchemasResponse.setResultMessage(_ctx.stringValue("QueryODPDbnodesRelatedPhysicalSchemasResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPDbnodesRelatedPhysicalSchemasResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGmtCreate(_ctx.stringValue("QueryODPDbnodesRelatedPhysicalSchemasResponse.Data["+ i +"].GmtCreate"));
			dataItem.setSchemaName(_ctx.stringValue("QueryODPDbnodesRelatedPhysicalSchemasResponse.Data["+ i +"].SchemaName"));

			data.add(dataItem);
		}
		queryODPDbnodesRelatedPhysicalSchemasResponse.setData(data);
	 
	 	return queryODPDbnodesRelatedPhysicalSchemasResponse;
	}
}