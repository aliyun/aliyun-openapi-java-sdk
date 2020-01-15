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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeEvaluateTasksResponse;
import com.aliyuncs.drds.model.v20190123.DescribeEvaluateTasksResponse.EvaluateTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEvaluateTasksResponseUnmarshaller {

	public static DescribeEvaluateTasksResponse unmarshall(DescribeEvaluateTasksResponse describeEvaluateTasksResponse, UnmarshallerContext _ctx) {
		
		describeEvaluateTasksResponse.setRequestId(_ctx.stringValue("DescribeEvaluateTasksResponse.RequestId"));
		describeEvaluateTasksResponse.setSuccess(_ctx.booleanValue("DescribeEvaluateTasksResponse.Success"));
		describeEvaluateTasksResponse.setPageNumber(_ctx.integerValue("DescribeEvaluateTasksResponse.PageNumber"));
		describeEvaluateTasksResponse.setPageSize(_ctx.integerValue("DescribeEvaluateTasksResponse.PageSize"));
		describeEvaluateTasksResponse.setTotal(_ctx.integerValue("DescribeEvaluateTasksResponse.Total"));

		List<EvaluateTask> data = new ArrayList<EvaluateTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEvaluateTasksResponse.Data.Length"); i++) {
			EvaluateTask evaluateTask = new EvaluateTask();
			evaluateTask.setId(_ctx.integerValue("DescribeEvaluateTasksResponse.Data["+ i +"].Id"));
			evaluateTask.setBatchEvaluateTaskId(_ctx.integerValue("DescribeEvaluateTasksResponse.Data["+ i +"].BatchEvaluateTaskId"));
			evaluateTask.setTaskName(_ctx.stringValue("DescribeEvaluateTasksResponse.Data["+ i +"].TaskName"));
			evaluateTask.setGmtCreate(_ctx.stringValue("DescribeEvaluateTasksResponse.Data["+ i +"].GmtCreate"));
			evaluateTask.setGmtModified(_ctx.stringValue("DescribeEvaluateTasksResponse.Data["+ i +"].GmtModified"));
			evaluateTask.setStatus(_ctx.stringValue("DescribeEvaluateTasksResponse.Data["+ i +"].Status"));
			evaluateTask.setInstId(_ctx.stringValue("DescribeEvaluateTasksResponse.Data["+ i +"].InstId"));
			evaluateTask.setDbName(_ctx.stringValue("DescribeEvaluateTasksResponse.Data["+ i +"].DbName"));
			evaluateTask.setProgress(_ctx.integerValue("DescribeEvaluateTasksResponse.Data["+ i +"].Progress"));
			evaluateTask.setEvalauteHours(_ctx.integerValue("DescribeEvaluateTasksResponse.Data["+ i +"].EvalauteHours"));
			evaluateTask.setAllSqlCount(_ctx.integerValue("DescribeEvaluateTasksResponse.Data["+ i +"].AllSqlCount"));

			data.add(evaluateTask);
		}
		describeEvaluateTasksResponse.setData(data);
	 
	 	return describeEvaluateTasksResponse;
	}
}