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

package com.aliyuncs.beian.transform.v20160810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.beian.model.v20160810.QueryAccessorDomainListResponse;
import com.aliyuncs.beian.model.v20160810.QueryAccessorDomainListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccessorDomainListResponseUnmarshaller {

	public static QueryAccessorDomainListResponse unmarshall(QueryAccessorDomainListResponse queryAccessorDomainListResponse, UnmarshallerContext _ctx) {
		
		queryAccessorDomainListResponse.setRequestId(_ctx.stringValue("QueryAccessorDomainListResponse.RequestId"));
		queryAccessorDomainListResponse.setCode(_ctx.integerValue("QueryAccessorDomainListResponse.Code"));
		queryAccessorDomainListResponse.setMessage(_ctx.stringValue("QueryAccessorDomainListResponse.Message"));

		Data data = new Data();

		List<String> domains = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryAccessorDomainListResponse.Data.Domains.Length"); i++) {
			domains.add(_ctx.stringValue("QueryAccessorDomainListResponse.Data.Domains["+ i +"]"));
		}
		data.setDomains(domains);
		queryAccessorDomainListResponse.setData(data);
	 
	 	return queryAccessorDomainListResponse;
	}
}