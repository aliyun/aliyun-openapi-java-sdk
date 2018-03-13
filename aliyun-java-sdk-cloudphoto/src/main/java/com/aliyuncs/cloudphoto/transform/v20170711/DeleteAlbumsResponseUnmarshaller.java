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
package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.DeleteAlbumsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.DeleteAlbumsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAlbumsResponseUnmarshaller {

	public static DeleteAlbumsResponse unmarshall(DeleteAlbumsResponse deleteAlbumsResponse, UnmarshallerContext context) {
		
		deleteAlbumsResponse.setRequestId(context.stringValue("DeleteAlbumsResponse.RequestId"));
		deleteAlbumsResponse.setCode(context.stringValue("DeleteAlbumsResponse.Code"));
		deleteAlbumsResponse.setMessage(context.stringValue("DeleteAlbumsResponse.Message"));
		deleteAlbumsResponse.setAction(context.stringValue("DeleteAlbumsResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("DeleteAlbumsResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setId(context.longValue("DeleteAlbumsResponse.Results["+ i +"].Id"));
			result.setIdStr(context.stringValue("DeleteAlbumsResponse.Results["+ i +"].IdStr"));
			result.setCode(context.stringValue("DeleteAlbumsResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("DeleteAlbumsResponse.Results["+ i +"].Message"));

			results.add(result);
		}
		deleteAlbumsResponse.setResults(results);
	 
	 	return deleteAlbumsResponse;
	}
}