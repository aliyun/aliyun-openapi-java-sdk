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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListApprovalSchemasResponse;
import com.aliyuncs.csas.model.v20230120.ListApprovalSchemasResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApprovalSchemasResponseUnmarshaller {

	public static ListApprovalSchemasResponse unmarshall(ListApprovalSchemasResponse listApprovalSchemasResponse, UnmarshallerContext _ctx) {
		
		listApprovalSchemasResponse.setRequestId(_ctx.stringValue("ListApprovalSchemasResponse.RequestId"));
		listApprovalSchemasResponse.setTotalNum(_ctx.stringValue("ListApprovalSchemasResponse.TotalNum"));

		List<DataList> schemas = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("ListApprovalSchemasResponse.Schemas.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setCreateTime(_ctx.stringValue("ListApprovalSchemasResponse.Schemas["+ i +"].CreateTime"));
			dataList.setSchemaId(_ctx.stringValue("ListApprovalSchemasResponse.Schemas["+ i +"].SchemaId"));
			dataList.setSchemaName(_ctx.stringValue("ListApprovalSchemasResponse.Schemas["+ i +"].SchemaName"));
			dataList.setDescription(_ctx.stringValue("ListApprovalSchemasResponse.Schemas["+ i +"].Description"));
			dataList.setSchemaContent(_ctx.stringValue("ListApprovalSchemasResponse.Schemas["+ i +"].SchemaContent"));
			dataList.setSchemaVersion(_ctx.longValue("ListApprovalSchemasResponse.Schemas["+ i +"].SchemaVersion"));
			dataList.setPolicyType(_ctx.stringValue("ListApprovalSchemasResponse.Schemas["+ i +"].PolicyType"));
			dataList.setIsDefault(_ctx.booleanValue("ListApprovalSchemasResponse.Schemas["+ i +"].IsDefault"));

			schemas.add(dataList);
		}
		listApprovalSchemasResponse.setSchemas(schemas);
	 
	 	return listApprovalSchemasResponse;
	}
}