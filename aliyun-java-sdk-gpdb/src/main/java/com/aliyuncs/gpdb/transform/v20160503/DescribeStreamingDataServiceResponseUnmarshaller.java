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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeStreamingDataServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamingDataServiceResponseUnmarshaller {

	public static DescribeStreamingDataServiceResponse unmarshall(DescribeStreamingDataServiceResponse describeStreamingDataServiceResponse, UnmarshallerContext _ctx) {
		
		describeStreamingDataServiceResponse.setRequestId(_ctx.stringValue("DescribeStreamingDataServiceResponse.RequestId"));
		describeStreamingDataServiceResponse.setServiceId(_ctx.stringValue("DescribeStreamingDataServiceResponse.ServiceId"));
		describeStreamingDataServiceResponse.setServiceName(_ctx.stringValue("DescribeStreamingDataServiceResponse.ServiceName"));
		describeStreamingDataServiceResponse.setServiceDescription(_ctx.stringValue("DescribeStreamingDataServiceResponse.ServiceDescription"));
		describeStreamingDataServiceResponse.setServiceSpec(_ctx.stringValue("DescribeStreamingDataServiceResponse.ServiceSpec"));
		describeStreamingDataServiceResponse.setStatus(_ctx.stringValue("DescribeStreamingDataServiceResponse.Status"));
		describeStreamingDataServiceResponse.setServiceIp(_ctx.stringValue("DescribeStreamingDataServiceResponse.ServiceIp"));
		describeStreamingDataServiceResponse.setServicePort(_ctx.integerValue("DescribeStreamingDataServiceResponse.ServicePort"));
		describeStreamingDataServiceResponse.setCreateTime(_ctx.stringValue("DescribeStreamingDataServiceResponse.CreateTime"));
		describeStreamingDataServiceResponse.setModifyTime(_ctx.stringValue("DescribeStreamingDataServiceResponse.ModifyTime"));
		describeStreamingDataServiceResponse.setServiceManaged(_ctx.booleanValue("DescribeStreamingDataServiceResponse.ServiceManaged"));
		describeStreamingDataServiceResponse.setServiceOwnerId(_ctx.stringValue("DescribeStreamingDataServiceResponse.ServiceOwnerId"));
	 
	 	return describeStreamingDataServiceResponse;
	}
}