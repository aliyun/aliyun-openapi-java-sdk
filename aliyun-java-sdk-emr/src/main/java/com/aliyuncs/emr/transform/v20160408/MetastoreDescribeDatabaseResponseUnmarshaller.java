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

	public static MetastoreDescribeDatabaseResponse unmarshall(MetastoreDescribeDatabaseResponse metastoreDescribeDatabaseResponse, UnmarshallerContext context) {
		
		metastoreDescribeDatabaseResponse.setRequestId(context.stringValue("MetastoreDescribeDatabaseResponse.RequestId"));
		metastoreDescribeDatabaseResponse.setDbName(context.stringValue("MetastoreDescribeDatabaseResponse.DbName"));
		metastoreDescribeDatabaseResponse.setDescription(context.stringValue("MetastoreDescribeDatabaseResponse.Description"));
		metastoreDescribeDatabaseResponse.setLocationUri(context.stringValue("MetastoreDescribeDatabaseResponse.LocationUri"));

		Database database = new Database();
		database.setId(context.stringValue("MetastoreDescribeDatabaseResponse.Database.Id"));
		database.setClusterBizId(context.stringValue("MetastoreDescribeDatabaseResponse.Database.ClusterBizId"));
		database.setClusterName(context.stringValue("MetastoreDescribeDatabaseResponse.Database.ClusterName"));
		database.setDatabaseName(context.stringValue("MetastoreDescribeDatabaseResponse.Database.DatabaseName"));
		database.setDatabaseType(context.stringValue("MetastoreDescribeDatabaseResponse.Database.DatabaseType"));
		database.setOwner(context.stringValue("MetastoreDescribeDatabaseResponse.Database.Owner"));
		database.setOwnerType(context.stringValue("MetastoreDescribeDatabaseResponse.Database.OwnerType"));
		database.setLocation(context.stringValue("MetastoreDescribeDatabaseResponse.Database.Location"));
		database.setStatus(context.stringValue("MetastoreDescribeDatabaseResponse.Database.Status"));
		database.setDatabaseParameters(context.stringValue("MetastoreDescribeDatabaseResponse.Database.DatabaseParameters"));
		database.setGmtCreate(context.longValue("MetastoreDescribeDatabaseResponse.Database.GmtCreate"));
		database.setGmtModified(context.longValue("MetastoreDescribeDatabaseResponse.Database.GmtModified"));
		database.setDataSourceId(context.stringValue("MetastoreDescribeDatabaseResponse.Database.DataSourceId"));
		database.setDataSourceType(context.stringValue("MetastoreDescribeDatabaseResponse.Database.DataSourceType"));
		database.setLocationType(context.stringValue("MetastoreDescribeDatabaseResponse.Database.LocationType"));
		database.setDatabaseComment(context.stringValue("MetastoreDescribeDatabaseResponse.Database.DatabaseComment"));
		database.setProjectId(context.stringValue("MetastoreDescribeDatabaseResponse.Database.ProjectId"));
		database.setProjectName(context.stringValue("MetastoreDescribeDatabaseResponse.Database.ProjectName"));
		metastoreDescribeDatabaseResponse.setDatabase(database);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeDatabaseResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setKey(context.stringValue("MetastoreDescribeDatabaseResponse.Parameters["+ i +"].Key"));
			parameter.setValue(context.stringValue("MetastoreDescribeDatabaseResponse.Parameters["+ i +"].Value"));

			parameters.add(parameter);
		}
		metastoreDescribeDatabaseResponse.setParameters(parameters);
	 
	 	return metastoreDescribeDatabaseResponse;
	}
}