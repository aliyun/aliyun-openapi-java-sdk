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

import com.aliyuncs.elasticsearch.model.v20170613.ModifyElastictaskResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ModifyElastictaskResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.ModifyElastictaskResponse.Result.ElasticExpansionTask;
import com.aliyuncs.elasticsearch.model.v20170613.ModifyElastictaskResponse.Result.ElasticShrinkTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyElastictaskResponseUnmarshaller {

	public static ModifyElastictaskResponse unmarshall(ModifyElastictaskResponse modifyElastictaskResponse, UnmarshallerContext _ctx) {
		
		modifyElastictaskResponse.setRequestId(_ctx.stringValue("ModifyElastictaskResponse.RequestId"));

		Result result = new Result();

		ElasticExpansionTask elasticExpansionTask = new ElasticExpansionTask();
		elasticExpansionTask.setTriggerType(_ctx.stringValue("ModifyElastictaskResponse.Result.ElasticExpansionTask.TriggerType"));
		elasticExpansionTask.setCronExpression(_ctx.stringValue("ModifyElastictaskResponse.Result.ElasticExpansionTask.CronExpression"));
		elasticExpansionTask.setElasticNodeCount(_ctx.integerValue("ModifyElastictaskResponse.Result.ElasticExpansionTask.ElasticNodeCount"));
		elasticExpansionTask.setReplicaCount(_ctx.integerValue("ModifyElastictaskResponse.Result.ElasticExpansionTask.ReplicaCount"));

		List<String> targetIndices = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyElastictaskResponse.Result.ElasticExpansionTask.TargetIndices.Length"); i++) {
			targetIndices.add(_ctx.stringValue("ModifyElastictaskResponse.Result.ElasticExpansionTask.TargetIndices["+ i +"]"));
		}
		elasticExpansionTask.setTargetIndices(targetIndices);
		result.setElasticExpansionTask(elasticExpansionTask);

		ElasticShrinkTask elasticShrinkTask = new ElasticShrinkTask();
		elasticShrinkTask.setTriggerType(_ctx.stringValue("ModifyElastictaskResponse.Result.ElasticShrinkTask.TriggerType"));
		elasticShrinkTask.setCronExpression(_ctx.stringValue("ModifyElastictaskResponse.Result.ElasticShrinkTask.CronExpression"));
		elasticShrinkTask.setElasticNodeCount(_ctx.integerValue("ModifyElastictaskResponse.Result.ElasticShrinkTask.ElasticNodeCount"));
		elasticShrinkTask.setReplicaCount(_ctx.integerValue("ModifyElastictaskResponse.Result.ElasticShrinkTask.ReplicaCount"));

		List<String> targetIndices1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyElastictaskResponse.Result.ElasticShrinkTask.TargetIndices.Length"); i++) {
			targetIndices1.add(_ctx.stringValue("ModifyElastictaskResponse.Result.ElasticShrinkTask.TargetIndices["+ i +"]"));
		}
		elasticShrinkTask.setTargetIndices1(targetIndices1);
		result.setElasticShrinkTask(elasticShrinkTask);
		modifyElastictaskResponse.setResult(result);
	 
	 	return modifyElastictaskResponse;
	}
}