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

package com.aliyuncs.trademark_inner.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark_inner.model.v20180801.TrademarkStatResponse;
import com.aliyuncs.trademark_inner.model.v20180801.TrademarkStatResponse.TrademarkStatDTO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class TrademarkStatResponseUnmarshaller {

	public static TrademarkStatResponse unmarshall(TrademarkStatResponse trademarkStatResponse, UnmarshallerContext context) {
		
		trademarkStatResponse.setRequestId(context.stringValue("TrademarkStatResponse.RequestId"));
		trademarkStatResponse.setCount(context.integerValue("TrademarkStatResponse.Count"));

		List<TrademarkStatDTO> list = new ArrayList<TrademarkStatDTO>();
		for (int i = 0; i < context.lengthValue("TrademarkStatResponse.List.Length"); i++) {
			TrademarkStatDTO trademarkStatDTO = new TrademarkStatDTO();
			trademarkStatDTO.setCode(context.stringValue("TrademarkStatResponse.List["+ i +"].Code"));
			trademarkStatDTO.setNum(context.integerValue("TrademarkStatResponse.List["+ i +"].Num"));
			trademarkStatDTO.setType(context.integerValue("TrademarkStatResponse.List["+ i +"].Type"));

			list.add(trademarkStatDTO);
		}
		trademarkStatResponse.setList(list);
	 
	 	return trademarkStatResponse;
	}
}