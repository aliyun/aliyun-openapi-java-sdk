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

import com.aliyuncs.dts.model.v20200101.DescribeDTSIPResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDTSIPResponseUnmarshaller {

	public static DescribeDTSIPResponse unmarshall(DescribeDTSIPResponse describeDTSIPResponse, UnmarshallerContext _ctx) {
		
		describeDTSIPResponse.setRequestId(_ctx.stringValue("DescribeDTSIPResponse.RequestId"));
		describeDTSIPResponse.setErrCode(_ctx.stringValue("DescribeDTSIPResponse.ErrCode"));
		describeDTSIPResponse.setErrMessage(_ctx.stringValue("DescribeDTSIPResponse.ErrMessage"));
		describeDTSIPResponse.setSuccess(_ctx.stringValue("DescribeDTSIPResponse.Success"));
		describeDTSIPResponse.setDynamicCode(_ctx.stringValue("DescribeDTSIPResponse.DynamicCode"));
		describeDTSIPResponse.setDynamicMessage(_ctx.stringValue("DescribeDTSIPResponse.DynamicMessage"));
	 
	 	return describeDTSIPResponse;
	}
}