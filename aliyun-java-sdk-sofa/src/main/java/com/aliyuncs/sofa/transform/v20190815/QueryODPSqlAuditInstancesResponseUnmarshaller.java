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

import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditInstancesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditInstancesResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditInstancesResponse.Data.InstancesItem;
import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditInstancesResponse.Data.InstancesItem.SchemasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPSqlAuditInstancesResponseUnmarshaller {

	public static QueryODPSqlAuditInstancesResponse unmarshall(QueryODPSqlAuditInstancesResponse queryODPSqlAuditInstancesResponse, UnmarshallerContext _ctx) {
		
		queryODPSqlAuditInstancesResponse.setRequestId(_ctx.stringValue("QueryODPSqlAuditInstancesResponse.RequestId"));
		queryODPSqlAuditInstancesResponse.setResultCode(_ctx.stringValue("QueryODPSqlAuditInstancesResponse.ResultCode"));
		queryODPSqlAuditInstancesResponse.setResultMessage(_ctx.stringValue("QueryODPSqlAuditInstancesResponse.ResultMessage"));

		Data data = new Data();
		data.setSlsOpened(_ctx.booleanValue("QueryODPSqlAuditInstancesResponse.Data.SlsOpened"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPSqlAuditInstancesResponse.Data.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setInstanceId(_ctx.stringValue("QueryODPSqlAuditInstancesResponse.Data.Instances["+ i +"].InstanceId"));
			instancesItem.setInstanceName(_ctx.stringValue("QueryODPSqlAuditInstancesResponse.Data.Instances["+ i +"].InstanceName"));
			instancesItem.setOpenedCount(_ctx.longValue("QueryODPSqlAuditInstancesResponse.Data.Instances["+ i +"].OpenedCount"));

			List<SchemasItem> schemas = new ArrayList<SchemasItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryODPSqlAuditInstancesResponse.Data.Instances["+ i +"].Schemas.Length"); j++) {
				SchemasItem schemasItem = new SchemasItem();
				schemasItem.setOpened(_ctx.booleanValue("QueryODPSqlAuditInstancesResponse.Data.Instances["+ i +"].Schemas["+ j +"].Opened"));
				schemasItem.setSchemaName(_ctx.stringValue("QueryODPSqlAuditInstancesResponse.Data.Instances["+ i +"].Schemas["+ j +"].SchemaName"));

				schemas.add(schemasItem);
			}
			instancesItem.setSchemas(schemas);

			instances.add(instancesItem);
		}
		data.setInstances(instances);
		queryODPSqlAuditInstancesResponse.setData(data);
	 
	 	return queryODPSqlAuditInstancesResponse;
	}
}