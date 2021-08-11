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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDrmUsageDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDrmUsageDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDrmUsageDataResponseUnmarshaller {

	public static DescribeLiveDrmUsageDataResponse unmarshall(DescribeLiveDrmUsageDataResponse describeLiveDrmUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDrmUsageDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDrmUsageDataResponse.RequestId"));

		List<DataModule> drmUsageData = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDrmUsageDataResponse.DrmUsageData.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDrmUsageDataResponse.DrmUsageData["+ i +"].TimeStamp"));
			dataModule.setDomain(_ctx.stringValue("DescribeLiveDrmUsageDataResponse.DrmUsageData["+ i +"].Domain"));
			dataModule.setRegion(_ctx.stringValue("DescribeLiveDrmUsageDataResponse.DrmUsageData["+ i +"].Region"));
			dataModule.setDrmType(_ctx.stringValue("DescribeLiveDrmUsageDataResponse.DrmUsageData["+ i +"].DrmType"));
			dataModule.setCount(_ctx.longValue("DescribeLiveDrmUsageDataResponse.DrmUsageData["+ i +"].Count"));

			drmUsageData.add(dataModule);
		}
		describeLiveDrmUsageDataResponse.setDrmUsageData(drmUsageData);
	 
	 	return describeLiveDrmUsageDataResponse;
	}
}