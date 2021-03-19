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

import com.aliyuncs.sofa.model.v20190815.ListClriskDataNodeResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskDataNodeResponse.DataNodeInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskDataNodeResponseUnmarshaller {

	public static ListClriskDataNodeResponse unmarshall(ListClriskDataNodeResponse listClriskDataNodeResponse, UnmarshallerContext _ctx) {
		
		listClriskDataNodeResponse.setRequestId(_ctx.stringValue("ListClriskDataNodeResponse.RequestId"));
		listClriskDataNodeResponse.setResultCode(_ctx.stringValue("ListClriskDataNodeResponse.ResultCode"));
		listClriskDataNodeResponse.setResultMessage(_ctx.stringValue("ListClriskDataNodeResponse.ResultMessage"));
		listClriskDataNodeResponse.setPageCount(_ctx.longValue("ListClriskDataNodeResponse.PageCount"));
		listClriskDataNodeResponse.setPageNumber(_ctx.longValue("ListClriskDataNodeResponse.PageNumber"));
		listClriskDataNodeResponse.setPageSize(_ctx.longValue("ListClriskDataNodeResponse.PageSize"));
		listClriskDataNodeResponse.setTotalCount(_ctx.longValue("ListClriskDataNodeResponse.TotalCount"));

		List<DataNodeInfosItem> dataNodeInfos = new ArrayList<DataNodeInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskDataNodeResponse.DataNodeInfos.Length"); i++) {
			DataNodeInfosItem dataNodeInfosItem = new DataNodeInfosItem();
			dataNodeInfosItem.setDataNodeCode(_ctx.stringValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].DataNodeCode"));
			dataNodeInfosItem.setDescription(_ctx.stringValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].Description"));
			dataNodeInfosItem.setId(_ctx.stringValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].Id"));
			dataNodeInfosItem.setName(_ctx.stringValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].Name"));
			dataNodeInfosItem.setRelatedEntranceCount(_ctx.longValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].RelatedEntranceCount"));
			dataNodeInfosItem.setUpdateTime(_ctx.stringValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].UpdateTime"));
			dataNodeInfosItem.setCreator(_ctx.stringValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].Creator"));
			dataNodeInfosItem.setType(_ctx.stringValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].Type"));
			dataNodeInfosItem.setCheckField(_ctx.stringValue("ListClriskDataNodeResponse.DataNodeInfos["+ i +"].CheckField"));

			dataNodeInfos.add(dataNodeInfosItem);
		}
		listClriskDataNodeResponse.setDataNodeInfos(dataNodeInfos);
	 
	 	return listClriskDataNodeResponse;
	}
}