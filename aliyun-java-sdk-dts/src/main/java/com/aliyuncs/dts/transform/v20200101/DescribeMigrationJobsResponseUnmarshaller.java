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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.DataInitialization;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.DataSynchronization;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.DestinationEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.MigrationMode;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.Precheck;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.StructureInitialization;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.SynchronousObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationJobsResponseUnmarshaller {

	public static DescribeMigrationJobsResponse unmarshall(DescribeMigrationJobsResponse describeMigrationJobsResponse, UnmarshallerContext _ctx) {
		
		describeMigrationJobsResponse.setRequestId(_ctx.stringValue("DescribeMigrationJobsResponse.RequestId"));
		describeMigrationJobsResponse.setPageNumber(_ctx.integerValue("DescribeMigrationJobsResponse.PageNumber"));
		describeMigrationJobsResponse.setPageRecordCount(_ctx.integerValue("DescribeMigrationJobsResponse.PageRecordCount"));
		describeMigrationJobsResponse.setTotalRecordCount(_ctx.longValue("DescribeMigrationJobsResponse.TotalRecordCount"));

		List<MigrationJob> migrationJobs = new ArrayList<MigrationJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobsResponse.MigrationJobs.Length"); i++) {
			MigrationJob migrationJob = new MigrationJob();
			migrationJob.setMigrationJobClass(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobClass"));
			migrationJob.setMigrationJobID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobID"));
			migrationJob.setMigrationJobName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobName"));
			migrationJob.setMigrationJobStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobStatus"));
			migrationJob.setPayType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].PayType"));

			DataInitialization dataInitialization = new DataInitialization();
			dataInitialization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.ErrorMessage"));
			dataInitialization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.Percent"));
			dataInitialization.setProgress(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.Progress"));
			dataInitialization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.status"));
			migrationJob.setDataInitialization(dataInitialization);

			DataSynchronization dataSynchronization = new DataSynchronization();
			dataSynchronization.setDelay(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.Delay"));
			dataSynchronization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.ErrorMessage"));
			dataSynchronization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.Percent"));
			dataSynchronization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.status"));
			migrationJob.setDataSynchronization(dataSynchronization);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint.setEngineName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint.setIP(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.IP"));
			destinationEndpoint.setInstanceID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint.setPort(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setUserName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.UserName"));
			migrationJob.setDestinationEndpoint(destinationEndpoint);

			MigrationMode migrationMode = new MigrationMode();
			migrationMode.setDataInitialization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.DataInitialization"));
			migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.DataSynchronization"));
			migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.StructureInitialization"));
			migrationJob.setMigrationMode(migrationMode);

			Precheck precheck = new Precheck();
			precheck.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Precheck.Percent"));
			precheck.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Precheck.Status"));
			migrationJob.setPrecheck(precheck);

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint.setEngineName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint.setIP(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.IP"));
			sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint.setPort(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setUserName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.UserName"));
			migrationJob.setSourceEndpoint(sourceEndpoint);

			StructureInitialization structureInitialization = new StructureInitialization();
			structureInitialization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.ErrorMessage"));
			structureInitialization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.Percent"));
			structureInitialization.setProgress(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.Progress"));
			structureInitialization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.status"));
			migrationJob.setStructureInitialization(structureInitialization);

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