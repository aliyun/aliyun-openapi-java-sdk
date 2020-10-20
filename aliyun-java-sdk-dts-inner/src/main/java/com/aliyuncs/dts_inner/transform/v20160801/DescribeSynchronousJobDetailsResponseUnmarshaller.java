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

package com.aliyuncs.dts_inner.transform.v20160801;

import com.aliyuncs.dts_inner.model.v20160801.DescribeSynchronousJobDetailsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronousJobDetailsResponseUnmarshaller {

	public static DescribeSynchronousJobDetailsResponse unmarshall(DescribeSynchronousJobDetailsResponse describeSynchronousJobDetailsResponse, UnmarshallerContext _ctx) {
		
		describeSynchronousJobDetailsResponse.setRequestId(_ctx.stringValue("DescribeSynchronousJobDetailsResponse.requestId"));
		describeSynchronousJobDetailsResponse.setData(_ctx.stringValue("DescribeSynchronousJobDetailsResponse.data"));
		describeSynchronousJobDetailsResponse.setSuccess(_ctx.booleanValue("DescribeSynchronousJobDetailsResponse.success"));
		describeSynchronousJobDetailsResponse.setCode(_ctx.stringValue("DescribeSynchronousJobDetailsResponse.code"));
		describeSynchronousJobDetailsResponse.setMessage(_ctx.stringValue("DescribeSynchronousJobDetailsResponse.message"));
	 
	 	return describeSynchronousJobDetailsResponse;
	}
}