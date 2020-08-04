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

import com.aliyuncs.cloudesl.model.v20200201.DescribeClientPackageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientPackageResponseUnmarshaller {

	public static DescribeClientPackageResponse unmarshall(DescribeClientPackageResponse describeClientPackageResponse, UnmarshallerContext _ctx) {
		
		describeClientPackageResponse.setRequestId(_ctx.stringValue("DescribeClientPackageResponse.RequestId"));
		describeClientPackageResponse.setErrorMessage(_ctx.stringValue("DescribeClientPackageResponse.ErrorMessage"));
		describeClientPackageResponse.setErrorCode(_ctx.stringValue("DescribeClientPackageResponse.ErrorCode"));
		describeClientPackageResponse.setDescription(_ctx.stringValue("DescribeClientPackageResponse.Description"));
		describeClientPackageResponse.setMessage(_ctx.stringValue("DescribeClientPackageResponse.Message"));
		describeClientPackageResponse.setUpdateType(_ctx.stringValue("DescribeClientPackageResponse.UpdateType"));
		describeClientPackageResponse.setUrl(_ctx.stringValue("DescribeClientPackageResponse.Url"));
		describeClientPackageResponse.setVersion(_ctx.stringValue("DescribeClientPackageResponse.Version"));
		describeClientPackageResponse.setDynamicCode(_ctx.stringValue("DescribeClientPackageResponse.DynamicCode"));
		describeClientPackageResponse.setCode(_ctx.stringValue("DescribeClientPackageResponse.Code"));
		describeClientPackageResponse.setDynamicMessage(_ctx.stringValue("DescribeClientPackageResponse.DynamicMessage"));
		describeClientPackageResponse.setSuccess(_ctx.booleanValue("DescribeClientPackageResponse.Success"));
	 
	 	return describeClientPackageResponse;
	}
}