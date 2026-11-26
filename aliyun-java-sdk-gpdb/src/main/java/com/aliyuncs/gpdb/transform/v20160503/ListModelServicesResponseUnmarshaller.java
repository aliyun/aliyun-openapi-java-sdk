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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListModelServicesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListModelServicesResponse.ModelServiceInfos;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModelServicesResponseUnmarshaller {

	public static ListModelServicesResponse unmarshall(ListModelServicesResponse listModelServicesResponse, UnmarshallerContext _ctx) {
		
		listModelServicesResponse.setRequestId(_ctx.stringValue("ListModelServicesResponse.RequestId"));
		listModelServicesResponse.setTotalRecordCount(_ctx.integerValue("ListModelServicesResponse.TotalRecordCount"));
		listModelServicesResponse.setPageRecordCount(_ctx.integerValue("ListModelServicesResponse.PageRecordCount"));
		listModelServicesResponse.setPageNumber(_ctx.integerValue("ListModelServicesResponse.PageNumber"));

		List<ModelServiceInfos> modelServices = new ArrayList<ModelServiceInfos>();
		for (int i = 0; i < _ctx.lengthValue("ListModelServicesResponse.ModelServices.Length"); i++) {
			ModelServiceInfos modelServiceInfos = new ModelServiceInfos();
			modelServiceInfos.setStatus(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].Status"));
			modelServiceInfos.setDescription(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].Description"));
			modelServiceInfos.setModelName(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].ModelName"));
			modelServiceInfos.setApiKey(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].ApiKey"));
			modelServiceInfos.setSecurityIPList(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].SecurityIPList"));
			modelServiceInfos.setPublicConnUrl(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].PublicConnUrl"));
			modelServiceInfos.setCreateTime(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].CreateTime"));
			modelServiceInfos.setModelServiceId(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].ModelServiceId"));
			modelServiceInfos.setPrivateConnUrl(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].PrivateConnUrl"));
			modelServiceInfos.setModelParams(_ctx.mapValue("ListModelServicesResponse.ModelServices["+ i +"].ModelParams"));

			List<String> aiNodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListModelServicesResponse.ModelServices["+ i +"].AiNodes.Length"); j++) {
				aiNodes.add(_ctx.stringValue("ListModelServicesResponse.ModelServices["+ i +"].AiNodes["+ j +"]"));
			}
			modelServiceInfos.setAiNodes(aiNodes);

			modelServices.add(modelServiceInfos);
		}
		listModelServicesResponse.setModelServices(modelServices);
	 
	 	return listModelServicesResponse;
	}
}