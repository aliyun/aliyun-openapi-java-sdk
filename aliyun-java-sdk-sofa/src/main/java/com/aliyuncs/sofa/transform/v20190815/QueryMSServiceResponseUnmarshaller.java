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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMSServiceResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMSServiceResponse.ServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMSServiceResponseUnmarshaller {

	public static QueryMSServiceResponse unmarshall(QueryMSServiceResponse queryMSServiceResponse, UnmarshallerContext _ctx) {
		
		queryMSServiceResponse.setRequestId(_ctx.stringValue("QueryMSServiceResponse.RequestId"));
		queryMSServiceResponse.setPageNum(_ctx.longValue("QueryMSServiceResponse.PageNum"));
		queryMSServiceResponse.setPageSize(_ctx.longValue("QueryMSServiceResponse.PageSize"));
		queryMSServiceResponse.setTotalCount(_ctx.longValue("QueryMSServiceResponse.TotalCount"));

		List<ServicesItem> services = new ArrayList<ServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMSServiceResponse.Services.Length"); i++) {
			ServicesItem servicesItem = new ServicesItem();
			servicesItem.setDataId(_ctx.stringValue("QueryMSServiceResponse.Services["+ i +"].DataId"));

			services.add(servicesItem);
		}
		queryMSServiceResponse.setServices(services);
	 
	 	return queryMSServiceResponse;
	}
}