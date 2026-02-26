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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeComponentListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeComponentListResponseUnmarshaller {

	public static DescribeComponentListResponse unmarshall(DescribeComponentListResponse describeComponentListResponse, UnmarshallerContext _ctx) {
		
		describeComponentListResponse.setRequestId(_ctx.stringValue("DescribeComponentListResponse.RequestId"));
		describeComponentListResponse.setComponents(_ctx.stringValue("DescribeComponentListResponse.Components"));
	 
	 	return describeComponentListResponse;
	}
}