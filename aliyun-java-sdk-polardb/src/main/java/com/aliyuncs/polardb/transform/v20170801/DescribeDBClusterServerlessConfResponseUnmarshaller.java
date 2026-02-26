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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterServerlessConfResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterServerlessConfResponseUnmarshaller {

	public static DescribeDBClusterServerlessConfResponse unmarshall(DescribeDBClusterServerlessConfResponse describeDBClusterServerlessConfResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterServerlessConfResponse.setRequestId(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.RequestId"));
		describeDBClusterServerlessConfResponse.setScaleMin(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ScaleMin"));
		describeDBClusterServerlessConfResponse.setScaleMax(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ScaleMax"));
		describeDBClusterServerlessConfResponse.setScaleRoNumMin(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ScaleRoNumMin"));
		describeDBClusterServerlessConfResponse.setScaleRoNumMax(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ScaleRoNumMax"));
		describeDBClusterServerlessConfResponse.setAllowShutDown(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.AllowShutDown"));
		describeDBClusterServerlessConfResponse.setSecondsUntilAutoPause(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.SecondsUntilAutoPause"));
		describeDBClusterServerlessConfResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.DBClusterId"));
		describeDBClusterServerlessConfResponse.setScaleApRoNumMin(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ScaleApRoNumMin"));
		describeDBClusterServerlessConfResponse.setScaleApRoNumMax(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ScaleApRoNumMax"));
		describeDBClusterServerlessConfResponse.setSwitchs(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.Switchs"));
		describeDBClusterServerlessConfResponse.setDBMaxscaleId(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.DBMaxscaleId"));
		describeDBClusterServerlessConfResponse.setServerlessRuleMode(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ServerlessRuleMode"));
		describeDBClusterServerlessConfResponse.setServerlessRuleCpuEnlargeThreshold(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ServerlessRuleCpuEnlargeThreshold"));
		describeDBClusterServerlessConfResponse.setServerlessRuleCpuShrinkThreshold(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.ServerlessRuleCpuShrinkThreshold"));
		describeDBClusterServerlessConfResponse.setTraditionalScaleMaxThreshold(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.TraditionalScaleMaxThreshold"));
		describeDBClusterServerlessConfResponse.setAgileScaleMax(_ctx.stringValue("DescribeDBClusterServerlessConfResponse.AgileScaleMax"));
	 
	 	return describeDBClusterServerlessConfResponse;
	}
}