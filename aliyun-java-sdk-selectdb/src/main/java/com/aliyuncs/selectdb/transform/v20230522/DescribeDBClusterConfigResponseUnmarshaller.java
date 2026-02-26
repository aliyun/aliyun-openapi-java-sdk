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

package com.aliyuncs.selectdb.transform.v20230522;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.selectdb.model.v20230522.DescribeDBClusterConfigResponse;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBClusterConfigResponse.Data;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBClusterConfigResponse.Data.Param;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterConfigResponseUnmarshaller {

	public static DescribeDBClusterConfigResponse unmarshall(DescribeDBClusterConfigResponse describeDBClusterConfigResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterConfigResponse.setRequestId(_ctx.stringValue("DescribeDBClusterConfigResponse.RequestId"));
		describeDBClusterConfigResponse.setDynamicCode(_ctx.stringValue("DescribeDBClusterConfigResponse.DynamicCode"));
		describeDBClusterConfigResponse.setDynamicMessage(_ctx.stringValue("DescribeDBClusterConfigResponse.DynamicMessage"));
		describeDBClusterConfigResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeDBClusterConfigResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setDbInstanceName(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.DbInstanceName"));
		data.setDbInstanceId(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.DbInstanceId"));
		data.setDbClusterId(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.DbClusterId"));
		data.setTaskId(_ctx.integerValue("DescribeDBClusterConfigResponse.Data.TaskId"));

		List<Param> params = new ArrayList<Param>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterConfigResponse.Data.Params.Length"); i++) {
			Param param = new Param();
			param.setName(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.Params["+ i +"].Name"));
			param.setOptional(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.Params["+ i +"].Optional"));
			param.setComment(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.Params["+ i +"].Comment"));
			param.setValue(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.Params["+ i +"].Value"));
			param.setParamCategory(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.Params["+ i +"].ParamCategory"));
			param.setDefaultValue(_ctx.stringValue("DescribeDBClusterConfigResponse.Data.Params["+ i +"].DefaultValue"));
			param.setIsDynamic(_ctx.integerValue("DescribeDBClusterConfigResponse.Data.Params["+ i +"].IsDynamic"));
			param.setIsUserModifiable(_ctx.integerValue("DescribeDBClusterConfigResponse.Data.Params["+ i +"].IsUserModifiable"));

			params.add(param);
		}
		data.setParams(params);
		describeDBClusterConfigResponse.setData(data);
	 
	 	return describeDBClusterConfigResponse;
	}
}