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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListNodeIOResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListNodeIOResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeIOResponseUnmarshaller {

	public static ListNodeIOResponse unmarshall(ListNodeIOResponse listNodeIOResponse, UnmarshallerContext _ctx) {
		
		listNodeIOResponse.setRequestId(_ctx.stringValue("ListNodeIOResponse.RequestId"));
		listNodeIOResponse.setSuccess(_ctx.booleanValue("ListNodeIOResponse.Success"));
		listNodeIOResponse.setErrorCode(_ctx.stringValue("ListNodeIOResponse.ErrorCode"));
		listNodeIOResponse.setErrorMessage(_ctx.stringValue("ListNodeIOResponse.ErrorMessage"));
		listNodeIOResponse.setHttpStatusCode(_ctx.integerValue("ListNodeIOResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeIOResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTableName(_ctx.stringValue("ListNodeIOResponse.Data["+ i +"].TableName"));
			dataItem.setData(_ctx.stringValue("ListNodeIOResponse.Data["+ i +"].Data"));

			data.add(dataItem);
		}
		listNodeIOResponse.setData(data);
	 
	 	return listNodeIOResponse;
	}
}