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

import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerMonitorResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerMonitorResponseUnmarshaller {

	public static InnerMonitorResponse unmarshall(InnerMonitorResponse innerMonitorResponse, UnmarshallerContext context) {
		
		innerMonitorResponse.setRequestId(context.stringValue("InnerMonitorResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerMonitorResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerMonitorResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerMonitorResponse.errorCode.isSuccess"));
		innerMonitorResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setIopsRead(context.stringValue("InnerMonitorResponse.data.iopsRead"));
		data.setBpsRead(context.stringValue("InnerMonitorResponse.data.bpsRead"));
		data.setTimestamp(context.stringValue("InnerMonitorResponse.data.timestamp"));
		data.setIntranetBandwidth(context.stringValue("InnerMonitorResponse.data.intranetBandwidth"));
		data.setEcsName(context.stringValue("InnerMonitorResponse.data.ecsName"));
		data.setIopsWrite(context.stringValue("InnerMonitorResponse.data.iopsWrite"));
		data.setInternetRx(context.stringValue("InnerMonitorResponse.data.internetRx"));
		data.setBpsWrite(context.stringValue("InnerMonitorResponse.data.bpsWrite"));
		data.setStatus(context.stringValue("InnerMonitorResponse.data.status"));
		data.setCpu(context.stringValue("InnerMonitorResponse.data.cpu"));
		data.setMemory(context.stringValue("InnerMonitorResponse.data.memory"));
		data.setIntranetTx(context.stringValue("InnerMonitorResponse.data.intranetTx"));
		data.setInternetFlow(context.stringValue("InnerMonitorResponse.data.internetFlow"));
		data.setIntranetFlow(context.stringValue("InnerMonitorResponse.data.intranetFlow"));
		data.setInternetTx(context.stringValue("InnerMonitorResponse.data.internetTx"));
		data.setIntranetRx(context.stringValue("InnerMonitorResponse.data.intranetRx"));
		data.setInternetBandwidth(context.stringValue("InnerMonitorResponse.data.internetBandwidth"));
		innerMonitorResponse.setData(data);
	 
	 	return innerMonitorResponse;
	}
}