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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayStockResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayStockResponse.Stock;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayStockResponseUnmarshaller {

	public static DescribeGatewayStockResponse unmarshall(DescribeGatewayStockResponse describeGatewayStockResponse, UnmarshallerContext _ctx) {
		
		describeGatewayStockResponse.setRequestId(_ctx.stringValue("DescribeGatewayStockResponse.RequestId"));
		describeGatewayStockResponse.setSuccess(_ctx.booleanValue("DescribeGatewayStockResponse.Success"));
		describeGatewayStockResponse.setCode(_ctx.stringValue("DescribeGatewayStockResponse.Code"));
		describeGatewayStockResponse.setMessage(_ctx.stringValue("DescribeGatewayStockResponse.Message"));

		List<Stock> stocks = new ArrayList<Stock>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayStockResponse.Stocks.Length"); i++) {
			Stock stock = new Stock();
			stock.setZoneId(_ctx.stringValue("DescribeGatewayStockResponse.Stocks["+ i +"].ZoneId"));
			stock.setStockInfo(_ctx.stringValue("DescribeGatewayStockResponse.Stocks["+ i +"].StockInfo"));

			stocks.add(stock);
		}
		describeGatewayStockResponse.setStocks(stocks);
	 
	 	return describeGatewayStockResponse;
	}
}