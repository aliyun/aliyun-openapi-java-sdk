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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetStandardLookupTableResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardLookupTableResponse.LookupTableInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardLookupTableResponse.LookupTableInfo.DirectoryReference;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardLookupTableResponse.LookupTableInfo.LookupTableValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStandardLookupTableResponseUnmarshaller {

	public static GetStandardLookupTableResponse unmarshall(GetStandardLookupTableResponse getStandardLookupTableResponse, UnmarshallerContext _ctx) {
		
		getStandardLookupTableResponse.setRequestId(_ctx.stringValue("GetStandardLookupTableResponse.RequestId"));
		getStandardLookupTableResponse.setSuccess(_ctx.booleanValue("GetStandardLookupTableResponse.Success"));
		getStandardLookupTableResponse.setHttpStatusCode(_ctx.integerValue("GetStandardLookupTableResponse.HttpStatusCode"));
		getStandardLookupTableResponse.setCode(_ctx.stringValue("GetStandardLookupTableResponse.Code"));
		getStandardLookupTableResponse.setMessage(_ctx.stringValue("GetStandardLookupTableResponse.Message"));

		LookupTableInfo lookupTableInfo = new LookupTableInfo();
		lookupTableInfo.setId(_ctx.longValue("GetStandardLookupTableResponse.LookupTableInfo.Id"));
		lookupTableInfo.setName(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.Name"));
		lookupTableInfo.setCode(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.Code"));
		lookupTableInfo.setDescription(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.Description"));
		lookupTableInfo.setCreator(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.Creator"));
		lookupTableInfo.setCreatorName(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.CreatorName"));
		lookupTableInfo.setLastModifier(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.LastModifier"));
		lookupTableInfo.setLastModifierName(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.LastModifierName"));
		lookupTableInfo.setOwner(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.Owner"));
		lookupTableInfo.setOwnerName(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.OwnerName"));
		lookupTableInfo.setCreateTime(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.CreateTime"));
		lookupTableInfo.setModifyTime(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.ModifyTime"));

		DirectoryReference directoryReference = new DirectoryReference();
		directoryReference.setDirectory(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.DirectoryReference.Directory"));
		lookupTableInfo.setDirectoryReference(directoryReference);

		List<LookupTableValue> lookupTableValueList = new ArrayList<LookupTableValue>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardLookupTableResponse.LookupTableInfo.LookupTableValueList.Length"); i++) {
			LookupTableValue lookupTableValue = new LookupTableValue();
			lookupTableValue.setValue(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.LookupTableValueList["+ i +"].Value"));
			lookupTableValue.setName(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.LookupTableValueList["+ i +"].Name"));
			lookupTableValue.setEnglishName(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.LookupTableValueList["+ i +"].EnglishName"));
			lookupTableValue.setDescription(_ctx.stringValue("GetStandardLookupTableResponse.LookupTableInfo.LookupTableValueList["+ i +"].Description"));

			lookupTableValueList.add(lookupTableValue);
		}
		lookupTableInfo.setLookupTableValueList(lookupTableValueList);
		getStandardLookupTableResponse.setLookupTableInfo(lookupTableInfo);
	 
	 	return getStandardLookupTableResponse;
	}
}