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

import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.ApiInvoker;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.ApiInvoker.HttpInvoker;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.CacheRule;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.HeaderRuleItem;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.HeaderRulesItem;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.LimitRule;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.MigrateRule;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.MockRule;
import com.aliyuncs.mpaas.model.v20190821.QueryMgsApipageResponse.ResultContent.ListItem.RequestParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMgsApipageResponseUnmarshaller {

	public static QueryMgsApipageResponse unmarshall(QueryMgsApipageResponse queryMgsApipageResponse, UnmarshallerContext _ctx) {
		
		queryMgsApipageResponse.setRequestId(_ctx.stringValue("QueryMgsApipageResponse.RequestId"));
		queryMgsApipageResponse.setResultCode(_ctx.stringValue("QueryMgsApipageResponse.ResultCode"));
		queryMgsApipageResponse.setResultMessage(_ctx.stringValue("QueryMgsApipageResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCurrent(_ctx.longValue("QueryMgsApipageResponse.ResultContent.Current"));
		resultContent.setPageSize(_ctx.longValue("QueryMgsApipageResponse.ResultContent.PageSize"));
		resultContent.setTotal(_ctx.longValue("QueryMgsApipageResponse.ResultContent.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMgsApipageResponse.ResultContent.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setApiName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiName"));
			listItem.setApiStatus(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiStatus"));
			listItem.setApiType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiType"));
			listItem.setAppId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].AppId"));
			listItem.setAuthRuleName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].AuthRuleName"));
			listItem.setCharset(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Charset"));
			listItem.setContentType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ContentType"));
			listItem.setDescription(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Description"));
			listItem.setGmtCreate(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].GmtModified"));
			listItem.setHost(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Host"));
			listItem.setId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Id"));
			listItem.setInterfaceType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].InterfaceType"));
			listItem.setBizMethod(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Method"));
			listItem.setMethodName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MethodName"));
			listItem.setNeedEncrypt(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].NeedEncrypt"));
			listItem.setNeedETag(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].NeedETag"));
			listItem.setNeedJsonp(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].NeedJsonp"));
			listItem.setNeedSign(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].NeedSign"));
			listItem.setOperationType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].OperationType"));
			listItem.setParamGetMethod(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ParamGetMethod"));
			listItem.setPath(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Path"));
			listItem.setRequestBodyModel(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestBodyModel"));
			listItem.setResponseBodyModel(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ResponseBodyModel"));
			listItem.setSysId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].SysId"));
			listItem.setSysName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].SysName"));
			listItem.setTimeout(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].Timeout"));
			listItem.setWorkspaceId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].WorkspaceId"));

			ApiInvoker apiInvoker = new ApiInvoker();
			apiInvoker.setRpcInvoker(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.RpcInvoker"));

			HttpInvoker httpInvoker = new HttpInvoker();
			httpInvoker.setCharset(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.Charset"));
			httpInvoker.setContentType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.ContentType"));
			httpInvoker.setHost(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.Host"));
			httpInvoker.setBizMethod(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.Method"));
			httpInvoker.setPath(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].ApiInvoker.HttpInvoker.Path"));
			apiInvoker.setHttpInvoker(httpInvoker);
			listItem.setApiInvoker(apiInvoker);

			CacheRule cacheRule = new CacheRule();
			cacheRule.setCacheKey(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CacheRule.CacheKey"));
			cacheRule.setNeedCache(_ctx.booleanValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CacheRule.NeedCache"));
			cacheRule.setTtl(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].CacheRule.Ttl"));
			listItem.setCacheRule(cacheRule);

			LimitRule limitRule = new LimitRule();
			limitRule.setDefaultResponse(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.DefaultResponse"));
			limitRule.setI18nResponse(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.I18nResponse"));
			limitRule.setInterval(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.Interval"));
			limitRule.setLimit(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.Limit"));
			limitRule.setMode(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].LimitRule.Mode"));
			listItem.setLimitRule(limitRule);

			MigrateRule migrateRule = new MigrateRule();
			migrateRule.setFlowPercent(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.FlowPercent"));
			migrateRule.setNeedMigrate(_ctx.booleanValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.NeedMigrate"));
			migrateRule.setNeedSwitchCompletely(_ctx.booleanValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.NeedSwitchCompletely"));
			migrateRule.setSysId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.SysId"));
			migrateRule.setSysName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.SysName"));
			migrateRule.setUpstreamType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MigrateRule.UpstreamType"));
			listItem.setMigrateRule(migrateRule);

			MockRule mockRule = new MockRule();
			mockRule.setMockData(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MockRule.MockData"));
			mockRule.setNeedMock(_ctx.booleanValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MockRule.NeedMock"));
			mockRule.setPercentage(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MockRule.Percentage"));
			mockRule.setType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].MockRule.Type"));
			listItem.setMockRule(mockRule);

			List<HeaderRuleItem> headerRule = new ArrayList<HeaderRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule.Length"); j++) {
				HeaderRuleItem headerRuleItem = new HeaderRuleItem();
				headerRuleItem.setHeaderKey(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule["+ j +"].HeaderKey"));
				headerRuleItem.setLocation(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule["+ j +"].Location"));
				headerRuleItem.setType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule["+ j +"].Type"));
				headerRuleItem.setValue(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRule["+ j +"].Value"));

				headerRule.add(headerRuleItem);
			}
			listItem.setHeaderRule(headerRule);

			List<HeaderRulesItem> headerRules = new ArrayList<HeaderRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules.Length"); j++) {
				HeaderRulesItem headerRulesItem = new HeaderRulesItem();
				headerRulesItem.setHeaderKey(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules["+ j +"].HeaderKey"));
				headerRulesItem.setLocation(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules["+ j +"].Location"));
				headerRulesItem.setType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules["+ j +"].Type"));
				headerRulesItem.setValue(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].HeaderRules["+ j +"].Value"));

				headerRules.add(headerRulesItem);
			}
			listItem.setHeaderRules(headerRules);

			List<RequestParamsItem> requestParams = new ArrayList<RequestParamsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams.Length"); j++) {
				RequestParamsItem requestParamsItem = new RequestParamsItem();
				requestParamsItem.setApiId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].ApiId"));
				requestParamsItem.setAppId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].AppId"));
				requestParamsItem.setDefaultValue(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].DefaultValue"));
				requestParamsItem.setDescription(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Description"));
				requestParamsItem.setId(_ctx.longValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Id"));
				requestParamsItem.setLocation(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Location"));
				requestParamsItem.setName(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Name"));
				requestParamsItem.setRefType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].RefType"));
				requestParamsItem.setType(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].Type"));
				requestParamsItem.setWorkspaceId(_ctx.stringValue("QueryMgsApipageResponse.ResultContent.List["+ i +"].RequestParams["+ j +"].WorkspaceId"));

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