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

import com.aliyuncs.sofa.model.v20190815.AddMSDdcsAttributesResponse;
import com.aliyuncs.sofa.model.v20190815.AddMSDdcsAttributesResponse.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMSDdcsAttributesResponseUnmarshaller {

	public static AddMSDdcsAttributesResponse unmarshall(AddMSDdcsAttributesResponse addMSDdcsAttributesResponse, UnmarshallerContext _ctx) {
		
		addMSDdcsAttributesResponse.setRequestId(_ctx.stringValue("AddMSDdcsAttributesResponse.RequestId"));

		Attribute attribute = new Attribute();
		attribute.setAttributeName(_ctx.stringValue("AddMSDdcsAttributesResponse.Attribute.AttributeName"));
		attribute.setDesc(_ctx.stringValue("AddMSDdcsAttributesResponse.Attribute.Desc"));
		attribute.setId(_ctx.integerValue("AddMSDdcsAttributesResponse.Attribute.Id"));
		attribute.setInstanceId(_ctx.stringValue("AddMSDdcsAttributesResponse.Attribute.InstanceId"));
		addMSDdcsAttributesResponse.setAttribute(attribute);
	 
	 	return addMSDdcsAttributesResponse;
	}
}