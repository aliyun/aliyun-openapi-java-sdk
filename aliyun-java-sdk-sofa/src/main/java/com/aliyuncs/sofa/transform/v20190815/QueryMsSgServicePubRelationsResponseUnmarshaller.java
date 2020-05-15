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

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServicePubRelationsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServicePubRelationsResponse.ServiceRelationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServicePubRelationsResponseUnmarshaller {

	public static QueryMsSgServicePubRelationsResponse unmarshall(QueryMsSgServicePubRelationsResponse queryMsSgServicePubRelationsResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServicePubRelationsResponse.setRequestId(_ctx.stringValue("QueryMsSgServicePubRelationsResponse.RequestId"));
		queryMsSgServicePubRelationsResponse.setResultCode(_ctx.stringValue("QueryMsSgServicePubRelationsResponse.ResultCode"));
		queryMsSgServicePubRelationsResponse.setResultMessage(_ctx.stringValue("QueryMsSgServicePubRelationsResponse.ResultMessage"));

		List<ServiceRelationsItem> serviceRelations = new ArrayList<ServiceRelationsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServicePubRelationsResponse.ServiceRelations.Length"); i++) {
			ServiceRelationsItem serviceRelationsItem = new ServiceRelationsItem();
			serviceRelationsItem.setAppName(_ctx.stringValue("QueryMsSgServicePubRelationsResponse.ServiceRelations["+ i +"].AppName"));
			serviceRelationsItem.setDataId(_ctx.stringValue("QueryMsSgServicePubRelationsResponse.ServiceRelations["+ i +"].DataId"));

			serviceRelations.add(serviceRelationsItem);
		}
		queryMsSgServicePubRelationsResponse.setServiceRelations(serviceRelations);
	 
	 	return queryMsSgServicePubRelationsResponse;
	}
}