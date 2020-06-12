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

package com.aliyuncs.rdc.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rdc.model.v20180821.AddRamMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRamMemberResponseUnmarshaller {

	public static AddRamMemberResponse unmarshall(AddRamMemberResponse addRamMemberResponse, UnmarshallerContext _ctx) {
		
		addRamMemberResponse.setRequestId(_ctx.stringValue("AddRamMemberResponse.RequestId"));
		addRamMemberResponse.setSuccess(_ctx.booleanValue("AddRamMemberResponse.Success"));
		addRamMemberResponse.setCode(_ctx.integerValue("AddRamMemberResponse.Code"));
		addRamMemberResponse.setMessage(_ctx.stringValue("AddRamMemberResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddRamMemberResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("AddRamMemberResponse.Data["+ i +"]"));
		}
		addRamMemberResponse.setData(data);
	 
	 	return addRamMemberResponse;
	}
}