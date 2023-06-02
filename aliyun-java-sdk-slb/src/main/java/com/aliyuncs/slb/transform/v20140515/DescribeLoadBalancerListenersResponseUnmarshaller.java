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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.HTTPListenerConfig;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.HTTPSListenerConfig;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.TCPListenerConfig;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.TCPListenerConfig.PortRange;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.TCPSListenerConfig;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.Tag;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.UDPListenerConfig;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.UDPListenerConfig.PortRange2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerListenersResponseUnmarshaller {

	public static DescribeLoadBalancerListenersResponse unmarshall(DescribeLoadBalancerListenersResponse describeLoadBalancerListenersResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerListenersResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.RequestId"));
		describeLoadBalancerListenersResponse.setNextToken(_ctx.stringValue("DescribeLoadBalancerListenersResponse.NextToken"));
		describeLoadBalancerListenersResponse.setTotalCount(_ctx.integerValue("DescribeLoadBalancerListenersResponse.TotalCount"));
		describeLoadBalancerListenersResponse.setMaxResults(_ctx.integerValue("DescribeLoadBalancerListenersResponse.MaxResults"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setAclType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclType"));
			listener.setStatus(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Status"));
			listener.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].VServerGroupId"));
			listener.setListenerProtocol(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].ListenerProtocol"));
			listener.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].LoadBalancerId"));
			listener.setListenerPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].ListenerPort"));
			listener.setServiceManagedMode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].ServiceManagedMode"));
			listener.setAclId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclId"));
			listener.setScheduler(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Scheduler"));
			listener.setBandwidth(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Bandwidth"));
			listener.setDescription(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Description"));
			listener.setAclStatus(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclStatus"));
			listener.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].BackendServerPort"));

			List<String> aclIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclIds.Length"); j++) {
				aclIds.add(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclIds["+ j +"]"));
			}
			listener.setAclIds(aclIds);

			HTTPListenerConfig hTTPListenerConfig = new HTTPListenerConfig();
			hTTPListenerConfig.setHealthCheckHttpVersion(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckHttpVersion"));
			hTTPListenerConfig.setXForwardedFor_ClientSrcPort(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_ClientSrcPort"));
			hTTPListenerConfig.setCookie(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.Cookie"));
			hTTPListenerConfig.setGzip(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.Gzip"));
			hTTPListenerConfig.setForwardCode(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.ForwardCode"));
			hTTPListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckConnectPort"));
			hTTPListenerConfig.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckTimeout"));
			hTTPListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckType"));
			hTTPListenerConfig.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.CookieTimeout"));
			hTTPListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckDomain"));
			hTTPListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.UnhealthyThreshold"));
			hTTPListenerConfig.setXForwardedFor_SLBID(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_SLBID"));
			hTTPListenerConfig.setForwardPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.ForwardPort"));
			hTTPListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckHttpCode"));
			hTTPListenerConfig.setListenerForward(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.ListenerForward"));
			hTTPListenerConfig.setXForwardedFor(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor"));
			hTTPListenerConfig.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.IdleTimeout"));
			hTTPListenerConfig.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.RequestTimeout"));
			hTTPListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckInterval"));
			hTTPListenerConfig.setXForwardedFor_SLBPORT(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_SLBPORT"));
			hTTPListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckURI"));
			hTTPListenerConfig.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.StickySessionType"));
			hTTPListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthyThreshold"));
			hTTPListenerConfig.setXForwardedFor_proto(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_proto"));
			hTTPListenerConfig.setXForwardedFor_SLBIP(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_SLBIP"));
			hTTPListenerConfig.setStickySession(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.StickySession"));
			hTTPListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckMethod"));
			hTTPListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheck"));
			listener.setHTTPListenerConfig(hTTPListenerConfig);

			HTTPSListenerConfig hTTPSListenerConfig = new HTTPSListenerConfig();
			hTTPSListenerConfig.setXForwardedFor_ClientCertClientVerify(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertClientVerify"));
			hTTPSListenerConfig.setHealthCheckHttpVersion(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckHttpVersion"));
			hTTPSListenerConfig.setXForwardedFor_ClientSrcPort(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientSrcPort"));
			hTTPSListenerConfig.setCookie(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.Cookie"));
			hTTPSListenerConfig.setGzip(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.Gzip"));
			hTTPSListenerConfig.setEnableHttp2(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.EnableHttp2"));
			hTTPSListenerConfig.setCACertificateId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.CACertificateId"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertClientVerifyAlias(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertClientVerifyAlias"));
			hTTPSListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckConnectPort"));
			hTTPSListenerConfig.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckTimeout"));
			hTTPSListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckType"));
			hTTPSListenerConfig.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.CookieTimeout"));
			hTTPSListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckDomain"));
			hTTPSListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.UnhealthyThreshold"));
			hTTPSListenerConfig.setXForwardedFor_SLBID(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_SLBID"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertSubjectDN(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertSubjectDN"));
			hTTPSListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckHttpCode"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertFingerprintAlias(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertFingerprintAlias"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertSubjectDNAlias(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertSubjectDNAlias"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertIssuerDNAlias(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertIssuerDNAlias"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertFingerprint(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertFingerprint"));
			hTTPSListenerConfig.setXForwardedFor(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor"));
			hTTPSListenerConfig.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.RequestTimeout"));
			hTTPSListenerConfig.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.IdleTimeout"));
			hTTPSListenerConfig.setServerCertificateId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.ServerCertificateId"));
			hTTPSListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckInterval"));
			hTTPSListenerConfig.setXForwardedFor_SLBPORT(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_SLBPORT"));
			hTTPSListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckURI"));
			hTTPSListenerConfig.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.StickySessionType"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertIssuerDN(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertIssuerDN"));
			hTTPSListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthyThreshold"));
			hTTPSListenerConfig.setXForwardedFor_proto(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_proto"));
			hTTPSListenerConfig.setXForwardedFor_SLBIP(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_SLBIP"));
			hTTPSListenerConfig.setStickySession(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.StickySession"));
			hTTPSListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckMethod"));
			hTTPSListenerConfig.setTLSCipherPolicy(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.TLSCipherPolicy"));
			hTTPSListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheck"));
			listener.setHTTPSListenerConfig(hTTPSListenerConfig);

			TCPListenerConfig tCPListenerConfig = new TCPListenerConfig();
			tCPListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckHttpCode"));
			tCPListenerConfig.setConnectionDrainTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.ConnectionDrainTimeout"));
			tCPListenerConfig.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.PersistenceTimeout"));
			tCPListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckInterval"));
			tCPListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckURI"));
			tCPListenerConfig.setHealthCheckSwitch(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckSwitch"));
			tCPListenerConfig.setFullNatEnabled(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.FullNatEnabled"));
			tCPListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckConnectPort"));
			tCPListenerConfig.setEstablishedTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.EstablishedTimeout"));
			tCPListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckType"));
			tCPListenerConfig.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckConnectTimeout"));
			tCPListenerConfig.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.MasterSlaveServerGroupId"));
			tCPListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthyThreshold"));
			tCPListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckDomain"));
			tCPListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.UnhealthyThreshold"));
			tCPListenerConfig.setConnectionDrain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.ConnectionDrain"));
			tCPListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckMethod"));
			tCPListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheck"));
			tCPListenerConfig.setProxyProtocolV2Enabled(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.ProxyProtocolV2Enabled"));

			List<PortRange> portRanges = new ArrayList<PortRange>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.PortRanges.Length"); j++) {
				PortRange portRange = new PortRange();
				portRange.setStartPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.PortRanges["+ j +"].StartPort"));
				portRange.setEndPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.PortRanges["+ j +"].EndPort"));

				portRanges.add(portRange);
			}
			tCPListenerConfig.setPortRanges(portRanges);
			listener.setTCPListenerConfig(tCPListenerConfig);

			TCPSListenerConfig tCPSListenerConfig = new TCPSListenerConfig();
			tCPSListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckHttpCode"));
			tCPSListenerConfig.setCookie(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.Cookie"));
			tCPSListenerConfig.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.IdleTimeout"));
			tCPSListenerConfig.setServerCertificateId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.ServerCertificateId"));
			tCPSListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckInterval"));
			tCPSListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckURI"));
			tCPSListenerConfig.setCACertificateId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.CACertificateId"));
			tCPSListenerConfig.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.StickySessionType"));
			tCPSListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckConnectPort"));
			tCPSListenerConfig.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckTimeout"));
			tCPSListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckType"));
			tCPSListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthyThreshold"));
			tCPSListenerConfig.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.CookieTimeout"));
			tCPSListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckDomain"));
			tCPSListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.UnhealthyThreshold"));
			tCPSListenerConfig.setStickySession(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.StickySession"));
			tCPSListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckMethod"));
			tCPSListenerConfig.setTLSCipherPolicy(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.TLSCipherPolicy"));
			tCPSListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheck"));
			listener.setTCPSListenerConfig(tCPSListenerConfig);

			UDPListenerConfig uDPListenerConfig = new UDPListenerConfig();
			uDPListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckHttpCode"));
			uDPListenerConfig.setConnectionDrainTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.ConnectionDrainTimeout"));
			uDPListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckInterval"));
			uDPListenerConfig.setHealthCheckExp(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckExp"));
			uDPListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckURI"));
			uDPListenerConfig.setHealthCheckSwitch(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckSwitch"));
			uDPListenerConfig.setFullNatEnabled(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.FullNatEnabled"));
			uDPListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckConnectPort"));
			uDPListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckType"));
			uDPListenerConfig.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckConnectTimeout"));
			uDPListenerConfig.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.MasterSlaveServerGroupId"));
			uDPListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthyThreshold"));
			uDPListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckDomain"));
			uDPListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.UnhealthyThreshold"));
			uDPListenerConfig.setConnectionDrain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.ConnectionDrain"));
			uDPListenerConfig.setHealthCheckReq(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckReq"));
			uDPListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckMethod"));
			uDPListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheck"));
			uDPListenerConfig.setProxyProtocolV2Enabled(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.ProxyProtocolV2Enabled"));

			List<PortRange2> portRanges1 = new ArrayList<PortRange2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.PortRanges.Length"); j++) {
				PortRange2 portRange2 = new PortRange2();
				portRange2.setStartPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.PortRanges["+ j +"].StartPort"));
				portRange2.setEndPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.PortRanges["+ j +"].EndPort"));

				portRanges1.add(portRange2);
			}
			uDPListenerConfig.setPortRanges1(portRanges1);
			listener.setUDPListenerConfig(uDPListenerConfig);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			listener.setTags(tags);

			listeners.add(listener);
		}
		describeLoadBalancerListenersResponse.setListeners(listeners);
	 
	 	return describeLoadBalancerListenersResponse;
	}
}