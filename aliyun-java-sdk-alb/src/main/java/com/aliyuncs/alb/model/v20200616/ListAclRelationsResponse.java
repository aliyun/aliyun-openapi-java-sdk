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
import com.aliyuncs.alb.transform.v20200616.ListAclRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAclRelationsResponse extends AcsResponse {

	private String requestId;

	private List<AclRelation> aclRelations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AclRelation> getAclRelations() {
		return this.aclRelations;
	}

	public void setAclRelations(List<AclRelation> aclRelations) {
		this.aclRelations = aclRelations;
	}

	public static class AclRelation {

		private String aclId;

		private List<RelatedListener> relatedListeners;

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
		}

		public List<RelatedListener> getRelatedListeners() {
			return this.relatedListeners;
		}

		public void setRelatedListeners(List<RelatedListener> relatedListeners) {
			this.relatedListeners = relatedListeners;
		}

		public static class RelatedListener {

			private String listenerId;

			private Integer listenerPort;

			private String listenerProtocol;

			private String loadBalancerId;

			private String status;

			public String getListenerId() {
				return this.listenerId;
			}

			public void setListenerId(String listenerId) {
				this.listenerId = listenerId;
			}

			public Integer getListenerPort() {
				return this.listenerPort;
			}

			public void setListenerPort(Integer listenerPort) {
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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListAclRelationsResponse getInstance(UnmarshallerContext context) {
		return	ListAclRelationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
