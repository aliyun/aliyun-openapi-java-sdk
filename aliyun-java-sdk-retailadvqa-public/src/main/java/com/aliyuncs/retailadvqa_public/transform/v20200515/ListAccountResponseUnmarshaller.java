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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.ListAccountResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListAccountResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountResponseUnmarshaller {

	public static ListAccountResponse unmarshall(ListAccountResponse listAccountResponse, UnmarshallerContext _ctx) {
		
		listAccountResponse.setRequestId(_ctx.stringValue("ListAccountResponse.RequestId"));
		listAccountResponse.setErrorDesc(_ctx.stringValue("ListAccountResponse.ErrorDesc"));
		listAccountResponse.setTraceId(_ctx.stringValue("ListAccountResponse.TraceId"));
		listAccountResponse.setErrorCode(_ctx.stringValue("ListAccountResponse.ErrorCode"));
		listAccountResponse.setSuccess(_ctx.booleanValue("ListAccountResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAud(_ctx.stringValue("ListAccountResponse.Data["+ i +"].Aud"));
			dataItem.setUserId(_ctx.stringValue("ListAccountResponse.Data["+ i +"].UserId"));
			dataItem.setNickName(_ctx.stringValue("ListAccountResponse.Data["+ i +"].NickName"));
			dataItem.setRole(_ctx.stringValue("ListAccountResponse.Data["+ i +"].Role"));

			data.add(dataItem);
		}
		listAccountResponse.setData(data);
	 
	 	return listAccountResponse;
	}
}