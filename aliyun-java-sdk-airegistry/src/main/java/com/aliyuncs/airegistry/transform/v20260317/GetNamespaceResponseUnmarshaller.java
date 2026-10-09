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

package com.aliyuncs.airegistry.transform.v20260317;

import com.aliyuncs.airegistry.model.v20260317.GetNamespaceResponse;
import com.aliyuncs.airegistry.model.v20260317.GetNamespaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNamespaceResponseUnmarshaller {

	public static GetNamespaceResponse unmarshall(GetNamespaceResponse getNamespaceResponse, UnmarshallerContext _ctx) {
		
		getNamespaceResponse.setRequestId(_ctx.stringValue("GetNamespaceResponse.RequestId"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("GetNamespaceResponse.Data.Description"));
		data.setPromptCount(_ctx.integerValue("GetNamespaceResponse.Data.PromptCount"));
		data.setCreatedTime(_ctx.stringValue("GetNamespaceResponse.Data.CreatedTime"));
		data.setSkillCount(_ctx.integerValue("GetNamespaceResponse.Data.SkillCount"));
		data.setSource(_ctx.stringValue("GetNamespaceResponse.Data.Source"));
		data.setName(_ctx.stringValue("GetNamespaceResponse.Data.Name"));
		data.setPublicDomain(_ctx.stringValue("GetNamespaceResponse.Data.PublicDomain"));
		data.setSourceIndex(_ctx.integerValue("GetNamespaceResponse.Data.SourceIndex"));
		data.setIpWhitelist(_ctx.stringValue("GetNamespaceResponse.Data.IpWhitelist"));
		data.setScanPolicy(_ctx.stringValue("GetNamespaceResponse.Data.ScanPolicy"));
		data.setPublicAccessEnabled(_ctx.booleanValue("GetNamespaceResponse.Data.PublicAccessEnabled"));
		data.setNamespaceId(_ctx.stringValue("GetNamespaceResponse.Data.NamespaceId"));
		data.setTags(_ctx.stringValue("GetNamespaceResponse.Data.Tags"));
		getNamespaceResponse.setData(data);
	 
	 	return getNamespaceResponse;
	}
}