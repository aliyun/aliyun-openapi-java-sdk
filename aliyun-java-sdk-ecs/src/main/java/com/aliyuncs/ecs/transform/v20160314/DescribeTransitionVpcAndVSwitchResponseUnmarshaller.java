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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeTransitionVpcAndVSwitchResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeTransitionVpcAndVSwitchResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTransitionVpcAndVSwitchResponseUnmarshaller {

	public static DescribeTransitionVpcAndVSwitchResponse unmarshall(DescribeTransitionVpcAndVSwitchResponse describeTransitionVpcAndVSwitchResponse, UnmarshallerContext _ctx) {
		
		describeTransitionVpcAndVSwitchResponse.setRequestId(_ctx.stringValue("DescribeTransitionVpcAndVSwitchResponse.RequestId"));

		List<Model> vmTransitionModels = new ArrayList<Model>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTransitionVpcAndVSwitchResponse.VmTransitionModels.Length"); i++) {
			Model model = new Model();
			model.setCode(_ctx.stringValue("DescribeTransitionVpcAndVSwitchResponse.VmTransitionModels["+ i +"].Code"));
			model.setVpcId(_ctx.stringValue("DescribeTransitionVpcAndVSwitchResponse.VmTransitionModels["+ i +"].VpcId"));
			model.setMessage(_ctx.stringValue("DescribeTransitionVpcAndVSwitchResponse.VmTransitionModels["+ i +"].Message"));
			model.setVSwitchId(_ctx.stringValue("DescribeTransitionVpcAndVSwitchResponse.VmTransitionModels["+ i +"].VSwitchId"));
			model.setInstanceId(_ctx.stringValue("DescribeTransitionVpcAndVSwitchResponse.VmTransitionModels["+ i +"].InstanceId"));

			vmTransitionModels.add(model);
		}
		describeTransitionVpcAndVSwitchResponse.setVmTransitionModels(vmTransitionModels);
	 
	 	return describeTransitionVpcAndVSwitchResponse;
	}
}