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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.UpdateGatewayServiceTrafficPolicyResponse;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayServiceTrafficPolicyResponse.Data;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.TlsSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayServiceTrafficPolicyResponseUnmarshaller {

	public static UpdateGatewayServiceTrafficPolicyResponse unmarshall(UpdateGatewayServiceTrafficPolicyResponse updateGatewayServiceTrafficPolicyResponse, UnmarshallerContext _ctx) {
		
		updateGatewayServiceTrafficPolicyResponse.setRequestId(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.RequestId"));
		updateGatewayServiceTrafficPolicyResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayServiceTrafficPolicyResponse.HttpStatusCode"));
		updateGatewayServiceTrafficPolicyResponse.setMessage(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Message"));
		updateGatewayServiceTrafficPolicyResponse.setCode(_ctx.integerValue("UpdateGatewayServiceTrafficPolicyResponse.Code"));
		updateGatewayServiceTrafficPolicyResponse.setSuccess(_ctx.booleanValue("UpdateGatewayServiceTrafficPolicyResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateGatewayServiceTrafficPolicyResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.Name"));
		data.setSourceType(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.SourceType"));
		data.setGatewayUniqueId(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayUniqueId"));
		data.setMetaInfo(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.MetaInfo"));
		data.setNamespace(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.Namespace"));
		data.setGroupName(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GroupName"));

		GatewayTrafficPolicy gatewayTrafficPolicy = new GatewayTrafficPolicy();

		TlsSetting tlsSetting = new TlsSetting();
		tlsSetting.setTlsMode(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.TlsSetting.TlsMode"));
		tlsSetting.setCertId(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.TlsSetting.CertId"));
		tlsSetting.setCaCertContent(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.TlsSetting.CaCertContent"));
		tlsSetting.setSni(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.TlsSetting.Sni"));
		gatewayTrafficPolicy.setTlsSetting(tlsSetting);

		LoadBalancerSettings loadBalancerSettings = new LoadBalancerSettings();
		loadBalancerSettings.setLoadbalancerType(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.LoadbalancerType"));
		loadBalancerSettings.setWarmupDuration(_ctx.longValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.WarmupDuration"));

		ConsistentHashLBConfig consistentHashLBConfig = new ConsistentHashLBConfig();
		consistentHashLBConfig.setParameterName(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.ParameterName"));
		consistentHashLBConfig.setConsistentHashLBType(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.ConsistentHashLBType"));

		HttpCookie httpCookie = new HttpCookie();
		httpCookie.setName(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Name"));
		httpCookie.setPath(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Path"));
		httpCookie.setTTL(_ctx.stringValue("UpdateGatewayServiceTrafficPolicyResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.TTL"));
		consistentHashLBConfig.setHttpCookie(httpCookie);
		loadBalancerSettings.setConsistentHashLBConfig(consistentHashLBConfig);
		gatewayTrafficPolicy.setLoadBalancerSettings(loadBalancerSettings);
		data.setGatewayTrafficPolicy(gatewayTrafficPolicy);
		updateGatewayServiceTrafficPolicyResponse.setData(data);
	 
	 	return updateGatewayServiceTrafficPolicyResponse;
	}
}