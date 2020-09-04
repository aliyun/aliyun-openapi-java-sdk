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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.UsageData;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.UsageData.RealTimeSrcCodeProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRealTimeSrcHttpCodeDataResponseUnmarshaller {

	public static DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse unmarshall(DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse describeDcdnDomainRealTimeSrcHttpCodeDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainRealTimeSrcHttpCodeDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.RequestId"));
		describeDcdnDomainRealTimeSrcHttpCodeDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.DomainName"));
		describeDcdnDomainRealTimeSrcHttpCodeDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.StartTime"));
		describeDcdnDomainRealTimeSrcHttpCodeDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.EndTime"));
		describeDcdnDomainRealTimeSrcHttpCodeDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.DataInterval"));

		List<UsageData> realTimeSrcHttpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].TimeStamp"));

			List<RealTimeSrcCodeProportionData> value = new ArrayList<RealTimeSrcCodeProportionData>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].Value.Length"); j++) {
				RealTimeSrcCodeProportionData realTimeSrcCodeProportionData = new RealTimeSrcCodeProportionData();
				realTimeSrcCodeProportionData.setCode(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].Value["+ j +"].Code"));
				realTimeSrcCodeProportionData.setProportion(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				realTimeSrcCodeProportionData.setCount(_ctx.stringValue("DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.RealTimeSrcHttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(realTimeSrcCodeProportionData);
			}
			usageData.setValue(value);

			realTimeSrcHttpCodeData.add(usageData);
		}
		describeDcdnDomainRealTimeSrcHttpCodeDataResponse.setRealTimeSrcHttpCodeData(realTimeSrcHttpCodeData);
	 
	 	return describeDcdnDomainRealTimeSrcHttpCodeDataResponse;
	}
}