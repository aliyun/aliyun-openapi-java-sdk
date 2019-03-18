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

import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.DataInitializationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.DestinationEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.Performance;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.PrecheckStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.PrecheckStatus.CheckItem;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.SourceEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.StructureInitializationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.SynchronizationObject;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.SynchronizationObject.TableExclude;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobStatusResponse.SynchronizationObject.TableInclude;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronizationJobStatusResponseUnmarshaller {

	public static DescribeSynchronizationJobStatusResponse unmarshall(DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatusResponse, UnmarshallerContext context) {
		
		describeSynchronizationJobStatusResponse.setRequestId(context.stringValue("DescribeSynchronizationJobStatusResponse.RequestId"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobId(context.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobId"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobName(context.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobName"));
		describeSynchronizationJobStatusResponse.setSynchronizationDirection(context.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationDirection"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobClass(context.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobClass"));
		describeSynchronizationJobStatusResponse.setPayType(context.stringValue("DescribeSynchronizationJobStatusResponse.PayType"));
		describeSynchronizationJobStatusResponse.setExpireTime(context.stringValue("DescribeSynchronizationJobStatusResponse.ExpireTime"));
		describeSynchronizationJobStatusResponse.setStructureInitialization(context.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitialization"));
		describeSynchronizationJobStatusResponse.setDataInitialization(context.stringValue("DescribeSynchronizationJobStatusResponse.DataInitialization"));
		describeSynchronizationJobStatusResponse.setStatus(context.stringValue("DescribeSynchronizationJobStatusResponse.Status"));
		describeSynchronizationJobStatusResponse.setErrorMessage(context.stringValue("DescribeSynchronizationJobStatusResponse.ErrorMessage"));
		describeSynchronizationJobStatusResponse.setDelay(context.stringValue("DescribeSynchronizationJobStatusResponse.Delay"));
		describeSynchronizationJobStatusResponse.setCheckpoint(context.stringValue("DescribeSynchronizationJobStatusResponse.Checkpoint"));

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setInstanceType(context.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.InstanceType"));
		sourceEndpoint.setInstanceId(context.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.InstanceId"));
		sourceEndpoint.setEngineName(context.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.EngineName"));
		sourceEndpoint.setIP(context.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.IP"));
		sourceEndpoint.setPort(context.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.Port"));
		sourceEndpoint.setUserName(context.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.UserName"));
		describeSynchronizationJobStatusResponse.setSourceEndpoint(sourceEndpoint);

		DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
		destinationEndpoint.setInstanceType(context.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.InstanceType"));
		destinationEndpoint.setInstanceId(context.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.InstanceId"));
		destinationEndpoint.setEngineName(context.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.EngineName"));
		destinationEndpoint.setIP(context.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.IP"));
		destinationEndpoint.setPort(context.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.Port"));
		destinationEndpoint.setUserName(context.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.UserName"));
		describeSynchronizationJobStatusResponse.setDestinationEndpoint(destinationEndpoint);

		PrecheckStatus precheckStatus = new PrecheckStatus();
		precheckStatus.setStatus(context.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Status"));
		precheckStatus.setPercent(context.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Percent"));

		List<CheckItem> detail = new ArrayList<CheckItem>();
		for (int i = 0; i < context.lengthValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setItemName(context.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ItemName"));
			checkItem.setCheckStatus(context.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].CheckStatus"));
			checkItem.setErrorMessage(context.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ErrorMessage"));
			checkItem.setRepairMethod(context.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].RepairMethod"));

			detail.add(checkItem);
		}
		precheckStatus.setDetail(detail);
		describeSynchronizationJobStatusResponse.setPrecheckStatus(precheckStatus);

		StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
		structureInitializationStatus.setStatus(context.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Status"));
		structureInitializationStatus.setPercent(context.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Percent"));
		structureInitializationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.ErrorMessage"));
		structureInitializationStatus.setProgress(context.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Progress"));
		describeSynchronizationJobStatusResponse.setStructureInitializationStatus(structureInitializationStatus);

		DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
		dataInitializationStatus.setStatus(context.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Status"));
		dataInitializationStatus.setPercent(context.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Percent"));
		dataInitializationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.ErrorMessage"));
		dataInitializationStatus.setProgress(context.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Progress"));
		describeSynchronizationJobStatusResponse.setDataInitializationStatus(dataInitializationStatus);

		DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
		dataSynchronizationStatus.setStatus(context.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Status"));
		dataSynchronizationStatus.setPercent(context.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Percent"));
		dataSynchronizationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.ErrorMessage"));
		dataSynchronizationStatus.setDelay(context.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Delay"));
		dataSynchronizationStatus.setCheckpoint(context.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Checkpoint"));
		describeSynchronizationJobStatusResponse.setDataSynchronizationStatus(dataSynchronizationStatus);

		Performance performance = new Performance();
		performance.setRPS(context.stringValue("DescribeSynchronizationJobStatusResponse.Performance.RPS"));
		performance.setFLOW(context.stringValue("DescribeSynchronizationJobStatusResponse.Performance.FLOW"));
		describeSynchronizationJobStatusResponse.setPerformance(performance);

		List<SynchronizationObject> synchronizationObjects = new ArrayList<SynchronizationObject>();
		for (int i = 0; i < context.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects.Length"); i++) {
			SynchronizationObject synchronizationObject = new SynchronizationObject();
			synchronizationObject.setSchemaName(context.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].SchemaName"));
			synchronizationObject.setNewSchemaName(context.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].NewSchemaName"));

			List<TableInclude> tableIncludes = new ArrayList<TableInclude>();
			for (int j = 0; j < context.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableIncludes.Length"); j++) {
				TableInclude tableInclude = new TableInclude();
				tableInclude.setTableName(context.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableIncludes["+ j +"].TableName"));

				tableIncludes.add(tableInclude);
			}
			synchronizationObject.setTableIncludes(tableIncludes);

			List<TableExclude> tableExcludes = new ArrayList<TableExclude>();
			for (int j = 0; j < context.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableExcludes.Length"); j++) {
				TableExclude tableExclude = new TableExclude();
				tableExclude.setTableName(context.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableExcludes["+ j +"].TableName"));

				tableExcludes.add(tableExclude);
			}
			synchronizationObject.setTableExcludes(tableExcludes);

			synchronizationObjects.add(synchronizationObject);
		}
		describeSynchronizationJobStatusResponse.setSynchronizationObjects(synchronizationObjects);
	 
	 	return describeSynchronizationJobStatusResponse;
	}
}