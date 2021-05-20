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
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.UDPListenerConfig;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerListenersResponse.Listener.UDPListenerConfig.PortRange2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerListenersResponseUnmarshaller {

	public static DescribeLoadBalancerListenersResponse unmarshall(DescribeLoadBalancerListenersResponse describeLoadBalancerListenersResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerListenersResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.RequestId"));
		describeLoadBalancerListenersResponse.setMaxResults(_ctx.integerValue("DescribeLoadBalancerListenersResponse.MaxResults"));
		describeLoadBalancerListenersResponse.setNextToken(_ctx.stringValue("DescribeLoadBalancerListenersResponse.NextToken"));
		describeLoadBalancerListenersResponse.setTotalCount(_ctx.integerValue("DescribeLoadBalancerListenersResponse.TotalCount"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setAclId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclId"));
			listener.setAclStatus(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclStatus"));
			listener.setAclType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclType"));
			listener.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].BackendServerPort"));
			listener.setBandwidth(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Bandwidth"));
			listener.setDescription(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Description"));
			listener.setListenerPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].ListenerPort"));
			listener.setListenerProtocol(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].ListenerProtocol"));
			listener.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].LoadBalancerId"));
			listener.setScheduler(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Scheduler"));
			listener.setStatus(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Status"));
			listener.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].VServerGroupId"));

			List<String> aclIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclIds.Length"); j++) {
				aclIds.add(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].AclIds["+ j +"]"));
			}
			listener.setAclIds(aclIds);

			HTTPListenerConfig hTTPListenerConfig = new HTTPListenerConfig();
			hTTPListenerConfig.setCookie(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.Cookie"));
			hTTPListenerConfig.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.CookieTimeout"));
			hTTPListenerConfig.setForwardCode(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.ForwardCode"));
			hTTPListenerConfig.setForwardPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.ForwardPort"));
			hTTPListenerConfig.setGzip(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.Gzip"));
			hTTPListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheck"));
			hTTPListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckConnectPort"));
			hTTPListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckDomain"));
			hTTPListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckHttpCode"));
			hTTPListenerConfig.setHealthCheckHttpVersion(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckHttpVersion"));
			hTTPListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckInterval"));
			hTTPListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckMethod"));
			hTTPListenerConfig.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckTimeout"));
			hTTPListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckType"));
			hTTPListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthCheckURI"));
			hTTPListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.HealthyThreshold"));
			hTTPListenerConfig.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.IdleTimeout"));
			hTTPListenerConfig.setListenerForward(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.ListenerForward"));
			hTTPListenerConfig.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.RequestTimeout"));
			hTTPListenerConfig.setStickySession(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.StickySession"));
			hTTPListenerConfig.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.StickySessionType"));
			hTTPListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.UnhealthyThreshold"));
			hTTPListenerConfig.setXForwardedFor(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor"));
			hTTPListenerConfig.setXForwardedFor_ClientSrcPort(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_ClientSrcPort"));
			hTTPListenerConfig.setXForwardedFor_SLBID(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_SLBID"));
			hTTPListenerConfig.setXForwardedFor_SLBIP(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_SLBIP"));
			hTTPListenerConfig.setXForwardedFor_SLBPORT(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_SLBPORT"));
			hTTPListenerConfig.setXForwardedFor_proto(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPListenerConfig.XForwardedFor_proto"));
			listener.setHTTPListenerConfig(hTTPListenerConfig);

			HTTPSListenerConfig hTTPSListenerConfig = new HTTPSListenerConfig();
			hTTPSListenerConfig.setCACertificateId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.CACertificateId"));
			hTTPSListenerConfig.setCookie(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.Cookie"));
			hTTPSListenerConfig.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.CookieTimeout"));
			hTTPSListenerConfig.setEnableHttp2(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.EnableHttp2"));
			hTTPSListenerConfig.setGzip(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.Gzip"));
			hTTPSListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheck"));
			hTTPSListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckConnectPort"));
			hTTPSListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckDomain"));
			hTTPSListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckHttpCode"));
			hTTPSListenerConfig.setHealthCheckHttpVersion(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckHttpVersion"));
			hTTPSListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckInterval"));
			hTTPSListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckMethod"));
			hTTPSListenerConfig.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckTimeout"));
			hTTPSListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckType"));
			hTTPSListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthCheckURI"));
			hTTPSListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.HealthyThreshold"));
			hTTPSListenerConfig.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.IdleTimeout"));
			hTTPSListenerConfig.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.RequestTimeout"));
			hTTPSListenerConfig.setServerCertificateId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.ServerCertificateId"));
			hTTPSListenerConfig.setStickySession(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.StickySession"));
			hTTPSListenerConfig.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.StickySessionType"));
			hTTPSListenerConfig.setTLSCipherPolicy(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.TLSCipherPolicy"));
			hTTPSListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.UnhealthyThreshold"));
			hTTPSListenerConfig.setXForwardedFor(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertClientVerify(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertClientVerify"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertClientVerifyAlias(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertClientVerifyAlias"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertFingerprint(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertFingerprint"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertFingerprintAlias(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertFingerprintAlias"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertIssuerDN(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertIssuerDN"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertIssuerDNAlias(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertIssuerDNAlias"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertSubjectDN(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertSubjectDN"));
			hTTPSListenerConfig.setXForwardedFor_ClientCertSubjectDNAlias(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientCertSubjectDNAlias"));
			hTTPSListenerConfig.setXForwardedFor_ClientSrcPort(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_ClientSrcPort"));
			hTTPSListenerConfig.setXForwardedFor_SLBID(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_SLBID"));
			hTTPSListenerConfig.setXForwardedFor_SLBIP(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_SLBIP"));
			hTTPSListenerConfig.setXForwardedFor_SLBPORT(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_SLBPORT"));
			hTTPSListenerConfig.setXForwardedFor_proto(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].HTTPSListenerConfig.XForwardedFor_proto"));
			listener.setHTTPSListenerConfig(hTTPSListenerConfig);

			TCPListenerConfig tCPListenerConfig = new TCPListenerConfig();
			tCPListenerConfig.setConnectionDrain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.ConnectionDrain"));
			tCPListenerConfig.setConnectionDrainTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.ConnectionDrainTimeout"));
			tCPListenerConfig.setEstablishedTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.EstablishedTimeout"));
			tCPListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheck"));
			tCPListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckConnectPort"));
			tCPListenerConfig.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckConnectTimeout"));
			tCPListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckDomain"));
			tCPListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckHttpCode"));
			tCPListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckInterval"));
			tCPListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckMethod"));
			tCPListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckType"));
			tCPListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckURI"));
			tCPListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthyThreshold"));
			tCPListenerConfig.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.MasterSlaveServerGroupId"));
			tCPListenerConfig.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.PersistenceTimeout"));
			tCPListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.UnhealthyThreshold"));
			tCPListenerConfig.setHealthCheckSwitch(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.HealthCheckSwitch"));

			List<PortRange> portRanges = new ArrayList<PortRange>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.PortRanges.Length"); j++) {
				PortRange portRange = new PortRange();
				portRange.setEndPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.PortRanges["+ j +"].EndPort"));
				portRange.setStartPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPListenerConfig.PortRanges["+ j +"].StartPort"));

				portRanges.add(portRange);
			}
			tCPListenerConfig.setPortRanges(portRanges);
			listener.setTCPListenerConfig(tCPListenerConfig);

			TCPSListenerConfig tCPSListenerConfig = new TCPSListenerConfig();
			tCPSListenerConfig.setCACertificateId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.CACertificateId"));
			tCPSListenerConfig.setCookie(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.Cookie"));
			tCPSListenerConfig.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.CookieTimeout"));
			tCPSListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheck"));
			tCPSListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckConnectPort"));
			tCPSListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckDomain"));
			tCPSListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckHttpCode"));
			tCPSListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckInterval"));
			tCPSListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckMethod"));
			tCPSListenerConfig.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckTimeout"));
			tCPSListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckType"));
			tCPSListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthCheckURI"));
			tCPSListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.HealthyThreshold"));
			tCPSListenerConfig.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.IdleTimeout"));
			tCPSListenerConfig.setServerCertificateId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.ServerCertificateId"));
			tCPSListenerConfig.setStickySession(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.StickySession"));
			tCPSListenerConfig.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.StickySessionType"));
			tCPSListenerConfig.setTLSCipherPolicy(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.TLSCipherPolicy"));
			tCPSListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].TCPSListenerConfig.UnhealthyThreshold"));
			listener.setTCPSListenerConfig(tCPSListenerConfig);

			UDPListenerConfig uDPListenerConfig = new UDPListenerConfig();
			uDPListenerConfig.setConnectionDrain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.ConnectionDrain"));
			uDPListenerConfig.setConnectionDrainTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.ConnectionDrainTimeout"));
			uDPListenerConfig.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheck"));
			uDPListenerConfig.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckConnectPort"));
			uDPListenerConfig.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckConnectTimeout"));
			uDPListenerConfig.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckDomain"));
			uDPListenerConfig.setHealthCheckExp(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckExp"));
			uDPListenerConfig.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckHttpCode"));
			uDPListenerConfig.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckInterval"));
			uDPListenerConfig.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckMethod"));
			uDPListenerConfig.setHealthCheckReq(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckReq"));
			uDPListenerConfig.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckType"));
			uDPListenerConfig.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckURI"));
			uDPListenerConfig.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthyThreshold"));
			uDPListenerConfig.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.MasterSlaveServerGroupId"));
			uDPListenerConfig.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.UnhealthyThreshold"));
			uDPListenerConfig.setHealthCheckSwitch(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.HealthCheckSwitch"));

			List<PortRange2> portRanges1 = new ArrayList<PortRange2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.PortRanges.Length"); j++) {
				PortRange2 portRange2 = new PortRange2();
				portRange2.setEndPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.PortRanges["+ j +"].EndPort"));
				portRange2.setStartPort(_ctx.integerValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].UDPListenerConfig.PortRanges["+ j +"].StartPort"));

				portRanges1.add(portRange2);
			}
			uDPListenerConfig.setPortRanges1(portRanges1);
			listener.setUDPListenerConfig(uDPListenerConfig);

			listeners.add(listener);
		}
		describeLoadBalancerListenersResponse.setListeners(listeners);
	 
	 	return describeLoadBalancerListenersResponse;
	}
}