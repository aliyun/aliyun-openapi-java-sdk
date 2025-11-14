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

import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.ApiInvoker;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.ApiInvoker.HttpInvoker;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.CacheRule;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.CircuitBreakerRule;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.HeaderRuleItem;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.HeaderRulesItem;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.LimitRule;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.MigrateRule;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.MockRule;
import com.aliyuncs.mpaas.model.v20201028.ListMgsApiResponse.ResultContent.ValueItem.RequestParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMgsApiResponseUnmarshaller {

	public static ListMgsApiResponse unmarshall(ListMgsApiResponse listMgsApiResponse, UnmarshallerContext _ctx) {
		
		listMgsApiResponse.setRequestId(_ctx.stringValue("ListMgsApiResponse.RequestId"));
		listMgsApiResponse.setResultMessage(_ctx.stringValue("ListMgsApiResponse.ResultMessage"));
		listMgsApiResponse.setResultCode(_ctx.stringValue("ListMgsApiResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setSuccess(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Success"));
		resultContent.setErrorMessage(_ctx.stringValue("ListMgsApiResponse.ResultContent.ErrorMessage"));

		List<ValueItem> value = new ArrayList<ValueItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMgsApiResponse.ResultContent.Value.Length"); i++) {
			ValueItem valueItem = new ValueItem();
			valueItem.setTimeout(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Timeout"));
			valueItem.setContentType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ContentType"));
			valueItem.setAuthRuleName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].AuthRuleName"));
			valueItem.setApiType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiType"));
			valueItem.setGmtModified(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].GmtModified"));
			valueItem.setOperationType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].OperationType"));
			valueItem.setRequestBodyModel(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestBodyModel"));
			valueItem.setDescription(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Description"));
			valueItem.setResponseBodyModel(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ResponseBodyModel"));
			valueItem.setAppId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].AppId"));
			valueItem.setCharset(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Charset"));
			valueItem.setNeedEncrypt(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].NeedEncrypt"));
			valueItem.setSysId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].SysId"));
			valueItem.setParamGetMethod(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ParamGetMethod"));
			valueItem.setApiStatus(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiStatus"));
			valueItem.setHost(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Host"));
			valueItem.setBizMethod(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Method"));
			valueItem.setNeedETag(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].NeedETag"));
			valueItem.setMethodName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MethodName"));
			valueItem.setWorkspaceId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].WorkspaceId"));
			valueItem.setNeedSign(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].NeedSign"));
			valueItem.setGmtCreate(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].GmtCreate"));
			valueItem.setPath(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Path"));
			valueItem.setSysName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].SysName"));
			valueItem.setInterfaceType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].InterfaceType"));
			valueItem.setNeedJsonp(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].NeedJsonp"));
			valueItem.setApiName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiName"));
			valueItem.setId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Id"));

			ApiInvoker apiInvoker = new ApiInvoker();
			apiInvoker.setRpcInvoker(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.RpcInvoker"));

			HttpInvoker httpInvoker = new HttpInvoker();
			httpInvoker.setPath(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.Path"));
			httpInvoker.setBizMethod(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.Method"));
			httpInvoker.setHost(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.Host"));
			httpInvoker.setContentType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.ContentType"));
			httpInvoker.setCharset(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.Charset"));
			apiInvoker.setHttpInvoker(httpInvoker);
			valueItem.setApiInvoker(apiInvoker);

			CacheRule cacheRule = new CacheRule();
			cacheRule.setTtl(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CacheRule.Ttl"));
			cacheRule.setCacheKey(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CacheRule.CacheKey"));
			cacheRule.setNeedCache(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CacheRule.NeedCache"));
			valueItem.setCacheRule(cacheRule);

			LimitRule limitRule = new LimitRule();
			limitRule.setDefaultResponse(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.DefaultResponse"));
			limitRule.setMode(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.Mode"));
			limitRule.setInterval(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.Interval"));
			limitRule.setLimit(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.Limit"));
			limitRule.setI18nResponse(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.I18nResponse"));
			valueItem.setLimitRule(limitRule);

			MigrateRule migrateRule = new MigrateRule();
			migrateRule.setFlowPercent(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.FlowPercent"));
			migrateRule.setNeedMigrate(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.NeedMigrate"));
			migrateRule.setSysId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.SysId"));
			migrateRule.setUpstreamType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.UpstreamType"));
			migrateRule.setSysName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.SysName"));
			migrateRule.setNeedSwitchCompletely(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.NeedSwitchCompletely"));
			valueItem.setMigrateRule(migrateRule);

			MockRule mockRule = new MockRule();
			mockRule.setType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MockRule.Type"));
			mockRule.setNeedMock(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MockRule.NeedMock"));
			mockRule.setMockData(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MockRule.MockData"));
			mockRule.setPercentage(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MockRule.Percentage"));
			valueItem.setMockRule(mockRule);

			CircuitBreakerRule circuitBreakerRule = new CircuitBreakerRule();
			circuitBreakerRule.setAppId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.AppId"));
			circuitBreakerRule.setWorkspaceId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.WorkspaceId"));
			circuitBreakerRule.setId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.Id"));
			circuitBreakerRule.setModel(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.Model"));
			circuitBreakerRule.setSwitchStatus(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.SwitchStatus"));
			circuitBreakerRule.setErrorThreshold(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.ErrorThreshold"));
			circuitBreakerRule.setWindowsInSeconds(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.WindowsInSeconds"));
			circuitBreakerRule.setOpenTimeoutSeconds(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.OpenTimeoutSeconds"));
			circuitBreakerRule.setDefaultResponse(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.DefaultResponse"));
			circuitBreakerRule.setSlowRatioThreshold(_ctx.doubleValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CircuitBreakerRule.SlowRatioThreshold"));
			valueItem.setCircuitBreakerRule(circuitBreakerRule);

			List<HeaderRuleItem> headerRule = new ArrayList<HeaderRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule.Length"); j++) {
				HeaderRuleItem headerRuleItem = new HeaderRuleItem();
				headerRuleItem.setType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule["+ j +"].Type"));
				headerRuleItem.setValue(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule["+ j +"].Value"));
				headerRuleItem.setLocation(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule["+ j +"].Location"));
				headerRuleItem.setHeaderKey(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule["+ j +"].HeaderKey"));

				headerRule.add(headerRuleItem);
			}
			valueItem.setHeaderRule(headerRule);

			List<HeaderRulesItem> headerRules = new ArrayList<HeaderRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules.Length"); j++) {
				HeaderRulesItem headerRulesItem = new HeaderRulesItem();
				headerRulesItem.setType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules["+ j +"].Type"));
				headerRulesItem.setValue(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules["+ j +"].Value"));
				headerRulesItem.setLocation(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules["+ j +"].Location"));
				headerRulesItem.setHeaderKey(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules["+ j +"].HeaderKey"));

				headerRules.add(headerRulesItem);
			}
			valueItem.setHeaderRules(headerRules);

			List<RequestParamsItem> requestParams = new ArrayList<RequestParamsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams.Length"); j++) {
				RequestParamsItem requestParamsItem = new RequestParamsItem();
				requestParamsItem.setType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Type"));
				requestParamsItem.setApiId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].ApiId"));
				requestParamsItem.setWorkspaceId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].WorkspaceId"));
				requestParamsItem.setDescription(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Description"));
				requestParamsItem.setAppId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].AppId"));
				requestParamsItem.setName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Name"));
				requestParamsItem.setDefaultValue(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].DefaultValue"));
				requestParamsItem.setLocation(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Location"));
				requestParamsItem.setId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Id"));
				requestParamsItem.setRefType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].RefType"));

				requestParams.add(requestParamsItem);
			}
			valueItem.setRequestParams(requestParams);

			value.add(valueItem);
		}
		resultContent.setValue(value);
		listMgsApiResponse.setResultContent(resultContent);
	 
	 	return listMgsApiResponse;
	}
}