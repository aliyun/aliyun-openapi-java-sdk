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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryDashboardNl2sqlResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDashboardNl2sqlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDashboardNl2sqlResponseUnmarshaller {

	public static QueryDashboardNl2sqlResponse unmarshall(QueryDashboardNl2sqlResponse queryDashboardNl2sqlResponse, UnmarshallerContext _ctx) {
		
		queryDashboardNl2sqlResponse.setRequestId(_ctx.stringValue("QueryDashboardNl2sqlResponse.RequestId"));
		queryDashboardNl2sqlResponse.setSuccess(_ctx.booleanValue("QueryDashboardNl2sqlResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryDashboardNl2sqlResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setDashboardName(_ctx.stringValue("QueryDashboardNl2sqlResponse.Result["+ i +"].DashboardName"));
			data.setDashboardNl2sqlId(_ctx.stringValue("QueryDashboardNl2sqlResponse.Result["+ i +"].DashboardNl2sqlId"));
			data.setOwnerId(_ctx.stringValue("QueryDashboardNl2sqlResponse.Result["+ i +"].OwnerId"));

			List<String> authorities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryDashboardNl2sqlResponse.Result["+ i +"].Authorities.Length"); j++) {
				authorities.add(_ctx.stringValue("QueryDashboardNl2sqlResponse.Result["+ i +"].Authorities["+ j +"]"));
			}
			data.setAuthorities(authorities);

			result.add(data);
		}
		queryDashboardNl2sqlResponse.setResult(result);
	 
	 	return queryDashboardNl2sqlResponse;
	}
}