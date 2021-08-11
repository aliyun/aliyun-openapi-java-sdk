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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeModelServiceResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeModelServiceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeModelServiceResponse.Data.ModelApi;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModelServiceResponseUnmarshaller {

	public static DescribeModelServiceResponse unmarshall(DescribeModelServiceResponse describeModelServiceResponse, UnmarshallerContext _ctx) {
		
		describeModelServiceResponse.setRequestId(_ctx.stringValue("DescribeModelServiceResponse.RequestId"));
		describeModelServiceResponse.setCode(_ctx.stringValue("DescribeModelServiceResponse.Code"));
		describeModelServiceResponse.setMessage(_ctx.stringValue("DescribeModelServiceResponse.Message"));

		Data data = new Data();
		data.setModelServiceInstanceId(_ctx.stringValue("DescribeModelServiceResponse.Data.ModelServiceInstanceId"));
		data.setModelServiceStatus(_ctx.stringValue("DescribeModelServiceResponse.Data.ModelServiceStatus"));
		data.setModelServiceInstanceName(_ctx.stringValue("DescribeModelServiceResponse.Data.ModelServiceInstanceName"));
		data.setAlgorithmCode(_ctx.stringValue("DescribeModelServiceResponse.Data.AlgorithmCode"));
		data.setQps(_ctx.longValue("DescribeModelServiceResponse.Data.Qps"));
		data.setCreateTime(_ctx.stringValue("DescribeModelServiceResponse.Data.CreateTime"));
		data.setAppCode(_ctx.stringValue("DescribeModelServiceResponse.Data.AppCode"));

		List<ModelApi> modelApiList = new ArrayList<ModelApi>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModelServiceResponse.Data.ModelApiList.Length"); i++) {
			ModelApi modelApi = new ModelApi();
			modelApi.setAlgorithmApiCode(_ctx.stringValue("DescribeModelServiceResponse.Data.ModelApiList["+ i +"].AlgorithmApiCode"));
			modelApi.setApiId(_ctx.stringValue("DescribeModelServiceResponse.Data.ModelApiList["+ i +"].ApiId"));
			modelApi.setApiName(_ctx.stringValue("DescribeModelServiceResponse.Data.ModelApiList["+ i +"].ApiName"));
			modelApi.setApiPath(_ctx.stringValue("DescribeModelServiceResponse.Data.ModelApiList["+ i +"].ApiPath"));
			modelApi.setCreateTime(_ctx.stringValue("DescribeModelServiceResponse.Data.ModelApiList["+ i +"].CreateTime"));

			modelApiList.add(modelApi);
		}
		data.setModelApiList(modelApiList);
		describeModelServiceResponse.setData(data);
	 
	 	return describeModelServiceResponse;
	}
}