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

import com.aliyuncs.drds.model.v20190123.DescribeRdsPriceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsPriceResponseUnmarshaller {

	public static DescribeRdsPriceResponse unmarshall(DescribeRdsPriceResponse describeRdsPriceResponse, UnmarshallerContext _ctx) {
		
		describeRdsPriceResponse.setRequestId(_ctx.stringValue("DescribeRdsPriceResponse.RequestId"));
		describeRdsPriceResponse.setSuccess(_ctx.booleanValue("DescribeRdsPriceResponse.Success"));
		describeRdsPriceResponse.setData(_ctx.stringValue("DescribeRdsPriceResponse.Data"));
	 
	 	return describeRdsPriceResponse;
	}
}