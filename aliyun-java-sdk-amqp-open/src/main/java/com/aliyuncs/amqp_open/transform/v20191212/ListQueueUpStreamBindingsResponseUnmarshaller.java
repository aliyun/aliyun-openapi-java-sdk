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

import com.aliyuncs.amqp_open.model.v20191212.ListQueueUpStreamBindingsResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListQueueUpStreamBindingsResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListQueueUpStreamBindingsResponse.Data.BindingVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueueUpStreamBindingsResponseUnmarshaller {

	public static ListQueueUpStreamBindingsResponse unmarshall(ListQueueUpStreamBindingsResponse listQueueUpStreamBindingsResponse, UnmarshallerContext _ctx) {
		
		listQueueUpStreamBindingsResponse.setRequestId(_ctx.stringValue("ListQueueUpStreamBindingsResponse.RequestId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListQueueUpStreamBindingsResponse.Data.NextToken"));
		data.setMaxResults(_ctx.stringValue("ListQueueUpStreamBindingsResponse.Data.MaxResults"));

		List<BindingVO> bindings = new ArrayList<BindingVO>();
		for (int i = 0; i < _ctx.lengthValue("ListQueueUpStreamBindingsResponse.Data.Bindings.Length"); i++) {
			BindingVO bindingVO = new BindingVO();
			bindingVO.setSourceExchange(_ctx.stringValue("ListQueueUpStreamBindingsResponse.Data.Bindings["+ i +"].SourceExchange"));
			bindingVO.setDestinationName(_ctx.stringValue("ListQueueUpStreamBindingsResponse.Data.Bindings["+ i +"].DestinationName"));
			bindingVO.setBindingType(_ctx.stringValue("ListQueueUpStreamBindingsResponse.Data.Bindings["+ i +"].BindingType"));
			bindingVO.setBindingKey(_ctx.stringValue("ListQueueUpStreamBindingsResponse.Data.Bindings["+ i +"].BindingKey"));
			bindingVO.setArgument(_ctx.stringValue("ListQueueUpStreamBindingsResponse.Data.Bindings["+ i +"].Argument"));

			bindings.add(bindingVO);
		}
		data.setBindings(bindings);
		listQueueUpStreamBindingsResponse.setData(data);
	 
	 	return listQueueUpStreamBindingsResponse;
	}
}