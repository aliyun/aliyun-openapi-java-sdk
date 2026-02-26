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

import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnosisItemsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnosisItemsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDiagnosisItemsResponseUnmarshaller {

	public static ListDiagnosisItemsResponse unmarshall(ListDiagnosisItemsResponse listDiagnosisItemsResponse, UnmarshallerContext _ctx) {
		
		listDiagnosisItemsResponse.setRequestId(_ctx.stringValue("ListDiagnosisItemsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDiagnosisItemsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setKey(_ctx.stringValue("ListDiagnosisItemsResponse.Result["+ i +"].key"));
			resultItem.setName(_ctx.stringValue("ListDiagnosisItemsResponse.Result["+ i +"].name"));
			resultItem.setDescription(_ctx.stringValue("ListDiagnosisItemsResponse.Result["+ i +"].description"));

			result.add(resultItem);
		}
		listDiagnosisItemsResponse.setResult(result);
	 
	 	return listDiagnosisItemsResponse;
	}
}