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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListFpShotFilesResponse;
import com.aliyuncs.mts.model.v20140618.ListFpShotFilesResponse.FpShotFile;
import com.aliyuncs.mts.model.v20140618.ListFpShotFilesResponse.FpShotFile.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFpShotFilesResponseUnmarshaller {

	public static ListFpShotFilesResponse unmarshall(ListFpShotFilesResponse listFpShotFilesResponse, UnmarshallerContext _ctx) {
		
		listFpShotFilesResponse.setRequestId(_ctx.stringValue("ListFpShotFilesResponse.RequestId"));
		listFpShotFilesResponse.setNextPageToken(_ctx.stringValue("ListFpShotFilesResponse.NextPageToken"));

		List<FpShotFile> fpShotFileList = new ArrayList<FpShotFile>();
		for (int i = 0; i < _ctx.lengthValue("ListFpShotFilesResponse.FpShotFileList.Length"); i++) {
			FpShotFile fpShotFile = new FpShotFile();
			fpShotFile.setPrimaryKey(_ctx.stringValue("ListFpShotFilesResponse.FpShotFileList["+ i +"].PrimaryKey"));
			fpShotFile.setFileId(_ctx.stringValue("ListFpShotFilesResponse.FpShotFileList["+ i +"].FileId"));

			InputFile inputFile = new InputFile();
			inputFile.setObject(_ctx.stringValue("ListFpShotFilesResponse.FpShotFileList["+ i +"].InputFile.Object"));
			inputFile.setLocation(_ctx.stringValue("ListFpShotFilesResponse.FpShotFileList["+ i +"].InputFile.Location"));
			inputFile.setBucket(_ctx.stringValue("ListFpShotFilesResponse.FpShotFileList["+ i +"].InputFile.Bucket"));
			fpShotFile.setInputFile(inputFile);

			fpShotFileList.add(fpShotFile);
		}
		listFpShotFilesResponse.setFpShotFileList(fpShotFileList);
	 
	 	return listFpShotFilesResponse;
	}
}