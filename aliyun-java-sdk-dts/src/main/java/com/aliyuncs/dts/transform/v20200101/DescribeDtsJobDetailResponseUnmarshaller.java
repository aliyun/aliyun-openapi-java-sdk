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

import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.DestinationEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.MigrationMode;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobDetailResponse.SourceEndpoint;
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
	 
	 	return describeDtsJobDetailResponse;
	}
}