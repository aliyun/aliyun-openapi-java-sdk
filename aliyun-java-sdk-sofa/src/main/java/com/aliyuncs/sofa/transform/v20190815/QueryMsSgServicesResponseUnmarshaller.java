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

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServicesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServicesResponse.SimpleServiceInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServicesResponseUnmarshaller {

	public static QueryMsSgServicesResponse unmarshall(QueryMsSgServicesResponse queryMsSgServicesResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServicesResponse.setRequestId(_ctx.stringValue("QueryMsSgServicesResponse.RequestId"));
		queryMsSgServicesResponse.setResultCode(_ctx.stringValue("QueryMsSgServicesResponse.ResultCode"));
		queryMsSgServicesResponse.setResultMessage(_ctx.stringValue("QueryMsSgServicesResponse.ResultMessage"));
		queryMsSgServicesResponse.setCurrentPage(_ctx.longValue("QueryMsSgServicesResponse.CurrentPage"));
		queryMsSgServicesResponse.setPageSize(_ctx.longValue("QueryMsSgServicesResponse.PageSize"));
		queryMsSgServicesResponse.setStartIndex(_ctx.longValue("QueryMsSgServicesResponse.StartIndex"));
		queryMsSgServicesResponse.setTotalSize(_ctx.longValue("QueryMsSgServicesResponse.TotalSize"));

		List<SimpleServiceInfosItem> simpleServiceInfos = new ArrayList<SimpleServiceInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServicesResponse.SimpleServiceInfos.Length"); i++) {
			SimpleServiceInfosItem simpleServiceInfosItem = new SimpleServiceInfosItem();
			simpleServiceInfosItem.setDataId(_ctx.stringValue("QueryMsSgServicesResponse.SimpleServiceInfos["+ i +"].DataId"));
			simpleServiceInfosItem.setPubCount(_ctx.longValue("QueryMsSgServicesResponse.SimpleServiceInfos["+ i +"].PubCount"));
			simpleServiceInfosItem.setServiceType(_ctx.stringValue("QueryMsSgServicesResponse.SimpleServiceInfos["+ i +"].ServiceType"));
			simpleServiceInfosItem.setSubCount(_ctx.longValue("QueryMsSgServicesResponse.SimpleServiceInfos["+ i +"].SubCount"));

			List<String> pubApp = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsSgServicesResponse.SimpleServiceInfos["+ i +"].PubApp.Length"); j++) {
				pubApp.add(_ctx.stringValue("QueryMsSgServicesResponse.SimpleServiceInfos["+ i +"].PubApp["+ j +"]"));
			}
			simpleServiceInfosItem.setPubApp(pubApp);

			simpleServiceInfos.add(simpleServiceInfosItem);
		}
		queryMsSgServicesResponse.setSimpleServiceInfos(simpleServiceInfos);
	 
	 	return queryMsSgServicesResponse;
	}
}