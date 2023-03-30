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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.CreateVpdResponse;
import com.aliyuncs.eflo.model.v20220530.CreateVpdResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVpdResponseUnmarshaller {

	public static CreateVpdResponse unmarshall(CreateVpdResponse createVpdResponse, UnmarshallerContext _ctx) {
		
		createVpdResponse.setRequestId(_ctx.stringValue("CreateVpdResponse.RequestId"));
		createVpdResponse.setCode(_ctx.integerValue("CreateVpdResponse.Code"));
		createVpdResponse.setMessage(_ctx.stringValue("CreateVpdResponse.Message"));

		Content content = new Content();
		content.setVpdId(_ctx.stringValue("CreateVpdResponse.Content.VpdId"));

		List<String> subnetIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateVpdResponse.Content.SubnetIds.Length"); i++) {
			subnetIds.add(_ctx.stringValue("CreateVpdResponse.Content.SubnetIds["+ i +"]"));
		}
		content.setSubnetIds(subnetIds);
		createVpdResponse.setContent(content);
	 
	 	return createVpdResponse;
	}
}