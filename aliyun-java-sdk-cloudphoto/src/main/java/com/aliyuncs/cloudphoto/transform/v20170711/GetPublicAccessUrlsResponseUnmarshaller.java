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

import com.aliyuncs.cloudphoto.model.v20170711.GetPublicAccessUrlsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetPublicAccessUrlsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPublicAccessUrlsResponseUnmarshaller {

	public static GetPublicAccessUrlsResponse unmarshall(GetPublicAccessUrlsResponse getPublicAccessUrlsResponse, UnmarshallerContext context) {
		
		getPublicAccessUrlsResponse.setRequestId(context.stringValue("GetPublicAccessUrlsResponse.RequestId"));
		getPublicAccessUrlsResponse.setCode(context.stringValue("GetPublicAccessUrlsResponse.Code"));
		getPublicAccessUrlsResponse.setMessage(context.stringValue("GetPublicAccessUrlsResponse.Message"));
		getPublicAccessUrlsResponse.setAction(context.stringValue("GetPublicAccessUrlsResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("GetPublicAccessUrlsResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setCode(context.stringValue("GetPublicAccessUrlsResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("GetPublicAccessUrlsResponse.Results["+ i +"].Message"));
			result.setPhotoId(context.longValue("GetPublicAccessUrlsResponse.Results["+ i +"].PhotoId"));
			result.setPhotoIdStr(context.stringValue("GetPublicAccessUrlsResponse.Results["+ i +"].PhotoIdStr"));
			result.setAccessUrl(context.stringValue("GetPublicAccessUrlsResponse.Results["+ i +"].AccessUrl"));

			results.add(result);
		}
		getPublicAccessUrlsResponse.setResults(results);
	 
	 	return getPublicAccessUrlsResponse;
	}
}