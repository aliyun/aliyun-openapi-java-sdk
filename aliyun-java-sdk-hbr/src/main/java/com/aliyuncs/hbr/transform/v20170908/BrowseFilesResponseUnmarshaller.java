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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.BrowseFilesResponse;
import com.aliyuncs.hbr.model.v20170908.BrowseFilesResponse.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class BrowseFilesResponseUnmarshaller {

	public static BrowseFilesResponse unmarshall(BrowseFilesResponse browseFilesResponse, UnmarshallerContext _ctx) {
		
		browseFilesResponse.setRequestId(_ctx.stringValue("BrowseFilesResponse.RequestId"));
		browseFilesResponse.setSuccess(_ctx.booleanValue("BrowseFilesResponse.Success"));
		browseFilesResponse.setCode(_ctx.stringValue("BrowseFilesResponse.Code"));
		browseFilesResponse.setMessage(_ctx.stringValue("BrowseFilesResponse.Message"));
		browseFilesResponse.setTotalCount(_ctx.integerValue("BrowseFilesResponse.TotalCount"));
		browseFilesResponse.setPageSize(_ctx.integerValue("BrowseFilesResponse.PageSize"));
		browseFilesResponse.setPageNumber(_ctx.integerValue("BrowseFilesResponse.PageNumber"));

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("BrowseFilesResponse.Nodes.Length"); i++) {
			Node node = new Node();
			node.setName(_ctx.stringValue("BrowseFilesResponse.Nodes["+ i +"].Name"));
			node.setType(_ctx.stringValue("BrowseFilesResponse.Nodes["+ i +"].Type"));
			node.setSubtree(_ctx.stringValue("BrowseFilesResponse.Nodes["+ i +"].Subtree"));
			node.setSize(_ctx.longValue("BrowseFilesResponse.Nodes["+ i +"].Size"));

			nodes.add(node);
		}
		browseFilesResponse.setNodes(nodes);
	 
	 	return browseFilesResponse;
	}
}