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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.GetElastictaskResponse;
import com.aliyuncs.elasticsearch.model.v20170613.GetElastictaskResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.GetElastictaskResponse.Result.ElasticExpansionTask;
import com.aliyuncs.elasticsearch.model.v20170613.GetElastictaskResponse.Result.ElasticShrinkTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetElastictaskResponseUnmarshaller {

	public static GetElastictaskResponse unmarshall(GetElastictaskResponse getElastictaskResponse, UnmarshallerContext _ctx) {
		
		getElastictaskResponse.setRequestId(_ctx.stringValue("GetElastictaskResponse.RequestId"));

		Result result = new Result();

		ElasticExpansionTask elasticExpansionTask = new ElasticExpansionTask();
		elasticExpansionTask.setTriggerType(_ctx.stringValue("GetElastictaskResponse.Result.elasticExpansionTask.triggerType"));
		elasticExpansionTask.setCronExpression(_ctx.stringValue("GetElastictaskResponse.Result.elasticExpansionTask.cronExpression"));
		elasticExpansionTask.setElasticNodeCount(_ctx.integerValue("GetElastictaskResponse.Result.elasticExpansionTask.elasticNodeCount"));
		elasticExpansionTask.setReplicaCount(_ctx.integerValue("GetElastictaskResponse.Result.elasticExpansionTask.replicaCount"));

		List<String> targetIndices = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetElastictaskResponse.Result.elasticExpansionTask.targetIndices.Length"); i++) {
			targetIndices.add(_ctx.stringValue("GetElastictaskResponse.Result.elasticExpansionTask.targetIndices["+ i +"]"));
		}
		elasticExpansionTask.setTargetIndices(targetIndices);
		result.setElasticExpansionTask(elasticExpansionTask);

		ElasticShrinkTask elasticShrinkTask = new ElasticShrinkTask();
		elasticShrinkTask.setTriggerType(_ctx.stringValue("GetElastictaskResponse.Result.elasticShrinkTask.triggerType"));
		elasticShrinkTask.setCronExpression(_ctx.stringValue("GetElastictaskResponse.Result.elasticShrinkTask.cronExpression"));
		elasticShrinkTask.setElasticNodeCount(_ctx.integerValue("GetElastictaskResponse.Result.elasticShrinkTask.elasticNodeCount"));
		elasticShrinkTask.setReplicaCount(_ctx.integerValue("GetElastictaskResponse.Result.elasticShrinkTask.replicaCount"));

		List<String> targetIndices1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetElastictaskResponse.Result.elasticShrinkTask.targetIndices.Length"); i++) {
			targetIndices1.add(_ctx.stringValue("GetElastictaskResponse.Result.elasticShrinkTask.targetIndices["+ i +"]"));
		}
		elasticShrinkTask.setTargetIndices1(targetIndices1);
		result.setElasticShrinkTask(elasticShrinkTask);
		getElastictaskResponse.setResult(result);
	 
	 	return getElastictaskResponse;
	}
}