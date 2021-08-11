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

import com.aliyuncs.vcs.model.v20200515.DescribeModelServiceListResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeModelServiceListResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeModelServiceListResponse.Data.ModelService;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModelServiceListResponseUnmarshaller {

	public static DescribeModelServiceListResponse unmarshall(DescribeModelServiceListResponse describeModelServiceListResponse, UnmarshallerContext _ctx) {
		
		describeModelServiceListResponse.setRequestId(_ctx.stringValue("DescribeModelServiceListResponse.RequestId"));
		describeModelServiceListResponse.setCode(_ctx.stringValue("DescribeModelServiceListResponse.Code"));
		describeModelServiceListResponse.setMessage(_ctx.stringValue("DescribeModelServiceListResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.stringValue("DescribeModelServiceListResponse.Data.Total"));

		List<ModelService> modelList = new ArrayList<ModelService>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModelServiceListResponse.Data.ModelList.Length"); i++) {
			ModelService modelService = new ModelService();
			modelService.setModelServiceInstanceId(_ctx.stringValue("DescribeModelServiceListResponse.Data.ModelList["+ i +"].ModelServiceInstanceId"));
			modelService.setModelServiceStatus(_ctx.stringValue("DescribeModelServiceListResponse.Data.ModelList["+ i +"].ModelServiceStatus"));
			modelService.setModelServiceName(_ctx.stringValue("DescribeModelServiceListResponse.Data.ModelList["+ i +"].ModelServiceName"));
			modelService.setAlgorithmCode(_ctx.stringValue("DescribeModelServiceListResponse.Data.ModelList["+ i +"].AlgorithmCode"));
			modelService.setQpsRequired(_ctx.integerValue("DescribeModelServiceListResponse.Data.ModelList["+ i +"].QpsRequired"));
			modelService.setCreateTime(_ctx.stringValue("DescribeModelServiceListResponse.Data.ModelList["+ i +"].CreateTime"));
			modelService.setAppCode(_ctx.stringValue("DescribeModelServiceListResponse.Data.ModelList["+ i +"].AppCode"));

			modelList.add(modelService);
		}
		data.setModelList(modelList);
		describeModelServiceListResponse.setData(data);
	 
	 	return describeModelServiceListResponse;
	}
}