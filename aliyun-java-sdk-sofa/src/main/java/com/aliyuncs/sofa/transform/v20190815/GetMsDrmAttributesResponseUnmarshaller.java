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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetMsDrmAttributesResponse;
import com.aliyuncs.sofa.model.v20190815.GetMsDrmAttributesResponse.DrmAttribute;
import com.aliyuncs.sofa.model.v20190815.GetMsDrmAttributesResponse.DrmAttribute.Parent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsDrmAttributesResponseUnmarshaller {

	public static GetMsDrmAttributesResponse unmarshall(GetMsDrmAttributesResponse getMsDrmAttributesResponse, UnmarshallerContext _ctx) {
		
		getMsDrmAttributesResponse.setRequestId(_ctx.stringValue("GetMsDrmAttributesResponse.RequestId"));
		getMsDrmAttributesResponse.setResultCode(_ctx.stringValue("GetMsDrmAttributesResponse.ResultCode"));
		getMsDrmAttributesResponse.setResultMessage(_ctx.stringValue("GetMsDrmAttributesResponse.ResultMessage"));

		DrmAttribute drmAttribute = new DrmAttribute();
		drmAttribute.setAttributeName(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.AttributeName"));
		drmAttribute.setDataId(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.DataId"));
		drmAttribute.setId(_ctx.longValue("GetMsDrmAttributesResponse.DrmAttribute.Id"));
		drmAttribute.setInstanceId(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.InstanceId"));
		drmAttribute.setName(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Name"));
		drmAttribute.setParentId(_ctx.longValue("GetMsDrmAttributesResponse.DrmAttribute.ParentId"));

		Parent parent = new Parent();
		parent.setAppName(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.AppName"));
		parent.setId(_ctx.longValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.Id"));
		parent.setInstanceId(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.InstanceId"));
		parent.setName(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.Name"));
		parent.setRegion(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.Region"));
		parent.setResourceDomain(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.ResourceDomain"));
		parent.setResourceId(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.ResourceId"));
		parent.setResourceVersion(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.ResourceVersion"));
		parent.setType(_ctx.stringValue("GetMsDrmAttributesResponse.DrmAttribute.Parent.Type"));
		drmAttribute.setParent(parent);
		getMsDrmAttributesResponse.setDrmAttribute(drmAttribute);
	 
	 	return getMsDrmAttributesResponse;
	}
}