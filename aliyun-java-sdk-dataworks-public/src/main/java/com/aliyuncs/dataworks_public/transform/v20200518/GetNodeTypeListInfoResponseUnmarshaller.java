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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetNodeTypeListInfoResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetNodeTypeListInfoResponse.NodeTypeInfoList;
import com.aliyuncs.dataworks_public.model.v20200518.GetNodeTypeListInfoResponse.NodeTypeInfoList.NodeTypeInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeTypeListInfoResponseUnmarshaller {

	public static GetNodeTypeListInfoResponse unmarshall(GetNodeTypeListInfoResponse getNodeTypeListInfoResponse, UnmarshallerContext _ctx) {
		
		getNodeTypeListInfoResponse.setRequestId(_ctx.stringValue("GetNodeTypeListInfoResponse.RequestId"));

		NodeTypeInfoList nodeTypeInfoList = new NodeTypeInfoList();
		nodeTypeInfoList.setPageNumber(_ctx.integerValue("GetNodeTypeListInfoResponse.NodeTypeInfoList.PageNumber"));
		nodeTypeInfoList.setPageSize(_ctx.integerValue("GetNodeTypeListInfoResponse.NodeTypeInfoList.PageSize"));
		nodeTypeInfoList.setTotalCount(_ctx.integerValue("GetNodeTypeListInfoResponse.NodeTypeInfoList.TotalCount"));

		List<NodeTypeInfoItem> nodeTypeInfo = new ArrayList<NodeTypeInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeTypeListInfoResponse.NodeTypeInfoList.NodeTypeInfo.Length"); i++) {
			NodeTypeInfoItem nodeTypeInfoItem = new NodeTypeInfoItem();
			nodeTypeInfoItem.setNodeTypeName(_ctx.stringValue("GetNodeTypeListInfoResponse.NodeTypeInfoList.NodeTypeInfo["+ i +"].NodeTypeName"));
			nodeTypeInfoItem.setNodeType(_ctx.integerValue("GetNodeTypeListInfoResponse.NodeTypeInfoList.NodeTypeInfo["+ i +"].NodeType"));

			nodeTypeInfo.add(nodeTypeInfoItem);
		}
		nodeTypeInfoList.setNodeTypeInfo(nodeTypeInfo);
		getNodeTypeListInfoResponse.setNodeTypeInfoList(nodeTypeInfoList);
	 
	 	return getNodeTypeListInfoResponse;
	}
}