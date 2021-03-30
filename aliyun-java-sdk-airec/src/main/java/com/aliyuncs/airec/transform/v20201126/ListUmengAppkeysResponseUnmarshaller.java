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

import com.aliyuncs.airec.model.v20201126.ListUmengAppkeysResponse;
import com.aliyuncs.airec.model.v20201126.ListUmengAppkeysResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUmengAppkeysResponseUnmarshaller {

	public static ListUmengAppkeysResponse unmarshall(ListUmengAppkeysResponse listUmengAppkeysResponse, UnmarshallerContext _ctx) {
		
		listUmengAppkeysResponse.setCode(_ctx.stringValue("ListUmengAppkeysResponse.code"));
		listUmengAppkeysResponse.setMessage(_ctx.stringValue("ListUmengAppkeysResponse.message"));
		listUmengAppkeysResponse.setRequestId(_ctx.stringValue("ListUmengAppkeysResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUmengAppkeysResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppkey(_ctx.stringValue("ListUmengAppkeysResponse.result["+ i +"].appkey"));
			resultItem.setName(_ctx.stringValue("ListUmengAppkeysResponse.result["+ i +"].name"));
			resultItem.setPlatform(_ctx.stringValue("ListUmengAppkeysResponse.result["+ i +"].platform"));

			result.add(resultItem);
		}
		listUmengAppkeysResponse.setResult(result);
	 
	 	return listUmengAppkeysResponse;
	}
}