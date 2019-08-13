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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.MetastoreDescribeDatabaseResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeDatabaseResponse.Database;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeDatabaseResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreDescribeDatabaseResponseUnmarshaller {

	public static MetastoreDescribeDatabaseResponse unmarshall(MetastoreDescribeDatabaseResponse metastoreDescribeDatabaseResponse, UnmarshallerContext _ctx) {
		
		metastoreDescribeDatabaseResponse.setRequestId(_ctx.stringValue("MetastoreDescribeDatabaseResponse.RequestId"));
		metastoreDescribeDatabaseResponse.setDbName(_ctx.stringValue("MetastoreDescribeDatabaseResponse.DbName"));
		metastoreDescribeDatabaseResponse.setDescription(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Description"));
		metastoreDescribeDatabaseResponse.setLocationUri(_ctx.stringValue("MetastoreDescribeDatabaseResponse.LocationUri"));

		Database database = new Database();
		database.setId(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.Id"));
		database.setClusterBizId(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.ClusterBizId"));
		database.setClusterName(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.ClusterName"));
		database.setDatabaseName(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.DatabaseName"));
		database.setDatabaseType(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.DatabaseType"));
		database.setOwner(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.Owner"));
		database.setOwnerType(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.OwnerType"));
		database.setLocation(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.Location"));
		database.setStatus(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.Status"));
		database.setDatabaseParameters(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.DatabaseParameters"));
		database.setGmtCreate(_ctx.longValue("MetastoreDescribeDatabaseResponse.Database.GmtCreate"));
		database.setGmtModified(_ctx.longValue("MetastoreDescribeDatabaseResponse.Database.GmtModified"));
		database.setDataSourceId(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.DataSourceId"));
		database.setDataSourceType(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.DataSourceType"));
		database.setLocationType(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.LocationType"));
		database.setDatabaseComment(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.DatabaseComment"));
		database.setProjectId(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.ProjectId"));
		database.setProjectName(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Database.ProjectName"));
		metastoreDescribeDatabaseResponse.setDatabase(database);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeDatabaseResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setKey(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Parameters["+ i +"].Key"));
			parameter.setValue(_ctx.stringValue("MetastoreDescribeDatabaseResponse.Parameters["+ i +"].Value"));

			parameters.add(parameter);
		}
		metastoreDescribeDatabaseResponse.setParameters(parameters);
	 
	 	return metastoreDescribeDatabaseResponse;
	}
}