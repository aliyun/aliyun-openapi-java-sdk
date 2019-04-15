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

import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceGetInstanceTypeModelByTypeResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceGetInstanceTypeModelByTypeResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceGetInstanceTypeModelByTypeResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceGetInstanceTypeModelByTypeResponseUnmarshaller {

	public static InnerInstanceGetInstanceTypeModelByTypeResponse unmarshall(InnerInstanceGetInstanceTypeModelByTypeResponse innerInstanceGetInstanceTypeModelByTypeResponse, UnmarshallerContext context) {
		
		innerInstanceGetInstanceTypeModelByTypeResponse.setRequestId(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerInstanceGetInstanceTypeModelByTypeResponse.errorCode.isSuccess"));
		innerInstanceGetInstanceTypeModelByTypeResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setMem(context.integerValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.mem"));
		data.setSupportIoOptimized(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.supportIoOptimized"));
		data.setDiskSize(context.longValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.diskSize"));
		data.setCores(context.integerValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.cores"));
		data.setDiskNum(context.integerValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.diskNum"));
		data.setInstanceTypeFamily(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.instanceTypeFamily"));
		data.setGeneration(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.generation"));
		data.setGmtCreated(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.gmtCreated"));
		data.setGmtModified(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.gmtModified"));
		data.setInstanceType(context.stringValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.instanceType"));
		data.setStatus(context.integerValue("InnerInstanceGetInstanceTypeModelByTypeResponse.data.status"));
		innerInstanceGetInstanceTypeModelByTypeResponse.setData(data);
	 
	 	return innerInstanceGetInstanceTypeModelByTypeResponse;
	}
}