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

import com.aliyuncs.sofa.model.v20190815.GetDTXTransactionChartResponse;
import com.aliyuncs.sofa.model.v20190815.GetDTXTransactionChartResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDTXTransactionChartResponse.Data.EdgesItem;
import com.aliyuncs.sofa.model.v20190815.GetDTXTransactionChartResponse.Data.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDTXTransactionChartResponseUnmarshaller {

	public static GetDTXTransactionChartResponse unmarshall(GetDTXTransactionChartResponse getDTXTransactionChartResponse, UnmarshallerContext _ctx) {
		
		getDTXTransactionChartResponse.setRequestId(_ctx.stringValue("GetDTXTransactionChartResponse.RequestId"));
		getDTXTransactionChartResponse.setResultCode(_ctx.stringValue("GetDTXTransactionChartResponse.ResultCode"));
		getDTXTransactionChartResponse.setResultMessage(_ctx.stringValue("GetDTXTransactionChartResponse.ResultMessage"));
		getDTXTransactionChartResponse.setSuccess(_ctx.booleanValue("GetDTXTransactionChartResponse.Success"));

		Data data = new Data();
		data.setBizId(_ctx.stringValue("GetDTXTransactionChartResponse.Data.BizId"));
		data.setBizType(_ctx.stringValue("GetDTXTransactionChartResponse.Data.BizType"));
		data.setCost(_ctx.longValue("GetDTXTransactionChartResponse.Data.Cost"));
		data.setEndTime(_ctx.stringValue("GetDTXTransactionChartResponse.Data.EndTime"));
		data.setLastHandleTime(_ctx.stringValue("GetDTXTransactionChartResponse.Data.LastHandleTime"));
		data.setLowerLineCount(_ctx.longValue("GetDTXTransactionChartResponse.Data.LowerLineCount"));
		data.setParticipatorNum(_ctx.longValue("GetDTXTransactionChartResponse.Data.ParticipatorNum"));
		data.setStarterIp(_ctx.stringValue("GetDTXTransactionChartResponse.Data.StarterIp"));
		data.setStarterName(_ctx.stringValue("GetDTXTransactionChartResponse.Data.StarterName"));
		data.setStartTime(_ctx.stringValue("GetDTXTransactionChartResponse.Data.StartTime"));
		data.setState(_ctx.stringValue("GetDTXTransactionChartResponse.Data.State"));
		data.setTxId(_ctx.stringValue("GetDTXTransactionChartResponse.Data.TxId"));
		data.setUpperLineCount(_ctx.longValue("GetDTXTransactionChartResponse.Data.UpperLineCount"));

		List<EdgesItem> edges = new ArrayList<EdgesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDTXTransactionChartResponse.Data.Edges.Length"); i++) {
			EdgesItem edgesItem = new EdgesItem();
			edgesItem.setContent(_ctx.stringValue("GetDTXTransactionChartResponse.Data.Edges["+ i +"].Content"));
			edgesItem.setErrorMessage(_ctx.stringValue("GetDTXTransactionChartResponse.Data.Edges["+ i +"].ErrorMessage"));
			edgesItem.setId(_ctx.longValue("GetDTXTransactionChartResponse.Data.Edges["+ i +"].Id"));
			edgesItem.setIsError(_ctx.booleanValue("GetDTXTransactionChartResponse.Data.Edges["+ i +"].IsError"));
			edgesItem.setSource(_ctx.longValue("GetDTXTransactionChartResponse.Data.Edges["+ i +"].Source"));
			edgesItem.setTarget(_ctx.longValue("GetDTXTransactionChartResponse.Data.Edges["+ i +"].Target"));
			edgesItem.setType(_ctx.stringValue("GetDTXTransactionChartResponse.Data.Edges["+ i +"].Type"));

			edges.add(edgesItem);
		}
		data.setEdges(edges);

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDTXTransactionChartResponse.Data.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setEndTime(_ctx.stringValue("GetDTXTransactionChartResponse.Data.Nodes["+ i +"].EndTime"));
			nodesItem.setId(_ctx.longValue("GetDTXTransactionChartResponse.Data.Nodes["+ i +"].Id"));
			nodesItem.setIsEnd(_ctx.booleanValue("GetDTXTransactionChartResponse.Data.Nodes["+ i +"].IsEnd"));
			nodesItem.setLabel(_ctx.stringValue("GetDTXTransactionChartResponse.Data.Nodes["+ i +"].Label"));
			nodesItem.setName(_ctx.stringValue("GetDTXTransactionChartResponse.Data.Nodes["+ i +"].Name"));
			nodesItem.setRole(_ctx.stringValue("GetDTXTransactionChartResponse.Data.Nodes["+ i +"].Role"));
			nodesItem.setStartTime(_ctx.stringValue("GetDTXTransactionChartResponse.Data.Nodes["+ i +"].StartTime"));

			nodes.add(nodesItem);
		}
		data.setNodes(nodes);
		getDTXTransactionChartResponse.setData(data);
	 
	 	return getDTXTransactionChartResponse;
	}
}