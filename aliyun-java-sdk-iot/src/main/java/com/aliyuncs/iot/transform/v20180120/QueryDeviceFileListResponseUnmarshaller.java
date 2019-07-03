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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDeviceFileListResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceFileListResponse.FileSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceFileListResponseUnmarshaller {

	public static QueryDeviceFileListResponse unmarshall(QueryDeviceFileListResponse queryDeviceFileListResponse, UnmarshallerContext _ctx) {
		
		queryDeviceFileListResponse.setRequestId(_ctx.stringValue("QueryDeviceFileListResponse.RequestId"));
		queryDeviceFileListResponse.setSuccess(_ctx.booleanValue("QueryDeviceFileListResponse.Success"));
		queryDeviceFileListResponse.setCode(_ctx.stringValue("QueryDeviceFileListResponse.Code"));
		queryDeviceFileListResponse.setErrorMessage(_ctx.stringValue("QueryDeviceFileListResponse.ErrorMessage"));
		queryDeviceFileListResponse.setCurrentPage(_ctx.integerValue("QueryDeviceFileListResponse.CurrentPage"));
		queryDeviceFileListResponse.setPageCount(_ctx.integerValue("QueryDeviceFileListResponse.PageCount"));
		queryDeviceFileListResponse.setPageSize(_ctx.integerValue("QueryDeviceFileListResponse.PageSize"));
		queryDeviceFileListResponse.setTotal(_ctx.integerValue("QueryDeviceFileListResponse.Total"));

		List<FileSummary> data = new ArrayList<FileSummary>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceFileListResponse.Data.Length"); i++) {
			FileSummary fileSummary = new FileSummary();
			fileSummary.setFileId(_ctx.stringValue("QueryDeviceFileListResponse.Data["+ i +"].FileId"));
			fileSummary.setName(_ctx.stringValue("QueryDeviceFileListResponse.Data["+ i +"].Name"));
			fileSummary.setSize(_ctx.stringValue("QueryDeviceFileListResponse.Data["+ i +"].Size"));
			fileSummary.setUtcCreatedOn(_ctx.stringValue("QueryDeviceFileListResponse.Data["+ i +"].UtcCreatedOn"));

			data.add(fileSummary);
		}
		queryDeviceFileListResponse.setData(data);
	 
	 	return queryDeviceFileListResponse;
	}
}