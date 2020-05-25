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

import com.aliyuncs.vs.model.v20181212.BatchUnbindPurchasedDevicesResponse;
import com.aliyuncs.vs.model.v20181212.BatchUnbindPurchasedDevicesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchUnbindPurchasedDevicesResponseUnmarshaller {

	public static BatchUnbindPurchasedDevicesResponse unmarshall(BatchUnbindPurchasedDevicesResponse batchUnbindPurchasedDevicesResponse, UnmarshallerContext _ctx) {
		
		batchUnbindPurchasedDevicesResponse.setRequestId(_ctx.stringValue("BatchUnbindPurchasedDevicesResponse.RequestId"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("BatchUnbindPurchasedDevicesResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setDeviceId(_ctx.stringValue("BatchUnbindPurchasedDevicesResponse.Results["+ i +"].DeviceId"));
			result.setError(_ctx.stringValue("BatchUnbindPurchasedDevicesResponse.Results["+ i +"].Error"));

			results.add(result);
		}
		batchUnbindPurchasedDevicesResponse.setResults(results);
	 
	 	return batchUnbindPurchasedDevicesResponse;
	}
}