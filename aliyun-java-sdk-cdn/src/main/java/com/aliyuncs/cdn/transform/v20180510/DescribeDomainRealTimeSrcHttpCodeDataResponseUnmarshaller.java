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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeSrcHttpCodeDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeSrcHttpCodeDataResponse.UsageData;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeSrcHttpCodeDataResponse.UsageData.RealTimeSrcCodeProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeSrcHttpCodeDataResponseUnmarshaller {

	public static DescribeDomainRealTimeSrcHttpCodeDataResponse unmarshall(DescribeDomainRealTimeSrcHttpCodeDataResponse describeDomainRealTimeSrcHttpCodeDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainRealTimeSrcHttpCodeDataResponse.setRequestId(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.RequestId"));
		describeDomainRealTimeSrcHttpCodeDataResponse.setDomainName(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.DomainName"));
		describeDomainRealTimeSrcHttpCodeDataResponse.setStartTime(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.StartTime"));
		describeDomainRealTimeSrcHttpCodeDataResponse.setEndTime(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.EndTime"));
		describeDomainRealTimeSrcHttpCodeDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.DataInterval"));

		List<UsageData> realTimeSrcHttpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].TimeStamp"));

			List<RealTimeSrcCodeProportionData> value = new ArrayList<RealTimeSrcCodeProportionData>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].Value.Length"); j++) {
				RealTimeSrcCodeProportionData realTimeSrcCodeProportionData = new RealTimeSrcCodeProportionData();
				realTimeSrcCodeProportionData.setCode(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].Value["+ j +"].Code"));
				realTimeSrcCodeProportionData.setProportion(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				realTimeSrcCodeProportionData.setCount(_ctx.stringValue("DescribeDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(realTimeSrcCodeProportionData);
			}
			usageData.setValue(value);

			realTimeSrcHttpCodeData.add(usageData);
		}
		describeDomainRealTimeSrcHttpCodeDataResponse.setRealTimeSrcHttpCodeData(realTimeSrcHttpCodeData);
	 
	 	return describeDomainRealTimeSrcHttpCodeDataResponse;
	}
}