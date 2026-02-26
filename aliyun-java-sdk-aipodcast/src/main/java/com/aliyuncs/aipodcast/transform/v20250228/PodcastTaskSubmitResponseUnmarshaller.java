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

package com.aliyuncs.aipodcast.transform.v20250228;

import com.aliyuncs.aipodcast.model.v20250228.PodcastTaskSubmitResponse;
import com.aliyuncs.aipodcast.model.v20250228.PodcastTaskSubmitResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PodcastTaskSubmitResponseUnmarshaller {

	public static PodcastTaskSubmitResponse unmarshall(PodcastTaskSubmitResponse podcastTaskSubmitResponse, UnmarshallerContext _ctx) {
		
		podcastTaskSubmitResponse.setCode(_ctx.stringValue("PodcastTaskSubmitResponse.code"));
		podcastTaskSubmitResponse.setMessage(_ctx.stringValue("PodcastTaskSubmitResponse.message"));
		podcastTaskSubmitResponse.setRequestId(_ctx.stringValue("PodcastTaskSubmitResponse.requestId"));
		podcastTaskSubmitResponse.setSuccess(_ctx.booleanValue("PodcastTaskSubmitResponse.success"));
		podcastTaskSubmitResponse.setHttpStatusCode(_ctx.stringValue("PodcastTaskSubmitResponse.httpStatusCode"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("PodcastTaskSubmitResponse.data.taskId"));
		data.setTaskStatus(_ctx.stringValue("PodcastTaskSubmitResponse.data.taskStatus"));
		podcastTaskSubmitResponse.setData(data);
	 
	 	return podcastTaskSubmitResponse;
	}
}