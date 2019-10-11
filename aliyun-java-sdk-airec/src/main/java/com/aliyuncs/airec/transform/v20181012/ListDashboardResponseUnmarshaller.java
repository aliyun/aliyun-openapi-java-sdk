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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.ListDashboardResponse;
import com.aliyuncs.airec.model.v20181012.ListDashboardResponse.Result;
import com.aliyuncs.airec.model.v20181012.ListDashboardResponse.Result.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardResponseUnmarshaller {

	public static ListDashboardResponse unmarshall(ListDashboardResponse listDashboardResponse, UnmarshallerContext _ctx) {
		
		listDashboardResponse.setRequestId(_ctx.stringValue("ListDashboardResponse.RequestId"));
		listDashboardResponse.setCode(_ctx.stringValue("ListDashboardResponse.Code"));
		listDashboardResponse.setMessage(_ctx.stringValue("ListDashboardResponse.Message"));

		Result result = new Result();
		result.setNum(_ctx.integerValue("ListDashboardResponse.Result.Num"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setBizDate(_ctx.longValue("ListDashboardResponse.Result.List["+ i +"].BizDate"));
			listItem.setPv(_ctx.longValue("ListDashboardResponse.Result.List["+ i +"].Pv"));
			listItem.setUv(_ctx.longValue("ListDashboardResponse.Result.List["+ i +"].Uv"));
			listItem.setClick(_ctx.longValue("ListDashboardResponse.Result.List["+ i +"].Click"));
			listItem.setCtr(_ctx.floatValue("ListDashboardResponse.Result.List["+ i +"].Ctr"));
			listItem.setUvCtr(_ctx.floatValue("ListDashboardResponse.Result.List["+ i +"].UvCtr"));
			listItem.setPerUvBhv(_ctx.floatValue("ListDashboardResponse.Result.List["+ i +"].PerUvBhv"));
			listItem.setPerUvClick(_ctx.floatValue("ListDashboardResponse.Result.List["+ i +"].PerUvClick"));
			listItem.setClickUser(_ctx.longValue("ListDashboardResponse.Result.List["+ i +"].ClickUser"));
			listItem.setActiveItem(_ctx.longValue("ListDashboardResponse.Result.List["+ i +"].ActiveItem"));
			listItem.setTraceId(_ctx.stringValue("ListDashboardResponse.Result.List["+ i +"].TraceId"));
			listItem.setSceneId(_ctx.stringValue("ListDashboardResponse.Result.List["+ i +"].SceneId"));

			list.add(listItem);
		}
		result.setList(list);
		listDashboardResponse.setResult(result);
	 
	 	return listDashboardResponse;
	}
}