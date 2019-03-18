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

import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.DataInitializationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.DestinationEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.Performance;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.PrecheckStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.PrecheckStatus.CheckItem;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.SourceEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.StructureInitializationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.SynchronizationObject;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.SynchronizationObject.TableExclude;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobsResponse.SynchronizationInstance.SynchronizationObject.TableInclude;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronizationJobsResponseUnmarshaller {

	public static DescribeSynchronizationJobsResponse unmarshall(DescribeSynchronizationJobsResponse describeSynchronizationJobsResponse, UnmarshallerContext context) {
		
		describeSynchronizationJobsResponse.setRequestId(context.stringValue("DescribeSynchronizationJobsResponse.RequestId"));
		describeSynchronizationJobsResponse.setPageNumber(context.integerValue("DescribeSynchronizationJobsResponse.PageNumber"));
		describeSynchronizationJobsResponse.setTotalRecordCount(context.longValue("DescribeSynchronizationJobsResponse.TotalRecordCount"));
		describeSynchronizationJobsResponse.setPageRecordCount(context.integerValue("DescribeSynchronizationJobsResponse.PageRecordCount"));

		List<SynchronizationInstance> synchronizationInstances = new ArrayList<SynchronizationInstance>();
		for (int i = 0; i < context.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances.Length"); i++) {
			SynchronizationInstance synchronizationInstance = new SynchronizationInstance();
			synchronizationInstance.setSynchronizationJobId(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationJobId"));
			synchronizationInstance.setSynchronizationDirection(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationDirection"));
			synchronizationInstance.setSynchronizationJobName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationJobName"));
			synchronizationInstance.setSynchronizationJobClass(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationJobClass"));
			synchronizationInstance.setPayType(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PayType"));
			synchronizationInstance.setExpireTime(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].ExpireTime"));
			synchronizationInstance.setStructureInitialization(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitialization"));
			synchronizationInstance.setDataInitialization(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitialization"));
			synchronizationInstance.setStatus(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].Status"));
			synchronizationInstance.setErrorMessage(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].ErrorMessage"));
			synchronizationInstance.setDelay(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].Delay"));

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setInstanceType(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setInstanceId(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.InstanceId"));
			sourceEndpoint.setEngineName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint.setIP(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.IP"));
			sourceEndpoint.setPort(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setUserName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.UserName"));
			synchronizationInstance.setSourceEndpoint(sourceEndpoint);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setInstanceType(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setInstanceId(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.InstanceId"));
			destinationEndpoint.setEngineName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint.setIP(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.IP"));
			destinationEndpoint.setPort(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setUserName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.UserName"));
			synchronizationInstance.setDestinationEndpoint(destinationEndpoint);

			PrecheckStatus precheckStatus = new PrecheckStatus();
			precheckStatus.setStatus(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Status"));
			precheckStatus.setPercent(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Percent"));

			List<CheckItem> detail = new ArrayList<CheckItem>();
			for (int j = 0; j < context.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail.Length"); j++) {
				CheckItem checkItem = new CheckItem();
				checkItem.setItemName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail["+ j +"].ItemName"));
				checkItem.setCheckStatus(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail["+ j +"].CheckStatus"));
				checkItem.setErrorMessage(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail["+ j +"].ErrorMessage"));
				checkItem.setRepairMethod(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail["+ j +"].RepairMethod"));

				detail.add(checkItem);
			}
			precheckStatus.setDetail(detail);
			synchronizationInstance.setPrecheckStatus(precheckStatus);

			StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
			structureInitializationStatus.setStatus(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitializationStatus.Status"));
			structureInitializationStatus.setPercent(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitializationStatus.Percent"));
			structureInitializationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus.setProgress(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitializationStatus.Progress"));
			synchronizationInstance.setStructureInitializationStatus(structureInitializationStatus);

			DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
			dataInitializationStatus.setStatus(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitializationStatus.Status"));
			dataInitializationStatus.setPercent(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitializationStatus.Percent"));
			dataInitializationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus.setProgress(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitializationStatus.Progress"));
			synchronizationInstance.setDataInitializationStatus(dataInitializationStatus);

			DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
			dataSynchronizationStatus.setStatus(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataSynchronizationStatus.Status"));
			dataSynchronizationStatus.setPercent(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus.setDelay(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataSynchronizationStatus.Delay"));
			synchronizationInstance.setDataSynchronizationStatus(dataSynchronizationStatus);

			Performance performance = new Performance();
			performance.setRPS(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].Performance.RPS"));
			performance.setFLOW(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].Performance.FLOW"));
			synchronizationInstance.setPerformance(performance);

			List<SynchronizationObject> synchronizationObjects = new ArrayList<SynchronizationObject>();
			for (int j = 0; j < context.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects.Length"); j++) {
				SynchronizationObject synchronizationObject = new SynchronizationObject();
				synchronizationObject.setSchemaName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].SchemaName"));
				synchronizationObject.setNewSchemaName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].NewSchemaName"));

				List<TableInclude> tableIncludes = new ArrayList<TableInclude>();
				for (int k = 0; k < context.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].TableIncludes.Length"); k++) {
					TableInclude tableInclude = new TableInclude();
					tableInclude.setTableName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].TableIncludes["+ k +"].TableName"));

					tableIncludes.add(tableInclude);
				}
				synchronizationObject.setTableIncludes(tableIncludes);

				List<TableExclude> tableExcludes = new ArrayList<TableExclude>();
				for (int k = 0; k < context.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].TableExcludes.Length"); k++) {
					TableExclude tableExclude = new TableExclude();
					tableExclude.setTableName(context.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].TableExcludes["+ k +"].TableName"));

					tableExcludes.add(tableExclude);
				}
				synchronizationObject.setTableExcludes(tableExcludes);

				synchronizationObjects.add(synchronizationObject);
			}
			synchronizationInstance.setSynchronizationObjects(synchronizationObjects);

			synchronizationInstances.add(synchronizationInstance);
		}
		describeSynchronizationJobsResponse.setSynchronizationInstances(synchronizationInstances);
	 
	 	return describeSynchronizationJobsResponse;
	}
}