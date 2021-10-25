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

import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationObjectModifyStatusResponse;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.CheckItem;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronizationObjectModifyStatusResponseUnmarshaller {

	public static DescribeSynchronizationObjectModifyStatusResponse unmarshall(DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatusResponse, UnmarshallerContext _ctx) {
		
		describeSynchronizationObjectModifyStatusResponse.setRequestId(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.RequestId"));
		describeSynchronizationObjectModifyStatusResponse.setErrCode(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.ErrCode"));
		describeSynchronizationObjectModifyStatusResponse.setErrMessage(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.ErrMessage"));
		describeSynchronizationObjectModifyStatusResponse.setErrorMessage(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.ErrorMessage"));
		describeSynchronizationObjectModifyStatusResponse.setStatus(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.Status"));
		describeSynchronizationObjectModifyStatusResponse.setSuccess(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.Success"));

		DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
		dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus.ErrorMessage"));
		dataInitializationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus.Percent"));
		dataInitializationStatus.setProgress(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus.Progress"));
		dataInitializationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataInitializationStatus.Status"));
		describeSynchronizationObjectModifyStatusResponse.setDataInitializationStatus(dataInitializationStatus);

		DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
		dataSynchronizationStatus.setDelay(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus.Delay"));
		dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus.ErrorMessage"));
		dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus.Percent"));
		dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.DataSynchronizationStatus.Status"));
		describeSynchronizationObjectModifyStatusResponse.setDataSynchronizationStatus(dataSynchronizationStatus);

		PrecheckStatus precheckStatus = new PrecheckStatus();
		precheckStatus.setPercent(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Percent"));
		precheckStatus.setStatus(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Status"));

		List<CheckItem> detail = new ArrayList<CheckItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setCheckStatus(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail["+ i +"].CheckStatus"));
			checkItem.setErrorMessage(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail["+ i +"].ErrorMessage"));
			checkItem.setItemName(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail["+ i +"].ItemName"));
			checkItem.setRepairMethod(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.PrecheckStatus.Detail["+ i +"].RepairMethod"));

			detail.add(checkItem);
		}
		precheckStatus.setDetail(detail);
		describeSynchronizationObjectModifyStatusResponse.setPrecheckStatus(precheckStatus);

		StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
		structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus.ErrorMessage"));
		structureInitializationStatus.setPercent(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus.Percent"));
		structureInitializationStatus.setProgress(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus.Progress"));
		structureInitializationStatus.setStatus(_ctx.stringValue("DescribeSynchronizationObjectModifyStatusResponse.StructureInitializationStatus.Status"));
		describeSynchronizationObjectModifyStatusResponse.setStructureInitializationStatus(structureInitializationStatus);
	 
	 	return describeSynchronizationObjectModifyStatusResponse;
	}
}