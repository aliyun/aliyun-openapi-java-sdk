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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListScenesResponse;
import com.aliyuncs.airec.model.v20201126.ListScenesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenesResponseUnmarshaller {

	public static ListScenesResponse unmarshall(ListScenesResponse listScenesResponse, UnmarshallerContext _ctx) {
		
		listScenesResponse.setRequestId(_ctx.stringValue("ListScenesResponse.requestId"));
		listScenesResponse.setCode(_ctx.stringValue("ListScenesResponse.code"));
		listScenesResponse.setMessage(_ctx.stringValue("ListScenesResponse.message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListScenesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setGmtCreate(_ctx.stringValue("ListScenesResponse.result["+ i +"].gmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListScenesResponse.result["+ i +"].gmtModified"));
			resultItem.setSceneId(_ctx.stringValue("ListScenesResponse.result["+ i +"].sceneId"));
			resultItem.setStatus(_ctx.stringValue("ListScenesResponse.result["+ i +"].status"));

			result.add(resultItem);
		}
		listScenesResponse.setResult(result);
	 
	 	return listScenesResponse;
	}
}