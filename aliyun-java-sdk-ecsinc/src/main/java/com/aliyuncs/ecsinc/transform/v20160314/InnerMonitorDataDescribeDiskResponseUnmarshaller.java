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

import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorDataDescribeDiskResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorDataDescribeDiskResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorDataDescribeDiskResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorDataDescribeDiskResponse.Item.Item2Value;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerMonitorDataDescribeDiskResponseUnmarshaller {

	public static InnerMonitorDataDescribeDiskResponse unmarshall(InnerMonitorDataDescribeDiskResponse innerMonitorDataDescribeDiskResponse, UnmarshallerContext context) {
		
		innerMonitorDataDescribeDiskResponse.setRequestId(context.stringValue("InnerMonitorDataDescribeDiskResponse.RequestId"));
		innerMonitorDataDescribeDiskResponse.setCount(context.integerValue("InnerMonitorDataDescribeDiskResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerMonitorDataDescribeDiskResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerMonitorDataDescribeDiskResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerMonitorDataDescribeDiskResponse.errorCode.isSuccess"));
		innerMonitorDataDescribeDiskResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerMonitorDataDescribeDiskResponse.data.Length"); i++) {
			Item item = new Item();
			item.setTimeStamp(context.stringValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].timeStamp"));
			item.setResourceStatus(context.stringValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].resourceStatus"));
			item.setResourceId(context.stringValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].resourceId"));

			Item2Value item2Value = new Item2Value();
			item2Value.setBPSRead(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.BPSRead"));
			item2Value.setBPSWrite(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.BPSWrite"));
			item2Value.setIOPSRead(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOPSRead"));
			item2Value.setIOPSWrite(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOPSWrite"));
			item2Value.setLatencyRead(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.LatencyRead"));
			item2Value.setLatencyWrite(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.LatencyWrite"));
			item2Value.setIOBlockRead(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOBlockRead"));
			item2Value.setIOBlockWrite(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOBlockWrite"));
			item2Value.setBPSTotal(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.BPSTotal"));
			item2Value.setIOPSTotal(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOPSTotal"));
			item2Value.setIOBlockTotal(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOBlockTotal"));
			item2Value.setReadPercent(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.ReadPercent"));
			item2Value.setWritePercent(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.WritePercent"));
			item2Value.setLatencyTotal(context.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.LatencyTotal"));
			item.setItem2Value(item2Value);

			data.add(item);
		}
		innerMonitorDataDescribeDiskResponse.setData(data);
	 
	 	return innerMonitorDataDescribeDiskResponse;
	}
}