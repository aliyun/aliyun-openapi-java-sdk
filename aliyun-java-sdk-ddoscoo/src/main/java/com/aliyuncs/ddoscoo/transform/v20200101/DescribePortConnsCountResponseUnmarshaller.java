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

package com.aliyuncs.ddoscoo.transform.v20200101;

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortConnsCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortConnsCountResponseUnmarshaller {

	public static DescribePortConnsCountResponse unmarshall(DescribePortConnsCountResponse describePortConnsCountResponse, UnmarshallerContext _ctx) {
		
		describePortConnsCountResponse.setRequestId(_ctx.stringValue("DescribePortConnsCountResponse.RequestId"));
		describePortConnsCountResponse.setConns(_ctx.longValue("DescribePortConnsCountResponse.Conns"));
		describePortConnsCountResponse.setActConns(_ctx.longValue("DescribePortConnsCountResponse.ActConns"));
		describePortConnsCountResponse.setInActConns(_ctx.longValue("DescribePortConnsCountResponse.InActConns"));
		describePortConnsCountResponse.setCps(_ctx.longValue("DescribePortConnsCountResponse.Cps"));
	 
	 	return describePortConnsCountResponse;
	}
}