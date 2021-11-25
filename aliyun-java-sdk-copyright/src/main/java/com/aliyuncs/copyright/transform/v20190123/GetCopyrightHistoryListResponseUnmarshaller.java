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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetCopyrightHistoryListResponse;
import com.aliyuncs.copyright.model.v20190123.GetCopyrightHistoryListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCopyrightHistoryListResponseUnmarshaller {

	public static GetCopyrightHistoryListResponse unmarshall(GetCopyrightHistoryListResponse getCopyrightHistoryListResponse, UnmarshallerContext _ctx) {
		
		getCopyrightHistoryListResponse.setRequestId(_ctx.stringValue("GetCopyrightHistoryListResponse.RequestId"));
		getCopyrightHistoryListResponse.setSuccess(_ctx.booleanValue("GetCopyrightHistoryListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCopyrightHistoryListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUserStatus(_ctx.stringValue("GetCopyrightHistoryListResponse.Data["+ i +"].UserStatus"));
			dataItem.setCreateTime(_ctx.stringValue("GetCopyrightHistoryListResponse.Data["+ i +"].CreateTime"));
			dataItem.setFileId(_ctx.stringValue("GetCopyrightHistoryListResponse.Data["+ i +"].FileId"));

			data.add(dataItem);
		}
		getCopyrightHistoryListResponse.setData(data);
	 
	 	return getCopyrightHistoryListResponse;
	}
}