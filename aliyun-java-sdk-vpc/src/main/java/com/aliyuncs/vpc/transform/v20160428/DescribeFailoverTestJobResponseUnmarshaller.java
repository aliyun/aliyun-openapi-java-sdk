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

import com.aliyuncs.vpc.model.v20160428.DescribeFailoverTestJobResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeFailoverTestJobResponse.FailoverTestJobModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFailoverTestJobResponseUnmarshaller {

	public static DescribeFailoverTestJobResponse unmarshall(DescribeFailoverTestJobResponse describeFailoverTestJobResponse, UnmarshallerContext _ctx) {
		
		describeFailoverTestJobResponse.setRequestId(_ctx.stringValue("DescribeFailoverTestJobResponse.RequestId"));

		FailoverTestJobModel failoverTestJobModel = new FailoverTestJobModel();
		failoverTestJobModel.setJobId(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.JobId"));
		failoverTestJobModel.setName(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.Name"));
		failoverTestJobModel.setDescription(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.Description"));
		failoverTestJobModel.setResourceType(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.ResourceType"));
		failoverTestJobModel.setJobType(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.JobType"));
		failoverTestJobModel.setJobDuration(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.JobDuration"));
		failoverTestJobModel.setStartTime(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.StartTime"));
		failoverTestJobModel.setStopTime(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.StopTime"));
		failoverTestJobModel.setStatus(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.Status"));

		List<String> resourceId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.ResourceId.Length"); i++) {
			resourceId.add(_ctx.stringValue("DescribeFailoverTestJobResponse.FailoverTestJobModel.ResourceId["+ i +"]"));
		}
		failoverTestJobModel.setResourceId(resourceId);
		describeFailoverTestJobResponse.setFailoverTestJobModel(failoverTestJobModel);
	 
	 	return describeFailoverTestJobResponse;
	}
}