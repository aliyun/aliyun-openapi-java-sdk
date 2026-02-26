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

import com.aliyuncs.gpdb.model.v20160503.GetUpsertCollectionDataJobResponse;
import com.aliyuncs.gpdb.model.v20160503.GetUpsertCollectionDataJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUpsertCollectionDataJobResponseUnmarshaller {

	public static GetUpsertCollectionDataJobResponse unmarshall(GetUpsertCollectionDataJobResponse getUpsertCollectionDataJobResponse, UnmarshallerContext _ctx) {
		
		getUpsertCollectionDataJobResponse.setRequestId(_ctx.stringValue("GetUpsertCollectionDataJobResponse.RequestId"));
		getUpsertCollectionDataJobResponse.setStatus(_ctx.stringValue("GetUpsertCollectionDataJobResponse.Status"));
		getUpsertCollectionDataJobResponse.setMessage(_ctx.stringValue("GetUpsertCollectionDataJobResponse.Message"));

		Job job = new Job();
		job.setId(_ctx.stringValue("GetUpsertCollectionDataJobResponse.Job.Id"));
		job.setCompleted(_ctx.booleanValue("GetUpsertCollectionDataJobResponse.Job.Completed"));
		job.setCreateTime(_ctx.stringValue("GetUpsertCollectionDataJobResponse.Job.CreateTime"));
		job.setUpdateTime(_ctx.stringValue("GetUpsertCollectionDataJobResponse.Job.UpdateTime"));
		job.setStatus(_ctx.stringValue("GetUpsertCollectionDataJobResponse.Job.Status"));
		job.setError(_ctx.stringValue("GetUpsertCollectionDataJobResponse.Job.Error"));
		job.setProgress(_ctx.integerValue("GetUpsertCollectionDataJobResponse.Job.Progress"));
		getUpsertCollectionDataJobResponse.setJob(job);
	 
	 	return getUpsertCollectionDataJobResponse;
	}
}