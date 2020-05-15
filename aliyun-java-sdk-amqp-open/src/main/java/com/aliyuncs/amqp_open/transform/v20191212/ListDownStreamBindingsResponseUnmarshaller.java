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

import com.aliyuncs.amqp_open.model.v20191212.ListDownStreamBindingsResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListDownStreamBindingsResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListDownStreamBindingsResponse.Data.BindingVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDownStreamBindingsResponseUnmarshaller {

	public static ListDownStreamBindingsResponse unmarshall(ListDownStreamBindingsResponse listDownStreamBindingsResponse, UnmarshallerContext _ctx) {
		
		listDownStreamBindingsResponse.setRequestId(_ctx.stringValue("ListDownStreamBindingsResponse.RequestId"));
		listDownStreamBindingsResponse.setCode(_ctx.integerValue("ListDownStreamBindingsResponse.Code"));
		listDownStreamBindingsResponse.setMessage(_ctx.stringValue("ListDownStreamBindingsResponse.Message"));
		listDownStreamBindingsResponse.setSuccess(_ctx.booleanValue("ListDownStreamBindingsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListDownStreamBindingsResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("ListDownStreamBindingsResponse.Data.MaxResults"));

		List<BindingVO> bindings = new ArrayList<BindingVO>();
		for (int i = 0; i < _ctx.lengthValue("ListDownStreamBindingsResponse.Data.Bindings.Length"); i++) {
			BindingVO bindingVO = new BindingVO();
			bindingVO.setSourceExchange(_ctx.stringValue("ListDownStreamBindingsResponse.Data.Bindings["+ i +"].SourceExchange"));
			bindingVO.setDestinationName(_ctx.stringValue("ListDownStreamBindingsResponse.Data.Bindings["+ i +"].DestinationName"));
			bindingVO.setBindingType(_ctx.stringValue("ListDownStreamBindingsResponse.Data.Bindings["+ i +"].BindingType"));
			bindingVO.setBindingKey(_ctx.stringValue("ListDownStreamBindingsResponse.Data.Bindings["+ i +"].BindingKey"));
			bindingVO.setArgument(_ctx.stringValue("ListDownStreamBindingsResponse.Data.Bindings["+ i +"].Argument"));

			bindings.add(bindingVO);
		}
		data.setBindings(bindings);
		listDownStreamBindingsResponse.setData(data);
	 
	 	return listDownStreamBindingsResponse;
	}
}