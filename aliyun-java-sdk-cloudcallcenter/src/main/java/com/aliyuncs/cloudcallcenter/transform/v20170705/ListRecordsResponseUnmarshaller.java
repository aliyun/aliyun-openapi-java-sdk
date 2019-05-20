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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordsResponse.RecordFileList;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordsResponse.RecordFileList.RecordFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecordsResponseUnmarshaller {

	public static ListRecordsResponse unmarshall(ListRecordsResponse listRecordsResponse, UnmarshallerContext context) {
		
		listRecordsResponse.setRequestId(context.stringValue("ListRecordsResponse.RequestId"));
		listRecordsResponse.setSuccess(context.booleanValue("ListRecordsResponse.Success"));
		listRecordsResponse.setCode(context.stringValue("ListRecordsResponse.Code"));
		listRecordsResponse.setMessage(context.stringValue("ListRecordsResponse.Message"));
		listRecordsResponse.setHttpStatusCode(context.integerValue("ListRecordsResponse.HttpStatusCode"));

		RecordFileList recordFileList = new RecordFileList();
		recordFileList.setTotalCount(context.integerValue("ListRecordsResponse.RecordFileList.TotalCount"));
		recordFileList.setPageNumber(context.integerValue("ListRecordsResponse.RecordFileList.PageNumber"));
		recordFileList.setPageSize(context.integerValue("ListRecordsResponse.RecordFileList.PageSize"));

		List<RecordFile> list = new ArrayList<RecordFile>();
		for (int i = 0; i < context.lengthValue("ListRecordsResponse.RecordFileList.List.Length"); i++) {
			RecordFile recordFile = new RecordFile();
			recordFile.setFileName(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].FileName"));
			recordFile.setDisplayFileName(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].DisplayFileName"));
			recordFile.setFilePath(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].FilePath"));
			recordFile.setConnectId(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].ConnectId"));
			recordFile.setUserPhone(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].UserPhone"));
			recordFile.setStartPhoneTime(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].StartPhoneTime"));
			recordFile.setAgent(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].Agent"));
			recordFile.setDisplayName(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].DisplayName"));
			recordFile.setDuration(context.stringValue("ListRecordsResponse.RecordFileList.List["+ i +"].Duration"));

			list.add(recordFile);
		}
		recordFileList.setList(list);
		listRecordsResponse.setRecordFileList(recordFileList);
	 
	 	return listRecordsResponse;
	}
}