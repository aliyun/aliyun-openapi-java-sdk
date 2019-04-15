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

import com.aliyuncs.ecsinc.model.v20160314.InnerGetInstanceTypeModelByTypeResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerGetInstanceTypeModelByTypeResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerGetInstanceTypeModelByTypeResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGetInstanceTypeModelByTypeResponseUnmarshaller {

	public static InnerGetInstanceTypeModelByTypeResponse unmarshall(InnerGetInstanceTypeModelByTypeResponse innerGetInstanceTypeModelByTypeResponse, UnmarshallerContext context) {
		
		innerGetInstanceTypeModelByTypeResponse.setRequestId(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerGetInstanceTypeModelByTypeResponse.errorCode.isSuccess"));
		innerGetInstanceTypeModelByTypeResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setMem(context.integerValue("InnerGetInstanceTypeModelByTypeResponse.data.mem"));
		data.setSupportIoOptimized(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.data.supportIoOptimized"));
		data.setDiskSize(context.longValue("InnerGetInstanceTypeModelByTypeResponse.data.diskSize"));
		data.setCores(context.integerValue("InnerGetInstanceTypeModelByTypeResponse.data.cores"));
		data.setDiskNum(context.integerValue("InnerGetInstanceTypeModelByTypeResponse.data.diskNum"));
		data.setInstanceTypeFamily(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.data.instanceTypeFamily"));
		data.setGeneration(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.data.generation"));
		data.setGmtCreated(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.data.gmtCreated"));
		data.setGmtModified(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.data.gmtModified"));
		data.setInstanceType(context.stringValue("InnerGetInstanceTypeModelByTypeResponse.data.instanceType"));
		data.setStatus(context.integerValue("InnerGetInstanceTypeModelByTypeResponse.data.status"));
		innerGetInstanceTypeModelByTypeResponse.setData(data);
	 
	 	return innerGetInstanceTypeModelByTypeResponse;
	}
}