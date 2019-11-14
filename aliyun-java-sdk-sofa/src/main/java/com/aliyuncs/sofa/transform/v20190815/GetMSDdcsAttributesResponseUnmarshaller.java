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

import com.aliyuncs.sofa.model.v20190815.GetMSDdcsAttributesResponse;
import com.aliyuncs.sofa.model.v20190815.GetMSDdcsAttributesResponse.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMSDdcsAttributesResponseUnmarshaller {

	public static GetMSDdcsAttributesResponse unmarshall(GetMSDdcsAttributesResponse getMSDdcsAttributesResponse, UnmarshallerContext _ctx) {
		
		getMSDdcsAttributesResponse.setRequestId(_ctx.stringValue("GetMSDdcsAttributesResponse.RequestId"));

		Attribute attribute = new Attribute();
		attribute.setAttributeName(_ctx.stringValue("GetMSDdcsAttributesResponse.Attribute.AttributeName"));
		attribute.setDesc(_ctx.stringValue("GetMSDdcsAttributesResponse.Attribute.Desc"));
		attribute.setId(_ctx.integerValue("GetMSDdcsAttributesResponse.Attribute.Id"));
		attribute.setInstanceId(_ctx.stringValue("GetMSDdcsAttributesResponse.Attribute.InstanceId"));
		getMSDdcsAttributesResponse.setAttribute(attribute);
	 
	 	return getMSDdcsAttributesResponse;
	}
}