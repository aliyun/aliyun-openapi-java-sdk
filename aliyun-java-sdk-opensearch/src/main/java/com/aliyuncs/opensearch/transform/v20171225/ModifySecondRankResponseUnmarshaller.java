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

import com.aliyuncs.opensearch.model.v20171225.ModifySecondRankResponse;
import com.aliyuncs.opensearch.model.v20171225.ModifySecondRankResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySecondRankResponseUnmarshaller {

	public static ModifySecondRankResponse unmarshall(ModifySecondRankResponse modifySecondRankResponse, UnmarshallerContext _ctx) {
		
		modifySecondRankResponse.setRequestId(_ctx.stringValue("ModifySecondRankResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("ModifySecondRankResponse.result.id"));
		result.setName(_ctx.stringValue("ModifySecondRankResponse.result.name"));
		result.setMeta(_ctx.stringValue("ModifySecondRankResponse.result.meta"));
		result.setActive(_ctx.booleanValue("ModifySecondRankResponse.result.active"));
		result.setDescription(_ctx.stringValue("ModifySecondRankResponse.result.description"));
		result.setCreated(_ctx.integerValue("ModifySecondRankResponse.result.created"));
		result.setUpdated(_ctx.integerValue("ModifySecondRankResponse.result.updated"));
		result.setIsDefault(_ctx.stringValue("ModifySecondRankResponse.result.isDefault"));
		result.setIsSys(_ctx.stringValue("ModifySecondRankResponse.result.isSys"));
		modifySecondRankResponse.setResult(result);
	 
	 	return modifySecondRankResponse;
	}
}