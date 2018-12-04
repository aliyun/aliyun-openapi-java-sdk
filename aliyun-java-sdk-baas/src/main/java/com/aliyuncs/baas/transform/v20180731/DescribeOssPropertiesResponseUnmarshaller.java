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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.DescribeOssPropertiesResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOssPropertiesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssPropertiesResponseUnmarshaller {

	public static DescribeOssPropertiesResponse unmarshall(DescribeOssPropertiesResponse describeOssPropertiesResponse, UnmarshallerContext context) {
		
		describeOssPropertiesResponse.setRequestId(context.stringValue("DescribeOssPropertiesResponse.RequestId"));

		Result result = new Result();
		result.setEndpoint(context.stringValue("DescribeOssPropertiesResponse.Result.Endpoint"));
		result.setAccessKeyId(context.stringValue("DescribeOssPropertiesResponse.Result.AccessKeyId"));
		result.setAccessKeySecret(context.stringValue("DescribeOssPropertiesResponse.Result.AccessKeySecret"));
		result.setBucketName(context.stringValue("DescribeOssPropertiesResponse.Result.BucketName"));
		result.setFolderName(context.stringValue("DescribeOssPropertiesResponse.Result.FolderName"));
		describeOssPropertiesResponse.setResult(result);
	 
	 	return describeOssPropertiesResponse;
	}
}