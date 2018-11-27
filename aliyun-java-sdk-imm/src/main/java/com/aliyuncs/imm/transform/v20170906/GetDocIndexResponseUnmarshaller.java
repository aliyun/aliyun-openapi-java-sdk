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

	public static GetDocIndexResponse unmarshall(GetDocIndexResponse getDocIndexResponse, UnmarshallerContext context) {
		
		getDocIndexResponse.setRequestId(context.stringValue("GetDocIndexResponse.RequestId"));
		getDocIndexResponse.setIndexCreatedTime(context.stringValue("GetDocIndexResponse.IndexCreatedTime"));
		getDocIndexResponse.setIndexModifiedTime(context.stringValue("GetDocIndexResponse.IndexModifiedTime"));
		getDocIndexResponse.setUniqueId(context.stringValue("GetDocIndexResponse.UniqueId"));
		getDocIndexResponse.setSrcUri(context.stringValue("GetDocIndexResponse.SrcUri"));
		getDocIndexResponse.setName(context.stringValue("GetDocIndexResponse.Name"));
		getDocIndexResponse.setContentType(context.stringValue("GetDocIndexResponse.ContentType"));
		getDocIndexResponse.setLastModified(context.stringValue("GetDocIndexResponse.LastModified"));
		getDocIndexResponse.setSize(context.longValue("GetDocIndexResponse.Size"));
		getDocIndexResponse.setPageNum(context.longValue("GetDocIndexResponse.PageNum"));
		getDocIndexResponse.setCustomKey1(context.stringValue("GetDocIndexResponse.CustomKey1"));
		getDocIndexResponse.setCustomKey2(context.stringValue("GetDocIndexResponse.CustomKey2"));
		getDocIndexResponse.setCustomKey3(context.stringValue("GetDocIndexResponse.CustomKey3"));
		getDocIndexResponse.setCustomKey4(context.stringValue("GetDocIndexResponse.CustomKey4"));
		getDocIndexResponse.setCustomKey5(context.stringValue("GetDocIndexResponse.CustomKey5"));
		getDocIndexResponse.setCustomKey6(context.stringValue("GetDocIndexResponse.CustomKey6"));
	 
	 	return getDocIndexResponse;
	}
}