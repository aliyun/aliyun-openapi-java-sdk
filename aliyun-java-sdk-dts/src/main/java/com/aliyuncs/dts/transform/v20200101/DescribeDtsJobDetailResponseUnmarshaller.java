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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDtsJobDetailResponseUnmarshaller {

	public static DescribeDtsJobDetailResponse unmarshall(DescribeDtsJobDetailResponse describeDtsJobDetailResponse, UnmarshallerContext _ctx) {
		
		describeDtsJobDetailResponse.setRequestId(_ctx.stringValue("DescribeDtsJobDetailResponse.RequestId"));
		describeDtsJobDetailResponse.setSuccess(_ctx.booleanValue("DescribeDtsJobDetailResponse.Success"));
		describeDtsJobDetailResponse.setCode(_ctx.integerValue("DescribeDtsJobDetailResponse.Code"));
		describeDtsJobDetailResponse.setErrCode(_ctx.stringValue("DescribeDtsJobDetailResponse.ErrCode"));
		describeDtsJobDetailResponse.setErrMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.ErrMessage"));
		describeDtsJobDetailResponse.setDynamicMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.DynamicMessage"));
		describeDtsJobDetailResponse.setHttpStatusCode(_ctx.integerValue("DescribeDtsJobDetailResponse.HttpStatusCode"));
		describeDtsJobDetailResponse.setDtsInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsInstanceID"));
		describeDtsJobDetailResponse.setDtsJobId(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsJobId"));
		describeDtsJobDetailResponse.setDtsJobName(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsJobName"));
		describeDtsJobDetailResponse.setDtsJobClass(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsJobClass"));
		describeDtsJobDetailResponse.setDtsJobDirection(_ctx.stringValue("DescribeDtsJobDetailResponse.DtsJobDirection"));
		describeDtsJobDetailResponse.setPayType(_ctx.stringValue("DescribeDtsJobDetailResponse.PayType"));
		describeDtsJobDetailResponse.setExpireTime(_ctx.stringValue("DescribeDtsJobDetailResponse.ExpireTime"));
		describeDtsJobDetailResponse.setCreateTime(_ctx.stringValue("DescribeDtsJobDetailResponse.CreateTime"));
		describeDtsJobDetailResponse.setFinishTime(_ctx.stringValue("DescribeDtsJobDetailResponse.FinishTime"));
		describeDtsJobDetailResponse.setStatus(_ctx.stringValue("DescribeDtsJobDetailResponse.Status"));
		describeDtsJobDetailResponse.setCheckpoint(_ctx.integerValue("DescribeDtsJobDetailResponse.Checkpoint"));
		describeDtsJobDetailResponse.setDelay(_ctx.integerValue("DescribeDtsJobDetailResponse.Delay"));
		describeDtsJobDetailResponse.setReserved(_ctx.stringValue("DescribeDtsJobDetailResponse.Reserved"));
		describeDtsJobDetailResponse.setErrorMessage(_ctx.stringValue("DescribeDtsJobDetailResponse.ErrorMessage"));
		describeDtsJobDetailResponse.setDbObject(_ctx.stringValue("DescribeDtsJobDetailResponse.DbObject"));

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.InstanceID"));
		sourceEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.Region"));
		sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.InstanceType"));
		sourceEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.EngineName"));
		sourceEndpoint.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.Ip"));
		sourceEndpoint.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.Port"));
		sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.DatabaseName"));
		sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.OracleSID"));
		sourceEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.UserName"));
		sourceEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.SslSolutionEnum"));
		sourceEndpoint.setRoleName(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.RoleName"));
		sourceEndpoint.setAliyunUid(_ctx.stringValue("DescribeDtsJobDetailResponse.SourceEndpoint.AliyunUid"));
		describeDtsJobDetailResponse.setSourceEndpoint(sourceEndpoint);

		DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
		destinationEndpoint.setInstanceID(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.InstanceID"));
		destinationEndpoint.setRegion(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.Region"));
		destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.InstanceType"));
		destinationEndpoint.setEngineName(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.EngineName"));
		destinationEndpoint.setIp(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.Ip"));
		destinationEndpoint.setPort(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.Port"));
		destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.DatabaseName"));
		destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.OracleSID"));
		destinationEndpoint.setUserName(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.UserName"));
		destinationEndpoint.setSslSolutionEnum(_ctx.stringValue("DescribeDtsJobDetailResponse.DestinationEndpoint.SslSolutionEnum"));
		describeDtsJobDetailResponse.setDestinationEndpoint(destinationEndpoint);

		MigrationMode migrationMode = new MigrationMode();
		migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.MigrationMode.StructureInitialization"));
		migrationMode.setDataInitialization(_ctx.booleanValue("DescribeDtsJobDetailResponse.MigrationMode.DataInitialization"));
		migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeDtsJobDetailResponse.MigrationMode.DataSynchronization"));
		describeDtsJobDetailResponse.setMigrationMode(migrationMode);
	 
	 	return describeDtsJobDetailResponse;
	}
}