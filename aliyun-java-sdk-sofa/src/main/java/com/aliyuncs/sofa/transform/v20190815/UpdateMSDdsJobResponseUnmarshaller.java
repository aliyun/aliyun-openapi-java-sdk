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

import com.aliyuncs.sofa.model.v20190815.UpdateMSDdsJobResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateMSDdsJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMSDdsJobResponseUnmarshaller {

	public static UpdateMSDdsJobResponse unmarshall(UpdateMSDdsJobResponse updateMSDdsJobResponse, UnmarshallerContext _ctx) {
		
		updateMSDdsJobResponse.setRequestId(_ctx.stringValue("UpdateMSDdsJobResponse.RequestId"));

		Job job = new Job();
		job.setApp(_ctx.stringValue("UpdateMSDdsJobResponse.Job.App"));
		job.setCreationTime(_ctx.stringValue("UpdateMSDdsJobResponse.Job.CreationTime"));
		job.setCron(_ctx.stringValue("UpdateMSDdsJobResponse.Job.Cron"));
		job.setDes(_ctx.stringValue("UpdateMSDdsJobResponse.Job.Des"));
		job.setId(_ctx.integerValue("UpdateMSDdsJobResponse.Job.Id"));
		job.setInstanceId(_ctx.stringValue("UpdateMSDdsJobResponse.Job.InstanceId"));
		job.setName(_ctx.stringValue("UpdateMSDdsJobResponse.Job.Name"));
		job.setShardingCount(_ctx.integerValue("UpdateMSDdsJobResponse.Job.ShardingCount"));
		job.setStatus(_ctx.stringValue("UpdateMSDdsJobResponse.Job.Status"));
		job.setUpdateTime(_ctx.stringValue("UpdateMSDdsJobResponse.Job.UpdateTime"));

		List<String> customParams = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMSDdsJobResponse.Job.CustomParams.Length"); i++) {
			customParams.add(_ctx.stringValue("UpdateMSDdsJobResponse.Job.CustomParams["+ i +"]"));
		}
		job.setCustomParams(customParams);
		updateMSDdsJobResponse.setJob(job);
	 
	 	return updateMSDdsJobResponse;
	}
}