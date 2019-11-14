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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetMSDdsJobResponse;
import com.aliyuncs.sofa.model.v20190815.GetMSDdsJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMSDdsJobResponseUnmarshaller {

	public static GetMSDdsJobResponse unmarshall(GetMSDdsJobResponse getMSDdsJobResponse, UnmarshallerContext _ctx) {
		
		getMSDdsJobResponse.setRequestId(_ctx.stringValue("GetMSDdsJobResponse.RequestId"));

		Job job = new Job();
		job.setApp(_ctx.stringValue("GetMSDdsJobResponse.Job.App"));
		job.setCreationTime(_ctx.stringValue("GetMSDdsJobResponse.Job.CreationTime"));
		job.setCron(_ctx.stringValue("GetMSDdsJobResponse.Job.Cron"));
		job.setDes(_ctx.stringValue("GetMSDdsJobResponse.Job.Des"));
		job.setId(_ctx.integerValue("GetMSDdsJobResponse.Job.Id"));
		job.setInstanceId(_ctx.stringValue("GetMSDdsJobResponse.Job.InstanceId"));
		job.setName(_ctx.stringValue("GetMSDdsJobResponse.Job.Name"));
		job.setShardingCount(_ctx.integerValue("GetMSDdsJobResponse.Job.ShardingCount"));
		job.setStatus(_ctx.stringValue("GetMSDdsJobResponse.Job.Status"));
		job.setUpdateTime(_ctx.stringValue("GetMSDdsJobResponse.Job.UpdateTime"));

		List<String> customParams = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetMSDdsJobResponse.Job.CustomParams.Length"); i++) {
			customParams.add(_ctx.stringValue("GetMSDdsJobResponse.Job.CustomParams["+ i +"]"));
		}
		job.setCustomParams(customParams);
		getMSDdsJobResponse.setJob(job);
	 
	 	return getMSDdsJobResponse;
	}
}