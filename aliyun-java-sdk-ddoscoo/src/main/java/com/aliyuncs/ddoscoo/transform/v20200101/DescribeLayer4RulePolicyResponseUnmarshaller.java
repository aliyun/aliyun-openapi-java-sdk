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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeLayer4RulePolicyResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeLayer4RulePolicyResponse.PriRealServersItem;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeLayer4RulePolicyResponse.SecRealServersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLayer4RulePolicyResponseUnmarshaller {

	public static DescribeLayer4RulePolicyResponse unmarshall(DescribeLayer4RulePolicyResponse describeLayer4RulePolicyResponse, UnmarshallerContext _ctx) {
		
		describeLayer4RulePolicyResponse.setRequestId(_ctx.stringValue("DescribeLayer4RulePolicyResponse.RequestId"));
		describeLayer4RulePolicyResponse.setFrontendPort(_ctx.integerValue("DescribeLayer4RulePolicyResponse.FrontendPort"));
		describeLayer4RulePolicyResponse.setBakMode(_ctx.stringValue("DescribeLayer4RulePolicyResponse.BakMode"));
		describeLayer4RulePolicyResponse.setCurrentIndex(_ctx.integerValue("DescribeLayer4RulePolicyResponse.CurrentIndex"));
		describeLayer4RulePolicyResponse.setForwardProtocol(_ctx.stringValue("DescribeLayer4RulePolicyResponse.ForwardProtocol"));
		describeLayer4RulePolicyResponse.setInstanceId(_ctx.stringValue("DescribeLayer4RulePolicyResponse.InstanceId"));
		describeLayer4RulePolicyResponse.setBackendPort(_ctx.integerValue("DescribeLayer4RulePolicyResponse.BackendPort"));

		List<PriRealServersItem> priRealServers = new ArrayList<PriRealServersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLayer4RulePolicyResponse.PriRealServers.Length"); i++) {
			PriRealServersItem priRealServersItem = new PriRealServersItem();
			priRealServersItem.setFrontendPort(_ctx.integerValue("DescribeLayer4RulePolicyResponse.PriRealServers["+ i +"].FrontendPort"));
			priRealServersItem.setEip(_ctx.stringValue("DescribeLayer4RulePolicyResponse.PriRealServers["+ i +"].Eip"));
			priRealServersItem.setBizProtocol(_ctx.stringValue("DescribeLayer4RulePolicyResponse.PriRealServers["+ i +"].Protocol"));
			priRealServersItem.setCurrentIndex(_ctx.integerValue("DescribeLayer4RulePolicyResponse.PriRealServers["+ i +"].CurrentIndex"));
			priRealServersItem.setInstanceId(_ctx.stringValue("DescribeLayer4RulePolicyResponse.PriRealServers["+ i +"].InstanceId"));
			priRealServersItem.setRealServer(_ctx.stringValue("DescribeLayer4RulePolicyResponse.PriRealServers["+ i +"].RealServer"));

			priRealServers.add(priRealServersItem);
		}
		describeLayer4RulePolicyResponse.setPriRealServers(priRealServers);

		List<SecRealServersItem> secRealServers = new ArrayList<SecRealServersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLayer4RulePolicyResponse.SecRealServers.Length"); i++) {
			SecRealServersItem secRealServersItem = new SecRealServersItem();
			secRealServersItem.setFrontendPort(_ctx.integerValue("DescribeLayer4RulePolicyResponse.SecRealServers["+ i +"].FrontendPort"));
			secRealServersItem.setEip(_ctx.stringValue("DescribeLayer4RulePolicyResponse.SecRealServers["+ i +"].Eip"));
			secRealServersItem.setBizProtocol(_ctx.stringValue("DescribeLayer4RulePolicyResponse.SecRealServers["+ i +"].Protocol"));
			secRealServersItem.setCurrentIndex(_ctx.integerValue("DescribeLayer4RulePolicyResponse.SecRealServers["+ i +"].CurrentIndex"));
			secRealServersItem.setInstanceId(_ctx.stringValue("DescribeLayer4RulePolicyResponse.SecRealServers["+ i +"].InstanceId"));
			secRealServersItem.setRealServer(_ctx.stringValue("DescribeLayer4RulePolicyResponse.SecRealServers["+ i +"].RealServer"));

			secRealServers.add(secRealServersItem);
		}
		describeLayer4RulePolicyResponse.setSecRealServers(secRealServers);
	 
	 	return describeLayer4RulePolicyResponse;
	}
}