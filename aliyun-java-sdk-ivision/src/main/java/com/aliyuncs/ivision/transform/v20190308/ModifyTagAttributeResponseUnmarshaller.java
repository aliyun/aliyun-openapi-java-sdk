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

package com.aliyuncs.ivision.transform.v20190308;

import com.aliyuncs.ivision.model.v20190308.ModifyTagAttributeResponse;
import com.aliyuncs.ivision.model.v20190308.ModifyTagAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTagAttributeResponseUnmarshaller {

	public static ModifyTagAttributeResponse unmarshall(ModifyTagAttributeResponse modifyTagAttributeResponse, UnmarshallerContext context) {
		
		modifyTagAttributeResponse.setRequestId(context.stringValue("ModifyTagAttributeResponse.RequestId"));

		Tag tag = new Tag();
		tag.setProjectId(context.stringValue("ModifyTagAttributeResponse.Tag.ProjectId"));
		tag.setTagId(context.stringValue("ModifyTagAttributeResponse.Tag.TagId"));
		tag.setTagName(context.stringValue("ModifyTagAttributeResponse.Tag.TagName"));
		tag.setDescription(context.stringValue("ModifyTagAttributeResponse.Tag.Description"));
		tag.setCount(context.integerValue("ModifyTagAttributeResponse.Tag.Count"));
		tag.setCreationTime(context.stringValue("ModifyTagAttributeResponse.Tag.CreationTime"));
		tag.setStatus(context.stringValue("ModifyTagAttributeResponse.Tag.Status"));
		modifyTagAttributeResponse.setTag(tag);
	 
	 	return modifyTagAttributeResponse;
	}
}