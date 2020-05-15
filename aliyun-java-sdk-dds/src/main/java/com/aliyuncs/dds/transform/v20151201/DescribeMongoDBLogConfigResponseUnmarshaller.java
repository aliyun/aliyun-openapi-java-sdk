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

package com.aliyuncs.dds.transform.v20151201;

import com.aliyuncs.dds.model.v20151201.DescribeMongoDBLogConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMongoDBLogConfigResponseUnmarshaller {

	public static DescribeMongoDBLogConfigResponse unmarshall(DescribeMongoDBLogConfigResponse describeMongoDBLogConfigResponse, UnmarshallerContext _ctx) {
		
		describeMongoDBLogConfigResponse.setRequestId(_ctx.stringValue("DescribeMongoDBLogConfigResponse.RequestId"));
		describeMongoDBLogConfigResponse.setUserProjectName(_ctx.stringValue("DescribeMongoDBLogConfigResponse.UserProjectName"));
		describeMongoDBLogConfigResponse.setIsUserProjectLogstoreExist(_ctx.integerValue("DescribeMongoDBLogConfigResponse.IsUserProjectLogstoreExist"));
		describeMongoDBLogConfigResponse.setIsEtlMetaExist(_ctx.integerValue("DescribeMongoDBLogConfigResponse.IsEtlMetaExist"));
	 
	 	return describeMongoDBLogConfigResponse;
	}
}