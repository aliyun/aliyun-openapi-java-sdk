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

import com.aliyuncs.retailadvqa_public.model.v20200515.CheckPermissionResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.CheckPermissionResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckPermissionResponseUnmarshaller {

	public static CheckPermissionResponse unmarshall(CheckPermissionResponse checkPermissionResponse, UnmarshallerContext _ctx) {
		
		checkPermissionResponse.setRequestId(_ctx.stringValue("CheckPermissionResponse.RequestId"));
		checkPermissionResponse.setErrorCode(_ctx.stringValue("CheckPermissionResponse.ErrorCode"));
		checkPermissionResponse.setErrorDesc(_ctx.stringValue("CheckPermissionResponse.ErrorDesc"));
		checkPermissionResponse.setSuccess(_ctx.booleanValue("CheckPermissionResponse.Success"));
		checkPermissionResponse.setTraceId(_ctx.stringValue("CheckPermissionResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckPermissionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFileldName(_ctx.stringValue("CheckPermissionResponse.Data["+ i +"].FileldName"));

			List<String> rowPermissions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckPermissionResponse.Data["+ i +"].RowPermissions.Length"); j++) {
				rowPermissions.add(_ctx.stringValue("CheckPermissionResponse.Data["+ i +"].RowPermissions["+ j +"]"));
			}
			dataItem.setRowPermissions(rowPermissions);

			data.add(dataItem);
		}
		checkPermissionResponse.setData(data);
	 
	 	return checkPermissionResponse;
	}
}