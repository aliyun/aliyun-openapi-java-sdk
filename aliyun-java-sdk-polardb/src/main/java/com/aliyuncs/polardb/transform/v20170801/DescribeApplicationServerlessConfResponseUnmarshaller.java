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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeApplicationServerlessConfResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationServerlessConfResponse.ServerlessConf;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationServerlessConfResponseUnmarshaller {

	public static DescribeApplicationServerlessConfResponse unmarshall(DescribeApplicationServerlessConfResponse describeApplicationServerlessConfResponse, UnmarshallerContext _ctx) {
		
		describeApplicationServerlessConfResponse.setRequestId(_ctx.stringValue("DescribeApplicationServerlessConfResponse.RequestId"));
		describeApplicationServerlessConfResponse.setApplicationId(_ctx.stringValue("DescribeApplicationServerlessConfResponse.ApplicationId"));

		List<ServerlessConf> serverlessConfItems = new ArrayList<ServerlessConf>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationServerlessConfResponse.ServerlessConfItems.Length"); i++) {
			ServerlessConf serverlessConf = new ServerlessConf();
			serverlessConf.setComponentType(_ctx.stringValue("DescribeApplicationServerlessConfResponse.ServerlessConfItems["+ i +"].ComponentType"));
			serverlessConf.setScaleMin(_ctx.stringValue("DescribeApplicationServerlessConfResponse.ServerlessConfItems["+ i +"].ScaleMin"));
			serverlessConf.setScaleMax(_ctx.stringValue("DescribeApplicationServerlessConfResponse.ServerlessConfItems["+ i +"].ScaleMax"));

			serverlessConfItems.add(serverlessConf);
		}
		describeApplicationServerlessConfResponse.setServerlessConfItems(serverlessConfItems);
	 
	 	return describeApplicationServerlessConfResponse;
	}
}