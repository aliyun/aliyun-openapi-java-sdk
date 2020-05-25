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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.BatchBindPurchasedDevicesResponse;
import com.aliyuncs.vs.model.v20181212.BatchBindPurchasedDevicesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchBindPurchasedDevicesResponseUnmarshaller {

	public static BatchBindPurchasedDevicesResponse unmarshall(BatchBindPurchasedDevicesResponse batchBindPurchasedDevicesResponse, UnmarshallerContext _ctx) {
		
		batchBindPurchasedDevicesResponse.setRequestId(_ctx.stringValue("BatchBindPurchasedDevicesResponse.RequestId"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("BatchBindPurchasedDevicesResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setRegion(_ctx.stringValue("BatchBindPurchasedDevicesResponse.Results["+ i +"].Region"));
			result.setGroupId(_ctx.stringValue("BatchBindPurchasedDevicesResponse.Results["+ i +"].GroupId"));
			result.setDeviceId(_ctx.stringValue("BatchBindPurchasedDevicesResponse.Results["+ i +"].DeviceId"));
			result.setError(_ctx.stringValue("BatchBindPurchasedDevicesResponse.Results["+ i +"].Error"));

			results.add(result);
		}
		batchBindPurchasedDevicesResponse.setResults(results);
	 
	 	return batchBindPurchasedDevicesResponse;
	}
}