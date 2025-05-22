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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.GetDbProxyInstanceSslResponse;
import com.aliyuncs.rds.model.v20140815.GetDbProxyInstanceSslResponse.DbProxyCertListItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDbProxyInstanceSslResponseUnmarshaller {

	public static GetDbProxyInstanceSslResponse unmarshall(GetDbProxyInstanceSslResponse getDbProxyInstanceSslResponse, UnmarshallerContext _ctx) {
		
		getDbProxyInstanceSslResponse.setRequestId(_ctx.stringValue("GetDbProxyInstanceSslResponse.RequestId"));

		List<DbProxyCertListItemsItem> dbProxyCertListItems = new ArrayList<DbProxyCertListItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDbProxyInstanceSslResponse.DbProxyCertListItems.Length"); i++) {
			DbProxyCertListItemsItem dbProxyCertListItemsItem = new DbProxyCertListItemsItem();
			dbProxyCertListItemsItem.setCertCommonName(_ctx.stringValue("GetDbProxyInstanceSslResponse.DbProxyCertListItems["+ i +"].CertCommonName"));
			dbProxyCertListItemsItem.setDbInstanceName(_ctx.stringValue("GetDbProxyInstanceSslResponse.DbProxyCertListItems["+ i +"].DbInstanceName"));
			dbProxyCertListItemsItem.setEndpointName(_ctx.stringValue("GetDbProxyInstanceSslResponse.DbProxyCertListItems["+ i +"].EndpointName"));
			dbProxyCertListItemsItem.setEndpointType(_ctx.stringValue("GetDbProxyInstanceSslResponse.DbProxyCertListItems["+ i +"].EndpointType"));
			dbProxyCertListItemsItem.setSslExpiredTime(_ctx.stringValue("GetDbProxyInstanceSslResponse.DbProxyCertListItems["+ i +"].SslExpiredTime"));

			dbProxyCertListItems.add(dbProxyCertListItemsItem);
		}
		getDbProxyInstanceSslResponse.setDbProxyCertListItems(dbProxyCertListItems);
	 
	 	return getDbProxyInstanceSslResponse;
	}
}