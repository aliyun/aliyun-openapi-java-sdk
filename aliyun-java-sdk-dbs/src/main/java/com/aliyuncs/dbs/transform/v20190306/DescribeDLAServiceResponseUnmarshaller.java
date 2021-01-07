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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.DescribeDLAServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDLAServiceResponseUnmarshaller {

	public static DescribeDLAServiceResponse unmarshall(DescribeDLAServiceResponse describeDLAServiceResponse, UnmarshallerContext _ctx) {
		
		describeDLAServiceResponse.setRequestId(_ctx.stringValue("DescribeDLAServiceResponse.RequestId"));
		describeDLAServiceResponse.setSuccess(_ctx.booleanValue("DescribeDLAServiceResponse.Success"));
		describeDLAServiceResponse.setErrCode(_ctx.stringValue("DescribeDLAServiceResponse.ErrCode"));
		describeDLAServiceResponse.setErrMessage(_ctx.stringValue("DescribeDLAServiceResponse.ErrMessage"));
		describeDLAServiceResponse.setHttpStatusCode(_ctx.integerValue("DescribeDLAServiceResponse.HttpStatusCode"));
		describeDLAServiceResponse.setState(_ctx.stringValue("DescribeDLAServiceResponse.State"));
		describeDLAServiceResponse.setAutoAdd(_ctx.booleanValue("DescribeDLAServiceResponse.AutoAdd"));
		describeDLAServiceResponse.setHaveJobFailed(_ctx.booleanValue("DescribeDLAServiceResponse.HaveJobFailed"));
	 
	 	return describeDLAServiceResponse;
	}
}