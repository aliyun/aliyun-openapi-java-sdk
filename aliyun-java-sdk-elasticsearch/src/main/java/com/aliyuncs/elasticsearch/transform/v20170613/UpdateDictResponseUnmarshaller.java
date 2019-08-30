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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.UpdateDictResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateDictResponse.DictList;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateDictResponse.DictList.OssObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDictResponseUnmarshaller {

	public static UpdateDictResponse unmarshall(UpdateDictResponse updateDictResponse, UnmarshallerContext _ctx) {
		
		updateDictResponse.setRequestId(_ctx.stringValue("UpdateDictResponse.RequestId"));

		List<DictList> result = new ArrayList<DictList>();
		for (int i = 0; i < _ctx.lengthValue("UpdateDictResponse.Result.Length"); i++) {
			DictList dictList = new DictList();
			dictList.setName(_ctx.stringValue("UpdateDictResponse.Result["+ i +"].name"));
			dictList.setFileSize(_ctx.longValue("UpdateDictResponse.Result["+ i +"].fileSize"));
			dictList.setType(_ctx.stringValue("UpdateDictResponse.Result["+ i +"].type"));
			dictList.setSourceType(_ctx.stringValue("UpdateDictResponse.Result["+ i +"].sourceType"));

			OssObject ossObject = new OssObject();
			ossObject.setBucketName(_ctx.stringValue("UpdateDictResponse.Result["+ i +"].ossObject.bucketName"));
			ossObject.setKey(_ctx.stringValue("UpdateDictResponse.Result["+ i +"].ossObject.key"));
			ossObject.setEtag(_ctx.stringValue("UpdateDictResponse.Result["+ i +"].ossObject.etag"));
			dictList.setOssObject(ossObject);

			result.add(dictList);
		}
		updateDictResponse.setResult(result);
	 
	 	return updateDictResponse;
	}
}