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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListPipelineTemplatesResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListPipelineTemplatesResponse.Data;
import com.aliyuncs.devops_rdc.model.v20200303.ListPipelineTemplatesResponse.Data.模板列表;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelineTemplatesResponseUnmarshaller {

	public static ListPipelineTemplatesResponse unmarshall(ListPipelineTemplatesResponse listPipelineTemplatesResponse, UnmarshallerContext _ctx) {
		
		listPipelineTemplatesResponse.setRequestId(_ctx.stringValue("ListPipelineTemplatesResponse.RequestId"));

		Data data = new Data();
		data.setTotal(_ctx.floatValue("ListPipelineTemplatesResponse.Data.Total"));

		List<模板列表> dataList = new ArrayList<模板列表>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelineTemplatesResponse.Data.DataList.Length"); i++) {
			模板列表 模板列表 = new 模板列表();
			模板列表.setTemplateName(_ctx.stringValue("ListPipelineTemplatesResponse.Data.DataList["+ i +"].TemplateName"));
			模板列表.setId(_ctx.longValue("ListPipelineTemplatesResponse.Data.DataList["+ i +"].Id"));

			dataList.add(模板列表);
		}
		data.setDataList(dataList);
		listPipelineTemplatesResponse.setData(data);
	 
	 	return listPipelineTemplatesResponse;
	}
}