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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.CreateSubnetResponse;
import com.aliyuncs.eflo.model.v20220530.CreateSubnetResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSubnetResponseUnmarshaller {

	public static CreateSubnetResponse unmarshall(CreateSubnetResponse createSubnetResponse, UnmarshallerContext _ctx) {
		
		createSubnetResponse.setRequestId(_ctx.stringValue("CreateSubnetResponse.RequestId"));
		createSubnetResponse.setCode(_ctx.integerValue("CreateSubnetResponse.Code"));
		createSubnetResponse.setMessage(_ctx.stringValue("CreateSubnetResponse.Message"));

		Content content = new Content();
		content.setSubnetId(_ctx.stringValue("CreateSubnetResponse.Content.SubnetId"));
		createSubnetResponse.setContent(content);
	 
	 	return createSubnetResponse;
	}
}