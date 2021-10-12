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

import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.DataInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.DestinationEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.Performance;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.PrecheckStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.PrecheckStatus.CheckItem;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.StructureInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.SynchronizationObject;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.SynchronizationObject.TableExclude;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusResponse.SynchronizationObject.TableInclude;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronizationJobStatusResponseUnmarshaller {

	public static DescribeSynchronizationJobStatusResponse unmarshall(DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatusResponse, UnmarshallerContext _ctx) {
		
		describeSynchronizationJobStatusResponse.setRequestId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.RequestId"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobName"));
		describeSynchronizationJobStatusResponse.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Status"));
		describeSynchronizationJobStatusResponse.setDataInitialization(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitialization"));
		describeSynchronizationJobStatusResponse.setDelay(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Delay"));
		describeSynchronizationJobStatusResponse.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.ErrorMessage"));
		describeSynchronizationJobStatusResponse.setExpireTime(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.ExpireTime"));
		describeSynchronizationJobStatusResponse.setErrCode(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.ErrCode"));
		describeSynchronizationJobStatusResponse.setSuccess(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Success"));
		describeSynchronizationJobStatusResponse.setStructureInitialization(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitialization"));
		describeSynchronizationJobStatusResponse.setPayType(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PayType"));
		describeSynchronizationJobStatusResponse.setErrMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.ErrMessage"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobClass(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobClass"));
		describeSynchronizationJobStatusResponse.setSynchronizationJobId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationJobId"));
		describeSynchronizationJobStatusResponse.setDelayMillis(_ctx.longValue("DescribeSynchronizationJobStatusResponse.DelayMillis"));
		describeSynchronizationJobStatusResponse.setSynchronizationDirection(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationDirection"));
		describeSynchronizationJobStatusResponse.setTaskId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.TaskId"));
		describeSynchronizationJobStatusResponse.setCheckpoint(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Checkpoint"));

		DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
		dataInitializationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Status"));
		dataInitializationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Percent"));
		dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.ErrorMessage"));
		dataInitializationStatus.setProgress(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataInitializationStatus.Progress"));
		describeSynchronizationJobStatusResponse.setDataInitializationStatus(dataInitializationStatus);

		DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
		dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Status"));
		dataSynchronizationStatus.setDelay(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Delay"));
		dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Percent"));
		dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.ErrorMessage"));
		dataSynchronizationStatus.setDelayMillis(_ctx.longValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.DelayMillis"));
		dataSynchronizationStatus.setCheckpoint(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DataSynchronizationStatus.Checkpoint"));
		describeSynchronizationJobStatusResponse.setDataSynchronizationStatus(dataSynchronizationStatus);

		DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
		destinationEndpoint.setInstanceId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.InstanceId"));
		destinationEndpoint.setIP(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.IP"));
		destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.InstanceType"));
		destinationEndpoint.setPort(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.Port"));
		destinationEndpoint.setUserName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.UserName"));
		destinationEndpoint.setEngineName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.DestinationEndpoint.EngineName"));
		describeSynchronizationJobStatusResponse.setDestinationEndpoint(destinationEndpoint);

		Performance performance = new Performance();
		performance.setRPS(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Performance.RPS"));
		performance.setFLOW(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.Performance.FLOW"));
		describeSynchronizationJobStatusResponse.setPerformance(performance);

		PrecheckStatus precheckStatus = new PrecheckStatus();
		precheckStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Status"));
		precheckStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Percent"));

		List<CheckItem> detail = new ArrayList<CheckItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setCheckStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].CheckStatus"));
			checkItem.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ErrorMessage"));
			checkItem.setItemName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ItemName"));
			checkItem.setRepairMethod(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.PrecheckStatus.Detail["+ i +"].RepairMethod"));

			detail.add(checkItem);
		}
		precheckStatus.setDetail(detail);
		describeSynchronizationJobStatusResponse.setPrecheckStatus(precheckStatus);

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setInstanceId(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.InstanceId"));
		sourceEndpoint.setIP(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.IP"));
		sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.InstanceType"));
		sourceEndpoint.setPort(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.Port"));
		sourceEndpoint.setUserName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.UserName"));
		sourceEndpoint.setEngineName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SourceEndpoint.EngineName"));
		describeSynchronizationJobStatusResponse.setSourceEndpoint(sourceEndpoint);

		StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
		structureInitializationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Status"));
		structureInitializationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Percent"));
		structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.ErrorMessage"));
		structureInitializationStatus.setProgress(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.StructureInitializationStatus.Progress"));
		describeSynchronizationJobStatusResponse.setStructureInitializationStatus(structureInitializationStatus);

		List<SynchronizationObject> synchronizationObjects = new ArrayList<SynchronizationObject>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects.Length"); i++) {
			SynchronizationObject synchronizationObject = new SynchronizationObject();
			synchronizationObject.setNewSchemaName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].NewSchemaName"));
			synchronizationObject.setSchemaName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].SchemaName"));

			List<TableExclude> tableExcludes = new ArrayList<TableExclude>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableExcludes.Length"); j++) {
				TableExclude tableExclude = new TableExclude();
				tableExclude.setTableName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableExcludes["+ j +"].TableName"));

				tableExcludes.add(tableExclude);
			}
			synchronizationObject.setTableExcludes(tableExcludes);

			List<TableInclude> tableIncludes = new ArrayList<TableInclude>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableIncludes.Length"); j++) {
				TableInclude tableInclude = new TableInclude();
				tableInclude.setTableName(_ctx.stringValue("DescribeSynchronizationJobStatusResponse.SynchronizationObjects["+ i +"].TableIncludes["+ j +"].TableName"));

				tableIncludes.add(tableInclude);
			}
			synchronizationObject.setTableIncludes(tableIncludes);

			synchronizationObjects.add(synchronizationObject);
		}
		describeSynchronizationJobStatusResponse.setSynchronizationObjects(synchronizationObjects);
	 
	 	return describeSynchronizationJobStatusResponse;
	}
}