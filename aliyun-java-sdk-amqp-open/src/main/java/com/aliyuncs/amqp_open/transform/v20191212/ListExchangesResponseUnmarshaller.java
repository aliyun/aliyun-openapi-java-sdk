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

import com.aliyuncs.amqp_open.model.v20191212.ListExchangesResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListExchangesResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListExchangesResponse.Data.ExchangeVO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExchangesResponseUnmarshaller {

	public static ListExchangesResponse unmarshall(ListExchangesResponse listExchangesResponse, UnmarshallerContext _ctx) {
		
		listExchangesResponse.setRequestId(_ctx.stringValue("ListExchangesResponse.RequestId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListExchangesResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("ListExchangesResponse.Data.MaxResults"));

		List<ExchangeVO> exchanges = new ArrayList<ExchangeVO>();
		for (int i = 0; i < _ctx.lengthValue("ListExchangesResponse.Data.Exchanges.Length"); i++) {
			ExchangeVO exchangeVO = new ExchangeVO();
			exchangeVO.setName(_ctx.stringValue("ListExchangesResponse.Data.Exchanges["+ i +"].Name"));
			exchangeVO.setVHostName(_ctx.stringValue("ListExchangesResponse.Data.Exchanges["+ i +"].VHostName"));
			exchangeVO.setExchangeType(_ctx.stringValue("ListExchangesResponse.Data.Exchanges["+ i +"].ExchangeType"));
			exchangeVO.setAutoDeleteState(_ctx.booleanValue("ListExchangesResponse.Data.Exchanges["+ i +"].AutoDeleteState"));
			exchangeVO.setAttributes(_ctx.mapValue("ListExchangesResponse.Data.Exchanges["+ i +"].Attributes"));
			exchangeVO.setCreateTime(_ctx.longValue("ListExchangesResponse.Data.Exchanges["+ i +"].CreateTime"));

			exchanges.add(exchangeVO);
		}
		data.setExchanges(exchanges);
		listExchangesResponse.setData(data);
	 
	 	return listExchangesResponse;
	}
}