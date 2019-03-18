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

import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse.DataInitializationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse.DestinationEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse.MigrationMode;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse.PrecheckStatus;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse.PrecheckStatus.CheckItem;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse.SourceEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobStatusResponse.StructureInitializationStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationJobStatusResponseUnmarshaller {

	public static DescribeMigrationJobStatusResponse unmarshall(DescribeMigrationJobStatusResponse describeMigrationJobStatusResponse, UnmarshallerContext context) {
		
		describeMigrationJobStatusResponse.setMigrationJobId(context.stringValue("DescribeMigrationJobStatusResponse.MigrationJobId"));
		describeMigrationJobStatusResponse.setMigrationJobName(context.stringValue("DescribeMigrationJobStatusResponse.MigrationJobName"));
		describeMigrationJobStatusResponse.setPayType(context.stringValue("DescribeMigrationJobStatusResponse.PayType"));
		describeMigrationJobStatusResponse.setMigrationJobClass(context.stringValue("DescribeMigrationJobStatusResponse.MigrationJobClass"));
		describeMigrationJobStatusResponse.setMigrationObject(context.stringValue("DescribeMigrationJobStatusResponse.MigrationObject"));
		describeMigrationJobStatusResponse.setMigrationJobStatus(context.stringValue("DescribeMigrationJobStatusResponse.MigrationJobStatus"));

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setInstanceType(context.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.InstanceType"));
		sourceEndpoint.setInstanceId(context.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.InstanceId"));
		sourceEndpoint.setEngineName(context.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.EngineName"));
		sourceEndpoint.setIP(context.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.IP"));
		sourceEndpoint.setPort(context.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.Port"));
		sourceEndpoint.setDatabaseName(context.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.DatabaseName"));
		sourceEndpoint.setOracleSID(context.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.oracleSID"));
		sourceEndpoint.setUserName(context.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.UserName"));
		describeMigrationJobStatusResponse.setSourceEndpoint(sourceEndpoint);

		DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
		destinationEndpoint.setInstanceType(context.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.InstanceType"));
		destinationEndpoint.setInstanceId(context.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.InstanceId"));
		destinationEndpoint.setEngineName(context.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.EngineName"));
		destinationEndpoint.setIP(context.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.IP"));
		destinationEndpoint.setPort(context.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.Port"));
		destinationEndpoint.setDatabaseName(context.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.DatabaseName"));
		destinationEndpoint.setOracleSID(context.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.oracleSID"));
		destinationEndpoint.setUserName(context.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.UserName"));
		describeMigrationJobStatusResponse.setDestinationEndpoint(destinationEndpoint);

		MigrationMode migrationMode = new MigrationMode();
		migrationMode.setStructureInitialization(context.booleanValue("DescribeMigrationJobStatusResponse.MigrationMode.structureInitialization"));
		migrationMode.setDataInitialization(context.booleanValue("DescribeMigrationJobStatusResponse.MigrationMode.dataInitialization"));
		migrationMode.setDataSynchronization(context.booleanValue("DescribeMigrationJobStatusResponse.MigrationMode.dataSynchronization"));
		describeMigrationJobStatusResponse.setMigrationMode(migrationMode);

		PrecheckStatus precheckStatus = new PrecheckStatus();
		precheckStatus.setStatus(context.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Status"));
		precheckStatus.setPercent(context.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Percent"));

		List<CheckItem> detail = new ArrayList<CheckItem>();
		for (int i = 0; i < context.lengthValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setItemName(context.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ItemName"));
			checkItem.setCheckStatus(context.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail["+ i +"].CheckStatus"));
			checkItem.setErrorMessage(context.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ErrorMessage"));
			checkItem.setRepairMethod(context.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail["+ i +"].RepairMethod"));

			detail.add(checkItem);
		}
		precheckStatus.setDetail(detail);
		describeMigrationJobStatusResponse.setPrecheckStatus(precheckStatus);

		StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
		structureInitializationStatus.setStatus(context.stringValue("DescribeMigrationJobStatusResponse.StructureInitializationStatus.Status"));
		structureInitializationStatus.setPercent(context.stringValue("DescribeMigrationJobStatusResponse.StructureInitializationStatus.Percent"));
		structureInitializationStatus.setErrorMessage(context.stringValue("DescribeMigrationJobStatusResponse.StructureInitializationStatus.ErrorMessage"));
		structureInitializationStatus.setProgress(context.stringValue("DescribeMigrationJobStatusResponse.StructureInitializationStatus.Progress"));
		describeMigrationJobStatusResponse.setStructureInitializationStatus(structureInitializationStatus);

		DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
		dataInitializationStatus.setStatus(context.stringValue("DescribeMigrationJobStatusResponse.DataInitializationStatus.Status"));
		dataInitializationStatus.setPercent(context.stringValue("DescribeMigrationJobStatusResponse.DataInitializationStatus.Percent"));
		dataInitializationStatus.setErrorMessage(context.stringValue("DescribeMigrationJobStatusResponse.DataInitializationStatus.ErrorMessage"));
		dataInitializationStatus.setProgress(context.stringValue("DescribeMigrationJobStatusResponse.DataInitializationStatus.Progress"));
		describeMigrationJobStatusResponse.setDataInitializationStatus(dataInitializationStatus);

		DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
		dataSynchronizationStatus.setStatus(context.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.Status"));
		dataSynchronizationStatus.setPercent(context.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.Percent"));
		dataSynchronizationStatus.setErrorMessage(context.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.ErrorMessage"));
		dataSynchronizationStatus.setDelay(context.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.Delay"));
		dataSynchronizationStatus.setCheckpoint(context.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.Checkpoint"));
		describeMigrationJobStatusResponse.setDataSynchronizationStatus(dataSynchronizationStatus);
	 
	 	return describeMigrationJobStatusResponse;
	}
}