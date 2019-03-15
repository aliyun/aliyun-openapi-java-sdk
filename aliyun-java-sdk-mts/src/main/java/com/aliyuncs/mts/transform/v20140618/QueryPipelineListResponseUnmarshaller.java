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

import com.aliyuncs.mts.model.v20140618.QueryPipelineListResponse;
import com.aliyuncs.mts.model.v20140618.QueryPipelineListResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.QueryPipelineListResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPipelineListResponseUnmarshaller {

	public static QueryPipelineListResponse unmarshall(QueryPipelineListResponse queryPipelineListResponse, UnmarshallerContext context) {
		
		queryPipelineListResponse.setRequestId(context.stringValue("QueryPipelineListResponse.RequestId"));

		List<String> nonExistPids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryPipelineListResponse.NonExistPids.Length"); i++) {
			nonExistPids.add(context.stringValue("QueryPipelineListResponse.NonExistPids["+ i +"]"));
		}
		queryPipelineListResponse.setNonExistPids(nonExistPids);

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < context.lengthValue("QueryPipelineListResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setId(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].Id"));
			pipeline.setName(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].State"));
			pipeline.setSpeed(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].Speed"));
			pipeline.setSpeedLevel(context.longValue("QueryPipelineListResponse.PipelineList["+ i +"].SpeedLevel"));
			pipeline.setQuotaAllocate(context.longValue("QueryPipelineListResponse.PipelineList["+ i +"].QuotaAllocate"));
			pipeline.setRole(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].Role"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueueName(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.QueueName"));
			notifyConfig.setMqTopic(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.MqTopic"));
			notifyConfig.setMqTag(context.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.MqTag"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		queryPipelineListResponse.setPipelineList(pipelineList);
	 
	 	return queryPipelineListResponse;
	}
}