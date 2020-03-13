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

import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasPhysicalSchemasResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasPhysicalSchemasResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPSchemasPhysicalSchemasResponseUnmarshaller {

	public static QueryODPSchemasPhysicalSchemasResponse unmarshall(QueryODPSchemasPhysicalSchemasResponse queryODPSchemasPhysicalSchemasResponse, UnmarshallerContext _ctx) {
		
		queryODPSchemasPhysicalSchemasResponse.setRequestId(_ctx.stringValue("QueryODPSchemasPhysicalSchemasResponse.RequestId"));
		queryODPSchemasPhysicalSchemasResponse.setResultCode(_ctx.stringValue("QueryODPSchemasPhysicalSchemasResponse.ResultCode"));
		queryODPSchemasPhysicalSchemasResponse.setResultMessage(_ctx.stringValue("QueryODPSchemasPhysicalSchemasResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPSchemasPhysicalSchemasResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDbType(_ctx.stringValue("QueryODPSchemasPhysicalSchemasResponse.Data["+ i +"].DbType"));
			dataItem.setNodeId(_ctx.stringValue("QueryODPSchemasPhysicalSchemasResponse.Data["+ i +"].NodeId"));
			dataItem.setReadOnly(_ctx.booleanValue("QueryODPSchemasPhysicalSchemasResponse.Data["+ i +"].ReadOnly"));
			dataItem.setRelSchemaName(_ctx.stringValue("QueryODPSchemasPhysicalSchemasResponse.Data["+ i +"].RelSchemaName"));

			data.add(dataItem);
		}
		queryODPSchemasPhysicalSchemasResponse.setData(data);
	 
	 	return queryODPSchemasPhysicalSchemasResponse;
	}
}