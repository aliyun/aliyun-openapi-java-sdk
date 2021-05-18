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
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataEtlStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DestinationEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DtsTag;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.MigrationMode;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.Performance;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.PrecheckStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.PrecheckStatus.PrecheckDetail;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DataInitializationStatus1;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DataSynchronizationStatus2;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DestinationEndpoint3;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.MigrationMode4;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.Performance5;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.PrecheckStatus6;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.PrecheckStatus6.PrecheckDetail10;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.SourceEndpoint7;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.StructureInitializationStatus8;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.StructureInitializationStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDtsJobsResponseUnmarshaller {

	public static DescribeDtsJobsResponse unmarshall(DescribeDtsJobsResponse describeDtsJobsResponse, UnmarshallerContext _ctx) {
		
		describeDtsJobsResponse.setRequestId(_ctx.stringValue("DescribeDtsJobsResponse.RequestId"));
		describeDtsJobsResponse.setDynamicCode(_ctx.stringValue("DescribeDtsJobsResponse.DynamicCode"));
		describeDtsJobsResponse.setDynamicMessage(_ctx.stringValue("DescribeDtsJobsResponse.DynamicMessage"));
		describeDtsJobsResponse.setErrCode(_ctx.stringValue("DescribeDtsJobsResponse.ErrCode"));
		describeDtsJobsResponse.setErrMessage(_ctx.stringValue("DescribeDtsJobsResponse.ErrMessage"));
		describeDtsJobsResponse.setHttpStatusCode(_ctx.integerValue("DescribeDtsJobsResponse.HttpStatusCode"));
		describeDtsJobsResponse.setPageNumber(_ctx.integerValue("DescribeDtsJobsResponse.PageNumber"));
		describeDtsJobsResponse.setPageRecordCount(_ctx.integerValue("DescribeDtsJobsResponse.PageRecordCount"));
		describeDtsJobsResponse.setSuccess(_ctx.booleanValue("DescribeDtsJobsResponse.Success"));
		describeDtsJobsResponse.setTotalRecordCount(_ctx.integerValue("DescribeDtsJobsResponse.TotalRecordCount"));

		List<DtsJobStatus> dtsJobList = new ArrayList<DtsJobStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList.Length"); i++) {
			DtsJobStatus dtsJobStatus = new DtsJobStatus();
			dtsJobStatus.setCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Checkpoint"));
			dtsJobStatus.setCreateTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].CreateTime"));
			dtsJobStatus.setDbObject(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DbObject"));
			dtsJobStatus.setDelay(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Delay"));
			dtsJobStatus.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsInstanceID"));
			dtsJobStatus.setDtsJobClass(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobClass"));
			dtsJobStatus.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobDirection"));
			dtsJobStatus.setDtsJobId(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobId"));
			dtsJobStatus.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobName"));
			dtsJobStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ErrorMessage"));
			dtsJobStatus.setExpireTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ExpireTime"));
			dtsJobStatus.setPayType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PayType"));
			dtsJobStatus.setReserved(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Reserved"));
			dtsJobStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Status"));
			dtsJobStatus.setConsumptionClient(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ConsumptionClient"));
			dtsJobStatus.setBeginTimestamp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].BeginTimestamp"));
			dtsJobStatus.setEndTimestamp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].EndTimestamp"));
			dtsJobStatus.setConsumptionCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ConsumptionCheckpoint"));
			dtsJobStatus.setAppName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].AppName"));

			DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
			dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Percent"));
			dataInitializationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Progress"));
			dataInitializationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Status"));
			dtsJobStatus.setDataInitializationStatus(dataInitializationStatus);

			DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
			dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Status"));
			dtsJobStatus.setDataSynchronizationStatus(dataSynchronizationStatus);

			DataEtlStatus dataEtlStatus = new DataEtlStatus();
			dataEtlStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataEtlStatus.ErrorMessage"));
			dataEtlStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataEtlStatus.Percent"));
			dataEtlStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataEtlStatus.Progress"));
			dataEtlStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataEtlStatus.Status"));
			dtsJobStatus.setDataEtlStatus(dataEtlStatus);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Ip"));
			destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Region"));
			destinationEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.UserName"));
			dtsJobStatus.setDestinationEndpoint(destinationEndpoint);

			MigrationMode migrationMode = new MigrationMode();
			migrationMode.setDataInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.DataInitialization"));
			migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.DataSynchronization"));
			migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.StructureInitialization"));
			dtsJobStatus.setMigrationMode(migrationMode);

			Performance performance = new Performance();
			performance.setFlow(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Performance.Flow"));
			performance.setRps(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Performance.Rps"));
			dtsJobStatus.setPerformance(performance);

			PrecheckStatus precheckStatus = new PrecheckStatus();
			precheckStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.ErrorMessage"));
			precheckStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Percent"));
			precheckStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Status"));

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

			ReverseJob reverseJob = new ReverseJob();
			reverseJob.setCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Checkpoint"));
			reverseJob.setCreateTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.CreateTime"));
			reverseJob.setDbObject(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DbObject"));
			reverseJob.setDelay(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Delay"));
			reverseJob.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsInstanceID"));
			reverseJob.setDtsJobClass(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobClass"));
			reverseJob.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobDirection"));
			reverseJob.setDtsJobId(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobId"));
			reverseJob.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobName"));
			reverseJob.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.ErrorMessage"));
			reverseJob.setExpireTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.ExpireTime"));
			reverseJob.setPayType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PayType"));
			reverseJob.setReserved(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Reserved"));
			reverseJob.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Status"));

			DataInitializationStatus1 dataInitializationStatus1 = new DataInitializationStatus1();
			dataInitializationStatus1.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus1.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Percent"));
			dataInitializationStatus1.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Progress"));
			dataInitializationStatus1.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Status"));
			reverseJob.setDataInitializationStatus1(dataInitializationStatus1);

			DataSynchronizationStatus2 dataSynchronizationStatus2 = new DataSynchronizationStatus2();
			dataSynchronizationStatus2.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus2.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus2.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus2.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Status"));
			reverseJob.setDataSynchronizationStatus2(dataSynchronizationStatus2);

			DestinationEndpoint3 destinationEndpoint3 = new DestinationEndpoint3();
			destinationEndpoint3.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.DatabaseName"));
			destinationEndpoint3.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.EngineName"));
			destinationEndpoint3.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.InstanceID"));
			destinationEndpoint3.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.InstanceType"));
			destinationEndpoint3.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Ip"));
			destinationEndpoint3.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.OracleSID"));
			destinationEndpoint3.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Port"));
			destinationEndpoint3.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Region"));
			destinationEndpoint3.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint3.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.UserName"));
			reverseJob.setDestinationEndpoint3(destinationEndpoint3);

			MigrationMode4 migrationMode4 = new MigrationMode4();
			migrationMode4.setDataInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.DataInitialization"));
			migrationMode4.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.DataSynchronization"));
			migrationMode4.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.StructureInitialization"));
			reverseJob.setMigrationMode4(migrationMode4);

			Performance5 performance5 = new Performance5();
			performance5.setFlow(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Performance.Flow"));
			performance5.setRps(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Performance.Rps"));
			reverseJob.setPerformance5(performance5);

			PrecheckStatus6 precheckStatus6 = new PrecheckStatus6();
			precheckStatus6.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.ErrorMessage"));
			precheckStatus6.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Percent"));
			precheckStatus6.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Status"));

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
			precheckStatus6.setDetail9(detail9);
			reverseJob.setPrecheckStatus6(precheckStatus6);

			SourceEndpoint7 sourceEndpoint7 = new SourceEndpoint7();
			sourceEndpoint7.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.DatabaseName"));
			sourceEndpoint7.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.EngineName"));
			sourceEndpoint7.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.InstanceID"));
			sourceEndpoint7.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.InstanceType"));
			sourceEndpoint7.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Ip"));
			sourceEndpoint7.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.OracleSID"));
			sourceEndpoint7.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Port"));
			sourceEndpoint7.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Region"));
			sourceEndpoint7.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint7.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.UserName"));
			reverseJob.setSourceEndpoint7(sourceEndpoint7);

			StructureInitializationStatus8 structureInitializationStatus8 = new StructureInitializationStatus8();
			structureInitializationStatus8.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus8.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Percent"));
			structureInitializationStatus8.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Progress"));
			structureInitializationStatus8.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Status"));
			reverseJob.setStructureInitializationStatus8(structureInitializationStatus8);
			dtsJobStatus.setReverseJob(reverseJob);

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Ip"));
			sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Region"));
			sourceEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.UserName"));
			dtsJobStatus.setSourceEndpoint(sourceEndpoint);

			StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
			structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Percent"));
			structureInitializationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Progress"));
			structureInitializationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Status"));
			dtsJobStatus.setStructureInitializationStatus(structureInitializationStatus);

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