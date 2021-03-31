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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.UpdateSwimmingLanePriorityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateSwimmingLanePriorityResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String name;

		private String tag;

		private String namespaceId;

		private Long groupId;

		private String entryRule;

		private List<SwimmingLaneAppRelationShip> swimmingLaneAppRelationShipList;

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

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getEntryRule() {
			return this.entryRule;
		}

		public void setEntryRule(String entryRule) {
			this.entryRule = entryRule;
		}

		public List<SwimmingLaneAppRelationShip> getSwimmingLaneAppRelationShipList() {
			return this.swimmingLaneAppRelationShipList;
		}

		public void setSwimmingLaneAppRelationShipList(List<SwimmingLaneAppRelationShip> swimmingLaneAppRelationShipList) {
			this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
		}

		public static class SwimmingLaneAppRelationShip {

			private Long laneId;

			private String appId;

			private String rules;

			private String appName;

			public Long getLaneId() {
				return this.laneId;
			}

			public void setLaneId(Long laneId) {
				this.laneId = laneId;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getRules() {
				return this.rules;
			}

			public void setRules(String rules) {
				this.rules = rules;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}
		}
	}

	@Override
	public UpdateSwimmingLanePriorityResponse getInstance(UnmarshallerContext context) {
		return	UpdateSwimmingLanePriorityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
