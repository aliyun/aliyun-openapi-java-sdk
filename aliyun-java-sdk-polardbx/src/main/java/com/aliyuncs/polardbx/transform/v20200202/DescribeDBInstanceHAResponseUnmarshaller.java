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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceHAResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceHAResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceHAResponseUnmarshaller {

	public static DescribeDBInstanceHAResponse unmarshall(DescribeDBInstanceHAResponse describeDBInstanceHAResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceHAResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceHAResponse.RequestId"));
		describeDBInstanceHAResponse.setMessage(_ctx.stringValue("DescribeDBInstanceHAResponse.Message"));
		describeDBInstanceHAResponse.setSuccess(_ctx.booleanValue("DescribeDBInstanceHAResponse.Success"));

		Data data = new Data();
		data.setTopologyType(_ctx.stringValue("DescribeDBInstanceHAResponse.Data.TopologyType"));
		data.setPrimaryRegionId(_ctx.stringValue("DescribeDBInstanceHAResponse.Data.PrimaryRegionId"));
		data.setPrimaryAzoneId(_ctx.stringValue("DescribeDBInstanceHAResponse.Data.PrimaryAzoneId"));
		data.setSecondaryRegionId(_ctx.stringValue("DescribeDBInstanceHAResponse.Data.SecondaryRegionId"));
		data.setSecondaryAzoneId(_ctx.stringValue("DescribeDBInstanceHAResponse.Data.SecondaryAzoneId"));
		describeDBInstanceHAResponse.setData(data);
	 
	 	return describeDBInstanceHAResponse;
	}
}