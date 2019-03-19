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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.DescribeSignatureStatisticsResponse;
import com.aliyuncs.cas.model.v20180813.DescribeSignatureStatisticsResponse.DayData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSignatureStatisticsResponseUnmarshaller {

	public static DescribeSignatureStatisticsResponse unmarshall(DescribeSignatureStatisticsResponse describeSignatureStatisticsResponse, UnmarshallerContext context) {
		
		describeSignatureStatisticsResponse.setRequestId(context.stringValue("DescribeSignatureStatisticsResponse.RequestId"));
		describeSignatureStatisticsResponse.setUnSignCount(context.integerValue("DescribeSignatureStatisticsResponse.UnSignCount"));
		describeSignatureStatisticsResponse.setSignCount(context.integerValue("DescribeSignatureStatisticsResponse.SignCount"));
		describeSignatureStatisticsResponse.setFailCount(context.integerValue("DescribeSignatureStatisticsResponse.FailCount"));

		List<DayData> dayDataList = new ArrayList<DayData>();
		for (int i = 0; i < context.lengthValue("DescribeSignatureStatisticsResponse.DayDataList.Length"); i++) {
			DayData dayData = new DayData();
			dayData.setDate(context.stringValue("DescribeSignatureStatisticsResponse.DayDataList["+ i +"].Date"));
			dayData.setUnSignCount(context.integerValue("DescribeSignatureStatisticsResponse.DayDataList["+ i +"].UnSignCount"));
			dayData.setSignCount(context.integerValue("DescribeSignatureStatisticsResponse.DayDataList["+ i +"].SignCount"));
			dayData.setFailCount(context.integerValue("DescribeSignatureStatisticsResponse.DayDataList["+ i +"].FailCount"));

			dayDataList.add(dayData);
		}
		describeSignatureStatisticsResponse.setDayDataList(dayDataList);
	 
	 	return describeSignatureStatisticsResponse;
	}
}