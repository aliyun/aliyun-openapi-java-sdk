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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.ListFilesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFilesResponseUnmarshaller {

	public static ListFilesResponse unmarshall(ListFilesResponse listFilesResponse, UnmarshallerContext _ctx) {
		
		listFilesResponse.setRequestId(_ctx.stringValue("ListFilesResponse.RequestId"));
		listFilesResponse.setCode(_ctx.stringValue("ListFilesResponse.Code"));
		listFilesResponse.setMessage(_ctx.stringValue("ListFilesResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListFilesResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListFilesResponse.Data["+ i +"]"));
		}
		listFilesResponse.setData(data);
	 
	 	return listFilesResponse;
	}
}