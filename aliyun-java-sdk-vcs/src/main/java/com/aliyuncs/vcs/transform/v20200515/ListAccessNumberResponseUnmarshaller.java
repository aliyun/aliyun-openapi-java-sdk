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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListAccessNumberResponse;
import com.aliyuncs.vcs.model.v20200515.ListAccessNumberResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessNumberResponseUnmarshaller {

	public static ListAccessNumberResponse unmarshall(ListAccessNumberResponse listAccessNumberResponse, UnmarshallerContext _ctx) {
		
		listAccessNumberResponse.setRequestId(_ctx.stringValue("ListAccessNumberResponse.RequestId"));
		listAccessNumberResponse.setMessage(_ctx.stringValue("ListAccessNumberResponse.Message"));
		listAccessNumberResponse.setCode(_ctx.stringValue("ListAccessNumberResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAccessNumberResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setItem(_ctx.stringValue("ListAccessNumberResponse.Data["+ i +"].Item"));
			dataItem.setPercent(_ctx.stringValue("ListAccessNumberResponse.Data["+ i +"].Percent"));
			dataItem.setCount(_ctx.stringValue("ListAccessNumberResponse.Data["+ i +"].Count"));

			data.add(dataItem);
		}
		listAccessNumberResponse.setData(data);
	 
	 	return listAccessNumberResponse;
	}
}