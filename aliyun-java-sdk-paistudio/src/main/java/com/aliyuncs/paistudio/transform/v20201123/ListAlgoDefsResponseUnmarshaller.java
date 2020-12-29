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

package com.aliyuncs.paistudio.transform.v20201123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20201123.ListAlgoDefsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlgoDefsResponseUnmarshaller {

	public static ListAlgoDefsResponse unmarshall(ListAlgoDefsResponse listAlgoDefsResponse, UnmarshallerContext _ctx) {
		
		listAlgoDefsResponse.setRequestId(_ctx.stringValue("ListAlgoDefsResponse.RequestId"));
		listAlgoDefsResponse.setCode(_ctx.stringValue("ListAlgoDefsResponse.Code"));
		listAlgoDefsResponse.setMessage(_ctx.stringValue("ListAlgoDefsResponse.Message"));
		listAlgoDefsResponse.setTotalCount(_ctx.integerValue("ListAlgoDefsResponse.TotalCount"));
		listAlgoDefsResponse.setMaxResults(_ctx.integerValue("ListAlgoDefsResponse.MaxResults"));

		List<Map<Object, Object>> data = _ctx.listMapValue("ListAlgoDefsResponse.Data");
		listAlgoDefsResponse.setData(data);
	 
	 	return listAlgoDefsResponse;
	}
}