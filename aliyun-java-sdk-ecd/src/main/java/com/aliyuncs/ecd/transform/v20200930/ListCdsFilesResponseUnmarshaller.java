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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.ListCdsFilesResponse;
import com.aliyuncs.ecd.model.v20200930.ListCdsFilesResponse.FileModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCdsFilesResponseUnmarshaller {

	public static ListCdsFilesResponse unmarshall(ListCdsFilesResponse listCdsFilesResponse, UnmarshallerContext _ctx) {
		
		listCdsFilesResponse.setRequestId(_ctx.stringValue("ListCdsFilesResponse.RequestId"));
		listCdsFilesResponse.setNextToken(_ctx.stringValue("ListCdsFilesResponse.NextToken"));
		listCdsFilesResponse.setCount(_ctx.stringValue("ListCdsFilesResponse.Count"));
		listCdsFilesResponse.setCode(_ctx.stringValue("ListCdsFilesResponse.Code"));
		listCdsFilesResponse.setMessage(_ctx.stringValue("ListCdsFilesResponse.Message"));
		listCdsFilesResponse.setSuccess(_ctx.booleanValue("ListCdsFilesResponse.Success"));

		List<FileModel> fileModels = new ArrayList<FileModel>();
		for (int i = 0; i < _ctx.lengthValue("ListCdsFilesResponse.FileModels.Length"); i++) {
			FileModel fileModel = new FileModel();
			fileModel.setStatus(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Status"));
			fileModel.setContentType(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].ContentType"));
			fileModel.setFileType(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].FileType"));
			fileModel.setStorageType(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].StorageType"));
			fileModel.setFileExtension(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].FileExtension"));
			fileModel.setDomainId(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].DomainId"));
			fileModel.setFileId(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].FileId"));
			fileModel.setCreator(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Creator"));
			fileModel.setOpenTime(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].OpenTime"));
			fileModel.setParentId(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].ParentId"));
			fileModel.setModifier(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Modifier"));
			fileModel.setDescription(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Description"));
			fileModel.setName(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Name"));
			fileModel.setDownloadUrl(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].DownloadUrl"));
			fileModel.setSha1(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Sha1"));
			fileModel.setOpenTimeStamp(_ctx.longValue("ListCdsFilesResponse.FileModels["+ i +"].OpenTimeStamp"));
			fileModel.setRegionId(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].RegionId"));
			fileModel.setRootId(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].RootId"));
			fileModel.setFilePath(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].FilePath"));
			fileModel.setSize(_ctx.longValue("ListCdsFilesResponse.FileModels["+ i +"].Size"));
			fileModel.setCategory(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Category"));
			fileModel.setMd5(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Md5"));
			fileModel.setDriveId(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].DriveId"));
			fileModel.setThumbnail(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].Thumbnail"));
			fileModel.setCreateTime(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].CreateTime"));
			fileModel.setModifiedTime(_ctx.stringValue("ListCdsFilesResponse.FileModels["+ i +"].ModifiedTime"));

			fileModels.add(fileModel);
		}
		listCdsFilesResponse.setFileModels(fileModels);
	 
	 	return listCdsFilesResponse;
	}
}