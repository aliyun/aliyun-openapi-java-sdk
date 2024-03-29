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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeHttpCodeDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeHttpCodeDataResponse.UsageData;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeHttpCodeDataResponse.UsageData.RealTimeCodeProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeHttpCodeDataResponseUnmarshaller {

	public static DescribeDomainRealTimeHttpCodeDataResponse unmarshall(DescribeDomainRealTimeHttpCodeDataResponse describeDomainRealTimeHttpCodeDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainRealTimeHttpCodeDataResponse.setRequestId(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RequestId"));
		describeDomainRealTimeHttpCodeDataResponse.setEndTime(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.EndTime"));
		describeDomainRealTimeHttpCodeDataResponse.setStartTime(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.StartTime"));
		describeDomainRealTimeHttpCodeDataResponse.setDomainName(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.DomainName"));
		describeDomainRealTimeHttpCodeDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.DataInterval"));

		List<UsageData> realTimeHttpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].TimeStamp"));

			List<RealTimeCodeProportionData> value = new ArrayList<RealTimeCodeProportionData>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value.Length"); j++) {
				RealTimeCodeProportionData realTimeCodeProportionData = new RealTimeCodeProportionData();
				realTimeCodeProportionData.setCode(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Code"));
				realTimeCodeProportionData.setProportion(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				realTimeCodeProportionData.setCount(_ctx.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(realTimeCodeProportionData);
			}
			usageData.setValue(value);

			realTimeHttpCodeData.add(usageData);
		}
		describeDomainRealTimeHttpCodeDataResponse.setRealTimeHttpCodeData(realTimeHttpCodeData);
	 
	 	return describeDomainRealTimeHttpCodeDataResponse;
	}
}