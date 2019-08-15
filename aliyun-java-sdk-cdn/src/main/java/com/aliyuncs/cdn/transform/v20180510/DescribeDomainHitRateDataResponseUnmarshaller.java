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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainHitRateDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainHitRateDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainHitRateDataResponseUnmarshaller {

	public static DescribeDomainHitRateDataResponse unmarshall(DescribeDomainHitRateDataResponse describeDomainHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeDomainHitRateDataResponse.RequestId"));
		describeDomainHitRateDataResponse.setDomainName(_ctx.stringValue("DescribeDomainHitRateDataResponse.DomainName"));
		describeDomainHitRateDataResponse.setStartTime(_ctx.stringValue("DescribeDomainHitRateDataResponse.StartTime"));
		describeDomainHitRateDataResponse.setEndTime(_ctx.stringValue("DescribeDomainHitRateDataResponse.EndTime"));
		describeDomainHitRateDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainHitRateDataResponse.DataInterval"));

		List<DataModule> hitRateInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainHitRateDataResponse.HitRateInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainHitRateDataResponse.HitRateInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainHitRateDataResponse.HitRateInterval["+ i +"].Value"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeDomainHitRateDataResponse.HitRateInterval["+ i +"].HttpsValue"));

			hitRateInterval.add(dataModule);
		}
		describeDomainHitRateDataResponse.setHitRateInterval(hitRateInterval);
	 
	 	return describeDomainHitRateDataResponse;
	}
}