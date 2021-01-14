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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListDeviceRelationResponse;
import com.aliyuncs.cdrs.model.v20201101.ListDeviceRelationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceRelationResponseUnmarshaller {

	public static ListDeviceRelationResponse unmarshall(ListDeviceRelationResponse listDeviceRelationResponse, UnmarshallerContext _ctx) {
		
		listDeviceRelationResponse.setRequestId(_ctx.stringValue("ListDeviceRelationResponse.RequestId"));
		listDeviceRelationResponse.setCode(_ctx.stringValue("ListDeviceRelationResponse.Code"));
		listDeviceRelationResponse.setMessage(_ctx.stringValue("ListDeviceRelationResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceRelationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCorpId(_ctx.stringValue("ListDeviceRelationResponse.Data["+ i +"].CorpId"));

			data.add(dataItem);
		}
		listDeviceRelationResponse.setData(data);
	 
	 	return listDeviceRelationResponse;
	}
}