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

package com.aliyuncs.amqp_open.transform.v20191212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.amqp_open.model.v20191212.ListBindingsResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListBindingsResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListBindingsResponse.Data.BindingDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBindingsResponseUnmarshaller {

	public static ListBindingsResponse unmarshall(ListBindingsResponse listBindingsResponse, UnmarshallerContext _ctx) {
		
		listBindingsResponse.setRequestId(_ctx.stringValue("ListBindingsResponse.RequestId"));

		Data data = new Data();
		data.setMaxResults(_ctx.integerValue("ListBindingsResponse.Data.MaxResults"));
		data.setNextToken(_ctx.stringValue("ListBindingsResponse.Data.NextToken"));

		List<BindingDO> bindings = new ArrayList<BindingDO>();
		for (int i = 0; i < _ctx.lengthValue("ListBindingsResponse.Data.Bindings.Length"); i++) {
			BindingDO bindingDO = new BindingDO();
			bindingDO.setSourceExchange(_ctx.stringValue("ListBindingsResponse.Data.Bindings["+ i +"].SourceExchange"));
			bindingDO.setArgument(_ctx.stringValue("ListBindingsResponse.Data.Bindings["+ i +"].Argument"));
			bindingDO.setBindingKey(_ctx.stringValue("ListBindingsResponse.Data.Bindings["+ i +"].BindingKey"));
			bindingDO.setBindingType(_ctx.stringValue("ListBindingsResponse.Data.Bindings["+ i +"].BindingType"));
			bindingDO.setDestinationName(_ctx.stringValue("ListBindingsResponse.Data.Bindings["+ i +"].DestinationName"));

			bindings.add(bindingDO);
		}
		data.setBindings(bindings);
		listBindingsResponse.setData(data);
	 
	 	return listBindingsResponse;
	}
}