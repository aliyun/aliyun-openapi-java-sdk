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

import com.aliyuncs.paistudio.model.v20201123.SearchOdpsTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchOdpsTableResponseUnmarshaller {

	public static SearchOdpsTableResponse unmarshall(SearchOdpsTableResponse searchOdpsTableResponse, UnmarshallerContext _ctx) {
		
		searchOdpsTableResponse.setRequestId(_ctx.stringValue("SearchOdpsTableResponse.RequestId"));
		searchOdpsTableResponse.setCode(_ctx.stringValue("SearchOdpsTableResponse.Code"));
		searchOdpsTableResponse.setMessage(_ctx.stringValue("SearchOdpsTableResponse.Message"));
		searchOdpsTableResponse.setTotalCount(_ctx.integerValue("SearchOdpsTableResponse.TotalCount"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SearchOdpsTableResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("SearchOdpsTableResponse.Data["+ i +"]"));
		}
		searchOdpsTableResponse.setData(data);
	 
	 	return searchOdpsTableResponse;
	}
}