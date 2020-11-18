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

import com.aliyuncs.green.model.v20170823.DescribeOpenApiRcpStatsResponse;
import com.aliyuncs.green.model.v20170823.DescribeOpenApiRcpStatsResponse.Stat;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOpenApiRcpStatsResponseUnmarshaller {

	public static DescribeOpenApiRcpStatsResponse unmarshall(DescribeOpenApiRcpStatsResponse describeOpenApiRcpStatsResponse, UnmarshallerContext _ctx) {
		
		describeOpenApiRcpStatsResponse.setRequestId(_ctx.stringValue("DescribeOpenApiRcpStatsResponse.RequestId"));
		describeOpenApiRcpStatsResponse.setTotalCount(_ctx.integerValue("DescribeOpenApiRcpStatsResponse.TotalCount"));

		List<Stat> statList = new ArrayList<Stat>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOpenApiRcpStatsResponse.StatList.Length"); i++) {
			Stat stat = new Stat();
			stat.setDate(_ctx.stringValue("DescribeOpenApiRcpStatsResponse.StatList["+ i +"].Date"));
			stat.setResourceType(_ctx.stringValue("DescribeOpenApiRcpStatsResponse.StatList["+ i +"].ResourceType"));
			stat.setTotalCount(_ctx.integerValue("DescribeOpenApiRcpStatsResponse.StatList["+ i +"].TotalCount"));
			stat.setPassCount(_ctx.integerValue("DescribeOpenApiRcpStatsResponse.StatList["+ i +"].PassCount"));
			stat.setReviewCount(_ctx.integerValue("DescribeOpenApiRcpStatsResponse.StatList["+ i +"].ReviewCount"));
			stat.setBlockCount(_ctx.integerValue("DescribeOpenApiRcpStatsResponse.StatList["+ i +"].BlockCount"));
			stat.setTotalDuration(_ctx.integerValue("DescribeOpenApiRcpStatsResponse.StatList["+ i +"].TotalDuration"));

			statList.add(stat);
		}
		describeOpenApiRcpStatsResponse.setStatList(statList);
	 
	 	return describeOpenApiRcpStatsResponse;
	}
}