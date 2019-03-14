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
import com.aliyuncs.emr.transform.v20160408.ListETLJobTriggerEntityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListETLJobTriggerEntityResponse extends AcsResponse {

	private String requestId;

	private List<TriggerEntity> triggerEntityList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TriggerEntity> getTriggerEntityList() {
		return this.triggerEntityList;
	}

	public void setTriggerEntityList(List<TriggerEntity> triggerEntityList) {
		this.triggerEntityList = triggerEntityList;
	}

	public static class TriggerEntity {

		private String entityType;

		private String id;

		private String name;

		public String getEntityType() {
			return this.entityType;
		}

		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public ListETLJobTriggerEntityResponse getInstance(UnmarshallerContext context) {
		return	ListETLJobTriggerEntityResponseUnmarshaller.unmarshall(this, context);
	}
}
