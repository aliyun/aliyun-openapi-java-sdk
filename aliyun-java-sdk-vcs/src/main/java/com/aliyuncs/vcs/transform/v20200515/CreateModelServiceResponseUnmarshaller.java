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

import com.aliyuncs.vcs.model.v20200515.CreateModelServiceResponse;
import com.aliyuncs.vcs.model.v20200515.CreateModelServiceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.CreateModelServiceResponse.Data.ModelApi;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateModelServiceResponseUnmarshaller {

	public static CreateModelServiceResponse unmarshall(CreateModelServiceResponse createModelServiceResponse, UnmarshallerContext _ctx) {
		
		createModelServiceResponse.setRequestId(_ctx.stringValue("CreateModelServiceResponse.RequestId"));
		createModelServiceResponse.setCode(_ctx.stringValue("CreateModelServiceResponse.Code"));
		createModelServiceResponse.setMessage(_ctx.stringValue("CreateModelServiceResponse.Message"));

		Data data = new Data();
		data.setModelServiceInstanceId(_ctx.stringValue("CreateModelServiceResponse.Data.ModelServiceInstanceId"));
		data.setModelServiceStatus(_ctx.stringValue("CreateModelServiceResponse.Data.ModelServiceStatus"));
		data.setQpsRequired(_ctx.integerValue("CreateModelServiceResponse.Data.QpsRequired"));
		data.setAppCode(_ctx.stringValue("CreateModelServiceResponse.Data.AppCode"));

		List<ModelApi> modelApiList = new ArrayList<ModelApi>();
		for (int i = 0; i < _ctx.lengthValue("CreateModelServiceResponse.Data.ModelApiList.Length"); i++) {
			ModelApi modelApi = new ModelApi();
			modelApi.setAlgorithmApiCode(_ctx.stringValue("CreateModelServiceResponse.Data.ModelApiList["+ i +"].AlgorithmApiCode"));
			modelApi.setApiId(_ctx.stringValue("CreateModelServiceResponse.Data.ModelApiList["+ i +"].ApiId"));
			modelApi.setApiName(_ctx.stringValue("CreateModelServiceResponse.Data.ModelApiList["+ i +"].ApiName"));
			modelApi.setApiPath(_ctx.stringValue("CreateModelServiceResponse.Data.ModelApiList["+ i +"].ApiPath"));
			modelApi.setCreateTime(_ctx.stringValue("CreateModelServiceResponse.Data.ModelApiList["+ i +"].CreateTime"));

			modelApiList.add(modelApi);
		}
		data.setModelApiList(modelApiList);
		createModelServiceResponse.setData(data);
	 
	 	return createModelServiceResponse;
	}
}