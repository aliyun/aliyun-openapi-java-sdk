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

import com.aliyuncs.gpdb.model.v20160503.DescribeExternalDataServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExternalDataServiceResponseUnmarshaller {

	public static DescribeExternalDataServiceResponse unmarshall(DescribeExternalDataServiceResponse describeExternalDataServiceResponse, UnmarshallerContext _ctx) {
		
		describeExternalDataServiceResponse.setRequestId(_ctx.stringValue("DescribeExternalDataServiceResponse.RequestId"));
		describeExternalDataServiceResponse.setServiceId(_ctx.stringValue("DescribeExternalDataServiceResponse.ServiceId"));
		describeExternalDataServiceResponse.setServiceName(_ctx.stringValue("DescribeExternalDataServiceResponse.ServiceName"));
		describeExternalDataServiceResponse.setServiceDescription(_ctx.stringValue("DescribeExternalDataServiceResponse.ServiceDescription"));
		describeExternalDataServiceResponse.setServiceSpec(_ctx.stringValue("DescribeExternalDataServiceResponse.ServiceSpec"));
		describeExternalDataServiceResponse.setStatus(_ctx.stringValue("DescribeExternalDataServiceResponse.Status"));
		describeExternalDataServiceResponse.setCreateTime(_ctx.stringValue("DescribeExternalDataServiceResponse.CreateTime"));
		describeExternalDataServiceResponse.setModifyTime(_ctx.stringValue("DescribeExternalDataServiceResponse.ModifyTime"));
	 
	 	return describeExternalDataServiceResponse;
	}
}