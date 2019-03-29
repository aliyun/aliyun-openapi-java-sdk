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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.DescribeIterationsResponse;
import com.aliyuncs.ivision.model.v20190308.DescribeIterationsResponse.Iteration;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIterationsResponseUnmarshaller {

	public static DescribeIterationsResponse unmarshall(DescribeIterationsResponse describeIterationsResponse, UnmarshallerContext context) {
		
		describeIterationsResponse.setRequestId(context.stringValue("DescribeIterationsResponse.RequestId"));
		describeIterationsResponse.setTotalNum(context.longValue("DescribeIterationsResponse.TotalNum"));
		describeIterationsResponse.setCurrentPage(context.longValue("DescribeIterationsResponse.CurrentPage"));
		describeIterationsResponse.setPageSize(context.longValue("DescribeIterationsResponse.PageSize"));
		describeIterationsResponse.setNextPageToken(context.stringValue("DescribeIterationsResponse.NextPageToken"));

		List<Iteration> iterations = new ArrayList<Iteration>();
		for (int i = 0; i < context.lengthValue("DescribeIterationsResponse.Iterations.Length"); i++) {
			Iteration iteration = new Iteration();
			iteration.setProjectId(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].ProjectId"));
			iteration.setIterationId(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].IterationId"));
			iteration.setIterationName(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].IterationName"));
			iteration.setStatus(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].Status"));
			iteration.setCreationTime(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].CreationTime"));
			iteration.setFinishTime(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].FinishTime"));
			iteration.setModelId(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].ModelId"));
			iteration.setPrecision(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].Precision"));
			iteration.setRecall(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].Recall"));
			iteration.setMAP(context.stringValue("DescribeIterationsResponse.Iterations["+ i +"].MAP"));

			iterations.add(iteration);
		}
		describeIterationsResponse.setIterations(iterations);
	 
	 	return describeIterationsResponse;
	}
}