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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerListenersExResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerListenersExResponse extends AcsResponse {

	private String loadBalancerId;

	private String requestId;

	private List<ListenerAttributeExResponseModel> listenerExtendedAttributes;

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ListenerAttributeExResponseModel> getListenerExtendedAttributes() {
		return this.listenerExtendedAttributes;
	}

	public void setListenerExtendedAttributes(List<ListenerAttributeExResponseModel> listenerExtendedAttributes) {
		this.listenerExtendedAttributes = listenerExtendedAttributes;
	}

	public static class ListenerAttributeExResponseModel {

		private Integer listenerPort;

		private String protocol;

		private String recordCustomizedHeaders;

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getRecordCustomizedHeaders() {
			return this.recordCustomizedHeaders;
		}

		public void setRecordCustomizedHeaders(String recordCustomizedHeaders) {
			this.recordCustomizedHeaders = recordCustomizedHeaders;
		}
	}

	@Override
	public DescribeLoadBalancerListenersExResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerListenersExResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
