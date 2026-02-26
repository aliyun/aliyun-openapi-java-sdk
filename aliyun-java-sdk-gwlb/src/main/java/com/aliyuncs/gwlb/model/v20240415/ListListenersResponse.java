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

package com.aliyuncs.gwlb.model.v20240415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gwlb.transform.v20240415.ListListenersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListListenersResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<Listener> listeners;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Listener> getListeners() {
		return this.listeners;
	}

	public void setListeners(List<Listener> listeners) {
		this.listeners = listeners;
	}

	public static class Listener {

		private String listenerDescription;

		private String listenerId;

		private String listenerStatus;

		private String loadBalancerId;

		private String serverGroupId;

		private List<TagModel> tags;

		public String getListenerDescription() {
			return this.listenerDescription;
		}

		public void setListenerDescription(String listenerDescription) {
			this.listenerDescription = listenerDescription;
		}

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getListenerStatus() {
			return this.listenerStatus;
		}

		public void setListenerStatus(String listenerStatus) {
			this.listenerStatus = listenerStatus;
		}

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getServerGroupId() {
			return this.serverGroupId;
		}

		public void setServerGroupId(String serverGroupId) {
			this.serverGroupId = serverGroupId;
		}

		public List<TagModel> getTags() {
			return this.tags;
		}

		public void setTags(List<TagModel> tags) {
			this.tags = tags;
		}

		public static class TagModel {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListListenersResponse getInstance(UnmarshallerContext context) {
		return	ListListenersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
