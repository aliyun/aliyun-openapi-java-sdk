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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListFunctionFilesByProjectIdResponse;
import com.aliyuncs.iovcc.model.v20180501.ListFunctionFilesByProjectIdResponse.File;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionFilesByProjectIdResponseUnmarshaller {

	public static ListFunctionFilesByProjectIdResponse unmarshall(ListFunctionFilesByProjectIdResponse listFunctionFilesByProjectIdResponse, UnmarshallerContext _ctx) {
		
		listFunctionFilesByProjectIdResponse.setRequestId(_ctx.stringValue("ListFunctionFilesByProjectIdResponse.RequestId"));

		List<File> files = new ArrayList<File>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionFilesByProjectIdResponse.Files.Length"); i++) {
			File file = new File();
			file.setId(_ctx.longValue("ListFunctionFilesByProjectIdResponse.Files["+ i +"].Id"));
			file.setName(_ctx.stringValue("ListFunctionFilesByProjectIdResponse.Files["+ i +"].Name"));
			file.setType(_ctx.integerValue("ListFunctionFilesByProjectIdResponse.Files["+ i +"].Type"));
			file.setContentId(_ctx.longValue("ListFunctionFilesByProjectIdResponse.Files["+ i +"].ContentId"));
			file.setStatus(_ctx.integerValue("ListFunctionFilesByProjectIdResponse.Files["+ i +"].Status"));
			file.setGmtCreate(_ctx.longValue("ListFunctionFilesByProjectIdResponse.Files["+ i +"].GmtCreate"));
			file.setGmtModified(_ctx.longValue("ListFunctionFilesByProjectIdResponse.Files["+ i +"].GmtModified"));

			files.add(file);
		}
		listFunctionFilesByProjectIdResponse.setFiles(files);
	 
	 	return listFunctionFilesByProjectIdResponse;
	}
}