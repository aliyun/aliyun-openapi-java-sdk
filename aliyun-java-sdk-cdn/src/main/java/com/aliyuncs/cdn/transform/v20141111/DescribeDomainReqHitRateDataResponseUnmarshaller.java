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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainReqHitRateDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainReqHitRateDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainReqHitRateDataResponseUnmarshaller {

	public static DescribeDomainReqHitRateDataResponse unmarshall(DescribeDomainReqHitRateDataResponse describeDomainReqHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainReqHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeDomainReqHitRateDataResponse.RequestId"));
		describeDomainReqHitRateDataResponse.setDomainName(_ctx.stringValue("DescribeDomainReqHitRateDataResponse.DomainName"));
		describeDomainReqHitRateDataResponse.setStartTime(_ctx.stringValue("DescribeDomainReqHitRateDataResponse.StartTime"));
		describeDomainReqHitRateDataResponse.setEndTime(_ctx.stringValue("DescribeDomainReqHitRateDataResponse.EndTime"));
		describeDomainReqHitRateDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainReqHitRateDataResponse.DataInterval"));

		List<DataModule> reqHitRateInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainReqHitRateDataResponse.ReqHitRateInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainReqHitRateDataResponse.ReqHitRateInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainReqHitRateDataResponse.ReqHitRateInterval["+ i +"].Value"));

			reqHitRateInterval.add(dataModule);
		}
		describeDomainReqHitRateDataResponse.setReqHitRateInterval(reqHitRateInterval);
	 
	 	return describeDomainReqHitRateDataResponse;
	}
}