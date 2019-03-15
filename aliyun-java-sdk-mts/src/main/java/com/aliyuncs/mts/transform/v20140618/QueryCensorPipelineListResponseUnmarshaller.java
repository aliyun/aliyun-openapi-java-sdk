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

import com.aliyuncs.mts.model.v20140618.QueryCensorPipelineListResponse;
import com.aliyuncs.mts.model.v20140618.QueryCensorPipelineListResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.QueryCensorPipelineListResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCensorPipelineListResponseUnmarshaller {

	public static QueryCensorPipelineListResponse unmarshall(QueryCensorPipelineListResponse queryCensorPipelineListResponse, UnmarshallerContext context) {
		
		queryCensorPipelineListResponse.setRequestId(context.stringValue("QueryCensorPipelineListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryCensorPipelineListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryCensorPipelineListResponse.NonExistIds["+ i +"]"));
		}
		queryCensorPipelineListResponse.setNonExistIds(nonExistIds);

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < context.lengthValue("QueryCensorPipelineListResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setId(context.stringValue("QueryCensorPipelineListResponse.PipelineList["+ i +"].Id"));
			pipeline.setName(context.stringValue("QueryCensorPipelineListResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(context.stringValue("QueryCensorPipelineListResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(context.stringValue("QueryCensorPipelineListResponse.PipelineList["+ i +"].Priority"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(context.stringValue("QueryCensorPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueue(context.stringValue("QueryCensorPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Queue"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		queryCensorPipelineListResponse.setPipelineList(pipelineList);
	 
	 	return queryCensorPipelineListResponse;
	}
}