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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvsResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvsResponse.AppEnv;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppEnvsResponseUnmarshaller {

	public static DescribeAppEnvsResponse unmarshall(DescribeAppEnvsResponse describeAppEnvsResponse, UnmarshallerContext _ctx) {
		
		describeAppEnvsResponse.setRequestId(_ctx.stringValue("DescribeAppEnvsResponse.RequestId"));
		describeAppEnvsResponse.setCode(_ctx.stringValue("DescribeAppEnvsResponse.Code"));
		describeAppEnvsResponse.setMessage(_ctx.stringValue("DescribeAppEnvsResponse.Message"));
		describeAppEnvsResponse.setPageNumber(_ctx.integerValue("DescribeAppEnvsResponse.PageNumber"));
		describeAppEnvsResponse.setPageSize(_ctx.integerValue("DescribeAppEnvsResponse.PageSize"));
		describeAppEnvsResponse.setTotalCount(_ctx.integerValue("DescribeAppEnvsResponse.TotalCount"));

		List<AppEnv> appEnvs = new ArrayList<AppEnv>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppEnvsResponse.AppEnvs.Length"); i++) {
			AppEnv appEnv = new AppEnv();
			appEnv.setEnvId(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].EnvId"));
			appEnv.setEnvName(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].EnvName"));
			appEnv.setEnvDescription(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].EnvDescription"));
			appEnv.setCreateUsername(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].CreateUsername"));
			appEnv.setUpdateUsername(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].UpdateUsername"));
			appEnv.setCreateTime(_ctx.longValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].CreateTime"));
			appEnv.setUpdateTime(_ctx.longValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].UpdateTime"));
			appEnv.setStackId(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].StackId"));
			appEnv.setStackName(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].StackName"));
			appEnv.setAppName(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].AppName"));
			appEnv.setAppId(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].AppId"));
			appEnv.setApplyingChange(_ctx.booleanValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].ApplyingChange"));
			appEnv.setAbortingChange(_ctx.booleanValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].AbortingChange"));
			appEnv.setEnvType(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].EnvType"));
			appEnv.setPkgVersionId(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].PkgVersionId"));
			appEnv.setPkgVersionLabel(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].PkgVersionLabel"));
			appEnv.setEnvStatus(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].EnvStatus"));
			appEnv.setLastEnvStatus(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].LastEnvStatus"));
			appEnv.setStorageBase(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].StorageBase"));
			appEnv.setDataRoot(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].DataRoot"));
			appEnv.setLatestChangeId(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].LatestChangeId"));
			appEnv.setChangeBanner(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].ChangeBanner"));
			appEnv.setCategoryName(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].CategoryName"));
			appEnv.setTotalInstances(_ctx.longValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].TotalInstances"));
			appEnv.setLogBase(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].LogBase"));
			appEnv.setPkgVersionStorageKey(_ctx.stringValue("DescribeAppEnvsResponse.AppEnvs["+ i +"].PkgVersionStorageKey"));

			appEnvs.add(appEnv);
		}
		describeAppEnvsResponse.setAppEnvs(appEnvs);
	 
	 	return describeAppEnvsResponse;
	}
}