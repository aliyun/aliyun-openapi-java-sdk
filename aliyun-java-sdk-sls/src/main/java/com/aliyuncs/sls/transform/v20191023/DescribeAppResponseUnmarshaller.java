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

package com.aliyuncs.sls.transform.v20191023;

import com.aliyuncs.sls.model.v20191023.DescribeAppResponse;
import com.aliyuncs.sls.model.v20191023.DescribeAppResponse.AppModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppResponseUnmarshaller {

	public static DescribeAppResponse unmarshall(DescribeAppResponse describeAppResponse, UnmarshallerContext _ctx) {
		
		describeAppResponse.setRequestId(_ctx.stringValue("DescribeAppResponse.RequestId"));
		describeAppResponse.setCode(_ctx.stringValue("DescribeAppResponse.Code"));
		describeAppResponse.setSuccess(_ctx.stringValue("DescribeAppResponse.Success"));
		describeAppResponse.setMessage(_ctx.stringValue("DescribeAppResponse.Message"));

		AppModel appModel = new AppModel();
		appModel.setUid(_ctx.longValue("DescribeAppResponse.AppModel.Uid"));
		appModel.setAppName(_ctx.stringValue("DescribeAppResponse.AppModel.AppName"));
		appModel.setConfig(_ctx.stringValue("DescribeAppResponse.AppModel.Config"));
		appModel.setDisplayName(_ctx.stringValue("DescribeAppResponse.AppModel.DisplayName"));
		describeAppResponse.setAppModel(appModel);
	 
	 	return describeAppResponse;
	}
}