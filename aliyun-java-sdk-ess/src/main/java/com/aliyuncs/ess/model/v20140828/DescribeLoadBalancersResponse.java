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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeLoadBalancersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancersResponse extends AcsResponse {

	private String requestId;

	private String scalingGroupId;

	private List<String> loadBalancers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
	}

	public List<String> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<String> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}

	@Override
	public DescribeLoadBalancersResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancersResponseUnmarshaller.unmarshall(this, context);
	}
}
