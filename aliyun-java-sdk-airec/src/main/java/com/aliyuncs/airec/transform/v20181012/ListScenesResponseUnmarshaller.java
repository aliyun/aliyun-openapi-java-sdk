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

import com.aliyuncs.airec.model.v20181012.ListScenesResponse;
import com.aliyuncs.airec.model.v20181012.ListScenesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenesResponseUnmarshaller {

	public static ListScenesResponse unmarshall(ListScenesResponse listScenesResponse, UnmarshallerContext _ctx) {
		
		listScenesResponse.setRequestId(_ctx.stringValue("ListScenesResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListScenesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setSceneId(_ctx.stringValue("ListScenesResponse.Result["+ i +"].SceneId"));
			resultItem.setGmtCreate(_ctx.stringValue("ListScenesResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListScenesResponse.Result["+ i +"].GmtModified"));
			resultItem.setStatus(_ctx.stringValue("ListScenesResponse.Result["+ i +"].Status"));

			result.add(resultItem);
		}
		listScenesResponse.setResult(result);
	 
	 	return listScenesResponse;
	}
}