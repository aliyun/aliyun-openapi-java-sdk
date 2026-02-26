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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeCreateIndexJobResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeCreateIndexJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCreateIndexJobResponseUnmarshaller {

	public static DescribeCreateIndexJobResponse unmarshall(DescribeCreateIndexJobResponse describeCreateIndexJobResponse, UnmarshallerContext _ctx) {
		
		describeCreateIndexJobResponse.setRequestId(_ctx.stringValue("DescribeCreateIndexJobResponse.RequestId"));
		describeCreateIndexJobResponse.setMessage(_ctx.stringValue("DescribeCreateIndexJobResponse.Message"));
		describeCreateIndexJobResponse.setStatus(_ctx.stringValue("DescribeCreateIndexJobResponse.Status"));

		Job job = new Job();
		job.setId(_ctx.stringValue("DescribeCreateIndexJobResponse.Job.Id"));
		job.setCompleted(_ctx.booleanValue("DescribeCreateIndexJobResponse.Job.Completed"));
		job.setCreateTime(_ctx.stringValue("DescribeCreateIndexJobResponse.Job.CreateTime"));
		job.setUpdateTime(_ctx.stringValue("DescribeCreateIndexJobResponse.Job.UpdateTime"));
		job.setStatus(_ctx.stringValue("DescribeCreateIndexJobResponse.Job.Status"));
		job.setError(_ctx.stringValue("DescribeCreateIndexJobResponse.Job.Error"));
		job.setProgress(_ctx.integerValue("DescribeCreateIndexJobResponse.Job.Progress"));
		describeCreateIndexJobResponse.setJob(job);
	 
	 	return describeCreateIndexJobResponse;
	}
}