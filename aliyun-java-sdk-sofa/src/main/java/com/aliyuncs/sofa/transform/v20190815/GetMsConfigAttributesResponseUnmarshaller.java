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

import com.aliyuncs.sofa.model.v20190815.GetMsConfigAttributesResponse;
import com.aliyuncs.sofa.model.v20190815.GetMsConfigAttributesResponse.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsConfigAttributesResponseUnmarshaller {

	public static GetMsConfigAttributesResponse unmarshall(GetMsConfigAttributesResponse getMsConfigAttributesResponse, UnmarshallerContext _ctx) {
		
		getMsConfigAttributesResponse.setRequestId(_ctx.stringValue("GetMsConfigAttributesResponse.RequestId"));
		getMsConfigAttributesResponse.setResultCode(_ctx.stringValue("GetMsConfigAttributesResponse.ResultCode"));
		getMsConfigAttributesResponse.setResultMessage(_ctx.stringValue("GetMsConfigAttributesResponse.ResultMessage"));

		Attribute attribute = new Attribute();
		attribute.setAttributeName(_ctx.stringValue("GetMsConfigAttributesResponse.Attribute.AttributeName"));
		attribute.setDesc(_ctx.stringValue("GetMsConfigAttributesResponse.Attribute.Desc"));
		attribute.setId(_ctx.longValue("GetMsConfigAttributesResponse.Attribute.Id"));
		attribute.setInstanceId(_ctx.stringValue("GetMsConfigAttributesResponse.Attribute.InstanceId"));
		getMsConfigAttributesResponse.setAttribute(attribute);
	 
	 	return getMsConfigAttributesResponse;
	}
}