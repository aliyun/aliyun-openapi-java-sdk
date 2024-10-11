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

import com.aliyuncs.dataphin_public.model.v20230630.GetNodeUpDownStreamResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetNodeUpDownStreamResponse.NodeDagInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetNodeUpDownStreamResponse.NodeDagInfo.NodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeUpDownStreamResponseUnmarshaller {

	public static GetNodeUpDownStreamResponse unmarshall(GetNodeUpDownStreamResponse getNodeUpDownStreamResponse, UnmarshallerContext _ctx) {
		
		getNodeUpDownStreamResponse.setRequestId(_ctx.stringValue("GetNodeUpDownStreamResponse.RequestId"));
		getNodeUpDownStreamResponse.setSuccess(_ctx.booleanValue("GetNodeUpDownStreamResponse.Success"));
		getNodeUpDownStreamResponse.setHttpStatusCode(_ctx.integerValue("GetNodeUpDownStreamResponse.HttpStatusCode"));
		getNodeUpDownStreamResponse.setCode(_ctx.stringValue("GetNodeUpDownStreamResponse.Code"));
		getNodeUpDownStreamResponse.setMessage(_ctx.stringValue("GetNodeUpDownStreamResponse.Message"));

		NodeDagInfo nodeDagInfo = new NodeDagInfo();

		List<NodeInfo> startNodeList = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeUpDownStreamResponse.NodeDagInfo.StartNodeList.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.StartNodeList["+ i +"].Id"));
			nodeInfo.setName(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.StartNodeList["+ i +"].Name"));
			nodeInfo.setType(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.StartNodeList["+ i +"].Type"));

			List<String> fieldIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetNodeUpDownStreamResponse.NodeDagInfo.StartNodeList["+ i +"].FieldIdList.Length"); j++) {
				fieldIdList.add(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.StartNodeList["+ i +"].FieldIdList["+ j +"]"));
			}
			nodeInfo.setFieldIdList(fieldIdList);

			startNodeList.add(nodeInfo);
		}
		nodeDagInfo.setStartNodeList(startNodeList);

		List<NodeInfo> upStreamNodeList = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeUpDownStreamResponse.NodeDagInfo.UpStreamNodeList.Length"); i++) {
			NodeInfo nodeInfo1 = new NodeInfo();
			nodeInfo1.setId(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.UpStreamNodeList["+ i +"].Id"));
			nodeInfo1.setName(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.UpStreamNodeList["+ i +"].Name"));
			nodeInfo1.setType(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.UpStreamNodeList["+ i +"].Type"));

			List<String> fieldIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetNodeUpDownStreamResponse.NodeDagInfo.UpStreamNodeList["+ i +"].FieldIdList.Length"); j++) {
				fieldIdList.add(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.UpStreamNodeList["+ i +"].FieldIdList["+ j +"]"));
			}
			nodeInfo1.setFieldIdList(fieldIdList);

			upStreamNodeList.add(nodeInfo1);
		}
		nodeDagInfo.setUpStreamNodeList(upStreamNodeList);

		List<NodeInfo> downStreamNodeList = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeUpDownStreamResponse.NodeDagInfo.DownStreamNodeList.Length"); i++) {
			NodeInfo nodeInfo2 = new NodeInfo();
			nodeInfo2.setId(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.DownStreamNodeList["+ i +"].Id"));
			nodeInfo2.setName(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.DownStreamNodeList["+ i +"].Name"));
			nodeInfo2.setType(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.DownStreamNodeList["+ i +"].Type"));

			List<String> fieldIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetNodeUpDownStreamResponse.NodeDagInfo.DownStreamNodeList["+ i +"].FieldIdList.Length"); j++) {
				fieldIdList.add(_ctx.stringValue("GetNodeUpDownStreamResponse.NodeDagInfo.DownStreamNodeList["+ i +"].FieldIdList["+ j +"]"));
			}
			nodeInfo2.setFieldIdList(fieldIdList);

			downStreamNodeList.add(nodeInfo2);
		}
		nodeDagInfo.setDownStreamNodeList(downStreamNodeList);
		getNodeUpDownStreamResponse.setNodeDagInfo(nodeDagInfo);
	 
	 	return getNodeUpDownStreamResponse;
	}
}