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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ExecKgGremlinResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgGremlinResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgGremlinResponse.Data.Edge;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgGremlinResponse.Data.Edge.Propertie2;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgGremlinResponse.Data.Node;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgGremlinResponse.Data.Node.Propertie;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgGremlinResponse.Data.Row;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgGremlinResponse.Data.Row.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecKgGremlinResponseUnmarshaller {

	public static ExecKgGremlinResponse unmarshall(ExecKgGremlinResponse execKgGremlinResponse, UnmarshallerContext _ctx) {
		
		execKgGremlinResponse.setRequestId(_ctx.stringValue("ExecKgGremlinResponse.RequestId"));
		execKgGremlinResponse.setMessage(_ctx.stringValue("ExecKgGremlinResponse.Message"));
		execKgGremlinResponse.setHttpStatusCode(_ctx.integerValue("ExecKgGremlinResponse.HttpStatusCode"));
		execKgGremlinResponse.setCode(_ctx.stringValue("ExecKgGremlinResponse.Code"));
		execKgGremlinResponse.setSuccess(_ctx.booleanValue("ExecKgGremlinResponse.Success"));

		Data data = new Data();
		data.setExecQuery(_ctx.stringValue("ExecKgGremlinResponse.Data.ExecQuery"));

		List<Row> rowList = new ArrayList<Row>();
		for (int i = 0; i < _ctx.lengthValue("ExecKgGremlinResponse.Data.RowList.Length"); i++) {
			Row row = new Row();

			List<Column> columns = new ArrayList<Column>();
			for (int j = 0; j < _ctx.lengthValue("ExecKgGremlinResponse.Data.RowList["+ i +"].Columns.Length"); j++) {
				Column column = new Column();
				column.setValue(_ctx.stringValue("ExecKgGremlinResponse.Data.RowList["+ i +"].Columns["+ j +"].Value"));
				column.setCode(_ctx.stringValue("ExecKgGremlinResponse.Data.RowList["+ i +"].Columns["+ j +"].Code"));

				columns.add(column);
			}
			row.setColumns(columns);

			rowList.add(row);
		}
		data.setRowList(rowList);

		List<Node> nodeList = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("ExecKgGremlinResponse.Data.NodeList.Length"); i++) {
			Node node = new Node();
			node.setEntityType(_ctx.stringValue("ExecKgGremlinResponse.Data.NodeList["+ i +"].EntityType"));
			node.setDataId(_ctx.stringValue("ExecKgGremlinResponse.Data.NodeList["+ i +"].DataId"));

			List<Propertie> properties = new ArrayList<Propertie>();
			for (int j = 0; j < _ctx.lengthValue("ExecKgGremlinResponse.Data.NodeList["+ i +"].Properties.Length"); j++) {
				Propertie propertie = new Propertie();
				propertie.setValue(_ctx.stringValue("ExecKgGremlinResponse.Data.NodeList["+ i +"].Properties["+ j +"].Value"));
				propertie.setCode(_ctx.stringValue("ExecKgGremlinResponse.Data.NodeList["+ i +"].Properties["+ j +"].Code"));

				properties.add(propertie);
			}
			node.setProperties(properties);

			nodeList.add(node);
		}
		data.setNodeList(nodeList);

		List<Edge> edgeList = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("ExecKgGremlinResponse.Data.EdgeList.Length"); i++) {
			Edge edge = new Edge();
			edge.setTargetEntityType(_ctx.stringValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].TargetEntityType"));
			edge.setDataId(_ctx.stringValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].DataId"));
			edge.setSourceEntityType(_ctx.stringValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].SourceEntityType"));
			edge.setRelationType(_ctx.stringValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].RelationType"));
			edge.setSourceEntityDataId(_ctx.stringValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].SourceEntityDataId"));
			edge.setTargetEntityDataId(_ctx.stringValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].TargetEntityDataId"));

			List<Propertie2> properties1 = new ArrayList<Propertie2>();
			for (int j = 0; j < _ctx.lengthValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].Properties.Length"); j++) {
				Propertie2 propertie2 = new Propertie2();
				propertie2.setValue(_ctx.stringValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].Properties["+ j +"].Value"));
				propertie2.setCode(_ctx.stringValue("ExecKgGremlinResponse.Data.EdgeList["+ i +"].Properties["+ j +"].Code"));

				properties1.add(propertie2);
			}
			edge.setProperties1(properties1);

			edgeList.add(edge);
		}
		data.setEdgeList(edgeList);
		execKgGremlinResponse.setData(data);
	 
	 	return execKgGremlinResponse;
	}
}