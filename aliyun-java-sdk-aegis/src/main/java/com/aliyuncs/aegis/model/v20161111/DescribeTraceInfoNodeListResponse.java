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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeTraceInfoNodeListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTraceInfoNodeListResponse extends AcsResponse {

	private String requestId;

	private NodeListInfo nodeListInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public NodeListInfo getNodeListInfo() {
		return this.nodeListInfo;
	}

	public void setNodeListInfo(NodeListInfo nodeListInfo) {
		this.nodeListInfo = nodeListInfo;
	}

	public static class NodeListInfo {

		private List<Edge> edgeList;

		private List<Vertex> vertexList;

		private List<String> entityTypeList;

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

		public List<String> getEntityTypeList() {
			return this.entityTypeList;
		}

		public void setEntityTypeList(List<String> entityTypeList) {
			this.entityTypeList = entityTypeList;
		}

		public static class Edge {

			private String endId;

			private String startId;

			private String time;

			public String getEndId() {
				return this.endId;
			}

			public void setEndId(String endId) {
				this.endId = endId;
			}

			public String getStartId() {
				return this.startId;
			}

			public void setStartId(String startId) {
				this.startId = startId;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}
		}

		public static class Vertex {

			private String name;

			private String id;

			private String time;

			private List<String> neighborList;

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

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public List<String> getNeighborList() {
				return this.neighborList;
			}

			public void setNeighborList(List<String> neighborList) {
				this.neighborList = neighborList;
			}
		}
	}

	@Override
	public DescribeTraceInfoNodeListResponse getInstance(UnmarshallerContext context) {
		return	DescribeTraceInfoNodeListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
