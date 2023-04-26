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

import com.aliyuncs.ecs.model.v20160314.DescribeTransitionVSwitchesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeTransitionVSwitchesResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTransitionVSwitchesResponseUnmarshaller {

	public static DescribeTransitionVSwitchesResponse unmarshall(DescribeTransitionVSwitchesResponse describeTransitionVSwitchesResponse, UnmarshallerContext _ctx) {
		
		describeTransitionVSwitchesResponse.setRequestId(_ctx.stringValue("DescribeTransitionVSwitchesResponse.RequestId"));
		describeTransitionVSwitchesResponse.setCode(_ctx.stringValue("DescribeTransitionVSwitchesResponse.Code"));
		describeTransitionVSwitchesResponse.setSuccess(_ctx.booleanValue("DescribeTransitionVSwitchesResponse.Success"));

		List<Model> vSwitchModels = new ArrayList<Model>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTransitionVSwitchesResponse.VSwitchModels.Length"); i++) {
			Model model = new Model();
			model.setVpcId(_ctx.stringValue("DescribeTransitionVSwitchesResponse.VSwitchModels["+ i +"].VpcId"));
			model.setVSwitchId(_ctx.stringValue("DescribeTransitionVSwitchesResponse.VSwitchModels["+ i +"].VSwitchId"));
			model.setDescription(_ctx.stringValue("DescribeTransitionVSwitchesResponse.VSwitchModels["+ i +"].Description"));
			model.setCIDR(_ctx.stringValue("DescribeTransitionVSwitchesResponse.VSwitchModels["+ i +"].CIDR"));
			model.setName(_ctx.stringValue("DescribeTransitionVSwitchesResponse.VSwitchModels["+ i +"].Name"));
			model.setIzNo(_ctx.stringValue("DescribeTransitionVSwitchesResponse.VSwitchModels["+ i +"].IzNo"));

			vSwitchModels.add(model);
		}
		describeTransitionVSwitchesResponse.setVSwitchModels(vSwitchModels);
	 
	 	return describeTransitionVSwitchesResponse;
	}
}