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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDBTopologyResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDBTopologyResponse.DBTopology;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDBTopologyResponse.DBTopology.DataSource;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDBTopologyResponse.DBTopology.DataSource.Database;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDBTopologyResponse.DBTopology.DataSource.Database.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableDBTopologyResponseUnmarshaller {

	public static GetTableDBTopologyResponse unmarshall(GetTableDBTopologyResponse getTableDBTopologyResponse, UnmarshallerContext _ctx) {
		
		getTableDBTopologyResponse.setRequestId(_ctx.stringValue("GetTableDBTopologyResponse.RequestId"));
		getTableDBTopologyResponse.setErrorCode(_ctx.stringValue("GetTableDBTopologyResponse.ErrorCode"));
		getTableDBTopologyResponse.setErrorMessage(_ctx.stringValue("GetTableDBTopologyResponse.ErrorMessage"));
		getTableDBTopologyResponse.setSuccess(_ctx.booleanValue("GetTableDBTopologyResponse.Success"));

		DBTopology dBTopology = new DBTopology();
		dBTopology.setTableName(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.TableName"));
		dBTopology.setTableGuid(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.TableGuid"));

		List<DataSource> dataSourceList = new ArrayList<DataSource>();
		for (int i = 0; i < _ctx.lengthValue("GetTableDBTopologyResponse.DBTopology.DataSourceList.Length"); i++) {
			DataSource dataSource = new DataSource();
			dataSource.setPort(_ctx.integerValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].Port"));
			dataSource.setHost(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].Host"));
			dataSource.setDbType(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DbType"));
			dataSource.setSid(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].Sid"));

			List<Database> databaseList = new ArrayList<Database>();
			for (int j = 0; j < _ctx.lengthValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList.Length"); j++) {
				Database database = new Database();
				database.setDbId(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList["+ j +"].DbId"));
				database.setDbName(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList["+ j +"].DbName"));
				database.setEnvType(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList["+ j +"].EnvType"));
				database.setDbType(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList["+ j +"].DbType"));

				List<Table> tableList = new ArrayList<Table>();
				for (int k = 0; k < _ctx.lengthValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList["+ j +"].TableList.Length"); k++) {
					Table table = new Table();
					table.setTableId(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList["+ j +"].TableList["+ k +"].TableId"));
					table.setTableName(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList["+ j +"].TableList["+ k +"].TableName"));
					table.setTableType(_ctx.stringValue("GetTableDBTopologyResponse.DBTopology.DataSourceList["+ i +"].DatabaseList["+ j +"].TableList["+ k +"].TableType"));

					tableList.add(table);
				}
				database.setTableList(tableList);

				databaseList.add(database);
			}
			dataSource.setDatabaseList(databaseList);

			dataSourceList.add(dataSource);
		}
		dBTopology.setDataSourceList(dataSourceList);
		getTableDBTopologyResponse.setDBTopology(dBTopology);
	 
	 	return getTableDBTopologyResponse;
	}
}