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
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.RetryState;
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
		describeDtsJobsResponse.setHttpStatusCode(_ctx.integerValue("DescribeDtsJobsResponse.HttpStatusCode"));
		describeDtsJobsResponse.setErrCode(_ctx.stringValue("DescribeDtsJobsResponse.ErrCode"));
		describeDtsJobsResponse.setSuccess(_ctx.booleanValue("DescribeDtsJobsResponse.Success"));
		describeDtsJobsResponse.setPageRecordCount(_ctx.integerValue("DescribeDtsJobsResponse.PageRecordCount"));
		describeDtsJobsResponse.setTotalRecordCount(_ctx.integerValue("DescribeDtsJobsResponse.TotalRecordCount"));
		describeDtsJobsResponse.setErrMessage(_ctx.stringValue("DescribeDtsJobsResponse.ErrMessage"));
		describeDtsJobsResponse.setDynamicMessage(_ctx.stringValue("DescribeDtsJobsResponse.DynamicMessage"));
		describeDtsJobsResponse.setPageNumber(_ctx.integerValue("DescribeDtsJobsResponse.PageNumber"));
		describeDtsJobsResponse.setDynamicCode(_ctx.stringValue("DescribeDtsJobsResponse.DynamicCode"));
		describeDtsJobsResponse.setJobType(_ctx.stringValue("DescribeDtsJobsResponse.JobType"));

		List<DtsJobStatus> dtsJobList = new ArrayList<DtsJobStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList.Length"); i++) {
			DtsJobStatus dtsJobStatus = new DtsJobStatus();
			dtsJobStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Status"));
			dtsJobStatus.setOriginType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].OriginType"));
			dtsJobStatus.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobName"));
			dtsJobStatus.setDelay(_ctx.longValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Delay"));
			dtsJobStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ErrorMessage"));
			dtsJobStatus.setExpireTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ExpireTime"));
			dtsJobStatus.setDtsJobId(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobId"));
			dtsJobStatus.setCreateTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].CreateTime"));
			dtsJobStatus.setPayType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PayType"));
			dtsJobStatus.setReserved(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Reserved"));
			dtsJobStatus.setConsumptionClient(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ConsumptionClient"));
			dtsJobStatus.setDbObject(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DbObject"));
			dtsJobStatus.setDtsJobClass(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobClass"));
			dtsJobStatus.setConsumptionCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ConsumptionCheckpoint"));
			dtsJobStatus.setEndTimestamp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].EndTimestamp"));
			dtsJobStatus.setAppName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].AppName"));
			dtsJobStatus.setBeginTimestamp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].BeginTimestamp"));
			dtsJobStatus.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsInstanceID"));
			dtsJobStatus.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobDirection"));
			dtsJobStatus.setCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Checkpoint"));

			DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
			dataInitializationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Status"));
			dataInitializationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Percent"));
			dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataInitializationStatus.Progress"));
			dtsJobStatus.setDataInitializationStatus(dataInitializationStatus);

			DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
			dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Status"));
			dataSynchronizationStatus.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.NeedUpgrade"));
			dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataSynchronizationStatus.ErrorMessage"));
			dtsJobStatus.setDataSynchronizationStatus(dataSynchronizationStatus);

			DataEtlStatus dataEtlStatus = new DataEtlStatus();
			dataEtlStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataEtlStatus.Status"));
			dataEtlStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataEtlStatus.Percent"));
			dataEtlStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataEtlStatus.ErrorMessage"));
			dataEtlStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DataEtlStatus.Progress"));
			dtsJobStatus.setDataEtlStatus(dataEtlStatus);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Region"));
			destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Ip"));
			destinationEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.UserName"));
			destinationEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DestinationEndpoint.EngineName"));
			dtsJobStatus.setDestinationEndpoint(destinationEndpoint);

			MigrationMode migrationMode = new MigrationMode();
			migrationMode.setDataInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.DataInitialization"));
			migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.DataSynchronization"));
			migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].MigrationMode.StructureInitialization"));
			dtsJobStatus.setMigrationMode(migrationMode);

			Performance performance = new Performance();
			performance.setRps(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Performance.Rps"));
			performance.setFlow(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Performance.Flow"));
			dtsJobStatus.setPerformance(performance);

			PrecheckStatus precheckStatus = new PrecheckStatus();
			precheckStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Status"));
			precheckStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Percent"));
			precheckStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.ErrorMessage"));

			List<PrecheckDetail> detail = new ArrayList<PrecheckDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail.Length"); j++) {
				PrecheckDetail precheckDetail = new PrecheckDetail();
				precheckDetail.setCheckResult(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckResult"));
				precheckDetail.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				precheckDetail.setCheckItem(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItem"));
				precheckDetail.setRepairMethod(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].RepairMethod"));
				precheckDetail.setFailedReason(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].PrecheckStatus.Detail["+ j +"].FailedReason"));

				detail.add(precheckDetail);
			}
			precheckStatus.setDetail(detail);
			dtsJobStatus.setPrecheckStatus(precheckStatus);

			ReverseJob reverseJob = new ReverseJob();
			reverseJob.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Status"));
			reverseJob.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobName"));
			reverseJob.setDelay(_ctx.longValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Delay"));
			reverseJob.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.ErrorMessage"));
			reverseJob.setDtsJobId(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobId"));
			reverseJob.setExpireTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.ExpireTime"));
			reverseJob.setCreateTime(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.CreateTime"));
			reverseJob.setPayType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PayType"));
			reverseJob.setReserved(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Reserved"));
			reverseJob.setDbObject(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DbObject"));
			reverseJob.setDtsJobClass(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobClass"));
			reverseJob.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsInstanceID"));
			reverseJob.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DtsJobDirection"));
			reverseJob.setCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Checkpoint"));

			DataInitializationStatus1 dataInitializationStatus1 = new DataInitializationStatus1();
			dataInitializationStatus1.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Status"));
			dataInitializationStatus1.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Percent"));
			dataInitializationStatus1.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus1.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataInitializationStatus.Progress"));
			reverseJob.setDataInitializationStatus1(dataInitializationStatus1);

			DataSynchronizationStatus2 dataSynchronizationStatus2 = new DataSynchronizationStatus2();
			dataSynchronizationStatus2.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Status"));
			dataSynchronizationStatus2.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.NeedUpgrade"));
			dataSynchronizationStatus2.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus2.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus2.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DataSynchronizationStatus.ErrorMessage"));
			reverseJob.setDataSynchronizationStatus2(dataSynchronizationStatus2);

			DestinationEndpoint3 destinationEndpoint3 = new DestinationEndpoint3();
			destinationEndpoint3.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint3.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.OracleSID"));
			destinationEndpoint3.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Region"));
			destinationEndpoint3.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.DatabaseName"));
			destinationEndpoint3.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Ip"));
			destinationEndpoint3.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.InstanceID"));
			destinationEndpoint3.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.Port"));
			destinationEndpoint3.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.InstanceType"));
			destinationEndpoint3.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.UserName"));
			destinationEndpoint3.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.DestinationEndpoint.EngineName"));
			reverseJob.setDestinationEndpoint3(destinationEndpoint3);

			MigrationMode4 migrationMode4 = new MigrationMode4();
			migrationMode4.setDataInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.DataInitialization"));
			migrationMode4.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.DataSynchronization"));
			migrationMode4.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.MigrationMode.StructureInitialization"));
			reverseJob.setMigrationMode4(migrationMode4);

			Performance5 performance5 = new Performance5();
			performance5.setRps(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Performance.Rps"));
			performance5.setFlow(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Performance.Flow"));
			reverseJob.setPerformance5(performance5);

			PrecheckStatus6 precheckStatus6 = new PrecheckStatus6();
			precheckStatus6.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Status"));
			precheckStatus6.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Percent"));
			precheckStatus6.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.ErrorMessage"));

			List<PrecheckDetail10> detail9 = new ArrayList<PrecheckDetail10>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail.Length"); j++) {
				PrecheckDetail10 precheckDetail10 = new PrecheckDetail10();
				precheckDetail10.setCheckResult(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckResult"));
				precheckDetail10.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				precheckDetail10.setCheckItem(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItem"));
				precheckDetail10.setRepairMethod(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].RepairMethod"));
				precheckDetail10.setFailedReason(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].FailedReason"));

				detail9.add(precheckDetail10);
			}
			precheckStatus6.setDetail9(detail9);
			reverseJob.setPrecheckStatus6(precheckStatus6);

			SourceEndpoint7 sourceEndpoint7 = new SourceEndpoint7();
			sourceEndpoint7.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint7.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.OracleSID"));
			sourceEndpoint7.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Region"));
			sourceEndpoint7.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.DatabaseName"));
			sourceEndpoint7.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Ip"));
			sourceEndpoint7.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.InstanceID"));
			sourceEndpoint7.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.Port"));
			sourceEndpoint7.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.InstanceType"));
			sourceEndpoint7.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.UserName"));
			sourceEndpoint7.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.SourceEndpoint.EngineName"));
			reverseJob.setSourceEndpoint7(sourceEndpoint7);

			StructureInitializationStatus8 structureInitializationStatus8 = new StructureInitializationStatus8();
			structureInitializationStatus8.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Status"));
			structureInitializationStatus8.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Percent"));
			structureInitializationStatus8.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus8.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.StructureInitializationStatus.Progress"));
			reverseJob.setStructureInitializationStatus8(structureInitializationStatus8);
			dtsJobStatus.setReverseJob(reverseJob);

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Region"));
			sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint.setIp(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Ip"));
			sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setPort(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.UserName"));
			sourceEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].SourceEndpoint.EngineName"));
			dtsJobStatus.setSourceEndpoint(sourceEndpoint);

			StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
			structureInitializationStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Status"));
			structureInitializationStatus.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Percent"));
			structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].StructureInitializationStatus.Progress"));
			dtsJobStatus.setStructureInitializationStatus(structureInitializationStatus);

			RetryState retryState = new RetryState();
			retryState.setRetryCount(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].RetryState.RetryCount"));
			retryState.setMaxRetryTime(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].RetryState.MaxRetryTime"));
			retryState.setErrMessage(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].RetryState.ErrMessage"));
			retryState.setRetryTarget(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].RetryState.RetryTarget"));
			retryState.setRetryTime(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].RetryState.RetryTime"));
			dtsJobStatus.setRetryState(retryState);

			List<DtsTag> tagList = new ArrayList<DtsTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].TagList.Length"); j++) {
				DtsTag dtsTag = new DtsTag();
				dtsTag.setTagValue(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].TagList["+ j +"].TagValue"));
				dtsTag.setTagKey(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].TagList["+ j +"].TagKey"));

				tagList.add(dtsTag);
			}
			dtsJobStatus.setTagList(tagList);

			dtsJobList.add(dtsJobStatus);
		}
		describeDtsJobsResponse.setDtsJobList(dtsJobList);

		List<DtsJobStatus> etlDemoList = new ArrayList<DtsJobStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsJobsResponse.EtlDemoList.Length"); i++) {
			DtsJobStatus dtsJobStatus1 = new DtsJobStatus();
			dtsJobStatus1.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].Status"));
			dtsJobStatus1.setOriginType(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].OriginType"));
			dtsJobStatus1.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DtsJobName"));
			dtsJobStatus1.setDelay(_ctx.longValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].Delay"));
			dtsJobStatus1.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ErrorMessage"));
			dtsJobStatus1.setExpireTime(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ExpireTime"));
			dtsJobStatus1.setDtsJobId(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DtsJobId"));
			dtsJobStatus1.setCreateTime(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].CreateTime"));
			dtsJobStatus1.setPayType(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PayType"));
			dtsJobStatus1.setReserved(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].Reserved"));
			dtsJobStatus1.setConsumptionClient(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ConsumptionClient"));
			dtsJobStatus1.setDbObject(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DbObject"));
			dtsJobStatus1.setDtsJobClass(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DtsJobClass"));
			dtsJobStatus1.setConsumptionCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ConsumptionCheckpoint"));
			dtsJobStatus1.setEndTimestamp(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].EndTimestamp"));
			dtsJobStatus1.setAppName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].AppName"));
			dtsJobStatus1.setBeginTimestamp(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].BeginTimestamp"));
			dtsJobStatus1.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DtsInstanceID"));
			dtsJobStatus1.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DtsJobDirection"));
			dtsJobStatus1.setCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].Checkpoint"));

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataInitializationStatus dataInitializationStatus2 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataInitializationStatus();
			dataInitializationStatus2.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataInitializationStatus.Status"));
			dataInitializationStatus2.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataInitializationStatus.Percent"));
			dataInitializationStatus2.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus2.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataInitializationStatus.Progress"));
			dtsJobStatus1.setDataInitializationStatus(dataInitializationStatus2);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataSynchronizationStatus dataSynchronizationStatus2 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataSynchronizationStatus();
			dataSynchronizationStatus2.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataSynchronizationStatus.Status"));
			dataSynchronizationStatus2.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataSynchronizationStatus.NeedUpgrade"));
			dataSynchronizationStatus2.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus2.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus2.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataSynchronizationStatus.ErrorMessage"));
			dtsJobStatus1.setDataSynchronizationStatus(dataSynchronizationStatus2);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataEtlStatus dataEtlStatus1 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DataEtlStatus();
			dataEtlStatus1.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataEtlStatus.Status"));
			dataEtlStatus1.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataEtlStatus.Percent"));
			dataEtlStatus1.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataEtlStatus.ErrorMessage"));
			dataEtlStatus1.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DataEtlStatus.Progress"));
			dtsJobStatus1.setDataEtlStatus(dataEtlStatus1);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DestinationEndpoint destinationEndpoint2 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DestinationEndpoint();
			destinationEndpoint2.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint2.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint2.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.Region"));
			destinationEndpoint2.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint2.setIp(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.Ip"));
			destinationEndpoint2.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint2.setPort(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint2.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint2.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.UserName"));
			destinationEndpoint2.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].DestinationEndpoint.EngineName"));
			dtsJobStatus1.setDestinationEndpoint(destinationEndpoint2);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.MigrationMode migrationMode2 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.MigrationMode();
			migrationMode2.setDataInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].MigrationMode.DataInitialization"));
			migrationMode2.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].MigrationMode.DataSynchronization"));
			migrationMode2.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].MigrationMode.StructureInitialization"));
			dtsJobStatus1.setMigrationMode(migrationMode2);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.Performance performance2 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.Performance();
			performance2.setRps(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].Performance.Rps"));
			performance2.setFlow(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].Performance.Flow"));
			dtsJobStatus1.setPerformance(performance2);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.PrecheckStatus precheckStatus2 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.PrecheckStatus();
			precheckStatus2.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.Status"));
			precheckStatus2.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.Percent"));
			precheckStatus2.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.ErrorMessage"));

			List<PrecheckDetail> detail2 = new ArrayList<PrecheckDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.Detail.Length"); j++) {
				com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.PrecheckStatus.PrecheckDetail precheckDetail2 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.PrecheckStatus.PrecheckDetail();
				precheckDetail2.setCheckResult(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckResult"));
				precheckDetail2.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				precheckDetail2.setCheckItem(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItem"));
				precheckDetail2.setRepairMethod(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.Detail["+ j +"].RepairMethod"));
				precheckDetail2.setFailedReason(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].PrecheckStatus.Detail["+ j +"].FailedReason"));

				detail2.add(precheckDetail2);
			}
			precheckStatus2.setDetail(detail2);
			dtsJobStatus1.setPrecheckStatus(precheckStatus2);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob reverseJob1 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob();
			reverseJob1.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.Status"));
			reverseJob1.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DtsJobName"));
			reverseJob1.setDelay(_ctx.longValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.Delay"));
			reverseJob1.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.ErrorMessage"));
			reverseJob1.setDtsJobId(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DtsJobId"));
			reverseJob1.setExpireTime(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.ExpireTime"));
			reverseJob1.setCreateTime(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.CreateTime"));
			reverseJob1.setPayType(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PayType"));
			reverseJob1.setReserved(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.Reserved"));
			reverseJob1.setDbObject(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DbObject"));
			reverseJob1.setDtsJobClass(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DtsJobClass"));
			reverseJob1.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DtsInstanceID"));
			reverseJob1.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DtsJobDirection"));
			reverseJob1.setCheckpoint(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.Checkpoint"));

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DataInitializationStatus1 dataInitializationStatus11 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DataInitializationStatus1();
			dataInitializationStatus11.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataInitializationStatus.Status"));
			dataInitializationStatus11.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataInitializationStatus.Percent"));
			dataInitializationStatus11.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus11.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataInitializationStatus.Progress"));
			reverseJob1.setDataInitializationStatus1(dataInitializationStatus11);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DataSynchronizationStatus2 dataSynchronizationStatus22 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DataSynchronizationStatus2();
			dataSynchronizationStatus22.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataSynchronizationStatus.Status"));
			dataSynchronizationStatus22.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataSynchronizationStatus.NeedUpgrade"));
			dataSynchronizationStatus22.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus22.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus22.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DataSynchronizationStatus.ErrorMessage"));
			reverseJob1.setDataSynchronizationStatus2(dataSynchronizationStatus22);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DestinationEndpoint3 destinationEndpoint31 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.DestinationEndpoint3();
			destinationEndpoint31.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint31.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.OracleSID"));
			destinationEndpoint31.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.Region"));
			destinationEndpoint31.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.DatabaseName"));
			destinationEndpoint31.setIp(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.Ip"));
			destinationEndpoint31.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.InstanceID"));
			destinationEndpoint31.setPort(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.Port"));
			destinationEndpoint31.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.InstanceType"));
			destinationEndpoint31.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.UserName"));
			destinationEndpoint31.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.DestinationEndpoint.EngineName"));
			reverseJob1.setDestinationEndpoint3(destinationEndpoint31);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.MigrationMode4 migrationMode41 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.MigrationMode4();
			migrationMode41.setDataInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.MigrationMode.DataInitialization"));
			migrationMode41.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.MigrationMode.DataSynchronization"));
			migrationMode41.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.MigrationMode.StructureInitialization"));
			reverseJob1.setMigrationMode4(migrationMode41);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.Performance5 performance51 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.Performance5();
			performance51.setRps(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.Performance.Rps"));
			performance51.setFlow(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.Performance.Flow"));
			reverseJob1.setPerformance5(performance51);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.PrecheckStatus6 precheckStatus61 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.PrecheckStatus6();
			precheckStatus61.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.Status"));
			precheckStatus61.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.Percent"));
			precheckStatus61.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.ErrorMessage"));

			List<PrecheckDetail10> detail91 = new ArrayList<PrecheckDetail10>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.Detail.Length"); j++) {
				com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.PrecheckStatus6.PrecheckDetail10 precheckDetail101 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.PrecheckStatus6.PrecheckDetail10();
				precheckDetail101.setCheckResult(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckResult"));
				precheckDetail101.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				precheckDetail101.setCheckItem(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItem"));
				precheckDetail101.setRepairMethod(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].RepairMethod"));
				precheckDetail101.setFailedReason(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].FailedReason"));

				detail91.add(precheckDetail101);
			}
			precheckStatus61.setDetail9(detail91);
			reverseJob1.setPrecheckStatus6(precheckStatus61);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.SourceEndpoint7 sourceEndpoint71 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.SourceEndpoint7();
			sourceEndpoint71.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint71.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.OracleSID"));
			sourceEndpoint71.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.Region"));
			sourceEndpoint71.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.DatabaseName"));
			sourceEndpoint71.setIp(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.Ip"));
			sourceEndpoint71.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.InstanceID"));
			sourceEndpoint71.setPort(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.Port"));
			sourceEndpoint71.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.InstanceType"));
			sourceEndpoint71.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.UserName"));
			sourceEndpoint71.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.SourceEndpoint.EngineName"));
			reverseJob1.setSourceEndpoint7(sourceEndpoint71);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.StructureInitializationStatus8 structureInitializationStatus81 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.ReverseJob.StructureInitializationStatus8();
			structureInitializationStatus81.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.StructureInitializationStatus.Status"));
			structureInitializationStatus81.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.StructureInitializationStatus.Percent"));
			structureInitializationStatus81.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus81.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].ReverseJob.StructureInitializationStatus.Progress"));
			reverseJob1.setStructureInitializationStatus8(structureInitializationStatus81);
			dtsJobStatus1.setReverseJob(reverseJob1);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.SourceEndpoint sourceEndpoint3 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.SourceEndpoint();
			sourceEndpoint3.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint3.setOracleSID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint3.setRegion(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.Region"));
			sourceEndpoint3.setDatabaseName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint3.setIp(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.Ip"));
			sourceEndpoint3.setInstanceID(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint3.setPort(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint3.setInstanceType(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint3.setUserName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.UserName"));
			sourceEndpoint3.setEngineName(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].SourceEndpoint.EngineName"));
			dtsJobStatus1.setSourceEndpoint(sourceEndpoint3);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.StructureInitializationStatus structureInitializationStatus3 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.StructureInitializationStatus();
			structureInitializationStatus3.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].StructureInitializationStatus.Status"));
			structureInitializationStatus3.setPercent(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].StructureInitializationStatus.Percent"));
			structureInitializationStatus3.setErrorMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus3.setProgress(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].StructureInitializationStatus.Progress"));
			dtsJobStatus1.setStructureInitializationStatus(structureInitializationStatus3);

			com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.RetryState retryState1 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.RetryState();
			retryState1.setRetryCount(_ctx.integerValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].RetryState.RetryCount"));
			retryState1.setMaxRetryTime(_ctx.integerValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].RetryState.MaxRetryTime"));
			retryState1.setErrMessage(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].RetryState.ErrMessage"));
			retryState1.setRetryTarget(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].RetryState.RetryTarget"));
			retryState1.setRetryTime(_ctx.integerValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].RetryState.RetryTime"));
			dtsJobStatus1.setRetryState(retryState1);

			List<DtsTag> tagList1 = new ArrayList<DtsTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].TagList.Length"); j++) {
				com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DtsTag dtsTag1 = new com.aliyuncs.dts.model.v20200101.DescribeDtsJobsResponse.DtsJobStatus.DtsTag();
				dtsTag1.setTagValue(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].TagList["+ j +"].TagValue"));
				dtsTag1.setTagKey(_ctx.stringValue("DescribeDtsJobsResponse.EtlDemoList["+ i +"].TagList["+ j +"].TagKey"));

				tagList1.add(dtsTag1);
			}
			dtsJobStatus1.setTagList(tagList1);

			etlDemoList.add(dtsJobStatus1);
		}
		describeDtsJobsResponse.setEtlDemoList(etlDemoList);
	 
	 	return describeDtsJobsResponse;
	}
}