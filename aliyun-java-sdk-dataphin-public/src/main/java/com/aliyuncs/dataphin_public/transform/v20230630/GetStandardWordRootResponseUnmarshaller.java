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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetStandardWordRootResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardWordRootResponse.WordRootInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStandardWordRootResponseUnmarshaller {

	public static GetStandardWordRootResponse unmarshall(GetStandardWordRootResponse getStandardWordRootResponse, UnmarshallerContext _ctx) {
		
		getStandardWordRootResponse.setRequestId(_ctx.stringValue("GetStandardWordRootResponse.RequestId"));
		getStandardWordRootResponse.setMessage(_ctx.stringValue("GetStandardWordRootResponse.Message"));
		getStandardWordRootResponse.setHttpStatusCode(_ctx.integerValue("GetStandardWordRootResponse.HttpStatusCode"));
		getStandardWordRootResponse.setCode(_ctx.stringValue("GetStandardWordRootResponse.Code"));
		getStandardWordRootResponse.setSuccess(_ctx.booleanValue("GetStandardWordRootResponse.Success"));

		WordRootInfo wordRootInfo = new WordRootInfo();
		wordRootInfo.setAbbreviation(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.Abbreviation"));
		wordRootInfo.setModifyTime(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.ModifyTime"));
		wordRootInfo.setLastModifier(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.LastModifier"));
		wordRootInfo.setDescription(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.Description"));
		wordRootInfo.setFullName(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.FullName"));
		wordRootInfo.setCreateTime(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.CreateTime"));
		wordRootInfo.setCreator(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.Creator"));
		wordRootInfo.setCreatorName(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.CreatorName"));
		wordRootInfo.setLastModifierName(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.LastModifierName"));
		wordRootInfo.setName(_ctx.stringValue("GetStandardWordRootResponse.WordRootInfo.Name"));
		getStandardWordRootResponse.setWordRootInfo(wordRootInfo);
	 
	 	return getStandardWordRootResponse;
	}
}