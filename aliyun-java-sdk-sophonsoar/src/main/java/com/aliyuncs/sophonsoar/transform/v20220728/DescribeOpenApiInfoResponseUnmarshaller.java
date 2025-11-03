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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeOpenApiInfoResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeOpenApiInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOpenApiInfoResponseUnmarshaller {

	public static DescribeOpenApiInfoResponse unmarshall(DescribeOpenApiInfoResponse describeOpenApiInfoResponse, UnmarshallerContext _ctx) {
		
		describeOpenApiInfoResponse.setRequestId(_ctx.stringValue("DescribeOpenApiInfoResponse.RequestId"));

		Data data = new Data();
		data.setOutputParams(_ctx.stringValue("DescribeOpenApiInfoResponse.Data.OutputParams"));
		data.setInputParams(_ctx.stringValue("DescribeOpenApiInfoResponse.Data.InputParams"));
		data.setResponseDemo(_ctx.stringValue("DescribeOpenApiInfoResponse.Data.ResponseDemo"));
		data.setTitle(_ctx.stringValue("DescribeOpenApiInfoResponse.Data.Title"));
		data.setSummary(_ctx.stringValue("DescribeOpenApiInfoResponse.Data.Summary"));
		data.setDescription(_ctx.stringValue("DescribeOpenApiInfoResponse.Data.Description"));
		describeOpenApiInfoResponse.setData(data);
	 
	 	return describeOpenApiInfoResponse;
	}
}