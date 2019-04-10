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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListAvailableFileSystemTypesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListAvailableFileSystemTypesResponse.FileSystemTypes;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableFileSystemTypesResponseUnmarshaller {

	public static ListAvailableFileSystemTypesResponse unmarshall(ListAvailableFileSystemTypesResponse listAvailableFileSystemTypesResponse, UnmarshallerContext context) {
		
		listAvailableFileSystemTypesResponse.setRequestId(context.stringValue("ListAvailableFileSystemTypesResponse.RequestId"));

		List<FileSystemTypes> fileSystemTypeList = new ArrayList<FileSystemTypes>();
		for (int i = 0; i < context.lengthValue("ListAvailableFileSystemTypesResponse.FileSystemTypeList.Length"); i++) {
			FileSystemTypes fileSystemTypes = new FileSystemTypes();
			fileSystemTypes.setFileSystemType(context.stringValue("ListAvailableFileSystemTypesResponse.FileSystemTypeList["+ i +"].FileSystemType"));
			fileSystemTypes.setAvailable(context.booleanValue("ListAvailableFileSystemTypesResponse.FileSystemTypeList["+ i +"].Available"));
			fileSystemTypes.setProtocolType(context.stringValue("ListAvailableFileSystemTypesResponse.FileSystemTypeList["+ i +"].ProtocolType"));

			List<String> storageTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListAvailableFileSystemTypesResponse.FileSystemTypeList["+ i +"].StorageTypes.Length"); j++) {
				storageTypes.add(context.stringValue("ListAvailableFileSystemTypesResponse.FileSystemTypeList["+ i +"].StorageTypes["+ j +"]"));
			}
			fileSystemTypes.setStorageTypes(storageTypes);

			fileSystemTypeList.add(fileSystemTypes);
		}
		listAvailableFileSystemTypesResponse.setFileSystemTypeList(fileSystemTypeList);
	 
	 	return listAvailableFileSystemTypesResponse;
	}
}