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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricAllzonebydevstageenvResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricAllzonebydevstageenvResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricAllzonebydevstageenvResponseUnmarshaller {

	public static QueryLinkefabricFabricAllzonebydevstageenvResponse unmarshall(QueryLinkefabricFabricAllzonebydevstageenvResponse queryLinkefabricFabricAllzonebydevstageenvResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricAllzonebydevstageenvResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.RequestId"));
		queryLinkefabricFabricAllzonebydevstageenvResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.ResultCode"));
		queryLinkefabricFabricAllzonebydevstageenvResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.ResultMessage"));
		queryLinkefabricFabricAllzonebydevstageenvResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.Message"));
		queryLinkefabricFabricAllzonebydevstageenvResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.ResponseStatusCode"));
		queryLinkefabricFabricAllzonebydevstageenvResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDomainName(_ctx.stringValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.Data["+ i +"].DomainName"));
			dataItem.setId(_ctx.stringValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.Data["+ i +"].Name"));
			dataItem.setPreprod(_ctx.booleanValue("QueryLinkefabricFabricAllzonebydevstageenvResponse.Data["+ i +"].Preprod"));

			data.add(dataItem);
		}
		queryLinkefabricFabricAllzonebydevstageenvResponse.setData(data);
	 
	 	return queryLinkefabricFabricAllzonebydevstageenvResponse;
	}
}