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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableMemResourceResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableMemResourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableMemResourceResponseUnmarshaller {

	public static DescribeAvailableMemResourceResponse unmarshall(DescribeAvailableMemResourceResponse describeAvailableMemResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableMemResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableMemResourceResponse.RequestId"));

		Data data = new Data();
		data.setMinMem(_ctx.longValue("DescribeAvailableMemResourceResponse.Data.MinMem"));
		data.setMaxMem(_ctx.longValue("DescribeAvailableMemResourceResponse.Data.MaxMem"));
		data.setUsedMem(_ctx.longValue("DescribeAvailableMemResourceResponse.Data.UsedMem"));
		describeAvailableMemResourceResponse.setData(data);
	 
	 	return describeAvailableMemResourceResponse;
	}
}