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

import com.aliyuncs.dataworks_public.model.v20200518.ListFileTypeResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListFileTypeResponse.NodeTypeInfoList;
import com.aliyuncs.dataworks_public.model.v20200518.ListFileTypeResponse.NodeTypeInfoList.NodeTypeInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFileTypeResponseUnmarshaller {

	public static ListFileTypeResponse unmarshall(ListFileTypeResponse listFileTypeResponse, UnmarshallerContext _ctx) {
		
		listFileTypeResponse.setRequestId(_ctx.stringValue("ListFileTypeResponse.RequestId"));

		NodeTypeInfoList nodeTypeInfoList = new NodeTypeInfoList();
		nodeTypeInfoList.setPageNumber(_ctx.integerValue("ListFileTypeResponse.NodeTypeInfoList.PageNumber"));
		nodeTypeInfoList.setPageSize(_ctx.integerValue("ListFileTypeResponse.NodeTypeInfoList.PageSize"));
		nodeTypeInfoList.setTotalCount(_ctx.integerValue("ListFileTypeResponse.NodeTypeInfoList.TotalCount"));

		List<NodeTypeInfoItem> nodeTypeInfo = new ArrayList<NodeTypeInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFileTypeResponse.NodeTypeInfoList.NodeTypeInfo.Length"); i++) {
			NodeTypeInfoItem nodeTypeInfoItem = new NodeTypeInfoItem();
			nodeTypeInfoItem.setNodeType(_ctx.integerValue("ListFileTypeResponse.NodeTypeInfoList.NodeTypeInfo["+ i +"].NodeType"));
			nodeTypeInfoItem.setNodeTypeName(_ctx.stringValue("ListFileTypeResponse.NodeTypeInfoList.NodeTypeInfo["+ i +"].NodeTypeName"));

			nodeTypeInfo.add(nodeTypeInfoItem);
		}
		nodeTypeInfoList.setNodeTypeInfo(nodeTypeInfo);
		listFileTypeResponse.setNodeTypeInfoList(nodeTypeInfoList);
	 
	 	return listFileTypeResponse;
	}
}