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

package com.aliyuncs.mhub.transform.v20170825;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mhub.model.v20170825.ListUserServiceInfosResponse;
import com.aliyuncs.mhub.model.v20170825.ListUserServiceInfosResponse.ServiceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserServiceInfosResponseUnmarshaller {

	public static ListUserServiceInfosResponse unmarshall(ListUserServiceInfosResponse listUserServiceInfosResponse, UnmarshallerContext _ctx) {
		
		listUserServiceInfosResponse.setRequestId(_ctx.stringValue("ListUserServiceInfosResponse.RequestId"));
		listUserServiceInfosResponse.setUbsmsStatus(_ctx.stringValue("ListUserServiceInfosResponse.UbsmsStatus"));

		List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListUserServiceInfosResponse.ServiceInfos.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setAppKey(_ctx.stringValue("ListUserServiceInfosResponse.ServiceInfos["+ i +"].AppKey"));
			serviceInfo.setService(_ctx.stringValue("ListUserServiceInfosResponse.ServiceInfos["+ i +"].Service"));
			serviceInfo.setProductId(_ctx.stringValue("ListUserServiceInfosResponse.ServiceInfos["+ i +"].ProductId"));
			serviceInfo.setModifyTime(_ctx.stringValue("ListUserServiceInfosResponse.ServiceInfos["+ i +"].ModifyTime"));
			serviceInfo.setProductName(_ctx.stringValue("ListUserServiceInfosResponse.ServiceInfos["+ i +"].ProductName"));
			serviceInfo.setAppName(_ctx.stringValue("ListUserServiceInfosResponse.ServiceInfos["+ i +"].AppName"));
			serviceInfo.setAppType(_ctx.integerValue("ListUserServiceInfosResponse.ServiceInfos["+ i +"].AppType"));

			serviceInfos.add(serviceInfo);
		}
		listUserServiceInfosResponse.setServiceInfos(serviceInfos);
	 
	 	return listUserServiceInfosResponse;
	}
}