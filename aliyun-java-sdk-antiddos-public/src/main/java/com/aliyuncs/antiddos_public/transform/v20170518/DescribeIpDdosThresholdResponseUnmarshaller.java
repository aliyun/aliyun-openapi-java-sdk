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

package com.aliyuncs.antiddos_public.transform.v20170518;

import com.aliyuncs.antiddos_public.model.v20170518.DescribeIpDdosThresholdResponse;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeIpDdosThresholdResponse.Threshold;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpDdosThresholdResponseUnmarshaller {

	public static DescribeIpDdosThresholdResponse unmarshall(DescribeIpDdosThresholdResponse describeIpDdosThresholdResponse, UnmarshallerContext _ctx) {
		
		describeIpDdosThresholdResponse.setRequestId(_ctx.stringValue("DescribeIpDdosThresholdResponse.RequestId"));

		Threshold threshold = new Threshold();
		threshold.setDdosType(_ctx.stringValue("DescribeIpDdosThresholdResponse.Threshold.DdosType"));
		threshold.setIsAuto(_ctx.booleanValue("DescribeIpDdosThresholdResponse.Threshold.IsAuto"));
		threshold.setMaxBps(_ctx.integerValue("DescribeIpDdosThresholdResponse.Threshold.MaxBps"));
		threshold.setElasticBps(_ctx.integerValue("DescribeIpDdosThresholdResponse.Threshold.ElasticBps"));
		threshold.setInstanceId(_ctx.stringValue("DescribeIpDdosThresholdResponse.Threshold.InstanceId"));
		threshold.setBps(_ctx.integerValue("DescribeIpDdosThresholdResponse.Threshold.Bps"));
		threshold.setPps(_ctx.integerValue("DescribeIpDdosThresholdResponse.Threshold.Pps"));
		threshold.setMaxPps(_ctx.integerValue("DescribeIpDdosThresholdResponse.Threshold.MaxPps"));
		threshold.setInternetIp(_ctx.stringValue("DescribeIpDdosThresholdResponse.Threshold.InternetIp"));
		describeIpDdosThresholdResponse.setThreshold(threshold);
	 
	 	return describeIpDdosThresholdResponse;
	}
}