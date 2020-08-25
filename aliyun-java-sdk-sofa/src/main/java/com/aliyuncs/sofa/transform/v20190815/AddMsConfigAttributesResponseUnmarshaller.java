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

import com.aliyuncs.sofa.model.v20190815.AddMsConfigAttributesResponse;
import com.aliyuncs.sofa.model.v20190815.AddMsConfigAttributesResponse.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMsConfigAttributesResponseUnmarshaller {

	public static AddMsConfigAttributesResponse unmarshall(AddMsConfigAttributesResponse addMsConfigAttributesResponse, UnmarshallerContext _ctx) {
		
		addMsConfigAttributesResponse.setRequestId(_ctx.stringValue("AddMsConfigAttributesResponse.RequestId"));
		addMsConfigAttributesResponse.setResultCode(_ctx.stringValue("AddMsConfigAttributesResponse.ResultCode"));
		addMsConfigAttributesResponse.setResultMessage(_ctx.stringValue("AddMsConfigAttributesResponse.ResultMessage"));

		Attribute attribute = new Attribute();
		attribute.setAttributeName(_ctx.stringValue("AddMsConfigAttributesResponse.Attribute.AttributeName"));
		attribute.setDesc(_ctx.stringValue("AddMsConfigAttributesResponse.Attribute.Desc"));
		attribute.setId(_ctx.longValue("AddMsConfigAttributesResponse.Attribute.Id"));
		attribute.setInstanceId(_ctx.stringValue("AddMsConfigAttributesResponse.Attribute.InstanceId"));
		addMsConfigAttributesResponse.setAttribute(attribute);
	 
	 	return addMsConfigAttributesResponse;
	}
}