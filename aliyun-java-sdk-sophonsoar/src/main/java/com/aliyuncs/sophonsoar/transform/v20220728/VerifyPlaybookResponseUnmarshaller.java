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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.VerifyPlaybookResponse;
import com.aliyuncs.sophonsoar.model.v20220728.VerifyPlaybookResponse.CheckTaskInfosItem;
import com.aliyuncs.sophonsoar.model.v20220728.VerifyPlaybookResponse.PrerequisitesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyPlaybookResponseUnmarshaller {

	public static VerifyPlaybookResponse unmarshall(VerifyPlaybookResponse verifyPlaybookResponse, UnmarshallerContext _ctx) {
		
		verifyPlaybookResponse.setRequestId(_ctx.stringValue("VerifyPlaybookResponse.RequestId"));

		List<CheckTaskInfosItem> checkTaskInfos = new ArrayList<CheckTaskInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("VerifyPlaybookResponse.CheckTaskInfos.Length"); i++) {
			CheckTaskInfosItem checkTaskInfosItem = new CheckTaskInfosItem();
			checkTaskInfosItem.setRiskLevel(_ctx.stringValue("VerifyPlaybookResponse.CheckTaskInfos["+ i +"].RiskLevel"));
			checkTaskInfosItem.setNodeName(_ctx.stringValue("VerifyPlaybookResponse.CheckTaskInfos["+ i +"].NodeName"));
			checkTaskInfosItem.setDetail(_ctx.stringValue("VerifyPlaybookResponse.CheckTaskInfos["+ i +"].Detail"));

			checkTaskInfos.add(checkTaskInfosItem);
		}
		verifyPlaybookResponse.setCheckTaskInfos(checkTaskInfos);

		List<PrerequisitesItem> prerequisites = new ArrayList<PrerequisitesItem>();
		for (int i = 0; i < _ctx.lengthValue("VerifyPlaybookResponse.Prerequisites.Length"); i++) {
			PrerequisitesItem prerequisitesItem = new PrerequisitesItem();
			prerequisitesItem.setPrerequisiteType(_ctx.stringValue("VerifyPlaybookResponse.Prerequisites["+ i +"].PrerequisiteType"));
			prerequisitesItem.setPrerequisiteValue(_ctx.stringValue("VerifyPlaybookResponse.Prerequisites["+ i +"].PrerequisiteValue"));

			prerequisites.add(prerequisitesItem);
		}
		verifyPlaybookResponse.setPrerequisites(prerequisites);
	 
	 	return verifyPlaybookResponse;
	}
}