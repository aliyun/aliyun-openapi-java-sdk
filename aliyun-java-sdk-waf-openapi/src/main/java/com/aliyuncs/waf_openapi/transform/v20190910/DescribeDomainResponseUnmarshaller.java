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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainResponse.Domain;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainResponse.Domain.CloudNativeInstancesItem;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainResponse.Domain.CloudNativeInstancesItem.ProtocolPortConfigsItem;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainResponse.Domain.LogHeader;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainResponseUnmarshaller {

	public static DescribeDomainResponse unmarshall(DescribeDomainResponse describeDomainResponse, UnmarshallerContext _ctx) {
		
		describeDomainResponse.setRequestId(_ctx.stringValue("DescribeDomainResponse.RequestId"));

		Domain domain = new Domain();
		domain.setHttpToUserIp(_ctx.integerValue("DescribeDomainResponse.Domain.HttpToUserIp"));
		domain.setSniStatus(_ctx.integerValue("DescribeDomainResponse.Domain.SniStatus"));
		domain.setIsAccessProduct(_ctx.integerValue("DescribeDomainResponse.Domain.IsAccessProduct"));
		domain.setAccessHeaderMode(_ctx.integerValue("DescribeDomainResponse.Domain.AccessHeaderMode"));
		domain.setHttpsRedirect(_ctx.integerValue("DescribeDomainResponse.Domain.HttpsRedirect"));
		domain.setIpFollowStatus(_ctx.integerValue("DescribeDomainResponse.Domain.IpFollowStatus"));
		domain.setLoadBalancing(_ctx.integerValue("DescribeDomainResponse.Domain.LoadBalancing"));
		domain.setAccessType(_ctx.stringValue("DescribeDomainResponse.Domain.AccessType"));
		domain.setVersion(_ctx.longValue("DescribeDomainResponse.Domain.Version"));
		domain.setClusterType(_ctx.integerValue("DescribeDomainResponse.Domain.ClusterType"));
		domain.setReadTime(_ctx.integerValue("DescribeDomainResponse.Domain.ReadTime"));
		domain.setWriteTime(_ctx.integerValue("DescribeDomainResponse.Domain.WriteTime"));
		domain.setSniHost(_ctx.stringValue("DescribeDomainResponse.Domain.SniHost"));
		domain.setResourceGroupId(_ctx.stringValue("DescribeDomainResponse.Domain.ResourceGroupId"));
		domain.setCname(_ctx.stringValue("DescribeDomainResponse.Domain.Cname"));
		domain.setConnectionTime(_ctx.integerValue("DescribeDomainResponse.Domain.ConnectionTime"));
		domain.setRetry(_ctx.booleanValue("DescribeDomainResponse.Domain.Retry"));
		domain.setKeepalive(_ctx.booleanValue("DescribeDomainResponse.Domain.Keepalive"));
		domain.setKeepaliveRequests(_ctx.integerValue("DescribeDomainResponse.Domain.KeepaliveRequests"));
		domain.setKeepaliveTimeout(_ctx.integerValue("DescribeDomainResponse.Domain.KeepaliveTimeout"));

		List<String> httpPort = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResponse.Domain.HttpPort.Length"); i++) {
			httpPort.add(_ctx.stringValue("DescribeDomainResponse.Domain.HttpPort["+ i +"]"));
		}
		domain.setHttpPort(httpPort);

		List<String> http2Port = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResponse.Domain.Http2Port.Length"); i++) {
			http2Port.add(_ctx.stringValue("DescribeDomainResponse.Domain.Http2Port["+ i +"]"));
		}
		domain.setHttp2Port(http2Port);

		List<String> sourceIps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResponse.Domain.SourceIps.Length"); i++) {
			sourceIps.add(_ctx.stringValue("DescribeDomainResponse.Domain.SourceIps["+ i +"]"));
		}
		domain.setSourceIps(sourceIps);

		List<String> httpsPort = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResponse.Domain.HttpsPort.Length"); i++) {
			httpsPort.add(_ctx.stringValue("DescribeDomainResponse.Domain.HttpsPort["+ i +"]"));
		}
		domain.setHttpsPort(httpsPort);

		List<String> accessHeaders = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResponse.Domain.AccessHeaders.Length"); i++) {
			accessHeaders.add(_ctx.stringValue("DescribeDomainResponse.Domain.AccessHeaders["+ i +"]"));
		}
		domain.setAccessHeaders(accessHeaders);

		List<LogHeader> logHeaders = new ArrayList<LogHeader>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResponse.Domain.LogHeaders.Length"); i++) {
			LogHeader logHeader = new LogHeader();
			logHeader.setK(_ctx.stringValue("DescribeDomainResponse.Domain.LogHeaders["+ i +"].k"));
			logHeader.setV(_ctx.stringValue("DescribeDomainResponse.Domain.LogHeaders["+ i +"].v"));

			logHeaders.add(logHeader);
		}
		domain.setLogHeaders(logHeaders);

		List<CloudNativeInstancesItem> cloudNativeInstances = new ArrayList<CloudNativeInstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResponse.Domain.CloudNativeInstances.Length"); i++) {
			CloudNativeInstancesItem cloudNativeInstancesItem = new CloudNativeInstancesItem();
			cloudNativeInstancesItem.setRedirectionTypeName(_ctx.stringValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].RedirectionTypeName"));
			cloudNativeInstancesItem.setCloudNativeProductName(_ctx.stringValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].CloudNativeProductName"));
			cloudNativeInstancesItem.setInstanceId(_ctx.stringValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].InstanceId"));

			List<String> iPAddressList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].IPAddressList.Length"); j++) {
				iPAddressList.add(_ctx.stringValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].IPAddressList["+ j +"]"));
			}
			cloudNativeInstancesItem.setIPAddressList(iPAddressList);

			List<ProtocolPortConfigsItem> protocolPortConfigs = new ArrayList<ProtocolPortConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].ProtocolPortConfigs.Length"); j++) {
				ProtocolPortConfigsItem protocolPortConfigsItem = new ProtocolPortConfigsItem();
				protocolPortConfigsItem.setBizProtocol(_ctx.stringValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].ProtocolPortConfigs["+ j +"].Protocol"));

				List<Integer> ports = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].ProtocolPortConfigs["+ j +"].Ports.Length"); k++) {
					ports.add(_ctx.integerValue("DescribeDomainResponse.Domain.CloudNativeInstances["+ i +"].ProtocolPortConfigs["+ j +"].Ports["+ k +"]"));
				}
				protocolPortConfigsItem.setPorts(ports);

				protocolPortConfigs.add(protocolPortConfigsItem);
			}
			cloudNativeInstancesItem.setProtocolPortConfigs(protocolPortConfigs);

			cloudNativeInstances.add(cloudNativeInstancesItem);
		}
		domain.setCloudNativeInstances(cloudNativeInstances);
		describeDomainResponse.setDomain(domain);
	 
	 	return describeDomainResponse;
	}
}