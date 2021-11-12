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

package com.aliyuncs.uisplus.transform.v20200707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uisplus.model.v20200707.CreateUisResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUisResponseUnmarshaller {

	public static CreateUisResponse unmarshall(CreateUisResponse createUisResponse, UnmarshallerContext _ctx) {
		
		createUisResponse.setRequestId(_ctx.stringValue("CreateUisResponse.RequestId"));
		createUisResponse.setUisId(_ctx.stringValue("CreateUisResponse.UisId"));

		List<String> uisNodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateUisResponse.UisNodes.Length"); i++) {
			uisNodes.add(_ctx.stringValue("CreateUisResponse.UisNodes["+ i +"]"));
		}
		createUisResponse.setUisNodes(uisNodes);
	 
	 	return createUisResponse;
	}
}