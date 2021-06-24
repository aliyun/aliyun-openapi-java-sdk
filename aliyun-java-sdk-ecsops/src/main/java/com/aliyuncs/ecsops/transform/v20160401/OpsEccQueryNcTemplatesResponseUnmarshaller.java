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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcTemplatesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcTemplatesResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcTemplatesResponse.Data.TemplateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEccQueryNcTemplatesResponseUnmarshaller {

	public static OpsEccQueryNcTemplatesResponse unmarshall(OpsEccQueryNcTemplatesResponse opsEccQueryNcTemplatesResponse, UnmarshallerContext _ctx) {
		
		opsEccQueryNcTemplatesResponse.setRequestId(_ctx.stringValue("OpsEccQueryNcTemplatesResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("OpsEccQueryNcTemplatesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("OpsEccQueryNcTemplatesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("OpsEccQueryNcTemplatesResponse.Data.TotalCount"));

		List<TemplateInfo> templateInfos = new ArrayList<TemplateInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsEccQueryNcTemplatesResponse.Data.TemplateInfos.Length"); i++) {
			TemplateInfo templateInfo = new TemplateInfo();
			templateInfo.setTemplateDesc(_ctx.stringValue("OpsEccQueryNcTemplatesResponse.Data.TemplateInfos["+ i +"].TemplateDesc"));
			templateInfo.setGmtCreate(_ctx.longValue("OpsEccQueryNcTemplatesResponse.Data.TemplateInfos["+ i +"].GmtCreate"));
			templateInfo.setGmtModified(_ctx.longValue("OpsEccQueryNcTemplatesResponse.Data.TemplateInfos["+ i +"].GmtModified"));
			templateInfo.setTemplateName(_ctx.stringValue("OpsEccQueryNcTemplatesResponse.Data.TemplateInfos["+ i +"].TemplateName"));
			templateInfo.setAdjustStandModels(_ctx.stringValue("OpsEccQueryNcTemplatesResponse.Data.TemplateInfos["+ i +"].AdjustStandModels"));

			templateInfos.add(templateInfo);
		}
		data.setTemplateInfos(templateInfos);
		opsEccQueryNcTemplatesResponse.setData(data);
	 
	 	return opsEccQueryNcTemplatesResponse;
	}
}