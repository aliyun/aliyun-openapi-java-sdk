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
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.CorsConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.FixedResponseConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.ForwardGroupConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.ForwardGroupConfig.ServerGroupStickySession;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.ForwardGroupConfig.ServerGroupTuple;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.InsertHeaderConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.RedirectConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.RemoveHeaderConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.RewriteConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.TrafficLimitConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.TrafficMirrorConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.TrafficMirrorConfig.MirrorGroupConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Action.TrafficMirrorConfig.MirrorGroupConfig.ServerGroupTuple2;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.CookieConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.CookieConfig.Value;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.HeaderConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.HostConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.MethodConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.PathConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.QueryStringConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.QueryStringConfig.Value8;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.ResponseHeaderConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.ResponseStatusCodeConfig;
import com.aliyuncs.alb.model.v20200616.ListRulesResponse.Rule.Condition.SourceIpConfig;
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
			rule.setDirection(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].Direction"));
			rule.setServiceManagedEnabled(_ctx.booleanValue("ListRulesResponse.Rules["+ i +"].ServiceManagedEnabled"));
			rule.setServiceManagedMode(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].ServiceManagedMode"));

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

				ServerGroupStickySession serverGroupStickySession = new ServerGroupStickySession();
				serverGroupStickySession.setEnabled(_ctx.booleanValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupStickySession.Enabled"));
				serverGroupStickySession.setTimeout(_ctx.integerValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupStickySession.Timeout"));
				forwardGroupConfig.setServerGroupStickySession(serverGroupStickySession);

				List<ServerGroupTuple> serverGroupTuples = new ArrayList<ServerGroupTuple>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupTuples.Length"); k++) {
					ServerGroupTuple serverGroupTuple = new ServerGroupTuple();
					serverGroupTuple.setServerGroupId(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupTuples["+ k +"].ServerGroupId"));
					serverGroupTuple.setWeight(_ctx.integerValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupTuples["+ k +"].Weight"));

					serverGroupTuples.add(serverGroupTuple);
				}
				forwardGroupConfig.setServerGroupTuples(serverGroupTuples);
				action.setForwardGroupConfig(forwardGroupConfig);

				InsertHeaderConfig insertHeaderConfig = new InsertHeaderConfig();
				insertHeaderConfig.setCoverEnabled(_ctx.booleanValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].InsertHeaderConfig.CoverEnabled"));
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

				RemoveHeaderConfig removeHeaderConfig = new RemoveHeaderConfig();
				removeHeaderConfig.setKey(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RemoveHeaderConfig.Key"));
				action.setRemoveHeaderConfig(removeHeaderConfig);

				RewriteConfig rewriteConfig = new RewriteConfig();
				rewriteConfig.setHost(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RewriteConfig.Host"));
				rewriteConfig.setPath(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RewriteConfig.Path"));
				rewriteConfig.setQuery(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].RewriteConfig.Query"));
				action.setRewriteConfig(rewriteConfig);

				TrafficMirrorConfig trafficMirrorConfig = new TrafficMirrorConfig();
				trafficMirrorConfig.setTargetType(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].TrafficMirrorConfig.TargetType"));

				MirrorGroupConfig mirrorGroupConfig = new MirrorGroupConfig();

				List<ServerGroupTuple2> serverGroupTuples1 = new ArrayList<ServerGroupTuple2>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].TrafficMirrorConfig.MirrorGroupConfig.ServerGroupTuples.Length"); k++) {
					ServerGroupTuple2 serverGroupTuple2 = new ServerGroupTuple2();
					serverGroupTuple2.setServerGroupId(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].TrafficMirrorConfig.MirrorGroupConfig.ServerGroupTuples["+ k +"].ServerGroupId"));
					serverGroupTuple2.setWeight(_ctx.integerValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].TrafficMirrorConfig.MirrorGroupConfig.ServerGroupTuples["+ k +"].Weight"));

					serverGroupTuples1.add(serverGroupTuple2);
				}
				mirrorGroupConfig.setServerGroupTuples1(serverGroupTuples1);
				trafficMirrorConfig.setMirrorGroupConfig(mirrorGroupConfig);
				action.setTrafficMirrorConfig(trafficMirrorConfig);

				TrafficLimitConfig trafficLimitConfig = new TrafficLimitConfig();
				trafficLimitConfig.setQPS(_ctx.integerValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].TrafficLimitConfig.QPS"));
				trafficLimitConfig.setPerIpQps(_ctx.integerValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].TrafficLimitConfig.PerIpQps"));
				action.setTrafficLimitConfig(trafficLimitConfig);

				CorsConfig corsConfig = new CorsConfig();
				corsConfig.setAllowCredentials(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.AllowCredentials"));
				corsConfig.setMaxAge(_ctx.longValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.MaxAge"));

				List<String> allowOrigin = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.AllowOrigin.Length"); k++) {
					allowOrigin.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.AllowOrigin["+ k +"]"));
				}
				corsConfig.setAllowOrigin(allowOrigin);

				List<String> allowMethods = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.AllowMethods.Length"); k++) {
					allowMethods.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.AllowMethods["+ k +"]"));
				}
				corsConfig.setAllowMethods(allowMethods);

				List<String> allowHeaders = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.AllowHeaders.Length"); k++) {
					allowHeaders.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.AllowHeaders["+ k +"]"));
				}
				corsConfig.setAllowHeaders(allowHeaders);

				List<String> exposeHeaders = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.ExposeHeaders.Length"); k++) {
					exposeHeaders.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleActions["+ j +"].CorsConfig.ExposeHeaders["+ k +"]"));
				}
				corsConfig.setExposeHeaders(exposeHeaders);
				action.setCorsConfig(corsConfig);

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

				SourceIpConfig sourceIpConfig = new SourceIpConfig();

				List<String> values9 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].SourceIpConfig.Values.Length"); k++) {
					values9.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].SourceIpConfig.Values["+ k +"]"));
				}
				sourceIpConfig.setValues9(values9);
				condition.setSourceIpConfig(sourceIpConfig);

				ResponseStatusCodeConfig responseStatusCodeConfig = new ResponseStatusCodeConfig();

				List<String> values10 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].ResponseStatusCodeConfig.Values.Length"); k++) {
					values10.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].ResponseStatusCodeConfig.Values["+ k +"]"));
				}
				responseStatusCodeConfig.setValues10(values10);
				condition.setResponseStatusCodeConfig(responseStatusCodeConfig);

				ResponseHeaderConfig responseHeaderConfig = new ResponseHeaderConfig();
				responseHeaderConfig.setKey(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].ResponseHeaderConfig.Key"));

				List<String> values11 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].ResponseHeaderConfig.Values.Length"); k++) {
					values11.add(_ctx.stringValue("ListRulesResponse.Rules["+ i +"].RuleConditions["+ j +"].ResponseHeaderConfig.Values["+ k +"]"));
				}
				responseHeaderConfig.setValues11(values11);
				condition.setResponseHeaderConfig(responseHeaderConfig);

				ruleConditions.add(condition);
			}
			rule.setRuleConditions(ruleConditions);

			rules.add(rule);
		}
		listRulesResponse.setRules(rules);
	 
	 	return listRulesResponse;
	}
}