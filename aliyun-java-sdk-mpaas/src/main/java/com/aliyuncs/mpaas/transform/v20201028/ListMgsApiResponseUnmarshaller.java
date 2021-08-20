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
		listMgsApiResponse.setResultCode(_ctx.stringValue("ListMgsApiResponse.ResultCode"));
		listMgsApiResponse.setResultMessage(_ctx.stringValue("ListMgsApiResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setErrorMessage(_ctx.stringValue("ListMgsApiResponse.ResultContent.ErrorMessage"));
		resultContent.setSuccess(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Success"));

		List<ValueItem> value = new ArrayList<ValueItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMgsApiResponse.ResultContent.Value.Length"); i++) {
			ValueItem valueItem = new ValueItem();
			valueItem.setApiName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiName"));
			valueItem.setApiStatus(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiStatus"));
			valueItem.setApiType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiType"));
			valueItem.setAppId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].AppId"));
			valueItem.setAuthRuleName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].AuthRuleName"));
			valueItem.setCharset(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Charset"));
			valueItem.setContentType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ContentType"));
			valueItem.setDescription(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Description"));
			valueItem.setGmtCreate(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].GmtCreate"));
			valueItem.setGmtModified(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].GmtModified"));
			valueItem.setHost(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Host"));
			valueItem.setId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Id"));
			valueItem.setInterfaceType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].InterfaceType"));
			valueItem.setBizMethod(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Method"));
			valueItem.setMethodName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MethodName"));
			valueItem.setNeedEncrypt(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].NeedEncrypt"));
			valueItem.setNeedETag(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].NeedETag"));
			valueItem.setNeedJsonp(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].NeedJsonp"));
			valueItem.setNeedSign(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].NeedSign"));
			valueItem.setOperationType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].OperationType"));
			valueItem.setParamGetMethod(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ParamGetMethod"));
			valueItem.setPath(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Path"));
			valueItem.setRequestBodyModel(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestBodyModel"));
			valueItem.setResponseBodyModel(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ResponseBodyModel"));
			valueItem.setSysId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].SysId"));
			valueItem.setSysName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].SysName"));
			valueItem.setTimeout(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].Timeout"));
			valueItem.setWorkspaceId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].WorkspaceId"));

			ApiInvoker apiInvoker = new ApiInvoker();
			apiInvoker.setRpcInvoker(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.RpcInvoker"));

			HttpInvoker httpInvoker = new HttpInvoker();
			httpInvoker.setCharset(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.Charset"));
			httpInvoker.setContentType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.ContentType"));
			httpInvoker.setHost(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.Host"));
			httpInvoker.setBizMethod(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.Method"));
			httpInvoker.setPath(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].ApiInvoker.HttpInvoker.Path"));
			apiInvoker.setHttpInvoker(httpInvoker);
			valueItem.setApiInvoker(apiInvoker);

			CacheRule cacheRule = new CacheRule();
			cacheRule.setCacheKey(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CacheRule.CacheKey"));
			cacheRule.setNeedCache(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CacheRule.NeedCache"));
			cacheRule.setTtl(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].CacheRule.Ttl"));
			valueItem.setCacheRule(cacheRule);

			LimitRule limitRule = new LimitRule();
			limitRule.setDefaultResponse(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.DefaultResponse"));
			limitRule.setI18nResponse(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.I18nResponse"));
			limitRule.setInterval(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.Interval"));
			limitRule.setLimit(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.Limit"));
			limitRule.setMode(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].LimitRule.Mode"));
			valueItem.setLimitRule(limitRule);

			MigrateRule migrateRule = new MigrateRule();
			migrateRule.setFlowPercent(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.FlowPercent"));
			migrateRule.setNeedMigrate(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.NeedMigrate"));
			migrateRule.setNeedSwitchCompletely(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.NeedSwitchCompletely"));
			migrateRule.setSysId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.SysId"));
			migrateRule.setSysName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.SysName"));
			migrateRule.setUpstreamType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MigrateRule.UpstreamType"));
			valueItem.setMigrateRule(migrateRule);

			MockRule mockRule = new MockRule();
			mockRule.setMockData(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MockRule.MockData"));
			mockRule.setNeedMock(_ctx.booleanValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MockRule.NeedMock"));
			mockRule.setPercentage(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MockRule.Percentage"));
			mockRule.setType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].MockRule.Type"));
			valueItem.setMockRule(mockRule);

			List<HeaderRuleItem> headerRule = new ArrayList<HeaderRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule.Length"); j++) {
				HeaderRuleItem headerRuleItem = new HeaderRuleItem();
				headerRuleItem.setHeaderKey(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule["+ j +"].HeaderKey"));
				headerRuleItem.setLocation(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule["+ j +"].Location"));
				headerRuleItem.setType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule["+ j +"].Type"));
				headerRuleItem.setValue(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRule["+ j +"].Value"));

				headerRule.add(headerRuleItem);
			}
			valueItem.setHeaderRule(headerRule);

			List<HeaderRulesItem> headerRules = new ArrayList<HeaderRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules.Length"); j++) {
				HeaderRulesItem headerRulesItem = new HeaderRulesItem();
				headerRulesItem.setHeaderKey(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules["+ j +"].HeaderKey"));
				headerRulesItem.setLocation(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules["+ j +"].Location"));
				headerRulesItem.setType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules["+ j +"].Type"));
				headerRulesItem.setValue(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].HeaderRules["+ j +"].Value"));

				headerRules.add(headerRulesItem);
			}
			valueItem.setHeaderRules(headerRules);

			List<RequestParamsItem> requestParams = new ArrayList<RequestParamsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams.Length"); j++) {
				RequestParamsItem requestParamsItem = new RequestParamsItem();
				requestParamsItem.setApiId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].ApiId"));
				requestParamsItem.setAppId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].AppId"));
				requestParamsItem.setDefaultValue(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].DefaultValue"));
				requestParamsItem.setDescription(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Description"));
				requestParamsItem.setId(_ctx.longValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Id"));
				requestParamsItem.setLocation(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Location"));
				requestParamsItem.setName(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Name"));
				requestParamsItem.setRefType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].RefType"));
				requestParamsItem.setType(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].Type"));
				requestParamsItem.setWorkspaceId(_ctx.stringValue("ListMgsApiResponse.ResultContent.Value["+ i +"].RequestParams["+ j +"].WorkspaceId"));

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