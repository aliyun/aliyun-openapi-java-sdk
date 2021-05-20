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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListRamRolesResponse;
import com.aliyuncs.opensearch.model.v20171225.ListRamRolesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRamRolesResponseUnmarshaller {

	public static ListRamRolesResponse unmarshall(ListRamRolesResponse listRamRolesResponse, UnmarshallerContext _ctx) {
		
		listRamRolesResponse.setRequestId(_ctx.stringValue("ListRamRolesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRamRolesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("ListRamRolesResponse.result["+ i +"].name"));
			resultItem.setService(_ctx.stringValue("ListRamRolesResponse.result["+ i +"].service"));
			resultItem.setTemplate_id(_ctx.stringValue("ListRamRolesResponse.result["+ i +"].template_id"));
			resultItem.setAssumed(_ctx.booleanValue("ListRamRolesResponse.result["+ i +"].assumed"));

			result.add(resultItem);
		}
		listRamRolesResponse.setResult(result);
	 
	 	return listRamRolesResponse;
	}
}