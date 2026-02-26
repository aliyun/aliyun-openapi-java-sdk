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

import com.aliyuncs.sae.model.v20190506.DescribeSecretResponse;
import com.aliyuncs.sae.model.v20190506.DescribeSecretResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeSecretResponse.Data.RelateApp;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecretResponseUnmarshaller {

	public static DescribeSecretResponse unmarshall(DescribeSecretResponse describeSecretResponse, UnmarshallerContext _ctx) {
		
		describeSecretResponse.setRequestId(_ctx.stringValue("DescribeSecretResponse.RequestId"));
		describeSecretResponse.setMessage(_ctx.stringValue("DescribeSecretResponse.Message"));
		describeSecretResponse.setTraceId(_ctx.stringValue("DescribeSecretResponse.TraceId"));
		describeSecretResponse.setErrorCode(_ctx.stringValue("DescribeSecretResponse.ErrorCode"));
		describeSecretResponse.setCode(_ctx.stringValue("DescribeSecretResponse.Code"));
		describeSecretResponse.setSuccess(_ctx.booleanValue("DescribeSecretResponse.Success"));

		Data data = new Data();
		data.setNamespaceId(_ctx.stringValue("DescribeSecretResponse.Data.NamespaceId"));
		data.setSecretId(_ctx.longValue("DescribeSecretResponse.Data.SecretId"));
		data.setSecretName(_ctx.stringValue("DescribeSecretResponse.Data.SecretName"));
		data.setSecretType(_ctx.stringValue("DescribeSecretResponse.Data.SecretType"));
		data.setSecretData(_ctx.mapValue("DescribeSecretResponse.Data.SecretData"));
		data.setCreateTime(_ctx.longValue("DescribeSecretResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.longValue("DescribeSecretResponse.Data.UpdateTime"));

		List<RelateApp> relateApps = new ArrayList<RelateApp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecretResponse.Data.RelateApps.Length"); i++) {
			RelateApp relateApp = new RelateApp();
			relateApp.setAppId(_ctx.stringValue("DescribeSecretResponse.Data.RelateApps["+ i +"].AppId"));
			relateApp.setAppName(_ctx.stringValue("DescribeSecretResponse.Data.RelateApps["+ i +"].AppName"));

			relateApps.add(relateApp);
		}
		data.setRelateApps(relateApps);
		describeSecretResponse.setData(data);
	 
	 	return describeSecretResponse;
	}
}