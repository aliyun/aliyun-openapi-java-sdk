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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListResourceQueueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceQueueResponse extends AcsResponse {

	private List<Queue> queueList;

	public List<Queue> getQueueList() {
		return this.queueList;
	}

	public void setQueueList(List<Queue> queueList) {
		this.queueList = queueList;
	}

	public static class Queue {

		private EcmResourceQueue ecmResourceQueue;

		public EcmResourceQueue getEcmResourceQueue() {
			return this.ecmResourceQueue;
		}

		public void setEcmResourceQueue(EcmResourceQueue ecmResourceQueue) {
			this.ecmResourceQueue = ecmResourceQueue;
		}

		public static class EcmResourceQueue {

			private Long id;

			private String name;

			private String qualifiedName;

			private String queueType;

			private Long parentQueueId;

			private Boolean leaf;

			private String status;

			private String userId;

			private Long resourcePoolId;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getQualifiedName() {
				return this.qualifiedName;
			}

			public void setQualifiedName(String qualifiedName) {
				this.qualifiedName = qualifiedName;
			}

			public String getQueueType() {
				return this.queueType;
			}

			public void setQueueType(String queueType) {
				this.queueType = queueType;
			}

			public Long getParentQueueId() {
				return this.parentQueueId;
			}

			public void setParentQueueId(Long parentQueueId) {
				this.parentQueueId = parentQueueId;
			}

			public Boolean getLeaf() {
				return this.leaf;
			}

			public void setLeaf(Boolean leaf) {
				this.leaf = leaf;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Long getResourcePoolId() {
				return this.resourcePoolId;
			}

			public void setResourcePoolId(Long resourcePoolId) {
				this.resourcePoolId = resourcePoolId;
			}
		}
	}

	@Override
	public ListResourceQueueResponse getInstance(UnmarshallerContext context) {
		return	ListResourceQueueResponseUnmarshaller.unmarshall(this, context);
	}
}
