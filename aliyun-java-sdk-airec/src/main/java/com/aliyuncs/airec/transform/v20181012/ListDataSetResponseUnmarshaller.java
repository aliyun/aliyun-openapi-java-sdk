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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.ListDataSetResponse;
import com.aliyuncs.airec.model.v20181012.ListDataSetResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSetResponseUnmarshaller {

	public static ListDataSetResponse unmarshall(ListDataSetResponse listDataSetResponse, UnmarshallerContext _ctx) {
		
		listDataSetResponse.setRequestId(_ctx.stringValue("ListDataSetResponse.RequestId"));
		listDataSetResponse.setCode(_ctx.stringValue("ListDataSetResponse.Code"));
		listDataSetResponse.setMessage(_ctx.stringValue("ListDataSetResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSetResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setInstanceId(_ctx.stringValue("ListDataSetResponse.Result["+ i +"].InstanceId"));
			resultItem.setVersionId(_ctx.stringValue("ListDataSetResponse.Result["+ i +"].VersionId"));
			resultItem.setState(_ctx.stringValue("ListDataSetResponse.Result["+ i +"].State"));
			resultItem.setGmtCreate(_ctx.longValue("ListDataSetResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.longValue("ListDataSetResponse.Result["+ i +"].GmtModified"));

			result.add(resultItem);
		}
		listDataSetResponse.setResult(result);
	 
	 	return listDataSetResponse;
	}
}