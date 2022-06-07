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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.ListNodeInstanceTypeResponse;
import com.aliyuncs.appstream_center.model.v20210901.ListNodeInstanceTypeResponse.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeInstanceTypeResponseUnmarshaller {

	public static ListNodeInstanceTypeResponse unmarshall(ListNodeInstanceTypeResponse listNodeInstanceTypeResponse, UnmarshallerContext _ctx) {
		
		listNodeInstanceTypeResponse.setRequestId(_ctx.stringValue("ListNodeInstanceTypeResponse.RequestId"));
		listNodeInstanceTypeResponse.setTotalCount(_ctx.integerValue("ListNodeInstanceTypeResponse.TotalCount"));
		listNodeInstanceTypeResponse.setPageSize(_ctx.integerValue("ListNodeInstanceTypeResponse.PageSize"));
		listNodeInstanceTypeResponse.setPageNumber(_ctx.integerValue("ListNodeInstanceTypeResponse.PageNumber"));

		List<Node> nodeInstanceTypeModels = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeInstanceTypeResponse.NodeInstanceTypeModels.Length"); i++) {
			Node node = new Node();
			node.setNodeInstanceType(_ctx.stringValue("ListNodeInstanceTypeResponse.NodeInstanceTypeModels["+ i +"].NodeInstanceType"));
			node.setNodeInstanceTypeFamily(_ctx.stringValue("ListNodeInstanceTypeResponse.NodeInstanceTypeModels["+ i +"].NodeInstanceTypeFamily"));
			node.setCpu(_ctx.stringValue("ListNodeInstanceTypeResponse.NodeInstanceTypeModels["+ i +"].Cpu"));
			node.setGpu(_ctx.stringValue("ListNodeInstanceTypeResponse.NodeInstanceTypeModels["+ i +"].Gpu"));
			node.setMemory(_ctx.longValue("ListNodeInstanceTypeResponse.NodeInstanceTypeModels["+ i +"].Memory"));
			node.setSystemDiskSize(_ctx.longValue("ListNodeInstanceTypeResponse.NodeInstanceTypeModels["+ i +"].SystemDiskSize"));
			node.setDataDiskSize(_ctx.longValue("ListNodeInstanceTypeResponse.NodeInstanceTypeModels["+ i +"].DataDiskSize"));

			nodeInstanceTypeModels.add(node);
		}
		listNodeInstanceTypeResponse.setNodeInstanceTypeModels(nodeInstanceTypeModels);
	 
	 	return listNodeInstanceTypeResponse;
	}
}