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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineLogResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineLogResponse.Job;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineLogResponse.Job.BuildProcessNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineLogResponseUnmarshaller {

	public static GetPipelineLogResponse unmarshall(GetPipelineLogResponse getPipelineLogResponse, UnmarshallerContext _ctx) {
		
		getPipelineLogResponse.setRequestId(_ctx.stringValue("GetPipelineLogResponse.RequestId"));
		getPipelineLogResponse.setErrorMessage(_ctx.stringValue("GetPipelineLogResponse.ErrorMessage"));
		getPipelineLogResponse.setSuccess(_ctx.booleanValue("GetPipelineLogResponse.Success"));
		getPipelineLogResponse.setErrorCode(_ctx.stringValue("GetPipelineLogResponse.ErrorCode"));

		List<Job> object = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineLogResponse.Object.Length"); i++) {
			Job job = new Job();
			job.setActionName(_ctx.stringValue("GetPipelineLogResponse.Object["+ i +"].ActionName"));
			job.setStartTime(_ctx.stringValue("GetPipelineLogResponse.Object["+ i +"].StartTime"));
			job.setJobId(_ctx.longValue("GetPipelineLogResponse.Object["+ i +"].JobId"));

			List<BuildProcessNode> buildProcessNodes = new ArrayList<BuildProcessNode>();
			for (int j = 0; j < _ctx.lengthValue("GetPipelineLogResponse.Object["+ i +"].BuildProcessNodes.Length"); j++) {
				BuildProcessNode buildProcessNode = new BuildProcessNode();
				buildProcessNode.setStatus(_ctx.stringValue("GetPipelineLogResponse.Object["+ i +"].BuildProcessNodes["+ j +"].Status"));
				buildProcessNode.setNodeIndex(_ctx.integerValue("GetPipelineLogResponse.Object["+ i +"].BuildProcessNodes["+ j +"].NodeIndex"));
				buildProcessNode.setNodeName(_ctx.stringValue("GetPipelineLogResponse.Object["+ i +"].BuildProcessNodes["+ j +"].NodeName"));

				buildProcessNodes.add(buildProcessNode);
			}
			job.setBuildProcessNodes(buildProcessNodes);

			object.add(job);
		}
		getPipelineLogResponse.setObject(object);
	 
	 	return getPipelineLogResponse;
	}
}