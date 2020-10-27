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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribePendingMaintenanceActionsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribePendingMaintenanceActionsResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePendingMaintenanceActionsResponseUnmarshaller {

	public static DescribePendingMaintenanceActionsResponse unmarshall(DescribePendingMaintenanceActionsResponse describePendingMaintenanceActionsResponse, UnmarshallerContext _ctx) {
		
		describePendingMaintenanceActionsResponse.setRequestId(_ctx.stringValue("DescribePendingMaintenanceActionsResponse.RequestId"));

		List<Items> typeList = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("DescribePendingMaintenanceActionsResponse.TypeList.Length"); i++) {
			Items items = new Items();
			items.setTaskType(_ctx.stringValue("DescribePendingMaintenanceActionsResponse.TypeList["+ i +"].TaskType"));
			items.setCount(_ctx.integerValue("DescribePendingMaintenanceActionsResponse.TypeList["+ i +"].Count"));

			typeList.add(items);
		}
		describePendingMaintenanceActionsResponse.setTypeList(typeList);
	 
	 	return describePendingMaintenanceActionsResponse;
	}
}