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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRealTimeBpsDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRealTimeBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainRealTimeBpsDataResponseUnmarshaller {

	public static DescribeLiveDomainRealTimeBpsDataResponse unmarshall(DescribeLiveDomainRealTimeBpsDataResponse describeLiveDomainRealTimeBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainRealTimeBpsDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainRealTimeBpsDataResponse.RequestId"));
		describeLiveDomainRealTimeBpsDataResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainRealTimeBpsDataResponse.DomainName"));
		describeLiveDomainRealTimeBpsDataResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainRealTimeBpsDataResponse.StartTime"));
		describeLiveDomainRealTimeBpsDataResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainRealTimeBpsDataResponse.EndTime"));
		describeLiveDomainRealTimeBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeLiveDomainRealTimeBpsDataResponse.DataInterval"));

		List<DataModule> realTimeBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainRealTimeBpsDataResponse.RealTimeBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDomainRealTimeBpsDataResponse.RealTimeBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeLiveDomainRealTimeBpsDataResponse.RealTimeBpsDataPerInterval["+ i +"].Value"));

			realTimeBpsDataPerInterval.add(dataModule);
		}
		describeLiveDomainRealTimeBpsDataResponse.setRealTimeBpsDataPerInterval(realTimeBpsDataPerInterval);
	 
	 	return describeLiveDomainRealTimeBpsDataResponse;
	}
}