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

import com.aliyuncs.elasticsearch.model.v20170613.UpdateHotIkDictsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateHotIkDictsResponse.DictList;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateHotIkDictsResponse.DictList.OssObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateHotIkDictsResponseUnmarshaller {

	public static UpdateHotIkDictsResponse unmarshall(UpdateHotIkDictsResponse updateHotIkDictsResponse, UnmarshallerContext _ctx) {
		
		updateHotIkDictsResponse.setRequestId(_ctx.stringValue("UpdateHotIkDictsResponse.RequestId"));

		List<DictList> result = new ArrayList<DictList>();
		for (int i = 0; i < _ctx.lengthValue("UpdateHotIkDictsResponse.Result.Length"); i++) {
			DictList dictList = new DictList();
			dictList.setName(_ctx.stringValue("UpdateHotIkDictsResponse.Result["+ i +"].name"));
			dictList.setFileSize(_ctx.longValue("UpdateHotIkDictsResponse.Result["+ i +"].fileSize"));
			dictList.setType(_ctx.stringValue("UpdateHotIkDictsResponse.Result["+ i +"].type"));
			dictList.setSourceType(_ctx.stringValue("UpdateHotIkDictsResponse.Result["+ i +"].sourceType"));

			OssObject ossObject = new OssObject();
			ossObject.setBucketName(_ctx.stringValue("UpdateHotIkDictsResponse.Result["+ i +"].ossObject.bucketName"));
			ossObject.setKey(_ctx.stringValue("UpdateHotIkDictsResponse.Result["+ i +"].ossObject.key"));
			ossObject.setEtag(_ctx.stringValue("UpdateHotIkDictsResponse.Result["+ i +"].ossObject.etag"));
			dictList.setOssObject(ossObject);

			result.add(dictList);
		}
		updateHotIkDictsResponse.setResult(result);
	 
	 	return updateHotIkDictsResponse;
	}
}