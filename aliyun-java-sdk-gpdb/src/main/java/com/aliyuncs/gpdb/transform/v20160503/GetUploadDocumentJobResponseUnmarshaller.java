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

import com.aliyuncs.gpdb.model.v20160503.GetUploadDocumentJobResponse;
import com.aliyuncs.gpdb.model.v20160503.GetUploadDocumentJobResponse.ChunkResult;
import com.aliyuncs.gpdb.model.v20160503.GetUploadDocumentJobResponse.Job;
import com.aliyuncs.gpdb.model.v20160503.GetUploadDocumentJobResponse.Usage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUploadDocumentJobResponseUnmarshaller {

	public static GetUploadDocumentJobResponse unmarshall(GetUploadDocumentJobResponse getUploadDocumentJobResponse, UnmarshallerContext _ctx) {
		
		getUploadDocumentJobResponse.setRequestId(_ctx.stringValue("GetUploadDocumentJobResponse.RequestId"));
		getUploadDocumentJobResponse.setMessage(_ctx.stringValue("GetUploadDocumentJobResponse.Message"));
		getUploadDocumentJobResponse.setStatus(_ctx.stringValue("GetUploadDocumentJobResponse.Status"));

		Job job = new Job();
		job.setId(_ctx.stringValue("GetUploadDocumentJobResponse.Job.Id"));
		job.setCompleted(_ctx.booleanValue("GetUploadDocumentJobResponse.Job.Completed"));
		job.setCreateTime(_ctx.stringValue("GetUploadDocumentJobResponse.Job.CreateTime"));
		job.setUpdateTime(_ctx.stringValue("GetUploadDocumentJobResponse.Job.UpdateTime"));
		job.setStatus(_ctx.stringValue("GetUploadDocumentJobResponse.Job.Status"));
		job.setError(_ctx.stringValue("GetUploadDocumentJobResponse.Job.Error"));
		job.setProgress(_ctx.integerValue("GetUploadDocumentJobResponse.Job.Progress"));
		job.setErrorCode(_ctx.stringValue("GetUploadDocumentJobResponse.Job.ErrorCode"));
		getUploadDocumentJobResponse.setJob(job);

		ChunkResult chunkResult = new ChunkResult();
		chunkResult.setChunkFileUrl(_ctx.stringValue("GetUploadDocumentJobResponse.ChunkResult.ChunkFileUrl"));
		chunkResult.setPlainChunkFileUrl(_ctx.stringValue("GetUploadDocumentJobResponse.ChunkResult.PlainChunkFileUrl"));
		getUploadDocumentJobResponse.setChunkResult(chunkResult);

		Usage usage = new Usage();
		usage.setEmbeddingTokens(_ctx.integerValue("GetUploadDocumentJobResponse.Usage.EmbeddingTokens"));
		usage.setEmbeddingEntries(_ctx.integerValue("GetUploadDocumentJobResponse.Usage.EmbeddingEntries"));
		getUploadDocumentJobResponse.setUsage(usage);
	 
	 	return getUploadDocumentJobResponse;
	}
}