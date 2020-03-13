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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DescribeDSTTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDSTTopologyResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<EdgesItem> edges;

	private List<EdgeMetricsItem> edgeMetrics;

	private List<NodesItem> nodes;

	private List<NodeMetricsItem> nodeMetrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<EdgesItem> getEdges() {
		return this.edges;
	}

	public void setEdges(List<EdgesItem> edges) {
		this.edges = edges;
	}

	public List<EdgeMetricsItem> getEdgeMetrics() {
		return this.edgeMetrics;
	}

	public void setEdgeMetrics(List<EdgeMetricsItem> edgeMetrics) {
		this.edgeMetrics = edgeMetrics;
	}

	public List<NodesItem> getNodes() {
		return this.nodes;
	}

	public void setNodes(List<NodesItem> nodes) {
		this.nodes = nodes;
	}

	public List<NodeMetricsItem> getNodeMetrics() {
		return this.nodeMetrics;
	}

	public void setNodeMetrics(List<NodeMetricsItem> nodeMetrics) {
		this.nodeMetrics = nodeMetrics;
	}

	public static class EdgesItem {

		private String id;

		private String source;

		private String target;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}
	}

	public static class EdgeMetricsItem {

		private Long endTime;

		private Long startTime;

		private String type;

		private List<TagsItem> tags;

		private List<ValuesItem> values;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<ValuesItem> getValues() {
			return this.values;
		}

		public void setValues(List<ValuesItem> values) {
			this.values = values;
		}

		public static class TagsItem {

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

		public static class ValuesItem {

			private Long timestamp;

			private List<ValueItem> value;

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public List<ValueItem> getValue() {
				return this.value;
			}

			public void setValue(List<ValueItem> value) {
				this.value = value;
			}

			public static class ValueItem {

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
	}

	public static class NodesItem {

		private String app;

		private String id;

		private String type;

		private List<DimensionsItem> dimensions;

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<DimensionsItem> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(List<DimensionsItem> dimensions) {
			this.dimensions = dimensions;
		}

		public static class DimensionsItem {

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

	public static class NodeMetricsItem {

		private Long endTime;

		private Long startTime;

		private String type;

		private List<TagsItem3> tags1;

		private List<ValuesItem4> values2;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<TagsItem3> getTags1() {
			return this.tags1;
		}

		public void setTags1(List<TagsItem3> tags1) {
			this.tags1 = tags1;
		}

		public List<ValuesItem4> getValues2() {
			return this.values2;
		}

		public void setValues2(List<ValuesItem4> values2) {
			this.values2 = values2;
		}

		public static class TagsItem3 {

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

		public static class ValuesItem4 {

			private Long timestamp;

			private List<ValueItem6> value5;

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public List<ValueItem6> getValue5() {
				return this.value5;
			}

			public void setValue5(List<ValueItem6> value5) {
				this.value5 = value5;
			}

			public static class ValueItem6 {

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
	}

	@Override
	public DescribeDSTTopologyResponse getInstance(UnmarshallerContext context) {
		return	DescribeDSTTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
