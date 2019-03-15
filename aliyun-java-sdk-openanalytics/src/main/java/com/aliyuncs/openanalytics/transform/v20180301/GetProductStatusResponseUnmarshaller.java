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

package com.aliyuncs.openanalytics.transform.v20180301;

import com.aliyuncs.openanalytics.model.v20180301.GetProductStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductStatusResponseUnmarshaller {

	public static GetProductStatusResponse unmarshall(GetProductStatusResponse getProductStatusResponse, UnmarshallerContext context) {
		
		getProductStatusResponse.setRequestId(context.stringValue("GetProductStatusResponse.RequestId"));
		getProductStatusResponse.setRegionId(context.stringValue("GetProductStatusResponse.RegionId"));
		getProductStatusResponse.setData(context.stringValue("GetProductStatusResponse.Data"));
	 
	 	return getProductStatusResponse;
	}
}