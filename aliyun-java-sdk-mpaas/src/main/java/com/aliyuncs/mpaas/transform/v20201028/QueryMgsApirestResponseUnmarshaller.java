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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.ApiInvoker;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.CacheRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.DefaultLimitRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.HeaderRuleItem;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.HeaderRulesItem;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.LimitRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.MigrateRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.MockRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApirestResponse.ResultContent.Value.RequestParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMgsApirestResponseUnmarshaller {

	public static QueryMgsApirestResponse unmarshall(QueryMgsApirestResponse queryMgsApirestResponse, UnmarshallerContext _ctx) {
		
		queryMgsApirestResponse.setRequestId(_ctx.stringValue("QueryMgsApirestResponse.RequestId"));
		queryMgsApirestResponse.setResultMessage(_ctx.stringValue("QueryMgsApirestResponse.ResultMessage"));
		queryMgsApirestResponse.setResultCode(_ctx.stringValue("QueryMgsApirestResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setSuccess(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Success"));
		resultContent.setErrorMessage(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.ErrorMessage"));

		Value value = new Value();
		value.setTimeout(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Timeout"));
		value.setContentType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ContentType"));
		value.setAuthRuleName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.AuthRuleName"));
		value.setApiType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiType"));
		value.setGmtModified(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.GmtModified"));
		value.setOperationType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.OperationType"));
		value.setRequestBodyModel(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestBodyModel"));
		value.setDescription(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Description"));
		value.setResponseBodyModel(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ResponseBodyModel"));
		value.setAppId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.AppId"));
		value.setCharset(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Charset"));
		value.setNeedEncrypt(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.NeedEncrypt"));
		value.setSysId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.SysId"));
		value.setParamGetMethod(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ParamGetMethod"));
		value.setApiStatus(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiStatus"));
		value.setHost(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Host"));
		value.setBizMethod(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Method"));
		value.setNeedETag(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.NeedETag"));
		value.setMethodName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MethodName"));
		value.setWorkspaceId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.WorkspaceId"));
		value.setNeedSign(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.NeedSign"));
		value.setGmtCreate(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.GmtCreate"));
		value.setPath(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Path"));
		value.setSysName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.SysName"));
		value.setInterfaceType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.InterfaceType"));
		value.setNeedJsonp(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.NeedJsonp"));
		value.setApiName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiName"));
		value.setId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.Id"));

		ApiInvoker apiInvoker = new ApiInvoker();
		apiInvoker.setRpcInvoker(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.RpcInvoker"));

		HttpInvoker httpInvoker = new HttpInvoker();
		httpInvoker.setPath(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.Path"));
		httpInvoker.setBizMethod(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.Method"));
		httpInvoker.setHost(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.Host"));
		httpInvoker.setContentType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.ContentType"));
		httpInvoker.setCharset(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.Charset"));
		apiInvoker.setHttpInvoker(httpInvoker);
		value.setApiInvoker(apiInvoker);

		CacheRule cacheRule = new CacheRule();
		cacheRule.setTtl(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.CacheRule.Ttl"));
		cacheRule.setCacheKey(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.CacheRule.CacheKey"));
		cacheRule.setNeedCache(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.CacheRule.NeedCache"));
		value.setCacheRule(cacheRule);

		LimitRule limitRule = new LimitRule();
		limitRule.setDefaultResponse(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.DefaultResponse"));
		limitRule.setMode(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.Mode"));
		limitRule.setInterval(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.Interval"));
		limitRule.setLimit(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.Limit"));
		limitRule.setI18nResponse(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.I18nResponse"));
		value.setLimitRule(limitRule);

		MigrateRule migrateRule = new MigrateRule();
		migrateRule.setFlowPercent(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.FlowPercent"));
		migrateRule.setNeedMigrate(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.NeedMigrate"));
		migrateRule.setSysId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.SysId"));
		migrateRule.setUpstreamType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.UpstreamType"));
		migrateRule.setSysName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.SysName"));
		migrateRule.setNeedSwitchCompletely(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.NeedSwitchCompletely"));
		value.setMigrateRule(migrateRule);

		MockRule mockRule = new MockRule();
		mockRule.setType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MockRule.Type"));
		mockRule.setNeedMock(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.MockRule.NeedMock"));
		mockRule.setMockData(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MockRule.MockData"));
		mockRule.setPercentage(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.MockRule.Percentage"));
		value.setMockRule(mockRule);

		DefaultLimitRule defaultLimitRule = new DefaultLimitRule();
		defaultLimitRule.setDefaultLimit(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.DefaultLimitRule.DefaultLimit"));
		defaultLimitRule.setConfigId(_ctx.integerValue("QueryMgsApirestResponse.ResultContent.Value.DefaultLimitRule.ConfigId"));
		value.setDefaultLimitRule(defaultLimitRule);

		CircuitBreakerRule circuitBreakerRule = new CircuitBreakerRule();
		circuitBreakerRule.setAppId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.AppId"));
		circuitBreakerRule.setWorkspaceId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.WorkspaceId"));
		circuitBreakerRule.setId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.Id"));
		circuitBreakerRule.setModel(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.Model"));
		circuitBreakerRule.setSwitchStatus(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.SwitchStatus"));
		circuitBreakerRule.setErrorThreshold(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.ErrorThreshold"));
		circuitBreakerRule.setWindowsInSeconds(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.WindowsInSeconds"));
		circuitBreakerRule.setOpenTimeoutSeconds(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.OpenTimeoutSeconds"));
		circuitBreakerRule.setDefaultResponse(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.DefaultResponse"));
		circuitBreakerRule.setSlowRatioThreshold(_ctx.doubleValue("QueryMgsApirestResponse.ResultContent.Value.CircuitBreakerRule.SlowRatioThreshold"));
		value.setCircuitBreakerRule(circuitBreakerRule);

		List<HeaderRuleItem> headerRule = new ArrayList<HeaderRuleItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule.Length"); i++) {
			HeaderRuleItem headerRuleItem = new HeaderRuleItem();
			headerRuleItem.setType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule["+ i +"].Type"));
			headerRuleItem.setValue(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule["+ i +"].Value"));
			headerRuleItem.setLocation(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule["+ i +"].Location"));
			headerRuleItem.setHeaderKey(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule["+ i +"].HeaderKey"));

			headerRule.add(headerRuleItem);
		}
		value.setHeaderRule(headerRule);

		List<HeaderRulesItem> headerRules = new ArrayList<HeaderRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules.Length"); i++) {
			HeaderRulesItem headerRulesItem = new HeaderRulesItem();
			headerRulesItem.setType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules["+ i +"].Type"));
			headerRulesItem.setValue(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules["+ i +"].Value"));
			headerRulesItem.setLocation(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules["+ i +"].Location"));
			headerRulesItem.setHeaderKey(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules["+ i +"].HeaderKey"));

			headerRules.add(headerRulesItem);
		}
		value.setHeaderRules(headerRules);

		List<RequestParamsItem> requestParams = new ArrayList<RequestParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams.Length"); i++) {
			RequestParamsItem requestParamsItem = new RequestParamsItem();
			requestParamsItem.setType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Type"));
			requestParamsItem.setApiId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].ApiId"));
			requestParamsItem.setWorkspaceId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].WorkspaceId"));
			requestParamsItem.setDescription(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Description"));
			requestParamsItem.setAppId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].AppId"));
			requestParamsItem.setName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Name"));
			requestParamsItem.setDefaultValue(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].DefaultValue"));
			requestParamsItem.setLocation(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Location"));
			requestParamsItem.setId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Id"));
			requestParamsItem.setRefType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].RefType"));

			requestParams.add(requestParamsItem);
		}
		value.setRequestParams(requestParams);
		resultContent.setValue(value);
		queryMgsApirestResponse.setResultContent(resultContent);
	 
	 	return queryMgsApirestResponse;
	}
}