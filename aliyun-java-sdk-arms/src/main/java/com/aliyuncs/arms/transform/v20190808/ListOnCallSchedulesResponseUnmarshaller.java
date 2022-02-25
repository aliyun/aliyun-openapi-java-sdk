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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListOnCallSchedulesResponse;
import com.aliyuncs.arms.model.v20190808.ListOnCallSchedulesResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.ListOnCallSchedulesResponse.PageBean.OnCallSchedulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOnCallSchedulesResponseUnmarshaller {

	public static ListOnCallSchedulesResponse unmarshall(ListOnCallSchedulesResponse listOnCallSchedulesResponse, UnmarshallerContext _ctx) {
		
		listOnCallSchedulesResponse.setRequestId(_ctx.stringValue("ListOnCallSchedulesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("ListOnCallSchedulesResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("ListOnCallSchedulesResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("ListOnCallSchedulesResponse.PageBean.Size"));

		List<OnCallSchedulesItem> onCallSchedules = new ArrayList<OnCallSchedulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOnCallSchedulesResponse.PageBean.OnCallSchedules.Length"); i++) {
			OnCallSchedulesItem onCallSchedulesItem = new OnCallSchedulesItem();
			onCallSchedulesItem.setId(_ctx.longValue("ListOnCallSchedulesResponse.PageBean.OnCallSchedules["+ i +"].Id"));
			onCallSchedulesItem.setName(_ctx.stringValue("ListOnCallSchedulesResponse.PageBean.OnCallSchedules["+ i +"].Name"));
			onCallSchedulesItem.setDescription(_ctx.stringValue("ListOnCallSchedulesResponse.PageBean.OnCallSchedules["+ i +"].Description"));

			onCallSchedules.add(onCallSchedulesItem);
		}
		pageBean.setOnCallSchedules(onCallSchedules);
		listOnCallSchedulesResponse.setPageBean(pageBean);
	 
	 	return listOnCallSchedulesResponse;
	}
}