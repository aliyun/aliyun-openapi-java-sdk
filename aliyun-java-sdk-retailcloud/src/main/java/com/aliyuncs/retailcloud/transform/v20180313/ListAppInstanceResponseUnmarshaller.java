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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListAppInstanceResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListAppInstanceResponse.ListAppInstanceResponse1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInstanceResponseUnmarshaller {

	public static ListAppInstanceResponse unmarshall(ListAppInstanceResponse listAppInstanceResponse, UnmarshallerContext _ctx) {
		
		listAppInstanceResponse.setRequestId(_ctx.stringValue("ListAppInstanceResponse.RequestId"));
		listAppInstanceResponse.setCode(_ctx.integerValue("ListAppInstanceResponse.Code"));
		listAppInstanceResponse.setPageSize(_ctx.integerValue("ListAppInstanceResponse.PageSize"));
		listAppInstanceResponse.setPageNumber(_ctx.integerValue("ListAppInstanceResponse.PageNumber"));
		listAppInstanceResponse.setTotalCount(_ctx.longValue("ListAppInstanceResponse.TotalCount"));
		listAppInstanceResponse.setErrMsg(_ctx.stringValue("ListAppInstanceResponse.ErrMsg"));

		List<ListAppInstanceResponse1> data = new ArrayList<ListAppInstanceResponse1>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstanceResponse.Data.Length"); i++) {
			ListAppInstanceResponse1 listAppInstanceResponse1 = new ListAppInstanceResponse1();
			listAppInstanceResponse1.setAppInstanceId(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].AppInstanceId"));
			listAppInstanceResponse1.setCreateTime(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].CreateTime"));
			listAppInstanceResponse1.setSpec(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].Spec"));
			listAppInstanceResponse1.setRestartCount(_ctx.integerValue("ListAppInstanceResponse.Data["+ i +"].RestartCount"));
			listAppInstanceResponse1.setHostIp(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].HostIp"));
			listAppInstanceResponse1.setPodIp(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].PodIp"));
			listAppInstanceResponse1.setHealth(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].Health"));

			data.add(listAppInstanceResponse1);
		}
		listAppInstanceResponse.setData(data);
	 
	 	return listAppInstanceResponse;
	}
}