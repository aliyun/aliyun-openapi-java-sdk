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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.DescribePipelineResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribePipelineResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePipelineResponseUnmarshaller {

	public static DescribePipelineResponse unmarshall(DescribePipelineResponse describePipelineResponse, UnmarshallerContext _ctx) {
		
		describePipelineResponse.setRequestId(_ctx.stringValue("DescribePipelineResponse.RequestId"));

		Result result = new Result();
		result.setPipelineId(_ctx.stringValue("DescribePipelineResponse.Result.pipelineId"));
		result.setConfig(_ctx.stringValue("DescribePipelineResponse.Result.config"));
		result.setPipelineStatus(_ctx.stringValue("DescribePipelineResponse.Result.pipelineStatus"));
		result.setGmtCreatedTime(_ctx.stringValue("DescribePipelineResponse.Result.gmtCreatedTime"));
		result.setGmtUpdateTime(_ctx.stringValue("DescribePipelineResponse.Result.gmtUpdateTime"));
		result.setWorkers(_ctx.integerValue("DescribePipelineResponse.Result.workers"));
		result.setBatchSize(_ctx.integerValue("DescribePipelineResponse.Result.batchSize"));
		result.setBatchDelay(_ctx.integerValue("DescribePipelineResponse.Result.batchDelay"));
		result.setDescription(_ctx.stringValue("DescribePipelineResponse.Result.description"));
		result.setQueueType(_ctx.stringValue("DescribePipelineResponse.Result.queueType"));
		result.setQueueMaxBytes(_ctx.integerValue("DescribePipelineResponse.Result.queueMaxBytes"));
		result.setQueueCheckPointWrites(_ctx.integerValue("DescribePipelineResponse.Result.queueCheckPointWrites"));
		describePipelineResponse.setResult(result);
	 
	 	return describePipelineResponse;
	}
}