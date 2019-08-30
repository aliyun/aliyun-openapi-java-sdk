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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetDocIndexResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDocIndexResponseUnmarshaller {

	public static GetDocIndexResponse unmarshall(GetDocIndexResponse getDocIndexResponse, UnmarshallerContext _ctx) {
		
		getDocIndexResponse.setRequestId(_ctx.stringValue("GetDocIndexResponse.RequestId"));
		getDocIndexResponse.setIndexCreatedTime(_ctx.stringValue("GetDocIndexResponse.IndexCreatedTime"));
		getDocIndexResponse.setIndexModifiedTime(_ctx.stringValue("GetDocIndexResponse.IndexModifiedTime"));
		getDocIndexResponse.setUniqueId(_ctx.stringValue("GetDocIndexResponse.UniqueId"));
		getDocIndexResponse.setSrcUri(_ctx.stringValue("GetDocIndexResponse.SrcUri"));
		getDocIndexResponse.setName(_ctx.stringValue("GetDocIndexResponse.Name"));
		getDocIndexResponse.setContentType(_ctx.stringValue("GetDocIndexResponse.ContentType"));
		getDocIndexResponse.setLastModified(_ctx.stringValue("GetDocIndexResponse.LastModified"));
		getDocIndexResponse.setSize(_ctx.longValue("GetDocIndexResponse.Size"));
		getDocIndexResponse.setPageNum(_ctx.longValue("GetDocIndexResponse.PageNum"));
		getDocIndexResponse.setCustomKey1(_ctx.stringValue("GetDocIndexResponse.CustomKey1"));
		getDocIndexResponse.setCustomKey2(_ctx.stringValue("GetDocIndexResponse.CustomKey2"));
		getDocIndexResponse.setCustomKey3(_ctx.stringValue("GetDocIndexResponse.CustomKey3"));
		getDocIndexResponse.setCustomKey4(_ctx.stringValue("GetDocIndexResponse.CustomKey4"));
		getDocIndexResponse.setCustomKey5(_ctx.stringValue("GetDocIndexResponse.CustomKey5"));
		getDocIndexResponse.setCustomKey6(_ctx.stringValue("GetDocIndexResponse.CustomKey6"));
	 
	 	return getDocIndexResponse;
	}
}