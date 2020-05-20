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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersExResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersExResponse.ListenerAttributeExResponseModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerListenersExResponseUnmarshaller {

	public static DescribeLoadBalancerListenersExResponse unmarshall(DescribeLoadBalancerListenersExResponse describeLoadBalancerListenersExResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerListenersExResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerListenersExResponse.RequestId"));
		describeLoadBalancerListenersExResponse.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerListenersExResponse.LoadBalancerId"));

		List<ListenerAttributeExResponseModel> listenerExtendedAttributes = new ArrayList<ListenerAttributeExResponseModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerListenersExResponse.ListenerExtendedAttributes.Length"); i++) {
			ListenerAttributeExResponseModel listenerAttributeExResponseModel = new ListenerAttributeExResponseModel();
			listenerAttributeExResponseModel.setListenerPort(_ctx.integerValue("DescribeLoadBalancerListenersExResponse.ListenerExtendedAttributes["+ i +"].ListenerPort"));
			listenerAttributeExResponseModel.setBizProtocol(_ctx.stringValue("DescribeLoadBalancerListenersExResponse.ListenerExtendedAttributes["+ i +"].Protocol"));
			listenerAttributeExResponseModel.setRecordCustomizedHeaders(_ctx.stringValue("DescribeLoadBalancerListenersExResponse.ListenerExtendedAttributes["+ i +"].RecordCustomizedHeaders"));

			listenerExtendedAttributes.add(listenerAttributeExResponseModel);
		}
		describeLoadBalancerListenersExResponse.setListenerExtendedAttributes(listenerExtendedAttributes);
	 
	 	return describeLoadBalancerListenersExResponse;
	}
}