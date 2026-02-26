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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryUserExperimentResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryUserExperimentResponse.ExperimentInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageableQueryUserExperimentResponseUnmarshaller {

	public static PageableQueryUserExperimentResponse unmarshall(PageableQueryUserExperimentResponse pageableQueryUserExperimentResponse, UnmarshallerContext _ctx) {
		
		pageableQueryUserExperimentResponse.setRequestId(_ctx.stringValue("PageableQueryUserExperimentResponse.RequestId"));
		pageableQueryUserExperimentResponse.setPages(_ctx.integerValue("PageableQueryUserExperimentResponse.Pages"));
		pageableQueryUserExperimentResponse.setMessage(_ctx.stringValue("PageableQueryUserExperimentResponse.Message"));
		pageableQueryUserExperimentResponse.setPageSize(_ctx.integerValue("PageableQueryUserExperimentResponse.PageSize"));
		pageableQueryUserExperimentResponse.setCurrentPage(_ctx.integerValue("PageableQueryUserExperimentResponse.CurrentPage"));
		pageableQueryUserExperimentResponse.setTotal(_ctx.integerValue("PageableQueryUserExperimentResponse.Total"));
		pageableQueryUserExperimentResponse.setHttpStatusCode(_ctx.integerValue("PageableQueryUserExperimentResponse.HttpStatusCode"));
		pageableQueryUserExperimentResponse.setCode(_ctx.stringValue("PageableQueryUserExperimentResponse.Code"));
		pageableQueryUserExperimentResponse.setSuccess(_ctx.booleanValue("PageableQueryUserExperimentResponse.Success"));

		List<ExperimentInfo> experimentList = new ArrayList<ExperimentInfo>();
		for (int i = 0; i < _ctx.lengthValue("PageableQueryUserExperimentResponse.ExperimentList.Length"); i++) {
			ExperimentInfo experimentInfo = new ExperimentInfo();
			experimentInfo.setPermission(_ctx.integerValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].Permission"));
			experimentInfo.setResult(_ctx.stringValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].Result"));
			experimentInfo.setState(_ctx.stringValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].State"));
			experimentInfo.setCreateTime(_ctx.longValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].CreateTime"));
			experimentInfo.setExperimentId(_ctx.stringValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].ExperimentId"));
			experimentInfo.setName(_ctx.stringValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].Name"));
			experimentInfo.setCreator(_ctx.stringValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].Creator"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].Tags["+ j +"]"));
			}
			experimentInfo.setTags(tags);

			List<String> miniApps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].MiniApps.Length"); j++) {
				miniApps.add(_ctx.stringValue("PageableQueryUserExperimentResponse.ExperimentList["+ i +"].MiniApps["+ j +"]"));
			}
			experimentInfo.setMiniApps(miniApps);

			experimentList.add(experimentInfo);
		}
		pageableQueryUserExperimentResponse.setExperimentList(experimentList);
	 
	 	return pageableQueryUserExperimentResponse;
	}
}