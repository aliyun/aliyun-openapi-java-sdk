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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeUserStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserStatisticsResponseUnmarshaller {

	public static DescribeUserStatisticsResponse unmarshall(DescribeUserStatisticsResponse describeUserStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeUserStatisticsResponse.setId(_ctx.longValue("DescribeUserStatisticsResponse.Id"));
		describeUserStatisticsResponse.setUserId(_ctx.stringValue("DescribeUserStatisticsResponse.UserId"));
		describeUserStatisticsResponse.setJobNum(_ctx.integerValue("DescribeUserStatisticsResponse.JobNum"));
		describeUserStatisticsResponse.setExecutePlanNum(_ctx.integerValue("DescribeUserStatisticsResponse.ExecutePlanNum"));
		describeUserStatisticsResponse.setInteractionJobNum(_ctx.integerValue("DescribeUserStatisticsResponse.InteractionJobNum"));
		describeUserStatisticsResponse.setJobMigratedNum(_ctx.integerValue("DescribeUserStatisticsResponse.JobMigratedNum"));
		describeUserStatisticsResponse.setExecutePlanMigratedNum(_ctx.integerValue("DescribeUserStatisticsResponse.ExecutePlanMigratedNum"));
		describeUserStatisticsResponse.setInteractionJobMigratedNum(_ctx.integerValue("DescribeUserStatisticsResponse.InteractionJobMigratedNum"));
	 
	 	return describeUserStatisticsResponse;
	}
}