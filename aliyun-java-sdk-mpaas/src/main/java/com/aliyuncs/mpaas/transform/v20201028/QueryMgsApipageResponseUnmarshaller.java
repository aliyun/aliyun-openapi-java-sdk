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

import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.ApiInvoker;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.ApiInvoker.HttpInvoker;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.CacheRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.CircuitBreakerRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.HeaderRuleItem;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.HeaderRulesItem;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.LimitRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.MigrateRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.MockRule;
import com.aliyuncs.mpaas.model.v20201028.QueryMgsApipageResponse.ResultContent.ListItem.RequestParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMgsApipageResponseUnmarshaller {

	public static QueryMgsApipageResponse unmarshall(QueryMgsApipageResponse queryMgsApipageResponse, UnmarshallerContext _ctx) {
		
		queryMgsApipageResponse.setRequestId(_ctx.stringValue("QueryMgsApipageResponse.RequestId"));
		queryMgsApipageResponse.setResultMessage(_ctx.stringValue("QueryMgsApipageResponse.ResultMessage"));
		queryMgsApipageResponse.setResultCode(_ctx.stringValue("QueryMgsApipageResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setPageSize(_ctx.longValue("QueryMgsApipageResponse.ResultContent.PageSize"));
		resultContent.setCurrent(_ctx.longValue("QueryMgsApipageResponse.ResultContent.Current"));
		resultContent.setTotal(_ctx.longValue("QueryMgsApipageResponse.ResultContent.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMgsApipageResponse.ResultContent.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTimeout(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Timeout"));
			listItem.setContentType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ContentType"));
			listItem.setAuthRuleName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].AuthRuleName"));
			listItem.setApiType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiType"));
			listItem.setGmtModified(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].GmtModified"));
			listItem.setOperationType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].OperationType"));
			listItem.setRequestBodyModel(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestBodyModel"));
			listItem.setDescription(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Description"));
			listItem.setResponseBodyModel(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ResponseBodyModel"));
			listItem.setAppId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].AppId"));
			listItem.setCharset(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Charset"));
			listItem.setNeedEncrypt(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].NeedEncrypt"));
			listItem.setSysId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].SysId"));
			listItem.setParamGetMethod(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ParamGetMethod"));
			listItem.setApiStatus(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiStatus"));
			listItem.setHost(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Host"));
			listItem.setBizMethod(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Method"));
			listItem.setNeedETag(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].NeedETag"));
			listItem.setMethodName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MethodName"));
			listItem.setWorkspaceId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].WorkspaceId"));
			listItem.setNeedSign(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].NeedSign"));
			listItem.setGmtCreate(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].GmtCreate"));
			listItem.setPath(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Path"));
			listItem.setSysName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].SysName"));
			listItem.setInterfaceType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].InterfaceType"));
			listItem.setNeedJsonp(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].NeedJsonp"));
			listItem.setApiName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiName"));
			listItem.setId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Id"));

			ApiInvoker apiInvoker = new ApiInvoker();
			apiInvoker.setRpcInvoker(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.RpcInvoker"));

			HttpInvoker httpInvoker = new HttpInvoker();
			httpInvoker.setPath(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.Path"));
			httpInvoker.setBizMethod(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.Method"));
			httpInvoker.setHost(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.Host"));
			httpInvoker.setContentType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.ContentType"));
			httpInvoker.setCharset(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.Charset"));
			apiInvoker.setHttpInvoker(httpInvoker);
			listItem.setApiInvoker(apiInvoker);

			CacheRule cacheRule = new CacheRule();
			cacheRule.setTtl(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CacheRule.Ttl"));
			cacheRule.setCacheKey(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CacheRule.CacheKey"));
			cacheRule.setNeedCache(_ctx.booleanValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CacheRule.NeedCache"));
			listItem.setCacheRule(cacheRule);

			LimitRule limitRule = new LimitRule();
			limitRule.setDefaultResponse(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.DefaultResponse"));
			limitRule.setMode(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.Mode"));
			limitRule.setInterval(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.Interval"));
			limitRule.setLimit(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.Limit"));
			limitRule.setI18nResponse(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.I18nResponse"));
			listItem.setLimitRule(limitRule);

			MigrateRule migrateRule = new MigrateRule();
			migrateRule.setFlowPercent(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.FlowPercent"));
			migrateRule.setNeedMigrate(_ctx.booleanValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.NeedMigrate"));
			migrateRule.setSysId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.SysId"));
			migrateRule.setUpstreamType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.UpstreamType"));
			migrateRule.setSysName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.SysName"));
			migrateRule.setNeedSwitchCompletely(_ctx.booleanValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.NeedSwitchCompletely"));
			listItem.setMigrateRule(migrateRule);

			MockRule mockRule = new MockRule();
			mockRule.setType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MockRule.Type"));
			mockRule.setNeedMock(_ctx.booleanValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MockRule.NeedMock"));
			mockRule.setMockData(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MockRule.MockData"));
			mockRule.setPercentage(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MockRule.Percentage"));
			listItem.setMockRule(mockRule);

			CircuitBreakerRule circuitBreakerRule = new CircuitBreakerRule();
			circuitBreakerRule.setAppId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.AppId"));
			circuitBreakerRule.setWorkspaceId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.WorkspaceId"));
			circuitBreakerRule.setId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.Id"));
			circuitBreakerRule.setModel(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.Model"));
			circuitBreakerRule.setSwitchStatus(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.SwitchStatus"));
			circuitBreakerRule.setErrorThreshold(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.ErrorThreshold"));
			circuitBreakerRule.setWindowsInSeconds(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.WindowsInSeconds"));
			circuitBreakerRule.setOpenTimeoutSeconds(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.OpenTimeoutSeconds"));
			circuitBreakerRule.setDefaultResponse(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.DefaultResponse"));
			circuitBreakerRule.setSlowRatioThreshold(_ctx.doubleValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CircuitBreakerRule.SlowRatioThreshold"));
			listItem.setCircuitBreakerRule(circuitBreakerRule);

			List<HeaderRuleItem> headerRule = new ArrayList<HeaderRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule.Length"); j++) {
				HeaderRuleItem headerRuleItem = new HeaderRuleItem();
				headerRuleItem.setType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule["+ j +"].Type"));
				headerRuleItem.setValue(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule["+ j +"].Value"));
				headerRuleItem.setLocation(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule["+ j +"].Location"));
				headerRuleItem.setHeaderKey(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule["+ j +"].HeaderKey"));

				headerRule.add(headerRuleItem);
			}
			listItem.setHeaderRule(headerRule);

			List<HeaderRulesItem> headerRules = new ArrayList<HeaderRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules.Length"); j++) {
				HeaderRulesItem headerRulesItem = new HeaderRulesItem();
				headerRulesItem.setType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules["+ j +"].Type"));
				headerRulesItem.setValue(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules["+ j +"].Value"));
				headerRulesItem.setLocation(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules["+ j +"].Location"));
				headerRulesItem.setHeaderKey(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules["+ j +"].HeaderKey"));

				headerRules.add(headerRulesItem);
			}
			listItem.setHeaderRules(headerRules);

			List<RequestParamsItem> requestParams = new ArrayList<RequestParamsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams.Length"); j++) {
				RequestParamsItem requestParamsItem = new RequestParamsItem();
				requestParamsItem.setType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Type"));
				requestParamsItem.setApiId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].ApiId"));
				requestParamsItem.setWorkspaceId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].WorkspaceId"));
				requestParamsItem.setDescription(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Description"));
				requestParamsItem.setAppId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].AppId"));
				requestParamsItem.setName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Name"));
				requestParamsItem.setDefaultValue(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].DefaultValue"));
				requestParamsItem.setLocation(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Location"));
				requestParamsItem.setId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Id"));
				requestParamsItem.setRefType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].RefType"));

				requestParams.add(requestParamsItem);
			}
			listItem.setRequestParams(requestParams);

			list.add(listItem);
		}
		resultContent.setList(list);
		queryMgsApipageResponse.setResultContent(resultContent);
	 
	 	return queryMgsApipageResponse;
	}
}