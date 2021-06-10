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

package com.aliyuncs.ltl.transform.v20190510;

import com.aliyuncs.ltl.model.v20190510.DescribeResourceInfoResponse;
import com.aliyuncs.ltl.model.v20190510.DescribeResourceInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceInfoResponseUnmarshaller {

	public static DescribeResourceInfoResponse unmarshall(DescribeResourceInfoResponse describeResourceInfoResponse, UnmarshallerContext _ctx) {
		
		describeResourceInfoResponse.setRequestId(_ctx.stringValue("DescribeResourceInfoResponse.RequestId"));
		describeResourceInfoResponse.setCode(_ctx.integerValue("DescribeResourceInfoResponse.Code"));
		describeResourceInfoResponse.setSuccess(_ctx.booleanValue("DescribeResourceInfoResponse.Success"));
		describeResourceInfoResponse.setMessage(_ctx.stringValue("DescribeResourceInfoResponse.Message"));

		Data data = new Data();
		data.setAuthorizeType(_ctx.stringValue("DescribeResourceInfoResponse.Data.AuthorizeType"));
		data.setRegion(_ctx.stringValue("DescribeResourceInfoResponse.Data.Region"));
		data.setStatus(_ctx.stringValue("DescribeResourceInfoResponse.Data.Status"));
		data.setEffectiveTime(_ctx.longValue("DescribeResourceInfoResponse.Data.EffectiveTime"));
		data.setExpiredTime(_ctx.longValue("DescribeResourceInfoResponse.Data.ExpiredTime"));
		describeResourceInfoResponse.setData(data);
	 
	 	return describeResourceInfoResponse;
	}
}