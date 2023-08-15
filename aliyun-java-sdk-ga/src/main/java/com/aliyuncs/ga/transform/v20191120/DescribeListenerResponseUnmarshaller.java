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

import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse;
import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse.BackendPort;
import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse.Certificate;
import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse.PortRangesItem;
import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse.RelatedAclsItem;
import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse.ServiceManagedInfosItem;
import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse.XForwardedForConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeListenerResponseUnmarshaller {

	public static DescribeListenerResponse unmarshall(DescribeListenerResponse describeListenerResponse, UnmarshallerContext _ctx) {
		
		describeListenerResponse.setRequestId(_ctx.stringValue("DescribeListenerResponse.RequestId"));
		describeListenerResponse.setDescription(_ctx.stringValue("DescribeListenerResponse.Description"));
		describeListenerResponse.setState(_ctx.stringValue("DescribeListenerResponse.State"));
		describeListenerResponse.setCreateTime(_ctx.stringValue("DescribeListenerResponse.CreateTime"));
		describeListenerResponse.setBizProtocol(_ctx.stringValue("DescribeListenerResponse.Protocol"));
		describeListenerResponse.setListenerId(_ctx.stringValue("DescribeListenerResponse.ListenerId"));
		describeListenerResponse.setClientAffinity(_ctx.stringValue("DescribeListenerResponse.ClientAffinity"));
		describeListenerResponse.setName(_ctx.stringValue("DescribeListenerResponse.Name"));
		describeListenerResponse.setAclType(_ctx.stringValue("DescribeListenerResponse.AclType"));
		describeListenerResponse.setAcceleratorId(_ctx.stringValue("DescribeListenerResponse.AcceleratorId"));
		describeListenerResponse.setProxyProtocol(_ctx.booleanValue("DescribeListenerResponse.ProxyProtocol"));
		describeListenerResponse.setSecurityPolicyId(_ctx.stringValue("DescribeListenerResponse.SecurityPolicyId"));
		describeListenerResponse.setType(_ctx.stringValue("DescribeListenerResponse.Type"));
		describeListenerResponse.setServiceId(_ctx.stringValue("DescribeListenerResponse.ServiceId"));
		describeListenerResponse.setServiceManaged(_ctx.booleanValue("DescribeListenerResponse.ServiceManaged"));

		XForwardedForConfig xForwardedForConfig = new XForwardedForConfig();
		xForwardedForConfig.setXForwardedForGaIdEnabled(_ctx.booleanValue("DescribeListenerResponse.XForwardedForConfig.XForwardedForGaIdEnabled"));
		xForwardedForConfig.setXForwardedForGaApEnabled(_ctx.booleanValue("DescribeListenerResponse.XForwardedForConfig.XForwardedForGaApEnabled"));
		xForwardedForConfig.setXForwardedForProtoEnabled(_ctx.booleanValue("DescribeListenerResponse.XForwardedForConfig.XForwardedForProtoEnabled"));
		xForwardedForConfig.setXForwardedForPortEnabled(_ctx.booleanValue("DescribeListenerResponse.XForwardedForConfig.XForwardedForPortEnabled"));
		xForwardedForConfig.setXRealIpEnabled(_ctx.booleanValue("DescribeListenerResponse.XForwardedForConfig.XRealIpEnabled"));
		describeListenerResponse.setXForwardedForConfig(xForwardedForConfig);

		List<PortRangesItem> portRanges = new ArrayList<PortRangesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeListenerResponse.PortRanges.Length"); i++) {
			PortRangesItem portRangesItem = new PortRangesItem();
			portRangesItem.setFromPort(_ctx.integerValue("DescribeListenerResponse.PortRanges["+ i +"].FromPort"));
			portRangesItem.setToPort(_ctx.integerValue("DescribeListenerResponse.PortRanges["+ i +"].ToPort"));

			portRanges.add(portRangesItem);
		}
		describeListenerResponse.setPortRanges(portRanges);

		List<BackendPort> backendPorts = new ArrayList<BackendPort>();
		for (int i = 0; i < _ctx.lengthValue("DescribeListenerResponse.BackendPorts.Length"); i++) {
			BackendPort backendPort = new BackendPort();
			backendPort.setFromPort(_ctx.stringValue("DescribeListenerResponse.BackendPorts["+ i +"].FromPort"));
			backendPort.setToPort(_ctx.stringValue("DescribeListenerResponse.BackendPorts["+ i +"].ToPort"));

			backendPorts.add(backendPort);
		}
		describeListenerResponse.setBackendPorts(backendPorts);

		List<Certificate> certificates = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeListenerResponse.Certificates.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setType(_ctx.stringValue("DescribeListenerResponse.Certificates["+ i +"].Type"));
			certificate.setId(_ctx.stringValue("DescribeListenerResponse.Certificates["+ i +"].Id"));

			certificates.add(certificate);
		}
		describeListenerResponse.setCertificates(certificates);

		List<RelatedAclsItem> relatedAcls = new ArrayList<RelatedAclsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeListenerResponse.RelatedAcls.Length"); i++) {
			RelatedAclsItem relatedAclsItem = new RelatedAclsItem();
			relatedAclsItem.setAclId(_ctx.stringValue("DescribeListenerResponse.RelatedAcls["+ i +"].AclId"));
			relatedAclsItem.setStatus(_ctx.stringValue("DescribeListenerResponse.RelatedAcls["+ i +"].Status"));

			relatedAcls.add(relatedAclsItem);
		}
		describeListenerResponse.setRelatedAcls(relatedAcls);

		List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeListenerResponse.ServiceManagedInfos.Length"); i++) {
			ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
			serviceManagedInfosItem.setAction(_ctx.stringValue("DescribeListenerResponse.ServiceManagedInfos["+ i +"].Action"));
			serviceManagedInfosItem.setChildType(_ctx.stringValue("DescribeListenerResponse.ServiceManagedInfos["+ i +"].ChildType"));
			serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("DescribeListenerResponse.ServiceManagedInfos["+ i +"].IsManaged"));

			serviceManagedInfos.add(serviceManagedInfosItem);
		}
		describeListenerResponse.setServiceManagedInfos(serviceManagedInfos);
	 
	 	return describeListenerResponse;
	}
}