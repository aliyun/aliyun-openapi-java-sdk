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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.QueryCompanyInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCompanyInfoResponseUnmarshaller {

	public static QueryCompanyInfoResponse unmarshall(QueryCompanyInfoResponse queryCompanyInfoResponse, UnmarshallerContext _ctx) {
		
		queryCompanyInfoResponse.setRequestId(_ctx.stringValue("QueryCompanyInfoResponse.RequestId"));
		queryCompanyInfoResponse.setCode(_ctx.integerValue("QueryCompanyInfoResponse.Code"));
		queryCompanyInfoResponse.setMessage(_ctx.stringValue("QueryCompanyInfoResponse.Message"));
		queryCompanyInfoResponse.setTotal(_ctx.integerValue("QueryCompanyInfoResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryCompanyInfoResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryCompanyInfoResponse.Data["+ i +"]"));
		}
		queryCompanyInfoResponse.setData(data);
	 
	 	return queryCompanyInfoResponse;
	}
}