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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowEdgesByConditionResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowEdgesByConditionResponse.Edge;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskFlowEdgesByConditionResponseUnmarshaller {

	public static ListTaskFlowEdgesByConditionResponse unmarshall(ListTaskFlowEdgesByConditionResponse listTaskFlowEdgesByConditionResponse, UnmarshallerContext _ctx) {
		
		listTaskFlowEdgesByConditionResponse.setRequestId(_ctx.stringValue("ListTaskFlowEdgesByConditionResponse.RequestId"));
		listTaskFlowEdgesByConditionResponse.setErrorCode(_ctx.stringValue("ListTaskFlowEdgesByConditionResponse.ErrorCode"));
		listTaskFlowEdgesByConditionResponse.setErrorMessage(_ctx.stringValue("ListTaskFlowEdgesByConditionResponse.ErrorMessage"));
		listTaskFlowEdgesByConditionResponse.setSuccess(_ctx.booleanValue("ListTaskFlowEdgesByConditionResponse.Success"));

		List<Edge> edges = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskFlowEdgesByConditionResponse.Edges.Length"); i++) {
			Edge edge = new Edge();
			edge.setId(_ctx.longValue("ListTaskFlowEdgesByConditionResponse.Edges["+ i +"].Id"));
			edge.setNodeEnd(_ctx.longValue("ListTaskFlowEdgesByConditionResponse.Edges["+ i +"].NodeEnd"));
			edge.setNodeFrom(_ctx.longValue("ListTaskFlowEdgesByConditionResponse.Edges["+ i +"].NodeFrom"));

			edges.add(edge);
		}
		listTaskFlowEdgesByConditionResponse.setEdges(edges);
	 
	 	return listTaskFlowEdgesByConditionResponse;
	}
}