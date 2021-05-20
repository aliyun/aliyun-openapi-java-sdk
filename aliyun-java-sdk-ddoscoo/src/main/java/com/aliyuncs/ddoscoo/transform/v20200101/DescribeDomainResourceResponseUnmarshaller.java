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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainResourceResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainResourceResponse.WebRule;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainResourceResponse.WebRule.ProxyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainResourceResponseUnmarshaller {

	public static DescribeDomainResourceResponse unmarshall(DescribeDomainResourceResponse describeDomainResourceResponse, UnmarshallerContext _ctx) {
		
		describeDomainResourceResponse.setRequestId(_ctx.stringValue("DescribeDomainResourceResponse.RequestId"));
		describeDomainResourceResponse.setTotalCount(_ctx.longValue("DescribeDomainResourceResponse.TotalCount"));

		List<WebRule> webRules = new ArrayList<WebRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResourceResponse.WebRules.Length"); i++) {
			WebRule webRule = new WebRule();
			webRule.setDomain(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].Domain"));
			webRule.setRsType(_ctx.integerValue("DescribeDomainResourceResponse.WebRules["+ i +"].RsType"));
			webRule.setCcEnabled(_ctx.booleanValue("DescribeDomainResourceResponse.WebRules["+ i +"].CcEnabled"));
			webRule.setCcRuleEnabled(_ctx.booleanValue("DescribeDomainResourceResponse.WebRules["+ i +"].CcRuleEnabled"));
			webRule.setCcTemplate(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].CcTemplate"));
			webRule.setSslProtocols(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].SslProtocols"));
			webRule.setSslCiphers(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].SslCiphers"));
			webRule.setHttp2Enable(_ctx.booleanValue("DescribeDomainResourceResponse.WebRules["+ i +"].Http2Enable"));
			webRule.setHttp2HttpsEnable(_ctx.booleanValue("DescribeDomainResourceResponse.WebRules["+ i +"].Http2HttpsEnable"));
			webRule.setHttps2HttpEnable(_ctx.booleanValue("DescribeDomainResourceResponse.WebRules["+ i +"].Https2HttpEnable"));
			webRule.setPolicyMode(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].PolicyMode"));
			webRule.setProxyEnabled(_ctx.booleanValue("DescribeDomainResourceResponse.WebRules["+ i +"].ProxyEnabled"));
			webRule.setSsl13Enabled(_ctx.booleanValue("DescribeDomainResourceResponse.WebRules["+ i +"].Ssl13Enabled"));
			webRule.setPunishStatus(_ctx.booleanValue("DescribeDomainResourceResponse.WebRules["+ i +"].PunishStatus"));
			webRule.setPunishReason(_ctx.integerValue("DescribeDomainResourceResponse.WebRules["+ i +"].PunishReason"));
			webRule.setCname(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].Cname"));
			webRule.setCertName(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].CertName"));
			webRule.setHttpsExt(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].HttpsExt"));

			List<String> realServers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainResourceResponse.WebRules["+ i +"].RealServers.Length"); j++) {
				realServers.add(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].RealServers["+ j +"]"));
			}
			webRule.setRealServers(realServers);

			List<String> whiteList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainResourceResponse.WebRules["+ i +"].WhiteList.Length"); j++) {
				whiteList.add(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].WhiteList["+ j +"]"));
			}
			webRule.setWhiteList(whiteList);

			List<String> blackList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainResourceResponse.WebRules["+ i +"].BlackList.Length"); j++) {
				blackList.add(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].BlackList["+ j +"]"));
			}
			webRule.setBlackList(blackList);

			List<String> customCiphers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainResourceResponse.WebRules["+ i +"].CustomCiphers.Length"); j++) {
				customCiphers.add(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].CustomCiphers["+ j +"]"));
			}
			webRule.setCustomCiphers(customCiphers);

			List<String> instanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainResourceResponse.WebRules["+ i +"].InstanceIds.Length"); j++) {
				instanceIds.add(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].InstanceIds["+ j +"]"));
			}
			webRule.setInstanceIds(instanceIds);

			List<ProxyConfig> proxyTypes = new ArrayList<ProxyConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainResourceResponse.WebRules["+ i +"].ProxyTypes.Length"); j++) {
				ProxyConfig proxyConfig = new ProxyConfig();
				proxyConfig.setProxyType(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].ProxyTypes["+ j +"].ProxyType"));

				List<String> proxyPorts = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDomainResourceResponse.WebRules["+ i +"].ProxyTypes["+ j +"].ProxyPorts.Length"); k++) {
					proxyPorts.add(_ctx.stringValue("DescribeDomainResourceResponse.WebRules["+ i +"].ProxyTypes["+ j +"].ProxyPorts["+ k +"]"));
				}
				proxyConfig.setProxyPorts(proxyPorts);

				proxyTypes.add(proxyConfig);
			}
			webRule.setProxyTypes(proxyTypes);

			webRules.add(webRule);
		}
		describeDomainResourceResponse.setWebRules(webRules);
	 
	 	return describeDomainResourceResponse;
	}
}