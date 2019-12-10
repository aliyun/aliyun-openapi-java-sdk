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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeQosPoliciesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeQosPoliciesResponse.QosPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeQosPoliciesResponseUnmarshaller {

	public static DescribeQosPoliciesResponse unmarshall(DescribeQosPoliciesResponse describeQosPoliciesResponse, UnmarshallerContext _ctx) {
		
		describeQosPoliciesResponse.setRequestId(_ctx.stringValue("DescribeQosPoliciesResponse.RequestId"));
		describeQosPoliciesResponse.setTotalCount(_ctx.integerValue("DescribeQosPoliciesResponse.TotalCount"));
		describeQosPoliciesResponse.setPageNumber(_ctx.integerValue("DescribeQosPoliciesResponse.PageNumber"));
		describeQosPoliciesResponse.setPageSize(_ctx.integerValue("DescribeQosPoliciesResponse.PageSize"));

		List<QosPolicy> qosPolicies = new ArrayList<QosPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeQosPoliciesResponse.QosPolicies.Length"); i++) {
			QosPolicy qosPolicy = new QosPolicy();
			qosPolicy.setQosPolicyId(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].QosPolicyId"));
			qosPolicy.setQosId(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].QosId"));
			qosPolicy.setPriority(_ctx.integerValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].Priority"));
			qosPolicy.setDescription(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].Description"));
			qosPolicy.setSourceCidr(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].SourceCidr"));
			qosPolicy.setDestCidr(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].DestCidr"));
			qosPolicy.setIpProtocol(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].IpProtocol"));
			qosPolicy.setSourcePortRange(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].SourcePortRange"));
			qosPolicy.setDestPortRange(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].DestPortRange"));
			qosPolicy.setStartTime(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].StartTime"));
			qosPolicy.setEndTime(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].EndTime"));
			qosPolicy.setName(_ctx.stringValue("DescribeQosPoliciesResponse.QosPolicies["+ i +"].Name"));

			qosPolicies.add(qosPolicy);
		}
		describeQosPoliciesResponse.setQosPolicies(qosPolicies);
	 
	 	return describeQosPoliciesResponse;
	}
}