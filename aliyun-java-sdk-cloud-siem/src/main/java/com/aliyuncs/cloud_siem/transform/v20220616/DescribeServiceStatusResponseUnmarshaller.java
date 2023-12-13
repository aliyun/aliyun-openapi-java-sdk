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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeServiceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceStatusResponseUnmarshaller {

	public static DescribeServiceStatusResponse unmarshall(DescribeServiceStatusResponse describeServiceStatusResponse, UnmarshallerContext _ctx) {
		
		describeServiceStatusResponse.setRequestId(_ctx.stringValue("DescribeServiceStatusResponse.RequestId"));
		describeServiceStatusResponse.setData(_ctx.booleanValue("DescribeServiceStatusResponse.Data"));
	 
	 	return describeServiceStatusResponse;
	}
}