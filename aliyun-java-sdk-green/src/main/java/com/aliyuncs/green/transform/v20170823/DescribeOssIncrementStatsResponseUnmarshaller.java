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

	public static DescribeOssIncrementStatsResponse unmarshall(DescribeOssIncrementStatsResponse describeOssIncrementStatsResponse, UnmarshallerContext _ctx) {
		
		describeOssIncrementStatsResponse.setRequestId(_ctx.stringValue("DescribeOssIncrementStatsResponse.RequestId"));
		describeOssIncrementStatsResponse.setTotalCount(_ctx.integerValue("DescribeOssIncrementStatsResponse.TotalCount"));

		List<Stat> statList = new ArrayList<Stat>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssIncrementStatsResponse.StatList.Length"); i++) {
			Stat stat = new Stat();
			stat.setResourceType(_ctx.stringValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].ResourceType"));
			stat.setScene(_ctx.stringValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].Scene"));
			stat.setDate(_ctx.stringValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].Date"));
			stat.setTotalCount(_ctx.integerValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].TotalCount"));
			stat.setPassCount(_ctx.integerValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].PassCount"));
			stat.setReviewCount(_ctx.integerValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].ReviewCount"));
			stat.setBlockCount(_ctx.integerValue("DescribeOssIncrementStatsResponse.StatList["+ i +"].BlockCount"));

			statList.add(stat);
		}
		describeOssIncrementStatsResponse.setStatList(statList);
	 
	 	return describeOssIncrementStatsResponse;
	}
}