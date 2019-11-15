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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeSrcTrafficDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeSrcTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRealTimeSrcTrafficDataResponseUnmarshaller {

	public static DescribeDcdnDomainRealTimeSrcTrafficDataResponse unmarshall(DescribeDcdnDomainRealTimeSrcTrafficDataResponse describeDcdnDomainRealTimeSrcTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainRealTimeSrcTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcTrafficDataResponse.RequestId"));
		describeDcdnDomainRealTimeSrcTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcTrafficDataResponse.DomainName"));
		describeDcdnDomainRealTimeSrcTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcTrafficDataResponse.StartTime"));
		describeDcdnDomainRealTimeSrcTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcTrafficDataResponse.EndTime"));
		describeDcdnDomainRealTimeSrcTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeSrcTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].Value"));

			realTimeSrcTrafficDataPerInterval.add(dataModule);
		}
		describeDcdnDomainRealTimeSrcTrafficDataResponse.setRealTimeSrcTrafficDataPerInterval(realTimeSrcTrafficDataPerInterval);
	 
	 	return describeDcdnDomainRealTimeSrcTrafficDataResponse;
	}
}