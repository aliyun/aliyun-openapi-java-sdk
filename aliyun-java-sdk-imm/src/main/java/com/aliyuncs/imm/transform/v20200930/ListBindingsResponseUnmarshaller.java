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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.ListBindingsResponse;
import com.aliyuncs.imm.model.v20200930.ListBindingsResponse.BindingsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBindingsResponseUnmarshaller {

	public static ListBindingsResponse unmarshall(ListBindingsResponse listBindingsResponse, UnmarshallerContext _ctx) {
		
		listBindingsResponse.setRequestId(_ctx.stringValue("ListBindingsResponse.RequestId"));
		listBindingsResponse.setNextToken(_ctx.stringValue("ListBindingsResponse.NextToken"));

		List<BindingsItem> bindings = new ArrayList<BindingsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBindingsResponse.Bindings.Length"); i++) {
			BindingsItem bindingsItem = new BindingsItem();
			bindingsItem.setProjectName(_ctx.stringValue("ListBindingsResponse.Bindings["+ i +"].ProjectName"));
			bindingsItem.setDatasetName(_ctx.stringValue("ListBindingsResponse.Bindings["+ i +"].DatasetName"));
			bindingsItem.setURI(_ctx.stringValue("ListBindingsResponse.Bindings["+ i +"].URI"));
			bindingsItem.setState(_ctx.stringValue("ListBindingsResponse.Bindings["+ i +"].State"));
			bindingsItem.setPhase(_ctx.stringValue("ListBindingsResponse.Bindings["+ i +"].Phase"));
			bindingsItem.setDetail(_ctx.stringValue("ListBindingsResponse.Bindings["+ i +"].Detail"));
			bindingsItem.setCreateTime(_ctx.stringValue("ListBindingsResponse.Bindings["+ i +"].CreateTime"));
			bindingsItem.setUpdateTime(_ctx.stringValue("ListBindingsResponse.Bindings["+ i +"].UpdateTime"));

			bindings.add(bindingsItem);
		}
		listBindingsResponse.setBindings(bindings);
	 
	 	return listBindingsResponse;
	}
}