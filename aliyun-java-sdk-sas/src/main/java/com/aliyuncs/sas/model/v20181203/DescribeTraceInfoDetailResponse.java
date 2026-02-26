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
import com.aliyuncs.sas.transform.v20181203.DescribeTraceInfoDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTraceInfoDetailResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private TraceInfoDetail traceInfoDetail;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TraceInfoDetail getTraceInfoDetail() {
		return this.traceInfoDetail;
	}

	public void setTraceInfoDetail(TraceInfoDetail traceInfoDetail) {
		this.traceInfoDetail = traceInfoDetail;
	}

	public static class TraceInfoDetail {

		private List<Edge> edgeList;

		private List<Vertex> vertexList;

		private List<EntityType> entityTypeList;

		private List<RelationType> relationTypeList;

		public List<Edge> getEdgeList() {
			return this.edgeList;
		}

		public void setEdgeList(List<Edge> edgeList) {
			this.edgeList = edgeList;
		}

		public List<Vertex> getVertexList() {
			return this.vertexList;
		}

		public void setVertexList(List<Vertex> vertexList) {
			this.vertexList = vertexList;
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

		public static class Edge {

			private String type;

			private String time;

			private String startId;

			private Integer count;

			private String endId;

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

			public String getStartId() {
				return this.startId;
			}

			public void setStartId(String startId) {
				this.startId = startId;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getEndId() {
				return this.endId;
			}

			public void setEndId(String endId) {
				this.endId = endId;
			}
		}

		public static class Vertex {

			private String type;

			private String time;

			private String name;

			private String id;

			private Integer count;

			private List<Neighbor> neighborList;

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

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public List<Neighbor> getNeighborList() {
				return this.neighborList;
			}

			public void setNeighborList(List<Neighbor> neighborList) {
				this.neighborList = neighborList;
			}

			public static class Neighbor {

				private String type;

				private Boolean hasMore;

				private Integer count;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getHasMore() {
					return this.hasMore;
				}

				public void setHasMore(Boolean hasMore) {
					this.hasMore = hasMore;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}
		}

		public static class EntityType {

			private String displayColor;

			private Integer dbId;

			private String displayTemplate;

			private String displayIcon;

			private Integer limit;

			private Long gmtCreate;

			private Integer offset;

			private String namespace;

			private String name;

			private Long gmtModified;

			private String id;

			public String getDisplayColor() {
				return this.displayColor;
			}

			public void setDisplayColor(String displayColor) {
				this.displayColor = displayColor;
			}

			public Integer getDbId() {
				return this.dbId;
			}

			public void setDbId(Integer dbId) {
				this.dbId = dbId;
			}

			public String getDisplayTemplate() {
				return this.displayTemplate;
			}

			public void setDisplayTemplate(String displayTemplate) {
				this.displayTemplate = displayTemplate;
			}

			public String getDisplayIcon() {
				return this.displayIcon;
			}

			public void setDisplayIcon(String displayIcon) {
				this.displayIcon = displayIcon;
			}

			public Integer getLimit() {
				return this.limit;
			}

			public void setLimit(Integer limit) {
				this.limit = limit;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Integer getOffset() {
				return this.offset;
			}

			public void setOffset(Integer offset) {
				this.offset = offset;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class RelationType {

			private String showType;

			private String displayColor;

			private String name;

			private Integer directed;

			private String relationTypeId;

			public String getShowType() {
				return this.showType;
			}

			public void setShowType(String showType) {
				this.showType = showType;
			}

			public String getDisplayColor() {
				return this.displayColor;
			}

			public void setDisplayColor(String displayColor) {
				this.displayColor = displayColor;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getDirected() {
				return this.directed;
			}

			public void setDirected(Integer directed) {
				this.directed = directed;
			}

			public String getRelationTypeId() {
				return this.relationTypeId;
			}

			public void setRelationTypeId(String relationTypeId) {
				this.relationTypeId = relationTypeId;
			}
		}
	}

	@Override
	public DescribeTraceInfoDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeTraceInfoDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
