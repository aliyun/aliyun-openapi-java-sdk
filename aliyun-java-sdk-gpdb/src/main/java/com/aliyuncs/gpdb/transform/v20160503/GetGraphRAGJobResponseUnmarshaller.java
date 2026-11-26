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

import com.aliyuncs.gpdb.model.v20160503.GetGraphRAGJobResponse;
import com.aliyuncs.gpdb.model.v20160503.GetGraphRAGJobResponse.Job;
import com.aliyuncs.gpdb.model.v20160503.GetGraphRAGJobResponse.Usage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGraphRAGJobResponseUnmarshaller {

	public static GetGraphRAGJobResponse unmarshall(GetGraphRAGJobResponse getGraphRAGJobResponse, UnmarshallerContext _ctx) {
		
		getGraphRAGJobResponse.setRequestId(_ctx.stringValue("GetGraphRAGJobResponse.RequestId"));
		getGraphRAGJobResponse.setStatus(_ctx.stringValue("GetGraphRAGJobResponse.Status"));
		getGraphRAGJobResponse.setMessage(_ctx.stringValue("GetGraphRAGJobResponse.Message"));

		Usage usage = new Usage();
		usage.setEmbeddingTokens(_ctx.integerValue("GetGraphRAGJobResponse.Usage.EmbeddingTokens"));
		usage.setLLMInputTokens(_ctx.integerValue("GetGraphRAGJobResponse.Usage.LLMInputTokens"));
		usage.setLLMOutputTokens(_ctx.integerValue("GetGraphRAGJobResponse.Usage.LLMOutputTokens"));
		getGraphRAGJobResponse.setUsage(usage);

		Job job = new Job();
		job.setStatus(_ctx.stringValue("GetGraphRAGJobResponse.Job.Status"));
		job.setProgress(_ctx.integerValue("GetGraphRAGJobResponse.Job.Progress"));
		job.setCreateTime(_ctx.stringValue("GetGraphRAGJobResponse.Job.CreateTime"));
		job.setCompleted(_ctx.booleanValue("GetGraphRAGJobResponse.Job.Completed"));
		job.setUpdateTime(_ctx.stringValue("GetGraphRAGJobResponse.Job.UpdateTime"));
		job.setError(_ctx.stringValue("GetGraphRAGJobResponse.Job.Error"));
		job.setId(_ctx.stringValue("GetGraphRAGJobResponse.Job.Id"));
		getGraphRAGJobResponse.setJob(job);
	 
	 	return getGraphRAGJobResponse;
	}
}