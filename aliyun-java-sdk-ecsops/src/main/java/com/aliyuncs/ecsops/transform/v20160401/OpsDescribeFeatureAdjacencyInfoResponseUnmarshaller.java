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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFeatureAdjacencyInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdge;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdge.VertexFrom;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdge.VertexTo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeFeatureAdjacencyInfoResponseUnmarshaller {

	public static OpsDescribeFeatureAdjacencyInfoResponse unmarshall(OpsDescribeFeatureAdjacencyInfoResponse opsDescribeFeatureAdjacencyInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeFeatureAdjacencyInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.RequestId"));
		opsDescribeFeatureAdjacencyInfoResponse.setTotalCount(_ctx.integerValue("OpsDescribeFeatureAdjacencyInfoResponse.TotalCount"));
		opsDescribeFeatureAdjacencyInfoResponse.setPageSize(_ctx.integerValue("OpsDescribeFeatureAdjacencyInfoResponse.PageSize"));
		opsDescribeFeatureAdjacencyInfoResponse.setPageNo(_ctx.integerValue("OpsDescribeFeatureAdjacencyInfoResponse.PageNo"));
		opsDescribeFeatureAdjacencyInfoResponse.setCount(_ctx.integerValue("OpsDescribeFeatureAdjacencyInfoResponse.Count"));

		List<FeatureEdge> featureEdges = new ArrayList<FeatureEdge>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges.Length"); i++) {
			FeatureEdge featureEdge = new FeatureEdge();
			featureEdge.setLogicalCorrelation(_ctx.floatValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].LogicalCorrelation"));
			featureEdge.setCorrelationByHuman(_ctx.floatValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].CorrelationByHuman"));
			featureEdge.setId(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].Id"));
			featureEdge.setProblemClassification(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].ProblemClassification"));

			VertexFrom vertexFrom = new VertexFrom();
			vertexFrom.setSeverityLevel(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.SeverityLevel"));
			vertexFrom.setDetailDocId(_ctx.longValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.DetailDocId"));
			vertexFrom.setFeatureType(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.FeatureType"));
			vertexFrom.setFeatureTargetType(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.FeatureTargetType"));
			vertexFrom.setDeleted(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.Deleted"));
			vertexFrom.setReason(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.Reason"));
			vertexFrom.setId(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.Id"));
			vertexFrom.setExecRule(_ctx.booleanValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.ExecRule"));
			vertexFrom.setShortDesc(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexFrom.ShortDesc"));
			featureEdge.setVertexFrom(vertexFrom);

			VertexTo vertexTo = new VertexTo();
			vertexTo.setSeverityLevel(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.SeverityLevel"));
			vertexTo.setDetailDocId(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.DetailDocId"));
			vertexTo.setFeatureType(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.FeatureType"));
			vertexTo.setFeatureTargetType(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.FeatureTargetType"));
			vertexTo.setDeleted(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.Deleted"));
			vertexTo.setReason(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.Reason"));
			vertexTo.setId(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.Id"));
			vertexTo.setExecRule(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.ExecRule"));
			vertexTo.setShortDesc(_ctx.stringValue("OpsDescribeFeatureAdjacencyInfoResponse.FeatureEdges["+ i +"].VertexTo.ShortDesc"));
			featureEdge.setVertexTo(vertexTo);

			featureEdges.add(featureEdge);
		}
		opsDescribeFeatureAdjacencyInfoResponse.setFeatureEdges(featureEdges);
	 
	 	return opsDescribeFeatureAdjacencyInfoResponse;
	}
}