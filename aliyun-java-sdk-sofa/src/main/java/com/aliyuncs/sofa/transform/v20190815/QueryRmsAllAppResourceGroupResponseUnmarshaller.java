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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsAllAppResourceGroupResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllAppResourceGroupResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllAppResourceGroupResponse.Response.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllAppResourceGroupResponse.Response.Entity.AppsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllAppResourceGroupResponse.Response.Entity.DomainsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllAppResourceGroupResponse.Response.Entity.DomainsItem.AppDatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAllAppResourceGroupResponseUnmarshaller {

	public static QueryRmsAllAppResourceGroupResponse unmarshall(QueryRmsAllAppResourceGroupResponse queryRmsAllAppResourceGroupResponse, UnmarshallerContext _ctx) {
		
		queryRmsAllAppResourceGroupResponse.setRequestId(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.RequestId"));
		queryRmsAllAppResourceGroupResponse.setResultCode(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.ResultCode"));
		queryRmsAllAppResourceGroupResponse.setResultMessage(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Layer"));

		Entity entity = new Entity();

		List<AppsItem> apps = new ArrayList<AppsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Apps.Length"); i++) {
			AppsItem appsItem = new AppsItem();
			appsItem.setAppId(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Apps["+ i +"].AppId"));
			appsItem.setChineseName(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Apps["+ i +"].ChineseName"));
			appsItem.setName(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Apps["+ i +"].Name"));

			apps.add(appsItem);
		}
		entity.setApps(apps);

		List<DomainsItem> domains = new ArrayList<DomainsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Domains.Length"); i++) {
			DomainsItem domainsItem = new DomainsItem();
			domainsItem.setId(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Domains["+ i +"].Id"));
			domainsItem.setName(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Domains["+ i +"].Name"));

			List<AppDatasItem> appDatas = new ArrayList<AppDatasItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Domains["+ i +"].AppDatas.Length"); j++) {
				AppDatasItem appDatasItem = new AppDatasItem();
				appDatasItem.setAppId(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Domains["+ i +"].AppDatas["+ j +"].AppId"));
				appDatasItem.setChineseName(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Domains["+ i +"].AppDatas["+ j +"].ChineseName"));
				appDatasItem.setName(_ctx.stringValue("QueryRmsAllAppResourceGroupResponse.Response.Entity.Domains["+ i +"].AppDatas["+ j +"].Name"));

				appDatas.add(appDatasItem);
			}
			domainsItem.setAppDatas(appDatas);

			domains.add(domainsItem);
		}
		entity.setDomains(domains);
		response.setEntity(entity);
		queryRmsAllAppResourceGroupResponse.setResponse(response);
	 
	 	return queryRmsAllAppResourceGroupResponse;
	}
}