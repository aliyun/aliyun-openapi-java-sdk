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

	public static DescribeMigrationJobsResponse unmarshall(DescribeMigrationJobsResponse describeMigrationJobsResponse, UnmarshallerContext context) {
		
		describeMigrationJobsResponse.setPageNumber(context.integerValue("DescribeMigrationJobsResponse.PageNumber"));
		describeMigrationJobsResponse.setTotalRecordCount(context.longValue("DescribeMigrationJobsResponse.TotalRecordCount"));
		describeMigrationJobsResponse.setPageRecordCount(context.integerValue("DescribeMigrationJobsResponse.PageRecordCount"));

		List<MigrationJob> migrationJobs = new ArrayList<MigrationJob>();
		for (int i = 0; i < context.lengthValue("DescribeMigrationJobsResponse.MigrationJobs.Length"); i++) {
			MigrationJob migrationJob = new MigrationJob();
			migrationJob.setMigrationJobID(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobID"));
			migrationJob.setMigrationJobName(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobName"));
			migrationJob.setPayType(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].PayType"));
			migrationJob.setMigrationJobClass(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobClass"));
			migrationJob.setMigrationJobStatus(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobStatus"));

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setInstanceID(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setInstanceType(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setEngineName(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint.setIP(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.IP"));
			sourceEndpoint.setPort(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setDatabaseName(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint.setOracleSID(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint.setUserName(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.UserName"));
			migrationJob.setSourceEndpoint(sourceEndpoint);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setInstanceID(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint.setInstanceType(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setEngineName(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint.setIP(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.IP"));
			destinationEndpoint.setPort(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setDatabaseName(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint.setOracleSID(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint.setUserName(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.UserName"));
			migrationJob.setDestinationEndpoint(destinationEndpoint);

			MigrationMode migrationMode = new MigrationMode();
			migrationMode.setStructureInitialization(context.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.StructureInitialization"));
			migrationMode.setDataInitialization(context.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.DataInitialization"));
			migrationMode.setDataSynchronization(context.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.DataSynchronization"));
			migrationJob.setMigrationMode(migrationMode);

			Precheck precheck = new Precheck();
			precheck.setStatus(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Precheck.Status"));
			precheck.setPercent(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Precheck.Percent"));
			migrationJob.setPrecheck(precheck);

			StructureInitialization structureInitialization = new StructureInitialization();
			structureInitialization.setStatus(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.status"));
			structureInitialization.setPercent(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.Percent"));
			structureInitialization.setErrorMessage(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.ErrorMessage"));
			structureInitialization.setProgress(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.Progress"));
			migrationJob.setStructureInitialization(structureInitialization);

			DataInitialization dataInitialization = new DataInitialization();
			dataInitialization.setStatus(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.status"));
			dataInitialization.setPercent(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.Percent"));
			dataInitialization.setErrorMessage(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.ErrorMessage"));
			dataInitialization.setProgress(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.Progress"));
			migrationJob.setDataInitialization(dataInitialization);

			DataSynchronization dataSynchronization = new DataSynchronization();
			dataSynchronization.setStatus(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.status"));
			dataSynchronization.setPercent(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.Percent"));
			dataSynchronization.setErrorMessage(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.ErrorMessage"));
			dataSynchronization.setDelay(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.Delay"));
			migrationJob.setDataSynchronization(dataSynchronization);

			List<SynchronousObject> migrationObject = new ArrayList<SynchronousObject>();
			for (int j = 0; j < context.lengthValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject.Length"); j++) {
				SynchronousObject synchronousObject = new SynchronousObject();
				synchronousObject.setDatabaseName(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject["+ j +"].DatabaseName"));
				synchronousObject.setWholeDatabase(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject["+ j +"].WholeDatabase"));

				List<String> tableList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject["+ j +"].TableList.Length"); k++) {
					tableList.add(context.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationObject["+ j +"].TableList["+ k +"]"));
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