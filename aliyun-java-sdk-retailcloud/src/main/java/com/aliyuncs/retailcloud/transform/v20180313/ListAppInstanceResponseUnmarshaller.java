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
import com.aliyuncs.retailcloud.model.v20180313.ListAppInstanceResponse.AppInstanceDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInstanceResponseUnmarshaller {

	public static ListAppInstanceResponse unmarshall(ListAppInstanceResponse listAppInstanceResponse, UnmarshallerContext _ctx) {
		
		listAppInstanceResponse.setRequestId(_ctx.stringValue("ListAppInstanceResponse.RequestId"));
		listAppInstanceResponse.setCode(_ctx.integerValue("ListAppInstanceResponse.Code"));
		listAppInstanceResponse.setPageSize(_ctx.integerValue("ListAppInstanceResponse.PageSize"));
		listAppInstanceResponse.setPageNumber(_ctx.integerValue("ListAppInstanceResponse.PageNumber"));
		listAppInstanceResponse.setTotalCount(_ctx.longValue("ListAppInstanceResponse.TotalCount"));
		listAppInstanceResponse.setErrMsg(_ctx.stringValue("ListAppInstanceResponse.ErrMsg"));

		List<AppInstanceDetail> data = new ArrayList<AppInstanceDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstanceResponse.Data.Length"); i++) {
			AppInstanceDetail appInstanceDetail = new AppInstanceDetail();
			appInstanceDetail.setAppInstanceId(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].AppInstanceId"));
			appInstanceDetail.setCreateTime(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].CreateTime"));
			appInstanceDetail.setSpec(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].Spec"));
			appInstanceDetail.setRestartCount(_ctx.integerValue("ListAppInstanceResponse.Data["+ i +"].RestartCount"));
			appInstanceDetail.setHostIp(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].HostIp"));
			appInstanceDetail.setPodIp(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].PodIp"));
			appInstanceDetail.setHealth(_ctx.stringValue("ListAppInstanceResponse.Data["+ i +"].Health"));

			data.add(appInstanceDetail);
		}
		listAppInstanceResponse.setData(data);
	 
	 	return listAppInstanceResponse;
	}
}