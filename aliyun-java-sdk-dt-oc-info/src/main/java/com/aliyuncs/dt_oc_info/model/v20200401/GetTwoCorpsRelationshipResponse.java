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

package com.aliyuncs.dt_oc_info.model.v20200401;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20200401.GetTwoCorpsRelationshipResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTwoCorpsRelationshipResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Integer total;

	private List<DataItem> data;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Float strength;

		private Integer relationLevel;

		private Integer relationRank;

		private List<NodesItem> nodes;

		private List<RelationshipsItem> relationships;

		public Float getStrength() {
			return this.strength;
		}

		public void setStrength(Float strength) {
			this.strength = strength;
		}

		public Integer getRelationLevel() {
			return this.relationLevel;
		}

		public void setRelationLevel(Integer relationLevel) {
			this.relationLevel = relationLevel;
		}

		public Integer getRelationRank() {
			return this.relationRank;
		}

		public void setRelationRank(Integer relationRank) {
			this.relationRank = relationRank;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public List<RelationshipsItem> getRelationships() {
			return this.relationships;
		}

		public void setRelationships(List<RelationshipsItem> relationships) {
			this.relationships = relationships;
		}

		public static class NodesItem {

			private String name;

			private String label;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class RelationshipsItem {

			private String type;

			private String endNode;

			private String id;

			private Map<Object,Object> properties;

			private String startNode;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getEndNode() {
				return this.endNode;
			}

			public void setEndNode(String endNode) {
				this.endNode = endNode;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Map<Object,Object> getProperties() {
				return this.properties;
			}

			public void setProperties(Map<Object,Object> properties) {
				this.properties = properties;
			}

			public String getStartNode() {
				return this.startNode;
			}

			public void setStartNode(String startNode) {
				this.startNode = startNode;
			}
		}
	}

	@Override
	public GetTwoCorpsRelationshipResponse getInstance(UnmarshallerContext context) {
		return	GetTwoCorpsRelationshipResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
