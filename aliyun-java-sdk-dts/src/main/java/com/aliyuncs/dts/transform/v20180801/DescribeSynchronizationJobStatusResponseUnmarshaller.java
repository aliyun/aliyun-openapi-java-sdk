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

	public static DescribeSynchronizationJobStatusResponse unmarshall(DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatusResponse, UnmarshallerContext _ctx) {
		
		describeSynchronizationJobStatusResponse.setRequestId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.RequestId"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobId"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobName"));
		describeSynchronizationJobStatusResponse.setSynchronizationDirection(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationDirection"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobClass(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobClass"));
		describeSynchronizationJobStatusResponse.setPayType(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PayType"));
		describeSynchronizationJobStatusResponse.setExpireTime(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.ExpireTime"));
		describeSynchronizationJobStatusResponse.setStructureInitialization(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitialization"));
		describeSynchronizationJobStatusResponse.setDataInitialization(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitialization"));
		describeSynchronizationJobStatusResponse.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Status"));
		describeSynchronizationJobStatusResponse.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.ErrorMessage"));
		describeSynchronizationJobStatusResponse.setDelay(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Delay"));
		describeSynchronizationJobStatusResponse.setCheckpoint(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Checkpoint"));

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.InstanceType"));
		sourceEndpoint.setInstanceId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.InstanceId"));
		sourceEndpoint.setEngineName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.EngineName"));
		sourceEndpoint.setIP(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.IP"));
		sourceEndpoint.setPort(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.Port"));
		sourceEndpoint.setUserName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.UserName"));
		describeSynchronizationJobStatusResponse.setSourceEndpoint(sourceEndpoint);

		DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
		destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.InstanceType"));
		destinationEndpoint.setInstanceId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.InstanceId"));
		destinationEndpoint.setEngineName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.EngineName"));
		destinationEndpoint.setIP(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.IP"));
		destinationEndpoint.setPort(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.Port"));
		destinationEndpoint.setUserName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.UserName"));
		describeSynchronizationJobStatusResponse.setDestinationEndpoint(destinationEndpoint);

		PrecheckStatus precheckStatus = new PrecheckStatus();
		precheckStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Status"));
		precheckStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Percent"));

		List<CheckItem> detail = new ArrayList<CheckItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setItemName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ItemName"));
			checkItem.setCheckStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].CheckStatus"));
			checkItem.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ErrorMessage"));
			checkItem.setRepairMethod(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].RepairMethod"));

			detail.add(checkItem);
		}
		precheckStatus.setDetail(detail);
		describeSynchronizationJobStatusResponse.setPrecheckStatus(precheckStatus);

		StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
		structureInitializationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Status"));
		structureInitializationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Percent"));
		structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.ErrorMessage"));
		structureInitializationStatus.setProgress(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Progress"));
		describeSynchronizationJobStatusResponse.setStructureInitializationStatus(structureInitializationStatus);

		DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
		dataInitializationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Status"));
		dataInitializationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Percent"));
		dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.ErrorMessage"));
		dataInitializationStatus.setProgress(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Progress"));
		describeSynchronizationJobStatusResponse.setDataInitializationStatus(dataInitializationStatus);

		DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
		dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Status"));
		dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Percent"));
		dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.ErrorMessage"));
		dataSynchronizationStatus.setDelay(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Delay"));
		dataSynchronizationStatus.setCheckpoint(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Checkpoint"));
		describeSynchronizationJobStatusResponse.setDataSynchronizationStatus(dataSynchronizationStatus);

		Performance performance = new Performance();
		performance.setRPS(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Performance.RPS"));
		performance.setFLOW(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Performance.FLOW"));
		describeSynchronizationJobStatusResponse.setPerformance(performance);

		List<SynchronizationObject> synchronizationObjects = new ArrayList<SynchronizationObject>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects.Length"); i++) {
			SynchronizationObject synchronizationObject = new SynchronizationObject();
			synchronizationObject.setSchemaName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].SchemaName"));
			synchronizationObject.setNewSchemaName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].NewSchemaName"));

			List<TableInclude> tableIncludes = new ArrayList<TableInclude>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableIncludes.Length"); j++) {
				TableInclude tableInclude = new TableInclude();
				tableInclude.setTableName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableIncludes["+ j +"].TableName"));

				tableIncludes.add(tableInclude);
			}
			synchronizationObject.setTableIncludes(tableIncludes);

			List<TableExclude> tableExcludes = new ArrayList<TableExclude>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableExcludes.Length"); j++) {
				TableExclude tableExclude = new TableExclude();
				tableExclude.setTableName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableExcludes["+ j +"].TableName"));

				tableExcludes.add(tableExclude);
			}
			synchronizationObject.setTableExcludes(tableExcludes);

			synchronizationObjects.add(synchronizationObject);
		}
		describeSynchronizationJobStatusResponse.setSynchronizationObjects(synchronizationObjects);
	 
	 	return describeSynchronizationJobStatusResponse;
	}
}