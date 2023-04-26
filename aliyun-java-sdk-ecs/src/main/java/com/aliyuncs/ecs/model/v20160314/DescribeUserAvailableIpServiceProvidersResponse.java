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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeUserAvailableIpServiceProvidersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserAvailableIpServiceProvidersResponse extends AcsResponse {

	private String requestId;

	private List<IpServiceProvider> ipServiceProviders;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IpServiceProvider> getIpServiceProviders() {
		return this.ipServiceProviders;
	}

	public void setIpServiceProviders(List<IpServiceProvider> ipServiceProviders) {
		this.ipServiceProviders = ipServiceProviders;
	}

	public static class IpServiceProvider {

		private String name;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public DescribeUserAvailableIpServiceProvidersResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserAvailableIpServiceProvidersResponseUnmarshaller.unmarshall(this, context);
	}
}
