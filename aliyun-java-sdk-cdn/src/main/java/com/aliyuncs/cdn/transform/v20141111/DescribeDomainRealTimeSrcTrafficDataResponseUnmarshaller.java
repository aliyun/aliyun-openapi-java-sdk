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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeSrcTrafficDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeSrcTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeSrcTrafficDataResponseUnmarshaller {

	public static DescribeDomainRealTimeSrcTrafficDataResponse unmarshall(DescribeDomainRealTimeSrcTrafficDataResponse describeDomainRealTimeSrcTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainRealTimeSrcTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.RequestId"));
		describeDomainRealTimeSrcTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.DomainName"));
		describeDomainRealTimeSrcTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.StartTime"));
		describeDomainRealTimeSrcTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.EndTime"));
		describeDomainRealTimeSrcTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeSrcTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].Value"));

			realTimeSrcTrafficDataPerInterval.add(dataModule);
		}
		describeDomainRealTimeSrcTrafficDataResponse.setRealTimeSrcTrafficDataPerInterval(realTimeSrcTrafficDataPerInterval);
	 
	 	return describeDomainRealTimeSrcTrafficDataResponse;
	}
}