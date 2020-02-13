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

package com.aliyuncs.dts.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob.DataInitialization;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob.DataSynchronization;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob.DestinationEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob.MigrationMode;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob.Precheck;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob.SourceEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob.StructureInitialization;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobsResponse.MigrationJob.SynchronousObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationJobsResponseUnmarshaller {

	public static DescribeMigrationJobsResponse unmarshall(DescribeMigrationJobsResponse describeMigrationJobsResponse, UnmarshallerContext _ctx) {
		
		describeMigrationJobsResponse.setPageNumber(_ctx.integerValue("DescribeMigrationJobsResponse.PageNumber"));
		describeMigrationJobsResponse.setTotalRecordCount(_ctx.longValue("DescribeMigrationJobsResponse.TotalRecordCount"));
		describeMigrationJobsResponse.setPageRecordCount(_ctx.integerValue("DescribeMigrationJobsResponse.PageRecordCount"));

		List<MigrationJob> migrationJobs = new ArrayList<MigrationJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobsResponse.MigrationJobs.Length"); i++) {
			MigrationJob migrationJob = new MigrationJob();
			migrationJob.setMigrationJobID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobID"));
			migrationJob.setMigrationJobName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobName"));
			migrationJob.setPayType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].PayType"));
			migrationJob.setMigrationJobClass(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobClass"));
			migrationJob.setMigrationJobStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobStatus"));

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setEngineName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint.setIP(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.IP"));
			sourceEndpoint.setPort(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint.setUserName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.UserName"));
			migrationJob.setSourceEndpoint(sourceEndpoint);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setInstanceID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setEngineName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint.setIP(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.IP"));
			destinationEndpoint.setPort(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint.setUserName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.UserName"));
			migrationJob.setDestinationEndpoint(destinationEndpoint);

			MigrationMode migrationMode = new MigrationMode();
			migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.StructureInitialization"));
			migrationMode.setDataInitialization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.DataInitialization"));
			migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.DataSynchronization"));
			migrationJob.setMigrationMode(migrationMode);

			Precheck precheck = new Precheck();
			precheck.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Precheck.Status"));
			precheck.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Precheck.Percent"));
			migrationJob.setPrecheck(precheck);

			StructureInitialization structureInitialization = new StructureInitialization();
			structureInitialization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.status"));
			structureInitialization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.Percent"));
			structureInitialization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.ErrorMessage"));
			structureInitialization.setProgress(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.Progress"));
			migrationJob.setStructureInitialization(structureInitialization);

			DataInitialization dataInitialization = new DataInitialization();
			dataInitialization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.status"));
			dataInitialization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.Percent"));
			dataInitialization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.ErrorMessage"));
			dataInitialization.setProgress(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.Progress"));
			migrationJob.setDataInitialization(dataInitialization);

			DataSynchronization dataSynchronization = new DataSynchronization();
			dataSynchronization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.status"));
			dataSynchronization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.Percent"));
			dataSynchronization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.ErrorMessage"));
			dataSynchronization.setDelay(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.Delay"));
			migrationJob.setDataSynchronization(dataSynchronization);

			List<SynchronousObject> migrationObject = new ArrayList<SynchronousObject>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject.Length"); j++) {
				SynchronousObject synchronousObject = new SynchronousObject();
				synchronousObject.setDatabaseName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject["+ j +"].DatabaseName"));
				synchronousObject.setWholeDatabase(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject["+ j +"].WholeDatabase"));

				List<String> tableList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject["+ j +"].TableList.Length"); k++) {
					tableList.add(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject["+ j +"].TableList["+ k +"]"));
				}
				synchronousObject.setTableList(tableList);

				migrationObject.add(synchronousObject);
			}
			migrationJob.setMigrationObject(migrationObject);

			migrationJobs.add(migrationJob);
		}
		describeMigrationJobsResponse.setMigrationJobs(migrationJobs);
	 
	 	return describeMigrationJobsResponse;
	}
}