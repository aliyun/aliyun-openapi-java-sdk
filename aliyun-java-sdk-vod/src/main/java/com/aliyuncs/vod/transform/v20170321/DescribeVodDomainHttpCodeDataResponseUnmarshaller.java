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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainHttpCodeDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainHttpCodeDataResponse.UsageData;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainHttpCodeDataResponse.UsageData.CodeProportionData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainHttpCodeDataResponseUnmarshaller {

	public static DescribeVodDomainHttpCodeDataResponse unmarshall(DescribeVodDomainHttpCodeDataResponse describeVodDomainHttpCodeDataResponse, UnmarshallerContext context) {
		
		describeVodDomainHttpCodeDataResponse.setRequestId(context.stringValue("DescribeVodDomainHttpCodeDataResponse.RequestId"));
		describeVodDomainHttpCodeDataResponse.setDomainName(context.stringValue("DescribeVodDomainHttpCodeDataResponse.DomainName"));
		describeVodDomainHttpCodeDataResponse.setStartTime(context.stringValue("DescribeVodDomainHttpCodeDataResponse.StartTime"));
		describeVodDomainHttpCodeDataResponse.setEndTime(context.stringValue("DescribeVodDomainHttpCodeDataResponse.EndTime"));
		describeVodDomainHttpCodeDataResponse.setDataInterval(context.stringValue("DescribeVodDomainHttpCodeDataResponse.DataInterval"));

		List<UsageData> httpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainHttpCodeDataResponse.HttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeVodDomainHttpCodeDataResponse.HttpCodeData["+ i +"].TimeStamp"));

			List<CodeProportionData> value = new ArrayList<CodeProportionData>();
			for (int j = 0; j < context.lengthValue("DescribeVodDomainHttpCodeDataResponse.HttpCodeData["+ i +"].Value.Length"); j++) {
				CodeProportionData codeProportionData = new CodeProportionData();
				codeProportionData.setCode(context.stringValue("DescribeVodDomainHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Code"));
				codeProportionData.setProportion(context.stringValue("DescribeVodDomainHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				codeProportionData.setCount(context.stringValue("DescribeVodDomainHttpCodeDataResponse.HttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(codeProportionData);
			}
			usageData.setValue(value);

			httpCodeData.add(usageData);
		}
		describeVodDomainHttpCodeDataResponse.setHttpCodeData(httpCodeData);
	 
	 	return describeVodDomainHttpCodeDataResponse;
	}
}