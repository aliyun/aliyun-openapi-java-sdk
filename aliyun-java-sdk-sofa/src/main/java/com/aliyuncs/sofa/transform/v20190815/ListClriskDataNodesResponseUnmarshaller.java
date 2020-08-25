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

import com.aliyuncs.sofa.model.v20190815.ListClriskDataNodesResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskDataNodesResponse.DataNodeInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskDataNodesResponseUnmarshaller {

	public static ListClriskDataNodesResponse unmarshall(ListClriskDataNodesResponse listClriskDataNodesResponse, UnmarshallerContext _ctx) {
		
		listClriskDataNodesResponse.setRequestId(_ctx.stringValue("ListClriskDataNodesResponse.RequestId"));
		listClriskDataNodesResponse.setResultCode(_ctx.stringValue("ListClriskDataNodesResponse.ResultCode"));
		listClriskDataNodesResponse.setResultMessage(_ctx.stringValue("ListClriskDataNodesResponse.ResultMessage"));
		listClriskDataNodesResponse.setPageCount(_ctx.longValue("ListClriskDataNodesResponse.PageCount"));
		listClriskDataNodesResponse.setPageNumber(_ctx.longValue("ListClriskDataNodesResponse.PageNumber"));
		listClriskDataNodesResponse.setPageSize(_ctx.longValue("ListClriskDataNodesResponse.PageSize"));
		listClriskDataNodesResponse.setTotalCount(_ctx.longValue("ListClriskDataNodesResponse.TotalCount"));

		List<DataNodeInfosItem> dataNodeInfos = new ArrayList<DataNodeInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskDataNodesResponse.DataNodeInfos.Length"); i++) {
			DataNodeInfosItem dataNodeInfosItem = new DataNodeInfosItem();
			dataNodeInfosItem.setDataNodeCode(_ctx.stringValue("ListClriskDataNodesResponse.DataNodeInfos["+ i +"].DataNodeCode"));
			dataNodeInfosItem.setDescription(_ctx.stringValue("ListClriskDataNodesResponse.DataNodeInfos["+ i +"].Description"));
			dataNodeInfosItem.setId(_ctx.stringValue("ListClriskDataNodesResponse.DataNodeInfos["+ i +"].Id"));
			dataNodeInfosItem.setName(_ctx.stringValue("ListClriskDataNodesResponse.DataNodeInfos["+ i +"].Name"));
			dataNodeInfosItem.setRelatedEntranceCount(_ctx.longValue("ListClriskDataNodesResponse.DataNodeInfos["+ i +"].RelatedEntranceCount"));
			dataNodeInfosItem.setUpdateTime(_ctx.stringValue("ListClriskDataNodesResponse.DataNodeInfos["+ i +"].UpdateTime"));

			dataNodeInfos.add(dataNodeInfosItem);
		}
		listClriskDataNodesResponse.setDataNodeInfos(dataNodeInfos);
	 
	 	return listClriskDataNodesResponse;
	}
}