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

		List<DtsJobStatus> dtsJobList = new ArrayList<DtsJobStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsJobsResponse.DtsJobList.Length"); i++) {
			DtsJobStatus dtsJobStatus = new DtsJobStatus();
			dtsJobStatus.setStatus(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Status"));
			dtsJobStatus.setDtsJobName(_ctx.stringValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].DtsJobName"));
			dtsJobStatus.setDelay(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].Delay"));
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
			reverseJob.setDelay(_ctx.integerValue("DescribeDtsJobsResponse.DtsJobList["+ i +"].ReverseJob.Delay"));
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
	 
	 	return describeDtsJobsResponse;
	}
}