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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryRegionNoFilterResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryRegionNoFilterResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryRegionNoFilterResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsInstanceQueryRegionNoFilterResponseUnmarshaller {

	public static InnerEcsInstanceQueryRegionNoFilterResponse unmarshall(InnerEcsInstanceQueryRegionNoFilterResponse innerEcsInstanceQueryRegionNoFilterResponse, UnmarshallerContext context) {
		
		innerEcsInstanceQueryRegionNoFilterResponse.setRequestId(context.stringValue("InnerEcsInstanceQueryRegionNoFilterResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsInstanceQueryRegionNoFilterResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsInstanceQueryRegionNoFilterResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsInstanceQueryRegionNoFilterResponse.errorCode.isSuccess"));
		innerEcsInstanceQueryRegionNoFilterResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRegionNoAlias(context.stringValue("InnerEcsInstanceQueryRegionNoFilterResponse.data.regionNoAlias"));
		data.setRegionNo(context.stringValue("InnerEcsInstanceQueryRegionNoFilterResponse.data.regionNo"));
		data.setRegionName(context.stringValue("InnerEcsInstanceQueryRegionNoFilterResponse.data.regionName"));
		innerEcsInstanceQueryRegionNoFilterResponse.setData(data);
	 
	 	return innerEcsInstanceQueryRegionNoFilterResponse;
	}
}