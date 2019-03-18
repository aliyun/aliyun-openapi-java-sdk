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

import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationObjectModifyStatusResponse;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.CheckItem;
import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronizationObjectModifyStatusResponseUnmarshaller {

	public static DescribeSynchronizationObjectModifyStatusResponse unmarshall(DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatusResponse, UnmarshallerContext context) {
		
		describeSynchronizationObjectModifyStatusResponse.setRequestId(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.RequestId"));
		describeSynchronizationObjectModifyStatusResponse.setStatus(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.Status"));
		describeSynchronizationObjectModifyStatusResponse.setErrorMessage(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.ErrorMessage"));

		PrecheckStatus precheckStatus = new PrecheckStatus();
		precheckStatus.setStatus(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Status"));
		precheckStatus.setPercent(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Percent"));

		List<CheckItem> detail = new ArrayList<CheckItem>();
		for (int i = 0; i < context.lengthValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setItemName(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail["+ i +"].ItemName"));
			checkItem.setCheckStatus(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail["+ i +"].CheckStatus"));
			checkItem.setErrorMessage(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail["+ i +"].ErrorMessage"));
			checkItem.setRepairMethod(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail["+ i +"].RepairMethod"));

			detail.add(checkItem);
		}
		precheckStatus.setDetail(detail);
		describeSynchronizationObjectModifyStatusResponse.setPrecheckStatus(precheckStatus);

		StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
		structureInitializationStatus.setStatus(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus.Status"));
		structureInitializationStatus.setPercent(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus.Percent"));
		structureInitializationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus.ErrorMessage"));
		structureInitializationStatus.setProgress(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus.Progress"));
		describeSynchronizationObjectModifyStatusResponse.setStructureInitializationStatus(structureInitializationStatus);

		DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
		dataInitializationStatus.setStatus(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus.Status"));
		dataInitializationStatus.setPercent(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus.Percent"));
		dataInitializationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus.ErrorMessage"));
		dataInitializationStatus.setProgress(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus.Progress"));
		describeSynchronizationObjectModifyStatusResponse.setDataInitializationStatus(dataInitializationStatus);

		DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
		dataSynchronizationStatus.setStatus(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus.Status"));
		dataSynchronizationStatus.setPercent(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus.Percent"));
		dataSynchronizationStatus.setErrorMessage(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus.ErrorMessage"));
		dataSynchronizationStatus.setDelay(context.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus.Delay"));
		describeSynchronizationObjectModifyStatusResponse.setDataSynchronizationStatus(dataSynchronizationStatus);
	 
	 	return describeSynchronizationObjectModifyStatusResponse;
	}
}