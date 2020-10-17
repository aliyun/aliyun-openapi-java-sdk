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

import com.aliyuncs.elasticsearch.model.v20170613.UpdateAliwsDictResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateAliwsDictResponse.DictList;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAliwsDictResponseUnmarshaller {

	public static UpdateAliwsDictResponse unmarshall(UpdateAliwsDictResponse updateAliwsDictResponse, UnmarshallerContext _ctx) {
		
		updateAliwsDictResponse.setRequestId(_ctx.stringValue("UpdateAliwsDictResponse.RequestId"));

		List<DictList> result = new ArrayList<DictList>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAliwsDictResponse.Result.Length"); i++) {
			DictList dictList = new DictList();
			dictList.setName(_ctx.stringValue("UpdateAliwsDictResponse.Result["+ i +"].name"));
			dictList.setFileSize(_ctx.longValue("UpdateAliwsDictResponse.Result["+ i +"].fileSize"));
			dictList.setType(_ctx.stringValue("UpdateAliwsDictResponse.Result["+ i +"].type"));
			dictList.setSourceType(_ctx.stringValue("UpdateAliwsDictResponse.Result["+ i +"].sourceType"));

			result.add(dictList);
		}
		updateAliwsDictResponse.setResult(result);
	 
	 	return updateAliwsDictResponse;
	}
}