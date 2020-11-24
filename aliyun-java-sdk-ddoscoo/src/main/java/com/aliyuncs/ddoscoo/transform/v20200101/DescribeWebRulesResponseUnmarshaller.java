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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebRulesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebRulesResponse.WebRule;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebRulesResponse.WebRule.ProxyConfig;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebRulesResponse.WebRule.RealServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebRulesResponseUnmarshaller {

	public static DescribeWebRulesResponse unmarshall(DescribeWebRulesResponse describeWebRulesResponse, UnmarshallerContext _ctx) {
		
		describeWebRulesResponse.setRequestId(_ctx.stringValue("DescribeWebRulesResponse.RequestId"));
		describeWebRulesResponse.setTotalCount(_ctx.longValue("DescribeWebRulesResponse.TotalCount"));

		List<WebRule> webRules = new ArrayList<WebRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebRulesResponse.WebRules.Length"); i++) {
			WebRule webRule = new WebRule();
			webRule.setDomain(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].Domain"));
			webRule.setCcEnabled(_ctx.booleanValue("DescribeWebRulesResponse.WebRules["+ i +"].CcEnabled"));
			webRule.setCcRuleEnabled(_ctx.booleanValue("DescribeWebRulesResponse.WebRules["+ i +"].CcRuleEnabled"));
			webRule.setCcTemplate(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].CcTemplate"));
			webRule.setSslProtocols(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].SslProtocols"));
			webRule.setSslCiphers(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].SslCiphers"));
			webRule.setHttp2Enable(_ctx.booleanValue("DescribeWebRulesResponse.WebRules["+ i +"].Http2Enable"));
			webRule.setCname(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].Cname"));
			webRule.setCertName(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].CertName"));

			List<String> whiteList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebRulesResponse.WebRules["+ i +"].WhiteList.Length"); j++) {
				whiteList.add(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].WhiteList["+ j +"]"));
			}
			webRule.setWhiteList(whiteList);

			List<String> blackList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebRulesResponse.WebRules["+ i +"].BlackList.Length"); j++) {
				blackList.add(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].BlackList["+ j +"]"));
			}
			webRule.setBlackList(blackList);

			List<ProxyConfig> proxyTypes = new ArrayList<ProxyConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebRulesResponse.WebRules["+ i +"].ProxyTypes.Length"); j++) {
				ProxyConfig proxyConfig = new ProxyConfig();
				proxyConfig.setProxyType(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].ProxyTypes["+ j +"].ProxyType"));

				List<String> proxyPorts = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeWebRulesResponse.WebRules["+ i +"].ProxyTypes["+ j +"].ProxyPorts.Length"); k++) {
					proxyPorts.add(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].ProxyTypes["+ j +"].ProxyPorts["+ k +"]"));
				}
				proxyConfig.setProxyPorts(proxyPorts);

				proxyTypes.add(proxyConfig);
			}
			webRule.setProxyTypes(proxyTypes);

			List<RealServer> realServers = new ArrayList<RealServer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebRulesResponse.WebRules["+ i +"].RealServers.Length"); j++) {
				RealServer realServer = new RealServer();
				realServer.setRsType(_ctx.integerValue("DescribeWebRulesResponse.WebRules["+ i +"].RealServers["+ j +"].RsType"));
				realServer.setRealServer(_ctx.stringValue("DescribeWebRulesResponse.WebRules["+ i +"].RealServers["+ j +"].RealServer"));

				realServers.add(realServer);
			}
			webRule.setRealServers(realServers);

			webRules.add(webRule);
		}
		describeWebRulesResponse.setWebRules(webRules);
	 
	 	return describeWebRulesResponse;
	}
}