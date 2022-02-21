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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeDtsServiceLogResponse;
import com.aliyuncs.dts.model.v20200101.DescribeDtsServiceLogResponse.ServiceLogContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDtsServiceLogResponseUnmarshaller {

	public static DescribeDtsServiceLogResponse unmarshall(DescribeDtsServiceLogResponse describeDtsServiceLogResponse, UnmarshallerContext _ctx) {
		
		describeDtsServiceLogResponse.setRequestId(_ctx.stringValue("DescribeDtsServiceLogResponse.RequestId"));
		describeDtsServiceLogResponse.setHttpStatusCode(_ctx.integerValue("DescribeDtsServiceLogResponse.HttpStatusCode"));
		describeDtsServiceLogResponse.setErrCode(_ctx.stringValue("DescribeDtsServiceLogResponse.ErrCode"));
		describeDtsServiceLogResponse.setSuccess(_ctx.booleanValue("DescribeDtsServiceLogResponse.Success"));
		describeDtsServiceLogResponse.setPageRecordCount(_ctx.integerValue("DescribeDtsServiceLogResponse.PageRecordCount"));
		describeDtsServiceLogResponse.setTotalRecordCount(_ctx.longValue("DescribeDtsServiceLogResponse.TotalRecordCount"));
		describeDtsServiceLogResponse.setErrMessage(_ctx.stringValue("DescribeDtsServiceLogResponse.ErrMessage"));
		describeDtsServiceLogResponse.setDynamicMessage(_ctx.stringValue("DescribeDtsServiceLogResponse.DynamicMessage"));
		describeDtsServiceLogResponse.setPageNumber(_ctx.integerValue("DescribeDtsServiceLogResponse.PageNumber"));
		describeDtsServiceLogResponse.setDynamicCode(_ctx.stringValue("DescribeDtsServiceLogResponse.DynamicCode"));

		List<ServiceLogContext> serviceLogContexts = new ArrayList<ServiceLogContext>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsServiceLogResponse.ServiceLogContexts.Length"); i++) {
			ServiceLogContext serviceLogContext = new ServiceLogContext();
			serviceLogContext.setContext(_ctx.stringValue("DescribeDtsServiceLogResponse.ServiceLogContexts["+ i +"].Context"));
			serviceLogContext.setTime(_ctx.stringValue("DescribeDtsServiceLogResponse.ServiceLogContexts["+ i +"].Time"));
			serviceLogContext.setState(_ctx.stringValue("DescribeDtsServiceLogResponse.ServiceLogContexts["+ i +"].State"));

			serviceLogContexts.add(serviceLogContext);
		}
		describeDtsServiceLogResponse.setServiceLogContexts(serviceLogContexts);
	 
	 	return describeDtsServiceLogResponse;
	}
}