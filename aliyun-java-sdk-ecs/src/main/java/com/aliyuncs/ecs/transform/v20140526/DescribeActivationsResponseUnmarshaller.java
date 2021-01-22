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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeActivationsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeActivationsResponse.Activation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActivationsResponseUnmarshaller {

	public static DescribeActivationsResponse unmarshall(DescribeActivationsResponse describeActivationsResponse, UnmarshallerContext _ctx) {
		
		describeActivationsResponse.setRequestId(_ctx.stringValue("DescribeActivationsResponse.RequestId"));
		describeActivationsResponse.setTotalCount(_ctx.longValue("DescribeActivationsResponse.TotalCount"));
		describeActivationsResponse.setPageNumber(_ctx.longValue("DescribeActivationsResponse.PageNumber"));
		describeActivationsResponse.setPageSize(_ctx.longValue("DescribeActivationsResponse.PageSize"));

		List<Activation> activationList = new ArrayList<Activation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActivationsResponse.ActivationList.Length"); i++) {
			Activation activation = new Activation();
			activation.setActivationId(_ctx.stringValue("DescribeActivationsResponse.ActivationList["+ i +"].ActivationId"));
			activation.setInstanceName(_ctx.stringValue("DescribeActivationsResponse.ActivationList["+ i +"].InstanceName"));
			activation.setDescription(_ctx.stringValue("DescribeActivationsResponse.ActivationList["+ i +"].Description"));
			activation.setInstanceCount(_ctx.integerValue("DescribeActivationsResponse.ActivationList["+ i +"].InstanceCount"));
			activation.setTimeToLiveInHours(_ctx.longValue("DescribeActivationsResponse.ActivationList["+ i +"].TimeToLiveInHours"));
			activation.setIpAddressRange(_ctx.stringValue("DescribeActivationsResponse.ActivationList["+ i +"].IpAddressRange"));
			activation.setRegisteredCount(_ctx.integerValue("DescribeActivationsResponse.ActivationList["+ i +"].RegisteredCount"));
			activation.setDeregisteredCount(_ctx.integerValue("DescribeActivationsResponse.ActivationList["+ i +"].DeregisteredCount"));
			activation.setDisabled(_ctx.booleanValue("DescribeActivationsResponse.ActivationList["+ i +"].Disabled"));
			activation.setCreationTime(_ctx.stringValue("DescribeActivationsResponse.ActivationList["+ i +"].CreationTime"));

			activationList.add(activation);
		}
		describeActivationsResponse.setActivationList(activationList);
	 
	 	return describeActivationsResponse;
	}
}