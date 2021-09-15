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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.ListDomainsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListDomainsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListDomainsResponse.Data.DomainItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDomainsResponseUnmarshaller {

	public static ListDomainsResponse unmarshall(ListDomainsResponse listDomainsResponse, UnmarshallerContext _ctx) {
		
		listDomainsResponse.setRequestId(_ctx.stringValue("ListDomainsResponse.RequestId"));

		Data data = new Data();

		List<DomainItem> items = new ArrayList<DomainItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDomainsResponse.Data.Items.Length"); i++) {
			DomainItem domainItem = new DomainItem();
			domainItem.setApplied(_ctx.booleanValue("ListDomainsResponse.Data.Items["+ i +"].Applied"));
			domainItem.setDomain(_ctx.stringValue("ListDomainsResponse.Data.Items["+ i +"].Domain"));
			domainItem.setAppId(_ctx.stringValue("ListDomainsResponse.Data.Items["+ i +"].AppId"));
			domainItem.setPath(_ctx.stringValue("ListDomainsResponse.Data.Items["+ i +"].Path"));
			domainItem.setDeleted(_ctx.booleanValue("ListDomainsResponse.Data.Items["+ i +"].Deleted"));
			domainItem.setEnvId(_ctx.stringValue("ListDomainsResponse.Data.Items["+ i +"].EnvId"));
			domainItem.setDomainType(_ctx.stringValue("ListDomainsResponse.Data.Items["+ i +"].DomainType"));

			items.add(domainItem);
		}
		data.setItems(items);
		listDomainsResponse.setData(data);
	 
	 	return listDomainsResponse;
	}
}