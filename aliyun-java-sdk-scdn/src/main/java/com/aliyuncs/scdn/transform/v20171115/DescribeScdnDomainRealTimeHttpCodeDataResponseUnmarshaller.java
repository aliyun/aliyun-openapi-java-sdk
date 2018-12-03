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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeHttpCodeDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeHttpCodeDataResponse.UsageData;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeHttpCodeDataResponse.UsageData.RealTimeCodeProportionData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeHttpCodeDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeHttpCodeDataResponse unmarshall(DescribeScdnDomainRealTimeHttpCodeDataResponse describeScdnDomainRealTimeHttpCodeDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainRealTimeHttpCodeDataResponse.setRequestId(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.RequestId"));
		describeScdnDomainRealTimeHttpCodeDataResponse.setDomainName(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.DomainName"));
		describeScdnDomainRealTimeHttpCodeDataResponse.setStartTime(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.StartTime"));
		describeScdnDomainRealTimeHttpCodeDataResponse.setEndTime(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.EndTime"));
		describeScdnDomainRealTimeHttpCodeDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.DataInterval"));

		List<UsageData> realTimeHttpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].TimeStamp"));

			List<RealTimeCodeProportionData> value = new ArrayList<RealTimeCodeProportionData>();
			for (int j = 0; j < context.lengthValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value.Length"); j++) {
				RealTimeCodeProportionData realTimeCodeProportionData = new RealTimeCodeProportionData();
				realTimeCodeProportionData.setCode(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Code"));
				realTimeCodeProportionData.setProportion(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				realTimeCodeProportionData.setCount(context.stringValue("DescribeScdnDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(realTimeCodeProportionData);
			}
			usageData.setValue(value);

			realTimeHttpCodeData.add(usageData);
		}
		describeScdnDomainRealTimeHttpCodeDataResponse.setRealTimeHttpCodeData(realTimeHttpCodeData);
	 
	 	return describeScdnDomainRealTimeHttpCodeDataResponse;
	}
}