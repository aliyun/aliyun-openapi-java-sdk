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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.GetSidsAndGids4BidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSidsAndGids4BidResponseUnmarshaller {

	public static GetSidsAndGids4BidResponse unmarshall(GetSidsAndGids4BidResponse getSidsAndGids4BidResponse, UnmarshallerContext context) {
		
		getSidsAndGids4BidResponse.setRequestId(context.stringValue("GetSidsAndGids4BidResponse.RequestId"));
		getSidsAndGids4BidResponse.setSuccess(context.booleanValue("GetSidsAndGids4BidResponse.Success"));
		getSidsAndGids4BidResponse.setMessage(context.stringValue("GetSidsAndGids4BidResponse.Message"));
		getSidsAndGids4BidResponse.setData(context.stringValue("GetSidsAndGids4BidResponse.Data"));
		getSidsAndGids4BidResponse.setErrorCode(context.integerValue("GetSidsAndGids4BidResponse.ErrorCode"));
		getSidsAndGids4BidResponse.setErrorMsg(context.stringValue("GetSidsAndGids4BidResponse.ErrorMsg"));
	 
	 	return getSidsAndGids4BidResponse;
	}
}