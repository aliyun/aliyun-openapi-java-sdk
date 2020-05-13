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

package com.aliyuncs.reid.transform.v20190928;

import com.aliyuncs.reid.model.v20190928.DescribeIpcLiveAddressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpcLiveAddressResponseUnmarshaller {

	public static DescribeIpcLiveAddressResponse unmarshall(DescribeIpcLiveAddressResponse describeIpcLiveAddressResponse, UnmarshallerContext _ctx) {
		
		describeIpcLiveAddressResponse.setRequestId(_ctx.stringValue("DescribeIpcLiveAddressResponse.RequestId"));
		describeIpcLiveAddressResponse.setRtmpUrl(_ctx.stringValue("DescribeIpcLiveAddressResponse.RtmpUrl"));
		describeIpcLiveAddressResponse.setErrorCode(_ctx.stringValue("DescribeIpcLiveAddressResponse.ErrorCode"));
		describeIpcLiveAddressResponse.setErrorMessage(_ctx.stringValue("DescribeIpcLiveAddressResponse.ErrorMessage"));
		describeIpcLiveAddressResponse.setMessage(_ctx.stringValue("DescribeIpcLiveAddressResponse.Message"));
		describeIpcLiveAddressResponse.setCode(_ctx.stringValue("DescribeIpcLiveAddressResponse.Code"));
		describeIpcLiveAddressResponse.setExpiredTime(_ctx.stringValue("DescribeIpcLiveAddressResponse.ExpiredTime"));
		describeIpcLiveAddressResponse.setDynamicCode(_ctx.stringValue("DescribeIpcLiveAddressResponse.DynamicCode"));
		describeIpcLiveAddressResponse.setSuccess(_ctx.booleanValue("DescribeIpcLiveAddressResponse.Success"));
		describeIpcLiveAddressResponse.setIpcId(_ctx.longValue("DescribeIpcLiveAddressResponse.IpcId"));
		describeIpcLiveAddressResponse.setDynamicMessage(_ctx.stringValue("DescribeIpcLiveAddressResponse.DynamicMessage"));
	 
	 	return describeIpcLiveAddressResponse;
	}
}