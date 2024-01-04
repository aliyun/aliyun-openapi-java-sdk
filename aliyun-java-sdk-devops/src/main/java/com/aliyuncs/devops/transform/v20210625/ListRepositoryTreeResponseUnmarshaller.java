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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListRepositoryTreeResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoryTreeResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryTreeResponseUnmarshaller {

	public static ListRepositoryTreeResponse unmarshall(ListRepositoryTreeResponse listRepositoryTreeResponse, UnmarshallerContext _ctx) {
		
		listRepositoryTreeResponse.setRequestId(_ctx.stringValue("ListRepositoryTreeResponse.requestId"));
		listRepositoryTreeResponse.setErrorMessage(_ctx.stringValue("ListRepositoryTreeResponse.errorMessage"));
		listRepositoryTreeResponse.setErrorCode(_ctx.stringValue("ListRepositoryTreeResponse.errorCode"));
		listRepositoryTreeResponse.setSuccess(_ctx.booleanValue("ListRepositoryTreeResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryTreeResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setPath(_ctx.stringValue("ListRepositoryTreeResponse.result["+ i +"].path"));
			resultItem.setIsLFS(_ctx.booleanValue("ListRepositoryTreeResponse.result["+ i +"].isLFS"));
			resultItem.setId(_ctx.stringValue("ListRepositoryTreeResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListRepositoryTreeResponse.result["+ i +"].name"));
			resultItem.setType(_ctx.stringValue("ListRepositoryTreeResponse.result["+ i +"].type"));
			resultItem.setMode(_ctx.stringValue("ListRepositoryTreeResponse.result["+ i +"].mode"));

			result.add(resultItem);
		}
		listRepositoryTreeResponse.setResult(result);
	 
	 	return listRepositoryTreeResponse;
	}
}