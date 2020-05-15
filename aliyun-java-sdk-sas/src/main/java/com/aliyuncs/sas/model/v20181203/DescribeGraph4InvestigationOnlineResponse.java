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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeGraph4InvestigationOnlineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGraph4InvestigationOnlineResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private List<Vertex> vertexList;

		private List<Edge> edgeList;

		private List<EntityType> entityTypeList;

		private List<RelationType> relationTypeList;

		public List<Vertex> getVertexList() {
			return this.vertexList;
		}

		public void setVertexList(List<Vertex> vertexList) {
			this.vertexList = vertexList;
		}

		public List<Edge> getEdgeList() {
			return this.edgeList;
		}

		public void setEdgeList(List<Edge> edgeList) {
			this.edgeList = edgeList;
		}

		public List<EntityType> getEntityTypeList() {
			return this.entityTypeList;
		}

		public void setEntityTypeList(List<EntityType> entityTypeList) {
			this.entityTypeList = entityTypeList;
		}

		public List<RelationType> getRelationTypeList() {
			return this.relationTypeList;
		}

		public void setRelationTypeList(List<RelationType> relationTypeList) {
			this.relationTypeList = relationTypeList;
		}

		public static class Vertex {

			private String id;

			private String name;

			private String type;

			private String time;

			private String uuid;

			private String aliuid;

			private String properties;

			private String positionId;

			private String position;

			private List<Neighbor> neighborList;

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

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getAliuid() {
				return this.aliuid;
			}

			public void setAliuid(String aliuid) {
				this.aliuid = aliuid;
			}

			public String getProperties() {
				return this.properties;
			}

			public void setProperties(String properties) {
				this.properties = properties;
			}

			public String getPositionId() {
				return this.positionId;
			}

			public void setPositionId(String positionId) {
				this.positionId = positionId;
			}

			public String getPosition() {
				return this.position;
			}

			public void setPosition(String position) {
				this.position = position;
			}

			public List<Neighbor> getNeighborList() {
				return this.neighborList;
			}

			public void setNeighborList(List<Neighbor> neighborList) {
				this.neighborList = neighborList;
			}

			public static class Neighbor {

				private String type;

				private Integer count;

				private Boolean hasMore;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}

				public Boolean getHasMore() {
					return this.hasMore;
				}

				public void setHasMore(Boolean hasMore) {
					this.hasMore = hasMore;
				}
			}
		}

		public static class Edge {

			private Integer id;

			private String startId;

			private String endId;

			private String startType;

			private String endType;

			private String name;

			private String type;

			private String time;

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getStartId() {
				return this.startId;
			}

			public void setStartId(String startId) {
				this.startId = startId;
			}

			public String getEndId() {
				return this.endId;
			}

			public void setEndId(String endId) {
				this.endId = endId;
			}

			public String getStartType() {
				return this.startType;
			}

			public void setStartType(String startType) {
				this.startType = startType;
			}

			public String getEndType() {
				return this.endType;
			}

			public void setEndType(String endType) {
				this.endType = endType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}
		}

		public static class EntityType {

			private String id;

			private String name;

			private String displayColor;

			private String displayIcon;

			private String displayOrder;

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

			public String getDisplayColor() {
				return this.displayColor;
			}

			public void setDisplayColor(String displayColor) {
				this.displayColor = displayColor;
			}

			public String getDisplayIcon() {
				return this.displayIcon;
			}

			public void setDisplayIcon(String displayIcon) {
				this.displayIcon = displayIcon;
			}

			public String getDisplayOrder() {
				return this.displayOrder;
			}

			public void setDisplayOrder(String displayOrder) {
				this.displayOrder = displayOrder;
			}
		}

		public static class RelationType {

			private String id;

			private String showType;

			private Integer directed;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getShowType() {
				return this.showType;
			}

			public void setShowType(String showType) {
				this.showType = showType;
			}

			public Integer getDirected() {
				return this.directed;
			}

			public void setDirected(Integer directed) {
				this.directed = directed;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public DescribeGraph4InvestigationOnlineResponse getInstance(UnmarshallerContext context) {
		return	DescribeGraph4InvestigationOnlineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
