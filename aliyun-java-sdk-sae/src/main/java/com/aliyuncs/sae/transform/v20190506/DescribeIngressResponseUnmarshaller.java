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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeIngressResponse;
import com.aliyuncs.sae.model.v20190506.DescribeIngressResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeIngressResponse.Data.DefaultRule;
import com.aliyuncs.sae.model.v20190506.DescribeIngressResponse.Data.Rule;
import com.aliyuncs.sae.model.v20190506.DescribeIngressResponse.Data.Svc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIngressResponseUnmarshaller {

	public static DescribeIngressResponse unmarshall(DescribeIngressResponse describeIngressResponse, UnmarshallerContext _ctx) {
		
		describeIngressResponse.setRequestId(_ctx.stringValue("DescribeIngressResponse.RequestId"));
		describeIngressResponse.setMessage(_ctx.stringValue("DescribeIngressResponse.Message"));
		describeIngressResponse.setTraceId(_ctx.stringValue("DescribeIngressResponse.TraceId"));
		describeIngressResponse.setErrorCode(_ctx.stringValue("DescribeIngressResponse.ErrorCode"));
		describeIngressResponse.setCode(_ctx.stringValue("DescribeIngressResponse.Code"));
		describeIngressResponse.setSuccess(_ctx.booleanValue("DescribeIngressResponse.Success"));

		Data data = new Data();
		data.setSlbId(_ctx.stringValue("DescribeIngressResponse.Data.SlbId"));
		data.setNamespaceId(_ctx.stringValue("DescribeIngressResponse.Data.NamespaceId"));
		data.setDescription(_ctx.stringValue("DescribeIngressResponse.Data.Description"));
		data.setListenerPort(_ctx.integerValue("DescribeIngressResponse.Data.ListenerPort"));
		data.setSlbType(_ctx.stringValue("DescribeIngressResponse.Data.SlbType"));
		data.setCertId(_ctx.stringValue("DescribeIngressResponse.Data.CertId"));
		data.setName(_ctx.stringValue("DescribeIngressResponse.Data.Name"));
		data.setId(_ctx.longValue("DescribeIngressResponse.Data.Id"));
		data.setLoadBalanceType(_ctx.stringValue("DescribeIngressResponse.Data.LoadBalanceType"));
		data.setListenerProtocol(_ctx.stringValue("DescribeIngressResponse.Data.ListenerProtocol"));
		data.setCertIds(_ctx.stringValue("DescribeIngressResponse.Data.CertIds"));
		data.setSecurityPolicyId(_ctx.stringValue("DescribeIngressResponse.Data.SecurityPolicyId"));
		data.setRequestTimeout(_ctx.integerValue("DescribeIngressResponse.Data.RequestTimeout"));
		data.setIdleTimeout(_ctx.integerValue("DescribeIngressResponse.Data.IdleTimeout"));

		DefaultRule defaultRule = new DefaultRule();
		defaultRule.setContainerPort(_ctx.integerValue("DescribeIngressResponse.Data.DefaultRule.ContainerPort"));
		defaultRule.setAppName(_ctx.stringValue("DescribeIngressResponse.Data.DefaultRule.AppName"));
		defaultRule.setAppId(_ctx.stringValue("DescribeIngressResponse.Data.DefaultRule.AppId"));
		defaultRule.setBackendProtocol(_ctx.stringValue("DescribeIngressResponse.Data.DefaultRule.BackendProtocol"));
		data.setDefaultRule(defaultRule);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIngressResponse.Data.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setAppName(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].AppName"));
			rule.setContainerPort(_ctx.integerValue("DescribeIngressResponse.Data.Rules["+ i +"].ContainerPort"));
			rule.setDomain(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].Domain"));
			rule.setAppId(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].AppId"));
			rule.setPath(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].Path"));
			rule.setBackendProtocol(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].BackendProtocol"));
			rule.setRewritePath(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].RewritePath"));

			rules.add(rule);
		}
		data.setRules(rules);

		List<Svc> svcs = new ArrayList<Svc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIngressResponse.Data.Svcs.Length"); i++) {
			Svc svc = new Svc();
			svc.setId(_ctx.longValue("DescribeIngressResponse.Data.Svcs["+ i +"].id"));
			svc.setAppId(_ctx.stringValue("DescribeIngressResponse.Data.Svcs["+ i +"].appId"));
			svc.setBackendProtocol(_ctx.stringValue("DescribeIngressResponse.Data.Svcs["+ i +"].backendProtocol"));
			svc.setBackendPort(_ctx.integerValue("DescribeIngressResponse.Data.Svcs["+ i +"].backendPort"));
			svc.setName(_ctx.stringValue("DescribeIngressResponse.Data.Svcs["+ i +"].name"));

			svcs.add(svc);
		}
		data.setSvcs(svcs);
		describeIngressResponse.setData(data);
	 
	 	return describeIngressResponse;
	}
}