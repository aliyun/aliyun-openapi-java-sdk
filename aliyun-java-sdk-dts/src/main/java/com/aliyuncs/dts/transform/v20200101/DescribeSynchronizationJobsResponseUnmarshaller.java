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

import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.DataInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.DestinationEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.Performance;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.PrecheckStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.PrecheckStatus.CheckItem;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.StructureInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.SynchronizationObject;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.SynchronizationObject.TableExclude;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobsResponse.SynchronizationInstance.SynchronizationObject.TableInclude;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronizationJobsResponseUnmarshaller {

	public static DescribeSynchronizationJobsResponse unmarshall(DescribeSynchronizationJobsResponse describeSynchronizationJobsResponse, UnmarshallerContext _ctx) {
		
		describeSynchronizationJobsResponse.setRequestId(_ctx.stringValue("DescribeSynchronizationJobsResponse.RequestId"));
		describeSynchronizationJobsResponse.setPageNumber(_ctx.integerValue("DescribeSynchronizationJobsResponse.PageNumber"));
		describeSynchronizationJobsResponse.setPageRecordCount(_ctx.integerValue("DescribeSynchronizationJobsResponse.PageRecordCount"));
		describeSynchronizationJobsResponse.setTotalRecordCount(_ctx.longValue("DescribeSynchronizationJobsResponse.TotalRecordCount"));

		List<SynchronizationInstance> synchronizationInstances = new ArrayList<SynchronizationInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances.Length"); i++) {
			SynchronizationInstance synchronizationInstance = new SynchronizationInstance();
			synchronizationInstance.setDataInitialization(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitialization"));
			synchronizationInstance.setDelay(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].Delay"));
			synchronizationInstance.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].ErrorMessage"));
			synchronizationInstance.setExpireTime(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].ExpireTime"));
			synchronizationInstance.setPayType(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PayType"));
			synchronizationInstance.setStatus(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].Status"));
			synchronizationInstance.setStructureInitialization(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitialization"));
			synchronizationInstance.setSynchronizationDirection(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationDirection"));
			synchronizationInstance.setSynchronizationJobClass(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationJobClass"));
			synchronizationInstance.setSynchronizationJobId(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationJobId"));
			synchronizationInstance.setSynchronizationJobName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationJobName"));
			synchronizationInstance.setCreateTime(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].CreateTime"));

			DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
			dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitializationStatus.ErrorMessage"));
			dataInitializationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitializationStatus.Percent"));
			dataInitializationStatus.setProgress(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitializationStatus.Progress"));
			dataInitializationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataInitializationStatus.Status"));
			synchronizationInstance.setDataInitializationStatus(dataInitializationStatus);

			DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
			dataSynchronizationStatus.setDelay(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataSynchronizationStatus.Delay"));
			dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataSynchronizationStatus.ErrorMessage"));
			dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataSynchronizationStatus.Percent"));
			dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DataSynchronizationStatus.Status"));
			synchronizationInstance.setDataSynchronizationStatus(dataSynchronizationStatus);

			DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
			destinationEndpoint.setEngineName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.EngineName"));
			destinationEndpoint.setIP(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.IP"));
			destinationEndpoint.setInstanceId(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.InstanceId"));
			destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.InstanceType"));
			destinationEndpoint.setPort(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.Port"));
			destinationEndpoint.setUserName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].DestinationEndpoint.UserName"));
			synchronizationInstance.setDestinationEndpoint(destinationEndpoint);

			Performance performance = new Performance();
			performance.setFLOW(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].Performance.FLOW"));
			performance.setRPS(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].Performance.RPS"));
			synchronizationInstance.setPerformance(performance);

			PrecheckStatus precheckStatus = new PrecheckStatus();
			precheckStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Percent"));
			precheckStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Status"));

			List<CheckItem> detail = new ArrayList<CheckItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail.Length"); j++) {
				CheckItem checkItem = new CheckItem();
				checkItem.setCheckStatus(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail["+ j +"].CheckStatus"));
				checkItem.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail["+ j +"].ErrorMessage"));
				checkItem.setItemName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail["+ j +"].ItemName"));
				checkItem.setRepairMethod(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].PrecheckStatus.Detail["+ j +"].RepairMethod"));

				detail.add(checkItem);
			}
			precheckStatus.setDetail(detail);
			synchronizationInstance.setPrecheckStatus(precheckStatus);

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setEngineName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.EngineName"));
			sourceEndpoint.setIP(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.IP"));
			sourceEndpoint.setInstanceId(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.InstanceId"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.InstanceType"));
			sourceEndpoint.setPort(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.Port"));
			sourceEndpoint.setUserName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SourceEndpoint.UserName"));
			synchronizationInstance.setSourceEndpoint(sourceEndpoint);

			StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
			structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitializationStatus.ErrorMessage"));
			structureInitializationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitializationStatus.Percent"));
			structureInitializationStatus.setProgress(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitializationStatus.Progress"));
			structureInitializationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].StructureInitializationStatus.Status"));
			synchronizationInstance.setStructureInitializationStatus(structureInitializationStatus);

			List<SynchronizationObject> synchronizationObjects = new ArrayList<SynchronizationObject>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects.Length"); j++) {
				SynchronizationObject synchronizationObject = new SynchronizationObject();
				synchronizationObject.setNewSchemaName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].NewSchemaName"));
				synchronizationObject.setSchemaName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].SchemaName"));

				List<TableExclude> tableExcludes = new ArrayList<TableExclude>();
				for (int k = 0; k < _ctx.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].TableExcludes.Length"); k++) {
					TableExclude tableExclude = new TableExclude();
					tableExclude.setTableName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].TableExcludes["+ k +"].TableName"));

					tableExcludes.add(tableExclude);
				}
				synchronizationObject.setTableExcludes(tableExcludes);

				List<TableInclude> tableIncludes = new ArrayList<TableInclude>();
				for (int k = 0; k < _ctx.lengthValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].TableIncludes.Length"); k++) {
					TableInclude tableInclude = new TableInclude();
					tableInclude.setTableName(_ctx.stringValue("DescribeSynchronizationJobsResponse.SynchronizationInstances["+ i +"].SynchronizationObjects["+ j +"].TableIncludes["+ k +"].TableName"));

					tableIncludes.add(tableInclude);
				}
				synchronizationObject.setTableIncludes(tableIncludes);

				synchronizationObjects.add(synchronizationObject);
			}
			synchronizationInstance.setSynchronizationObjects(synchronizationObjects);

			synchronizationInstances.add(synchronizationInstance);
		}
		describeSynchronizationJobsResponse.setSynchronizationInstances(synchronizationInstances);
	 
	 	return describeSynchronizationJobsResponse;
	}
}