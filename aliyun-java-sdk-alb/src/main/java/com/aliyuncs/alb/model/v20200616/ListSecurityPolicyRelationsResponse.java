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

package com.aliyuncs.alb.model.v20200616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.ListSecurityPolicyRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityPolicyRelationsResponse extends AcsResponse {

	private String requestId;

	private List<SecrityPolicyRelation> secrityPolicyRelations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SecrityPolicyRelation> getSecrityPolicyRelations() {
		return this.secrityPolicyRelations;
	}

	public void setSecrityPolicyRelations(List<SecrityPolicyRelation> secrityPolicyRelations) {
		this.secrityPolicyRelations = secrityPolicyRelations;
	}

	public static class SecrityPolicyRelation {

		private String securityPolicyId;

		private List<RelatedListener> relatedListeners;

		public String getSecurityPolicyId() {
			return this.securityPolicyId;
		}

		public void setSecurityPolicyId(String securityPolicyId) {
			this.securityPolicyId = securityPolicyId;
		}

		public List<RelatedListener> getRelatedListeners() {
			return this.relatedListeners;
		}

		public void setRelatedListeners(List<RelatedListener> relatedListeners) {
			this.relatedListeners = relatedListeners;
		}

		public static class RelatedListener {

			private String listenerId;

			private Long listenerPort;

			private String listenerProtocol;

			private String loadBalancerId;

			public String getListenerId() {
				return this.listenerId;
			}

			public void setListenerId(String listenerId) {
				this.listenerId = listenerId;
			}

			public Long getListenerPort() {
				return this.listenerPort;
			}

			public void setListenerPort(Long listenerPort) {
				this.listenerPort = listenerPort;
			}

			public String getListenerProtocol() {
				return this.listenerProtocol;
			}

			public void setListenerProtocol(String listenerProtocol) {
				this.listenerProtocol = listenerProtocol;
			}

			public String getLoadBalancerId() {
				return this.loadBalancerId;
			}

			public void setLoadBalancerId(String loadBalancerId) {
				this.loadBalancerId = loadBalancerId;
			}
		}
	}

	@Override
	public ListSecurityPolicyRelationsResponse getInstance(UnmarshallerContext context) {
		return	ListSecurityPolicyRelationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
