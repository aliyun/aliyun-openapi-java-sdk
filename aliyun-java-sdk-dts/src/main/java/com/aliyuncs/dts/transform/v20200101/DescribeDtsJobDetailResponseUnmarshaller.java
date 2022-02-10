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

import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.DestinationEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.MigrationMode;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.DataEtlStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.DataInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.DestinationEndpoint3;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.MigrationMode4;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.Performance;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.PrecheckStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.PrecheckStatus.DetailItem;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.RetryState;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.DataEtlStatus14;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.DataInitializationStatus12;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.DataSynchronizationStatus13;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.DestinationEndpoint8;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.MigrationMode9;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.Performance15;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.PrecheckStatus10;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.PrecheckStatus10.DetailItem22;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.RetryState18;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.SourceEndpoint7;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.StructureInitializationStatus11;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.SubscriptionDataType17;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.SubscriptionHost16;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.ReverseJob.TagListItem20;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.SourceEndpoint2;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.StructureInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.SubscriptionDataType6;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.SubscriptionHost5;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubDistributedJobItem.TagListItem;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.DataEtlStatus31;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.DataInitializationStatus29;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.DataSynchronizationStatus30;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.DestinationEndpoint25;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.MigrationMode26;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.Performance32;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.PrecheckStatus27;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.PrecheckStatus27.DetailItem40;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.RetryState36;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.DataEtlStatus48;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.DataInitializationStatus46;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.DataSynchronizationStatus47;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.DestinationEndpoint42;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.MigrationMode43;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.Performance49;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.PrecheckStatus44;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.PrecheckStatus44.DetailItem56;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.RetryState52;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.SourceEndpoint41;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.StructureInitializationStatus45;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.SubscriptionDataType51;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.SubscriptionHost50;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.ReverseJob33.TagListItem54;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.SourceEndpoint24;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.StructureInitializationStatus28;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.SubscriptionDataType35;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.SubscriptionHost34;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubSyncJobItem.TagListItem38;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubscriptionDataType;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SubscriptionHost;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDtsJobDetailResponseUnmarshaller {

	public static DescribeDtsJobDetailResponse unmarshall(DescribeDtsJobDetailResponse describeDtsJobDetailResponse, UnmarshallerContext _ctx) {
		
		describeDtsJobDetailResponse.setRequestId(_ctx.stringValue("DescribeDtsJobDetailResponse.RequestId"));
		describeDtsJobDetailResponse.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.Status"));
		describeDtsJobDetailResponse.setDtsJobName(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsJobName"));
		describeDtsJobDetailResponse.setFinishTime(_ctx.stringValue("DescribeDtsJobDetailResponse.FinishTime"));
		describeDtsJobDetailResponse.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.ErrorMessage"));
		describeDtsJobDetailResponse.setDtsJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsJobId"));
		describeDtsJobDetailResponse.setCreateTime(_ctx.stringValue("DescribeDtsJobDetailResponse.CreateTime"));
		describeDtsJobDetailResponse.setPayType(_ctx.stringValue("DescribeDtsJobDetailResponse.PayType"));
		describeDtsJobDetailResponse.setReserved(_ctx.stringValue("DescribeDtsJobDetailResponse.Reserved"));
		describeDtsJobDetailResponse.setDatabaseCount(_ctx.integerValue("DescribeDtsJobDetailResponse.DatabaseCount"));
		describeDtsJobDetailResponse.setDtsJobClass(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsJobClass"));
		describeDtsJobDetailResponse.setEndTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.EndTimestamp"));
		describeDtsJobDetailResponse.setAppName(_ctx.stringValue("DescribeDtsJobDetailResponse.AppName"));
		describeDtsJobDetailResponse.setDestNetType(_ctx.stringValue("DescribeDtsJobDetailResponse.DestNetType"));
		describeDtsJobDetailResponse.setSubscribeTopic(_ctx.stringValue("DescribeDtsJobDetailResponse.SubscribeTopic"));
		describeDtsJobDetailResponse.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsInstanceID"));
		describeDtsJobDetailResponse.setCode(_ctx.integerValue("DescribeDtsJobDetailResponse.Code"));
		describeDtsJobDetailResponse.setCheckpoint(_ctx.longValue("DescribeDtsJobDetailResponse.Checkpoint"));
		describeDtsJobDetailResponse.setDelay(_ctx.longValue("DescribeDtsJobDetailResponse.Delay"));
		describeDtsJobDetailResponse.setExpireTime(_ctx.stringValue("DescribeDtsJobDetailResponse.ExpireTime"));
		describeDtsJobDetailResponse.setErrCode(_ctx.stringValue("DescribeDtsJobDetailResponse.ErrCode"));
		describeDtsJobDetailResponse.setSuccess(_ctx.booleanValue("DescribeDtsJobDetailResponse.Success"));
		describeDtsJobDetailResponse.setErrMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.ErrMessage"));
		describeDtsJobDetailResponse.setConsumptionClient(_ctx.stringValue("DescribeDtsJobDetailResponse.ConsumptionClient"));
		describeDtsJobDetailResponse.setDbObject(_ctx.stringValue("DescribeDtsJobDetailResponse.DbObject"));
		describeDtsJobDetailResponse.setDynamicMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.DynamicMessage"));
		describeDtsJobDetailResponse.setConsumptionCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.ConsumptionCheckpoint"));
		describeDtsJobDetailResponse.setEtlCalculator(_ctx.stringValue("DescribeDtsJobDetailResponse.EtlCalculator"));
		describeDtsJobDetailResponse.setHttpStatusCode(_ctx.integerValue("DescribeDtsJobDetailResponse.HttpStatusCode"));
		describeDtsJobDetailResponse.setBeginTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.BeginTimestamp"));
		describeDtsJobDetailResponse.setGroupId(_ctx.stringValue("DescribeDtsJobDetailResponse.GroupId"));
		describeDtsJobDetailResponse.setSynchronizationDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SynchronizationDirection"));
		describeDtsJobDetailResponse.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsJobDirection"));
		describeDtsJobDetailResponse.setDemoJob(_ctx.booleanValue("DescribeDtsJobDetailResponse.DemoJob"));
		describeDtsJobDetailResponse.setJobType(_ctx.stringValue("DescribeDtsJobDetailResponse.JobType"));
		describeDtsJobDetailResponse.setTaskType(_ctx.stringValue("DescribeDtsJobDetailResponse.TaskType"));

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.OracleSID"));
		sourceEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.SslSolutionEnum"));
		sourceEndpoint.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.Ip"));
		sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.InstanceID"));
		sourceEndpoint.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.RoleName"));
		sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.InstanceType"));
		sourceEndpoint.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.Port"));
		sourceEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.EngineName"));
		sourceEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.Region"));
		sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.DatabaseName"));
		sourceEndpoint.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.AliyunUid"));
		sourceEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.UserName"));
		describeDtsJobDetailResponse.setSourceEndpoint(sourceEndpoint);

		DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
		destinationEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.SslSolutionEnum"));
		destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.OracleSID"));
		destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.DatabaseName"));
		destinationEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.Region"));
		destinationEndpoint.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.Ip"));
		destinationEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.InstanceID"));
		destinationEndpoint.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.Port"));
		destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.InstanceType"));
		destinationEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.UserName"));
		destinationEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.EngineName"));
		describeDtsJobDetailResponse.setDestinationEndpoint(destinationEndpoint);

		MigrationMode migrationMode = new MigrationMode();
		migrationMode.setDataExtractTransformLoad(_ctx.booleanValue("DescribeDtsJobDetailResponse.MigrationMode.DataExtractTransformLoad"));
		migrationMode.setDataInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.MigrationMode.DataInitialization"));
		migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobDetailResponse.MigrationMode.DataSynchronization"));
		migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.MigrationMode.StructureInitialization"));
		describeDtsJobDetailResponse.setMigrationMode(migrationMode);

		SubscriptionHost subscriptionHost = new SubscriptionHost();
		subscriptionHost.setVpcHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubscriptionHost.VpcHost"));
		subscriptionHost.setPublicHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubscriptionHost.PublicHost"));
		subscriptionHost.setPrivateHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubscriptionHost.PrivateHost"));
		describeDtsJobDetailResponse.setSubscriptionHost(subscriptionHost);

		SubscriptionDataType subscriptionDataType = new SubscriptionDataType();
		subscriptionDataType.setDml(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubscriptionDataType.Dml"));
		subscriptionDataType.setDdl(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubscriptionDataType.Ddl"));
		describeDtsJobDetailResponse.setSubscriptionDataType(subscriptionDataType);

		List<SubDistributedJobItem> subDistributedJob = new ArrayList<SubDistributedJobItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubDistributedJob.Length"); i++) {
			SubDistributedJobItem subDistributedJobItem = new SubDistributedJobItem();
			subDistributedJobItem.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DtsInstanceID"));
			subDistributedJobItem.setDtsJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DtsJobId"));
			subDistributedJobItem.setDtsJobName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DtsJobName"));
			subDistributedJobItem.setGroupId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].GroupId"));
			subDistributedJobItem.setDatabaseCount(_ctx.integerValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DatabaseCount"));
			subDistributedJobItem.setDtsJobClass(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DtsJobClass"));
			subDistributedJobItem.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DtsJobDirection"));
			subDistributedJobItem.setSynchronizationDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SynchronizationDirection"));
			subDistributedJobItem.setPayType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PayType"));
			subDistributedJobItem.setExpireTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ExpireTime"));
			subDistributedJobItem.setCreateTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].CreateTime"));
			subDistributedJobItem.setFinishTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].FinishTime"));
			subDistributedJobItem.setDbObject(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DbObject"));
			subDistributedJobItem.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].Status"));
			subDistributedJobItem.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ErrorMessage"));
			subDistributedJobItem.setDelay(_ctx.longValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].Delay"));
			subDistributedJobItem.setCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].Checkpoint"));
			subDistributedJobItem.setReserved(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].Reserved"));
			subDistributedJobItem.setSubscribeTopic(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SubscribeTopic"));
			subDistributedJobItem.setConsumptionCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ConsumptionCheckpoint"));
			subDistributedJobItem.setBeginTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].BeginTimestamp"));
			subDistributedJobItem.setEndTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].EndTimestamp"));
			subDistributedJobItem.setConsumptionClient(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ConsumptionClient"));
			subDistributedJobItem.setDestNetType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestNetType"));
			subDistributedJobItem.setAppName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].AppName"));
			subDistributedJobItem.setEtlCalculator(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].EtlCalculator"));
			subDistributedJobItem.setOriginType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].OriginType"));
			subDistributedJobItem.setJobType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].JobType"));
			subDistributedJobItem.setIsDemoJob(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].IsDemoJob"));
			subDistributedJobItem.setTaskType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TaskType"));

			List<String> subSyncJob1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SubSyncJob.Length"); j++) {
				subSyncJob1.add(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SubSyncJob["+ j +"]"));
			}
			subDistributedJobItem.setSubSyncJob1(subSyncJob1);

			SourceEndpoint2 sourceEndpoint2 = new SourceEndpoint2();
			sourceEndpoint2.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint2.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.Region"));
			sourceEndpoint2.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint2.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint2.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.Ip"));
			sourceEndpoint2.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint2.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint2.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint2.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.UserName"));
			sourceEndpoint2.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint2.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.RoleName"));
			sourceEndpoint2.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SourceEndpoint.AliyunUid"));
			subDistributedJobItem.setSourceEndpoint2(sourceEndpoint2);

			DestinationEndpoint3 destinationEndpoint3 = new DestinationEndpoint3();
			destinationEndpoint3.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint3.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.Region"));
			destinationEndpoint3.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint3.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint3.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.Ip"));
			destinationEndpoint3.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint3.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint3.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint3.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.UserName"));
			destinationEndpoint3.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint3.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.RoleName"));
			destinationEndpoint3.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DestinationEndpoint.AliyunUid"));
			subDistributedJobItem.setDestinationEndpoint3(destinationEndpoint3);

			MigrationMode4 migrationMode4 = new MigrationMode4();
			migrationMode4.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].MigrationMode.StructureInitialization"));
			migrationMode4.setDataInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].MigrationMode.DataInitialization"));
			migrationMode4.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].MigrationMode.DataSynchronization"));
			migrationMode4.setDataExtractTransformLoad(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].MigrationMode.DataExtractTransformLoad"));
			subDistributedJobItem.setMigrationMode4(migrationMode4);

			PrecheckStatus precheckStatus = new PrecheckStatus();
			precheckStatus.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.Status"));
			precheckStatus.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.Percent"));
			precheckStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.ErrorMessage"));

			List<DetailItem> detail = new ArrayList<DetailItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.Detail.Length"); j++) {
				DetailItem detailItem = new DetailItem();
				detailItem.setCheckItem(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItem"));
				detailItem.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				detailItem.setCheckResult(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.Detail["+ j +"].CheckResult"));
				detailItem.setFailedReason(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.Detail["+ j +"].FailedReason"));
				detailItem.setRepairMethod(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].PrecheckStatus.Detail["+ j +"].RepairMethod"));

				detail.add(detailItem);
			}
			precheckStatus.setDetail(detail);
			subDistributedJobItem.setPrecheckStatus(precheckStatus);

			StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
			structureInitializationStatus.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].StructureInitializationStatus.Status"));
			structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].StructureInitializationStatus.Percent"));
			structureInitializationStatus.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].StructureInitializationStatus.Progress"));
			structureInitializationStatus.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].StructureInitializationStatus.NeedUpgrade"));
			subDistributedJobItem.setStructureInitializationStatus(structureInitializationStatus);

			DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
			dataInitializationStatus.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataInitializationStatus.Status"));
			dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataInitializationStatus.Percent"));
			dataInitializationStatus.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataInitializationStatus.Progress"));
			dataInitializationStatus.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataInitializationStatus.NeedUpgrade"));
			subDistributedJobItem.setDataInitializationStatus(dataInitializationStatus);

			DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
			dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataSynchronizationStatus.Status"));
			dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataSynchronizationStatus.NeedUpgrade"));
			subDistributedJobItem.setDataSynchronizationStatus(dataSynchronizationStatus);

			DataEtlStatus dataEtlStatus = new DataEtlStatus();
			dataEtlStatus.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataEtlStatus.Status"));
			dataEtlStatus.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataEtlStatus.ErrorMessage"));
			dataEtlStatus.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataEtlStatus.Percent"));
			dataEtlStatus.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataEtlStatus.Progress"));
			dataEtlStatus.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].DataEtlStatus.NeedUpgrade"));
			subDistributedJobItem.setDataEtlStatus(dataEtlStatus);

			Performance performance = new Performance();
			performance.setRps(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].Performance.Rps"));
			performance.setFlow(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].Performance.Flow"));
			subDistributedJobItem.setPerformance(performance);

			ReverseJob reverseJob = new ReverseJob();
			reverseJob.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DtsInstanceID"));
			reverseJob.setDtsJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DtsJobId"));
			reverseJob.setDtsJobName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DtsJobName"));
			reverseJob.setGroupId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.GroupId"));
			reverseJob.setDatabaseCount(_ctx.integerValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DatabaseCount"));
			reverseJob.setDtsJobClass(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DtsJobClass"));
			reverseJob.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DtsJobDirection"));
			reverseJob.setSynchronizationDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SynchronizationDirection"));
			reverseJob.setPayType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PayType"));
			reverseJob.setExpireTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.ExpireTime"));
			reverseJob.setCreateTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.CreateTime"));
			reverseJob.setFinishTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.FinishTime"));
			reverseJob.setDbObject(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DbObject"));
			reverseJob.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.Status"));
			reverseJob.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.ErrorMessage"));
			reverseJob.setDelay(_ctx.longValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.Delay"));
			reverseJob.setCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.Checkpoint"));
			reverseJob.setReserved(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.Reserved"));
			reverseJob.setSubscribeTopic(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SubscribeTopic"));
			reverseJob.setConsumptionCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.ConsumptionCheckpoint"));
			reverseJob.setBeginTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.BeginTimestamp"));
			reverseJob.setEndTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.EndTimestamp"));
			reverseJob.setConsumptionClient(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.ConsumptionClient"));
			reverseJob.setDestNetType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestNetType"));
			reverseJob.setAppName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.AppName"));
			reverseJob.setEtlCalculator(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.EtlCalculator"));
			reverseJob.setOriginType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.OriginType"));
			reverseJob.setJobType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.JobType"));
			reverseJob.setIsDemoJob(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.IsDemoJob"));
			reverseJob.setTaskType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TaskType"));

			SourceEndpoint7 sourceEndpoint7 = new SourceEndpoint7();
			sourceEndpoint7.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.InstanceID"));
			sourceEndpoint7.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.Region"));
			sourceEndpoint7.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.InstanceType"));
			sourceEndpoint7.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.EngineName"));
			sourceEndpoint7.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.Ip"));
			sourceEndpoint7.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.Port"));
			sourceEndpoint7.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.DatabaseName"));
			sourceEndpoint7.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.OracleSID"));
			sourceEndpoint7.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.UserName"));
			sourceEndpoint7.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint7.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.RoleName"));
			sourceEndpoint7.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SourceEndpoint.AliyunUid"));
			reverseJob.setSourceEndpoint7(sourceEndpoint7);

			DestinationEndpoint8 destinationEndpoint8 = new DestinationEndpoint8();
			destinationEndpoint8.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.InstanceID"));
			destinationEndpoint8.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.Region"));
			destinationEndpoint8.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.InstanceType"));
			destinationEndpoint8.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.EngineName"));
			destinationEndpoint8.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.Ip"));
			destinationEndpoint8.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.Port"));
			destinationEndpoint8.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.DatabaseName"));
			destinationEndpoint8.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.OracleSID"));
			destinationEndpoint8.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.UserName"));
			destinationEndpoint8.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint8.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.RoleName"));
			destinationEndpoint8.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DestinationEndpoint.AliyunUid"));
			reverseJob.setDestinationEndpoint8(destinationEndpoint8);

			MigrationMode9 migrationMode9 = new MigrationMode9();
			migrationMode9.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.MigrationMode.StructureInitialization"));
			migrationMode9.setDataInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.MigrationMode.DataInitialization"));
			migrationMode9.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.MigrationMode.DataSynchronization"));
			migrationMode9.setDataExtractTransformLoad(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.MigrationMode.DataExtractTransformLoad"));
			reverseJob.setMigrationMode9(migrationMode9);

			PrecheckStatus10 precheckStatus10 = new PrecheckStatus10();
			precheckStatus10.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.Status"));
			precheckStatus10.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.Percent"));
			precheckStatus10.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.ErrorMessage"));

			List<DetailItem22> detail21 = new ArrayList<DetailItem22>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.Detail.Length"); j++) {
				DetailItem22 detailItem22 = new DetailItem22();
				detailItem22.setCheckItem(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItem"));
				detailItem22.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				detailItem22.setCheckResult(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckResult"));
				detailItem22.setFailedReason(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].FailedReason"));
				detailItem22.setRepairMethod(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].RepairMethod"));

				detail21.add(detailItem22);
			}
			precheckStatus10.setDetail21(detail21);
			reverseJob.setPrecheckStatus10(precheckStatus10);

			StructureInitializationStatus11 structureInitializationStatus11 = new StructureInitializationStatus11();
			structureInitializationStatus11.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.StructureInitializationStatus.Status"));
			structureInitializationStatus11.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus11.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.StructureInitializationStatus.Percent"));
			structureInitializationStatus11.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.StructureInitializationStatus.Progress"));
			structureInitializationStatus11.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.StructureInitializationStatus.NeedUpgrade"));
			reverseJob.setStructureInitializationStatus11(structureInitializationStatus11);

			DataInitializationStatus12 dataInitializationStatus12 = new DataInitializationStatus12();
			dataInitializationStatus12.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataInitializationStatus.Status"));
			dataInitializationStatus12.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus12.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataInitializationStatus.Percent"));
			dataInitializationStatus12.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataInitializationStatus.Progress"));
			dataInitializationStatus12.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataInitializationStatus.NeedUpgrade"));
			reverseJob.setDataInitializationStatus12(dataInitializationStatus12);

			DataSynchronizationStatus13 dataSynchronizationStatus13 = new DataSynchronizationStatus13();
			dataSynchronizationStatus13.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataSynchronizationStatus.Status"));
			dataSynchronizationStatus13.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus13.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus13.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus13.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataSynchronizationStatus.NeedUpgrade"));
			reverseJob.setDataSynchronizationStatus13(dataSynchronizationStatus13);

			DataEtlStatus14 dataEtlStatus14 = new DataEtlStatus14();
			dataEtlStatus14.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataEtlStatus.Status"));
			dataEtlStatus14.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataEtlStatus.ErrorMessage"));
			dataEtlStatus14.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataEtlStatus.Percent"));
			dataEtlStatus14.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataEtlStatus.Progress"));
			dataEtlStatus14.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.DataEtlStatus.NeedUpgrade"));
			reverseJob.setDataEtlStatus14(dataEtlStatus14);

			Performance15 performance15 = new Performance15();
			performance15.setRps(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.Performance.Rps"));
			performance15.setFlow(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.Performance.Flow"));
			reverseJob.setPerformance15(performance15);

			SubscriptionHost16 subscriptionHost16 = new SubscriptionHost16();
			subscriptionHost16.setPublicHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SubscriptionHost.PublicHost"));
			subscriptionHost16.setPrivateHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SubscriptionHost.PrivateHost"));
			subscriptionHost16.setVpcHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SubscriptionHost.VpcHost"));
			reverseJob.setSubscriptionHost16(subscriptionHost16);

			SubscriptionDataType17 subscriptionDataType17 = new SubscriptionDataType17();
			subscriptionDataType17.setDdl(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SubscriptionDataType.Ddl"));
			subscriptionDataType17.setDml(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.SubscriptionDataType.Dml"));
			reverseJob.setSubscriptionDataType17(subscriptionDataType17);

			RetryState18 retryState18 = new RetryState18();
			retryState18.setJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.RetryState.JobId"));
			retryState18.setMaxRetryTime(_ctx.integerValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.RetryState.MaxRetryTime"));
			retryState18.setRetryTime(_ctx.integerValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.RetryState.RetryTime"));
			retryState18.setRetryCount(_ctx.integerValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.RetryState.RetryCount"));
			retryState18.setRetrying(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.RetryState.Retrying"));
			retryState18.setModule(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.RetryState.Module"));
			retryState18.setRetryTarget(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.RetryState.RetryTarget"));
			retryState18.setErrMsg(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.RetryState.ErrMsg"));
			reverseJob.setRetryState18(retryState18);

			List<TagListItem20> tagList19 = new ArrayList<TagListItem20>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList.Length"); j++) {
				TagListItem20 tagListItem20 = new TagListItem20();
				tagListItem20.setId(_ctx.longValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].Id"));
				tagListItem20.setGmtCreate(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].GmtCreate"));
				tagListItem20.setGmtModified(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].GmtModified"));
				tagListItem20.setResourceId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].ResourceId"));
				tagListItem20.setResourceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].ResourceType"));
				tagListItem20.setRegionId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].RegionId"));
				tagListItem20.setAliUid(_ctx.longValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].AliUid"));
				tagListItem20.setTagKey(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].TagKey"));
				tagListItem20.setTagValue(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].TagValue"));
				tagListItem20.setTagCategory(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].TagCategory"));
				tagListItem20.setSrcRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].SrcRegion"));
				tagListItem20.setScope(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].Scope"));
				tagListItem20.setCreator(_ctx.longValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].ReverseJob.TagList["+ j +"].Creator"));

				tagList19.add(tagListItem20);
			}
			reverseJob.setTagList19(tagList19);
			subDistributedJobItem.setReverseJob(reverseJob);

			SubscriptionHost5 subscriptionHost5 = new SubscriptionHost5();
			subscriptionHost5.setPublicHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SubscriptionHost.PublicHost"));
			subscriptionHost5.setPrivateHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SubscriptionHost.PrivateHost"));
			subscriptionHost5.setVpcHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SubscriptionHost.VpcHost"));
			subDistributedJobItem.setSubscriptionHost5(subscriptionHost5);

			SubscriptionDataType6 subscriptionDataType6 = new SubscriptionDataType6();
			subscriptionDataType6.setDdl(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SubscriptionDataType.Ddl"));
			subscriptionDataType6.setDml(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].SubscriptionDataType.Dml"));
			subDistributedJobItem.setSubscriptionDataType6(subscriptionDataType6);

			RetryState retryState = new RetryState();
			retryState.setJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].RetryState.JobId"));
			retryState.setMaxRetryTime(_ctx.integerValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].RetryState.MaxRetryTime"));
			retryState.setRetryTime(_ctx.integerValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].RetryState.RetryTime"));
			retryState.setRetryCount(_ctx.integerValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].RetryState.RetryCount"));
			retryState.setRetrying(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].RetryState.Retrying"));
			retryState.setModule(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].RetryState.Module"));
			retryState.setRetryTarget(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].RetryState.RetryTarget"));
			retryState.setErrMsg(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].RetryState.ErrMsg"));
			subDistributedJobItem.setRetryState(retryState);

			List<TagListItem> tagList = new ArrayList<TagListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList.Length"); j++) {
				TagListItem tagListItem = new TagListItem();
				tagListItem.setId(_ctx.longValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].Id"));
				tagListItem.setGmtCreate(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].GmtCreate"));
				tagListItem.setGmtModified(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].GmtModified"));
				tagListItem.setResourceId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].ResourceId"));
				tagListItem.setResourceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].ResourceType"));
				tagListItem.setRegionId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].RegionId"));
				tagListItem.setAliUid(_ctx.longValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].AliUid"));
				tagListItem.setTagKey(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].TagKey"));
				tagListItem.setTagValue(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].TagValue"));
				tagListItem.setTagCategory(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].TagCategory"));
				tagListItem.setSrcRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].SrcRegion"));
				tagListItem.setScope(_ctx.stringValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].Scope"));
				tagListItem.setCreator(_ctx.longValue("DescribeDtsJobDetailResponse.SubDistributedJob["+ i +"].TagList["+ j +"].Creator"));

				tagList.add(tagListItem);
			}
			subDistributedJobItem.setTagList(tagList);

			subDistributedJob.add(subDistributedJobItem);
		}
		describeDtsJobDetailResponse.setSubDistributedJob(subDistributedJob);

		List<SubSyncJobItem> subSyncJob = new ArrayList<SubSyncJobItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubSyncJob.Length"); i++) {
			SubSyncJobItem subSyncJobItem = new SubSyncJobItem();
			subSyncJobItem.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DtsInstanceID"));
			subSyncJobItem.setDtsJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DtsJobId"));
			subSyncJobItem.setDtsJobName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DtsJobName"));
			subSyncJobItem.setGroupId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].GroupId"));
			subSyncJobItem.setDatabaseCount(_ctx.integerValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DatabaseCount"));
			subSyncJobItem.setDtsJobClass(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DtsJobClass"));
			subSyncJobItem.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DtsJobDirection"));
			subSyncJobItem.setSynchronizationDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SynchronizationDirection"));
			subSyncJobItem.setPayType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PayType"));
			subSyncJobItem.setExpireTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ExpireTime"));
			subSyncJobItem.setCreateTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].CreateTime"));
			subSyncJobItem.setFinishTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].FinishTime"));
			subSyncJobItem.setDbObject(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DbObject"));
			subSyncJobItem.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].Status"));
			subSyncJobItem.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ErrorMessage"));
			subSyncJobItem.setDelay(_ctx.longValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].Delay"));
			subSyncJobItem.setCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].Checkpoint"));
			subSyncJobItem.setReserved(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].Reserved"));
			subSyncJobItem.setSubscribeTopic(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SubscribeTopic"));
			subSyncJobItem.setConsumptionCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ConsumptionCheckpoint"));
			subSyncJobItem.setBeginTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].BeginTimestamp"));
			subSyncJobItem.setEndTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].EndTimestamp"));
			subSyncJobItem.setConsumptionClient(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ConsumptionClient"));
			subSyncJobItem.setDestNetType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestNetType"));
			subSyncJobItem.setAppName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].AppName"));
			subSyncJobItem.setEtlCalculator(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].EtlCalculator"));
			subSyncJobItem.setOriginType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].OriginType"));
			subSyncJobItem.setJobType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].JobType"));
			subSyncJobItem.setIsDemoJob(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].IsDemoJob"));
			subSyncJobItem.setTaskType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TaskType"));

			List<String> subSyncJob23 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SubSyncJob.Length"); j++) {
				subSyncJob23.add(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SubSyncJob["+ j +"]"));
			}
			subSyncJobItem.setSubSyncJob23(subSyncJob23);

			SourceEndpoint24 sourceEndpoint24 = new SourceEndpoint24();
			sourceEndpoint24.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint24.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.Region"));
			sourceEndpoint24.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint24.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint24.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.Ip"));
			sourceEndpoint24.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint24.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.DatabaseName"));
			sourceEndpoint24.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.OracleSID"));
			sourceEndpoint24.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.UserName"));
			sourceEndpoint24.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint24.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.RoleName"));
			sourceEndpoint24.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SourceEndpoint.AliyunUid"));
			subSyncJobItem.setSourceEndpoint24(sourceEndpoint24);

			DestinationEndpoint25 destinationEndpoint25 = new DestinationEndpoint25();
			destinationEndpoint25.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.InstanceID"));
			destinationEndpoint25.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.Region"));
			destinationEndpoint25.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint25.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint25.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.Ip"));
			destinationEndpoint25.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint25.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.DatabaseName"));
			destinationEndpoint25.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.OracleSID"));
			destinationEndpoint25.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.UserName"));
			destinationEndpoint25.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint25.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.RoleName"));
			destinationEndpoint25.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DestinationEndpoint.AliyunUid"));
			subSyncJobItem.setDestinationEndpoint25(destinationEndpoint25);

			MigrationMode26 migrationMode26 = new MigrationMode26();
			migrationMode26.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].MigrationMode.StructureInitialization"));
			migrationMode26.setDataInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].MigrationMode.DataInitialization"));
			migrationMode26.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].MigrationMode.DataSynchronization"));
			migrationMode26.setDataExtractTransformLoad(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].MigrationMode.DataExtractTransformLoad"));
			subSyncJobItem.setMigrationMode26(migrationMode26);

			PrecheckStatus27 precheckStatus27 = new PrecheckStatus27();
			precheckStatus27.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.Status"));
			precheckStatus27.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.Percent"));
			precheckStatus27.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.ErrorMessage"));

			List<DetailItem40> detail39 = new ArrayList<DetailItem40>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.Detail.Length"); j++) {
				DetailItem40 detailItem40 = new DetailItem40();
				detailItem40.setCheckItem(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItem"));
				detailItem40.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				detailItem40.setCheckResult(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.Detail["+ j +"].CheckResult"));
				detailItem40.setFailedReason(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.Detail["+ j +"].FailedReason"));
				detailItem40.setRepairMethod(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].PrecheckStatus.Detail["+ j +"].RepairMethod"));

				detail39.add(detailItem40);
			}
			precheckStatus27.setDetail39(detail39);
			subSyncJobItem.setPrecheckStatus27(precheckStatus27);

			StructureInitializationStatus28 structureInitializationStatus28 = new StructureInitializationStatus28();
			structureInitializationStatus28.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].StructureInitializationStatus.Status"));
			structureInitializationStatus28.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus28.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].StructureInitializationStatus.Percent"));
			structureInitializationStatus28.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].StructureInitializationStatus.Progress"));
			structureInitializationStatus28.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].StructureInitializationStatus.NeedUpgrade"));
			subSyncJobItem.setStructureInitializationStatus28(structureInitializationStatus28);

			DataInitializationStatus29 dataInitializationStatus29 = new DataInitializationStatus29();
			dataInitializationStatus29.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataInitializationStatus.Status"));
			dataInitializationStatus29.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus29.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataInitializationStatus.Percent"));
			dataInitializationStatus29.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataInitializationStatus.Progress"));
			dataInitializationStatus29.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataInitializationStatus.NeedUpgrade"));
			subSyncJobItem.setDataInitializationStatus29(dataInitializationStatus29);

			DataSynchronizationStatus30 dataSynchronizationStatus30 = new DataSynchronizationStatus30();
			dataSynchronizationStatus30.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataSynchronizationStatus.Status"));
			dataSynchronizationStatus30.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus30.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus30.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus30.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataSynchronizationStatus.NeedUpgrade"));
			subSyncJobItem.setDataSynchronizationStatus30(dataSynchronizationStatus30);

			DataEtlStatus31 dataEtlStatus31 = new DataEtlStatus31();
			dataEtlStatus31.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataEtlStatus.Status"));
			dataEtlStatus31.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataEtlStatus.ErrorMessage"));
			dataEtlStatus31.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataEtlStatus.Percent"));
			dataEtlStatus31.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataEtlStatus.Progress"));
			dataEtlStatus31.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].DataEtlStatus.NeedUpgrade"));
			subSyncJobItem.setDataEtlStatus31(dataEtlStatus31);

			Performance32 performance32 = new Performance32();
			performance32.setRps(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].Performance.Rps"));
			performance32.setFlow(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].Performance.Flow"));
			subSyncJobItem.setPerformance32(performance32);

			ReverseJob33 reverseJob33 = new ReverseJob33();
			reverseJob33.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DtsInstanceID"));
			reverseJob33.setDtsJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DtsJobId"));
			reverseJob33.setDtsJobName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DtsJobName"));
			reverseJob33.setGroupId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.GroupId"));
			reverseJob33.setDatabaseCount(_ctx.integerValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DatabaseCount"));
			reverseJob33.setDtsJobClass(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DtsJobClass"));
			reverseJob33.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DtsJobDirection"));
			reverseJob33.setSynchronizationDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SynchronizationDirection"));
			reverseJob33.setPayType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PayType"));
			reverseJob33.setExpireTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.ExpireTime"));
			reverseJob33.setCreateTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.CreateTime"));
			reverseJob33.setFinishTime(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.FinishTime"));
			reverseJob33.setDbObject(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DbObject"));
			reverseJob33.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.Status"));
			reverseJob33.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.ErrorMessage"));
			reverseJob33.setDelay(_ctx.longValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.Delay"));
			reverseJob33.setCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.Checkpoint"));
			reverseJob33.setReserved(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.Reserved"));
			reverseJob33.setSubscribeTopic(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SubscribeTopic"));
			reverseJob33.setConsumptionCheckpoint(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.ConsumptionCheckpoint"));
			reverseJob33.setBeginTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.BeginTimestamp"));
			reverseJob33.setEndTimestamp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.EndTimestamp"));
			reverseJob33.setConsumptionClient(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.ConsumptionClient"));
			reverseJob33.setDestNetType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestNetType"));
			reverseJob33.setAppName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.AppName"));
			reverseJob33.setEtlCalculator(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.EtlCalculator"));
			reverseJob33.setOriginType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.OriginType"));
			reverseJob33.setJobType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.JobType"));
			reverseJob33.setIsDemoJob(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.IsDemoJob"));
			reverseJob33.setTaskType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TaskType"));

			SourceEndpoint41 sourceEndpoint41 = new SourceEndpoint41();
			sourceEndpoint41.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.InstanceID"));
			sourceEndpoint41.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.Region"));
			sourceEndpoint41.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.InstanceType"));
			sourceEndpoint41.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.EngineName"));
			sourceEndpoint41.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.Ip"));
			sourceEndpoint41.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.Port"));
			sourceEndpoint41.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.DatabaseName"));
			sourceEndpoint41.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.OracleSID"));
			sourceEndpoint41.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.UserName"));
			sourceEndpoint41.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.SslSolutionEnum"));
			sourceEndpoint41.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.RoleName"));
			sourceEndpoint41.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SourceEndpoint.AliyunUid"));
			reverseJob33.setSourceEndpoint41(sourceEndpoint41);

			DestinationEndpoint42 destinationEndpoint42 = new DestinationEndpoint42();
			destinationEndpoint42.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.InstanceID"));
			destinationEndpoint42.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.Region"));
			destinationEndpoint42.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.InstanceType"));
			destinationEndpoint42.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.EngineName"));
			destinationEndpoint42.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.Ip"));
			destinationEndpoint42.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.Port"));
			destinationEndpoint42.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.DatabaseName"));
			destinationEndpoint42.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.OracleSID"));
			destinationEndpoint42.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.UserName"));
			destinationEndpoint42.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.SslSolutionEnum"));
			destinationEndpoint42.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.RoleName"));
			destinationEndpoint42.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DestinationEndpoint.AliyunUid"));
			reverseJob33.setDestinationEndpoint42(destinationEndpoint42);

			MigrationMode43 migrationMode43 = new MigrationMode43();
			migrationMode43.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.MigrationMode.StructureInitialization"));
			migrationMode43.setDataInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.MigrationMode.DataInitialization"));
			migrationMode43.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.MigrationMode.DataSynchronization"));
			migrationMode43.setDataExtractTransformLoad(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.MigrationMode.DataExtractTransformLoad"));
			reverseJob33.setMigrationMode43(migrationMode43);

			PrecheckStatus44 precheckStatus44 = new PrecheckStatus44();
			precheckStatus44.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.Status"));
			precheckStatus44.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.Percent"));
			precheckStatus44.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.ErrorMessage"));

			List<DetailItem56> detail55 = new ArrayList<DetailItem56>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.Detail.Length"); j++) {
				DetailItem56 detailItem56 = new DetailItem56();
				detailItem56.setCheckItem(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItem"));
				detailItem56.setCheckItemDescription(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckItemDescription"));
				detailItem56.setCheckResult(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].CheckResult"));
				detailItem56.setFailedReason(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].FailedReason"));
				detailItem56.setRepairMethod(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.PrecheckStatus.Detail["+ j +"].RepairMethod"));

				detail55.add(detailItem56);
			}
			precheckStatus44.setDetail55(detail55);
			reverseJob33.setPrecheckStatus44(precheckStatus44);

			StructureInitializationStatus45 structureInitializationStatus45 = new StructureInitializationStatus45();
			structureInitializationStatus45.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.StructureInitializationStatus.Status"));
			structureInitializationStatus45.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus45.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.StructureInitializationStatus.Percent"));
			structureInitializationStatus45.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.StructureInitializationStatus.Progress"));
			structureInitializationStatus45.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.StructureInitializationStatus.NeedUpgrade"));
			reverseJob33.setStructureInitializationStatus45(structureInitializationStatus45);

			DataInitializationStatus46 dataInitializationStatus46 = new DataInitializationStatus46();
			dataInitializationStatus46.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataInitializationStatus.Status"));
			dataInitializationStatus46.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus46.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataInitializationStatus.Percent"));
			dataInitializationStatus46.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataInitializationStatus.Progress"));
			dataInitializationStatus46.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataInitializationStatus.NeedUpgrade"));
			reverseJob33.setDataInitializationStatus46(dataInitializationStatus46);

			DataSynchronizationStatus47 dataSynchronizationStatus47 = new DataSynchronizationStatus47();
			dataSynchronizationStatus47.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataSynchronizationStatus.Status"));
			dataSynchronizationStatus47.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus47.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus47.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataSynchronizationStatus.Progress"));
			dataSynchronizationStatus47.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataSynchronizationStatus.NeedUpgrade"));
			reverseJob33.setDataSynchronizationStatus47(dataSynchronizationStatus47);

			DataEtlStatus48 dataEtlStatus48 = new DataEtlStatus48();
			dataEtlStatus48.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataEtlStatus.Status"));
			dataEtlStatus48.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataEtlStatus.ErrorMessage"));
			dataEtlStatus48.setPercent(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataEtlStatus.Percent"));
			dataEtlStatus48.setProgress(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataEtlStatus.Progress"));
			dataEtlStatus48.setNeedUpgrade(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.DataEtlStatus.NeedUpgrade"));
			reverseJob33.setDataEtlStatus48(dataEtlStatus48);

			Performance49 performance49 = new Performance49();
			performance49.setRps(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.Performance.Rps"));
			performance49.setFlow(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.Performance.Flow"));
			reverseJob33.setPerformance49(performance49);

			SubscriptionHost50 subscriptionHost50 = new SubscriptionHost50();
			subscriptionHost50.setPublicHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SubscriptionHost.PublicHost"));
			subscriptionHost50.setPrivateHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SubscriptionHost.PrivateHost"));
			subscriptionHost50.setVpcHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SubscriptionHost.VpcHost"));
			reverseJob33.setSubscriptionHost50(subscriptionHost50);

			SubscriptionDataType51 subscriptionDataType51 = new SubscriptionDataType51();
			subscriptionDataType51.setDdl(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SubscriptionDataType.Ddl"));
			subscriptionDataType51.setDml(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.SubscriptionDataType.Dml"));
			reverseJob33.setSubscriptionDataType51(subscriptionDataType51);

			RetryState52 retryState52 = new RetryState52();
			retryState52.setJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.RetryState.JobId"));
			retryState52.setMaxRetryTime(_ctx.integerValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.RetryState.MaxRetryTime"));
			retryState52.setRetryTime(_ctx.integerValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.RetryState.RetryTime"));
			retryState52.setRetryCount(_ctx.integerValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.RetryState.RetryCount"));
			retryState52.setRetrying(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.RetryState.Retrying"));
			retryState52.setModule(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.RetryState.Module"));
			retryState52.setRetryTarget(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.RetryState.RetryTarget"));
			retryState52.setErrMsg(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.RetryState.ErrMsg"));
			reverseJob33.setRetryState52(retryState52);

			List<TagListItem54> tagList53 = new ArrayList<TagListItem54>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList.Length"); j++) {
				TagListItem54 tagListItem54 = new TagListItem54();
				tagListItem54.setId(_ctx.longValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].Id"));
				tagListItem54.setGmtCreate(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].GmtCreate"));
				tagListItem54.setGmtModified(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].GmtModified"));
				tagListItem54.setResourceId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].ResourceId"));
				tagListItem54.setResourceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].ResourceType"));
				tagListItem54.setRegionId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].RegionId"));
				tagListItem54.setAliUid(_ctx.longValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].AliUid"));
				tagListItem54.setTagKey(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].TagKey"));
				tagListItem54.setTagValue(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].TagValue"));
				tagListItem54.setTagCategory(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].TagCategory"));
				tagListItem54.setSrcRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].SrcRegion"));
				tagListItem54.setScope(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].Scope"));
				tagListItem54.setCreator(_ctx.longValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].ReverseJob.TagList["+ j +"].Creator"));

				tagList53.add(tagListItem54);
			}
			reverseJob33.setTagList53(tagList53);
			subSyncJobItem.setReverseJob33(reverseJob33);

			SubscriptionHost34 subscriptionHost34 = new SubscriptionHost34();
			subscriptionHost34.setPublicHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SubscriptionHost.PublicHost"));
			subscriptionHost34.setPrivateHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SubscriptionHost.PrivateHost"));
			subscriptionHost34.setVpcHost(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SubscriptionHost.VpcHost"));
			subSyncJobItem.setSubscriptionHost34(subscriptionHost34);

			SubscriptionDataType35 subscriptionDataType35 = new SubscriptionDataType35();
			subscriptionDataType35.setDdl(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SubscriptionDataType.Ddl"));
			subscriptionDataType35.setDml(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].SubscriptionDataType.Dml"));
			subSyncJobItem.setSubscriptionDataType35(subscriptionDataType35);

			RetryState36 retryState36 = new RetryState36();
			retryState36.setJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].RetryState.JobId"));
			retryState36.setMaxRetryTime(_ctx.integerValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].RetryState.MaxRetryTime"));
			retryState36.setRetryTime(_ctx.integerValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].RetryState.RetryTime"));
			retryState36.setRetryCount(_ctx.integerValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].RetryState.RetryCount"));
			retryState36.setRetrying(_ctx.booleanValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].RetryState.Retrying"));
			retryState36.setModule(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].RetryState.Module"));
			retryState36.setRetryTarget(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].RetryState.RetryTarget"));
			retryState36.setErrMsg(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].RetryState.ErrMsg"));
			subSyncJobItem.setRetryState36(retryState36);

			List<TagListItem38> tagList37 = new ArrayList<TagListItem38>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList.Length"); j++) {
				TagListItem38 tagListItem38 = new TagListItem38();
				tagListItem38.setId(_ctx.longValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].Id"));
				tagListItem38.setGmtCreate(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].GmtCreate"));
				tagListItem38.setGmtModified(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].GmtModified"));
				tagListItem38.setResourceId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].ResourceId"));
				tagListItem38.setResourceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].ResourceType"));
				tagListItem38.setRegionId(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].RegionId"));
				tagListItem38.setAliUid(_ctx.longValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].AliUid"));
				tagListItem38.setTagKey(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].TagKey"));
				tagListItem38.setTagValue(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].TagValue"));
				tagListItem38.setTagCategory(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].TagCategory"));
				tagListItem38.setSrcRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].SrcRegion"));
				tagListItem38.setScope(_ctx.stringValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].Scope"));
				tagListItem38.setCreator(_ctx.longValue("DescribeDtsJobDetailResponse.SubSyncJob["+ i +"].TagList["+ j +"].Creator"));

				tagList37.add(tagListItem38);
			}
			subSyncJobItem.setTagList37(tagList37);

			subSyncJob.add(subSyncJobItem);
		}
		describeDtsJobDetailResponse.setSubSyncJob(subSyncJob);
	 
	 	return describeDtsJobDetailResponse;
	}
}