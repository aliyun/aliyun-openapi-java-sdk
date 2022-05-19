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

package com.aliyuncs.lmztest.transform.v20100101;

import com.aliyuncs.lmztest.model.v20100101.SportResponse;
import com.aliyuncs.lmztest.model.v20100101.SportResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class SportResponseUnmarshaller {

	public static SportResponse unmarshall(SportResponse sportResponse, UnmarshallerContext _ctx) {
		
		sportResponse.setRequestId(_ctx.stringValue("SportResponse.requestId"));

		Job job = new Job();
		job.setStatus(_ctx.stringValue("SportResponse.Job.Status"));
		job.setResponse(_ctx.stringValue("SportResponse.Job.Response"));
		job.setType(_ctx.stringValue("SportResponse.Job.Type"));
		job.setCreateTime(_ctx.stringValue("SportResponse.Job.CreateTime"));
		job.setCompleted(_ctx.booleanValue("SportResponse.Job.Completed"));
		job.setError(_ctx.stringValue("SportResponse.Job.Error"));
		job.setId(_ctx.stringValue("SportResponse.Job.Id"));
		job.setProgess(_ctx.integerValue("SportResponse.Job.Progess"));
		sportResponse.setJob(job);
	 
	 	return sportResponse;
	}
}