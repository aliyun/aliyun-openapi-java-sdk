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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeJMeterSceneResponse;
import com.aliyuncs.pts.model.v20190810.DescribeJMeterSceneResponse.Scene;
import com.aliyuncs.pts.model.v20190810.DescribeJMeterSceneResponse.Scene.ConditionItem;
import com.aliyuncs.pts.model.v20190810.DescribeJMeterSceneResponse.Scene.Plan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJMeterSceneResponseUnmarshaller {

	public static DescribeJMeterSceneResponse unmarshall(DescribeJMeterSceneResponse describeJMeterSceneResponse, UnmarshallerContext _ctx) {
		
		describeJMeterSceneResponse.setRequestId(_ctx.stringValue("DescribeJMeterSceneResponse.RequestId"));
		describeJMeterSceneResponse.setMessage(_ctx.stringValue("DescribeJMeterSceneResponse.Message"));
		describeJMeterSceneResponse.setCode(_ctx.stringValue("DescribeJMeterSceneResponse.Code"));
		describeJMeterSceneResponse.setSuccess(_ctx.booleanValue("DescribeJMeterSceneResponse.Success"));
		describeJMeterSceneResponse.setHttpStatusCode(_ctx.integerValue("DescribeJMeterSceneResponse.HttpStatusCode"));

		Scene scene = new Scene();
		scene.setName(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.Name"));
		scene.setPool(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.Pool"));
		scene.setJMeterVersion(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.JMeterVersion"));
		scene.setConcurrency(_ctx.integerValue("DescribeJMeterSceneResponse.Scene.Concurrency"));
		scene.setRampUp(_ctx.integerValue("DescribeJMeterSceneResponse.Scene.RampUp"));
		scene.setHoldFor(_ctx.integerValue("DescribeJMeterSceneResponse.Scene.HoldFor"));
		scene.setUseIterations(_ctx.booleanValue("DescribeJMeterSceneResponse.Scene.UseIterations"));
		scene.setIterations(_ctx.integerValue("DescribeJMeterSceneResponse.Scene.Iterations"));
		scene.setMaxConcurrencyPerAgent(_ctx.integerValue("DescribeJMeterSceneResponse.Scene.MaxConcurrencyPerAgent"));
		scene.setSpecifyAgentCount(_ctx.booleanValue("DescribeJMeterSceneResponse.Scene.SpecifyAgentCount"));
		scene.setAgentCount(_ctx.integerValue("DescribeJMeterSceneResponse.Scene.AgentCount"));
		scene.setSplitCsv(_ctx.booleanValue("DescribeJMeterSceneResponse.Scene.SplitCsv"));
		scene.setTestFile(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.TestFile"));
		scene.setFileList(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.FileList"));
		scene.setRegionId(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.RegionId"));
		scene.setVpcId(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.VpcId"));
		scene.setSecurityGroupId(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.SecurityGroupId"));
		scene.setVSwitchId(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.VSwitchId"));
		scene.setSceneId(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.SceneId"));
		scene.setConditionSatisfiedExactly(_ctx.booleanValue("DescribeJMeterSceneResponse.Scene.ConditionSatisfiedExactly"));
		scene.setSyncTimerType(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.SyncTimerType"));
		scene.setSteps(_ctx.integerValue("DescribeJMeterSceneResponse.Scene.Steps"));
		scene.setConstantThroughputTimerType(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.ConstantThroughputTimerType"));

		Plan plan = new Plan();
		plan.setModifiedTime(_ctx.longValue("DescribeJMeterSceneResponse.Scene.Plan.ModifiedTime"));
		plan.setLastActive(_ctx.longValue("DescribeJMeterSceneResponse.Scene.Plan.LastActive"));
		plan.setVum(_ctx.longValue("DescribeJMeterSceneResponse.Scene.Plan.Vum"));
		plan.setHasReport(_ctx.booleanValue("DescribeJMeterSceneResponse.Scene.Plan.HasReport"));
		plan.setVumWeight(_ctx.longValue("DescribeJMeterSceneResponse.Scene.Plan.VumWeight"));
		plan.setBeginTime(_ctx.longValue("DescribeJMeterSceneResponse.Scene.Plan.BeginTime"));
		scene.setPlan(plan);

		List<ConditionItem> condition = new ArrayList<ConditionItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJMeterSceneResponse.Scene.Condition.Length"); i++) {
			ConditionItem conditionItem = new ConditionItem();
			conditionItem.setRegion(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.Condition["+ i +"].Region"));
			conditionItem.setIsp(_ctx.stringValue("DescribeJMeterSceneResponse.Scene.Condition["+ i +"].Isp"));
			conditionItem.setAmount(_ctx.integerValue("DescribeJMeterSceneResponse.Scene.Condition["+ i +"].Amount"));

			condition.add(conditionItem);
		}
		scene.setCondition(condition);
		describeJMeterSceneResponse.setScene(scene);
	 
	 	return describeJMeterSceneResponse;
	}
}