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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeFailoverTestJobsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeFailoverTestJobsResponse.FailoverTestJobListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFailoverTestJobsResponseUnmarshaller {

	public static DescribeFailoverTestJobsResponse unmarshall(DescribeFailoverTestJobsResponse describeFailoverTestJobsResponse, UnmarshallerContext _ctx) {
		
		describeFailoverTestJobsResponse.setRequestId(_ctx.stringValue("DescribeFailoverTestJobsResponse.RequestId"));
		describeFailoverTestJobsResponse.setNextToken(_ctx.stringValue("DescribeFailoverTestJobsResponse.NextToken"));
		describeFailoverTestJobsResponse.setMaxResults(_ctx.integerValue("DescribeFailoverTestJobsResponse.MaxResults"));
		describeFailoverTestJobsResponse.setTotalCount(_ctx.integerValue("DescribeFailoverTestJobsResponse.TotalCount"));
		describeFailoverTestJobsResponse.setCount(_ctx.integerValue("DescribeFailoverTestJobsResponse.Count"));

		List<FailoverTestJobListItem> failoverTestJobList = new ArrayList<FailoverTestJobListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFailoverTestJobsResponse.FailoverTestJobList.Length"); i++) {
			FailoverTestJobListItem failoverTestJobListItem = new FailoverTestJobListItem();
			failoverTestJobListItem.setJobId(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].JobId"));
			failoverTestJobListItem.setName(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].Name"));
			failoverTestJobListItem.setDescription(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].Description"));
			failoverTestJobListItem.setResourceType(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].ResourceType"));
			failoverTestJobListItem.setJobType(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].JobType"));
			failoverTestJobListItem.setJobDuration(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].JobDuration"));
			failoverTestJobListItem.setStartTime(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].StartTime"));
			failoverTestJobListItem.setStopTime(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].StopTime"));
			failoverTestJobListItem.setStatus(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].Status"));

			List<String> resourceId = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].ResourceId.Length"); j++) {
				resourceId.add(_ctx.stringValue("DescribeFailoverTestJobsResponse.FailoverTestJobList["+ i +"].ResourceId["+ j +"]"));
			}
			failoverTestJobListItem.setResourceId(resourceId);

			failoverTestJobList.add(failoverTestJobListItem);
		}
		describeFailoverTestJobsResponse.setFailoverTestJobList(failoverTestJobList);
	 
	 	return describeFailoverTestJobsResponse;
	}
}