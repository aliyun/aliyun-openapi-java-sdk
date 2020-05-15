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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.EdgeMetricsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.EdgeMetricsItem.TagsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.EdgeMetricsItem.ValuesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.EdgeMetricsItem.ValuesItem.ValueItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.EdgesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.NodeMetricsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.NodeMetricsItem.TagsItem3;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.NodeMetricsItem.ValuesItem4;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.NodeMetricsItem.ValuesItem4.ValueItem6;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.NodesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTopologyResponse.NodesItem.DimensionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDSTTopologyResponseUnmarshaller {

	public static DescribeDSTTopologyResponse unmarshall(DescribeDSTTopologyResponse describeDSTTopologyResponse, UnmarshallerContext _ctx) {
		
		describeDSTTopologyResponse.setRequestId(_ctx.stringValue("DescribeDSTTopologyResponse.RequestId"));
		describeDSTTopologyResponse.setResultCode(_ctx.stringValue("DescribeDSTTopologyResponse.ResultCode"));
		describeDSTTopologyResponse.setResultMessage(_ctx.stringValue("DescribeDSTTopologyResponse.ResultMessage"));

		List<EdgesItem> edges = new ArrayList<EdgesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDSTTopologyResponse.Edges.Length"); i++) {
			EdgesItem edgesItem = new EdgesItem();
			edgesItem.setId(_ctx.stringValue("DescribeDSTTopologyResponse.Edges["+ i +"].Id"));
			edgesItem.setSource(_ctx.stringValue("DescribeDSTTopologyResponse.Edges["+ i +"].Source"));
			edgesItem.setTarget(_ctx.stringValue("DescribeDSTTopologyResponse.Edges["+ i +"].Target"));

			edges.add(edgesItem);
		}
		describeDSTTopologyResponse.setEdges(edges);

		List<EdgeMetricsItem> edgeMetrics = new ArrayList<EdgeMetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDSTTopologyResponse.EdgeMetrics.Length"); i++) {
			EdgeMetricsItem edgeMetricsItem = new EdgeMetricsItem();
			edgeMetricsItem.setEndTime(_ctx.longValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].EndTime"));
			edgeMetricsItem.setStartTime(_ctx.longValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].StartTime"));
			edgeMetricsItem.setType(_ctx.stringValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Type"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			edgeMetricsItem.setTags(tags);

			List<ValuesItem> values = new ArrayList<ValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Values.Length"); j++) {
				ValuesItem valuesItem = new ValuesItem();
				valuesItem.setTimestamp(_ctx.longValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Values["+ j +"].Timestamp"));

				List<ValueItem> value = new ArrayList<ValueItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Values["+ j +"].Value.Length"); k++) {
					ValueItem valueItem = new ValueItem();
					valueItem.setKey(_ctx.stringValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Values["+ j +"].Value["+ k +"].Key"));
					valueItem.setValue(_ctx.stringValue("DescribeDSTTopologyResponse.EdgeMetrics["+ i +"].Values["+ j +"].Value["+ k +"].Value"));

					value.add(valueItem);
				}
				valuesItem.setValue(value);

				values.add(valuesItem);
			}
			edgeMetricsItem.setValues(values);

			edgeMetrics.add(edgeMetricsItem);
		}
		describeDSTTopologyResponse.setEdgeMetrics(edgeMetrics);

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDSTTopologyResponse.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setApp(_ctx.stringValue("DescribeDSTTopologyResponse.Nodes["+ i +"].App"));
			nodesItem.setId(_ctx.stringValue("DescribeDSTTopologyResponse.Nodes["+ i +"].Id"));
			nodesItem.setType(_ctx.stringValue("DescribeDSTTopologyResponse.Nodes["+ i +"].Type"));

			List<DimensionsItem> dimensions = new ArrayList<DimensionsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDSTTopologyResponse.Nodes["+ i +"].Dimensions.Length"); j++) {
				DimensionsItem dimensionsItem = new DimensionsItem();
				dimensionsItem.setKey(_ctx.stringValue("DescribeDSTTopologyResponse.Nodes["+ i +"].Dimensions["+ j +"].Key"));
				dimensionsItem.setValue(_ctx.stringValue("DescribeDSTTopologyResponse.Nodes["+ i +"].Dimensions["+ j +"].Value"));

				dimensions.add(dimensionsItem);
			}
			nodesItem.setDimensions(dimensions);

			nodes.add(nodesItem);
		}
		describeDSTTopologyResponse.setNodes(nodes);

		List<NodeMetricsItem> nodeMetrics = new ArrayList<NodeMetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDSTTopologyResponse.NodeMetrics.Length"); i++) {
			NodeMetricsItem nodeMetricsItem = new NodeMetricsItem();
			nodeMetricsItem.setEndTime(_ctx.longValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].EndTime"));
			nodeMetricsItem.setStartTime(_ctx.longValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].StartTime"));
			nodeMetricsItem.setType(_ctx.stringValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Type"));

			List<TagsItem3> tags1 = new ArrayList<TagsItem3>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Tags.Length"); j++) {
				TagsItem3 tagsItem3 = new TagsItem3();
				tagsItem3.setKey(_ctx.stringValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Tags["+ j +"].Key"));
				tagsItem3.setValue(_ctx.stringValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Tags["+ j +"].Value"));

				tags1.add(tagsItem3);
			}
			nodeMetricsItem.setTags1(tags1);

			List<ValuesItem4> values2 = new ArrayList<ValuesItem4>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Values.Length"); j++) {
				ValuesItem4 valuesItem4 = new ValuesItem4();
				valuesItem4.setTimestamp(_ctx.longValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Values["+ j +"].Timestamp"));

				List<ValueItem6> value5 = new ArrayList<ValueItem6>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Values["+ j +"].Value.Length"); k++) {
					ValueItem6 valueItem6 = new ValueItem6();
					valueItem6.setKey(_ctx.stringValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Values["+ j +"].Value["+ k +"].Key"));
					valueItem6.setValue(_ctx.stringValue("DescribeDSTTopologyResponse.NodeMetrics["+ i +"].Values["+ j +"].Value["+ k +"].Value"));

					value5.add(valueItem6);
				}
				valuesItem4.setValue5(value5);

				values2.add(valuesItem4);
			}
			nodeMetricsItem.setValues2(values2);

			nodeMetrics.add(nodeMetricsItem);
		}
		describeDSTTopologyResponse.setNodeMetrics(nodeMetrics);
	 
	 	return describeDSTTopologyResponse;
	}
}