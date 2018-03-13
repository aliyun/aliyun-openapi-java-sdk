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

import com.aliyuncs.cloudphoto.model.v20170711.ReactivatePhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ReactivatePhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReactivatePhotosResponseUnmarshaller {

	public static ReactivatePhotosResponse unmarshall(ReactivatePhotosResponse reactivatePhotosResponse, UnmarshallerContext context) {
		
		reactivatePhotosResponse.setRequestId(context.stringValue("ReactivatePhotosResponse.RequestId"));
		reactivatePhotosResponse.setCode(context.stringValue("ReactivatePhotosResponse.Code"));
		reactivatePhotosResponse.setMessage(context.stringValue("ReactivatePhotosResponse.Message"));
		reactivatePhotosResponse.setAction(context.stringValue("ReactivatePhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("ReactivatePhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setId(context.longValue("ReactivatePhotosResponse.Results["+ i +"].Id"));
			result.setIdStr(context.stringValue("ReactivatePhotosResponse.Results["+ i +"].IdStr"));
			result.setCode(context.stringValue("ReactivatePhotosResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("ReactivatePhotosResponse.Results["+ i +"].Message"));

			results.add(result);
		}
		reactivatePhotosResponse.setResults(results);
	 
	 	return reactivatePhotosResponse;
	}
}