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

import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyNodeResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyNodeResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsTransparentProxyNodeResponseUnmarshaller {

	public static QueryMsTransparentProxyNodeResponse unmarshall(QueryMsTransparentProxyNodeResponse queryMsTransparentProxyNodeResponse, UnmarshallerContext _ctx) {
		
		queryMsTransparentProxyNodeResponse.setRequestId(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.RequestId"));
		queryMsTransparentProxyNodeResponse.setResultCode(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.ResultCode"));
		queryMsTransparentProxyNodeResponse.setResultMessage(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.ResultMessage"));
		queryMsTransparentProxyNodeResponse.setCurrentPage(_ctx.longValue("QueryMsTransparentProxyNodeResponse.CurrentPage"));
		queryMsTransparentProxyNodeResponse.setPageSize(_ctx.longValue("QueryMsTransparentProxyNodeResponse.PageSize"));
		queryMsTransparentProxyNodeResponse.setStartIndex(_ctx.longValue("QueryMsTransparentProxyNodeResponse.StartIndex"));
		queryMsTransparentProxyNodeResponse.setTotalSize(_ctx.longValue("QueryMsTransparentProxyNodeResponse.TotalSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsTransparentProxyNodeResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAppName(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].AppName"));
			listItem.setId(_ctx.longValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].Id"));
			listItem.setInstanceId(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].InstanceId"));
			listItem.setIp(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].Ip"));
			listItem.setMosnVersion(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].MosnVersion"));
			listItem.setNodeStatus(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].NodeStatus"));
			listItem.setNodeType(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].NodeType"));
			listItem.setRealRun(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].RealRun"));
			listItem.setSidecarStatus(_ctx.stringValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].SidecarStatus"));
			listItem.setTransparentProxySwitch(_ctx.longValue("QueryMsTransparentProxyNodeResponse.List["+ i +"].TransparentProxySwitch"));

			list.add(listItem);
		}
		queryMsTransparentProxyNodeResponse.setList(list);
	 
	 	return queryMsTransparentProxyNodeResponse;
	}
}