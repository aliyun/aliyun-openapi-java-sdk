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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListRankingModelTemplatesResponse;
import com.aliyuncs.airec.model.v20201126.ListRankingModelTemplatesResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListRankingModelTemplatesResponse.ResultItem.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRankingModelTemplatesResponseUnmarshaller {

	public static ListRankingModelTemplatesResponse unmarshall(ListRankingModelTemplatesResponse listRankingModelTemplatesResponse, UnmarshallerContext _ctx) {
		
		listRankingModelTemplatesResponse.setRequestId(_ctx.stringValue("ListRankingModelTemplatesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRankingModelTemplatesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setStatus(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Status"));
			resultItem.setVersionNum(_ctx.longValue("ListRankingModelTemplatesResponse.result["+ i +"].VersionNum"));
			resultItem.setTemplateId(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].TemplateId"));

			Meta meta = new Meta();
			meta.setAuthorized(_ctx.booleanValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.Authorized"));
			meta.setAutoRun(_ctx.booleanValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.AutoRun"));
			meta.setAutoRunTime(_ctx.longValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.AutoRunTime"));
			meta.setAutoRunType(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.AutoRunType"));
			meta.setConf(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.Conf"));
			meta.setLastEditTime(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.LastEditTime"));
			meta.setOssArn(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.OssArn"));
			meta.setOssBucket(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.OssBucket"));
			meta.setOssEndpoint(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.OssEndpoint"));
			meta.setSampleId(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.SampleId"));
			meta.setSampleName(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.SampleName"));
			meta.setSampleTimeWindow(_ctx.longValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.SampleTimeWindow"));
			meta.setSampleTimeWindowType(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.SampleTimeWindowType"));
			meta.setType(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.Type"));
			meta.setName(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.Name"));
			meta.setDeployStatus(_ctx.stringValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.DeployStatus"));
			meta.setCanDeploy(_ctx.booleanValue("ListRankingModelTemplatesResponse.result["+ i +"].Meta.CanDeploy"));
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		listRankingModelTemplatesResponse.setResult(result);
	 
	 	return listRankingModelTemplatesResponse;
	}
}