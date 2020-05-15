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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeApDevicesResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeApDevicesResponse.ApInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApDevicesResponseUnmarshaller {

	public static DescribeApDevicesResponse unmarshall(DescribeApDevicesResponse describeApDevicesResponse, UnmarshallerContext _ctx) {
		
		describeApDevicesResponse.setRequestId(_ctx.stringValue("DescribeApDevicesResponse.RequestId"));
		describeApDevicesResponse.setErrorMessage(_ctx.stringValue("DescribeApDevicesResponse.ErrorMessage"));
		describeApDevicesResponse.setErrorCode(_ctx.stringValue("DescribeApDevicesResponse.ErrorCode"));
		describeApDevicesResponse.setTotalCount(_ctx.integerValue("DescribeApDevicesResponse.TotalCount"));
		describeApDevicesResponse.setMessage(_ctx.stringValue("DescribeApDevicesResponse.Message"));
		describeApDevicesResponse.setPageSize(_ctx.integerValue("DescribeApDevicesResponse.PageSize"));
		describeApDevicesResponse.setDynamicCode(_ctx.stringValue("DescribeApDevicesResponse.DynamicCode"));
		describeApDevicesResponse.setCode(_ctx.stringValue("DescribeApDevicesResponse.Code"));
		describeApDevicesResponse.setDynamicMessage(_ctx.stringValue("DescribeApDevicesResponse.DynamicMessage"));
		describeApDevicesResponse.setSuccess(_ctx.booleanValue("DescribeApDevicesResponse.Success"));
		describeApDevicesResponse.setPageNumber(_ctx.integerValue("DescribeApDevicesResponse.PageNumber"));

		List<ApInfo> apDevices = new ArrayList<ApInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApDevicesResponse.ApDevices.Length"); i++) {
			ApInfo apInfo = new ApInfo();
			apInfo.setMac(_ctx.stringValue("DescribeApDevicesResponse.ApDevices["+ i +"].Mac"));
			apInfo.setStatus(_ctx.booleanValue("DescribeApDevicesResponse.ApDevices["+ i +"].Status"));
			apInfo.setModel(_ctx.stringValue("DescribeApDevicesResponse.ApDevices["+ i +"].Model"));
			apInfo.setRemark(_ctx.stringValue("DescribeApDevicesResponse.ApDevices["+ i +"].Remark"));
			apInfo.setStoreId(_ctx.stringValue("DescribeApDevicesResponse.ApDevices["+ i +"].StoreId"));
			apInfo.setBeActivate(_ctx.booleanValue("DescribeApDevicesResponse.ApDevices["+ i +"].BeActivate"));

			apDevices.add(apInfo);
		}
		describeApDevicesResponse.setApDevices(apDevices);
	 
	 	return describeApDevicesResponse;
	}
}