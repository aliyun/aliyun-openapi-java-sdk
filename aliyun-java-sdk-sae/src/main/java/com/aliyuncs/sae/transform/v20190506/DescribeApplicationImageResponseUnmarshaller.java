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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DescribeApplicationImageResponse;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationImageResponseUnmarshaller {

	public static DescribeApplicationImageResponse unmarshall(DescribeApplicationImageResponse describeApplicationImageResponse, UnmarshallerContext _ctx) {
		
		describeApplicationImageResponse.setRequestId(_ctx.stringValue("DescribeApplicationImageResponse.RequestId"));
		describeApplicationImageResponse.setMessage(_ctx.stringValue("DescribeApplicationImageResponse.Message"));
		describeApplicationImageResponse.setTraceId(_ctx.stringValue("DescribeApplicationImageResponse.TraceId"));
		describeApplicationImageResponse.setErrorCode(_ctx.stringValue("DescribeApplicationImageResponse.ErrorCode"));
		describeApplicationImageResponse.setCode(_ctx.stringValue("DescribeApplicationImageResponse.Code"));
		describeApplicationImageResponse.setSuccess(_ctx.booleanValue("DescribeApplicationImageResponse.Success"));

		Data data = new Data();
		data.setRepoId(_ctx.integerValue("DescribeApplicationImageResponse.Data.RepoId"));
		data.setLogo(_ctx.stringValue("DescribeApplicationImageResponse.Data.Logo"));
		data.setRepoOriginType(_ctx.stringValue("DescribeApplicationImageResponse.Data.RepoOriginType"));
		data.setCrUrl(_ctx.stringValue("DescribeApplicationImageResponse.Data.CrUrl"));
		data.setRepoTag(_ctx.stringValue("DescribeApplicationImageResponse.Data.RepoTag"));
		data.setRepoType(_ctx.stringValue("DescribeApplicationImageResponse.Data.RepoType"));
		data.setRepoName(_ctx.stringValue("DescribeApplicationImageResponse.Data.RepoName"));
		data.setRepoNamespace(_ctx.stringValue("DescribeApplicationImageResponse.Data.RepoNamespace"));
		data.setRegionId(_ctx.stringValue("DescribeApplicationImageResponse.Data.RegionId"));
		describeApplicationImageResponse.setData(data);
	 
	 	return describeApplicationImageResponse;
	}
}