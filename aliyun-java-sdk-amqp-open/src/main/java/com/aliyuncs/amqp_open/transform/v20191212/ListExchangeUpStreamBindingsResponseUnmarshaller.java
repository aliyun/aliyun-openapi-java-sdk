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

import com.aliyuncs.amqp_open.model.v20191212.ListExchangeUpStreamBindingsResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListExchangeUpStreamBindingsResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListExchangeUpStreamBindingsResponse.Data.BindingVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExchangeUpStreamBindingsResponseUnmarshaller {

	public static ListExchangeUpStreamBindingsResponse unmarshall(ListExchangeUpStreamBindingsResponse listExchangeUpStreamBindingsResponse, UnmarshallerContext _ctx) {
		
		listExchangeUpStreamBindingsResponse.setRequestId(_ctx.stringValue("ListExchangeUpStreamBindingsResponse.RequestId"));
		listExchangeUpStreamBindingsResponse.setCode(_ctx.integerValue("ListExchangeUpStreamBindingsResponse.Code"));
		listExchangeUpStreamBindingsResponse.setMessage(_ctx.stringValue("ListExchangeUpStreamBindingsResponse.Message"));
		listExchangeUpStreamBindingsResponse.setSuccess(_ctx.booleanValue("ListExchangeUpStreamBindingsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListExchangeUpStreamBindingsResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("ListExchangeUpStreamBindingsResponse.Data.MaxResults"));

		List<BindingVO> bindings = new ArrayList<BindingVO>();
		for (int i = 0; i < _ctx.lengthValue("ListExchangeUpStreamBindingsResponse.Data.Bindings.Length"); i++) {
			BindingVO bindingVO = new BindingVO();
			bindingVO.setSourceExchange(_ctx.stringValue("ListExchangeUpStreamBindingsResponse.Data.Bindings["+ i +"].SourceExchange"));
			bindingVO.setDestinationName(_ctx.stringValue("ListExchangeUpStreamBindingsResponse.Data.Bindings["+ i +"].DestinationName"));
			bindingVO.setBindingType(_ctx.stringValue("ListExchangeUpStreamBindingsResponse.Data.Bindings["+ i +"].BindingType"));
			bindingVO.setBindingKey(_ctx.stringValue("ListExchangeUpStreamBindingsResponse.Data.Bindings["+ i +"].BindingKey"));
			bindingVO.setArgument(_ctx.stringValue("ListExchangeUpStreamBindingsResponse.Data.Bindings["+ i +"].Argument"));

			bindings.add(bindingVO);
		}
		data.setBindings(bindings);
		listExchangeUpStreamBindingsResponse.setData(data);
	 
	 	return listExchangeUpStreamBindingsResponse;
	}
}