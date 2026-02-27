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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetRowPermissionByTableGuidsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetRowPermissionByTableGuidsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRowPermissionByTableGuidsResponseUnmarshaller {

	public static GetRowPermissionByTableGuidsResponse unmarshall(GetRowPermissionByTableGuidsResponse getRowPermissionByTableGuidsResponse, UnmarshallerContext _ctx) {
		
		getRowPermissionByTableGuidsResponse.setRequestId(_ctx.stringValue("GetRowPermissionByTableGuidsResponse.RequestId"));
		getRowPermissionByTableGuidsResponse.setSuccess(_ctx.booleanValue("GetRowPermissionByTableGuidsResponse.Success"));
		getRowPermissionByTableGuidsResponse.setHttpStatusCode(_ctx.integerValue("GetRowPermissionByTableGuidsResponse.HttpStatusCode"));
		getRowPermissionByTableGuidsResponse.setCode(_ctx.stringValue("GetRowPermissionByTableGuidsResponse.Code"));
		getRowPermissionByTableGuidsResponse.setMessage(_ctx.stringValue("GetRowPermissionByTableGuidsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRowPermissionByTableGuidsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRowPermissionId(_ctx.stringValue("GetRowPermissionByTableGuidsResponse.Data["+ i +"].RowPermissionId"));
			dataItem.setRowPermissionName(_ctx.stringValue("GetRowPermissionByTableGuidsResponse.Data["+ i +"].RowPermissionName"));
			dataItem.setRowPermissionDesc(_ctx.stringValue("GetRowPermissionByTableGuidsResponse.Data["+ i +"].RowPermissionDesc"));

			data.add(dataItem);
		}
		getRowPermissionByTableGuidsResponse.setData(data);
	 
	 	return getRowPermissionByTableGuidsResponse;
	}
}