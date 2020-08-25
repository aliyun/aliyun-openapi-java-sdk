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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudallstrategyResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudallstrategyResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricCloudallstrategyResponseUnmarshaller {

	public static QueryLinkefabricFabricCloudallstrategyResponse unmarshall(QueryLinkefabricFabricCloudallstrategyResponse queryLinkefabricFabricCloudallstrategyResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricCloudallstrategyResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricCloudallstrategyResponse.RequestId"));
		queryLinkefabricFabricCloudallstrategyResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricCloudallstrategyResponse.ResultCode"));
		queryLinkefabricFabricCloudallstrategyResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricCloudallstrategyResponse.ResultMessage"));
		queryLinkefabricFabricCloudallstrategyResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricCloudallstrategyResponse.Message"));
		queryLinkefabricFabricCloudallstrategyResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricCloudallstrategyResponse.ResponseStatusCode"));
		queryLinkefabricFabricCloudallstrategyResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricCloudallstrategyResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCloudallstrategyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("QueryLinkefabricFabricCloudallstrategyResponse.Data["+ i +"].Name"));
			dataItem.setRelatedTaskCount(_ctx.longValue("QueryLinkefabricFabricCloudallstrategyResponse.Data["+ i +"].RelatedTaskCount"));

			data.add(dataItem);
		}
		queryLinkefabricFabricCloudallstrategyResponse.setData(data);
	 
	 	return queryLinkefabricFabricCloudallstrategyResponse;
	}
}