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

import com.aliyuncs.airec.model.v20181012.ListUmengAppkeysResponse;
import com.aliyuncs.airec.model.v20181012.ListUmengAppkeysResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUmengAppkeysResponseUnmarshaller {

	public static ListUmengAppkeysResponse unmarshall(ListUmengAppkeysResponse listUmengAppkeysResponse, UnmarshallerContext _ctx) {
		
		listUmengAppkeysResponse.setRequestId(_ctx.stringValue("ListUmengAppkeysResponse.RequestId"));
		listUmengAppkeysResponse.setCode(_ctx.stringValue("ListUmengAppkeysResponse.Code"));
		listUmengAppkeysResponse.setMessage(_ctx.stringValue("ListUmengAppkeysResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUmengAppkeysResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("ListUmengAppkeysResponse.Result["+ i +"].Name"));
			resultItem.setAppkey(_ctx.stringValue("ListUmengAppkeysResponse.Result["+ i +"].Appkey"));
			resultItem.setPlatform(_ctx.stringValue("ListUmengAppkeysResponse.Result["+ i +"].Platform"));

			result.add(resultItem);
		}
		listUmengAppkeysResponse.setResult(result);
	 
	 	return listUmengAppkeysResponse;
	}
}