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

import com.aliyuncs.arms.model.v20190808.ListEventBridgeIntegrationsResponse;
import com.aliyuncs.arms.model.v20190808.ListEventBridgeIntegrationsResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.ListEventBridgeIntegrationsResponse.PageBean.Integrations;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventBridgeIntegrationsResponseUnmarshaller {

	public static ListEventBridgeIntegrationsResponse unmarshall(ListEventBridgeIntegrationsResponse listEventBridgeIntegrationsResponse, UnmarshallerContext _ctx) {
		
		listEventBridgeIntegrationsResponse.setRequestId(_ctx.stringValue("ListEventBridgeIntegrationsResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("ListEventBridgeIntegrationsResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("ListEventBridgeIntegrationsResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("ListEventBridgeIntegrationsResponse.PageBean.Size"));

		List<Integrations> eventBridgeIntegrations = new ArrayList<Integrations>();
		for (int i = 0; i < _ctx.lengthValue("ListEventBridgeIntegrationsResponse.PageBean.EventBridgeIntegrations.Length"); i++) {
			Integrations integrations = new Integrations();
			integrations.setId(_ctx.longValue("ListEventBridgeIntegrationsResponse.PageBean.EventBridgeIntegrations["+ i +"].Id"));
			integrations.setName(_ctx.stringValue("ListEventBridgeIntegrationsResponse.PageBean.EventBridgeIntegrations["+ i +"].Name"));
			integrations.setDescription(_ctx.stringValue("ListEventBridgeIntegrationsResponse.PageBean.EventBridgeIntegrations["+ i +"].Description"));

			eventBridgeIntegrations.add(integrations);
		}
		pageBean.setEventBridgeIntegrations(eventBridgeIntegrations);
		listEventBridgeIntegrationsResponse.setPageBean(pageBean);
	 
	 	return listEventBridgeIntegrationsResponse;
	}
}