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

package com.aliyuncs.mpaas.transform.v20190821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.ApiInvoker;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.CacheRule;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.HeaderRuleItem;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.HeaderRulesItem;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.LimitRule;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.MigrateRule;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.MockRule;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApirestResponse.ResultContent.Value.RequestParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMgsApirestResponseUnmarshaller {

	public static QueryMgsApirestResponse unmarshall(QueryMgsApirestResponse queryMgsApirestResponse, UnmarshallerContext _ctx) {
		
		queryMgsApirestResponse.setRequestId(_ctx.stringValue("QueryMgsApirestResponse.RequestId"));
		queryMgsApirestResponse.setResultCode(_ctx.stringValue("QueryMgsApirestResponse.ResultCode"));
		queryMgsApirestResponse.setResultMessage(_ctx.stringValue("QueryMgsApirestResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setErrorMessage(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.ErrorMessage"));
		resultContent.setSuccess(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Success"));

		Value value = new Value();
		value.setApiName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiName"));
		value.setApiStatus(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiStatus"));
		value.setApiType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiType"));
		value.setAppId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.AppId"));
		value.setAuthRuleName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.AuthRuleName"));
		value.setCharset(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Charset"));
		value.setContentType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ContentType"));
		value.setDescription(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Description"));
		value.setGmtCreate(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.GmtCreate"));
		value.setGmtModified(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.GmtModified"));
		value.setHost(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Host"));
		value.setId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.Id"));
		value.setInterfaceType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.InterfaceType"));
		value.setBizMethod(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Method"));
		value.setMethodName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MethodName"));
		value.setNeedEncrypt(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.NeedEncrypt"));
		value.setNeedETag(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.NeedETag"));
		value.setNeedJsonp(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.NeedJsonp"));
		value.setNeedSign(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.NeedSign"));
		value.setOperationType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.OperationType"));
		value.setParamGetMethod(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ParamGetMethod"));
		value.setPath(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Path"));
		value.setRequestBodyModel(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestBodyModel"));
		value.setResponseBodyModel(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ResponseBodyModel"));
		value.setSysId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.SysId"));
		value.setSysName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.SysName"));
		value.setTimeout(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.Timeout"));
		value.setWorkspaceId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.WorkspaceId"));

		ApiInvoker apiInvoker = new ApiInvoker();
		apiInvoker.setRpcInvoker(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.RpcInvoker"));

		HttpInvoker httpInvoker = new HttpInvoker();
		httpInvoker.setCharset(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.Charset"));
		httpInvoker.setContentType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.ContentType"));
		httpInvoker.setHost(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.Host"));
		httpInvoker.setBizMethod(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.Method"));
		httpInvoker.setPath(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.ApiInvoker.HttpInvoker.Path"));
		apiInvoker.setHttpInvoker(httpInvoker);
		value.setApiInvoker(apiInvoker);

		CacheRule cacheRule = new CacheRule();
		cacheRule.setCacheKey(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.CacheRule.CacheKey"));
		cacheRule.setNeedCache(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.CacheRule.NeedCache"));
		cacheRule.setTtl(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.CacheRule.Ttl"));
		value.setCacheRule(cacheRule);

		LimitRule limitRule = new LimitRule();
		limitRule.setDefaultResponse(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.DefaultResponse"));
		limitRule.setI18nResponse(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.I18nResponse"));
		limitRule.setInterval(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.Interval"));
		limitRule.setLimit(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.Limit"));
		limitRule.setMode(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.LimitRule.Mode"));
		value.setLimitRule(limitRule);

		MigrateRule migrateRule = new MigrateRule();
		migrateRule.setFlowPercent(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.FlowPercent"));
		migrateRule.setNeedMigrate(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.NeedMigrate"));
		migrateRule.setNeedSwitchCompletely(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.NeedSwitchCompletely"));
		migrateRule.setSysId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.SysId"));
		migrateRule.setSysName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.SysName"));
		migrateRule.setUpstreamType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MigrateRule.UpstreamType"));
		value.setMigrateRule(migrateRule);

		MockRule mockRule = new MockRule();
		mockRule.setMockData(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MockRule.MockData"));
		mockRule.setNeedMock(_ctx.booleanValue("QueryMgsApirestResponse.ResultContent.Value.MockRule.NeedMock"));
		mockRule.setPercentage(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.MockRule.Percentage"));
		mockRule.setType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.MockRule.Type"));
		value.setMockRule(mockRule);

		List<HeaderRuleItem> headerRule = new ArrayList<HeaderRuleItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule.Length"); i++) {
			HeaderRuleItem headerRuleItem = new HeaderRuleItem();
			headerRuleItem.setHeaderKey(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule["+ i +"].HeaderKey"));
			headerRuleItem.setLocation(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule["+ i +"].Location"));
			headerRuleItem.setType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule["+ i +"].Type"));
			headerRuleItem.setValue(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRule["+ i +"].Value"));

			headerRule.add(headerRuleItem);
		}
		value.setHeaderRule(headerRule);

		List<HeaderRulesItem> headerRules = new ArrayList<HeaderRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules.Length"); i++) {
			HeaderRulesItem headerRulesItem = new HeaderRulesItem();
			headerRulesItem.setHeaderKey(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules["+ i +"].HeaderKey"));
			headerRulesItem.setLocation(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules["+ i +"].Location"));
			headerRulesItem.setType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules["+ i +"].Type"));
			headerRulesItem.setValue(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.HeaderRules["+ i +"].Value"));

			headerRules.add(headerRulesItem);
		}
		value.setHeaderRules(headerRules);

		List<RequestParamsItem> requestParams = new ArrayList<RequestParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams.Length"); i++) {
			RequestParamsItem requestParamsItem = new RequestParamsItem();
			requestParamsItem.setApiId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].ApiId"));
			requestParamsItem.setAppId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].AppId"));
			requestParamsItem.setDefaultValue(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].DefaultValue"));
			requestParamsItem.setDescription(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Description"));
			requestParamsItem.setId(_ctx.longValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Id"));
			requestParamsItem.setLocation(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Location"));
			requestParamsItem.setName(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Name"));
			requestParamsItem.setRefType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].RefType"));
			requestParamsItem.setType(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].Type"));
			requestParamsItem.setWorkspaceId(_ctx.stringValue("QueryMgsApirestResponse.ResultContent.Value.RequestParams["+ i +"].WorkspaceId"));

			requestParams.add(requestParamsItem);
		}
		value.setRequestParams(requestParams);
		resultContent.setValue(value);
		queryMgsApirestResponse.setResultContent(resultContent);
	 
	 	return queryMgsApirestResponse;
	}
}