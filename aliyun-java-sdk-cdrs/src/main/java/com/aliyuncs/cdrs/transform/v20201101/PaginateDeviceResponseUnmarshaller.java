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

import com.aliyuncs.cdrs.model.v20201101.PaginateDeviceResponse;
import com.aliyuncs.cdrs.model.v20201101.PaginateDeviceResponse.Data;
import com.aliyuncs.cdrs.model.v20201101.PaginateDeviceResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PaginateDeviceResponseUnmarshaller {

	public static PaginateDeviceResponse unmarshall(PaginateDeviceResponse paginateDeviceResponse, UnmarshallerContext _ctx) {
		
		paginateDeviceResponse.setRequestId(_ctx.stringValue("PaginateDeviceResponse.RequestId"));
		paginateDeviceResponse.setMessage(_ctx.stringValue("PaginateDeviceResponse.Message"));
		paginateDeviceResponse.setCode(_ctx.stringValue("PaginateDeviceResponse.Code"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("PaginateDeviceResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("PaginateDeviceResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("PaginateDeviceResponse.Data.TotalCount"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("PaginateDeviceResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setDeviceId(_ctx.stringValue("PaginateDeviceResponse.Data.Records["+ i +"].DeviceId"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		paginateDeviceResponse.setData(data);
	 
	 	return paginateDeviceResponse;
	}
}