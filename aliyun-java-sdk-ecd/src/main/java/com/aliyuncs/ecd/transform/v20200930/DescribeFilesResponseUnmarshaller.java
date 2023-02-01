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

import com.aliyuncs.ecd.model.v20200930.DescribeFilesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeFilesResponse.Files;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFilesResponseUnmarshaller {

	public static DescribeFilesResponse unmarshall(DescribeFilesResponse describeFilesResponse, UnmarshallerContext _ctx) {
		
		describeFilesResponse.setRequestId(_ctx.stringValue("DescribeFilesResponse.RequestId"));
		describeFilesResponse.setCount(_ctx.integerValue("DescribeFilesResponse.Count"));
		describeFilesResponse.setNextToken(_ctx.stringValue("DescribeFilesResponse.NextToken"));
		describeFilesResponse.setSuccess(_ctx.booleanValue("DescribeFilesResponse.Success"));
		describeFilesResponse.setCode(_ctx.stringValue("DescribeFilesResponse.Code"));
		describeFilesResponse.setMessage(_ctx.stringValue("DescribeFilesResponse.Message"));

		List<Files> data = new ArrayList<Files>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFilesResponse.Data.Length"); i++) {
			Files files = new Files();
			files.setCreateTime(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].CreateTime"));
			files.setModifiedTime(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].ModifiedTime"));
			files.setDomainId(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].DomainId"));
			files.setDriveId(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].DriveId"));
			files.setFileId(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].FileId"));
			files.setRootId(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].RootId"));
			files.setFileType(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].FileType"));
			files.setStorageType(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].StorageType"));
			files.setCatetory(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Catetory"));
			files.setName(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Name"));
			files.setFileExtension(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].FileExtension"));
			files.setFilePath(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].FilePath"));
			files.setParentId(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].ParentId"));
			files.setCreator(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Creator"));
			files.setModifier(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Modifier"));
			files.setMd5(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Md5"));
			files.setSha1(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Sha1"));
			files.setContentType(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].ContentType"));
			files.setSize(_ctx.longValue("DescribeFilesResponse.Data["+ i +"].Size"));
			files.setStatus(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Status"));
			files.setDescription(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Description"));
			files.setThumbnail(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].Thumbnail"));
			files.setDownloadUrl(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].DownloadUrl"));
			files.setRegionId(_ctx.stringValue("DescribeFilesResponse.Data["+ i +"].RegionId"));

			data.add(files);
		}
		describeFilesResponse.setData(data);
	 
	 	return describeFilesResponse;
	}
}