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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeBackupFilesResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeBackupFilesResponse.BackupFileInfoModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupFilesResponseUnmarshaller {

	public static DescribeBackupFilesResponse unmarshall(DescribeBackupFilesResponse describeBackupFilesResponse, UnmarshallerContext _ctx) {
		
		describeBackupFilesResponse.setRequestId(_ctx.stringValue("DescribeBackupFilesResponse.RequestId"));
		describeBackupFilesResponse.setNextToken(_ctx.stringValue("DescribeBackupFilesResponse.NextToken"));
		describeBackupFilesResponse.setMaxResults(_ctx.stringValue("DescribeBackupFilesResponse.MaxResults"));
		describeBackupFilesResponse.setTotalCount(_ctx.longValue("DescribeBackupFilesResponse.TotalCount"));

		List<BackupFileInfoModel> data = new ArrayList<BackupFileInfoModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupFilesResponse.Data.Length"); i++) {
			BackupFileInfoModel backupFileInfoModel = new BackupFileInfoModel();
			backupFileInfoModel.setGmtCreated(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].GmtCreated"));
			backupFileInfoModel.setGmtModified(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].GmtModified"));
			backupFileInfoModel.setBackupFileId(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].BackupFileId"));
			backupFileInfoModel.setBackupFileName(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].BackupFileName"));
			backupFileInfoModel.setInstanceGroupId(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].InstanceGroupId"));
			backupFileInfoModel.setAndroidInstanceId(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].AndroidInstanceId"));
			backupFileInfoModel.setAndroidInstanceName(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].AndroidInstanceName"));
			backupFileInfoModel.setTaskId(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].TaskId"));
			backupFileInfoModel.setEndUserId(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].EndUserId"));
			backupFileInfoModel.setStatus(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].Status"));
			backupFileInfoModel.setRegionId(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].RegionId"));
			backupFileInfoModel.setFileSize(_ctx.longValue("DescribeBackupFilesResponse.Data["+ i +"].FileSize"));
			backupFileInfoModel.setUploadType(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].UploadType"));
			backupFileInfoModel.setUploadEndpoint(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].UploadEndpoint"));
			backupFileInfoModel.setBackupFilePath(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].BackupFilePath"));
			backupFileInfoModel.setDescription(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].Description"));
			backupFileInfoModel.setExtParams(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].ExtParams"));
			backupFileInfoModel.setBackupAll(_ctx.booleanValue("DescribeBackupFilesResponse.Data["+ i +"].BackupAll"));

			List<String> sourceFilePathList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupFilesResponse.Data["+ i +"].SourceFilePathList.Length"); j++) {
				sourceFilePathList.add(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].SourceFilePathList["+ j +"]"));
			}
			backupFileInfoModel.setSourceFilePathList(sourceFilePathList);

			List<String> sourceAppInfoList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupFilesResponse.Data["+ i +"].SourceAppInfoList.Length"); j++) {
				sourceAppInfoList.add(_ctx.stringValue("DescribeBackupFilesResponse.Data["+ i +"].SourceAppInfoList["+ j +"]"));
			}
			backupFileInfoModel.setSourceAppInfoList(sourceAppInfoList);

			data.add(backupFileInfoModel);
		}
		describeBackupFilesResponse.setData(data);
	 
	 	return describeBackupFilesResponse;
	}
}