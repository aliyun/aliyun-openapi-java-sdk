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

package com.aliyuncs.qianzhou.transform.v20211111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qianzhou.model.v20211111.ListClusterDeprecatedAPIResponse;
import com.aliyuncs.qianzhou.model.v20211111.ListClusterDeprecatedAPIResponse.Datas;
import com.aliyuncs.qianzhou.model.v20211111.ListClusterDeprecatedAPIResponse.Datas.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterDeprecatedAPIResponseUnmarshaller {

	public static ListClusterDeprecatedAPIResponse unmarshall(ListClusterDeprecatedAPIResponse listClusterDeprecatedAPIResponse, UnmarshallerContext _ctx) {
		
		listClusterDeprecatedAPIResponse.setRequestId(_ctx.stringValue("ListClusterDeprecatedAPIResponse.requestId"));
		listClusterDeprecatedAPIResponse.setCode(_ctx.integerValue("ListClusterDeprecatedAPIResponse.code"));
		listClusterDeprecatedAPIResponse.setMsg(_ctx.stringValue("ListClusterDeprecatedAPIResponse.msg"));

		Datas datas = new Datas();
		datas.setTotal(_ctx.integerValue("ListClusterDeprecatedAPIResponse.datas.total"));
		datas.setPageSize(_ctx.integerValue("ListClusterDeprecatedAPIResponse.datas.pageSize"));
		datas.setCurrent(_ctx.integerValue("ListClusterDeprecatedAPIResponse.datas.current"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterDeprecatedAPIResponse.datas.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCluster_id(_ctx.stringValue("ListClusterDeprecatedAPIResponse.datas.data["+ i +"].cluster_id"));
			dataItem.setCurrent_version(_ctx.stringValue("ListClusterDeprecatedAPIResponse.datas.data["+ i +"].current_version"));
			dataItem.setTarget_version(_ctx.stringValue("ListClusterDeprecatedAPIResponse.datas.data["+ i +"].target_version"));
			dataItem.setRequest_uri(_ctx.stringValue("ListClusterDeprecatedAPIResponse.datas.data["+ i +"].request_uri"));
			dataItem.setUser_agent(_ctx.stringValue("ListClusterDeprecatedAPIResponse.datas.data["+ i +"].user_agent"));
			dataItem.setLabel(_ctx.stringValue("ListClusterDeprecatedAPIResponse.datas.data["+ i +"].label"));
			dataItem.setCount(_ctx.integerValue("ListClusterDeprecatedAPIResponse.datas.data["+ i +"].count"));
			dataItem.setContent(_ctx.stringValue("ListClusterDeprecatedAPIResponse.datas.data["+ i +"].content"));

			data.add(dataItem);
		}
		datas.setData(data);
		listClusterDeprecatedAPIResponse.setDatas(datas);
	 
	 	return listClusterDeprecatedAPIResponse;
	}
}