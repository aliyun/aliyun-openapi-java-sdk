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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryNcInfoByInstanceIdResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryNcInfoByInstanceIdResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryNcInfoByInstanceIdResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryNcInfoByInstanceIdResponseUnmarshaller {

	public static InnerEcsQueryNcInfoByInstanceIdResponse unmarshall(InnerEcsQueryNcInfoByInstanceIdResponse innerEcsQueryNcInfoByInstanceIdResponse, UnmarshallerContext context) {
		
		innerEcsQueryNcInfoByInstanceIdResponse.setRequestId(context.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQueryNcInfoByInstanceIdResponse.errorCode.isSuccess"));
		innerEcsQueryNcInfoByInstanceIdResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setNcId(context.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.ncId"));
		data.setNcIp(context.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.ncIp"));
		data.setRackId(context.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.rackId"));
		data.setZoneNo(context.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.zoneNo"));
		data.setAvaliableDisk(context.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.avaliableDisk"));
		data.setTotalDisk(context.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.totalDisk"));
		data.setAvaliableCpu(context.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.avaliableCpu"));
		data.setTotalCpu(context.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.totalCpu"));
		data.setAvaliableMem(context.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.avaliableMem"));
		data.setTotalMem(context.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.totalMem"));
		innerEcsQueryNcInfoByInstanceIdResponse.setData(data);
	 
	 	return innerEcsQueryNcInfoByInstanceIdResponse;
	}
}