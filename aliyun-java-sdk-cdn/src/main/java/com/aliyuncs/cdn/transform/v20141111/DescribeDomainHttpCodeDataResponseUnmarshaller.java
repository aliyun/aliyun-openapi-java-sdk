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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainHttpCodeDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainHttpCodeDataResponse.UsageData;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainHttpCodeDataResponse.UsageData.CodeProportionData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainHttpCodeDataResponseUnmarshaller {

	public static DescribeDomainHttpCodeDataResponse unmarshall(DescribeDomainHttpCodeDataResponse describeDomainHttpCodeDataResponse, UnmarshallerContext context) {
		
		describeDomainHttpCodeDataResponse.setRequestId(context.stringValue("DescribeDomainHttpCodeDataResponse.RequestId"));
		describeDomainHttpCodeDataResponse.setDomainName(context.stringValue("DescribeDomainHttpCodeDataResponse.DomainName"));
		describeDomainHttpCodeDataResponse.setStartTime(context.stringValue("DescribeDomainHttpCodeDataResponse.StartTime"));
		describeDomainHttpCodeDataResponse.setEndTime(context.stringValue("DescribeDomainHttpCodeDataResponse.EndTime"));
		describeDomainHttpCodeDataResponse.setDataInterval(context.stringValue("DescribeDomainHttpCodeDataResponse.DataInterval"));

		List<UsageData> httpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainHttpCodeDataResponse.HttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeDomainHttpCodeDataResponse.HttpCodeData["+ i +"].TimeStamp"));

			List<CodeProportionData> value = new ArrayList<CodeProportionData>();
			for (int j = 0; j < context.lengthValue("DescribeDomainHttpCodeDataResponse.HttpCodeData["+ i +"].Value.Length"); j++) {
				CodeProportionData codeProportionData = new CodeProportionData();
				codeProportionData.setCode(context.stringValue("DescribeDomainHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Code"));
				codeProportionData.setProportion(context.stringValue("DescribeDomainHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				codeProportionData.setCount(context.stringValue("DescribeDomainHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(codeProportionData);
			}
			usageData.setValue(value);

			httpCodeData.add(usageData);
		}
		describeDomainHttpCodeDataResponse.setHttpCodeData(httpCodeData);
	 
	 	return describeDomainHttpCodeDataResponse;
	}
}