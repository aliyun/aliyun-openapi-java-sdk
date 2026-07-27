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

import com.aliyuncs.dataphin_public.model.v20230630.ExecKgCypherResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgCypherResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgCypherResponse.Data.Edge;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgCypherResponse.Data.Edge.Propertie2;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgCypherResponse.Data.Node;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgCypherResponse.Data.Node.Propertie;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgCypherResponse.Data.Row;
import com.aliyuncs.dataphin_public.model.v20230630.ExecKgCypherResponse.Data.Row.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecKgCypherResponseUnmarshaller {

	public static ExecKgCypherResponse unmarshall(ExecKgCypherResponse execKgCypherResponse, UnmarshallerContext _ctx) {
		
		execKgCypherResponse.setRequestId(_ctx.stringValue("ExecKgCypherResponse.RequestId"));
		execKgCypherResponse.setMessage(_ctx.stringValue("ExecKgCypherResponse.Message"));
		execKgCypherResponse.setHttpStatusCode(_ctx.integerValue("ExecKgCypherResponse.HttpStatusCode"));
		execKgCypherResponse.setCode(_ctx.stringValue("ExecKgCypherResponse.Code"));
		execKgCypherResponse.setSuccess(_ctx.booleanValue("ExecKgCypherResponse.Success"));

		Data data = new Data();
		data.setExecuteCypher(_ctx.stringValue("ExecKgCypherResponse.Data.ExecuteCypher"));

		List<Row> rowList = new ArrayList<Row>();
		for (int i = 0; i < _ctx.lengthValue("ExecKgCypherResponse.Data.RowList.Length"); i++) {
			Row row = new Row();

			List<Column> columns = new ArrayList<Column>();
			for (int j = 0; j < _ctx.lengthValue("ExecKgCypherResponse.Data.RowList["+ i +"].Columns.Length"); j++) {
				Column column = new Column();
				column.setValue(_ctx.stringValue("ExecKgCypherResponse.Data.RowList["+ i +"].Columns["+ j +"].Value"));
				column.setCode(_ctx.stringValue("ExecKgCypherResponse.Data.RowList["+ i +"].Columns["+ j +"].Code"));

				columns.add(column);
			}
			row.setColumns(columns);

			rowList.add(row);
		}
		data.setRowList(rowList);

		List<Node> nodeList = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("ExecKgCypherResponse.Data.NodeList.Length"); i++) {
			Node node = new Node();
			node.setEntityType(_ctx.stringValue("ExecKgCypherResponse.Data.NodeList["+ i +"].EntityType"));
			node.setDataId(_ctx.stringValue("ExecKgCypherResponse.Data.NodeList["+ i +"].DataId"));

			List<Propertie> properties = new ArrayList<Propertie>();
			for (int j = 0; j < _ctx.lengthValue("ExecKgCypherResponse.Data.NodeList["+ i +"].Properties.Length"); j++) {
				Propertie propertie = new Propertie();
				propertie.setValue(_ctx.stringValue("ExecKgCypherResponse.Data.NodeList["+ i +"].Properties["+ j +"].Value"));
				propertie.setCode(_ctx.stringValue("ExecKgCypherResponse.Data.NodeList["+ i +"].Properties["+ j +"].Code"));

				properties.add(propertie);
			}
			node.setProperties(properties);

			nodeList.add(node);
		}
		data.setNodeList(nodeList);

		List<Edge> edgeList = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("ExecKgCypherResponse.Data.EdgeList.Length"); i++) {
			Edge edge = new Edge();
			edge.setTargetEntityType(_ctx.stringValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].TargetEntityType"));
			edge.setDataId(_ctx.stringValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].DataId"));
			edge.setSourceEntityType(_ctx.stringValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].SourceEntityType"));
			edge.setRelationType(_ctx.stringValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].RelationType"));
			edge.setSourceEntityDataId(_ctx.stringValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].SourceEntityDataId"));
			edge.setTargetEntityDataId(_ctx.stringValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].TargetEntityDataId"));

			List<Propertie2> properties1 = new ArrayList<Propertie2>();
			for (int j = 0; j < _ctx.lengthValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].Properties.Length"); j++) {
				Propertie2 propertie2 = new Propertie2();
				propertie2.setValue(_ctx.stringValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].Properties["+ j +"].Value"));
				propertie2.setCode(_ctx.stringValue("ExecKgCypherResponse.Data.EdgeList["+ i +"].Properties["+ j +"].Code"));

				properties1.add(propertie2);
			}
			edge.setProperties1(properties1);

			edgeList.add(edge);
		}
		data.setEdgeList(edgeList);
		execKgCypherResponse.setData(data);
	 
	 	return execKgCypherResponse;
	}
}