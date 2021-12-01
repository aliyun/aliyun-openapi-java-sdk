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
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobsResponse.MigrationJob.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationJobsResponseUnmarshaller {

	public static DescribeMigrationJobsResponse unmarshall(DescribeMigrationJobsResponse describeMigrationJobsResponse, UnmarshallerContext _ctx) {
		
		describeMigrationJobsResponse.setRequestId(_ctx.stringValue("DescribeMigrationJobsResponse.RequestId"));
		describeMigrationJobsResponse.setErrCode(_ctx.stringValue("DescribeMigrationJobsResponse.ErrCode"));
		describeMigrationJobsResponse.setPageRecordCount(_ctx.integerValue("DescribeMigrationJobsResponse.PageRecordCount"));
		describeMigrationJobsResponse.setSuccess(_ctx.stringValue("DescribeMigrationJobsResponse.Success"));
		describeMigrationJobsResponse.setTotalRecordCount(_ctx.longValue("DescribeMigrationJobsResponse.TotalRecordCount"));
		describeMigrationJobsResponse.setErrMessage(_ctx.stringValue("DescribeMigrationJobsResponse.ErrMessage"));
		describeMigrationJobsResponse.setPageNumber(_ctx.integerValue("DescribeMigrationJobsResponse.PageNumber"));

		List<MigrationJob> migrationJobs = new ArrayList<MigrationJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobsResponse.MigrationJobs.Length"); i++) {
			MigrationJob migrationJob = new MigrationJob();
			migrationJob.setMigrationJobName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobName"));
			migrationJob.setMigrationJobStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobStatus"));
			migrationJob.setPayType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].PayType"));
			migrationJob.setMigrationJobClass(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobClass"));
			migrationJob.setInstanceCreateTime(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].InstanceCreateTime"));
			migrationJob.setMigrationJobID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationJobID"));
			migrationJob.setJobCreateTime(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].JobCreateTime"));

			DataInitialization dataInitialization = new DataInitialization();
			dataInitialization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.Percent"));
			dataInitialization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.status"));
			dataInitialization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.ErrorMessage"));
			dataInitialization.setProgress(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataInitialization.Progress"));
			migrationJob.setDataInitialization(dataInitialization);

			DataSynchronization dataSynchronization = new DataSynchronization();
			dataSynchronization.setDelay(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.Delay"));
			dataSynchronization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.Percent"));
			dataSynchronization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.status"));
			dataSynchronization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DataSynchronization.ErrorMessage"));
			migrationJob.setDataSynchronization(dataSynchronization);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint.setInstanceID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint.setPort(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setIP(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.IP"));
			destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setUserName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.UserName"));
			destinationEndpoint.setEngineName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].DestinationEndpoint.EngineName"));
			migrationJob.setDestinationEndpoint(destinationEndpoint);

			MigrationMode migrationMode = new MigrationMode();
			migrationMode.setDataInitialization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.DataInitialization"));
			migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.DataSynchronization"));
			migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].MigrationMode.StructureInitialization"));
			migrationJob.setMigrationMode(migrationMode);

			Precheck precheck = new Precheck();
			precheck.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Precheck.Status"));
			precheck.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Precheck.Percent"));
			migrationJob.setPrecheck(precheck);

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setPort(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setIP(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.IP"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setUserName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.UserName"));
			sourceEndpoint.setEngineName(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].SourceEndpoint.EngineName"));
			migrationJob.setSourceEndpoint(sourceEndpoint);

			StructureInitialization structureInitialization = new StructureInitialization();
			structureInitialization.setPercent(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.Percent"));
			structureInitialization.setStatus(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.status"));
			structureInitialization.setErrorMessage(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.ErrorMessage"));
			structureInitialization.setProgress(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].StructureInitialization.Progress"));
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

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeMigrationJobsResponse.MigrationJobs["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			migrationJob.setTags(tags);

			migrationJobs.add(migrationJob);
		}
		describeMigrationJobsResponse.setMigrationJobs(migrationJobs);
	 
	 	return describeMigrationJobsResponse;
	}
}