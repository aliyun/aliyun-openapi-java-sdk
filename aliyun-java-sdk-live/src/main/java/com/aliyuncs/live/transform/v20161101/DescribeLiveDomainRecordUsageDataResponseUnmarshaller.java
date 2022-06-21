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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRecordUsageDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRecordUsageDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainRecordUsageDataResponseUnmarshaller {

	public static DescribeLiveDomainRecordUsageDataResponse unmarshall(DescribeLiveDomainRecordUsageDataResponse describeLiveDomainRecordUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainRecordUsageDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainRecordUsageDataResponse.RequestId"));

		List<DataModule> recordUsageData = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainRecordUsageDataResponse.RecordUsageData.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDomainRecordUsageDataResponse.RecordUsageData["+ i +"].TimeStamp"));
			dataModule.setDomain(_ctx.stringValue("DescribeLiveDomainRecordUsageDataResponse.RecordUsageData["+ i +"].Domain"));
			dataModule.setType(_ctx.stringValue("DescribeLiveDomainRecordUsageDataResponse.RecordUsageData["+ i +"].Type"));
			dataModule.setDuration(_ctx.longValue("DescribeLiveDomainRecordUsageDataResponse.RecordUsageData["+ i +"].Duration"));
			dataModule.setCount(_ctx.longValue("DescribeLiveDomainRecordUsageDataResponse.RecordUsageData["+ i +"].Count"));

			recordUsageData.add(dataModule);
		}
		describeLiveDomainRecordUsageDataResponse.setRecordUsageData(recordUsageData);
	 
	 	return describeLiveDomainRecordUsageDataResponse;
	}
}