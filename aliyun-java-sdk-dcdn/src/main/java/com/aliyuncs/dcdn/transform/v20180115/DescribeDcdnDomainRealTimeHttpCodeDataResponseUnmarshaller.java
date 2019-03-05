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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeHttpCodeDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeHttpCodeDataResponse.UsageData;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeHttpCodeDataResponse.UsageData.RealTimeCodeProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRealTimeHttpCodeDataResponseUnmarshaller {

	public static DescribeDcdnDomainRealTimeHttpCodeDataResponse unmarshall(DescribeDcdnDomainRealTimeHttpCodeDataResponse describeDcdnDomainRealTimeHttpCodeDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainRealTimeHttpCodeDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.RequestId"));
		describeDcdnDomainRealTimeHttpCodeDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.DomainName"));
		describeDcdnDomainRealTimeHttpCodeDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.StartTime"));
		describeDcdnDomainRealTimeHttpCodeDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.EndTime"));
		describeDcdnDomainRealTimeHttpCodeDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.DataInterval"));

		List<UsageData> realTimeHttpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].TimeStamp"));

			List<RealTimeCodeProportionData> value = new ArrayList<RealTimeCodeProportionData>();
			for (int j = 0; j < context.lengthValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value.Length"); j++) {
				RealTimeCodeProportionData realTimeCodeProportionData = new RealTimeCodeProportionData();
				realTimeCodeProportionData.setCode(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Code"));
				realTimeCodeProportionData.setProportion(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				realTimeCodeProportionData.setCount(context.stringValue("DescribeDcdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(realTimeCodeProportionData);
			}
			usageData.setValue(value);

			realTimeHttpCodeData.add(usageData);
		}
		describeDcdnDomainRealTimeHttpCodeDataResponse.setRealTimeHttpCodeData(realTimeHttpCodeData);
	 
	 	return describeDcdnDomainRealTimeHttpCodeDataResponse;
	}
}