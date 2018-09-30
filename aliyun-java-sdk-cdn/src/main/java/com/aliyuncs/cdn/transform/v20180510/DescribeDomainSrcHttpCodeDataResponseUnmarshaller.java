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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcHttpCodeDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcHttpCodeDataResponse.UsageData;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcHttpCodeDataResponse.UsageData.CodeProportionData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainSrcHttpCodeDataResponseUnmarshaller {

	public static DescribeDomainSrcHttpCodeDataResponse unmarshall(DescribeDomainSrcHttpCodeDataResponse describeDomainSrcHttpCodeDataResponse, UnmarshallerContext context) {
		
		describeDomainSrcHttpCodeDataResponse.setRequestId(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.RequestId"));
		describeDomainSrcHttpCodeDataResponse.setDomainName(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.DomainName"));
		describeDomainSrcHttpCodeDataResponse.setStartTime(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.StartTime"));
		describeDomainSrcHttpCodeDataResponse.setEndTime(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.EndTime"));
		describeDomainSrcHttpCodeDataResponse.setDataInterval(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.DataInterval"));

		List<UsageData> httpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainSrcHttpCodeDataResponse.HttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.HttpCodeData["+ i +"].TimeStamp"));

			List<CodeProportionData> value = new ArrayList<CodeProportionData>();
			for (int j = 0; j < context.lengthValue("DescribeDomainSrcHttpCodeDataResponse.HttpCodeData["+ i +"].Value.Length"); j++) {
				CodeProportionData codeProportionData = new CodeProportionData();
				codeProportionData.setCode(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Code"));
				codeProportionData.setProportion(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				codeProportionData.setCount(context.stringValue("DescribeDomainSrcHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(codeProportionData);
			}
			usageData.setValue(value);

			httpCodeData.add(usageData);
		}
		describeDomainSrcHttpCodeDataResponse.setHttpCodeData(httpCodeData);
	 
	 	return describeDomainSrcHttpCodeDataResponse;
	}
}