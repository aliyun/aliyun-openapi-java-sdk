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

import com.aliyuncs.ecs.model.v20160314.DescribeTransitionVpcsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeTransitionVpcsResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTransitionVpcsResponseUnmarshaller {

	public static DescribeTransitionVpcsResponse unmarshall(DescribeTransitionVpcsResponse describeTransitionVpcsResponse, UnmarshallerContext _ctx) {
		
		describeTransitionVpcsResponse.setRequestId(_ctx.stringValue("DescribeTransitionVpcsResponse.RequestId"));
		describeTransitionVpcsResponse.setCode(_ctx.stringValue("DescribeTransitionVpcsResponse.Code"));
		describeTransitionVpcsResponse.setSuccess(_ctx.booleanValue("DescribeTransitionVpcsResponse.Success"));

		List<Model> vpcModels = new ArrayList<Model>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTransitionVpcsResponse.VpcModels.Length"); i++) {
			Model model = new Model();
			model.setVpcId(_ctx.stringValue("DescribeTransitionVpcsResponse.VpcModels["+ i +"].VpcId"));
			model.setVpcName(_ctx.stringValue("DescribeTransitionVpcsResponse.VpcModels["+ i +"].VpcName"));
			model.setStatus(_ctx.integerValue("DescribeTransitionVpcsResponse.VpcModels["+ i +"].Status"));
			model.setType(_ctx.integerValue("DescribeTransitionVpcsResponse.VpcModels["+ i +"].Type"));
			model.setConfig(_ctx.stringValue("DescribeTransitionVpcsResponse.VpcModels["+ i +"].Config"));
			model.setRegionId(_ctx.stringValue("DescribeTransitionVpcsResponse.VpcModels["+ i +"].RegionId"));

			vpcModels.add(model);
		}
		describeTransitionVpcsResponse.setVpcModels(vpcModels);
	 
	 	return describeTransitionVpcsResponse;
	}
}