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

package com.aliyuncs.lrg.transform.v20191010;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lrg.model.v20191010.ChangeStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeStatusResponseUnmarshaller {

	public static ChangeStatusResponse unmarshall(ChangeStatusResponse changeStatusResponse, UnmarshallerContext _ctx) {
		
		changeStatusResponse.setCode(_ctx.integerValue("ChangeStatusResponse.code"));
		changeStatusResponse.setMessage(_ctx.stringValue("ChangeStatusResponse.message"));
		changeStatusResponse.setSuccess(_ctx.booleanValue("ChangeStatusResponse.success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ChangeStatusResponse.data.Length"); i++) {
			data.add(_ctx.stringValue("ChangeStatusResponse.data["+ i +"]"));
		}
		changeStatusResponse.setData(data);
	 
	 	return changeStatusResponse;
	}
}