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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryCoverPipelineListResponse;
import com.aliyuncs.mts.model.v20140618.QueryCoverPipelineListResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.QueryCoverPipelineListResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCoverPipelineListResponseUnmarshaller {

	public static QueryCoverPipelineListResponse unmarshall(QueryCoverPipelineListResponse queryCoverPipelineListResponse, UnmarshallerContext _ctx) {
		
		queryCoverPipelineListResponse.setRequestId(_ctx.stringValue("QueryCoverPipelineListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryCoverPipelineListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryCoverPipelineListResponse.NonExistIds["+ i +"]"));
		}
		queryCoverPipelineListResponse.setNonExistIds(nonExistIds);

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("QueryCoverPipelineListResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setState(_ctx.stringValue("QueryCoverPipelineListResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(_ctx.stringValue("QueryCoverPipelineListResponse.PipelineList["+ i +"].Priority"));
			pipeline.setRole(_ctx.stringValue("QueryCoverPipelineListResponse.PipelineList["+ i +"].Role"));
			pipeline.setName(_ctx.stringValue("QueryCoverPipelineListResponse.PipelineList["+ i +"].Name"));
			pipeline.setId(_ctx.stringValue("QueryCoverPipelineListResponse.PipelineList["+ i +"].Id"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(_ctx.stringValue("QueryCoverPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueue(_ctx.stringValue("QueryCoverPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Queue"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		queryCoverPipelineListResponse.setPipelineList(pipelineList);
	 
	 	return queryCoverPipelineListResponse;
	}
}