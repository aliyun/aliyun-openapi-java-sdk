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

import com.aliyuncs.dms_enterprise.model.v20181101.ListProxiesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListProxiesResponse.ProxyListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProxiesResponseUnmarshaller {

	public static ListProxiesResponse unmarshall(ListProxiesResponse listProxiesResponse, UnmarshallerContext _ctx) {
		
		listProxiesResponse.setRequestId(_ctx.stringValue("ListProxiesResponse.RequestId"));
		listProxiesResponse.setSuccess(_ctx.booleanValue("ListProxiesResponse.Success"));
		listProxiesResponse.setErrorMessage(_ctx.stringValue("ListProxiesResponse.ErrorMessage"));
		listProxiesResponse.setErrorCode(_ctx.stringValue("ListProxiesResponse.ErrorCode"));

		List<ProxyListItem> proxyList = new ArrayList<ProxyListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProxiesResponse.ProxyList.Length"); i++) {
			ProxyListItem proxyListItem = new ProxyListItem();
			proxyListItem.setProxyId(_ctx.longValue("ListProxiesResponse.ProxyList["+ i +"].ProxyId"));
			proxyListItem.setCreatorId(_ctx.longValue("ListProxiesResponse.ProxyList["+ i +"].CreatorId"));
			proxyListItem.setCreatorName(_ctx.stringValue("ListProxiesResponse.ProxyList["+ i +"].CreatorName"));
			proxyListItem.setInstanceId(_ctx.longValue("ListProxiesResponse.ProxyList["+ i +"].InstanceId"));
			proxyListItem.setPrivateEnable(_ctx.booleanValue("ListProxiesResponse.ProxyList["+ i +"].PrivateEnable"));
			proxyListItem.setPrivateHost(_ctx.stringValue("ListProxiesResponse.ProxyList["+ i +"].PrivateHost"));
			proxyListItem.setPublicEnable(_ctx.booleanValue("ListProxiesResponse.ProxyList["+ i +"].PublicEnable"));
			proxyListItem.setPublicHost(_ctx.stringValue("ListProxiesResponse.ProxyList["+ i +"].PublicHost"));
			proxyListItem.setMysqlPort(_ctx.integerValue("ListProxiesResponse.ProxyList["+ i +"].MysqlPort"));
			proxyListItem.setHttpsPort(_ctx.integerValue("ListProxiesResponse.ProxyList["+ i +"].HttpsPort"));

			proxyList.add(proxyListItem);
		}
		listProxiesResponse.setProxyList(proxyList);
	 
	 	return listProxiesResponse;
	}
}