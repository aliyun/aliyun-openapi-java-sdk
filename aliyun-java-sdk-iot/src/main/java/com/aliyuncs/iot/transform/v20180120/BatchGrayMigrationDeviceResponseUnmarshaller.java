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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.BatchGrayMigrationDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BatchGrayMigrationDeviceResponse.Data;
import com.aliyuncs.iot.model.v20180120.BatchGrayMigrationDeviceResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGrayMigrationDeviceResponseUnmarshaller {

	public static BatchGrayMigrationDeviceResponse unmarshall(BatchGrayMigrationDeviceResponse batchGrayMigrationDeviceResponse, UnmarshallerContext _ctx) {
		
		batchGrayMigrationDeviceResponse.setRequestId(_ctx.stringValue("BatchGrayMigrationDeviceResponse.RequestId"));
		batchGrayMigrationDeviceResponse.setCode(_ctx.stringValue("BatchGrayMigrationDeviceResponse.Code"));
		batchGrayMigrationDeviceResponse.setErrorMessage(_ctx.stringValue("BatchGrayMigrationDeviceResponse.ErrorMessage"));
		batchGrayMigrationDeviceResponse.setSuccess(_ctx.booleanValue("BatchGrayMigrationDeviceResponse.Success"));

		Data data = new Data();

		List<Item> details = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("BatchGrayMigrationDeviceResponse.Data.Details.Length"); i++) {
			Item item = new Item();
			item.setStatus(_ctx.stringValue("BatchGrayMigrationDeviceResponse.Data.Details["+ i +"].Status"));
			item.setCode(_ctx.integerValue("BatchGrayMigrationDeviceResponse.Data.Details["+ i +"].Code"));
			item.setMessage(_ctx.stringValue("BatchGrayMigrationDeviceResponse.Data.Details["+ i +"].Message"));
			item.setDeviceName(_ctx.stringValue("BatchGrayMigrationDeviceResponse.Data.Details["+ i +"].DeviceName"));

			details.add(item);
		}
		data.setDetails(details);
		batchGrayMigrationDeviceResponse.setData(data);
	 
	 	return batchGrayMigrationDeviceResponse;
	}
}