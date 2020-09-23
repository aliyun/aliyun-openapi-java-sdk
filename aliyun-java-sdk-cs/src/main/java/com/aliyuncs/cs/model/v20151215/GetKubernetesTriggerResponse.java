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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.GetKubernetesTriggerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetKubernetesTriggerResponse extends AcsResponse {

	private List<TriggersItem> triggers;

	public List<TriggersItem> getTriggers() {
		return this.triggers;
	}

	public void setTriggers(List<TriggersItem> triggers) {
		this.triggers = triggers;
	}

	public static class TriggersItem {

		private String cluster_id;

		private String project_id;

		private String action;

		private String id;

		private String token;

		public String getCluster_id() {
			return this.cluster_id;
		}

		public void setCluster_id(String cluster_id) {
			this.cluster_id = cluster_id;
		}

		public String getProject_id() {
			return this.project_id;
		}

		public void setProject_id(String project_id) {
			this.project_id = project_id;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}
	}

	@Override
	public GetKubernetesTriggerResponse getInstance(UnmarshallerContext context) {
		return	GetKubernetesTriggerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
