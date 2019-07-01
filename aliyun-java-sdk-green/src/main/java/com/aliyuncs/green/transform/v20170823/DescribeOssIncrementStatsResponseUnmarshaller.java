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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeOssIncrementStatsResponse;
import com.aliyuncs.green.model.v20170823.DescribeOssIncrementStatsResponse.Stat;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssIncrementStatsResponseUnmarshaller {

	public static DescribeOssIncrementStatsResponse unmarshall(DescribeOssIncrementStatsResponse describeOssIncrementStatsResponse, UnmarshallerContext context) {
		
		describeOssIncrementStatsResponse.setRequestId(context.stringValue("DescribeOssIncrementStatsResponse.RequestId"));
		describeOssIncrementStatsResponse.setTotalCount(context.integerValue("DescribeOssIncrementStatsResponse.TotalCount"));

		List<Stat> statList = new ArrayList<Stat>();
		for (int i = 0; i < context.lengthValue("DescribeOssIncrementStatsResponse.StatList.Length"); i++) {
			Stat stat = new Stat();
			stat.setResourceType(context.stringValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].ResourceType"));
			stat.setScene(context.stringValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].Scene"));
			stat.setDate(context.stringValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].Date"));
			stat.setTotalCount(context.integerValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].TotalCount"));
			stat.setPassCount(context.integerValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].PassCount"));
			stat.setReviewCount(context.integerValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].ReviewCount"));
			stat.setBlockCount(context.integerValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].BlockCount"));

			statList.add(stat);
		}
		describeOssIncrementStatsResponse.setStatList(statList);
	 
	 	return describeOssIncrementStatsResponse;
	}
}