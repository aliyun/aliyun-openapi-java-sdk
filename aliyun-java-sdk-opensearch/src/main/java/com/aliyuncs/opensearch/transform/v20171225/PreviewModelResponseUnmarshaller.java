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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.PreviewModelResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreviewModelResponseUnmarshaller {

	public static PreviewModelResponse unmarshall(PreviewModelResponse previewModelResponse, UnmarshallerContext _ctx) {
		
		previewModelResponse.setRequestId(_ctx.stringValue("PreviewModelResponse.requestId"));
		previewModelResponse.setTotalCount(_ctx.longValue("PreviewModelResponse.totalCount"));

		List<Map<Object, Object>> result = _ctx.listMapValue("PreviewModelResponse.result");
		previewModelResponse.setResult(result);
	 
	 	return previewModelResponse;
	}
}