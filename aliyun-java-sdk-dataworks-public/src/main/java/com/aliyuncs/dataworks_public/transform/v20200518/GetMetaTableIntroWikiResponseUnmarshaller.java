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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableIntroWikiResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableIntroWikiResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableIntroWikiResponseUnmarshaller {

	public static GetMetaTableIntroWikiResponse unmarshall(GetMetaTableIntroWikiResponse getMetaTableIntroWikiResponse, UnmarshallerContext _ctx) {
		
		getMetaTableIntroWikiResponse.setRequestId(_ctx.stringValue("GetMetaTableIntroWikiResponse.RequestId"));
		getMetaTableIntroWikiResponse.setErrorCode(_ctx.stringValue("GetMetaTableIntroWikiResponse.ErrorCode"));
		getMetaTableIntroWikiResponse.setErrorMessage(_ctx.stringValue("GetMetaTableIntroWikiResponse.ErrorMessage"));
		getMetaTableIntroWikiResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableIntroWikiResponse.HttpStatusCode"));
		getMetaTableIntroWikiResponse.setSuccess(_ctx.booleanValue("GetMetaTableIntroWikiResponse.Success"));

		Data data = new Data();
		data.setCreateTime(_ctx.longValue("GetMetaTableIntroWikiResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.longValue("GetMetaTableIntroWikiResponse.Data.ModifiedTime"));
		data.setCreator(_ctx.stringValue("GetMetaTableIntroWikiResponse.Data.Creator"));
		data.setVersion(_ctx.longValue("GetMetaTableIntroWikiResponse.Data.Version"));
		data.setCreatorName(_ctx.stringValue("GetMetaTableIntroWikiResponse.Data.CreatorName"));
		data.setContent(_ctx.stringValue("GetMetaTableIntroWikiResponse.Data.Content"));
		getMetaTableIntroWikiResponse.setData(data);
	 
	 	return getMetaTableIntroWikiResponse;
	}
}