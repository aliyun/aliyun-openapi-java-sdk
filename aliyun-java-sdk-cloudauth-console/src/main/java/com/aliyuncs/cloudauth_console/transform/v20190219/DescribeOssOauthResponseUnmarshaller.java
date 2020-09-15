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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeOssOauthResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.DescribeOssOauthResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssOauthResponseUnmarshaller {

	public static DescribeOssOauthResponse unmarshall(DescribeOssOauthResponse describeOssOauthResponse, UnmarshallerContext _ctx) {
		
		describeOssOauthResponse.setRequestId(_ctx.stringValue("DescribeOssOauthResponse.RequestId"));

		Data data = new Data();
		data.setOssServe(_ctx.booleanValue("DescribeOssOauthResponse.Data.OssServe"));
		data.setOpenOssService(_ctx.booleanValue("DescribeOssOauthResponse.Data.OpenOssService"));
		data.setOssAuthorized(_ctx.booleanValue("DescribeOssOauthResponse.Data.OssAuthorized"));
		data.setBucketName(_ctx.stringValue("DescribeOssOauthResponse.Data.BucketName"));
		data.setOpenOssTime(_ctx.longValue("DescribeOssOauthResponse.Data.OpenOssTime"));
		describeOssOauthResponse.setData(data);
	 
	 	return describeOssOauthResponse;
	}
}