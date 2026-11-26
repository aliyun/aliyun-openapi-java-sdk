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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListAINodePoolsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListAINodePoolsResponse.AINodePoolInfosItem;
import com.aliyuncs.gpdb.model.v20160503.ListAINodePoolsResponse.AINodePoolInfosItem.AINodeInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAINodePoolsResponseUnmarshaller {

	public static ListAINodePoolsResponse unmarshall(ListAINodePoolsResponse listAINodePoolsResponse, UnmarshallerContext _ctx) {
		
		listAINodePoolsResponse.setRequestId(_ctx.stringValue("ListAINodePoolsResponse.RequestId"));

		List<AINodePoolInfosItem> aINodePoolInfos = new ArrayList<AINodePoolInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAINodePoolsResponse.AINodePoolInfos.Length"); i++) {
			AINodePoolInfosItem aINodePoolInfosItem = new AINodePoolInfosItem();
			aINodePoolInfosItem.setNodeNum(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].NodeNum"));
			aINodePoolInfosItem.setAINodePoolId(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodePoolId"));

			List<AINodeInfosItem> aINodeInfos = new ArrayList<AINodeInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos.Length"); j++) {
				AINodeInfosItem aINodeInfosItem = new AINodeInfosItem();
				aINodeInfosItem.setZoneId(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos["+ j +"].ZoneId"));
				aINodeInfosItem.setNodeName(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos["+ j +"].NodeName"));
				aINodeInfosItem.setNodeSpec(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos["+ j +"].NodeSpec"));
				aINodeInfosItem.setCreateTime(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos["+ j +"].CreateTime"));
				aINodeInfosItem.setUpdateTime(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos["+ j +"].UpdateTime"));
				aINodeInfosItem.setBindObject(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos["+ j +"].BindObject"));
				aINodeInfosItem.setBindStatus(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos["+ j +"].BindStatus"));
				aINodeInfosItem.setNamespace(_ctx.stringValue("ListAINodePoolsResponse.AINodePoolInfos["+ i +"].AINodeInfos["+ j +"].Namespace"));

				aINodeInfos.add(aINodeInfosItem);
			}
			aINodePoolInfosItem.setAINodeInfos(aINodeInfos);

			aINodePoolInfos.add(aINodePoolInfosItem);
		}
		listAINodePoolsResponse.setAINodePoolInfos(aINodePoolInfos);
	 
	 	return listAINodePoolsResponse;
	}
}