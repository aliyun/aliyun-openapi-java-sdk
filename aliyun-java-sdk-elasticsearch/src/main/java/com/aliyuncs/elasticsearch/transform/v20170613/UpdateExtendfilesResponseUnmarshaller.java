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

import com.aliyuncs.elasticsearch.model.v20170613.UpdateExtendfilesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateExtendfilesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateExtendfilesResponseUnmarshaller {

	public static UpdateExtendfilesResponse unmarshall(UpdateExtendfilesResponse updateExtendfilesResponse, UnmarshallerContext _ctx) {
		
		updateExtendfilesResponse.setRequestId(_ctx.stringValue("UpdateExtendfilesResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateExtendfilesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("UpdateExtendfilesResponse.Result["+ i +"].name"));
			resultItem.setFileSize(_ctx.longValue("UpdateExtendfilesResponse.Result["+ i +"].fileSize"));
			resultItem.setSourceType(_ctx.stringValue("UpdateExtendfilesResponse.Result["+ i +"].sourceType"));

			result.add(resultItem);
		}
		updateExtendfilesResponse.setResult(result);
	 
	 	return updateExtendfilesResponse;
	}
}