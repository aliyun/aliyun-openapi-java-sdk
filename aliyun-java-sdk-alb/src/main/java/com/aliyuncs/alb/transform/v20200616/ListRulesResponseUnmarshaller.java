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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListRulesResponse;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.FixedResponseConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.ForwardGroupConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.ForwardGroupConfig.ServerGroupTuple;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.InsertHeaderConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.RedirectConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.RewriteConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.CookieConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.CookieConfig.Value;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.HeaderConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.HostConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.MethodConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.PathConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.QueryStringConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.QueryStringConfig.Value8;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRulesResponseUnmarshaller {

	public static ListRulesResponse unmarshall(ListRulesResponse listRulesResponse, UnmarshallerContext _ctx) {
		
		listRulesResponse.setRequestId(_ctx.stringValue("ListRulesResponse.RequestId"));
		listRulesResponse.setMaxResults(_ctx.integerValue("ListRulesResponse.MaxResults"));
		listRulesResponse.setNextToken(_ctx.stringValue("ListRulesResponse.NextToken"));
		listRulesResponse.setTotalCount(_ctx.integerValue("ListRulesResponse.TotalCount"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListRulesResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setListenerId(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].ListenerId"));
			rule.setLoadBalancerId(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].LoadBalancerId"));
			rule.setPriority(_ctx.integerValue("ListRulesResponse.Rules["+ i +"].Priority"));
			rule.setRuleId(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleName"));
			rule.setRuleStatus(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleStatus"));

			List<Action> ruleActions = new ArrayList<Action>();
			for (int j = 0; j < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleActions.Length"); j++) {
				Action action = new Action();
				action.setOrder(_ctx.integerValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].Order"));
				action.setType(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].Type"));

				FixedResponseConfig fixedResponseConfig = new FixedResponseConfig();
				fixedResponseConfig.setContent(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].FixedResponseConfig.Content"));
				fixedResponseConfig.setContentType(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].FixedResponseConfig.ContentType"));
				fixedResponseConfig.setHttpCode(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].FixedResponseConfig.HttpCode"));
				action.setFixedResponseConfig(fixedResponseConfig);

				ForwardGroupConfig forwardGroupConfig = new ForwardGroupConfig();

				List<ServerGroupTuple> serverGroupTuples = new ArrayList<ServerGroupTuple>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupTuples.Length"); k++) {
					ServerGroupTuple serverGroupTuple = new ServerGroupTuple();
					serverGroupTuple.setServerGroupId(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupTuples["+ k +"].ServerGroupId"));

					serverGroupTuples.add(serverGroupTuple);
				}
				forwardGroupConfig.setServerGroupTuples(serverGroupTuples);
				action.setForwardGroupConfig(forwardGroupConfig);

				InsertHeaderConfig insertHeaderConfig = new InsertHeaderConfig();
				insertHeaderConfig.setKey(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].InsertHeaderConfig.Key"));
				insertHeaderConfig.setValue(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].InsertHeaderConfig.Value"));
				insertHeaderConfig.setValueType(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].InsertHeaderConfig.ValueType"));
				action.setInsertHeaderConfig(insertHeaderConfig);

				RedirectConfig redirectConfig = new RedirectConfig();
				redirectConfig.setHost(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RedirectConfig.Host"));
				redirectConfig.setHttpCode(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RedirectConfig.HttpCode"));
				redirectConfig.setPath(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RedirectConfig.Path"));
				redirectConfig.setPort(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RedirectConfig.Port"));
				redirectConfig.setBizProtocol(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RedirectConfig.Protocol"));
				redirectConfig.setQuery(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RedirectConfig.Query"));
				action.setRedirectConfig(redirectConfig);

				RewriteConfig rewriteConfig = new RewriteConfig();
				rewriteConfig.setHost(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RewriteConfig.Host"));
				rewriteConfig.setPath(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RewriteConfig.Path"));
				rewriteConfig.setQuery(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RewriteConfig.Query"));
				action.setRewriteConfig(rewriteConfig);

				ruleActions.add(action);
			}
			rule.setRuleActions(ruleActions);

			List<Condition> ruleConditions = new ArrayList<Condition>();
			for (int j = 0; j < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions.Length"); j++) {
				Condition condition = new Condition();
				condition.setType(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].Type"));

				CookieConfig cookieConfig = new CookieConfig();

				List<Value> values = new ArrayList<Value>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].CookieConfig.Values.Length"); k++) {
					Value value = new Value();
					value.setKey(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].CookieConfig.Values["+ k +"].Key"));
					value.setValue(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].CookieConfig.Values["+ k +"].Value"));

					values.add(value);
				}
				cookieConfig.setValues(values);
				condition.setCookieConfig(cookieConfig);

				HeaderConfig headerConfig = new HeaderConfig();
				headerConfig.setKey(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].HeaderConfig.Key"));

				List<String> values3 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].HeaderConfig.Values.Length"); k++) {
					values3.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].HeaderConfig.Values["+ k +"]"));
				}
				headerConfig.setValues3(values3);
				condition.setHeaderConfig(headerConfig);

				HostConfig hostConfig = new HostConfig();

				List<String> values4 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].HostConfig.Values.Length"); k++) {
					values4.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].HostConfig.Values["+ k +"]"));
				}
				hostConfig.setValues4(values4);
				condition.setHostConfig(hostConfig);

				MethodConfig methodConfig = new MethodConfig();

				List<String> values5 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].MethodConfig.Values.Length"); k++) {
					values5.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].MethodConfig.Values["+ k +"]"));
				}
				methodConfig.setValues5(values5);
				condition.setMethodConfig(methodConfig);

				PathConfig pathConfig = new PathConfig();

				List<String> values6 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].PathConfig.Values.Length"); k++) {
					values6.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].PathConfig.Values["+ k +"]"));
				}
				pathConfig.setValues6(values6);
				condition.setPathConfig(pathConfig);

				QueryStringConfig queryStringConfig = new QueryStringConfig();

				List<Value8> values7 = new ArrayList<Value8>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].QueryStringConfig.Values.Length"); k++) {
					Value8 value8 = new Value8();
					value8.setKey(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].QueryStringConfig.Values["+ k +"].Key"));
					value8.setValue(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].QueryStringConfig.Values["+ k +"].Value"));

					values7.add(value8);
				}
				queryStringConfig.setValues7(values7);
				condition.setQueryStringConfig(queryStringConfig);

				ruleConditions.add(condition);
			}
			rule.setRuleConditions(ruleConditions);

			rules.add(rule);
		}
		listRulesResponse.setRules(rules);
	 
	 	return listRulesResponse;
	}
}