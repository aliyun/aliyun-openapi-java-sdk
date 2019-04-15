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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorDataDescribeInstanceResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorDataDescribeInstanceResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorDataDescribeInstanceResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorDataDescribeInstanceResponse.Item.Item2Value;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerMonitorDataDescribeInstanceResponseUnmarshaller {

	public static InnerMonitorDataDescribeInstanceResponse unmarshall(InnerMonitorDataDescribeInstanceResponse innerMonitorDataDescribeInstanceResponse, UnmarshallerContext context) {
		
		innerMonitorDataDescribeInstanceResponse.setRequestId(context.stringValue("InnerMonitorDataDescribeInstanceResponse.RequestId"));
		innerMonitorDataDescribeInstanceResponse.setCount(context.integerValue("InnerMonitorDataDescribeInstanceResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerMonitorDataDescribeInstanceResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerMonitorDataDescribeInstanceResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerMonitorDataDescribeInstanceResponse.errorCode.isSuccess"));
		innerMonitorDataDescribeInstanceResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerMonitorDataDescribeInstanceResponse.data.Length"); i++) {
			Item item = new Item();
			item.setTimeStamp(context.stringValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].timeStamp"));
			item.setResourceStatus(context.stringValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].resourceStatus"));
			item.setResourceId(context.stringValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].resourceId"));

			Item2Value item2Value = new Item2Value();
			item2Value.setCPU(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.CPU"));
			item2Value.setIntranetRX(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.IntranetRX"));
			item2Value.setIntranetTX(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.IntranetTX"));
			item2Value.setIntranetBandwidth(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.IntranetBandwidth"));
			item2Value.setInternetRX(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.InternetRX"));
			item2Value.setInternetTX(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.InternetTX"));
			item2Value.setInternetBandwidth(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.InternetBandwidth"));
			item2Value.setIOPSRead(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.IOPSRead"));
			item2Value.setIOPSWrite(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.IOPSWrite"));
			item2Value.setBPSRead(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.BPSRead"));
			item2Value.setBPSWrite(context.integerValue("InnerMonitorDataDescribeInstanceResponse.data["+ i +"].item2Value.BPSWrite"));
			item.setItem2Value(item2Value);

			data.add(item);
		}
		innerMonitorDataDescribeInstanceResponse.setData(data);
	 
	 	return innerMonitorDataDescribeInstanceResponse;
	}
}