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

import com.aliyuncs.dataphin_public.model.v20230630.ListNodeDownStreamResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListNodeDownStreamResponse.NodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeDownStreamResponseUnmarshaller {

	public static ListNodeDownStreamResponse unmarshall(ListNodeDownStreamResponse listNodeDownStreamResponse, UnmarshallerContext _ctx) {
		
		listNodeDownStreamResponse.setRequestId(_ctx.stringValue("ListNodeDownStreamResponse.RequestId"));
		listNodeDownStreamResponse.setSuccess(_ctx.booleanValue("ListNodeDownStreamResponse.Success"));
		listNodeDownStreamResponse.setHttpStatusCode(_ctx.integerValue("ListNodeDownStreamResponse.HttpStatusCode"));
		listNodeDownStreamResponse.setCode(_ctx.stringValue("ListNodeDownStreamResponse.Code"));
		listNodeDownStreamResponse.setMessage(_ctx.stringValue("ListNodeDownStreamResponse.Message"));

		List<NodeInfo> nodeInfoList = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeDownStreamResponse.NodeInfoList.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(_ctx.stringValue("ListNodeDownStreamResponse.NodeInfoList["+ i +"].Id"));
			nodeInfo.setName(_ctx.stringValue("ListNodeDownStreamResponse.NodeInfoList["+ i +"].Name"));
			nodeInfo.setType(_ctx.stringValue("ListNodeDownStreamResponse.NodeInfoList["+ i +"].Type"));
			nodeInfo.setDepth(_ctx.integerValue("ListNodeDownStreamResponse.NodeInfoList["+ i +"].Depth"));

			List<String> fieldIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNodeDownStreamResponse.NodeInfoList["+ i +"].FieldIdList.Length"); j++) {
				fieldIdList.add(_ctx.stringValue("ListNodeDownStreamResponse.NodeInfoList["+ i +"].FieldIdList["+ j +"]"));
			}
			nodeInfo.setFieldIdList(fieldIdList);

			nodeInfoList.add(nodeInfo);
		}
		listNodeDownStreamResponse.setNodeInfoList(nodeInfoList);
	 
	 	return listNodeDownStreamResponse;
	}
}