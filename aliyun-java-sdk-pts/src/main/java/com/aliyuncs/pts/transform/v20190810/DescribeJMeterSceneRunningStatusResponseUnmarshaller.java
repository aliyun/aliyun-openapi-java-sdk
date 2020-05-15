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

import com.aliyuncs.pts.model.v20190810.DescribeJMeterSceneRunningStatusResponse;
import com.aliyuncs.pts.model.v20190810.DescribeJMeterSceneRunningStatusResponse.Scene;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJMeterSceneRunningStatusResponseUnmarshaller {

	public static DescribeJMeterSceneRunningStatusResponse unmarshall(DescribeJMeterSceneRunningStatusResponse describeJMeterSceneRunningStatusResponse, UnmarshallerContext _ctx) {
		
		describeJMeterSceneRunningStatusResponse.setRequestId(_ctx.stringValue("DescribeJMeterSceneRunningStatusResponse.RequestId"));
		describeJMeterSceneRunningStatusResponse.setMessage(_ctx.stringValue("DescribeJMeterSceneRunningStatusResponse.Message"));
		describeJMeterSceneRunningStatusResponse.setCode(_ctx.stringValue("DescribeJMeterSceneRunningStatusResponse.Code"));
		describeJMeterSceneRunningStatusResponse.setSuccess(_ctx.booleanValue("DescribeJMeterSceneRunningStatusResponse.Success"));
		describeJMeterSceneRunningStatusResponse.setHttpStatusCode(_ctx.integerValue("DescribeJMeterSceneRunningStatusResponse.HttpStatusCode"));

		Scene scene = new Scene();
		scene.setName(_ctx.stringValue("DescribeJMeterSceneRunningStatusResponse.Scene.Name"));
		scene.setPool(_ctx.stringValue("DescribeJMeterSceneRunningStatusResponse.Scene.Pool"));
		scene.setJmeterVersion(_ctx.stringValue("DescribeJMeterSceneRunningStatusResponse.Scene.JmeterVersion"));
		scene.setConcurrency(_ctx.integerValue("DescribeJMeterSceneRunningStatusResponse.Scene.Concurrency"));
		scene.setRampUp(_ctx.integerValue("DescribeJMeterSceneRunningStatusResponse.Scene.RampUp"));
		scene.setHoldFor(_ctx.integerValue("DescribeJMeterSceneRunningStatusResponse.Scene.HoldFor"));
		scene.setUseIterations(_ctx.booleanValue("DescribeJMeterSceneRunningStatusResponse.Scene.UseIterations"));
		scene.setIterations(_ctx.integerValue("DescribeJMeterSceneRunningStatusResponse.Scene.Iterations"));
		scene.setMaxConcurrencyPerAgent(_ctx.integerValue("DescribeJMeterSceneRunningStatusResponse.Scene.MaxConcurrencyPerAgent"));
		scene.setSpecifyAgentCount(_ctx.booleanValue("DescribeJMeterSceneRunningStatusResponse.Scene.SpecifyAgentCount"));
		scene.setAgentCount(_ctx.integerValue("DescribeJMeterSceneRunningStatusResponse.Scene.AgentCount"));
		scene.setSplitCsv(_ctx.booleanValue("DescribeJMeterSceneRunningStatusResponse.Scene.SplitCsv"));
		scene.setTestFile(_ctx.stringValue("DescribeJMeterSceneRunningStatusResponse.Scene.TestFile"));
		scene.setPlan(_ctx.stringValue("DescribeJMeterSceneRunningStatusResponse.Scene.Plan"));
		scene.setSteps(_ctx.integerValue("DescribeJMeterSceneRunningStatusResponse.Scene.Steps"));
		describeJMeterSceneRunningStatusResponse.setScene(scene);
	 
	 	return describeJMeterSceneRunningStatusResponse;
	}
}