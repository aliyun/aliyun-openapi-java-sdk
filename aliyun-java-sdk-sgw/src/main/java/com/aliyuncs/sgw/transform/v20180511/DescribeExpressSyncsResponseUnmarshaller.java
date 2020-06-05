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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeExpressSyncsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeExpressSyncsResponse.ExpressSync;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressSyncsResponseUnmarshaller {

	public static DescribeExpressSyncsResponse unmarshall(DescribeExpressSyncsResponse describeExpressSyncsResponse, UnmarshallerContext _ctx) {
		
		describeExpressSyncsResponse.setRequestId(_ctx.stringValue("DescribeExpressSyncsResponse.RequestId"));
		describeExpressSyncsResponse.setSuccess(_ctx.booleanValue("DescribeExpressSyncsResponse.Success"));
		describeExpressSyncsResponse.setCode(_ctx.stringValue("DescribeExpressSyncsResponse.Code"));
		describeExpressSyncsResponse.setMessage(_ctx.stringValue("DescribeExpressSyncsResponse.Message"));

		List<ExpressSync> expressSyncs = new ArrayList<ExpressSync>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressSyncsResponse.ExpressSyncs.Length"); i++) {
			ExpressSync expressSync = new ExpressSync();
			expressSync.setExpressSyncId(_ctx.stringValue("DescribeExpressSyncsResponse.ExpressSyncs["+ i +"].ExpressSyncId"));
			expressSync.setName(_ctx.stringValue("DescribeExpressSyncsResponse.ExpressSyncs["+ i +"].Name"));
			expressSync.setDescription(_ctx.stringValue("DescribeExpressSyncsResponse.ExpressSyncs["+ i +"].Description"));
			expressSync.setBucketRegion(_ctx.stringValue("DescribeExpressSyncsResponse.ExpressSyncs["+ i +"].BucketRegion"));
			expressSync.setBucketName(_ctx.stringValue("DescribeExpressSyncsResponse.ExpressSyncs["+ i +"].BucketName"));
			expressSync.setBucketPrefix(_ctx.stringValue("DescribeExpressSyncsResponse.ExpressSyncs["+ i +"].BucketPrefix"));
			expressSync.setMnsTopic(_ctx.stringValue("DescribeExpressSyncsResponse.ExpressSyncs["+ i +"].MnsTopic"));

			expressSyncs.add(expressSync);
		}
		describeExpressSyncsResponse.setExpressSyncs(expressSyncs);
	 
	 	return describeExpressSyncsResponse;
	}
}