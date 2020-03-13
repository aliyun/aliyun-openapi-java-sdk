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

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceSubKeysResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceSubKeysResponse.SimpleServiceInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServiceSubKeysResponseUnmarshaller {

	public static QueryMsSgServiceSubKeysResponse unmarshall(QueryMsSgServiceSubKeysResponse queryMsSgServiceSubKeysResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServiceSubKeysResponse.setRequestId(_ctx.stringValue("QueryMsSgServiceSubKeysResponse.RequestId"));
		queryMsSgServiceSubKeysResponse.setResultCode(_ctx.stringValue("QueryMsSgServiceSubKeysResponse.ResultCode"));
		queryMsSgServiceSubKeysResponse.setResultMessage(_ctx.stringValue("QueryMsSgServiceSubKeysResponse.ResultMessage"));
		queryMsSgServiceSubKeysResponse.setCurrentPage(_ctx.longValue("QueryMsSgServiceSubKeysResponse.CurrentPage"));
		queryMsSgServiceSubKeysResponse.setPageSize(_ctx.longValue("QueryMsSgServiceSubKeysResponse.PageSize"));
		queryMsSgServiceSubKeysResponse.setStartIndex(_ctx.longValue("QueryMsSgServiceSubKeysResponse.StartIndex"));
		queryMsSgServiceSubKeysResponse.setTotalSize(_ctx.longValue("QueryMsSgServiceSubKeysResponse.TotalSize"));

		List<SimpleServiceInfosItem> simpleServiceInfos = new ArrayList<SimpleServiceInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServiceSubKeysResponse.SimpleServiceInfos.Length"); i++) {
			SimpleServiceInfosItem simpleServiceInfosItem = new SimpleServiceInfosItem();
			simpleServiceInfosItem.setDataId(_ctx.stringValue("QueryMsSgServiceSubKeysResponse.SimpleServiceInfos["+ i +"].DataId"));
			simpleServiceInfosItem.setPubCount(_ctx.longValue("QueryMsSgServiceSubKeysResponse.SimpleServiceInfos["+ i +"].PubCount"));
			simpleServiceInfosItem.setServiceType(_ctx.stringValue("QueryMsSgServiceSubKeysResponse.SimpleServiceInfos["+ i +"].ServiceType"));
			simpleServiceInfosItem.setSubCount(_ctx.longValue("QueryMsSgServiceSubKeysResponse.SimpleServiceInfos["+ i +"].SubCount"));

			List<String> pubApp = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsSgServiceSubKeysResponse.SimpleServiceInfos["+ i +"].PubApp.Length"); j++) {
				pubApp.add(_ctx.stringValue("QueryMsSgServiceSubKeysResponse.SimpleServiceInfos["+ i +"].PubApp["+ j +"]"));
			}
			simpleServiceInfosItem.setPubApp(pubApp);

			simpleServiceInfos.add(simpleServiceInfosItem);
		}
		queryMsSgServiceSubKeysResponse.setSimpleServiceInfos(simpleServiceInfos);
	 
	 	return queryMsSgServiceSubKeysResponse;
	}
}