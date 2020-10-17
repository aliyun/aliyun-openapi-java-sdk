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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListAvailableEsInstanceIdsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListAvailableEsInstanceIdsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableEsInstanceIdsResponseUnmarshaller {

	public static ListAvailableEsInstanceIdsResponse unmarshall(ListAvailableEsInstanceIdsResponse listAvailableEsInstanceIdsResponse, UnmarshallerContext _ctx) {
		
		listAvailableEsInstanceIdsResponse.setRequestId(_ctx.stringValue("ListAvailableEsInstanceIdsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAvailableEsInstanceIdsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setEsInstanceId(_ctx.stringValue("ListAvailableEsInstanceIdsResponse.Result["+ i +"].esInstanceId"));
			resultItem.setEndpoint(_ctx.stringValue("ListAvailableEsInstanceIdsResponse.Result["+ i +"].endpoint"));
			resultItem.setDescription(_ctx.stringValue("ListAvailableEsInstanceIdsResponse.Result["+ i +"].description"));
			resultItem.setKibanaEndpoint(_ctx.stringValue("ListAvailableEsInstanceIdsResponse.Result["+ i +"].kibanaEndpoint"));

			result.add(resultItem);
		}
		listAvailableEsInstanceIdsResponse.setResult(result);
	 
	 	return listAvailableEsInstanceIdsResponse;
	}
}