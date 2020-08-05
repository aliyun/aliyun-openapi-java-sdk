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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIngressResponseUnmarshaller {

	public static DescribeIngressResponse unmarshall(DescribeIngressResponse describeIngressResponse, UnmarshallerContext _ctx) {
		
		describeIngressResponse.setRequestId(_ctx.stringValue("DescribeIngressResponse.RequestId"));
		describeIngressResponse.setCode(_ctx.stringValue("DescribeIngressResponse.Code"));
		describeIngressResponse.setMessage(_ctx.stringValue("DescribeIngressResponse.Message"));
		describeIngressResponse.setSuccess(_ctx.booleanValue("DescribeIngressResponse.Success"));
		describeIngressResponse.setErrorCode(_ctx.stringValue("DescribeIngressResponse.ErrorCode"));
		describeIngressResponse.setTraceId(_ctx.stringValue("DescribeIngressResponse.TraceId"));

		Data data = new Data();
		data.setId(_ctx.longValue("DescribeIngressResponse.Data.Id"));
		data.setName(_ctx.stringValue("DescribeIngressResponse.Data.Name"));
		data.setNamespaceId(_ctx.stringValue("DescribeIngressResponse.Data.NamespaceId"));
		data.setDescription(_ctx.stringValue("DescribeIngressResponse.Data.Description"));
		data.setSlbId(_ctx.stringValue("DescribeIngressResponse.Data.SlbId"));
		data.setListenerPort(_ctx.integerValue("DescribeIngressResponse.Data.ListenerPort"));
		data.setCertId(_ctx.stringValue("DescribeIngressResponse.Data.CertId"));
		data.setSlbType(_ctx.stringValue("DescribeIngressResponse.Data.SlbType"));

		DefaultRule defaultRule = new DefaultRule();
		defaultRule.setAppId(_ctx.stringValue("DescribeIngressResponse.Data.DefaultRule.AppId"));
		defaultRule.setContainerPort(_ctx.integerValue("DescribeIngressResponse.Data.DefaultRule.ContainerPort"));
		defaultRule.setAppName(_ctx.stringValue("DescribeIngressResponse.Data.DefaultRule.AppName"));
		data.setDefaultRule(defaultRule);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIngressResponse.Data.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setAppId(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].AppId"));
			rule.setContainerPort(_ctx.integerValue("DescribeIngressResponse.Data.Rules["+ i +"].ContainerPort"));
			rule.setDomain(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].Domain"));
			rule.setPath(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].Path"));
			rule.setAppName(_ctx.stringValue("DescribeIngressResponse.Data.Rules["+ i +"].AppName"));

			rules.add(rule);
		}
		data.setRules(rules);
		describeIngressResponse.setData(data);
	 
	 	return describeIngressResponse;
	}
}