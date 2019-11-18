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

package com.aliyuncs.cloudesl.transform.v20190801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20190801.DescribeLogisticsResponse;
import com.aliyuncs.cloudesl.model.v20190801.DescribeLogisticsResponse.LogisticsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogisticsResponseUnmarshaller {

	public static DescribeLogisticsResponse unmarshall(DescribeLogisticsResponse describeLogisticsResponse, UnmarshallerContext _ctx) {
		
		describeLogisticsResponse.setRequestId(_ctx.stringValue("DescribeLogisticsResponse.RequestId"));
		describeLogisticsResponse.setErrorMessage(_ctx.stringValue("DescribeLogisticsResponse.ErrorMessage"));
		describeLogisticsResponse.setErrorCode(_ctx.stringValue("DescribeLogisticsResponse.ErrorCode"));
		describeLogisticsResponse.setMessage(_ctx.stringValue("DescribeLogisticsResponse.Message"));
		describeLogisticsResponse.setDynamicCode(_ctx.stringValue("DescribeLogisticsResponse.DynamicCode"));
		describeLogisticsResponse.setCode(_ctx.stringValue("DescribeLogisticsResponse.Code"));
		describeLogisticsResponse.setDynamicMessage(_ctx.stringValue("DescribeLogisticsResponse.DynamicMessage"));
		describeLogisticsResponse.setSuccess(_ctx.booleanValue("DescribeLogisticsResponse.Success"));

		List<LogisticsInfo> logistics = new ArrayList<LogisticsInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogisticsResponse.Logistics.Length"); i++) {
			LogisticsInfo logisticsInfo = new LogisticsInfo();
			logisticsInfo.setOrderId(_ctx.stringValue("DescribeLogisticsResponse.Logistics["+ i +"].OrderId"));
			logisticsInfo.setApMacList(_ctx.stringValue("DescribeLogisticsResponse.Logistics["+ i +"].ApMacList"));
			logisticsInfo.setPrNumber(_ctx.stringValue("DescribeLogisticsResponse.Logistics["+ i +"].PrNumber"));
			logisticsInfo.setEslMacList(_ctx.stringValue("DescribeLogisticsResponse.Logistics["+ i +"].EslMacList"));
			logisticsInfo.setPoNumber(_ctx.stringValue("DescribeLogisticsResponse.Logistics["+ i +"].PoNumber"));
			logisticsInfo.setAcceptStatus(_ctx.booleanValue("DescribeLogisticsResponse.Logistics["+ i +"].AcceptStatus"));
			logisticsInfo.setHasSend(_ctx.stringValue("DescribeLogisticsResponse.Logistics["+ i +"].HasSend"));
			logisticsInfo.setLogisticsDocuments(_ctx.stringValue("DescribeLogisticsResponse.Logistics["+ i +"].LogisticsDocuments"));
			logisticsInfo.setDescription(_ctx.stringValue("DescribeLogisticsResponse.Logistics["+ i +"].Description"));

			logistics.add(logisticsInfo);
		}
		describeLogisticsResponse.setLogistics(logistics);
	 
	 	return describeLogisticsResponse;
	}
}