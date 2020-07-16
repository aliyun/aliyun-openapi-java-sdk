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

import com.aliyuncs.opensearch.model.v20171225.CreateFirstRankResponse;
import com.aliyuncs.opensearch.model.v20171225.CreateFirstRankResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.CreateFirstRankResponse.Result.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFirstRankResponseUnmarshaller {

	public static CreateFirstRankResponse unmarshall(CreateFirstRankResponse createFirstRankResponse, UnmarshallerContext _ctx) {
		
		createFirstRankResponse.setRequestId(_ctx.stringValue("CreateFirstRankResponse.requestId"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CreateFirstRankResponse.result.name"));
		result.setActive(_ctx.booleanValue("CreateFirstRankResponse.result.active"));

		List<MetaItem> meta = new ArrayList<MetaItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateFirstRankResponse.result.meta.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setAttribute(_ctx.stringValue("CreateFirstRankResponse.result.meta["+ i +"].attribute"));
			metaItem.setArg(_ctx.stringValue("CreateFirstRankResponse.result.meta["+ i +"].arg"));
			metaItem.setWeight(_ctx.floatValue("CreateFirstRankResponse.result.meta["+ i +"].weight"));

			meta.add(metaItem);
		}
		result.setMeta(meta);
		createFirstRankResponse.setResult(result);
	 
	 	return createFirstRankResponse;
	}
}