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

package com.aliyuncs.phoenixsp_inner.transform.v20160805;

import com.aliyuncs.phoenixsp_inner.model.v20160805.CountRegionAvailableResourcesByResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountRegionAvailableResourcesByResponseUnmarshaller {

	public static CountRegionAvailableResourcesByResponse unmarshall(CountRegionAvailableResourcesByResponse countRegionAvailableResourcesByResponse, UnmarshallerContext context) {
		
		countRegionAvailableResourcesByResponse.setRequestId(context.stringValue("CountRegionAvailableResourcesByResponse.RequestId"));
		countRegionAvailableResourcesByResponse.setCode(context.stringValue("CountRegionAvailableResourcesByResponse.Code"));
		countRegionAvailableResourcesByResponse.setMessage(context.stringValue("CountRegionAvailableResourcesByResponse.Message"));
		countRegionAvailableResourcesByResponse.setSuccess(context.booleanValue("CountRegionAvailableResourcesByResponse.Success"));
		countRegionAvailableResourcesByResponse.setData(context.integerValue("CountRegionAvailableResourcesByResponse.Data"));
	 
	 	return countRegionAvailableResourcesByResponse;
	}
}