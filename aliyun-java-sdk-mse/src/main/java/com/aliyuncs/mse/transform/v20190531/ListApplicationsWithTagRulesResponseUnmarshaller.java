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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListApplicationsWithTagRulesResponse;
import com.aliyuncs.mse.model.v20190531.ListApplicationsWithTagRulesResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListApplicationsWithTagRulesResponse.Data.ApplicationList;
import com.aliyuncs.mse.model.v20190531.ListApplicationsWithTagRulesResponse.Data.ApplicationList.RouteRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsWithTagRulesResponseUnmarshaller {

	public static ListApplicationsWithTagRulesResponse unmarshall(ListApplicationsWithTagRulesResponse listApplicationsWithTagRulesResponse, UnmarshallerContext _ctx) {
		
		listApplicationsWithTagRulesResponse.setRequestId(_ctx.stringValue("ListApplicationsWithTagRulesResponse.RequestId"));
		listApplicationsWithTagRulesResponse.setHttpStatusCode(_ctx.integerValue("ListApplicationsWithTagRulesResponse.HttpStatusCode"));
		listApplicationsWithTagRulesResponse.setMessage(_ctx.stringValue("ListApplicationsWithTagRulesResponse.Message"));
		listApplicationsWithTagRulesResponse.setCode(_ctx.integerValue("ListApplicationsWithTagRulesResponse.Code"));
		listApplicationsWithTagRulesResponse.setSuccess(_ctx.booleanValue("ListApplicationsWithTagRulesResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.integerValue("ListApplicationsWithTagRulesResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("ListApplicationsWithTagRulesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListApplicationsWithTagRulesResponse.Data.PageSize"));

		List<ApplicationList> result = new ArrayList<ApplicationList>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsWithTagRulesResponse.Data.Result.Length"); i++) {
			ApplicationList applicationList = new ApplicationList();
			applicationList.setAppName(_ctx.stringValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].AppName"));
			applicationList.setAppId(_ctx.stringValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].AppId"));
			applicationList.setRouteStatus(_ctx.longValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteStatus"));

			List<RouteRule> routeRules = new ArrayList<RouteRule>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules.Length"); j++) {
				RouteRule routeRule = new RouteRule();
				routeRule.setStatus(_ctx.integerValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].Status"));
				routeRule.setInstanceNum(_ctx.integerValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].InstanceNum"));
				routeRule.setRemove(_ctx.booleanValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].Remove"));
				routeRule.setCarryData(_ctx.booleanValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].CarryData"));
				routeRule.setTag(_ctx.stringValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].Tag"));
				routeRule.setName(_ctx.stringValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].Name"));
				routeRule.setRules(_ctx.stringValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].Rules"));
				routeRule.setId(_ctx.longValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].Id"));
				routeRule.setRate(_ctx.integerValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].Rate"));
				routeRule.setGmtModified(_ctx.stringValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].GmtModified"));
				routeRule.setEnable(_ctx.booleanValue("ListApplicationsWithTagRulesResponse.Data.Result["+ i +"].RouteRules["+ j +"].Enable"));

				routeRules.add(routeRule);
			}
			applicationList.setRouteRules(routeRules);

			result.add(applicationList);
		}
		data.setResult(result);
		listApplicationsWithTagRulesResponse.setData(data);
	 
	 	return listApplicationsWithTagRulesResponse;
	}
}