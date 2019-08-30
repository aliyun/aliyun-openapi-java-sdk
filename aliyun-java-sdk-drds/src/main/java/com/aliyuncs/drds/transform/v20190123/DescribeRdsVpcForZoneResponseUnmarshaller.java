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

import com.aliyuncs.drds.model.v20190123.DescribeRdsVpcForZoneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsVpcForZoneResponseUnmarshaller {

	public static DescribeRdsVpcForZoneResponse unmarshall(DescribeRdsVpcForZoneResponse describeRdsVpcForZoneResponse, UnmarshallerContext _ctx) {
		
		describeRdsVpcForZoneResponse.setRequestId(_ctx.stringValue("DescribeRdsVpcForZoneResponse.RequestId"));
		describeRdsVpcForZoneResponse.setSuccess(_ctx.booleanValue("DescribeRdsVpcForZoneResponse.Success"));
		describeRdsVpcForZoneResponse.setData(_ctx.stringValue("DescribeRdsVpcForZoneResponse.Data"));
	 
	 	return describeRdsVpcForZoneResponse;
	}
}