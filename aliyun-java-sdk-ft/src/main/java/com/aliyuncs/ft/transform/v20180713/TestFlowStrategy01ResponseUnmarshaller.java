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

package com.aliyuncs.ft.transform.v20180713;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ft.model.v20180713.TestFlowStrategy01Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestFlowStrategy01ResponseUnmarshaller {

	public static TestFlowStrategy01Response unmarshall(TestFlowStrategy01Response testFlowStrategy01Response, UnmarshallerContext _ctx) {
		
		testFlowStrategy01Response.setRequestId(_ctx.stringValue("TestFlowStrategy01Response.RequestId"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("TestFlowStrategy01Response.List.Length"); i++) {
			list.add(_ctx.stringValue("TestFlowStrategy01Response.List["+ i +"]"));
		}
		testFlowStrategy01Response.setList(list);

		List<String> names = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("TestFlowStrategy01Response.Names.Length"); i++) {
			names.add(_ctx.stringValue("TestFlowStrategy01Response.Names["+ i +"]"));
		}
		testFlowStrategy01Response.setNames(names);
	 
	 	return testFlowStrategy01Response;
	}
}