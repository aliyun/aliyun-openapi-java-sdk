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

import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DestinationEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DtsTag;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.MigrationMode;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.Performance;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.PrecheckStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.PrecheckStatus.PrecheckDetail;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DataInitializationStatus6;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DataSynchronizationStatus7;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DestinationEndpoint2;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.MigrationMode3;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.Performance8;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.PrecheckStatus4;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.PrecheckStatus4.PrecheckDetail10;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.SourceEndpoint1;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.StructureInitializationStatus5;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.StructureInitializationStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDtsJobsResponseUnmarshaller {

	public static DescribeDtsJobsResponse unmarshall(DescribeDtsJobsResponse describeDtsJobsResponse, UnmarshallerContext _ctx) {
		
		describeDtsJobsResponse.setRequestId(_ctx.stringValue("DescribeDtsJobsResponse.RequestId"));
		describeDtsJobsResponse.setSuccess(_ctx.booleanValue("DescribeDtsJobsResponse.Success"));
		describeDtsJobsResponse.setErrCode(_ctx.stringValue("DescribeDtsJobsResponse.ErrCode"));
		describeDtsJobsResponse.setErrMessage(_ctx.stringValue("DescribeDtsJobsResponse.ErrMessage"));
		describeDtsJobsResponse.setDynamicCode(_ctx.stringValue("DescribeDtsJobsResponse.DynamicCode"));
		describeDtsJobsResponse.setDynamicMessage(_ctx.stringValue("DescribeDtsJobsResponse.DynamicMessage"));
		describeDtsJobsResponse.setHttpStatusCode(_ctx.integerValue("DescribeDtsJobsResponse.HttpStatusCode"));
		describeDtsJobsResponse.setPageNumber(_ctx.integerValue("DescribeDtsJobsResponse.PageNumber"));
		describeDtsJobsResponse.setPageRecordCount(_ctx.integerValue("DescribeDtsJobsResponse.PageRecordCount"));
		describeDtsJobsResponse.setTotalRecordCount(_ctx.integerValue("DescribeDtsJobsResponse.TotalRecordCount"));

		List<DtsJobStatus> dtsJobList = new ArrayList<DtsJobStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList.Length"); i++) {
			DtsJobStatus dtsJobStatus = new DtsJobStatus();
			dtsJobStatus.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsInstanceID"));
			dtsJobStatus.setDtsJobId(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobId"));
			dtsJobStatus.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobName"));
			dtsJobStatus.setDtsJobClass(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobClass"));
			dtsJobStatus.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobDirection"));
			dtsJobStatus.setPayType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PayType"));
			dtsJobStatus.setExpireTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ExpireTime"));
			dtsJobStatus.setCreateTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].CreateTime"));
			dtsJobStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Status"));
			dtsJobStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ErrorMessage"));
			dtsJobStatus.setDelay(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Delay"));
			dtsJobStatus.setCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Checkpoint"));
			dtsJobStatus.setDbObject(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DbObject"));
			dtsJobStatus.setReserved(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Reserved"));

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Ip"));
			sourceEndpoint.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.UserName"));
			sourceEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Region"));
			dtsJobStatus.setSourceEndpoint(sourceEndpoint);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Ip"));
			destinationEndpoint.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.UserName"));
			destinationEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Region"));
			dtsJobStatus.setDestinationEndpoint(destinationEndpoint);

			MigrationMode migrationMode = new MigrationMode();
			migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.StructureInitialization"));
			migrationMode.setDataInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.DataInitialization"));
			migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.DataSynchronization"));
			dtsJobStatus.setMigrationMode(migrationMode);

			PrecheckStatus precheckStatus = new PrecheckStatus();
			precheckStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Status"));
			precheckStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Percent"));
			precheckStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.ErrorMessage"));

			List<PrecheckDetail> detail = new ArrayList<PrecheckDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail.Length"); j++) {
				PrecheckDetail precheckDetail = new PrecheckDetail();
				precheckDetail.setCheckItem(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItem"));
				precheckDetail.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				precheckDetail.setCheckResult(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckResult"));
				precheckDetail.setFailedReason(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].FailedReason"));
				precheckDetail.setRepairMethod(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].RepairMethod"));

				detail.add(precheckDetail);
			}
			precheckStatus.setDetail(detail);
			dtsJobStatus.setPrecheckStatus(precheckStatus);

			StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
			structureInitializationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Status"));
			structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Percent"));
			structureInitializationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Progress"));
			dtsJobStatus.setStructureInitializationStatus(structureInitializationStatus);

			DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
			dataInitializationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Status"));
			dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Percent"));
			dataInitializationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Progress"));
			dtsJobStatus.setDataInitializationStatus(dataInitializationStatus);

			DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
			dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Status"));
			dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Progress"));
			dtsJobStatus.setDataSynchronizationStatus(dataSynchronizationStatus);

			Performance performance = new Performance();
			performance.setRps(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Performance.Rps"));
			performance.setFlow(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Performance.Flow"));
			dtsJobStatus.setPerformance(performance);

			ReverseJob reverseJob = new ReverseJob();
			reverseJob.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsInstanceID"));
			reverseJob.setDtsJobId(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobId"));
			reverseJob.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobName"));
			reverseJob.setDtsJobClass(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobClass"));
			reverseJob.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobDirection"));
			reverseJob.setPayType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PayType"));
			reverseJob.setExpireTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.ExpireTime"));
			reverseJob.setCreateTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.CreateTime"));
			reverseJob.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Status"));
			reverseJob.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.ErrorMessage"));
			reverseJob.setDelay(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Delay"));
			reverseJob.setCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Checkpoint"));
			reverseJob.setDbObject(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DbObject"));
			reverseJob.setReserved(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Reserved"));

			SourceEndpoint1 sourceEndpoint1 = new SourceEndpoint1();
			sourceEndpoint1.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.InstanceID"));
			sourceEndpoint1.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.InstanceType"));
			sourceEndpoint1.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.EngineName"));
			sourceEndpoint1.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Ip"));
			sourceEndpoint1.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Port"));
			sourceEndpoint1.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.DatabaseName"));
			sourceEndpoint1.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.OracleSID"));
			sourceEndpoint1.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.UserName"));
			sourceEndpoint1.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint1.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Region"));
			reverseJob.setSourceEndpoint1(sourceEndpoint1);

			DestinationEndpoint2 destinationEndpoint2 = new DestinationEndpoint2();
			destinationEndpoint2.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.InstanceID"));
			destinationEndpoint2.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.InstanceType"));
			destinationEndpoint2.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.EngineName"));
			destinationEndpoint2.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Ip"));
			destinationEndpoint2.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Port"));
			destinationEndpoint2.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.DatabaseName"));
			destinationEndpoint2.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.OracleSID"));
			destinationEndpoint2.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.UserName"));
			destinationEndpoint2.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint2.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Region"));
			reverseJob.setDestinationEndpoint2(destinationEndpoint2);

			MigrationMode3 migrationMode3 = new MigrationMode3();
			migrationMode3.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.StructureInitialization"));
			migrationMode3.setDataInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.DataInitialization"));
			migrationMode3.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.DataSynchronization"));
			reverseJob.setMigrationMode3(migrationMode3);

			PrecheckStatus4 precheckStatus4 = new PrecheckStatus4();
			precheckStatus4.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Status"));
			precheckStatus4.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Percent"));
			precheckStatus4.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.ErrorMessage"));

			List<PrecheckDetail10> detail9 = new ArrayList<PrecheckDetail10>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail.Length"); j++) {
				PrecheckDetail10 precheckDetail10 = new PrecheckDetail10();
				precheckDetail10.setCheckItem(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItem"));
				precheckDetail10.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				precheckDetail10.setCheckResult(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckResult"));
				precheckDetail10.setFailedReason(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].FailedReason"));
				precheckDetail10.setRepairMethod(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].RepairMethod"));

				detail9.add(precheckDetail10);
			}
			precheckStatus4.setDetail9(detail9);
			reverseJob.setPrecheckStatus4(precheckStatus4);

			StructureInitializationStatus5 structureInitializationStatus5 = new StructureInitializationStatus5();
			structureInitializationStatus5.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Status"));
			structureInitializationStatus5.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus5.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Percent"));
			structureInitializationStatus5.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Progress"));
			reverseJob.setStructureInitializationStatus5(structureInitializationStatus5);

			DataInitializationStatus6 dataInitializationStatus6 = new DataInitializationStatus6();
			dataInitializationStatus6.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Status"));
			dataInitializationStatus6.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus6.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Percent"));
			dataInitializationStatus6.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Progress"));
			reverseJob.setDataInitializationStatus6(dataInitializationStatus6);

			DataSynchronizationStatus7 dataSynchronizationStatus7 = new DataSynchronizationStatus7();
			dataSynchronizationStatus7.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Status"));
			dataSynchronizationStatus7.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus7.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus7.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Progress"));
			reverseJob.setDataSynchronizationStatus7(dataSynchronizationStatus7);

			Performance8 performance8 = new Performance8();
			performance8.setRps(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Performance.Rps"));
			performance8.setFlow(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Performance.Flow"));
			reverseJob.setPerformance8(performance8);
			dtsJobStatus.setReverseJob(reverseJob);

			List<DtsTag> tagList = new ArrayList<DtsTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].TagList.Length"); j++) {
				DtsTag dtsTag = new DtsTag();
				dtsTag.setTagKey(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].TagList["+ j +"].TagKey"));
				dtsTag.setTagValue(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].TagList["+ j +"].TagValue"));

				tagList.add(dtsTag);
			}
			dtsJobStatus.setTagList(tagList);

			dtsJobList.add(dtsJobStatus);
		}
		describeDtsJobsResponse.setDtsJobList(dtsJobList);
	 
	 	return describeDtsJobsResponse;
	}
}