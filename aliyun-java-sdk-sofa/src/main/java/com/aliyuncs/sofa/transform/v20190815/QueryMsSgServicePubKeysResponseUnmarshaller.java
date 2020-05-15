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

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServicePubKeysResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServicePubKeysResponse.SimpleServiceInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServicePubKeysResponseUnmarshaller {

	public static QueryMsSgServicePubKeysResponse unmarshall(QueryMsSgServicePubKeysResponse queryMsSgServicePubKeysResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServicePubKeysResponse.setRequestId(_ctx.stringValue("QueryMsSgServicePubKeysResponse.RequestId"));
		queryMsSgServicePubKeysResponse.setResultCode(_ctx.stringValue("QueryMsSgServicePubKeysResponse.ResultCode"));
		queryMsSgServicePubKeysResponse.setResultMessage(_ctx.stringValue("QueryMsSgServicePubKeysResponse.ResultMessage"));
		queryMsSgServicePubKeysResponse.setCurrentPage(_ctx.longValue("QueryMsSgServicePubKeysResponse.CurrentPage"));
		queryMsSgServicePubKeysResponse.setPageSize(_ctx.longValue("QueryMsSgServicePubKeysResponse.PageSize"));
		queryMsSgServicePubKeysResponse.setStartIndex(_ctx.longValue("QueryMsSgServicePubKeysResponse.StartIndex"));
		queryMsSgServicePubKeysResponse.setTotalSize(_ctx.longValue("QueryMsSgServicePubKeysResponse.TotalSize"));

		List<SimpleServiceInfosItem> simpleServiceInfos = new ArrayList<SimpleServiceInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServicePubKeysResponse.SimpleServiceInfos.Length"); i++) {
			SimpleServiceInfosItem simpleServiceInfosItem = new SimpleServiceInfosItem();
			simpleServiceInfosItem.setDataId(_ctx.stringValue("QueryMsSgServicePubKeysResponse.SimpleServiceInfos["+ i +"].DataId"));
			simpleServiceInfosItem.setPubCount(_ctx.longValue("QueryMsSgServicePubKeysResponse.SimpleServiceInfos["+ i +"].PubCount"));
			simpleServiceInfosItem.setServiceType(_ctx.stringValue("QueryMsSgServicePubKeysResponse.SimpleServiceInfos["+ i +"].ServiceType"));
			simpleServiceInfosItem.setSubCount(_ctx.longValue("QueryMsSgServicePubKeysResponse.SimpleServiceInfos["+ i +"].SubCount"));

			List<String> pubApp = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsSgServicePubKeysResponse.SimpleServiceInfos["+ i +"].PubApp.Length"); j++) {
				pubApp.add(_ctx.stringValue("QueryMsSgServicePubKeysResponse.SimpleServiceInfos["+ i +"].PubApp["+ j +"]"));
			}
			simpleServiceInfosItem.setPubApp(pubApp);

			simpleServiceInfos.add(simpleServiceInfosItem);
		}
		queryMsSgServicePubKeysResponse.setSimpleServiceInfos(simpleServiceInfos);
	 
	 	return queryMsSgServicePubKeysResponse;
	}
}