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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeHttpCodeDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeHttpCodeDataResponse.UsageData;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeHttpCodeDataResponse.UsageData.RealTimeCodeProportionData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeHttpCodeDataResponseUnmarshaller {

	public static DescribeDomainRealTimeHttpCodeDataResponse unmarshall(DescribeDomainRealTimeHttpCodeDataResponse describeDomainRealTimeHttpCodeDataResponse, UnmarshallerContext context) {
		
		describeDomainRealTimeHttpCodeDataResponse.setRequestId(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RequestId"));
		describeDomainRealTimeHttpCodeDataResponse.setDomainName(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.DomainName"));
		describeDomainRealTimeHttpCodeDataResponse.setStartTime(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.StartTime"));
		describeDomainRealTimeHttpCodeDataResponse.setEndTime(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.EndTime"));
		describeDomainRealTimeHttpCodeDataResponse.setDataInterval(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.DataInterval"));

		List<UsageData> realTimeHttpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].TimeStamp"));

			List<RealTimeCodeProportionData> value = new ArrayList<RealTimeCodeProportionData>();
			for (int j = 0; j < context.lengthValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value.Length"); j++) {
				RealTimeCodeProportionData realTimeCodeProportionData = new RealTimeCodeProportionData();
				realTimeCodeProportionData.setCode(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Code"));
				realTimeCodeProportionData.setProportion(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				realTimeCodeProportionData.setCount(context.stringValue("DescribeDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(realTimeCodeProportionData);
			}
			usageData.setValue(value);

			realTimeHttpCodeData.add(usageData);
		}
		describeDomainRealTimeHttpCodeDataResponse.setRealTimeHttpCodeData(realTimeHttpCodeData);
	 
	 	return describeDomainRealTimeHttpCodeDataResponse;
	}
}