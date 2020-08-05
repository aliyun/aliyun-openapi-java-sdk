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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeConfigMapResponse;
import com.aliyuncs.sae.model.v20190506.DescribeConfigMapResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeConfigMapResponse.Data.RelateApp;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigMapResponseUnmarshaller {

	public static DescribeConfigMapResponse unmarshall(DescribeConfigMapResponse describeConfigMapResponse, UnmarshallerContext _ctx) {
		
		describeConfigMapResponse.setRequestId(_ctx.stringValue("DescribeConfigMapResponse.RequestId"));
		describeConfigMapResponse.setCode(_ctx.stringValue("DescribeConfigMapResponse.Code"));
		describeConfigMapResponse.setMessage(_ctx.stringValue("DescribeConfigMapResponse.Message"));
		describeConfigMapResponse.setErrorCode(_ctx.stringValue("DescribeConfigMapResponse.ErrorCode"));
		describeConfigMapResponse.setTraceId(_ctx.stringValue("DescribeConfigMapResponse.TraceId"));
		describeConfigMapResponse.setSuccess(_ctx.booleanValue("DescribeConfigMapResponse.Success"));

		Data data = new Data();
		data.setConfigMapId(_ctx.longValue("DescribeConfigMapResponse.Data.ConfigMapId"));
		data.setName(_ctx.stringValue("DescribeConfigMapResponse.Data.Name"));
		data.setNamespaceId(_ctx.stringValue("DescribeConfigMapResponse.Data.NamespaceId"));
		data.setDescription(_ctx.stringValue("DescribeConfigMapResponse.Data.Description"));
		data.setData(_ctx.mapValue("DescribeConfigMapResponse.Data.Data"));
		data.setCreateTime(_ctx.longValue("DescribeConfigMapResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.longValue("DescribeConfigMapResponse.Data.UpdateTime"));

		List<RelateApp> relateApps = new ArrayList<RelateApp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigMapResponse.Data.RelateApps.Length"); i++) {
			RelateApp relateApp = new RelateApp();
			relateApp.setAppId(_ctx.stringValue("DescribeConfigMapResponse.Data.RelateApps["+ i +"].AppId"));
			relateApp.setAppName(_ctx.stringValue("DescribeConfigMapResponse.Data.RelateApps["+ i +"].AppName"));

			relateApps.add(relateApp);
		}
		data.setRelateApps(relateApps);
		describeConfigMapResponse.setData(data);
	 
	 	return describeConfigMapResponse;
	}
}