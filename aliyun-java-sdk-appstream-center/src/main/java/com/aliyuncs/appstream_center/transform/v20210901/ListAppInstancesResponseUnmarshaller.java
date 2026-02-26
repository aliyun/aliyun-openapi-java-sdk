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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.ListAppInstancesResponse;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstancesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInstancesResponseUnmarshaller {

	public static ListAppInstancesResponse unmarshall(ListAppInstancesResponse listAppInstancesResponse, UnmarshallerContext _ctx) {
		
		listAppInstancesResponse.setRequestId(_ctx.stringValue("ListAppInstancesResponse.RequestId"));
		listAppInstancesResponse.setTotalCount(_ctx.integerValue("ListAppInstancesResponse.TotalCount"));
		listAppInstancesResponse.setPageSize(_ctx.integerValue("ListAppInstancesResponse.PageSize"));
		listAppInstancesResponse.setPageNumber(_ctx.integerValue("ListAppInstancesResponse.PageNumber"));

		List<Data> appInstanceModels = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstancesResponse.AppInstanceModels.Length"); i++) {
			Data data = new Data();
			data.setAppInstanceId(_ctx.stringValue("ListAppInstancesResponse.AppInstanceModels["+ i +"].AppInstanceId"));
			data.setAppInstanceGroupId(_ctx.stringValue("ListAppInstancesResponse.AppInstanceModels["+ i +"].AppInstanceGroupId"));
			data.setStatus(_ctx.stringValue("ListAppInstancesResponse.AppInstanceModels["+ i +"].Status"));
			data.setMainEthPublicIp(_ctx.stringValue("ListAppInstancesResponse.AppInstanceModels["+ i +"].MainEthPublicIp"));
			data.setGmtCreate(_ctx.stringValue("ListAppInstancesResponse.AppInstanceModels["+ i +"].GmtCreate"));
			data.setGmtModified(_ctx.stringValue("ListAppInstancesResponse.AppInstanceModels["+ i +"].GmtModified"));
			data.setSessionStatus(_ctx.stringValue("ListAppInstancesResponse.AppInstanceModels["+ i +"].SessionStatus"));

			appInstanceModels.add(data);
		}
		listAppInstancesResponse.setAppInstanceModels(appInstanceModels);
	 
	 	return listAppInstancesResponse;
	}
}