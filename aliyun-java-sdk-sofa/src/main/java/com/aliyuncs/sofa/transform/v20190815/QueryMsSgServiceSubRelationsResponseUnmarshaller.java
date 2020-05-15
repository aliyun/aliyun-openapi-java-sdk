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

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceSubRelationsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceSubRelationsResponse.ServiceRelationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServiceSubRelationsResponseUnmarshaller {

	public static QueryMsSgServiceSubRelationsResponse unmarshall(QueryMsSgServiceSubRelationsResponse queryMsSgServiceSubRelationsResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServiceSubRelationsResponse.setRequestId(_ctx.stringValue("QueryMsSgServiceSubRelationsResponse.RequestId"));
		queryMsSgServiceSubRelationsResponse.setResultCode(_ctx.stringValue("QueryMsSgServiceSubRelationsResponse.ResultCode"));
		queryMsSgServiceSubRelationsResponse.setResultMessage(_ctx.stringValue("QueryMsSgServiceSubRelationsResponse.ResultMessage"));

		List<ServiceRelationsItem> serviceRelations = new ArrayList<ServiceRelationsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServiceSubRelationsResponse.ServiceRelations.Length"); i++) {
			ServiceRelationsItem serviceRelationsItem = new ServiceRelationsItem();
			serviceRelationsItem.setAppName(_ctx.stringValue("QueryMsSgServiceSubRelationsResponse.ServiceRelations["+ i +"].AppName"));
			serviceRelationsItem.setDataId(_ctx.stringValue("QueryMsSgServiceSubRelationsResponse.ServiceRelations["+ i +"].DataId"));

			serviceRelations.add(serviceRelationsItem);
		}
		queryMsSgServiceSubRelationsResponse.setServiceRelations(serviceRelations);
	 
	 	return queryMsSgServiceSubRelationsResponse;
	}
}