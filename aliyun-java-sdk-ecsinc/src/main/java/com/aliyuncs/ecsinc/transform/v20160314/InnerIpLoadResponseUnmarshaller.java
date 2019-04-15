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

import com.aliyuncs.ecsinc.model.v20160314.InnerIpLoadResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerIpLoadResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerIpLoadResponse.Data.IpLoadModelLis;
import com.aliyuncs.ecsinc.model.v20160314.InnerIpLoadResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerIpLoadResponseUnmarshaller {

	public static InnerIpLoadResponse unmarshall(InnerIpLoadResponse innerIpLoadResponse, UnmarshallerContext context) {
		
		innerIpLoadResponse.setRequestId(context.stringValue("InnerIpLoadResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerIpLoadResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerIpLoadResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerIpLoadResponse.errorCode.isSuccess"));
		innerIpLoadResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setNextToken(context.stringValue("InnerIpLoadResponse.data.nextToken"));

		List<IpLoadModelLis> ipLoadModelList = new ArrayList<IpLoadModelLis>();
		for (int i = 0; i < context.lengthValue("InnerIpLoadResponse.data.ipLoadModelList.Length"); i++) {
			IpLoadModelLis ipLoadModelLis = new IpLoadModelLis();
			ipLoadModelLis.setIpType(context.stringValue("InnerIpLoadResponse.data.ipLoadModelList["+ i +"].ipType"));
			ipLoadModelLis.setAliUid(context.stringValue("InnerIpLoadResponse.data.ipLoadModelList["+ i +"].aliUid"));
			ipLoadModelLis.setIpAddress(context.stringValue("InnerIpLoadResponse.data.ipLoadModelList["+ i +"].ipAddress"));

			ipLoadModelList.add(ipLoadModelLis);
		}
		data.setIpLoadModelList(ipLoadModelList);
		innerIpLoadResponse.setData(data);
	 
	 	return innerIpLoadResponse;
	}
}