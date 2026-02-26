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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListListenersResponse;
import com.aliyuncs.ga.model.v20191120.ListListenersResponse.ListenersItem;
import com.aliyuncs.ga.model.v20191120.ListListenersResponse.ListenersItem.BackendPort;
import com.aliyuncs.ga.model.v20191120.ListListenersResponse.ListenersItem.Certificate;
import com.aliyuncs.ga.model.v20191120.ListListenersResponse.ListenersItem.PortRangesItem;
import com.aliyuncs.ga.model.v20191120.ListListenersResponse.ListenersItem.ServiceManagedInfosItem;
import com.aliyuncs.ga.model.v20191120.ListListenersResponse.ListenersItem.XForwardedForConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenersResponseUnmarshaller {

	public static ListListenersResponse unmarshall(ListListenersResponse listListenersResponse, UnmarshallerContext _ctx) {
		
		listListenersResponse.setRequestId(_ctx.stringValue("ListListenersResponse.RequestId"));
		listListenersResponse.setTotalCount(_ctx.integerValue("ListListenersResponse.TotalCount"));
		listListenersResponse.setPageSize(_ctx.integerValue("ListListenersResponse.PageSize"));
		listListenersResponse.setPageNumber(_ctx.integerValue("ListListenersResponse.PageNumber"));

		List<ListenersItem> listeners = new ArrayList<ListenersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListListenersResponse.Listeners.Length"); i++) {
			ListenersItem listenersItem = new ListenersItem();
			listenersItem.setListenerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerId"));
			listenersItem.setDescription(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Description"));
			listenersItem.setState(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].State"));
			listenersItem.setClientAffinity(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ClientAffinity"));
			listenersItem.setBizProtocol(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Protocol"));
			listenersItem.setCreateTime(_ctx.longValue("ListListenersResponse.Listeners["+ i +"].CreateTime"));
			listenersItem.setName(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Name"));
			listenersItem.setProxyProtocol(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].ProxyProtocol"));
			listenersItem.setAcceleratorId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].AcceleratorId"));
			listenersItem.setSecurityPolicyId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].SecurityPolicyId"));
			listenersItem.setType(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Type"));
			listenersItem.setServiceId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ServiceId"));
			listenersItem.setServiceManaged(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].ServiceManaged"));

			XForwardedForConfig xForwardedForConfig = new XForwardedForConfig();
			xForwardedForConfig.setXForwardedForGaIdEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForGaIdEnabled"));
			xForwardedForConfig.setXRealIpEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XRealIpEnabled"));
			xForwardedForConfig.setXForwardedForGaApEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForGaApEnabled"));
			xForwardedForConfig.setXForwardedForProtoEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForProtoEnabled"));
			xForwardedForConfig.setXForwardedForPortEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForPortEnabled"));
			listenersItem.setXForwardedForConfig(xForwardedForConfig);

			List<Certificate> certificates = new ArrayList<Certificate>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].Certificates.Length"); j++) {
				Certificate certificate = new Certificate();
				certificate.setType(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Certificates["+ j +"].Type"));
				certificate.setId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Certificates["+ j +"].Id"));

				certificates.add(certificate);
			}
			listenersItem.setCertificates(certificates);

			List<BackendPort> backendPorts = new ArrayList<BackendPort>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].BackendPorts.Length"); j++) {
				BackendPort backendPort = new BackendPort();
				backendPort.setFromPort(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].BackendPorts["+ j +"].FromPort"));
				backendPort.setToPort(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].BackendPorts["+ j +"].ToPort"));

				backendPorts.add(backendPort);
			}
			listenersItem.setBackendPorts(backendPorts);

			List<PortRangesItem> portRanges = new ArrayList<PortRangesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].PortRanges.Length"); j++) {
				PortRangesItem portRangesItem = new PortRangesItem();
				portRangesItem.setFromPort(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].PortRanges["+ j +"].FromPort"));
				portRangesItem.setToPort(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].PortRanges["+ j +"].ToPort"));

				portRanges.add(portRangesItem);
			}
			listenersItem.setPortRanges(portRanges);

			List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].ServiceManagedInfos.Length"); j++) {
				ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
				serviceManagedInfosItem.setAction(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ServiceManagedInfos["+ j +"].Action"));
				serviceManagedInfosItem.setChildType(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ServiceManagedInfos["+ j +"].ChildType"));
				serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].ServiceManagedInfos["+ j +"].IsManaged"));

				serviceManagedInfos.add(serviceManagedInfosItem);
			}
			listenersItem.setServiceManagedInfos(serviceManagedInfos);

			listeners.add(listenersItem);
		}
		listListenersResponse.setListeners(listeners);
	 
	 	return listListenersResponse;
	}
}