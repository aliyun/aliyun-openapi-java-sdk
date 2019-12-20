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

package com.aliyuncs.ons.transform.v20190214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsDLQMessageResendByIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsDLQMessageResendByIdResponseUnmarshaller {

	public static OnsDLQMessageResendByIdResponse unmarshall(OnsDLQMessageResendByIdResponse onsDLQMessageResendByIdResponse, UnmarshallerContext _ctx) {
		
		onsDLQMessageResendByIdResponse.setRequestId(_ctx.stringValue("OnsDLQMessageResendByIdResponse.RequestId"));
		onsDLQMessageResendByIdResponse.setHelpUrl(_ctx.stringValue("OnsDLQMessageResendByIdResponse.HelpUrl"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OnsDLQMessageResendByIdResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("OnsDLQMessageResendByIdResponse.Data["+ i +"]"));
		}
		onsDLQMessageResendByIdResponse.setData(data);
	 
	 	return onsDLQMessageResendByIdResponse;
	}
}