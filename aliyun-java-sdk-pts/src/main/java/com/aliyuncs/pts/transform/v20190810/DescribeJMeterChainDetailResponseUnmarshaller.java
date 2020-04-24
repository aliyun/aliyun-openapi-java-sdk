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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeJMeterChainDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJMeterChainDetailResponseUnmarshaller {

	public static DescribeJMeterChainDetailResponse unmarshall(DescribeJMeterChainDetailResponse describeJMeterChainDetailResponse, UnmarshallerContext _ctx) {
		
		describeJMeterChainDetailResponse.setRequestId(_ctx.stringValue("DescribeJMeterChainDetailResponse.RequestId"));
		describeJMeterChainDetailResponse.setCode(_ctx.stringValue("DescribeJMeterChainDetailResponse.Code"));
		describeJMeterChainDetailResponse.setMessage(_ctx.stringValue("DescribeJMeterChainDetailResponse.Message"));
		describeJMeterChainDetailResponse.setSuccess(_ctx.booleanValue("DescribeJMeterChainDetailResponse.Success"));
		describeJMeterChainDetailResponse.setPageNumber(_ctx.integerValue("DescribeJMeterChainDetailResponse.PageNumber"));
		describeJMeterChainDetailResponse.setPageSize(_ctx.integerValue("DescribeJMeterChainDetailResponse.PageSize"));
		describeJMeterChainDetailResponse.setTotalCount(_ctx.longValue("DescribeJMeterChainDetailResponse.TotalCount"));
		describeJMeterChainDetailResponse.setSampleResults(_ctx.stringValue("DescribeJMeterChainDetailResponse.SampleResults"));
	 
	 	return describeJMeterChainDetailResponse;
	}
}