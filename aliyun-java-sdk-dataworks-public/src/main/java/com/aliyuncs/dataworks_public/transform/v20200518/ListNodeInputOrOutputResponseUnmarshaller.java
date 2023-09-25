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

import com.aliyuncs.dataworks_public.model.v20200518.ListNodeInputOrOutputResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListNodeInputOrOutputResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeInputOrOutputResponseUnmarshaller {

	public static ListNodeInputOrOutputResponse unmarshall(ListNodeInputOrOutputResponse listNodeInputOrOutputResponse, UnmarshallerContext _ctx) {
		
		listNodeInputOrOutputResponse.setRequestId(_ctx.stringValue("ListNodeInputOrOutputResponse.RequestId"));
		listNodeInputOrOutputResponse.setHttpStatusCode(_ctx.integerValue("ListNodeInputOrOutputResponse.HttpStatusCode"));
		listNodeInputOrOutputResponse.setErrorMessage(_ctx.stringValue("ListNodeInputOrOutputResponse.ErrorMessage"));
		listNodeInputOrOutputResponse.setErrorCode(_ctx.stringValue("ListNodeInputOrOutputResponse.ErrorCode"));
		listNodeInputOrOutputResponse.setSuccess(_ctx.booleanValue("ListNodeInputOrOutputResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeInputOrOutputResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTableName(_ctx.stringValue("ListNodeInputOrOutputResponse.Data["+ i +"].TableName"));
			dataItem.setData(_ctx.stringValue("ListNodeInputOrOutputResponse.Data["+ i +"].Data"));
			dataItem.setNodeId(_ctx.longValue("ListNodeInputOrOutputResponse.Data["+ i +"].NodeId"));

			data.add(dataItem);
		}
		listNodeInputOrOutputResponse.setData(data);
	 
	 	return listNodeInputOrOutputResponse;
	}
}