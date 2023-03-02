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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.DescribeEdgeStatInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeEdgeStatInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEdgeStatInfoResponseUnmarshaller {

	public static DescribeEdgeStatInfoResponse unmarshall(DescribeEdgeStatInfoResponse describeEdgeStatInfoResponse, UnmarshallerContext _ctx) {
		
		describeEdgeStatInfoResponse.setRequestId(_ctx.stringValue("DescribeEdgeStatInfoResponse.RequestId"));
		describeEdgeStatInfoResponse.setCode(_ctx.stringValue("DescribeEdgeStatInfoResponse.Code"));
		describeEdgeStatInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeEdgeStatInfoResponse.HttpStatusCode"));
		describeEdgeStatInfoResponse.setMessage(_ctx.stringValue("DescribeEdgeStatInfoResponse.Message"));
		describeEdgeStatInfoResponse.setSuccess(_ctx.booleanValue("DescribeEdgeStatInfoResponse.Success"));

		Data data = new Data();
		data.setTotalDeviceLicenseCount(_ctx.longValue("DescribeEdgeStatInfoResponse.Data.TotalDeviceLicenseCount"));
		data.setUsedDeviceLicenseCount(_ctx.longValue("DescribeEdgeStatInfoResponse.Data.UsedDeviceLicenseCount"));
		describeEdgeStatInfoResponse.setData(data);
	 
	 	return describeEdgeStatInfoResponse;
	}
}