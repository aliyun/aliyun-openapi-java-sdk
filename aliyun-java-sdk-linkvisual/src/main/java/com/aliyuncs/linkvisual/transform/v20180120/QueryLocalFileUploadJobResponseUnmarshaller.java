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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryLocalFileUploadJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryLocalFileUploadJobResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryLocalFileUploadJobResponse.Data.ResultListItem;
import com.aliyuncs.linkvisual.model.v20180120.QueryLocalFileUploadJobResponse.Data.ResultListItem.FileListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLocalFileUploadJobResponseUnmarshaller {

	public static QueryLocalFileUploadJobResponse unmarshall(QueryLocalFileUploadJobResponse queryLocalFileUploadJobResponse, UnmarshallerContext _ctx) {
		
		queryLocalFileUploadJobResponse.setRequestId(_ctx.stringValue("QueryLocalFileUploadJobResponse.RequestId"));
		queryLocalFileUploadJobResponse.setSuccess(_ctx.booleanValue("QueryLocalFileUploadJobResponse.Success"));
		queryLocalFileUploadJobResponse.setCode(_ctx.stringValue("QueryLocalFileUploadJobResponse.Code"));
		queryLocalFileUploadJobResponse.setErrorMessage(_ctx.stringValue("QueryLocalFileUploadJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("QueryLocalFileUploadJobResponse.Data.Status"));

		List<ResultListItem> resultList = new ArrayList<ResultListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLocalFileUploadJobResponse.Data.ResultList.Length"); i++) {
			ResultListItem resultListItem = new ResultListItem();
			resultListItem.setIotId(_ctx.stringValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].IotId"));
			resultListItem.setProductKey(_ctx.stringValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].ProductKey"));
			resultListItem.setDeviceName(_ctx.stringValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].DeviceName"));
			resultListItem.setSlotStartTime(_ctx.integerValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].SlotStartTime"));
			resultListItem.setSlotEndTime(_ctx.integerValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].SlotEndTime"));
			resultListItem.setSlotStatus(_ctx.integerValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].SlotStatus"));
			resultListItem.setCode(_ctx.integerValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].Code"));

			List<FileListItem> fileList = new ArrayList<FileListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].FileList.Length"); j++) {
				FileListItem fileListItem = new FileListItem();
				fileListItem.setFileStartTime(_ctx.integerValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].FileList["+ j +"].FileStartTime"));
				fileListItem.setFileEndTime(_ctx.integerValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].FileList["+ j +"].FileEndTime"));
				fileListItem.setFileName(_ctx.stringValue("QueryLocalFileUploadJobResponse.Data.ResultList["+ i +"].FileList["+ j +"].FileName"));

				fileList.add(fileListItem);
			}
			resultListItem.setFileList(fileList);

			resultList.add(resultListItem);
		}
		data.setResultList(resultList);
		queryLocalFileUploadJobResponse.setData(data);
	 
	 	return queryLocalFileUploadJobResponse;
	}
}