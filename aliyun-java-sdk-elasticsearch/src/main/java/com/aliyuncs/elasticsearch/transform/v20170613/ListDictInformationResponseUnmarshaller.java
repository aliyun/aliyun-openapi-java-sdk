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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.ListDictInformationResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDictInformationResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.ListDictInformationResponse.Result.OssObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDictInformationResponseUnmarshaller {

	public static ListDictInformationResponse unmarshall(ListDictInformationResponse listDictInformationResponse, UnmarshallerContext _ctx) {
		
		listDictInformationResponse.setRequestId(_ctx.stringValue("ListDictInformationResponse.RequestId"));

		Result result = new Result();
		result.setFileSize(_ctx.longValue("ListDictInformationResponse.Result.fileSize"));
		result.setType(_ctx.stringValue("ListDictInformationResponse.Result.type"));

		OssObject ossObject = new OssObject();
		ossObject.setBucketName(_ctx.stringValue("ListDictInformationResponse.Result.ossObject.bucketName"));
		ossObject.setKey(_ctx.stringValue("ListDictInformationResponse.Result.ossObject.key"));
		ossObject.setEtag(_ctx.stringValue("ListDictInformationResponse.Result.ossObject.etag"));
		result.setOssObject(ossObject);
		listDictInformationResponse.setResult(result);
	 
	 	return listDictInformationResponse;
	}
}