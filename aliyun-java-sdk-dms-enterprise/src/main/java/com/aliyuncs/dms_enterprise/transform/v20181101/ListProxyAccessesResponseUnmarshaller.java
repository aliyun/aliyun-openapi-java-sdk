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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListProxyAccessesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListProxyAccessesResponse.ProxyAccessListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProxyAccessesResponseUnmarshaller {

	public static ListProxyAccessesResponse unmarshall(ListProxyAccessesResponse listProxyAccessesResponse, UnmarshallerContext _ctx) {
		
		listProxyAccessesResponse.setRequestId(_ctx.stringValue("ListProxyAccessesResponse.RequestId"));
		listProxyAccessesResponse.setSuccess(_ctx.booleanValue("ListProxyAccessesResponse.Success"));
		listProxyAccessesResponse.setErrorMessage(_ctx.stringValue("ListProxyAccessesResponse.ErrorMessage"));
		listProxyAccessesResponse.setErrorCode(_ctx.stringValue("ListProxyAccessesResponse.ErrorCode"));

		List<ProxyAccessListItem> proxyAccessList = new ArrayList<ProxyAccessListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProxyAccessesResponse.ProxyAccessList.Length"); i++) {
			ProxyAccessListItem proxyAccessListItem = new ProxyAccessListItem();
			proxyAccessListItem.setProxyAccessId(_ctx.longValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].ProxyAccessId"));
			proxyAccessListItem.setGmtCreate(_ctx.stringValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].GmtCreate"));
			proxyAccessListItem.setAccessId(_ctx.stringValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].AccessId"));
			proxyAccessListItem.setOriginInfo(_ctx.stringValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].OriginInfo"));
			proxyAccessListItem.setIndepAccount(_ctx.stringValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].IndepAccount"));
			proxyAccessListItem.setUserId(_ctx.longValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].UserId"));
			proxyAccessListItem.setUserUid(_ctx.stringValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].UserUid"));
			proxyAccessListItem.setUserName(_ctx.stringValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].UserName"));
			proxyAccessListItem.setProxyId(_ctx.longValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].ProxyId"));
			proxyAccessListItem.setInstanceId(_ctx.longValue("ListProxyAccessesResponse.ProxyAccessList["+ i +"].InstanceId"));

			proxyAccessList.add(proxyAccessListItem);
		}
		listProxyAccessesResponse.setProxyAccessList(proxyAccessList);
	 
	 	return listProxyAccessesResponse;
	}
}