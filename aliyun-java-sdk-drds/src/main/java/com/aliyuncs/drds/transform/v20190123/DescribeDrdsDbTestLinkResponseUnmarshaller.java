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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbTestLinkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbTestLinkResponseUnmarshaller {

	public static DescribeDrdsDbTestLinkResponse unmarshall(DescribeDrdsDbTestLinkResponse describeDrdsDbTestLinkResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDbTestLinkResponse.setRequestId(_ctx.stringValue("DescribeDrdsDbTestLinkResponse.RequestId"));
		describeDrdsDbTestLinkResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDbTestLinkResponse.Success"));
		describeDrdsDbTestLinkResponse.setResult(_ctx.stringValue("DescribeDrdsDbTestLinkResponse.Result"));
	 
	 	return describeDrdsDbTestLinkResponse;
	}
}